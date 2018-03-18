package cern.spring.campus.calendar.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Service
public class ApiService {

    private static final String DEFAULT_ROOT_ALIAS = "entity0";

    private final EntityManager entityManager;

    public ApiService(final EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional(readOnly = true)
    public <T> List<T> query(final Class<T> resultType) {
        CriteriaBuilder criteriaBuilder = this.entityManager.getCriteriaBuilder();

        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(resultType);
        Root<T> root = criteriaQuery.from(resultType);
        root.alias(DEFAULT_ROOT_ALIAS);
        TypedQuery<T> query = entityManager.createQuery(criteriaQuery);
        return query.getResultList();
    }

}
