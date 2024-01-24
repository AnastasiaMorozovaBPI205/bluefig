package app.bluefig.controller;

import app.bluefig.MapStructMapper;
import app.bluefig.entity.RecommendationJpa;
import app.bluefig.entity.UserJpa;
import app.bluefig.model.Recommendation;
import app.bluefig.model.User;
import app.bluefig.service.RecommendationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

@RestController
public class RecommendationController {
    @Autowired
    RecommendationServiceImpl recommendationService;

    @Autowired
    private MapStructMapper mapper;

    /**
     * Добавление рекомендации для пациента.
     * @param data данные
     */
    @PostMapping("/recommendation")
    public void addRecommendation(@RequestBody HashMap<String, String> data) {
        String patientId = data.get("patientId");
        String doctorId = data.get("doctorId");
        LocalDateTime datetime = LocalDateTime.parse(data.get("datetime"));
        String recommendation = data.get("recommendation");

        recommendationService.addRecommendation(patientId, doctorId, datetime, recommendation);
        System.out.println("recommendation added successfully");
    }

    /**
     * Поиск рекомендаций по id пациента.
     * @param patientId пациента
     * @return список рекомендаций
     */
    @GetMapping("/recommendation/{patientId}")
    public List<Recommendation> getRecommendationByPatient(@PathVariable String patientId) {
        List<RecommendationJpa> recommendationJpas = recommendationService.findRecommendationJpaByPatient(patientId);
        return mapper.RecommendationJpasToRecommendations(recommendationJpas);
    }
}