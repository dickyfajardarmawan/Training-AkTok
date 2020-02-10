package ProdukView.portlet;

import ProdukView.constants.ProdukViewPortletKeys;

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

import ProdukSvc.exception.NoSuchProdukException;
import ProdukSvc.service.ProdukLocalServiceUtil;

/**
 * @author 0815
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.produk",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ProdukViewPortletKeys.ProdukView,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ProdukViewPortlet extends MVCPortlet {
	public void addProduk(ActionRequest request, ActionResponse response) {
		String namaProduk = ParamUtil.getString(request, "namaProduk");
		long hargaProduk = ParamUtil.getLong(request, "hargaProduk");
		long kelipatanProduk = ParamUtil.getLong(request, "kelipatanProduk");
		ProdukLocalServiceUtil.addProduk(namaProduk, hargaProduk, kelipatanProduk);
		System.out.println("Berhasil : "+ namaProduk);
	}
	
	public void serveResource(ResourceRequest request, ResourceResponse response) throws IOException {
		List<JSONObject> listJSON = ProdukLocalServiceUtil.getAllProduk();
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		jsonObject.put("listProduk", listJSON);
		writer.print(jsonObject.toString());
		writer.flush();
		writer.close();
	}
	
	public void deleteById(ActionRequest request, ActionResponse response) throws NoSuchProdukException {
		String idProduk = ParamUtil.getString(request, "idProduk");
		ProdukLocalServiceUtil.deleteById(idProduk);
	}
}