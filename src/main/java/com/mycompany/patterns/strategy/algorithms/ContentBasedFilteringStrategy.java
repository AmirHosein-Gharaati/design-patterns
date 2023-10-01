package com.mycompany.patterns.strategy.algorithms;

import com.mycompany.patterns.strategy.RecommendationStrategy;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class ContentBasedFilteringStrategy implements RecommendationStrategy {

    @Override
    public List<String> getRecommendations(String userId) {
        // Recommend products based on user preferences and product tags
        return List.of();
    }
}
