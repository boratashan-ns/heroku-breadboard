package com.example.application.data;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DataClient {
   // @Autowired
  //  private JdbcTemplate jdbcTemplate;

    public int doSomething() {
     //   int result = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM public.breadboard", Integer.class);
        return 0;//result;
    }
}
