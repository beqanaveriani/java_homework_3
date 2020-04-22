package ge.btu.beka.naveriani.covid.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Covid {

    private String country;

    private int confirmed;

    private int deaths;

    private int recovered;


    public Covid(String country, int confirmed, int deaths, int recovered){
        this.country = country;
        this.confirmed = confirmed;
        this.deaths = deaths;
        this.recovered = recovered;
    }

    public Covid(){

    }

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    public int getConfirmed() {
        return confirmed;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getRecovered() {
        return recovered;
    }

    public String getCountry() {
        return country;
    }

    public String toString(){
        return "test";
    }

}
