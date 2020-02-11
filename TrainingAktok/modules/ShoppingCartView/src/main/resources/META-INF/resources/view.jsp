<%@ include file="/init.jsp"%>


<div class="container">
	<button type="button" data-toggle="modal" data-target="#modalLihatKeranjang" class="btn btn-warning">Lihat Keranjang</button>
	<br>
	<br>
	<table class="table table-striped" id="tableProduk">
		<tr>
			<td>No</td>
			<td>Nama</td>
			<td>Harga</td>
			<td align="center">Action</td>
		</tr>
	</table>
</div>

<div class="modal fade" id="modalPilihProduk" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalCenterTitle">Pilih Produk</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <form id="formKeranjang">
        	<input type="hidden" id="produkId" name="<portlet:namespace/>idProduk">
			<div class="form-group">
				<label>Nama Produk</label> 
				<input type="text" class="form-control" id="inputNamaProduk" readonly>
			</div>
			<div class="form-group">
				<label>Jumlah Produk</label>
				<table class="table table-borderless">
					<tr align="center">
						<td><button type="button" onclick="kurangJumlahProduk()" class="btn btn-secondary">-</button></td>
						<td><input type="text" class="form-control" id="jumlahProduk" name="<portlet:namespace/>jumlahProduk" readonly/></td>
						<td><button type="button" onclick="tambahJumlahProduk()" class="btn btn-secondary">+</button></td>
					</tr>
				</table>
			</div>
			<div class="form-group">
			<label>Harga</label> 
				<input type="text" class="form-control" id="inputHargaProduk" name="<portlet:namespace/>subTotal" readonly>
			</div>
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary" onclick="tambahKeranjang()">Tambahkan ke Keranjang</button>
      </div>
    </div>
  </div>
</div>

<div class="modal fade" id="modalLihatKeranjang" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalCenterTitle">Lihat Keranjang</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <table class="table table-striped" id="tableKeranjang">
			<tr align="center">
				<td>No</td>
				<td>Nama</td>
				<td>Jumlah Produk</td>
				<td>Harga</td>
				<td >Action</td>
			</tr>
			<tr align="center">
				<td>1</td>
				<td>Semen</td>
				<td>3</td>
				<td>2000</td>
				<td >
					<button type="button" 
							class="btn btn-danger"
							onclick="deleteProduk()">
							Hapus
					</button>
				</td>
			</tr>
		</table>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Checkout</button>
      </div>
    </div>
  </div>
</div>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

<portlet:actionURL name="addCart" var="addCartURL" />
<portlet:actionURL name="deleteCartById" var="deleteCartByIdURL"/>
<portlet:resourceURL var="resourceURL"/>

<script>
	function getAllProduk(){
		console.log("masuk get all");
		AUI().use('aui-ui-request', function(A){
			A.io.request('<%= resourceURL.toString() %>',{
				method: 'post',
				dataType: 'json',
				on:{
					success:function(){
						console.log(this.get('responseData').listProduk);
						var data = `
							<tr>
								<td>No</td>
								<td>Nama</td>
								<td>Harga</td>
								<td align="center">Action</td>
							</tr>
					  	`;
						
						var i;
						for (i = 0; i < this.get('responseData').listProduk.length; i++) {
							
							data += `
								<tr>
									<td>`+(i+1)+`</td>
									<td>`+this.get('responseData').listProduk[i].JSONObject.namaProduk+`</td>
									<td>`+this.get('responseData').listProduk[i].JSONObject.hargaProduk+`</td>
									<td align="center"><button type="button" class="btn btn-success"
										data-toggle="modal" data-target="#modalPilihProduk" onclick="pilihProduk(`+i+`,'`+this.get('responseData').listProduk[i].JSONObject.idProduk+`',`+this.get('responseData').listProduk[i].JSONObject.kelipatanProduk+`)">Pilih</button></td>
								</tr>
							`;
						}
						document.getElementById('tableProduk').innerHTML = data;
					}
				}
			})
		})
	}
	
	function getAllCart(){
		console.log("masuk get cart");
		AUI().use('aui-ui-request', function(A){
			A.io.request('<%= resourceURL.toString() %>',{
				method: 'post',
				dataType: 'json',
				on:{
					success:function(){
						console.log(this.get('responseData').listCart);
						var data = `
							<tr align="center">
								<td>No</td>
								<td>Nama</td>
								<td>Jumlah Produk</td>
								<td>Harga</td>
								<td >Action</td>
							</tr>
					  	`;
						
						var i;
						for (i = 0; i < this.get('responseData').listCart.length; i++) {
							
							data += `
								<tr>
									<td>`+(i+1)+`</td>
									<td>`+this.get('responseData').listCart[i].JSONObject.namaProduk+`</td>
									<td>`+this.get('responseData').listCart[i].JSONObject.jumlahProduk+`</td>
									<td>`+this.get('responseData').listCart[i].JSONObject.subTotal+`</td>
									<td >
										<button type="button" 
												class="btn btn-danger"
												onclick="deleteCart('`+this.get('responseData').listCart[i].JSONObject.idCart+`')">
												Hapus
										</button>
									</td>
								</tr>
							`;
						}
						document.getElementById('tableKeranjang').innerHTML = data;
					}
				}
			})
		})
	}
	
	function deleteCart(id_cart) {
		AUI().use('aui-ui-request', function(A){
			A.io.request('<%= deleteCartByIdURL.toString() %>',{
				method: 'post',
				dataType: 'json',
				data:{
					<portlet:namespace/>idCart: id_cart
				},
				on:{
					success:function(){
						getAllCart();
					}
				}
			})
		})
	}
	
	function tambahKeranjang() {
		AUI().use('aui-ui-request', function(A) {
			A.io.request('<%= addCartURL.toString() %>', {
				method: 'post',
				dataType: 'json',
				form: {
					id : "formKeranjang"
				},
				on:{
					success:function(){
						console.log("sukses");
						getAllCart();
					}
				}
			})
		})
	}
	
	$(document).ready(function(){
		getAllProduk();
		getAllCart();
	})
	
	function pilihProduk(getNumberProduk, getIdProduk, getKelipatanProduk) {
		var tabel = document.getElementById('tableProduk');
		var tr = tabel.getElementsByTagName('tr')[getNumberProduk+1];
		var tdName = tr.getElementsByTagName('td')[1].innerText;
		var tdHarga = tr.getElementsByTagName('td')[2].innerText;
		
		document.getElementById('produkId').value = getIdProduk;
		document.getElementById('inputNamaProduk').value = tdName;
		document.getElementById('inputHargaProduk').value = tdHarga * getKelipatanProduk;
		document.getElementById('jumlahProduk').value = getKelipatanProduk;
		jp = getKelipatanProduk;
		jpAwal = getKelipatanProduk;
		harga = tdHarga;
	}
	
	var jp = 0;
	var jpAwal = 0;
	var harga = 0;
	
	function kurangJumlahProduk() {
		if (jp <= jpAwal) {
			jp = jpAwal;
		} else {
			jp -= jpAwal;
		}
		document.getElementById('jumlahProduk').value = jp;
		document.getElementById('inputHargaProduk').value = harga * jp;
	}
	
	function tambahJumlahProduk() {
		jp += jpAwal;
		document.getElementById('jumlahProduk').value = jp;
		document.getElementById('inputHargaProduk').value = harga * jp;
	}
</script>