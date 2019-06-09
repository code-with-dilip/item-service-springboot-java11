package com.learnspringboot;

import com.learnspringboot.ItemServiceApplication
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import spock.lang.Specification

@SpringBootTest(classes =  ItemServiceApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class BaseIntegrationTestSpec extends Specification {

}
