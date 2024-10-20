package com.google.android.apps.messaging.welcome;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.apps.messaging.R;
import defpackage.aawx;
import defpackage.abex;
import defpackage.abfd;
import defpackage.abfe;
import defpackage.abfi;
import defpackage.abfj;
import defpackage.abfm;
import defpackage.akec;
import defpackage.akkg;
import defpackage.akkh;
import defpackage.aklg;
import defpackage.aklh;
import defpackage.aklr;
import defpackage.akpr;
import defpackage.akqj;
import defpackage.akrh;
import defpackage.aksa;
import defpackage.akto;
import defpackage.aktp;
import defpackage.alvw;
import defpackage.apxb;
import defpackage.arpe;
import defpackage.arwe;
import defpackage.enh;
import defpackage.eno;
import defpackage.goi;
import defpackage.gvf;
import defpackage.hht;
import defpackage.kqj;
import defpackage.krv;
import defpackage.no;
import defpackage.qjh;
import defpackage.ydl;
import defpackage.zcb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WelcomeFlowActivityWithoutConfigChanges extends abex implements akkh, akkg, aklg {
    private abfe o;
    private boolean q;
    private Context r;
    private eno t;
    private boolean u;
    private final akpr p = new akpr(this, this);
    private final long s = SystemClock.elapsedRealtime();

    private final abfe B() {
        D();
        return this.o;
    }

    private final void D() {
        if (this.o == null) {
            if (this.q) {
                if (this.u && !isFinishing()) {
                    throw new IllegalStateException("createPeer() called after destroyed.");
                }
                akrh e = aktp.e("CreateComponent");
                try {
                    aS();
                    e.close();
                    e = aktp.e("CreatePeer");
                    try {
                        try {
                            Object aS = aS();
                            Activity activity = (Activity) ((kqj) aS).c.b();
                            if (activity instanceof WelcomeFlowActivityWithoutConfigChanges) {
                                WelcomeFlowActivityWithoutConfigChanges welcomeFlowActivityWithoutConfigChanges = (WelcomeFlowActivityWithoutConfigChanges) activity;
                                welcomeFlowActivityWithoutConfigChanges.getClass();
                                arwe arweVar = (arwe) ((kqj) aS).b.bQ.b();
                                arwe arweVar2 = (arwe) ((kqj) aS).b.dP.b();
                                krv krvVar = ((kqj) aS).b;
                                this.o = new abfe(welcomeFlowActivityWithoutConfigChanges, arweVar, arweVar2, krvVar.bV, ((kqj) aS).az, ((kqj) aS).aA, krvVar.de, ((kqj) aS).aB, krvVar.aC);
                                e.close();
                                return;
                            }
                            throw new IllegalStateException(hht.d(activity, abfe.class, "Attempt to inject a Activity wrapper of type "));
                        } catch (ClassCastException e2) {
                            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } finally {
                    try {
                        e.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            throw new IllegalStateException("createPeer() called outside of onCreate");
        }
    }

    @Override // defpackage.akkg
    public final long A() {
        return this.s;
    }

    @Override // defpackage.akkh
    public final Class C() {
        return abfe.class;
    }

    @Override // defpackage.akkh
    public final /* bridge */ /* synthetic */ Object E() {
        abfe abfeVar = this.o;
        if (abfeVar != null) {
            if (!this.u) {
                return abfeVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.dx, defpackage.enm
    public final enh N() {
        if (this.t == null) {
            this.t = new aklh(this);
        }
        return this.t;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.r;
        }
        aktp.E(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ex, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        this.r = context;
        aktp.D(context);
        super.attachBaseContext(context);
        this.r = null;
    }

    @Override // defpackage.aitz, android.app.Activity
    public final void finish() {
        aksa a = this.p.a();
        try {
            super.finish();
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ex, android.app.Activity
    public final void invalidateOptionsMenu() {
        aksa k = akqj.k();
        try {
            super.invalidateOptionsMenu();
            k.close();
        } catch (Throwable th) {
            try {
                k.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ex
    public final boolean n() {
        aksa j = this.p.j();
        try {
            boolean n = super.n();
            j.close();
            return n;
        } catch (Throwable th) {
            try {
                j.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aitz, defpackage.cj, defpackage.re, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        aksa q = this.p.q();
        try {
            super.onActivityResult(i, i2, intent);
            q.close();
        } catch (Throwable th) {
            try {
                q.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aitz, defpackage.re, android.app.Activity
    public final void onBackPressed() {
        aksa b = this.p.b();
        try {
            super.onBackPressed();
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

    @Override // defpackage.aitz, defpackage.ex, defpackage.re, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        aksa r = this.p.r();
        try {
            super.onConfigurationChanged(configuration);
            r.close();
        } catch (Throwable th) {
            try {
                r.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [akln, java.lang.Object] */
    @Override // defpackage.abex, defpackage.aitz, defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        aksa s = this.p.s();
        try {
            this.q = true;
            D();
            ((aklh) N()).h(this.p);
            aS().K().g();
            super.onCreate(bundle);
            abfe B = B();
            alvw m = abfe.a.m();
            m.X(ydl.M, "WelcomeFlowActivityWithoutConfigChangesPeer");
            m.q("#onCreate()");
            B.b.setContentView(R.layout.welcome_activity_layout);
            ViewPager2 a = B.a();
            abfj b = B.b();
            no noVar = a.e.l;
            gvf gvfVar = a.j;
            if (noVar != null) {
                noVar.E(((goi) gvfVar).b);
            }
            if (noVar != null) {
                noVar.E(a.i);
            }
            a.e.ag(b);
            a.b = 0;
            a.d();
            gvf gvfVar2 = a.j;
            ((goi) gvfVar2).j();
            b.D(((goi) gvfVar2).b);
            b.D(a.i);
            B.b.c().a(new abfd(B));
            if (B.b.getIntent().hasExtra("extra_gaia_account_info")) {
                alvw m2 = abfe.a.m();
                m2.X(ydl.M, "WelcomeFlowActivityWithoutConfigChangesPeer");
                m2.q("[Auto sign-in] Welcome flow initiated. Triggering auto sign-in. Notifying account selector");
                qjh.l(B.d, null, new zcb(B, (arpe) null, 10, (byte[]) null), 3);
            }
            aktp.bG(this).a = findViewById(android.R.id.content);
            abfe abfeVar = this.o;
            aktp.F(this, abfm.class, new aawx(abfeVar, 10));
            aktp.F(this, abfi.class, new aawx(abfeVar, 11));
            this.q = false;
            this.p.l();
            s.close();
        } catch (Throwable th) {
            try {
                s.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.re, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        aksa t = this.p.t();
        try {
            super.onCreatePanelMenu(i, menu);
            t.close();
            return true;
        } catch (Throwable th) {
            try {
                t.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.abex, defpackage.aitz, defpackage.ex, defpackage.cj, android.app.Activity
    protected final void onDestroy() {
        aksa c = this.p.c();
        try {
            super.onDestroy();
            this.u = true;
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aitz, defpackage.re, android.app.Activity
    public final void onNewIntent(Intent intent) {
        aksa d = this.p.d(intent);
        try {
            super.onNewIntent(intent);
            d.close();
        } catch (Throwable th) {
            try {
                d.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aitz, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        aksa v = this.p.v();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            v.close();
            return onOptionsItemSelected;
        } catch (Throwable th) {
            try {
                v.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aitz, defpackage.cj, android.app.Activity
    public final void onPause() {
        aksa e = this.p.e();
        try {
            super.onPause();
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

    @Override // defpackage.re, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        aksa w = this.p.w();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            w.close();
        } catch (Throwable th) {
            try {
                w.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aitz, defpackage.ex, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        aksa x = this.p.x();
        try {
            super.onPostCreate(bundle);
            x.close();
        } catch (Throwable th) {
            try {
                x.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aitz, defpackage.ex, defpackage.cj, android.app.Activity
    public final void onPostResume() {
        aksa f = this.p.f();
        try {
            super.onPostResume();
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aitz, android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        aksa k = akqj.k();
        try {
            boolean onPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
            k.close();
            return onPrepareOptionsMenu;
        } catch (Throwable th) {
            try {
                k.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aitz, defpackage.cj, defpackage.re, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        aksa y = this.p.y();
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            y.close();
        } catch (Throwable th) {
            try {
                y.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aitz, defpackage.cj, android.app.Activity
    public final void onResume() {
        aksa g = this.p.g();
        try {
            super.onResume();
            abfe B = B();
            if (!B.j.get()) {
                qjh.l(B.c, null, new zcb(B, (arpe) null, 9), 3);
                B.j.set(true);
            }
            g.close();
        } catch (Throwable th) {
            try {
                g.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aitz, defpackage.re, defpackage.dx, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        aksa z = this.p.z();
        try {
            super.onSaveInstanceState(bundle);
            z.close();
        } catch (Throwable th) {
            try {
                z.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aitz, defpackage.ex, defpackage.cj, android.app.Activity
    public final void onStart() {
        aksa h = this.p.h();
        try {
            super.onStart();
            h.close();
        } catch (Throwable th) {
            try {
                h.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aitz, defpackage.ex, defpackage.cj, android.app.Activity
    public final void onStop() {
        aksa i = this.p.i();
        try {
            super.onStop();
            i.close();
        } catch (Throwable th) {
            try {
                i.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aitz, android.app.Activity
    public final void onUserInteraction() {
        aksa k = this.p.k();
        try {
            super.onUserInteraction();
            k.close();
        } catch (Throwable th) {
            try {
                k.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aitz, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        if (akec.y(intent, getApplicationContext())) {
            akto.m(intent);
        }
        super.startActivity(intent);
    }

    @Override // defpackage.abex
    public final /* synthetic */ apxb z() {
        return new aklr(this);
    }

    @Override // defpackage.aitz, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        if (akec.y(intent, getApplicationContext())) {
            akto.m(intent);
        }
        super.startActivity(intent, bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ex
    public final void gN() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ex
    public final void gO() {
    }
}
