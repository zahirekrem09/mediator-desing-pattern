import helpservice.Ambulance;
import helpservice.FireEngine;
import helpservice.Police;
import room.ControlRoom;

/**
 * @author Zahir Ekrem SARITEKE
 * @project Default (Template) Project
 * @created 17 September Tuesday 2024 - 13:54
 */
public class Main {
    public static void main(String[] args) {


        ControlRoom controlRoom = new ControlRoom("CR-101");

        Ambulance ambulance = new Ambulance(controlRoom, "A-101");
        Police police = new Police(controlRoom, "P-101");
        FireEngine fireEngine = new FireEngine(controlRoom, "F-101");

        // print help service list
        controlRoom.printHelpServiceList();

        // call Ambulance
        System.out.println("\n(( ambulance voert roepOp methode uit ))");
        ambulance.callHelpService(ambulance.getClass().getName(), " XXx Address  ", "ZZz Message");

        // call police
        System.out.println("\n(( police voert roepOp methode uit ))");
        police.callHelpService(police.getClass().getName(), "YYy  Address ", "ZZz Message");

        // call fire engine
        System.out.println("\n(( fireEngine voert roepOp methode uit ))");
        fireEngine.callHelpService(fireEngine.getClass().getName(), "ZZz Address ", "ZZz Message");

    }
}