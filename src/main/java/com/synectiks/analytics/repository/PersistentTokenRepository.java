package com.synectiks.analytics.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synectiks.analytics.domain.PersistentToken;
import com.synectiks.analytics.domain.User;

/**
 * Spring Data JPA repository for the {@link PersistentToken} entity.
 */
public interface PersistentTokenRepository extends JpaRepository<PersistentToken, String> {

    List<PersistentToken> findByUser(User user);

    List<PersistentToken> findByTokenDateBefore(LocalDate localDate);

}
