package com.abhijit.aiservice.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Map;


@Data
public class Activity {
    private String id;
    private String userId;
    private Integer duration;
    private Integer caloriesBurned;
    private LocalDateTime startTime;
    private LocalDateTime createdAt;
    private Map<String, Object> additionalMetices;
    private LocalDateTime updatedAt;


}
