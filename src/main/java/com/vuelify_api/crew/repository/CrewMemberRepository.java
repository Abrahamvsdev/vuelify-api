package com.vuelify_api.crew.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vuelify_api.crew.model.CrewMember;

public interface CrewMemberRepository extends JpaRepository<CrewMember, UUID> {

    Optional<CrewMember> findByLicenseId(String licenseId);
}
