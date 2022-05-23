public class FireMario implements IState {
    private static FireMario instance = new FireMario();

    private FireMario() {
    }

    public static FireMario GetInstance() {
        return instance;
    }

    public void GotMushroom(Mario mario) {
        System.out.println("Got Mushroom!");
        mario.GotCoins(100);
    }

    public void GotFireFlower(Mario mario) {
        System.out.println("Got FireFlower!");
        mario.GotCoins(200);
    }

    public void GotFeather(Mario mario) {
        System.out.println("Got Feather!");
        mario.setState(CapeMario.GetInstance());
        mario.GotCoins(300);
    }

    public void MetMonster(Mario mario) {
        System.out.println("Met Monster!");
        mario.setState(SmallMario.GetInstance());
    }
}
