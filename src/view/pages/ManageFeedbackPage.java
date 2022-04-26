package view.pages;

public class ManageFeedbackPage extends AdminPage {
    @Override
    public void draw() {
        System.out.println(getClass().getSimpleName());
    }

    @Override
    public void goToBack() {
        view.changeState(new AdminPage());
    }
}
