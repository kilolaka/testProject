package com.example.testProject.data.repository

import com.example.testProject.data.entity.AccountsEntity
import org.springframework.data.jpa.repository.JpaRepository

interface AccountsRepository: JpaRepository<AccountsEntity, Long>