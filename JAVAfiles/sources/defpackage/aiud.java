package defpackage;

import android.app.Fragment;
import android.app.assist.AssistContent;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aiud extends cj {
    protected final aisv n = new aisv();
    private int o;

    private final void j() {
        this.o--;
    }

    private final void k() {
        int i = this.o;
        this.o = i + 1;
        if (i == 0) {
            this.n.x();
        }
    }

    @Override // defpackage.dx, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.n.m() && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.app.Activity
    public void finish() {
        this.n.a();
        super.finish();
    }

    @Override // android.app.Activity
    public final void finishAfterTransition() {
        this.n.b();
        super.finishAfterTransition();
    }

    @Override // defpackage.cj
    public final void h(cg cgVar) {
        this.n.o();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        aisv aisvVar = this.n;
        for (int i = 0; i < aisvVar.a.size(); i++) {
            aitx aitxVar = (aitx) aisvVar.a.get(i);
            if (aitxVar instanceof airy) {
                ((airy) aitxVar).a();
            }
        }
        super.onActionModeFinished(actionMode);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        aisv aisvVar = this.n;
        for (int i = 0; i < aisvVar.a.size(); i++) {
            aitx aitxVar = (aitx) aisvVar.a.get(i);
            if (aitxVar instanceof airz) {
                ((airz) aitxVar).a();
            }
        }
        super.onActionModeStarted(actionMode);
    }

    @Override // android.app.Activity
    public final void onActivityReenter(int i, Intent intent) {
        this.n.n();
        super.onActivityReenter(i, intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cj, defpackage.re, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.n.K();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.n.c();
        super.onAttachedToWindow();
    }

    @Override // defpackage.re, android.app.Activity
    public void onBackPressed() {
        if (!this.n.l()) {
            super.onBackPressed();
        }
    }

    @Override // defpackage.re, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.n.L();
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public final boolean onContextItemSelected(MenuItem menuItem) {
        if (!this.n.M() && !super.onContextItemSelected(menuItem)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.n.y(bundle);
        super.onCreate(bundle);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.n.N();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (!this.n.O() && !super.onCreateOptionsMenu(menu)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cj, android.app.Activity
    public void onDestroy() {
        this.n.d();
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.n.e();
        super.onDetachedFromWindow();
    }

    @Override // android.app.Activity
    public final void onGetDirectActions(CancellationSignal cancellationSignal, Consumer consumer) {
        this.n.p(consumer);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!this.n.q() && !super.onKeyDown(i, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.n.r() && !super.onKeyUp(i, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.n.z();
        super.onLowMemory();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.re, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.n.s();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!this.n.P() && !super.onOptionsItemSelected(menuItem)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cj, android.app.Activity
    public void onPause() {
        this.n.f();
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onPerformDirectAction(String str, Bundle bundle, CancellationSignal cancellationSignal, Consumer consumer) {
        this.n.t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        this.n.g(bundle);
        super.onPostCreate(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cj, android.app.Activity
    public void onPostResume() {
        this.n.h();
        super.onPostResume();
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        if (!this.n.Q() && !super.onPrepareOptionsMenu(menu)) {
            return false;
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onProvideAssistContent(AssistContent assistContent) {
        this.n.u();
        super.onProvideAssistContent(assistContent);
    }

    @Override // android.app.Activity
    public final void onProvideAssistData(Bundle bundle) {
        this.n.v();
        super.onProvideAssistData(bundle);
    }

    @Override // defpackage.cj, defpackage.re, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.n.R();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected final void onRestoreInstanceState(Bundle bundle) {
        this.n.i(bundle);
        super.onRestoreInstanceState(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cj, android.app.Activity
    public void onResume() {
        ahmc.al(a());
        this.n.A();
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.re, defpackage.dx, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.n.B(bundle);
        super.onSaveInstanceState(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cj, android.app.Activity
    public void onStart() {
        ahmc.al(a());
        this.n.C();
        super.onStart();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cj, android.app.Activity
    public void onStop() {
        this.n.D();
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onTopResumedActivityChanged(boolean z) {
        this.n.E(z);
        super.onTopResumedActivityChanged(z);
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        this.n.j();
        super.onUserInteraction();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.re, android.app.Activity
    public final void onUserLeaveHint() {
        this.n.k();
        super.onUserLeaveHint();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.n.w();
        super.onWindowFocusChanged(z);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        k();
        super.startActivity(intent);
        j();
    }

    @Override // defpackage.re, android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        k();
        super.startActivityForResult(intent, i);
        j();
    }

    @Override // android.app.Activity
    public final void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        k();
        super.startActivityFromFragment(fragment, intent, i, bundle);
        j();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent, Bundle bundle) {
        k();
        super.startActivity(intent, bundle);
        j();
    }

    @Override // defpackage.re, android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        k();
        super.startActivityForResult(intent, i, bundle);
        j();
    }
}
