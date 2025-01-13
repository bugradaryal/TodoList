package com.DataAccess.Abstact;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IGenericRepository<T,TYPE> extends JpaRepository<T,TYPE> {

}
