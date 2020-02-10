<%@ include file="/init.jsp" %>

<%
String idProduk = String.valueOf((String) renderRequest.getAttribute("idProduk"));
String namaProduk = String.valueOf((String) renderRequest.getAttribute("namaProduk"));
long hargaProduk = Long.valueOf((Long) renderRequest.getAttribute("hargaProduk"));
long kelipatanProduk = Long.valueOf((Long) renderRequest.getAttribute("kelipatanProduk"));
%>

<div>
	<h3 align="right">UPDATE PRODUK</h3>
	<form id="formProdukUpdate">
		<div>
			<label>Nama Produk</label><br>
			<input type="text" value="<%= namaProduk %>" name="<portlet:namespace/>namaProduk"/>
		</div>
		<div>
			<label>Harga Produk</label><br>
			<input type="number" value="<%= hargaProduk %>" name="<portlet:namespace/>hargaProduk"/>
		</div>
		<div>
			<label>Kelipatan Produk</label><br>
			<input type="number" value="<%= kelipatanProduk %>" name="<portlet:namespace/>kelipatanProduk"/>
		</div>
		<br>
		<button class="mybtn" type="button" onclick="updateProduk(<%= idProduk %>)">SAVE</button>&nbsp;&nbsp;&nbsp;
		<button class="mybtn" type="button" onclick="window.location.href ='<%themeDisplay.getURLHome();%>/web/guest/home';">BACK</button>
	</form>
</div>

<portlet:actionURL name="updateProduk" var="updateProdukURL" />

<script>
function updateProduk(idProduk){
	AUI().use('aui-ui-request', function(A){
		A.io.request('<%= updateProdukURL.toString() %>',{
			method: 'post',
			dataType: 'json',
			form:{
				id : "formProdukUpdate"
			},
			data:{
				<portlet:namespace/>idProduk: 'Prod-'+idProduk
			},
			on:{
				success:function(){
					window.location.href ='<%themeDisplay.getURLHome();%>/web/guest/home';
				}
			}
		})
	})
}
</script>

<style>
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