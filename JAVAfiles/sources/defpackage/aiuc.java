package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aiuc extends cg {
    protected final aite b = new aite();

    @Override // defpackage.cg
    public View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b.g(bundle);
        return super.K(layoutInflater, viewGroup, bundle);
    }

    @Override // defpackage.cg
    public void W(Bundle bundle) {
        this.b.a(bundle);
        super.W(bundle);
    }

    @Override // defpackage.cg
    public void X(int i, int i2, Intent intent) {
        super.X(i, i2, intent);
        this.b.K();
    }

    @Override // defpackage.cg
    public void Y(Activity activity) {
        this.b.j();
        super.Y(activity);
    }

    @Override // defpackage.cg
    public void Z(Menu menu, MenuInflater menuInflater) {
        if (this.b.O()) {
            am(true);
        }
    }

    @Override // defpackage.cg
    public boolean aC(MenuItem menuItem) {
        return this.b.P();
    }

    @Override // defpackage.cg
    public final boolean aI() {
        if (!this.b.M()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.cg
    public final void aJ() {
        this.b.R();
    }

    @Override // defpackage.cg
    public void aa() {
        this.b.d();
        super.aa();
    }

    @Override // defpackage.cg
    public void ad() {
        this.b.f();
        super.ad();
    }

    @Override // defpackage.cg
    public void ae(Menu menu) {
        if (this.b.Q()) {
            am(true);
        }
    }

    @Override // defpackage.cg
    public void af() {
        this.b.A();
        super.af();
    }

    @Override // defpackage.cg
    public void ag(View view, Bundle bundle) {
        this.b.k(bundle);
    }

    @Override // defpackage.cg
    public final void at(boolean z) {
        this.b.h(z);
        super.at(z);
    }

    @Override // defpackage.cg
    public void g(Bundle bundle) {
        this.b.y(bundle);
        super.g(bundle);
    }

    @Override // defpackage.cg
    public void h() {
        this.b.b();
        super.h();
    }

    @Override // defpackage.cg
    public void i() {
        this.b.c();
        super.i();
    }

    @Override // defpackage.cg
    public void j(Bundle bundle) {
        this.b.B(bundle);
    }

    @Override // defpackage.cg
    public void k() {
        this.b.C();
        super.k();
    }

    @Override // defpackage.cg
    public void l() {
        this.b.D();
        super.l();
    }

    @Override // defpackage.cg, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.b.L();
        super.onConfigurationChanged(configuration);
    }

    @Override // defpackage.cg, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.b.N();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // defpackage.cg, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.b.z();
        super.onLowMemory();
    }
}
