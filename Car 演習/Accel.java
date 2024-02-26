//神田　香織
public class Accel {

    private int push=0;

    public Accel() {
    }

    public void movePush(int d_push, Tire t) {
        this.push = getPush() + d_push;
        if (15 < this.push) {
            this.push = 15;
        }
        if (0 > this.push) {
            this.push = 0;
        }
        t.changeSpeed((12*(getPush())- t.getSpeed())/18);
    }

    public void resetPush(Tire t) {
     this.push=0;
     t.changeSpeed((12*(this.push)- t.getSpeed())/18);
    }
    public void fullPush(Tire t) {
        this.push=15;
        t.changeSpeed((12*(this.push)- t.getSpeed())/18);

    }

    public int getPush() {
        return push;
    }

    public void renewSpeed(Tire t) {
        t.changeSpeed((12*(this.push)- t.getSpeed())/18);

    }

}
