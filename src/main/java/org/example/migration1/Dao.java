package org.example.migration1;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Dao extends JpaRepository<School,Integer> {
}
