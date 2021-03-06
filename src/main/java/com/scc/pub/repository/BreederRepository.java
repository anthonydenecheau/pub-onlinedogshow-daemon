package com.scc.pub.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.scc.pub.model.Breeder;

/**
 * Created by AnthonyLenovo on 06/01/2019.
 */
@Repository
public interface BreederRepository extends CrudRepository<Breeder,String>  {
    public List<Breeder> findById(int id);
    public Breeder findByIdDog(int idDog);

}
