package helpservice;

import room.ControlRoom;

/**
 * @author Zahir Ekrem SARITEKE
 * @project mediator-design-pattern
 * @created 17 September Tuesday 2024 - 13:56
 */
public abstract class AbstractHelpService {
    protected String code;
    protected ControlRoom controlRoom;
    public AbstractHelpService(ControlRoom controlRoom) {
        this.controlRoom = controlRoom;
    }

    public abstract void callHelpService(String helpServiceQuestion, String address, String message);

    public abstract void answerHelpService();

    public abstract String getName();

}
