package com.example.library;
/*
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

public abstract class JpaEmployeesRepository implements EmployeesRepository {

    @PersistenceContext
    private EntityManager em;


    @Override
    public List<Employees> findAll(){
        TypedQuery<Employees> query = em.createQuery("SELECT c FROM employees c", Employees.class);
        return query.getResultList();
    }


    public Employees findById(int id){
        return em.find(Employees.class, id);
    }

    @Override
    public Employees save(Employees employee){
        em.persist(employee);
        return employee;
    }

}
*/
