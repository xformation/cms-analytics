package com.synectiks.analytics.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synectiks.analytics.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
