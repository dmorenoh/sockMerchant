package com.myapps.sockmerchant

import com.blogspot.toomuchcoding.spock.subjcollabs.Subject
import spock.lang.Specification

class SocksMerchantOperatorSpec extends Specification {
    @Subject
    SocksMerchantOperator socksMerchantOperator

    def "should return number of matching pairs"() {
        given: "a list of socks"
            def array = socks
        when: "calculates number of pairs"
            def pairs = socksMerchantOperator.sockMerchant(array)
        then: "return number of pairs"
            pairs == expected
        where:
            socks                                | expected
            [10, 20, 20, 10, 10, 30, 50, 10, 20] | 3
            [1, 2, 1, 2, 1, 3, 2]                | 2
    }
}
