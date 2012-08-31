package com.danveloper.controllers

import com.danveloper.commandobjects.RegistrantCommand
import grails.converters.JSON

class RegistrantController {
    def registrantWorkflow

    static def danWoodsRegistrantInstance
    static def springRodRegistrantInstance

    // Errors should display in this case, as well as under18 = true && over20 = false, when DanCo's rules are applied through the build script
    def showDanWithRules() {
        def registrantCommand = new RegistrantCommand(registrant: danWoodsRegistrantInstance)

        // Apply the business rules by pushing the registrant command through the registrant workflow
        def registrantCommandWithRules = registrantWorkflow.process(registrantCommand)

        render registrantCommandWithRules as JSON
    }

    // Rod Johnson specific error should display in this case, when AcmeCo's rules are applied through the build script
    def showRodWithRules() {
        def registrantCommand = new RegistrantCommand(registrant: springRodRegistrantInstance)

        // Apply the business rules by pushing the registrant command through the registrant workflow
        def registrantCommandWithRules = registrantWorkflow.process(registrantCommand)

        render registrantCommandWithRules as JSON
    }
}
