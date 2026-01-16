package com.vuelify_api.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vuelify_api.domain.CrewMember;

public interface CrewMemberRepository extends JpaRepository<CrewMember, UUID> {

    Optional<CrewMember> findByLicenseId(String licenseId);
}
