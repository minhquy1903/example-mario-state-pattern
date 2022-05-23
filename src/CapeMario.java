public class CapeMario implements IState {
    private static CapeMario instance = new CapeMario();

    private CapeMario() {
    }

    public static CapeMario GetInstance() {
        return instance;
    }

    public void GotMushroom(Mario mario) {
        System.out.println("Got Mushroom!");
        mario.GotCoins(100);
    }

    public void GotFireFlower(Mario mario) {
        System.out.println("Got FireFlower!");
        mario.setState(FireMario.GetInstance());
        mario.GotCoins(200);
    }

    public void GotFeather(Mario mario) {
        System.out.println("Got Feather!");
        mario.GotCoins(300);
    }

    public void MetMonster(Mario mario) {
        System.out.println("Met Monster!");
        mario.setState(SmallMario.GetInstance());
    }
}
