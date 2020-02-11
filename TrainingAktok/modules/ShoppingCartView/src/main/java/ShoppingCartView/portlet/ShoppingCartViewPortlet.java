package ShoppingCartView.portlet;

import ShoppingCartView.constants.ShoppingCartViewPortletKeys;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import ShoppingCartSvc.service.CartLocalServiceUtil;
import ShoppingCartSvc.service.ProdukLocalServiceUtil;

/**
 * @author 0452
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=aksestoko.ShoppingCart",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ShoppingCartViewPortletKeys.ShoppingCartView,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ShoppingCartViewPortlet extends MVCPortlet {
	public void serveResource(ResourceRequest request, ResourceResponse response) throws IOException {
		List<JSONObject> listJSONProduk = ProdukLocalServiceUtil.getAllProduk();
		List<JSONObject> listJSONCart = CartLocalServiceUtil.getAllCart();
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		jsonObject.put("listProduk", listJSONProduk);
		jsonObject.put("listCart", listJSONCart);
		writer.print(jsonObject.toString());
		writer.flush();
		writer.close();
	}
	
	public void addCart(ActionRequest actionRequest, ActionResponse actionResponse) {
		String idProduk = ParamUtil.getString(actionRequest, "idProduk");
		String idToko = ParamUtil.getString(actionRequest, "idToko");
		long jumlahProduk = ParamUtil.getLong(actionRequest, "jumlahProduk");
		long subTotal = ParamUtil.getLong(actionRequest, "subTotal");
		System.out.println("id produk = " + idProduk);
		System.out.println("id Toko = " + idToko);
		System.out.println("jumlah produk = " + jumlahProduk);
		System.out.println("jumlah produk = " + subTotal);
		CartLocalServiceUtil.addCart(idProduk, idToko, jumlahProduk, subTotal);
	}
	
	public void deleteCartById(ActionRequest actionRequest, ActionResponse actionResponse) {
		String idCart = ParamUtil.getString(actionRequest, "idCart");
		System.out.println("id cart =" + idCart);
		CartLocalServiceUtil.deleteCartById(idCart);
	}
}