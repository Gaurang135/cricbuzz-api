package com.example.cricbuzz.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Match {

    private Team team1;
    private Team team2;
    private Integer matchNumber;
    private CurrentStatus status;
    private Schedule schedule;
}
