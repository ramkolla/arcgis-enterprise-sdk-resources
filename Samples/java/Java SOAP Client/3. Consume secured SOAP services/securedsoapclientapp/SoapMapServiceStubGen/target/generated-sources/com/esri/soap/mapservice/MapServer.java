package com.esri.soap.mapservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.4.0
 * 2020-10-01T17:32:26.316-07:00
 * Generated source version: 3.4.0
 *
 */
@WebServiceClient(name = "MapServer",
                  wsdlLocation = "file:/C:/HS/dltb/MapServer.wsdl",
                  targetNamespace = "http://www.esri.com/schemas/ArcGIS/2.6.0")
public class MapServer extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.esri.com/schemas/ArcGIS/2.6.0", "MapServer");
    public final static QName MapServerPort = new QName("http://www.esri.com/schemas/ArcGIS/2.6.0", "MapServerPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/HS/dltb/MapServer.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MapServer.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/HS/dltb/MapServer.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MapServer(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MapServer(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MapServer() {
        super(WSDL_LOCATION, SERVICE);
    }

    public MapServer(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public MapServer(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public MapServer(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns MapServerPort
     */
    @WebEndpoint(name = "MapServerPort")
    public MapServerPort getMapServerPort() {
        return super.getPort(MapServerPort, MapServerPort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MapServerPort
     */
    @WebEndpoint(name = "MapServerPort")
    public MapServerPort getMapServerPort(WebServiceFeature... features) {
        return super.getPort(MapServerPort, MapServerPort.class, features);
    }

}
