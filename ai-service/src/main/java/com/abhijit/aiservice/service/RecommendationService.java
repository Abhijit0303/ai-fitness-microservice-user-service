package com.abhijit.aiservice.service;

import com.abhijit.aiservice.model.Recommendation;
import com.abhijit.aiservice.repository.RecommendationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecommendationService {
    private final RecommendationRepository recommendationRepository;

    public List<Recommendation> getUserRecommendation(String userId) {
        return recommendationRepository.findByUserId(userId);
    }

    public Recommendation getActivtyRecommendation(String activtyId) {
        return recommendationRepository.findByActivityId(activtyId)
                .orElseThrow(() -> new RuntimeException("No recommendation found with this id: " + activtyId));
    }
}
