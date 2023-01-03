package dev.fennex.workshop.cleanworkshop.domain.repository;

public interface LoginRepository {
    String authenticate(String username, String password);
}

