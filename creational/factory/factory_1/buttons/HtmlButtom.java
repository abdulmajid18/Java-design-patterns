package Design_Patterns.creational.factory.factory_1.buttons;

/*
 * HTML button implementation
 */
public class HtmlButtom implements Button {
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
