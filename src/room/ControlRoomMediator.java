package room;

import helpservice.AbstractHelpService;

/**
 * @author Zahir Ekrem SARITEKE
 * @project mediator-design-pattern
 * @created 17 September Tuesday 2024 - 13:58
 */
public interface ControlRoomMediator {
    void callHelpService(String helpServiceName, String address, String message, AbstractHelpService helpService);
    void addHelpService(AbstractHelpService helpService);
    void printHelpServiceList();
}
