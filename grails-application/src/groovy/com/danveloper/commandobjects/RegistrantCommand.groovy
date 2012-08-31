package com.danveloper.commandobjects

import com.danveloper.model.Registrant

class RegistrantCommand {
    Registrant registrant

    Boolean isOver18
    Boolean isUnder20

    def errors = []
}
