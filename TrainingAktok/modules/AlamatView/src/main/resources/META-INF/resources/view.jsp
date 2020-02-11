<%@ include file="/init.jsp" %>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<h3>Menu Alamat</h3>
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modalTambah">Tambah
	Alamat</button>
<div>
	<br>
	<table id="listAlamat" class="table table-hover">

	</table>
</div>

<!-- Modal Tambah -->
<div class="modal fade" id="modalTambah" tabindex="-1" role="dialog"
	aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="exampleModalLabel">Tambah Alamat</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body">

				<form id="formAlamatTambah">
					<div class="form-group">
						<label>Nama Alamat</label> <input type="hidden" id="idToko"
							class="form-control" name="<portlet:namespace/>idToko" /> <input
							type="text" id="namaAlamat" class="form-control"
							name="<portlet:namespace/>namaAlamat" required />
					</div>
					<div class="form-group">
						<label>Nama Penerima</label> <input type="text" id="namaPenerima"
							class="form-control" name="<portlet:namespace/>namaPenerima"
							required />
					</div>
					<div class="form-group">
						<label>Nomor Handphone</label> <input type="number"
							id="nomorHandphone" class="form-control"
							name="<portlet:namespace/>nomorHandphone" required />
					</div>
					<div class="form-group">
						<label>Alamat Lengkap</label> <input type="text"
							id="alamatLengkap" class="form-control"
							name="<portlet:namespace/>alamatLengkap" required />
					</div>
					<div class="form-group">
						<label>Kode Pos</label> <input type="number" id="kodePos"
							class="form-control" name="<portlet:namespace/>kodePos" required />
					</div>
					<div class="form-group">
						<label for="kota">Kota</label> <select id="kota"
							class="form-control" name="<portlet:namespace/>kota">
							<option selected>Choose...</option>
							<option value="Jakarta Barat">Jakarta Barat</option>
							<option value="Jakarta Timur">Jakarta Timur</option>
							<option value="Bandung">Bandung</option>
							<option value="Malang">Malang</option>
						</select>
					</div>
					<div class="form-group">
						<label for="provinsi">Provinsi</label> <select id="provinsi"
							class="form-control" name="<portlet:namespace/>provinsi">
							<option selected>Choose...</option>
							<option value="DKI Jakarta">DKI Jakarta</option>
							<option value="Jawa Barat">Jawa Barat</option>
							<option value="Jawa Timur">Jawa Timur</option>
						</select>
					</div>
					<div class="form-group">
						<label for="region">Region</label> <select id="region"
							class="form-control" name="<portlet:namespace/>region">
							<option selected>Choose...</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
						</select>
					</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-secondary" data-dismiss="modal">Batal
				</button>
				<button type="button" id="tambahAlamat" class="btn btn-primary">Tambah</button>
				</form>
			</div>
		</div>
	</div>
</div>

<!-- End Modal Tambah -->

<!-- Modal Ubah -->
<div class="modal fade" id="modalUbah" tabindex="-1" role="dialog"
	aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="exampleModalLabel">Ubah Alamat</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body">

				<form id="formAlamatUbah">
					<div class="form-group">
						<label>Nama Alamat</label> <input type="hidden" id="idTokoUbah"
							class="form-control" name="<portlet:namespace/>idTokoUbah" /> <input
							type="text" id="namaAlamatUbah" class="form-control"
							name="<portlet:namespace/>namaAlamatUbah" required />
					</div>
					<div class="form-group">
						<label>Nama Penerima</label> <input type="text" id="namaPenerimaUbah"
							class="form-control" name="<portlet:namespace/>namaPenerimaUbah"
							required />
					</div>
					<div class="form-group">
						<label>Nomor Handphone</label> <input type="number"
							id="nomorHandphoneUbah" class="form-control"
							name="<portlet:namespace/>nomorHandphoneUbah" required />
					</div>
					<div class="form-group">
						<label>Alamat Lengkap</label> <input type="text"
							id="alamatLengkapUbah" class="form-control"
							name="<portlet:namespace/>alamatLengkapUbah" required />
					</div>
					<div class="form-group">
						<label>Kode Pos</label> <input type="number" id="kodePosUbah"
							class="form-control" name="<portlet:namespace/>kodePosUbah" required />
					</div>
					<div class="form-group">
						<label for="kota">Kota</label> <select id="kotaUbah"
							class="form-control" name="<portlet:namespace/>kotaUbah">
							<option selected>Choose...</option>
							<option value="Jakarta Barat">Jakarta Barat</option>
							<option value="Jakarta Timur">Jakarta Timur</option>
							<option value="Bandung">Bandung</option>
							<option value="Malang">Malang</option>
						</select>
					</div>
					<div class="form-group">
						<label for="provinsi">Provinsi</label> <select id="provinsiUbah"
							class="form-control" name="<portlet:namespace/>provinsiUbah">
							<option selected>Choose...</option>
							<option value="DKI Jakarta">DKI Jakarta</option>
							<option value="Jawa Barat">Jawa Barat</option>
							<option value="Jawa Timur">Jawa Timur</option>
						</select>
					</div>
					<div class="form-group">
						<label for="region">Region</label> <select id="regionUbah"
							class="form-control" name="<portlet:namespace/>regionUbah">
							<option selected>Choose...</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
						</select>
					</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-secondary" data-dismiss="modal">Batal
				</button>
				<button type="button" id="ubahAlamat" class="btn btn-primary">Ubah</button>
				</form>
			</div>
		</div>
	</div>
</div>

<!-- End Modal Ubah -->




<portlet:actionURL name="tambahAlamat" var="tambahAlamatURL" />
<portlet:actionURL name="ubahAlamat" var="ubahAlamatURL" />
<portlet:actionURL name="hapusAlamatBerdasarkanId"
	var="hapusAlamatBerdasarkanIdURL" />
<portlet:resourceURL var="resourceURL" />

<script>

$(document).ready(function(){
	
	getAlamatByIdToko();
	
})

function getAlamatByIdToko() {
	console.log("masuk dapet alamat");
	AUI().use('aui-ui-request', function(A) {
		A.io.request('<%= resourceURL.toString() %>', {
			method: 'post',
			dataType: 'json',
			on:{
				success:function(){
					console.log("hasilSukses");
					var data = `
						<tr align="center">
							<th>No</th>
							<th>Nama Alamat</th>
							<th>Nama Penerima</th>
							<th>Nomor Penerima</th>
							<th>Alamat Lengkap</th>
							<th colspan="2">Action</th>
						</tr>
					`;
					console.log(this.get('responseData').listAlamat);
					var j = 1;
					for(var i = 0; i < this.get('responseData').listAlamat.length; i++) {
						var dataAdd = `
								<tr align="center">
									<td>`+j+`</td>
									<td style="display:none;">`+this.get('responseData').listAlamat[i].JSONObject.id_alamat+`</td>
									<td style="display:none;">`+this.get('responseData').listAlamat[i].JSONObject.user_id+`</td>
									<td style="display:none;">`+this.get('responseData').listAlamat[i].JSONObject.kode_pos+`</td>
									<td style="display:none;">`+this.get('responseData').listAlamat[i].JSONObject.kota+`</td>
									<td style="display:none;">`+this.get('responseData').listAlamat[i].JSONObject.provinsi+`</td>
									<td style="display:none;">`+this.get('responseData').listAlamat[i].JSONObject.region+`</td>
							    	<td>`+this.get('responseData').listAlamat[i].JSONObject.nama_alamat+`</td>
							    	<td>`+this.get('responseData').listAlamat[i].JSONObject.nama_penerima+`</td>
							    	<td>`+this.get('responseData').listAlamat[i].JSONObject.nomor_handphone+`</td>
							    	<td>`+this.get('responseData').listAlamat[i].JSONObject.alamat_lengkap+`</td>
							    	<td><button type="button" class="btn btn-success btnubah" onclick="ubah(`+j+`)" data-toggle="modal" data-target="#modalUbah">Update</button></td>
							    	<td><button type="button" class="btn btn-danger" onclick="gantiStatusBerdasarkanIdAlamat('`+this.get('responseData').listAlamat[i].JSONObject.id_alamat+`')">Delete</button></td>
							    </tr>
						`
						data += dataAdd;
						j++;
					}
					document.getElementById("listAlamat").innerHTML = data;
				}
			}
		})
	})
}

function ubah(nomorAlamat){
	
	$('#modalUbah').modal('show');
	
	console.log('cek dapet nomor alamat kah? ' + nomorAlamat);
	
	var tabelAlamat = document.getElementById('listAlamat');
	var tr = tabelAlamat.getElementsByTagName('tr')[nomorAlamat];
	var idAlamat = tr.getElementsByTagName('td')[1].innerText;
	var idUser = tr.getElementsByTagName('td')[2].innerText;
	var kodePos = tr.getElementsByTagName('td')[3].innerText;
	var kota = tr.getElementsByTagName('td')[4].innerText;
	var provinsi = tr.getElementsByTagName('td')[5].innerText;
	var region = tr.getElementsByTagName('td')[6].innerText;
	var namaAlamat = tr.getElementsByTagName('td')[7].innerText;
	var namaPenerima = tr.getElementsByTagName('td')[8].innerText;
	var nomorHandphone = tr.getElementsByTagName('td')[9].innerText;
	var alamatLengkap = tr.getElementsByTagName('td')[10].innerText;
	
	console.log(idAlamat + idUser + kodePos + kota + provinsi + region + namaAlamat + namaPenerima + nomorHandphone + alamatLengkap);
	
	$('#idAlamatUbah').val(idAlamat);
	$('#namaAlamatUbah').val(namaAlamat);
	$('#namaPenerimaUbah').val(namaPenerima);
	$('#nomorHandphoneUbah').val(nomorHandphone);
	$('#alamatLengkapUbah').val(alamatLengkap);
	$('#kodePosUbah').val(kodePos);
	$('#kotaUbah').val(kota);
	$('#provinsiUbah').val(provinsi);
	$('#regionUbah').val(region);
	
	
	
}

function gantiStatusBerdasarkanIdAlamat(id_alamat){
	AUI().use('aui-ui-request', function(A){
		A.io.request('<%= hapusAlamatBerdasarkanIdURL.toString() %>',{
			method: 'post',
			dataType: 'json',
			data:{
				<portlet:namespace/>idAlamat: id_alamat
			},
			on:{
				success:function(){
					getAlamatByIdToko();
				}
			}
		})
	})
}

var namaAlamat = $('#namaAlamat');

$('#tambahAlamat').on('click', function(){
	
	console.log("namaAlamat = " + namaAlamat.val());
		console.log("masuk");
		AUI().use('aui-ui-request', function(A) {
			A.io.request('<%= tambahAlamatURL.toString() %>', {
				method: 'post',
				dataType: 'json',
				form: {
					id : "formAlamatTambah"
				},
				on:{
					success:function(){
						console.log("sukses bro");
						$('#modalUbah').modal('hide');
						getAlamatByIdToko();
					}
				}
			})
		})
	
})

$('#ubahAlamat').on('click', function(){
	
	console.log('masuk ubah');
	AUI().use('aui-ui-request', function(A) {
		A.io.request('<%= ubahAlamatURL.toString() %>', {
			method: 'post',
			dataType: 'json',
			form: {
				id : "formAlamatUbah"
			},
			on:{
				success:function(){
					$('')
					console.log("sukses bro");
					getAlamatByIdToko();
				}
			}
		})
	})

})


</script>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>