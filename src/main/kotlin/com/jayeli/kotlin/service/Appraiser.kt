package com.jayeli.kotlin.service

import com.jayeli.kotlin.domain.Auction

class Appraiser {


    var bigestOfAll = Double.NEGATIVE_INFINITY

    fun appraise(auction: Auction){
        for ( bid in auction.bids){
            if (bid.value >= bigestOfAll){
                bigestOfAll = bid.value
            }
        }
    }


}