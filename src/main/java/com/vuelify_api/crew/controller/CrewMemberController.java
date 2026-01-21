package com.vuelify_api.crew.controller;

import java.net.URI;
import java.util.UUID;

import org.jspecify.annotations.NullMarked;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vuelify_api.crew.dto.CreateCrewMemberRequest;
import com.vuelify_api.crew.model.CrewMember;
import com.vuelify_api.crew.service.CrewMemberService;

import jakarta.validation.Valid;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api/crewmember")
@RequiredArgsConstructor
@NullMarked
public class CrewMemberController {

    private final CrewMemberService crewMemberService;

    @PostMapping
    public ResponseEntity<CrewMember> createCrewMember(@RequestBody @Valid @NonNull CreateCrewMemberRequest request) {
        CrewMember crewMemberCreated = crewMemberService.createCrewMember(request);
        return ResponseEntity.created(URI.create("/api/crewmember" + crewMemberCreated.getId()))
                .body(crewMemberCreated);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CrewMember> getCrewMemberById(@PathVariable @NonNull UUID id) {
        CrewMember crewMemberFoundById = crewMemberService.getCrewMemberById(id);
        return ResponseEntity.ok(crewMemberFoundById);
    }
}
