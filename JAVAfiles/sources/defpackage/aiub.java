package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
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
public class aiub extends bw {
    protected final aite ag = new aite();

    @Override // defpackage.cg
    public View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ag.g(bundle);
        return super.K(layoutInflater, viewGroup, bundle);
    }

    @Override // defpackage.cg
    public void W(Bundle bundle) {
        this.ag.a(bundle);
        super.W(bundle);
    }

    @Override // defpackage.cg
    public void X(int i, int i2, Intent intent) {
        super.X(i, i2, intent);
        this.ag.K();
    }

    @Override // defpackage.cg
    public void Y(Activity activity) {
        this.ag.j();
        super.Y(activity);
    }

    @Override // defpackage.cg
    public final void Z(Menu menu, MenuInflater menuInflater) {
        if (this.ag.O()) {
            am(true);
        }
    }

    @Override // defpackage.cg
    public boolean aC(MenuItem menuItem) {
        return this.ag.P();
    }

    @Override // defpackage.cg
    public final boolean aI() {
        if (!this.ag.M()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.cg
    public final void aJ() {
        this.ag.R();
    }

    @Override // defpackage.cg
    public void aa() {
        this.ag.d();
        super.aa();
    }

    @Override // defpackage.cg
    public void ad() {
        this.ag.f();
        super.ad();
    }

    @Override // defpackage.cg
    public final void ae(Menu menu) {
        if (this.ag.Q()) {
            am(true);
        }
    }

    @Override // defpackage.cg
    public void af() {
        ahmc.al(G());
        this.ag.A();
        super.af();
    }

    @Override // defpackage.cg
    public void ag(View view, Bundle bundle) {
        this.ag.k(bundle);
    }

    @Override // defpackage.cg
    public final void at(boolean z) {
        this.ag.h(z);
        super.at(z);
    }

    @Override // defpackage.bw
    public void d() {
        this.ag.e();
        super.d();
    }

    @Override // defpackage.bw, defpackage.cg
    public void g(Bundle bundle) {
        this.ag.y(bundle);
        super.g(bundle);
    }

    @Override // defpackage.bw, defpackage.cg
    public void h() {
        this.ag.b();
        super.h();
    }

    @Override // defpackage.bw, defpackage.cg
    public void i() {
        this.ag.c();
        super.i();
    }

    @Override // defpackage.bw, defpackage.cg
    public void j(Bundle bundle) {
        this.ag.B(bundle);
        super.j(bundle);
    }

    @Override // defpackage.bw, defpackage.cg
    public void k() {
        ahmc.al(G());
        this.ag.C();
        super.k();
    }

    @Override // defpackage.bw, defpackage.cg
    public void l() {
        this.ag.D();
        super.l();
    }

    @Override // defpackage.cg, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.ag.L();
        super.onConfigurationChanged(configuration);
    }

    @Override // defpackage.cg, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.ag.N();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // defpackage.bw, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.ag.e();
        super.onDismiss(dialogInterface);
    }

    @Override // defpackage.cg, android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.ag.z();
        super.onLowMemory();
    }
}
