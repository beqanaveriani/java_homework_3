package ge.btu.beka.naveriani.covid.services;

import ge.btu.beka.naveriani.covid.models.Covid;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService
public class CovidStatisticService {

    CovidResourceService service = CovidResourceServiceImpl.getInstance();

    @WebMethod
    public List<Covid> getStatistic(){
        return service.getStatistic();
    }

    @WebMethod()
    public Covid getCountryStatistic(@WebParam(name = "country") String country){
        return service.getCountryStatistic(country);
    }


    @WebMethod
    public int getTotalConfirmed(){
        return service.getTotalConfirmed();
    }


}
