package view.pages;

public class ManageUsersPage extends AdminPage {
    @Override
    public void draw() {
        System.out.println(getClass().getSimpleName());
    }

    @Override
    public void goToBack() {
        view.changeState(new AdminPage());
    }
}
