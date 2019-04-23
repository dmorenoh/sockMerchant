package com.myapps.sockmerchant

class SocksMerchantOperator {
    fun sockMerchant(socks: List<Int>): Int {
//        return socks
//                .groupingBy { it }
//                .eachCount()
//                .filter { it.value > 1 }
//                .mapValues { it.value.div(2) }.values.sum()
        return socks
                .groupBy { it }.values.sumBy { it.size.div(2) }
    }
}