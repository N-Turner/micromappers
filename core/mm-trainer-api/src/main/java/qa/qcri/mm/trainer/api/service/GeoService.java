package qa.qcri.mm.trainer.api.service;

import qa.qcri.mm.trainer.api.template.GeoJsonOutputModel;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jlucas
 * Date: 1/18/14
 * Time: 1:58 PM
 * To change this template use File | Settings | File Templates.
 */
public interface GeoService {
    List<GeoJsonOutputModel> getGeoJsonOutput() throws Exception;
    String getGeoJsonOuputJSONP(Date updated) throws Exception;
    String getGeoJsonOuputJSON(Date updated) throws Exception;
}
