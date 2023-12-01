package com.example.cricbuzz.Models;

import com.example.cricbuzz.Entities.Match;
import com.example.cricbuzz.Entities.Region;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("series")
public class Series {

    private String seriesName;
    private Region region;
    private List<Match> matches;
}
