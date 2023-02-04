package com.mareelsoftware.kafkaconsumerpostgres;

import com.mareelsoftware.kafkaconsumerpostgres.models.WikiEventData;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import javax.sql.DataSource;

@MappedTypes(WikiEventData.class)
@MapperScan("com.mareelsoftware.kafkaconsumerpostgres.mapper")
@SpringBootApplication
public class SpringBootConsumerApplication {
    public static void main(String[] args){
        SpringApplication.run(SpringBootConsumerApplication.class);
    }
}
