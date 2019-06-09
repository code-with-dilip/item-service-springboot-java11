import com.fasterxml.jackson.databind.ObjectMapper
import com.learnspringboot.controller.ItemController
import com.learnspringboot.domain.Item
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.mock.web.MockHttpServletResponse
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

import static com.learnspringboot.constants.ItemConstants.GET_ALL_ITEMS
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup

class ItemControllerSpec extends Specification {

    ItemController itemController = new ItemController()
    MockMvc mockMvc = standaloneSetup(itemController).build()

    ObjectMapper objectMapper = new ObjectMapper();

    def "items"() {

        when:
        MockHttpServletResponse response = mockMvc.perform(get(GET_ALL_ITEMS)
                .contentType(MediaType.APPLICATION_JSON_VALUE)).andReturn().response

        then:
        statusCode == response.status
        List<Item> itemList = List.of(objectMapper.readValue(response.contentAsString, Item[].class))
        println(itemList)
        itemList.size() == resultSize

        where:
        statusCode            || resultSize
        HttpStatus.OK.value() || 2


    }
}
