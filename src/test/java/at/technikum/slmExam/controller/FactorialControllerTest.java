package at.technikum.slmExam.controller;

import at.technikum.slmExam.service.FactorialService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
public class FactorialControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private FactorialService factorialService;

    @Test
    public void testGetFactorial() throws Exception {
        when(factorialService.calculateFactorial(5)).thenReturn(120L);

        mockMvc.perform(get("/api/factorial?number=5"))
                .andExpect(status().isOk())
                .andExpect(content().string("120"));
    }

    @Test
    public void testGetTotalFactorialSum() throws Exception {
        when(factorialService.getTotalFactorialSum()).thenReturn(144L);

        mockMvc.perform(get("/api/factorial/total"))
                .andExpect(status().isOk())
                .andExpect(content().string("144"));
    }
}
