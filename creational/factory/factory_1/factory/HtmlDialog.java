package Design_Patterns.creational.factory.factory_1.factory;

import Design_Patterns.creational.factory.factory_1.buttons.Button;
import Design_Patterns.creational.factory.factory_1.buttons.HtmlButtom;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButtom();
    }
}
