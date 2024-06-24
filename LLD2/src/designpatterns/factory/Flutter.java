package designpatterns.factory;

public class Flutter {

    private SupportedPlatform supportedPlatform;

    public Flutter(SupportedPlatform supportedPlatform) {
        this.supportedPlatform = supportedPlatform;
    }

    public void setTheme() {
        System.out.println("Theme is being set");
    }

    public void setRefreshRate() {
        System.out.println("Refresh Rate is being set");
    }

    public UIFactory getFactory() {
        return UIFactoryFactory.getUIFactory(supportedPlatform);
    }
}
