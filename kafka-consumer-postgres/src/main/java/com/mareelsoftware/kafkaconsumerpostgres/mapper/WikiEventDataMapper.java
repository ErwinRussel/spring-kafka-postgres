package com.mareelsoftware.kafkaconsumerpostgres.mapper;

import com.mareelsoftware.kafkaconsumerpostgres.models.WikiEventData;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

@Mapper
public interface WikiEventDataMapper {
    @Select("SELECT * FROM wikimedia")
    List<WikiEventData> findAll();

    @Insert("INSERT INTO wikimedia(wikiEventData) values(#{wikiEventData})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id",
            before = false, resultType = Integer.class)
    void insert(WikiEventData wikimediaData);
}
