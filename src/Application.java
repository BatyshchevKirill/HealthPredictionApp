import view.AndroidView;
import view.View;

public class Application {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(((t, e) -> System.out.println(e.getMessage())));

        View view = new AndroidView();

        while (!Thread.currentThread().isInterrupted())
            view.update();
    }
}
