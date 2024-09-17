package helpservice;

import room.ControlRoom;

/**
 * @author Zahir Ekrem SARITEKE
 * @project mediator-design-pattern
 * @created 17 September Tuesday 2024 - 14:18
 */

public class FireEngine extends AbstractHelpService {
    public FireEngine(ControlRoom controlRoom, String code) {
        super(controlRoom);
        this.code = code;
        controlRoom.addHelpService(this);
    }

    @Override
    public void callHelpService(String helpServiceQuestion, String address, String message) {
        controlRoom.callHelpService(helpServiceQuestion, address, message, this);
    }

    @Override
    public void answerHelpService() {
        System.out.printf("\n %s got the message! \n ", getName() );
    }

    @Override
    public String getName() {
        return "FireEngine "  + code;
    }
}