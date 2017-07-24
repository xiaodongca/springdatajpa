package com.cxd.service;

import com.cxd.dao.PersonRepository;
import com.cxd.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: cxd
 * Date: 2017/7/24
 * Description:
 */
@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Transactional
    public void insertTwo(){
        Person personA = new Person();
        personA.setAge(21);
        personA.setName("秋雁");
        personRepository.save(personA);

        System.out.println(1/0);

        Person personB = new Person();
        personB.setAge(21);
        personB.setName("嘿嘿");
        personRepository.save(personB);
    }
}
