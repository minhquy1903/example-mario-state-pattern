public class Mario {
    private int lifeCount;
    private int coinCount;
    private IState state;

    public Mario() {
        lifeCount = 1;
        coinCount = 0;

        state = SmallMario.GetInstance();
    }

    public int getLifeCount() {
        return lifeCount;
    }

    public void setLifeCount(int lifeCount) {
        this.lifeCount = lifeCount;
    }

    public int getCoinCount() {
        return coinCount;
    }

    public void setCoinCount(int coinCount) {
        this.coinCount = coinCount;
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public void GotMushroom() {
        state.GotMushroom(this);
    }

    public void GotFireFlower() {
        state.GotFireFlower(this);
    }

    public void GotFeather() {
        state.GotFeather(this);
    }

    public void MetMonster() {
        state.MetMonster(this);
    }

    public void GotCoins(int numberOfCoins) {
        System.out.println("Got " + numberOfCoins + " Coin(s)!");
        coinCount += numberOfCoins;
        if (coinCount >= 5000) {
            GotLife();
            coinCount -= 5000;
        }
    }

    public void GotLife() {
        System.out.println("Got Life!");
        lifeCount += 1;
    }

    public void LostLife() {
        System.out.println("Lost Life!");
        lifeCount -= 1;
        if (lifeCount <= 0)
            GameOver();
    }

    public void GameOver() {
        lifeCount = 0;
        coinCount = 0;
        System.out.println("Game Over!");
    }

    @Override
    public String toString() {
        return "State: " + state + " | LifeCount: " + lifeCount + " | CoinsCount: " + coinCount + " \n";
    }
}