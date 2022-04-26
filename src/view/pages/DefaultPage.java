package view.pages;

public class DefaultPage extends Page {
    @Override
    public void draw() {
        System.out.println(getClass().getSimpleName());
    }

    @Override
    public void goToBack() {
        view.changeState(new DefaultPage());
    }

    @Override
    public void goToAdmin() {
        view.changeState(new AdminPage());
    }

    @Override
    public void goToDoctor() {
        view.changeState(new DoctorPage());
    }

    @Override
    public void goToFeedback() {
        view.changeState(new FeedbackPage());
    }

    @Override
    public void goToSettings() {
        view.changeState(new SettingsPage());
    }

    @Override
    public void goToAnalysis() {
        view.changeState(new AnalysisPage());
    }
}
