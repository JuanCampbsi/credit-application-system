package org.example.credit.application.system.controller

import com.fasterxml.jackson.databind.ObjectMapper
import org.example.credit.application.system.dto.request.CreditDto
import org.example.credit.application.system.dto.request.CustomerDto
import org.example.credit.application.system.dto.request.CustomerUpdateDto
import org.example.credit.application.system.entity.Address
import org.example.credit.application.system.entity.Credit
import org.example.credit.application.system.entity.Customer
import org.example.credit.application.system.repository.CreditRepository
import org.example.credit.application.system.repository.CustomerRepository
import org.example.credit.application.system.service.CustomerServiceTest
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import java.math.BigDecimal
import java.time.LocalDate
import java.util.*

@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureMockMvc
@ContextConfiguration
class CreditResourceTest {
    @Autowired
    private lateinit var creditRepository: CreditRepository

    @Autowired
    private lateinit var customerRepository: CustomerRepository

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Autowired
    private lateinit var objectMapper: ObjectMapper

    companion object {
        const val URL: String = "/api/credits"

        private fun buildCredit(
            creditValue: BigDecimal = BigDecimal.valueOf(100.0),
            dayFirstOfInstallment: LocalDate = LocalDate.now().plusMonths(2L),
            numberOfInstallments: Int = 5,
            customer: Customer = CustomerServiceTest.buildCustomer()
        ): CreditDto = CreditDto(
            creditValue = creditValue,
            dayFirstOfInstallment = dayFirstOfInstallment,
            numberOfInstallments = numberOfInstallments,
            customerId = 1
        )


        private fun builderCustomerDto(
            firstName: String = "Juan",
            lastName: String = "Campos",
            cpf: String = "15787445716",
            email: String = "juancampos.bsi@email.com",
            income: BigDecimal = BigDecimal.valueOf(1000.0),
            password: String = "1234",
            zipCode: String = "000000",
            street: String = "Rua da Caminho foz jordao, 123",
        ) = CustomerDto(
            firstName = firstName,
            lastName = lastName,
            cpf = cpf,
            email = email,
            income = income,
            password = password,
            zipCode = zipCode,
            street = street,
        )
    }

    @BeforeEach
    fun setup() = creditRepository.deleteAll()

    @AfterEach
    fun tearDown() = creditRepository.deleteAll()

    @Test
    fun `should create a credit and return 201 status`() {
        //given
        customerRepository.save(builderCustomerDto().toEntity())
        val creditDto: CreditDto = buildCredit()
        val valueAsString: String = objectMapper.writeValueAsString(creditDto)
        //then
        mockMvc.perform(
            MockMvcRequestBuilders.post(URL)
                .contentType(MediaType.APPLICATION_JSON)
                .content(valueAsString)
        )
            .andExpect(MockMvcResultMatchers.status().isCreated)
            .andExpect(MockMvcResultMatchers.jsonPath("$.creditValue").value(20000.00))
            .andExpect(MockMvcResultMatchers.jsonPath("$.dayFirstOfInstallment").value(LocalDate.now().plusMonths(2L)))
            .andExpect(MockMvcResultMatchers.jsonPath("$.numberOfInstallments").value(15))
            .andExpect(MockMvcResultMatchers.jsonPath("$.customerId").value(1))
            .andDo(MockMvcResultHandlers.print())
    }

}