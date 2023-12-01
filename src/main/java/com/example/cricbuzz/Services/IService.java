package com.example.cricbuzz.Services;

import com.example.cricbuzz.Models.Series;

import java.util.List;

public interface IService {

    List<Series> getDomesticMatches();
    List<Series> getInternationalMatches();

}
