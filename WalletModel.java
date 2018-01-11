import java.util.ArrayList;

public class WalletModel {
    private int totalCoolcoins;
    private int balance;
    private ArrayList<ArtifactModel> artifactCollection;

    public WalletModel(){
        this.totalCoolcoins = 0; //potrzebne potem do leveli
        this.balance = 0;
        this.artifactCollection = new ArrayList<ArtifactModel>();
    }

    public int getBalance() {
        return balance;
    }

    public int getTotalCoolcoins() {
        return totalCoolcoins;
    }

    public ArrayList<ArtifactModel> getArtifactCollection() {
        return artifactCollection;
    }
}

