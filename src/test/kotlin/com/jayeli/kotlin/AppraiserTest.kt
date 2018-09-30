package com.jayeli.kotlin.test

import com.jayeli.kotlin.domain.Auction
import com.jayeli.kotlin.domain.Bid
import com.jayeli.kotlin.domain.User
import com.jayeli.kotlin.service.Appraiser
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals



class JunitTest {


    @Test
    fun testAppraisal() {

        val joao = User("João")
        val jose = User("José")
        val maria = User("Maria")

        val auction = Auction("Playstation 3 novo")

        auction.offer(Bid(joao, 300.03))
        auction.offer(Bid(jose, 420.69))
        auction.offer(Bid(maria, 666.66))

        val auctioneer = Appraiser()
        auctioneer.appraise(auction)

        val biggestExpected = 666.66
        val lowestExpected = 300.03

        assertEquals(666.66, auctioneer.biggestOfAll)
        assertEquals(300.03, auctioneer.lowestOfAll)


    }
}