package AlamatView.portlet;

import AlamatView.constants.AlamatViewPortletKeys;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.security.auth.PrincipalThreadLocal;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.osgi.service.component.annotations.Component;

import AlamatSvc.service.AlamatLocalServiceUtil;

/**
 * @author 0815
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.Alamat",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + AlamatViewPortletKeys.AlamatView,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class AlamatViewPortlet extends MVCPortlet {
	
	public void tambahAlamat(ActionRequest actionRequest, ActionResponse actionResponse) {
		
			
		long idUser = PrincipalThreadLocal.getUserId();
		String namaAlamat = ParamUtil.getString(actionRequest, "namaAlamat");
		String namaPenerima = ParamUtil.getString(actionRequest, "namaPenerima");
		long nomorHandphone = ParamUtil.getLong(actionRequest, "nomorHandphone");
		String alamatLengkap = ParamUtil.getString(actionRequest, "alamatLengkap");
		long kodePos = ParamUtil.getLong(actionRequest, "kodePos");
		String kota = ParamUtil.getString(actionRequest, "kota");
		String provinsi = ParamUtil.getString(actionRequest, "provinsi");
		String region = ParamUtil.getString(actionRequest, "region");
		
		System.out.println("coba masuk controller gak saat tambah ?" + idUser + " " + namaAlamat + " " + namaPenerima);
		
		AlamatLocalServiceUtil.tambahAlamat(idUser, namaAlamat, namaPenerima, nomorHandphone, alamatLengkap, kodePos, kota, provinsi, region);
		
	}
	
	public void ubahAlamat(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		long idUser = PrincipalThreadLocal.getUserId();
		String idAlamat = ParamUtil.getString(actionRequest, "idAlamatUbah");
		String namaAlamat = ParamUtil.getString(actionRequest, "namaAlamatUbah");
		String namaPenerima = ParamUtil.getString(actionRequest, "namaPenerimaUbah");
		long nomorHandphone = ParamUtil.getLong(actionRequest, "nomorHandphoneUbah");
		String alamatLengkap = ParamUtil.getString(actionRequest, "alamatLengkapUbah");
		long kodePos = ParamUtil.getLong(actionRequest, "kodePosUbah");
		String kota = ParamUtil.getString(actionRequest, "kotaUbah");
		String provinsi = ParamUtil.getString(actionRequest, "provinsiUbah");
		String region = ParamUtil.getString(actionRequest, "regionUbah");
		int status = 1;
		
		System.out.println("coba masuk controller gak saat ubah ?" + nomorHandphone + " " + namaAlamat + " " + namaPenerima);
		
		AlamatLocalServiceUtil.gantiAlamat(idAlamat, idUser, namaAlamat, namaPenerima, nomorHandphone, alamatLengkap, kodePos, kota, provinsi, region, status);
	}
	
	public void hapusAlamatBerdasarkanId(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		String idAlamat = ParamUtil.getString(actionRequest, "idAlamat");
		System.out.println(idAlamat + " nih id alamat");
		AlamatLocalServiceUtil.ubahStatusAlamatById(idAlamat);
		
	}
	
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException {
		
		long idUser = PrincipalThreadLocal.getUserId();
		List<JSONObject> listJSON = AlamatLocalServiceUtil.cariAlamatDenganIdToko(idUser);
		resourceResponse.setContentType("text/html");
		PrintWriter writer = resourceResponse.getWriter();
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		jsonObject.put("listAlamat", listJSON);
		writer.print(jsonObject.toString());
		writer.flush();
		writer.close();
		
	}
	
}