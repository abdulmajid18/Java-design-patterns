package Design_Patterns.creational.factory.factory_1.buttons;

/*
 * Windows button implementation
 */
public class WindowsButton implements Button {
    public void render() {
        System.out.println("Render the windows botton");
        onClick();
    }

    public void onClick() {
        System.out.println("Clicked!");
    }
}
