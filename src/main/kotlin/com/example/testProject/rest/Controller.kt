package com.example.testProject.rest

import com.example.testProject.data.entity.AccountsEntity
import com.example.testProject.data.entity.Currency
import com.example.testProject.data.repository.AccountsRepository
import io.swagger.annotations.ApiModel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(
    private val accountsRepository: AccountsRepository
) {

    @GetMapping("v1/test")
    fun readAllAccounts(): List<AccountResponse> {
        return accountsRepository.findAll().map { it.toResponse() }
    }

    private fun AccountsEntity.toResponse(): AccountResponse {
        return AccountResponse(
            id = this.id,
            currency = this.currency
        )
    }

    @ApiModel
    data class AccountResponse(
        val id: Long,
        val currency: Currency
    )
}