package com.generator.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ReaderMapperTest {
    @Autowired
    private ReaderMapper readerMapper;
    @Test
    void test(){
        readerMapper.selectList(null).forEach(System.out::println);
    }
}