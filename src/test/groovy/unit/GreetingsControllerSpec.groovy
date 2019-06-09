import com.learnspringboot.controller.GreetingsController
import org.springframework.http.MediaType
import org.springframework.mock.web.MockHttpServletResponse
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

import static com.learnspringboot.constants.ItemConstants.GET_ALL_ITEMS
import static com.learnspringboot.constants.ItemConstants.GREETING
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup

class GreetingsControllerSpec  extends Specification{

    GreetingsController greetingsController = new GreetingsController()
    MockMvc mockMvc = standaloneSetup(greetingsController).build()

    def "Name"() {

        given:
        def expectedResponse = "Hello from Local Profile"

        when:
        MockHttpServletResponse response = mockMvc.perform(get(GREETING)
                .contentType(MediaType.APPLICATION_JSON_VALUE)).andReturn().response

        then:
        response.contentAsString == expectedResponse
    }
}
