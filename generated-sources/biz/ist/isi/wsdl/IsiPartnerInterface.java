package biz.ist.isi.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2017-06-29T20:40:08.445+02:00
 * Generated source version: 3.1.11
 * 
 */
@WebService(targetNamespace = "http://isi.ist.biz/wsdl", name = "isiPartnerInterface")
@XmlSeeAlso({biz.ist.isi.types.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface IsiPartnerInterface {

    @WebMethod
    @Action(input = "http://isi.ist.biz/wsdl/isiPartnerInterface/isiPartnerPullRequest", output = "http://isi.ist.biz/wsdl/isiPartnerInterface/isiPartnerPullResponse")
    @WebResult(name = "isiPartnerPullResponse", targetNamespace = "http://isi.ist.biz/types", partName = "isiPartnerPullResponse")
    public biz.ist.isi.types.IsiPartnerPullResponse isiPartnerPull(
        @WebParam(partName = "isiPartnerPull", name = "isiPartnerPull", targetNamespace = "http://isi.ist.biz/types")
        biz.ist.isi.types.IsiPartnerPull isiPartnerPull
    );

    @WebMethod
    @Action(input = "http://isi.ist.biz/wsdl/isiPartnerInterface/isiPartnerPushRequest", output = "http://isi.ist.biz/wsdl/isiPartnerInterface/isiPartnerPushResponse")
    @WebResult(name = "isiPartnerPushResponse", targetNamespace = "http://isi.ist.biz/types", partName = "isiPartnerPushResponse")
    public biz.ist.isi.types.IsiPartnerPushResponse isiPartnerPush(
        @WebParam(partName = "isiPartnerPush", name = "isiPartnerPush", targetNamespace = "http://isi.ist.biz/types")
        biz.ist.isi.types.IsiPartnerPush isiPartnerPush
    );
}
