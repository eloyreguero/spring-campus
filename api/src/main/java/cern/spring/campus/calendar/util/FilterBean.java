package cern.spring.campus.calendar.util;

import org.springframework.data.domain.Sort;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;

public abstract class FilterBean<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private Sort sort;

    public Sort getSort() {
        return sort;
    }

    public void setSort(final Sort sort) {
        this.sort = sort;
    }

    public abstract void apply(final CriteriaBuilder cb, final CriteriaQuery<T> cq, final Root<T> root);
}
