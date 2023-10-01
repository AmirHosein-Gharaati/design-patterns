package com.mycompany.patterns.strategy;

import java.util.List;

public interface RecommendationStrategy {
    List<String> getRecommendations(String userId);
}
