package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zgu extends zgx {
    public static final xze n = xze.g("Bugle", "BugleActionBarActivity");
    public aksr A;
    public armf B;
    private long C;
    private ActionMode D;
    private ActionMode.Callback E;
    public zgt o;
    public Menu p;
    boolean q;
    boolean r;
    public armf s;
    public armf x;
    public armf y;
    public armf z;

    public boolean G() {
        return false;
    }

    public boolean M() {
        return false;
    }

    public final ActionMode.Callback O() {
        if (G()) {
            return this.E;
        }
        zgt zgtVar = this.o;
        if (zgtVar == null) {
            return null;
        }
        return zgtVar.c;
    }

    public final Optional R() {
        Object obj;
        if (G()) {
            obj = this.D;
        } else {
            obj = this.o;
        }
        return Optional.ofNullable(obj);
    }

    public void S() {
        if (G()) {
            ActionMode actionMode = this.D;
            if (actionMode != null) {
                actionMode.finish();
                this.D = null;
                this.E = null;
                m();
                return;
            }
            return;
        }
        zgt zgtVar = this.o;
        if (zgtVar != null) {
            zgtVar.finish();
            this.o = null;
            U();
        }
    }

    public void T(Exception exc) {
        n.m("Bad custom theme detected");
        setTheme(R.style.FallbackAppCompatTheme);
        if (this.q) {
            zas.f(this);
        }
        this.r = true;
    }

    public final void U() {
        Menu menu;
        en j = j();
        if (j != null && this.D == null) {
            zgt zgtVar = this.o;
            if (zgtVar != null) {
                Menu menu2 = zgtVar.d.p;
                if (menu2 != null) {
                    menu2.clear();
                }
                j.setDisplayOptions(4);
                j.setHomeActionContentDescription(zgtVar.d.getResources().getString(R.string.action_close));
                CharSequence charSequence = zgtVar.a;
                if (charSequence != null) {
                    j.setTitle(charSequence);
                    j.setDisplayShowTitleEnabled(true);
                } else {
                    j.setDisplayShowTitleEnabled(false);
                }
                j.setDisplayShowCustomEnabled(false);
                ActionMode.Callback callback = zgtVar.c;
                if (callback != null && (menu = zgtVar.d.p) != null) {
                    callback.onCreateActionMode(zgtVar, menu);
                    zgtVar.c.onPrepareActionMode(zgtVar, zgtVar.d.p);
                }
                j.setBackgroundDrawable(new ColorDrawable(ahnz.f(zgtVar.d, R.attr.colorPrimaryBackground, "BugleActionBarActivity")));
                j.setHomeAsUpIndicator(R.drawable.tinted_quantum_ic_clear_24);
                zgtVar.d.X(8);
                j.show();
                return;
            }
            fa(j);
        }
    }

    public final void V() {
        akrh e = aktp.e("BugleActionBarActivity requestReceiveWapPushPermissionIfNeeded");
        try {
            if (((xbf) this.x.b()).a.get() && !((yjf) this.y.b()).j()) {
                n.l("WAP Push SI enabled but no permission to receive. Requesting.");
                ((yjl) this.u.b()).d(new zgs(this, 0));
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void W(ActionMode.Callback callback, View view, String str) {
        if (G()) {
            this.D = startActionMode(callback);
            this.E = callback;
            Menu menu = this.p;
            if (menu != null) {
                menu.clear();
                return;
            }
            return;
        }
        zgt zgtVar = new zgt(this, callback);
        this.o = zgtVar;
        zgtVar.b = view;
        zgtVar.a = str;
        m();
        U();
    }

    public final void X(int i) {
        View findViewById = findViewById(R.id.lockup);
        if (findViewById != null) {
            findViewById.setVisibility(i);
        }
    }

    public final boolean Y() {
        if (!G()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void fa(en enVar) {
        enVar.setHomeAsUpIndicator((Drawable) null);
        X(0);
    }

    @Override // defpackage.ex
    public final en j() {
        try {
            return super.j();
        } catch (IllegalStateException e) {
            T(e);
            return super.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zgr, defpackage.zgw, defpackage.aitz, defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.q = false;
        super.onCreate(bundle);
        xyo a = n.a();
        a.H(getLocalClassName());
        a.H(".onCreate");
        a.q();
        N().c((enl) this.z.b());
    }

    @Override // defpackage.aitz, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.p = menu;
        zgt zgtVar = this.o;
        if (zgtVar != null && zgtVar.c.onCreateActionMode(zgtVar, menu)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.aitz, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        zgt zgtVar = this.o;
        if (zgtVar != null && zgtVar.c.onActionItemClicked(zgtVar, menuItem)) {
            return true;
        }
        if (menuItem.getItemId() == 16908332 && this.o != null) {
            S();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zgr, defpackage.aitz, defpackage.cj, android.app.Activity
    public void onPause() {
        super.onPause();
        xyo a = n.a();
        a.H(getLocalClassName());
        a.H(".onPause");
        a.q();
        ((zas) this.B.b()).e(this.t.f().toEpochMilli() - this.C);
    }

    @Override // defpackage.aitz, android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        this.p = menu;
        zgt zgtVar = this.o;
        if (zgtVar != null && zgtVar.c.onPrepareActionMode(zgtVar, menu)) {
            return true;
        }
        return super.onPrepareOptionsMenu(menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zgr, android.app.Activity
    public void onRestart() {
        akrc b = this.A.b("BugleActionBarActivity onRestart");
        try {
            xyo a = n.a();
            a.H(getLocalClassName());
            a.H(".onRestart");
            a.q();
            super.onRestart();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zgr, defpackage.aitz, defpackage.cj, android.app.Activity
    public void onResume() {
        this.q = true;
        super.onResume();
        xyo a = n.a();
        a.H(getLocalClassName());
        a.H(".onResume");
        a.q();
        if (this.r) {
            zas.f(this);
            return;
        }
        this.C = this.t.f().toEpochMilli();
        if (!M()) {
            V();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zgr, defpackage.aitz, defpackage.ex, defpackage.cj, android.app.Activity
    public void onStart() {
        super.onStart();
        xyo a = n.a();
        a.H(getLocalClassName());
        a.H(".onStart");
        a.q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zgr, defpackage.aitz, defpackage.ex, defpackage.cj, android.app.Activity
    public void onStop() {
        super.onStop();
        xyo a = n.a();
        a.H(getLocalClassName());
        a.H(".onStop");
        a.q();
    }

    @Override // defpackage.ex, defpackage.re, android.app.Activity
    public void setContentView(int i) {
        try {
            super.setContentView(i);
        } catch (IllegalStateException e) {
            T(e);
        }
    }

    @Override // android.app.Activity
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        en j = j();
        if (j != null) {
            j.setTitle(charSequence);
        }
    }
}
