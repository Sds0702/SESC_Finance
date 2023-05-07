package uk.ac.leedsbeckett.finance.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository {
    Account findAccountByStudentId (String studentId);
}