package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ex extends cj implements ey {
    private fa fe;

    public ex() {
        aK().c("androidx:appcompat", new cp(this, 2));
        u(new ew(this, 0));
    }

    private final void fc() {
        dyx.d(getWindow().getDecorView(), this);
        dyy.o(getWindow().getDecorView(), this);
        gvf.bm(getWindow().getDecorView(), this);
        a.bT(getWindow().getDecorView(), this);
    }

    @Override // defpackage.re, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        fc();
        k().d(view, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
    
        if (r4 != null) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00aa, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b8, code lost:
    
        if (r4 == null) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0112  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ex.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        en j = j();
        if (getWindow().hasFeature(0)) {
            if (j == null || !j.closeOptionsMenu()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // defpackage.dx, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        en j = j();
        if (keyCode == 82 && j != null && j.onMenuKeyEvent(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        return k().c(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        Context context;
        fo foVar = (fo) k();
        if (foVar.p == null) {
            foVar.F();
            en enVar = foVar.o;
            if (enVar != null) {
                context = enVar.getThemedContext();
            } else {
                context = foVar.k;
            }
            foVar.p = new ht(context);
        }
        return foVar.p;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        k().f();
    }

    public en j() {
        return k().b();
    }

    public final fa k() {
        if (this.fe == null) {
            int i = fa.b;
            this.fe = new fo(this, null, this, this);
        }
        return this.fe;
    }

    public final void m() {
        k().f();
    }

    public boolean n() {
        Intent u = dxt.u(this);
        if (u == null) {
            return false;
        }
        if (shouldUpRecreateTask(u)) {
            dzx dzxVar = new dzx(this);
            Intent u2 = dxt.u(this);
            if (u2 == null) {
                u2 = dxt.u(this);
            }
            if (u2 != null) {
                ComponentName component = u2.getComponent();
                if (component == null) {
                    component = u2.resolveActivity(dzxVar.b.getPackageManager());
                }
                dzxVar.e(component);
                dzxVar.c(u2);
            }
            if (!dzxVar.a.isEmpty()) {
                Intent[] intentArr = (Intent[]) dzxVar.a.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                dzxVar.b.startActivities(intentArr, null);
                try {
                    finishAffinity();
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        navigateUpTo(u);
        return true;
    }

    @Override // defpackage.re, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        en b;
        super.onConfigurationChanged(configuration);
        fo foVar = (fo) k();
        if (foVar.z && foVar.w && (b = foVar.b()) != null) {
            b.onConfigurationChanged(configuration);
        }
        km.d().e(foVar.k);
        foVar.H = new Configuration(foVar.k.getResources().getConfiguration());
        foVar.Q(false, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cj, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        k().g();
    }

    @Override // defpackage.cj, defpackage.re, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        en j = j();
        if (menuItem.getItemId() == 16908332 && j != null && (j.getDisplayOptions() & 4) != 0) {
            return n();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((fo) k()).E();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cj, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        en b = ((fo) k()).b();
        if (b != null) {
            b.setShowHideAnimationEnabled(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cj, android.app.Activity
    public void onStart() {
        super.onStart();
        ((fo) k()).Q(true, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cj, android.app.Activity
    public void onStop() {
        super.onStop();
        k().h();
    }

    @Override // android.app.Activity
    protected final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        k().m(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        en j = j();
        if (getWindow().hasFeature(0)) {
            if (j == null || !j.openOptionsMenu()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // defpackage.re, android.app.Activity
    public void setContentView(int i) {
        fc();
        k().j(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((fo) k()).I = i;
    }

    @Override // defpackage.re, android.app.Activity
    public final void setContentView(View view) {
        fc();
        k().k(view);
    }

    @Override // defpackage.re, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        fc();
        k().l(view, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void gN() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void gO() {
    }

    public void gP() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    public void l(hm hmVar) {
    }
}
