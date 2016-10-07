package ru.startandroid.scopeproject.login;

import dagger.Subcomponent;
import ru.startandroid.scopeproject.ActivityScope;

@ActivityScope
@Subcomponent(modules = LoginActivityModule.class)
public interface LoginActivityComponent {

    void injectLoginActivity(LoginActivity activity);

}
