package app.bluefig.service;

import app.bluefig.entity.RecommendationJpa;
import app.bluefig.repository.RecommendationJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RecommendationServiceImpl implements RecommendationService{
    @Autowired
    private RecommendationJpaRepository recommendationJpaRepository;

    @Override
    public List<RecommendationJpa> findRecommendationJpaByPatient(String patientId) {
        return recommendationJpaRepository.findRecommendationJpaByPatient(patientId);
    }

    @Override
    public void addRecommendation(String patientId, String doctorId, LocalDateTime dateTime, String recommendation) {
        recommendationJpaRepository.addRecommendation(patientId, doctorId, dateTime, recommendation);
    }
}
