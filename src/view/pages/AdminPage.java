package view.pages;

public class AdminPage extends DefaultPage {

    @Override
    public void draw() {
        System.out.println(getClass().getSimpleName());
    }

    @Override
    public void goToDoctor() {
        view.changeState(new ManageDoctorsPage());
    }

    @Override
    public void goToFeedback() {
        view.changeState(new ManageFeedbackPage());
    }

    @Override
    public void goToAnalysis() {
        view.changeState(new ManageDatasetPage());
    }
}
