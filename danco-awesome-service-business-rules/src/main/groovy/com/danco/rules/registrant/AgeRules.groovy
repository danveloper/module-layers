package com.danco.rules.registrant

class AgeRules {

    /**
     * This business rule dictates that registrants for DanCo's Awesome Service must be over 18 years of Age.
     *
     * @param registrantCommand
     * @return
     */
    def overEighteenRule(registrantCommand) {
        if ((new Date().year - registrantCommand?.registrant?.dateOfBirth.year) >= 18) {
            registrantCommand?.isOver18 = true
        } else {
            registrantCommand?.isOver18 = false
        }
        registrantCommand
    }

    /**
     * Business rule that registrants must be under age 20 (DanCo's Awesome Service has a very specific target market).
     *
     * @param registrantCommand
     * @return
     */
    def underTwentyRule(registrantCommand) {
        if ((new Date().year - registrantCommand?.registrant?.dateOfBirth.year) < 20) {
            registrantCommand?.isUnder20 = true
        } else {
            registrantCommand?.isUnder20 = false
        }
        registrantCommand
    }
}
