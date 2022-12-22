package com.example.testProject.data.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "accounts")
class AccountsEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    val id: Long = 0,

    @Enumerated(EnumType.STRING)
    @Column(name = "currency", nullable = false)
    val currency: Currency,

    @Column(name = "participant_id", nullable = false)
    val participantId: Int
)