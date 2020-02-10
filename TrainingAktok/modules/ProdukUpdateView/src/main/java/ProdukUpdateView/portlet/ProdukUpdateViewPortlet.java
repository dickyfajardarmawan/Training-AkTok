package ProdukUpdateView.portlet;

import ProdukUpdateView.constants.ProdukUpdateViewPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;

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
		"javax.portlet.name=" + ProdukUpdateViewPortletKeys.ProdukUpdateView,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ProdukUpdateViewPortlet extends MVCPortlet {
	public void updateProduk(ActionRequest request, ActionResponse response) {
		String idProduk = ParamUtil.getString(request, "idProduk");
		String namaProduk = ParamUtil.getString(request, "namaProduk");
		long hargaProduk = ParamUtil.getLong(request, "hargaProduk");
		long kelipatanProduk = ParamUtil.getLong(request, "kelipatanProduk");
		ProdukLocalServiceUtil.updateProduk(idProduk, namaProduk, hargaProduk, kelipatanProduk);
		System.out.println("data update dengan ID :"+ idProduk);
	}
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		HttpServletRequest httpreq = PortalUtil.getOriginalServletRequest(PortalUtil.getHttpServletRequest(renderRequest));
		String idProduk = "";
		String namaProduk = "";
		long hargaProduk = 0;
		long kelipatanProduk = 0;
		try {
			idProduk = String.valueOf(httpreq.getParameter("idProduk"));
			namaProduk = String.valueOf(httpreq.getParameter("namaProduk"));
			hargaProduk = Long.valueOf(httpreq.getParameter("hargaProduk"));
			kelipatanProduk = Long.valueOf(httpreq.getParameter("kelipatanProduk"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		renderRequest.setAttribute("idProduk", idProduk);
		renderRequest.setAttribute("namaProduk", namaProduk);
		renderRequest.setAttribute("hargaProduk", hargaProduk);
		renderRequest.setAttribute("kelipatanProduk", kelipatanProduk);
		super.render(renderRequest, renderResponse);
	}
}