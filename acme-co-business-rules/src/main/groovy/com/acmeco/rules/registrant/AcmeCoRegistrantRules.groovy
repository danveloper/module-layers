package com.acmeco.rules.registrant

/**
 * Regsitrant business rules for AcmeCo's Awesome Service
 */
class AcmeCoRegistrantRules {
    /**
     * AcmeCo's Awesome Service doesn't care if you're over 18 or not
     *
     * @param registrantCommand
     * @return
     */
    def overEighteenRule(registrantCommand) {
        registrantCommand.isOver18 = true
        registrantCommand
    }

    /**
     * AcmeCo business rule preventing Rod Johnson from registering.
     *
     * @param registrantCommand
     * @return
     */
    def springRodChecker(registrantCommand) {
        if (registrantCommand?.registrant?.firstName?.toLowerCase() == "rod" && registrantCommand?.registrant?.lastName?.toLowerCase() == "johnson") {
            registrantCommand.errors << "Sorry, Rod... You must come back to SpringSource to register!"
        }
        registrantCommand
    }
}
