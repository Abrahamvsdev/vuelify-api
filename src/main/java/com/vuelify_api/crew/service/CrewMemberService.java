package com.vuelify_api.crew.service;

import com.vuelify_api.crew.dto.CreateCrewMemberRequest;
import com.vuelify_api.crew.model.CrewMember;
import com.vuelify_api.crew.repository.CrewMemberRepository;

import lombok.RequiredArgsConstructor;

import java.util.UUID;

import org.jspecify.annotations.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CrewMemberService {

    private final CrewMemberRepository crewMemberRepository;

    @Transactional
    public CrewMember createCrewMember( CreateCrewMemberRequest request) {

        CrewMember crewMember = CrewMember.builder()
                .passportNumber(request.passportNumber())
                .firstName(request.firstName())
                .lastName(request.lastName())
                .flightHours(request.flightHours())
                .email(request.email())
                .licenseId(request.licenseId())
                .role(request.role())
                .build();

        return crewMemberRepository.save(crewMember);
    }

    @Transactional(readOnly = true)
    public @NonNull CrewMember getCrewMemberById(@NonNull UUID id) {
        return crewMemberRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("CrewMember not found with ID: " + id)); // TODO Must change
                                                                                                 // when organice
                                                                                                 // exceptions)
    }

}
