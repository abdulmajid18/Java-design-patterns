package Design_Patterns.creational.factory.factory_1.factory;

import Design_Patterns.creational.factory.factory_1.buttons.Button;
import Design_Patterns.creational.factory.factory_1.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
