package room;

import helpservice.AbstractHelpService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zahir Ekrem SARITEKE
 * @project mediator-design-pattern
 * @created 17 September Tuesday 2024 - 13:57
 */
public class ControlRoom implements ControlRoomMediator {

    private final List<AbstractHelpService> helpServiceList = new ArrayList<>();
    private final String code;

    public ControlRoom(String code) {
        this.code = code;
    }

    @Override
    public void callHelpService(String helpServiceName, String address, String message, AbstractHelpService abstractHelpService) {

        System.out.println(helpServiceName + " is calling to " + address + " with message: " + message + " from " + abstractHelpService.getName() );
        helpServiceList.forEach(helpService -> {
                if (helpService.toString().contains(helpServiceName) && helpService != abstractHelpService ) {
                helpService.answerHelpService();
            }
        });

    }

    @Override
    public void addHelpService(AbstractHelpService helpService) {
        helpServiceList.add(helpService);
    }

    @Override
    public void printHelpServiceList() {
        helpServiceList.forEach(helpService -> System.out.println(helpService.getName()));
    }

    @Override
    public String toString() {
        return "ControlRoom " + code;
    }
}
