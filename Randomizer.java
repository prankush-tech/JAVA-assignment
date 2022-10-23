import java.util.Random;
//randosmizer class to generate random number 
//number are also in a limited range
// limations allows user to set difficulty

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