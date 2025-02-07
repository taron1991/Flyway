package org.example.migration1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class COntroller {
    private final Dao dao;

    @Autowired
    public COntroller(Dao dao) {
        this.dao = dao;
    }

    @PostMapping("/school")
    public void save(@RequestBody School school){
        dao.save(school);
    }

    @GetMapping("/schools")
    public List<School> getAl(){
        return dao.findAll();
    }
}
