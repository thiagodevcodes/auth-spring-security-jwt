package com.sos.auth.auth_sos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sos.auth.auth_sos.models.Tweet;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {
    
}