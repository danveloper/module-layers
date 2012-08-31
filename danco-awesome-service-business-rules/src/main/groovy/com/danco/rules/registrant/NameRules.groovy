package com.danco.rules.registrant

/**
 * Business rules for DanCo's Awesome Service centered around the registrant's name
 */
class NameRules {
    /**
     * A business rule of DanCo's Awesome Service is that people with the first name "Dan" cannot register.
     *
     * @param registrantCommand
     * @return
     */
    def firstNameExclusion(registrantCommand) {
        if (registrantCommand?.registrant?.firstName?.toLowerCase() == "dan") {
            registrantCommand.errors << "Dan's cannot register for this service. Smell ya later."
        }
        registrantCommand
    }

    /**
     * DanCo excludes members of the Woods family from registering for the service.
     *
     * @param registrantCommand
     * @return
     */
    def lastNameExclusion(registrantCommand) {
        if (registrantCommand?.registrant?.lastName?.toLowerCase() == "woods") {
            registrantCommand.errors << "Sorry, the Woods family is not eligible to use DanCo Awesome Service."
        }
        registrantCommand
    }
}
