package io.adam.boot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.adam.boot.model.Stock;

@Transactional
@Repository
public interface StockRepository
        extends CrudRepository<Stock, Long> {
public List<Stock> findAll();
public Optional<Stock> findById(Long id);
}
