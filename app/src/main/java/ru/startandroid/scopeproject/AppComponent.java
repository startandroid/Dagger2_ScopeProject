package ru.startandroid.scopeproject;

import javax.inject.Singleton;

import dagger.Component;
import ru.startandroid.scopeproject.api.ApiModule;
import ru.startandroid.scopeproject.login.LoginActivityComponent;
import ru.startandroid.scopeproject.mail.MailComponent;
import ru.startandroid.scopeproject.mail.MailModule;

@Singleton
@Component(modules = {ApiModule.class})
public interface AppComponent {

    LoginActivityComponent createLoginComponent();

    MailComponent createMailComponent(MailModule mailModule);
}
