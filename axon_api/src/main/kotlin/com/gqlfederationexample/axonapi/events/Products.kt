package com.gqlfederationexample.axonapi.events

data class ProductCreatedEvent(val name: String, val ean: String, val unitWeight: Double, val unitPrice: Double)