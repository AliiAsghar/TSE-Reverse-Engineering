package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class en {
    public boolean closeOptionsMenu() {
        return false;
    }

    public boolean collapseActionView() {
        throw null;
    }

    public void dispatchMenuVisibilityChanged(boolean z) {
        throw null;
    }

    public abstract View getCustomView();

    public abstract int getDisplayOptions();

    public Context getThemedContext() {
        throw null;
    }

    public abstract void hide();

    public boolean invalidateOptionsMenu() {
        return false;
    }

    public abstract boolean isShowing();

    public boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        throw null;
    }

    public boolean onMenuKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    public boolean openOptionsMenu() {
        return false;
    }

    public abstract void setBackgroundDrawable(Drawable drawable);

    public abstract void setCustomView(int i);

    public abstract void setCustomView(View view, el elVar);

    public void setDefaultDisplayHomeAsUpEnabled(boolean z) {
        throw null;
    }

    public abstract void setDisplayHomeAsUpEnabled(boolean z);

    public abstract void setDisplayOptions(int i);

    public abstract void setDisplayShowCustomEnabled(boolean z);

    public abstract void setDisplayShowHomeEnabled(boolean z);

    public abstract void setDisplayShowTitleEnabled(boolean z);

    public void setElevation(float f) {
        throw null;
    }

    public void setHomeActionContentDescription(int i) {
        throw null;
    }

    public void setHomeAsUpIndicator(int i) {
        throw null;
    }

    public abstract void setLogo(Drawable drawable);

    public void setShowHideAnimationEnabled(boolean z) {
        throw null;
    }

    public abstract void setTitle(int i);

    public abstract void setTitle(CharSequence charSequence);

    public void setWindowTitle(CharSequence charSequence) {
        throw null;
    }

    public abstract void show();

    public hm startActionMode(hl hlVar) {
        return null;
    }

    public void setHomeActionContentDescription(CharSequence charSequence) {
        throw null;
    }

    public void setHomeAsUpIndicator(Drawable drawable) {
        throw null;
    }

    public void onDestroy() {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }
}
