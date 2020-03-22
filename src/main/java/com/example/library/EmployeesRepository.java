
package com.example.library;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees,Long> {

    //write your own queries
    List<Employees> findByAdmin(Boolean admin);
    List<Employees> findByEmailAndFio(String emailAddress, String fio);
    @Query("FROM employees WHERE department=?1 ORDER BY fio")
    List<Employees> findByDepartmentSorted(String department);
}

