package com.mycompany.patterns.strategy;

import com.mycompany.patterns.strategy.algorithms.CollaborativeFilteringStrategy;
import com.mycompany.patterns.strategy.algorithms.ContentBasedFilteringStrategy;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RecommendationStrategy strategy1 =
                new CollaborativeFilteringStrategy();

        RetailSystem retailSystem = new RetailSystem(strategy1);

        String userId = "123";
        List<String> recommendedProducts =
                retailSystem.getRecommendations(userId);

        retailSystem.setRecommendationStrategy(
                new ContentBasedFilteringStrategy()
        );
        List<String> recommendedProducts2 =
                retailSystem.getRecommendations(userId);
    }
}
