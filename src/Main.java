import Presenter.Presenter;
import View.UI;
import impl.operations.ComplexOP1;


public class Main {
    public static void main(String[] args) {
        Presenter presenter = new Presenter(new UI(), new ComplexOP1());
        presenter.run();
    }
}