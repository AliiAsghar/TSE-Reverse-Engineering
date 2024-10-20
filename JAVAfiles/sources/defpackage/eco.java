package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eco {
    private static final String TAG = "ActionProvider(support)";
    private final Context mContext;
    private ecm mSubUiVisibilityListener;
    private ecn mVisibilityListener;

    public eco(Context context) {
        this.mContext = context;
    }

    public Context getContext() {
        return this.mContext;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isVisible() {
        return true;
    }

    public abstract View onCreateActionView();

    public View onCreateActionView(MenuItem menuItem) {
        return onCreateActionView();
    }

    public boolean onPerformDefaultAction() {
        return false;
    }

    public boolean overridesItemVisibility() {
        return false;
    }

    public void refreshVisibility() {
        if (this.mVisibilityListener != null && overridesItemVisibility()) {
            ecn ecnVar = this.mVisibilityListener;
            isVisible();
            ecnVar.a();
        }
    }

    public void reset() {
        this.mVisibilityListener = null;
        this.mSubUiVisibilityListener = null;
    }

    public void setSubUiVisibilityListener(ecm ecmVar) {
        this.mSubUiVisibilityListener = ecmVar;
    }

    public void setVisibilityListener(ecn ecnVar) {
        if (this.mVisibilityListener != null && ecnVar != null) {
            Log.w(TAG, "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.mVisibilityListener = ecnVar;
    }

    public void subUiVisibilityChanged(boolean z) {
        ecm ecmVar = this.mSubUiVisibilityListener;
        if (ecmVar != null) {
            ecmVar.j(z);
        }
    }

    public void onPrepareSubMenu(SubMenu subMenu) {
    }
}
