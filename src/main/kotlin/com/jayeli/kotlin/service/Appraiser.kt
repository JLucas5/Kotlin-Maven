package com.jayeli.kotlin.service

import com.jayeli.kotlin.domain.Auction

class Appraiser {


    var biggestOfAll = Double.NEGATIVE_INFINITY
    var lowestOfAll  = Double.POSITIVE_INFINITY

    fun appraise(auction: Auction){
        for ( bid in auction.bids){
            if (bid.value > biggestOfAll){
                biggestOfAll = bid.value
            }
            if (bid.value < lowestOfAll){
                lowestOfAll = bid.value
            }
        }
    }


}