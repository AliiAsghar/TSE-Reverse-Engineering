package defpackage;

import android.app.Fragment;
import android.app.assist.AssistContent;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aitz extends ex {
    protected final aisv X = new aisv();
    private int fd;

    private final void y() {
        this.fd--;
    }

    private final void z() {
        int i = this.fd;
        this.fd = i + 1;
        if (i == 0) {
            this.X.x();
        }
    }

    @Override // defpackage.ex, defpackage.dx, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.X.m() && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.app.Activity
    public void finish() {
        this.X.a();
        super.finish();
    }

    @Override // android.app.Activity
    public final void finishAfterTransition() {
        this.X.b();
        super.finishAfterTransition();
    }

    @Override // defpackage.ex, defpackage.ey
    public final void gP() {
        int i = 0;
        while (true) {
            aisv aisvVar = this.X;
            if (i < aisvVar.a.size()) {
                aitx aitxVar = (aitx) aisvVar.a.get(i);
                if (aitxVar instanceof aiug) {
                    ((aiug) aitxVar).a();
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.cj
    public void h(cg cgVar) {
        this.X.o();
    }

    @Override // defpackage.ex, defpackage.ey
    public final void l(hm hmVar) {
        if (hmVar != null) {
            int i = 0;
            while (true) {
                aisv aisvVar = this.X;
                if (i < aisvVar.a.size()) {
                    aitx aitxVar = (aitx) aisvVar.a.get(i);
                    if (aitxVar instanceof aiuf) {
                        ((aiuf) aitxVar).a();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onActivityReenter(int i, Intent intent) {
        this.X.n();
        super.onActivityReenter(i, intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cj, defpackage.re, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.X.K();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.X.c();
        super.onAttachedToWindow();
    }

    @Override // defpackage.re, android.app.Activity
    public void onBackPressed() {
        if (!this.X.l()) {
            super.onBackPressed();
        }
    }

    @Override // defpackage.ex, defpackage.re, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.X.L();
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public final boolean onContextItemSelected(MenuItem menuItem) {
        if (!this.X.M() && !super.onContextItemSelected(menuItem)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.X.y(bundle);
        super.onCreate(bundle);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.X.N();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!this.X.O() && !super.onCreateOptionsMenu(menu)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ex, defpackage.cj, android.app.Activity
    public void onDestroy() {
        this.X.d();
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.X.e();
        super.onDetachedFromWindow();
    }

    @Override // android.app.Activity
    public void onGetDirectActions(CancellationSignal cancellationSignal, Consumer consumer) {
        this.X.p(consumer);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!this.X.q() && !super.onKeyDown(i, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.X.r() && !super.onKeyUp(i, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.X.z();
        super.onLowMemory();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.re, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.X.s();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!this.X.P() && !super.onOptionsItemSelected(menuItem)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cj, android.app.Activity
    public void onPause() {
        this.X.f();
        super.onPause();
    }

    @Override // android.app.Activity
    public void onPerformDirectAction(String str, Bundle bundle, CancellationSignal cancellationSignal, Consumer consumer) {
        this.X.t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ex, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        this.X.g(bundle);
        super.onPostCreate(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ex, defpackage.cj, android.app.Activity
    public void onPostResume() {
        this.X.h();
        super.onPostResume();
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        if (!this.X.Q() && !super.onPrepareOptionsMenu(menu)) {
            return false;
        }
        return true;
    }

    @Override // android.app.Activity
    public void onProvideAssistContent(AssistContent assistContent) {
        this.X.u();
        super.onProvideAssistContent(assistContent);
    }

    @Override // android.app.Activity
    public final void onProvideAssistData(Bundle bundle) {
        this.X.v();
        super.onProvideAssistData(bundle);
    }

    @Override // defpackage.cj, defpackage.re, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.X.R();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected final void onRestoreInstanceState(Bundle bundle) {
        this.X.i(bundle);
        super.onRestoreInstanceState(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cj, android.app.Activity
    public void onResume() {
        ahmc.al(a());
        this.X.A();
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.re, defpackage.dx, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.X.B(bundle);
        super.onSaveInstanceState(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ex, defpackage.cj, android.app.Activity
    public void onStart() {
        ahmc.al(a());
        this.X.C();
        super.onStart();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ex, defpackage.cj, android.app.Activity
    public void onStop() {
        this.X.D();
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onTopResumedActivityChanged(boolean z) {
        this.X.E(z);
        super.onTopResumedActivityChanged(z);
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        this.X.j();
        super.onUserInteraction();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.re, android.app.Activity
    public final void onUserLeaveHint() {
        this.X.k();
        super.onUserLeaveHint();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        this.X.w();
        super.onWindowFocusChanged(z);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        z();
        super.startActivity(intent);
        y();
    }

    @Override // defpackage.re, android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        z();
        super.startActivityForResult(intent, i);
        y();
    }

    @Override // android.app.Activity
    public final void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        z();
        super.startActivityFromFragment(fragment, intent, i, bundle);
        y();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent, Bundle bundle) {
        z();
        super.startActivity(intent, bundle);
        y();
    }

    @Override // defpackage.re, android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        z();
        super.startActivityForResult(intent, i, bundle);
        y();
    }
}
