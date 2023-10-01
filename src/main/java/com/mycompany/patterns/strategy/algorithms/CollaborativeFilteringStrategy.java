package com.mycompany.patterns.strategy.algorithms;

import com.mycompany.patterns.strategy.RecommendationStrategy;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class CollaborativeFilteringStrategy implements RecommendationStrategy {

    @Override
    public List<String> getRecommendations(String userId) {
        // Recommend products based on the purchase history of similar users
        return List.of();
    }
}
