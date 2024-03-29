package app.bluefig.service;

import app.bluefig.entity.ModuleFillInJpa;
import app.bluefig.repository.ModuleFillInJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ModuleFillInServiceImpl implements ModuleFillInService{
    @Autowired
    ModuleFillInJpaRepository moduleFillInJpaRepository;

    @Override
    public void addModuleFillIn(String id, String questionaryId, LocalDateTime datetime) {
        moduleFillInJpaRepository.addModuleFillIn(id, questionaryId, datetime);
    }

    @Override
    public List<ModuleFillInJpa> findModulesFillInJpaByPatientDoctorIds(String doctorId, String patientId) {
        return moduleFillInJpaRepository.findModulesFillInJpaByPatientDoctorIds(doctorId, patientId);
    }
}
