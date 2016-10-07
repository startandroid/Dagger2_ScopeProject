package ru.startandroid.scopeproject;

import android.app.Application;

import ru.startandroid.scopeproject.datatype.Account;
import ru.startandroid.scopeproject.mail.MailComponent;
import ru.startandroid.scopeproject.mail.MailModule;

public class App extends Application {

    private static App instance;

    private AppComponent appComponent;
    private MailComponent mailComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        appComponent = DaggerAppComponent.create();
    }

    public static App getInstance() {
        return instance;
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public void createMailComponent(Account account) {
        mailComponent = appComponent.createMailComponent(new MailModule(account));
    }

    public MailComponent getMailComponent() {
        return mailComponent;
    }

    public void releaseMailComponent() {
        mailComponent = null;
    }
}
