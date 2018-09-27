package com.jayeli.kotlin.test

import com.jayeli.kotlin.domain.Auction
import com.jayeli.kotlin.domain.Bid
import com.jayeli.kotlin.domain.User
import com.jayeli.kotlin.service.Appraiser

fun main(args: Array<String>) {

    val joao = User("João")
    val jose = User("José")
    val maria = User("Maria")


    var auction = Auction("Playstation 3 novo")


    auction.offer(Bid(joao,300.03))
    auction.offer(Bid(maria,666.66))
    auction.offer(Bid(jose,420.69))

    val appraiser = Appraiser()
    appraiser.appraise(auction)

    println(appraiser.bigestOfAll)

}