package com.example.cricbuzz.Repository;

import com.example.cricbuzz.Entities.Region;
import com.example.cricbuzz.Models.Series;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchRepository extends MongoRepository<Series, Region> {

    List<Series> findByRegion(Region region);
}
