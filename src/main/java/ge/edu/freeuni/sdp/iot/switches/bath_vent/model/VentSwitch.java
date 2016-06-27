package ge.edu.freeuni.sdp.iot.switches.bath_vent.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by khrak on 6/25/16.
 */
@XmlRootElement
public class VentSwitch {

    @XmlElement
    private String status;
    @XmlElement
    private String houseid;

    public VentSwitch(String houseid, String status) {
        this.houseid = houseid;
        this.status = status;
    }

    public String getHouseid() {
        return houseid;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String newStatus) {
        status = newStatus;
    }
}
