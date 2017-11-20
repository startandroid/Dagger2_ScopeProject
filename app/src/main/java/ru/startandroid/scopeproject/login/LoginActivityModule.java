package ru.startandroid.scopeproject.login;

import dagger.Module;
import dagger.Provides;
import ru.startandroid.scopeproject.ActivityScope;
import ru.startandroid.scopeproject.account.AccountManager;
import ru.startandroid.scopeproject.api.ApiService;

@Module
public class LoginActivityModule {

    @ActivityScope
    @Provides
    AccountManager provideAccountManager(ApiService apiService) {
        return new AccountManager(apiService);
    }

    @ActivityScope
    @Provides
    LoginActivityPresenter provideLoginActivityPresenter(AccountManager accountManager) {
        return new LoginActivityPresenter(accountManager);
    }
}
