package com.resttemplate.demo.respository;

import com.resttemplate.demo.data.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepo extends JpaRepository<Data,Integer> {

    // all data will be saved here
}
