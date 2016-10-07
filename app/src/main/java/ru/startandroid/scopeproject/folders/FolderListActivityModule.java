package ru.startandroid.scopeproject.folders;


import dagger.Module;
import dagger.Provides;
import ru.startandroid.scopeproject.ActivityScope;
import ru.startandroid.scopeproject.mail.MailManager;

@Module
public class FolderListActivityModule {

    @ActivityScope
    @Provides
    public FolderListActivityPresenter provideFoldersListActivityPresenter(MailManager mailManager) {
        return new FolderListActivityPresenter(mailManager);
    }
}
