package view.pages;

import view.AndroidView;

public abstract class Page {
    protected static AndroidView view;

    public static void setView(AndroidView view) {
        Page.view = view;
    }

    public abstract void goToBack();

    public abstract void goToAdmin();

    public abstract void goToDoctor();

    public abstract void goToFeedback();

    public abstract void goToSettings();

    public abstract void goToAnalysis();

    public abstract void draw();
}
