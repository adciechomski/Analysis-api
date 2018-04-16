package io.adam.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import io.adam.boot.model.Stock;

@Transactional
public interface StockRepository
        extends JpaRepository<Stock, Long> {

}
