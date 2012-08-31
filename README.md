Module Layers
====

Introduction
----
The code presented in this project is the subject of the Sep '12 edition of my <a href="http://groovymag.com" target="_blank">Groovy Magazine</a> article on employing message driven architecture patterns in a Grails application using Spring Integration. This project represented the second installment of the article, which discusses introducing modularized business rules into the application workflow.

Technology
----
This project uses Gradle, Groovy, and Grails to demonstrate how to employ a message driven architecture in a Grails application. The Grails code is written against version 2.1.0.

What?
----
So, basically this projects demonstrates how to externalize your application's business rules by modularizing their logic and introducing them to an existing application workflow. You'll need to read the Sep '12 edition of <a href="http://groovymag.com" target="_blank">Groovy Magazine</a> to get the full scope of what's going on here, but the idea is simply to define the full scope of your web application, implement the functionality of the application, and then let domain specific business rules define how the application's workflow.

I've created two example companies to demonstrate the functionality in this project: DanCo and AcmeCo. DanCo and AcmeCo are services that both employ the Registrant functionality provided by the "grails-application" module. However, because the two companies have different requirements for who can register for their services, their domain-specific business rules must drive the functionality of the application. There are two modules in this project that demonstrate implementing different domain-specific business rules against the same application, without having to change the actual implemented code in the application.

Run
----
To demonstrate how DanCo's business rules are integrated into the Registrant workflow of the grails-application, run the grails application with the <code>company.instance</code> environment variable set to <code>danco</code>. To demonstrate how AcmeCo's business rules are integration, run the grails-application with the <code>company.instance</code> environment variable set to <code>acmeco</code>.

As such:

    module-layers/grails-application:$ GRADLE_OPTS="-Dcompany.instance=danco" gradle grails-run-app

License
----
Free for all. Hat-tip if referenced is always appreciated.

Contact
----
g: daniel.p.woods@gmail.com ; t: [@danveloper(http://twitter.com/danveloper)]
