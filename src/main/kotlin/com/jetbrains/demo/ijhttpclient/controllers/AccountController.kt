package com.jetbrains.demo.ijhttpclient.controllers

import com.jetbrains.demo.ijhttpclient.models.Account
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/account")
class AccountController {

    @PostMapping("/{id}")
    fun show(
        @PathVariable id: Int,
        @RequestBody account: Account
    ): Account {
        return account
    }
}
