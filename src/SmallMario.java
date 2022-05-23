public class SmallMario implements IState {
    private static SmallMario instance = new SmallMario();

    private SmallMario() {
    }

    public static SmallMario GetInstance() {
        return instance;
    }

    public void GotMushroom(Mario mario) {
        System.out.println("Got Mushroom!");
        mario.setState(SuperMario.GetInstance());
        mario.GotCoins(100);
    }

    public void GotFireFlower(Mario mario) {
        System.out.println("Got FireFlower!");
        mario.setState(FireMario.GetInstance());
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
        mario.LostLife();
    }
}