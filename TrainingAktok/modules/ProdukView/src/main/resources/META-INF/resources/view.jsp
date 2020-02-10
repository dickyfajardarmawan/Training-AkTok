<%@ include file="/init.jsp" %>

<div align="right">
	<button type="button" id="buttonTambahProduk" class="mybtn">TAMBAH PRODUK</button>
</div>

<div>
	<div id="formAddProduk" class="modalForm">
		<div class="modal-contentForm">
			<span class="close">&times;</span>
			<h3 align="right">TAMBAH PRODUK</h3>
			<div id="validator"></div>
			<form id="formProduk">
				<div>
					<label>Nama Produk</label><br>
					<input type="text" id="namaProduk" name="<portlet:namespace/>namaProduk"/>
				</div>
				<div>
					<label>Harga Produk</label><br>
					<input type="number" id="hargaProduk" name="<portlet:namespace/>hargaProduk"/>
				</div>
				<div>
					<label>Kelipatan Produk</label><br>
					<input type="number" id="kelipatanProduk" name="<portlet:namespace/>kelipatanProduk"/>
				</div>
				<br>
				<button type="button" id="tambahProduk" class="mybtn">Submit</button>
			</form>
		</div>
	</div>
</div>

<div>
	<br>
	<table id="tableProduk">
	</table>
</div>

<portlet:actionURL name="addProduk" var="addProdukURL" />
<portlet:actionURL name="deleteById" var="deleteByIdURL" />
<portlet:resourceURL var="getAllProdukURL"/>

<script>

var formAdd = document.getElementById("formAddProduk");
var button = document.getElementById("buttonTambahProduk");
var span = document.getElementsByClassName("close")[0];

button.onclick = function() {
	formAdd.style.display = "block";
}

span.onclick = function() {
	formAdd.style.display = "none";
}

window.onclick = function(event) {
  if (event.target == formAdd) {
	  formAdd.style.display = "none";
  }
}

var namaProduk = $('#namaProduk');
var hargaProduk = $('#hargaProduk');
var kelipatanProduk = $('#kelipatanProduk');

$('#tambahProduk').on('click', function(){
	if(namaProduk.val() != "" && hargaProduk.val() != "" && kelipatanProduk.val() != ""){
			AUI().use('aui-ui-request', function(A){
				A.io.request('<%= addProdukURL.toString() %>',{
					method: 'post',
					dataType: 'json',
					form:{
						id : "formProduk"
					},
					on:{
						success:function(){
							$('#validator').html("");
							formAdd.style.display = "none";
							getAllProduk();
							for(var i=0; i < document.getElementsByTagName("input").length; i++){
								document.getElementsByTagName("input")[i].value="";
							}
							console.log('DONE');
						}
					}
				})
			})
	} else {
		$('#validator').html("Data tidak Boleh Kosong");
	}
})

$(document).ready(function(){
	getAllProduk();
})

function getAllProduk(){
	AUI().use('aui-ui-request', function(A){
		A.io.request('<%= getAllProdukURL.toString() %>',{
			method: 'post',
			dataType: 'json',
			form:{
				id : "formProduk"
			},
			on:{
				success:function(){
					var data = '<tr> <th>Nama Produk</th> <th>Harga Produk</th> <th>Kelipatan Produk</th> <th class="action">Action</th> </tr>';
					for(var i = 0; i < this.get('responseData').listProduk.length; i++){
						var dataAdd = '<tr> <td>'+this.get('responseData').listProduk[i].JSONObject.namaProduk+'</td>\
						<td>'+this.get('responseData').listProduk[i].JSONObject.hargaProduk+'</td>\
						<td>'+this.get('responseData').listProduk[i].JSONObject.kelipatanProduk+'</td>\
						<td class="action"> <button class="mybtn" type="button" onclick="location.href=\'/web/guest/update_produk?idProduk='+this.get('responseData').listProduk[i].JSONObject.idProduk.substring(5)+'&namaProduk='+this.get('responseData').listProduk[i].JSONObject.namaProduk+'&hargaProduk='+this.get('responseData').listProduk[i].JSONObject.hargaProduk+'&kelipatanProduk='+this.get('responseData').listProduk[i].JSONObject.kelipatanProduk+'\'">Update</button>\
						&nbsp;&nbsp;&nbsp;\
						<button class="mybtn" type="button" onclick="deleteById('+this.get('responseData').listProduk[i].JSONObject.idProduk.substring(5)+')">Delete</button> </td> </tr>'
						data = data + dataAdd;
					}
					document.getElementById('tableProduk').innerHTML = data;
				}
			}
		})
	})
}

function deleteById(idProduk){
	AUI().use('aui-ui-request', function(A){
		A.io.request('<%= deleteByIdURL.toString() %>',{
			method: 'post',
			dataType: 'json',
			data:{
				<portlet:namespace/>idProduk: 'Prod-'+idProduk
			},
			on:{
				success:function(){
					getAllProduk();
				}
			}
		})
	})
}
</script>

<style>

.modalForm {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  padding-top: 100px; /* Location of the box */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: rgb(0,0,0); /* Fallback color */
  background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
}

/* Modal Content */
.modal-contentForm {
  background-color: #fefefe;
  margin: auto;
  padding: 20px;
  border: 1px solid #888;
  width: 30%;
}

/* The Close Button */
.close {
  color: #aaaaaa;
  float: right;
  font-size: 28px;
  font-weight: bold;
}

.close:hover,
.close:focus {
  color: #000;
  text-decoration: none;
  cursor: pointer;
}

table {
  border-collapse: collapse;
  border-radius: 10px;
  overflow: hidden;
  width: 100%;
}

tr:nth-child(even){background-color: #f2f2f2}

th,td {
  text-align: left;
  padding: 3px;
  border-bottom: 2px solid white;
  background-color: #ddd;
}

.action{
  text-align: center;
}

th {
  background-color: #B81111;
  color: white;
}


input{
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 6px;
  box-sizing: border-box;
}

.mybtn {
  background-color: #F9C176;
  color: #B81111;
  font-size: 16px;
  padding: 8px 30px;
  border: none;
  cursor: pointer;
  border-radius: 40px;
  font-weight: bold;
}

.mybtn:hover {
  background-color: #B81111;
  color: #F9C176;
  font-weight: bold;
}
</style>