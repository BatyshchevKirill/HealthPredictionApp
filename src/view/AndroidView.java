package view;

import view.pages.DefaultPage;
import view.pages.Page;

import java.util.Scanner;

public class AndroidView implements View {
    private Page currentPage = new DefaultPage();
    private static final Scanner console = new Scanner(System.in);

    public AndroidView() {
        Page.setView(this);
    }

    @Override
    public void update() {
        currentPage.draw();
        chooseState();
    }

    public void changeState(Page newPage) {
        currentPage = newPage;
    }

    private void chooseState() {
        System.out.println("Choose the window: [type number of the window]");
        System.out.println("""
                1. Back
                2. Analysis
                3. Admin
                4. Doctors
                5. Feedback
                6. Settings
                7. Exit
                """);

        var line = console.nextLine();

        switch (line) {
            case "1" -> currentPage.goToBack();
            case "2" -> currentPage.goToAnalysis();
            case "3" -> currentPage.goToAdmin();
            case "4" -> currentPage.goToDoctor();
            case "5" -> currentPage.goToFeedback();
            case "6" -> currentPage.goToSettings();
            case "7" -> System.exit(0);
            default -> {
                System.out.println("Incorrect input. Try again");
                chooseState();
            }
        }
    }
}
