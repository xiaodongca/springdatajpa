package com.cxd.dao;

import com.cxd.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IntelliJ IDEA.
 * User: cxd
 * Date: 2017/7/24
 * Description:person
 */
public interface PersonRepository extends JpaRepository<Person,Integer>{

}
