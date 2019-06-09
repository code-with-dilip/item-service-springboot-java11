package com.learnspringboot.controller

import com.learnspringboot.BaseIntegrationTestSpec
import com.learnspringboot.constants.ItemConstants
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

class GreetingsControllerSpecIT extends BaseIntegrationTestSpec{

    @Autowired
    TestRestTemplate testRestTemplate

    def "Greetings Success Scenario Test"() {

        when:
        ResponseEntity<String> responseEntity = testRestTemplate.getForEntity(ItemConstants.GREETING, String.class)

        then:
        responseEntity.statusCode == HttpStatus.OK
        responseEntity.body  == "Hello from Test Profile"
    }
}