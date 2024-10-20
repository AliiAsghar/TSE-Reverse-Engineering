package defpackage;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.ActionMode;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zgv extends zgy {
    public Toolbar C;
    public armf D;
    public armf E;
    public cj F;

    private final void A(int i, int i2, int i3) {
        Drawable drawable;
        eZ().w(ColorStateList.valueOf(i));
        Toolbar eZ = eZ();
        eZ.l();
        ActionMenuView actionMenuView = eZ.a;
        actionMenuView.d();
        jo joVar = actionMenuView.c.g;
        if (joVar != null) {
            drawable = joVar.getDrawable();
        } else {
            drawable = null;
        }
        drawable.setTint(i2);
        getWindow().setStatusBarColor(i3);
    }

    public void I(Toolbar toolbar) {
        fo foVar = (fo) k();
        if (foVar.j instanceof Activity) {
            en b = foVar.b();
            if (!(b instanceof gb)) {
                foVar.p = null;
                if (b != null) {
                    b.onDestroy();
                }
                foVar.o = null;
                if (toolbar != null) {
                    fv fvVar = new fv(toolbar, foVar.y(), foVar.m);
                    foVar.o = fvVar;
                    foVar.m.d = fvVar.d;
                    if (!toolbar.x) {
                        toolbar.x = true;
                        toolbar.x();
                    }
                } else {
                    foVar.m.d = null;
                }
                foVar.f();
            } else {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
        }
        this.C = toolbar;
    }

    @Override // defpackage.zgu
    public final void S() {
        if (Y()) {
            A(yyb.bw(this, R.attr.colorControlNormal), ahnz.f(this, com.google.android.apps.messaging.R.attr.colorOnActionBar, "BugleToolbarActivity"), getColor(com.google.android.apps.messaging.R.color.color_primary_background_alpha96));
        }
        super.S();
    }

    @Override // defpackage.zgu
    public final void T(Exception exc) {
        xzb.i("Bugle", exc, "Bad custom theme detected");
        setTheme(com.google.android.apps.messaging.R.style.FallbackAppCompatToolbarTheme);
        if (this.q) {
            zas.f(this);
        }
        this.r = true;
    }

    @Override // defpackage.zgu
    public final void W(ActionMode.Callback callback, View view, String str) {
        if (Y()) {
            int f = ahnz.f(this, com.google.android.apps.messaging.R.attr.colorPrimaryBrandIcon, "BugleToolbarActivity");
            A(f, f, ahnz.f(this, com.google.android.apps.messaging.R.attr.colorPrimaryBackground, "BugleToolbarActivity"));
        }
        super.W(callback, view, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Toolbar eZ() {
        View findViewById = findViewById(com.google.android.apps.messaging.R.id.toolbar);
        if (findViewById == null) {
            Toolbar toolbar = this.C;
            if (toolbar != null) {
                return toolbar;
            }
            return null;
        }
        try {
            return (Toolbar) findViewById;
        } catch (ClassCastException unused) {
            xyl.c(String.valueOf(String.valueOf(getClass())).concat(" has a toolbar layout element that is not of type Toolbar"));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zgu, defpackage.zgr, defpackage.zgw, defpackage.aitz, defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = this.F.getIntent();
        if (intent != null && intent.getBooleanExtra("via_report_issue_notification", false)) {
            ((kor) this.E.b()).f(((luj) this.D.b()).e(intent, "report_issue_event_key", 4));
        }
    }

    @Override // defpackage.zgu, defpackage.ex, defpackage.re, android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        Toolbar eZ = eZ();
        this.C = eZ;
        I(eZ);
    }
}
