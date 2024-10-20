package com.google.android.apps.messaging.ui.rcs.setup.auto;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import defpackage.aawx;
import defpackage.aayn;
import defpackage.aayx;
import defpackage.aaza;
import defpackage.aazb;
import defpackage.ahaj;
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
import defpackage.amlw;
import defpackage.amlx;
import defpackage.apxb;
import defpackage.bd;
import defpackage.da;
import defpackage.enh;
import defpackage.eno;
import defpackage.hht;
import defpackage.kqj;
import defpackage.krv;
import defpackage.vqu;
import defpackage.yjr;
import defpackage.ykw;
import defpackage.zap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RcsPromoActivity extends aayx implements akkh, akkg, aklg {
    private aaza n;
    private boolean p;
    private Context q;
    private eno s;
    private boolean x;
    private final akpr o = new akpr(this, this);
    private final long r = SystemClock.elapsedRealtime();

    private final aaza G() {
        I();
        return this.n;
    }

    private final void I() {
        if (this.n == null) {
            if (this.p) {
                if (this.x && !isFinishing()) {
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
                            if (activity instanceof RcsPromoActivity) {
                                RcsPromoActivity rcsPromoActivity = (RcsPromoActivity) activity;
                                rcsPromoActivity.getClass();
                                vqu vquVar = (vqu) ((kqj) aS).b.dt.b();
                                krv krvVar = ((kqj) aS).b;
                                this.n = new aaza(rcsPromoActivity, vquVar, krvVar.gD, (ykw) krvVar.av.b(), (yjr) ((kqj) aS).b.bO.b(), (zap) ((kqj) aS).ax.b(), ((kqj) aS).b.gC);
                                e.close();
                                return;
                            }
                            throw new IllegalStateException(hht.d(activity, aaza.class, "Attempt to inject a Activity wrapper of type "));
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
        return this.r;
    }

    @Override // defpackage.zgw
    public final /* synthetic */ apxb B() {
        return new aklr(this);
    }

    @Override // defpackage.akkh
    public final Class C() {
        return aaza.class;
    }

    @Override // defpackage.akkh
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final aaza E() {
        aaza aazaVar = this.n;
        if (aazaVar != null) {
            if (!this.x) {
                return aazaVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.zgr
    protected final boolean F() {
        return false;
    }

    @Override // defpackage.dx, defpackage.enm
    public final enh N() {
        if (this.s == null) {
            this.s = new aklh(this);
        }
        return this.s;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.q;
        }
        aktp.E(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ex, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        this.q = context;
        aktp.D(context);
        super.attachBaseContext(context);
        this.q = null;
    }

    @Override // defpackage.aitz, android.app.Activity
    public final void finish() {
        aksa a = this.o.a();
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
        aksa j = this.o.j();
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
        aksa q = this.o.q();
        try {
            super.onActivityResult(i, i2, intent);
            aaza G = G();
            G.f.a(G.a, i, i2, G);
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
        aksa b = this.o.b();
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
        aksa r = this.o.r();
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

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v3, types: [akln, java.lang.Object] */
    @Override // defpackage.zgr, defpackage.zgw, defpackage.aitz, defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    public final void onCreate(Bundle bundle) {
        aksa s = this.o.s();
        try {
            this.p = true;
            I();
            ((aklh) N()).h(this.o);
            aS().K().g();
            super.onCreate(bundle);
            aaza G = G();
            G.f = G.g.d();
            da a = G.a.a();
            aazb aazbVar = (aazb) a.e("rcs_promo");
            if (aazbVar == null) {
                aazbVar = new aazb();
            }
            G.c.S(amlw.RCS_PROVISIONING_RCS_PROMO_SEEN, amlx.PROVISIONING_UI_TYPE_RCS_PROMO);
            bd bdVar = new bd(a);
            bdVar.v(R.id.content, aazbVar, "rcs_promo");
            bdVar.i();
            aktp.bG(this).a = findViewById(R.id.content);
            aktp.F(this, aayn.class, new aawx(this.n, 9));
            this.p = false;
            this.o.l();
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
        aksa t = this.o.t();
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

    @Override // defpackage.zgw, defpackage.aitz, defpackage.ex, defpackage.cj, android.app.Activity
    public final void onDestroy() {
        aksa c = this.o.c();
        try {
            super.onDestroy();
            this.x = true;
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
        aksa d = this.o.d(intent);
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
        aksa v = this.o.v();
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
    @Override // defpackage.zgr, defpackage.aitz, defpackage.cj, android.app.Activity
    public final void onPause() {
        aksa e = this.o.e();
        try {
            super.onPause();
            G().d();
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
        aksa w = this.o.w();
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
        aksa x = this.o.x();
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
        aksa f = this.o.f();
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

    @Override // defpackage.zgr, defpackage.aitz, defpackage.cj, defpackage.re, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        aksa y = this.o.y();
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
    @Override // defpackage.zgr, defpackage.aitz, defpackage.cj, android.app.Activity
    public final void onResume() {
        aksa g = this.o.g();
        try {
            super.onResume();
            aaza G = G();
            if (!G.d.y()) {
                G.a.finish();
            }
            if (G.e == null) {
                G.e = new ahaj(G, 1);
            }
            G.a.getSharedPreferences("bugle", 0).registerOnSharedPreferenceChangeListener(G.e);
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
    @Override // defpackage.zgr, defpackage.aitz, defpackage.re, defpackage.dx, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        aksa z = this.o.z();
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
    @Override // defpackage.zgr, defpackage.aitz, defpackage.ex, defpackage.cj, android.app.Activity
    public final void onStart() {
        aksa h = this.o.h();
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
    @Override // defpackage.zgr, defpackage.aitz, defpackage.ex, defpackage.cj, android.app.Activity
    public final void onStop() {
        aksa i = this.o.i();
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
        aksa k = this.o.k();
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
