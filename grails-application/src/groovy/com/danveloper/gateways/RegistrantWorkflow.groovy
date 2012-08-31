package com.danveloper.gateways

import com.danveloper.commandobjects.RegistrantCommand

interface RegistrantWorkflow {
    public RegistrantCommand process(RegistrantCommand registrantCommand);

}