package com.example.dagger_2.repository

interface CustomerSupportService {
    fun connectToCustomerCare(customerInfo: String, query: String)
}

class CustomerCallSupport : CustomerSupportService {
    override fun connectToCustomerCare(customerInfo: String, query: String) {
        println("LENSA CustomerCallSupport ")
    }
}

class CustomerChatSupport : CustomerSupportService {
    override fun connectToCustomerCare(customerInfo: String, query: String) {
        println("LENSA CustomerChatSupport ")
    }
}