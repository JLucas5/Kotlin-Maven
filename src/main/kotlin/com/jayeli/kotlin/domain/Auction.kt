package com.jayeli.kotlin.domain

class Auction(val description: String) {

    val bids = mutableListOf<Bid>()

    fun offer( bid: Bid){
        bids.add(bid)
    }
}