package ru.startandroid.scopeproject.folders;

import dagger.Subcomponent;
import ru.startandroid.scopeproject.ActivityScope;

@ActivityScope
@Subcomponent(modules = FolderListActivityModule.class)
public interface FolderListActivityComponent {

    void injectFoldersListActivity(FolderListActivity activity);

}
