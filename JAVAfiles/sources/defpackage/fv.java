package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fv extends en {
    public final Window.Callback a;
    boolean b;
    public final qd c;
    public final qdq d;
    private boolean e;
    private boolean f;
    private final ArrayList g = new ArrayList();
    private final Runnable h = new bo(this, 10, null);
    private final pz i;

    public fv(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        kve kveVar = new kve(this, 1);
        this.i = kveVar;
        qd qdVar = new qd(toolbar, false);
        this.c = qdVar;
        dye.i(callback);
        this.a = callback;
        qdVar.e = callback;
        toolbar.s = kveVar;
        qdVar.n(charSequence);
        this.d = new qdq(this, null);
    }

    public final Menu a() {
        if (!this.e) {
            qd qdVar = this.c;
            fu fuVar = new fu(this);
            ju juVar = new ju(this, 1);
            Toolbar toolbar = qdVar.a;
            toolbar.v = fuVar;
            toolbar.w = juVar;
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView != null) {
                actionMenuView.f(fuVar, juVar);
            }
            this.e = true;
        }
        return this.c.a.f();
    }

    public final void b(int i, int i2) {
        qd qdVar = this.c;
        qdVar.e((i & i2) | (qdVar.b & (~i2)));
    }

    @Override // defpackage.en
    public final boolean closeOptionsMenu() {
        return this.c.p();
    }

    @Override // defpackage.en
    public final boolean collapseActionView() {
        if (this.c.o()) {
            this.c.b();
            return true;
        }
        return false;
    }

    @Override // defpackage.en
    public final void dispatchMenuVisibilityChanged(boolean z) {
        if (z != this.f) {
            this.f = z;
            int size = this.g.size();
            for (int i = 0; i < size; i++) {
                ((em) this.g.get(i)).a();
            }
        }
    }

    @Override // defpackage.en
    public final View getCustomView() {
        return this.c.c;
    }

    @Override // defpackage.en
    public final int getDisplayOptions() {
        return this.c.b;
    }

    @Override // defpackage.en
    public final Context getThemedContext() {
        return this.c.a();
    }

    @Override // defpackage.en
    public final void hide() {
        this.c.m(8);
    }

    @Override // defpackage.en
    public final boolean invalidateOptionsMenu() {
        this.c.a.removeCallbacks(this.h);
        Toolbar toolbar = this.c.a;
        int[] iArr = eek.a;
        toolbar.postOnAnimation(this.h);
        return true;
    }

    @Override // defpackage.en
    public final boolean isShowing() {
        if (this.c.a.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.en
    public final void onDestroy() {
        this.c.a.removeCallbacks(this.h);
    }

    @Override // defpackage.en
    public final boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        int i2;
        Menu a = a();
        if (a == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        boolean z = true;
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1) {
            z = false;
        }
        a.setQwertyMode(z);
        return a.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.en
    public final boolean onMenuKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            openOptionsMenu();
        }
        return true;
    }

    @Override // defpackage.en
    public final boolean openOptionsMenu() {
        return this.c.r();
    }

    @Override // defpackage.en
    public final void setBackgroundDrawable(Drawable drawable) {
        this.c.a.setBackground(drawable);
    }

    @Override // defpackage.en
    public final void setCustomView(int i) {
        setCustomView(LayoutInflater.from(this.c.a()).inflate(i, (ViewGroup) this.c.a, false), new el(-2, -2));
    }

    @Override // defpackage.en
    public final void setDisplayHomeAsUpEnabled(boolean z) {
        int i;
        if (true != z) {
            i = 0;
        } else {
            i = 4;
        }
        b(i, 4);
    }

    @Override // defpackage.en
    public final void setDisplayOptions(int i) {
        b(i, -1);
    }

    @Override // defpackage.en
    public final void setDisplayShowCustomEnabled(boolean z) {
        int i;
        if (true != z) {
            i = 0;
        } else {
            i = 16;
        }
        b(i, 16);
    }

    @Override // defpackage.en
    public final void setDisplayShowHomeEnabled(boolean z) {
        b(2, 2);
    }

    @Override // defpackage.en
    public final void setDisplayShowTitleEnabled(boolean z) {
        int i;
        if (true != z) {
            i = 0;
        } else {
            i = 8;
        }
        b(i, 8);
    }

    @Override // defpackage.en
    public final void setElevation(float f) {
        edz.j(this.c.a, brg.a);
    }

    @Override // defpackage.en
    public final void setHomeActionContentDescription(int i) {
        this.c.h(R.string.action_back);
    }

    @Override // defpackage.en
    public final void setHomeAsUpIndicator(int i) {
        this.c.j(i);
    }

    @Override // defpackage.en
    public final void setLogo(Drawable drawable) {
        this.c.f(null);
    }

    @Override // defpackage.en
    public final void setTitle(int i) {
        this.c.l(this.c.a().getText(i));
    }

    @Override // defpackage.en
    public final void setWindowTitle(CharSequence charSequence) {
        this.c.n(charSequence);
    }

    @Override // defpackage.en
    public final void show() {
        this.c.m(0);
    }

    @Override // defpackage.en
    public final void setHomeActionContentDescription(CharSequence charSequence) {
        this.c.i(charSequence);
    }

    @Override // defpackage.en
    public final void setHomeAsUpIndicator(Drawable drawable) {
        this.c.k(drawable);
    }

    @Override // defpackage.en
    public final void setTitle(CharSequence charSequence) {
        this.c.l(charSequence);
    }

    @Override // defpackage.en
    public final void setCustomView(View view, el elVar) {
        if (view != null) {
            view.setLayoutParams(elVar);
        }
        this.c.d(view);
    }

    @Override // defpackage.en
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // defpackage.en
    public final void setDefaultDisplayHomeAsUpEnabled(boolean z) {
    }

    @Override // defpackage.en
    public final void setShowHideAnimationEnabled(boolean z) {
    }
}
