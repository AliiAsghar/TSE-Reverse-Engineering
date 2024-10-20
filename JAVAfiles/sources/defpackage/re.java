package defpackage;

import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class re extends dx implements enm, eoz, enb, gjz, ro, sc, eab, eac, dq, dr, edb {
    private final arml a;
    private final AtomicInteger b;
    private final CopyOnWriteArrayList c;
    private final CopyOnWriteArrayList d;
    private boolean e;
    private boolean ff;
    private final arml fg;
    private final arml fh;
    public final sb g;
    public final CopyOnWriteArrayList h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;
    public final CopyOnWriteArrayList k;
    public final rc l;
    private efu q;
    private final ico r;
    public final rs f = new rs();
    public final kkc m = new kkc(new ou(this, 8, null));

    public re() {
        ico bH = gvf.bH(this);
        this.r = bH;
        this.l = new rc(this);
        int i = 0;
        this.a = armd.a(new rd(this, 0));
        this.b = new AtomicInteger();
        this.g = new sb(this);
        this.c = new CopyOnWriteArrayList();
        this.h = new CopyOnWriteArrayList();
        this.i = new CopyOnWriteArrayList();
        this.j = new CopyOnWriteArrayList();
        this.k = new CopyOnWriteArrayList();
        this.d = new CopyOnWriteArrayList();
        if (N() != null) {
            N().c(new rb(this, 1));
            N().c(new rb(this, i));
            N().c(new rb(this, 2, null));
            bH.v();
            eol.c(this);
            aK().c("android:support:activity-result", new cp(this, 3));
            u(new ew(this, 2));
            this.fg = armd.a(new rd(this, 1));
            this.fh = armd.a(new rd(this, 2));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public eov P() {
        return (eov) this.fg.a();
    }

    @Override // defpackage.enb
    public final epd Q() {
        Bundle bundle = null;
        epe epeVar = new epe((byte[]) null);
        if (getApplication() != null) {
            epc epcVar = eou.b;
            Application application = getApplication();
            application.getClass();
            epeVar.b(epcVar, application);
        }
        epeVar.b(eol.a, this);
        epeVar.b(eol.b, this);
        Intent intent = getIntent();
        if (intent != null) {
            bundle = intent.getExtras();
        }
        if (bundle != null) {
            epeVar.b(eol.c, bundle);
        }
        return epeVar;
    }

    @Override // defpackage.gjz
    public final iba aK() {
        return (iba) this.r.a;
    }

    @Override // defpackage.eoz
    public final efu aL() {
        if (getApplication() != null) {
            v();
            efu efuVar = this.q;
            efuVar.getClass();
            return efuVar;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        w();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.l.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.ro
    public final rm c() {
        return (rm) this.fh.a();
    }

    @Override // defpackage.eab
    public final void g(ecd ecdVar) {
        ecdVar.getClass();
        this.c.remove(ecdVar);
    }

    public final rw gQ(se seVar, rv rvVar) {
        sb sbVar = this.g;
        sbVar.getClass();
        return sbVar.b("activity_rq#" + this.b.getAndIncrement(), this, seVar, rvVar);
    }

    @Override // defpackage.sc
    public final sb gR() {
        throw null;
    }

    @Override // defpackage.eab
    public final void gS(ecd ecdVar) {
        ecdVar.getClass();
        this.c.add(ecdVar);
    }

    @Override // android.app.Activity
    @armg
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.g.e(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    @armg
    public void onBackPressed() {
        c().d();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((ecd) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.dx, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.r.w(bundle);
        rs rsVar = this.f;
        rsVar.b = this;
        Iterator it = rsVar.a.iterator();
        while (it.hasNext()) {
            ((rt) it.next()).a();
        }
        super.onCreate(bundle);
        int i = eod.a;
        dyw.g(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i == 0) {
            super.onCreatePanelMenu(0, menu);
            this.m.z(menu, getMenuInflater());
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.m.B(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    @armg
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.e) {
            return;
        }
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((ecd) it.next()).accept(new akip(z));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((ecd) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.m.b).iterator();
        while (it.hasNext()) {
            ((da) ((qdq) it.next()).a).y(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    @armg
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.ff) {
            return;
        }
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((ecd) it.next()).accept(new akip(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i == 0) {
            super.onPreparePanel(0, view, menu);
            this.m.A(menu);
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    @armg
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (!this.g.e(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        mka mkaVar;
        Object obj = this.q;
        if (obj == null && (mkaVar = (mka) getLastNonConfigurationInstance()) != null) {
            obj = mkaVar.a;
        }
        if (obj == null) {
            return null;
        }
        mka mkaVar2 = new mka();
        mkaVar2.a = obj;
        return mkaVar2;
    }

    @Override // defpackage.dx, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        if (N() instanceof eno) {
            enh N = N();
            N.getClass();
            ((eno) N).f(eng.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.r.x(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((ecd) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.lang.Iterable] */
    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (gvf.be()) {
                gvf.bd("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            hwo x = x();
            synchronized (x.c) {
                x.a = true;
                Iterator it = x.b.iterator();
                while (it.hasNext()) {
                    ((arqg) it.next()).a();
                }
                x.b.clear();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        w();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.l.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @armg
    public void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @armg
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final void t(rm rmVar) {
        N().c(new end(rmVar, this, 1));
    }

    public final void u(rt rtVar) {
        rs rsVar = this.f;
        if (rsVar.b != null) {
            rtVar.a();
        }
        rsVar.a.add(rtVar);
    }

    public final void v() {
        if (this.q == null) {
            mka mkaVar = (mka) getLastNonConfigurationInstance();
            if (mkaVar != null) {
                this.q = (efu) mkaVar.a;
            }
            if (this.q == null) {
                this.q = new efu((char[]) null, (byte[]) null);
            }
        }
    }

    public final void w() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        dyx.d(decorView, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        dyy.o(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        gvf.bm(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        a.bT(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final hwo x() {
        return (hwo) this.a.a();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.e = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.e = false;
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                ((ecd) it.next()).accept(new akip(z));
            }
        } catch (Throwable th) {
            this.e = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.ff = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.ff = false;
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                ((ecd) it.next()).accept(new akip(z));
            }
        } catch (Throwable th) {
            this.ff = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    @armg
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @armg
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        w();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.l.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        w();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.l.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
