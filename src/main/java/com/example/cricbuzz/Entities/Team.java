package com.example.cricbuzz.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Team {
    private String teamName;
    private Integer score;
    private Integer wickets;
    private Double overs;
}
