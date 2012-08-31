import com.danveloper.model.Registrant
import com.danveloper.controllers.RegistrantController

class BootStrap {

    def init = { servletContext ->
        // Make a 19-yr-old Dan Woods (for DanCo's Awesome Service)
        RegistrantController.danWoodsRegistrantInstance = new Registrant(firstName: "Dan", lastName: "Woods", dateOfBirth: new Date(new Date().year - 19, 1, 1))

        // Create our Rod Johnson registrant (for AcmeCo's Awesome Service)
        RegistrantController.springRodRegistrantInstance = new Registrant(firstName: "Rod", lastName: "Johnson", dateOfBirth: new Date(70, 1, 1))
    }
    def destroy = {
    }
}
