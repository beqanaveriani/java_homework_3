package ge.btu.beka.naveriani.covid.services;

import ge.btu.beka.naveriani.covid.models.Covid;

import java.util.ArrayList;
import java.util.List;

public class CovidResourceServiceImpl implements CovidResourceService{

    private static CovidResourceService covidResourceService;

    private List<Covid> covids = new ArrayList<Covid>();

    CovidResourceServiceImpl(){
        covids.add(new Covid("US", 760245, 40702, 71003));
        covids.add(new Covid("Spain", 200210, 166256, 635895));
        covids.add(new Covid("Italy", 178972, 23669, 51003));
    }

    public List<Covid> getStatistic() {
        return covids;
    }

    public Covid getCountryStatistic(String country) {
        for (Covid covid : covids) {
            if (covid.getCountry().equals(country)){
                return covid;
            }
        }
        return null;
    }

    public int getTotalConfirmed() {
        int sum = 0;
        for (Covid covid : covids) {
            sum += covid.getConfirmed();
        }
        return sum;
    }

    public static CovidResourceService getInstance(){
        if (covidResourceService == null){
            covidResourceService = new CovidResourceServiceImpl();
        }
        return covidResourceService;
    }
}
