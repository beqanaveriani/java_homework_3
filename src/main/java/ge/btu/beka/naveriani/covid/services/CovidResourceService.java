package ge.btu.beka.naveriani.covid.services;

import ge.btu.beka.naveriani.covid.models.Covid;

import java.util.List;

public interface CovidResourceService {

    List<Covid> getStatistic();

    Covid getCountryStatistic(String country);

    int getTotalConfirmed();
}
