package com.example.cricbuzz.Services;

import com.example.cricbuzz.Entities.Region;
import com.example.cricbuzz.Models.Series;
import com.example.cricbuzz.Repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements IService{

    private final MatchRepository repository;

    @Autowired
    public ServiceImpl(MatchRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<Series> getDomesticMatches() {
        return repository.findByRegion(Region.DOMESTIC);
    }

    @Override
    public List<Series> getInternationalMatches() {
        return repository.findByRegion(Region.INTERNATIONAL);
    }
}
