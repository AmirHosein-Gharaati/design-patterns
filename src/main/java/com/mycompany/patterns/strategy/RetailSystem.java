package com.mycompany.patterns.strategy;

import lombok.AllArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@AllArgsConstructor
public class RetailSystem {
    private RecommendationStrategy recommendationStrategy;

    public List<String> getRecommendations(String userId) {
        if(recommendationStrategy == null) {
            return List.of();
        }
        return recommendationStrategy.getRecommendations(userId);
    }
}
