package com.google.android.apps.messaging.ui.appsettings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;
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
import defpackage.apxb;
import defpackage.enh;
import defpackage.eno;
import defpackage.hht;
import defpackage.kqj;
import defpackage.zje;
import defpackage.zmr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SwipeActionSettingsActivity extends zje implements akkh, akkg, aklg {
    private zmr G;
    private boolean I;
    private Context J;
    private eno L;
    private boolean M;
    private final akpr H = new akpr(this, this);
    private final long K = SystemClock.elapsedRealtime();

    private final zmr J() {
        K();
        return this.G;
    }

    private final void K() {
        if (this.G == null) {
            if (this.I) {
                if (this.M && !isFinishing()) {
                    throw new IllegalStateException("createPeer() called after destroyed.");
                }
                akrh e = aktp.e("CreateComponent");
                try {
                    aS();
                    e.close();
                    e = aktp.e("CreatePeer");
                    try {
                        try {
                            Activity activity = (Activity) ((kqj) aS()).c.b();
                            if (activity instanceof SwipeActionSettingsActivity) {
                                SwipeActionSettingsActivity swipeActionSettingsActivity = (SwipeActionSettingsActivity) activity;
                                swipeActionSettingsActivity.getClass();
                                this.G = new zmr(swipeActionSettingsActivity);
                                e.close();
                                return;
                            }
                            throw new IllegalStateException(hht.d(activity, zmr.class, "Attempt to inject a Activity wrapper of type "));
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
        return this.K;
    }

    @Override // defpackage.zgw
    public final /* synthetic */ apxb B() {
        return new aklr(this);
    }

    @Override // defpackage.akkh
    public final Class C() {
        return zmr.class;
    }

    @Override // defpackage.lzf
    protected final Integer D() {
        J();
        return null;
    }

    @Override // defpackage.akkh
    public final /* bridge */ /* synthetic */ Object E() {
        zmr zmrVar = this.G;
        if (zmrVar != null) {
            if (!this.M) {
                return zmrVar;
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
        if (this.L == null) {
            this.L = new aklh(this);
        }
        return this.L;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.J;
        }
        aktp.E(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ex, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        this.J = context;
        aktp.D(context);
        super.attachBaseContext(context);
        this.J = null;
    }

    @Override // defpackage.aitz, android.app.Activity
    public final void finish() {
        aksa a = this.H.a();
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
        aksa j = this.H.j();
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
        aksa q = this.H.q();
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
        aksa b = this.H.b();
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
        aksa r = this.H.r();
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
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r2.a() != false) goto L19;
     */
    /* JADX WARN: Type inference failed for: r1v3, types: [akln, java.lang.Object] */
    @Override // defpackage.lzf, defpackage.zgv, defpackage.zgu, defpackage.zgr, defpackage.zgw, defpackage.aitz, defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            akpr r0 = r5.H
            aksa r0 = r0.s()
            r1 = 1
            r5.I = r1     // Catch: java.lang.Throwable -> Lc4
            r5.K()     // Catch: java.lang.Throwable -> Lc4
            enh r1 = r5.N()     // Catch: java.lang.Throwable -> Lc4
            akpr r2 = r5.H     // Catch: java.lang.Throwable -> Lc4
            aklh r1 = (defpackage.aklh) r1     // Catch: java.lang.Throwable -> Lc4
            r1.h(r2)     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r1 = r5.aS()     // Catch: java.lang.Throwable -> Lc4
            hwo r1 = r1.K()     // Catch: java.lang.Throwable -> Lc4
            r1.g()     // Catch: java.lang.Throwable -> Lc4
            super.onCreate(r6)     // Catch: java.lang.Throwable -> Lc4
            zmr r6 = r5.J()     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r1 = r6.a     // Catch: java.lang.Throwable -> Lc4
            lzf r1 = (defpackage.lzf) r1     // Catch: java.lang.Throwable -> Lc4
            en r1 = r1.j()     // Catch: java.lang.Throwable -> Lc4
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lc4
            r3 = 31
            if (r2 >= r3) goto L38
            goto L86
        L38:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lc4
            r3 = 33
            if (r2 >= r3) goto L7c
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lc4
            r3 = 32
            if (r2 < r3) goto L52
            java.lang.String r2 = "Tiramisu"
            java.lang.String r3 = android.os.Build.VERSION.CODENAME     // Catch: java.lang.Throwable -> Lc4
            r3.getClass()     // Catch: java.lang.Throwable -> Lc4
            boolean r2 = defpackage.ebg.a(r2, r3)     // Catch: java.lang.Throwable -> Lc4
            if (r2 == 0) goto L52
            goto L7c
        L52:
            java.util.Map r2 = defpackage.ajgc.a     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r3 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> Lc4
            java.util.Locale r4 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r3 = r3.toLowerCase(r4)     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> Lc4
            ajgb r2 = (defpackage.ajgb) r2     // Catch: java.lang.Throwable -> Lc4
            if (r2 != 0) goto L74
            java.util.Map r2 = defpackage.ajgc.b     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r3 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> Lc4
            java.util.Locale r4 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r3 = r3.toLowerCase(r4)     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> Lc4
            ajgb r2 = (defpackage.ajgb) r2     // Catch: java.lang.Throwable -> Lc4
        L74:
            if (r2 == 0) goto L86
            boolean r2 = r2.a()     // Catch: java.lang.Throwable -> Lc4
            if (r2 == 0) goto L86
        L7c:
            java.lang.Object r2 = r6.a     // Catch: java.lang.Throwable -> Lc4
            lzf r2 = (defpackage.lzf) r2     // Catch: java.lang.Throwable -> Lc4
            r3 = 2132084569(0x7f150759, float:1.9809312E38)
            r2.setTheme(r3)     // Catch: java.lang.Throwable -> Lc4
        L86:
            java.lang.Object r2 = r6.a     // Catch: java.lang.Throwable -> Lc4
            com.google.android.apps.messaging.ui.appsettings.SwipeActionSettingsActivity r2 = (com.google.android.apps.messaging.ui.appsettings.SwipeActionSettingsActivity) r2     // Catch: java.lang.Throwable -> Lc4
            r3 = 2132021874(0x7f141272, float:1.9682152E38)
            java.lang.String r2 = r2.getString(r3)     // Catch: java.lang.Throwable -> Lc4
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Lc4
            if (r3 != 0) goto L9a
            defpackage.yzc.o(r1, r2)     // Catch: java.lang.Throwable -> Lc4
        L9a:
            java.lang.Object r6 = r6.a     // Catch: java.lang.Throwable -> Lc4
            lzf r6 = (defpackage.lzf) r6     // Catch: java.lang.Throwable -> Lc4
            da r6 = r6.a()     // Catch: java.lang.Throwable -> Lc4
            bd r1 = new bd     // Catch: java.lang.Throwable -> Lc4
            r1.<init>(r6)     // Catch: java.lang.Throwable -> Lc4
            zmv r6 = new zmv     // Catch: java.lang.Throwable -> Lc4
            r6.<init>()     // Catch: java.lang.Throwable -> Lc4
            defpackage.apxh.e(r6)     // Catch: java.lang.Throwable -> Lc4
            r2 = 2131428160(0x7f0b0340, float:1.8477957E38)
            r1.z(r2, r6)     // Catch: java.lang.Throwable -> Lc4
            r1.b()     // Catch: java.lang.Throwable -> Lc4
            r6 = 0
            r5.I = r6     // Catch: java.lang.Throwable -> Lc4
            akpr r6 = r5.H     // Catch: java.lang.Throwable -> Lc4
            r6.l()     // Catch: java.lang.Throwable -> Lc4
            r0.close()
            return
        Lc4:
            r6 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Lc9
            goto Lcd
        Lc9:
            r0 = move-exception
            r6.addSuppressed(r0)
        Lcd:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.appsettings.SwipeActionSettingsActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.re, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        aksa t = this.H.t();
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
        aksa c = this.H.c();
        try {
            super.onDestroy();
            this.M = true;
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
        aksa d = this.H.d(intent);
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

    @Override // defpackage.zgu, defpackage.aitz, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        aksa v = this.H.v();
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
    @Override // defpackage.zgu, defpackage.zgr, defpackage.aitz, defpackage.cj, android.app.Activity
    public final void onPause() {
        aksa e = this.H.e();
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
        aksa w = this.H.w();
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
        aksa x = this.H.x();
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
        aksa f = this.H.f();
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

    @Override // defpackage.zgu, defpackage.aitz, android.app.Activity
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
        aksa y = this.H.y();
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
    @Override // defpackage.zgu, defpackage.zgr, defpackage.aitz, defpackage.cj, android.app.Activity
    public final void onResume() {
        aksa g = this.H.g();
        try {
            super.onResume();
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
        aksa z = this.H.z();
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
    @Override // defpackage.zgu, defpackage.zgr, defpackage.aitz, defpackage.ex, defpackage.cj, android.app.Activity
    public final void onStart() {
        aksa h = this.H.h();
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
    @Override // defpackage.zgu, defpackage.zgr, defpackage.aitz, defpackage.ex, defpackage.cj, android.app.Activity
    public final void onStop() {
        aksa i = this.H.i();
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
        aksa k = this.H.k();
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

    @Override // defpackage.lzf
    protected final int z() {
        return R.layout.base_toolbar_settings_activity_gm3;
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
