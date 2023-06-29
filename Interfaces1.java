interface TvRemot{
void buttonOf();
}
interface SmartTvRemote extends TvRemot{

    void buttonOfT();
}
class Overriding implements SmartTvRemote{

    @Override
    public void buttonOf() {
        System.out.println("i am a button Of");
    }

    @Override
    public void buttonOfT() {
        System.out.println("I am a button of t");
    }
}

public class Interfaces1 {
    public static void main(String[] args) {
        SmartTvRemote srt=new Overriding();
        srt.buttonOfT();
        srt.buttonOf();
    }
}
