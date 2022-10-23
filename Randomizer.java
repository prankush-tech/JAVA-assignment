import java.util.Random;

class Randomizer {
    int secretNumber;
    Random random;

    Randomizer(int limit) {
        this.random = new Random();
        this.setSecretNumber(limit);
    }

    void setSecretNumber(int limit) {
        this.secretNumber = this.random.nextInt(limit);
    }

    int getSecretNumber() {
        return this.secretNumber;
    }
}