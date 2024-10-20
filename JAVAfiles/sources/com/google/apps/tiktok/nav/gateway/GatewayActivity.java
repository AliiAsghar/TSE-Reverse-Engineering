package com.google.apps.tiktok.nav.gateway;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import defpackage.akbo;
import defpackage.akec;
import defpackage.akkg;
import defpackage.akkh;
import defpackage.aklg;
import defpackage.aklh;
import defpackage.aklr;
import defpackage.akmy;
import defpackage.akna;
import defpackage.aknd;
import defpackage.akne;
import defpackage.akpr;
import defpackage.akqj;
import defpackage.akrh;
import defpackage.aksa;
import defpackage.akto;
import defpackage.aktp;
import defpackage.alor;
import defpackage.apxb;
import defpackage.apya;
import defpackage.enh;
import defpackage.eno;
import defpackage.kqj;
import defpackage.krx;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class GatewayActivity extends akne implements akkh, akkg, aklg {
    private akmy p;
    private boolean r;
    private Context s;
    private eno u;
    private boolean v;
    private final akpr q = new akpr(this, this);
    private final long t = SystemClock.elapsedRealtime();

    private final akmy l() {
        m();
        return this.p;
    }

    private final void m() {
        if (this.p == null) {
            if (this.r) {
                if (this.v && !isFinishing()) {
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
                            krx krxVar = ((kqj) aS).b.a;
                            apya apyaVar = krxVar.gd;
                            apya apyaVar2 = krxVar.ge;
                            this.p = new akmy(new aknd(activity, alor.p("com.google.android.apps.messaging.deeplinks.InstallDeepLink", apyaVar, "com.google.android.apps.messaging.emergency.EmergencySosConversation", apyaVar2, "com.google.android.apps.messaging.emergency.DemoEmergencySosConversation", apyaVar2, "com.google.android.apps.messaging.ui.conversation.rbm.RbmDeepLink", krxVar.gf, "com.google.android.apps.messaging.ui.conversation.smsdeeplinks.SmsDeepLink", krxVar.gi), ((kqj) aS).B, (akbo) ((kqj) aS).z.b()));
                            e.close();
                            return;
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
        return this.t;
    }

    @Override // defpackage.akkh
    public final Class C() {
        return akmy.class;
    }

    @Override // defpackage.akkh
    public final /* bridge */ /* synthetic */ Object E() {
        akmy akmyVar = this.p;
        if (akmyVar != null) {
            if (!this.v) {
                return akmyVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.dx, defpackage.enm
    public final enh N() {
        if (this.u == null) {
            this.u = new aklh(this);
        }
        return this.u;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.s;
        }
        aktp.E(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        this.s = context;
        aktp.D(context);
        super.attachBaseContext(context);
        this.s = null;
    }

    @Override // defpackage.aiud, android.app.Activity
    public final void finish() {
        aksa a = this.q.a();
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

    @Override // android.app.Activity
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

    @Override // defpackage.akne
    public final /* synthetic */ apxb j() {
        return new aklr(this);
    }

    @Override // defpackage.aiud, defpackage.cj, defpackage.re, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        aksa q = this.q.q();
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

    @Override // defpackage.aiud, defpackage.re, android.app.Activity
    public final void onBackPressed() {
        aksa b = this.q.b();
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

    @Override // defpackage.aiud, defpackage.re, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        aksa r = this.q.r();
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
    /* JADX WARN: Type inference failed for: r1v3, types: [akln, java.lang.Object] */
    @Override // defpackage.akne, defpackage.aiud, defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    public final void onCreate(Bundle bundle) {
        aksa s = this.q.s();
        try {
            this.r = true;
            m();
            ((aklh) N()).h(this.q);
            aS().K().g();
            super.onCreate(bundle);
            Object obj = l().a;
            ((aknd) obj).b.b(((aknd) obj).e);
            if (bundle != null) {
                ((aknd) obj).f = bundle.getInt("theme", 0);
                ((aknd) obj).g = bundle.getInt("layout", 0);
                ((aknd) obj).a();
            }
            this.r = false;
            this.q.l();
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
        aksa t = this.q.t();
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.akne, defpackage.aiud, defpackage.cj, android.app.Activity
    public final void onDestroy() {
        aksa c = this.q.c();
        try {
            super.onDestroy();
            this.v = true;
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

    @Override // defpackage.cj, defpackage.re, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        aksa u = this.q.u();
        try {
            boolean onMenuItemSelected = super.onMenuItemSelected(i, menuItem);
            u.close();
            return onMenuItemSelected;
        } catch (Throwable th) {
            try {
                u.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiud, defpackage.re, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        aksa d = this.q.d(intent);
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

    @Override // defpackage.aiud, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        aksa v = this.q.v();
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

    @Override // defpackage.aiud, defpackage.cj, android.app.Activity
    protected final void onPause() {
        aksa e = this.q.e();
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
        aksa w = this.q.w();
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

    @Override // defpackage.aiud, android.app.Activity
    protected final void onPostCreate(Bundle bundle) {
        aksa x = this.q.x();
        try {
            super.onPostCreate(bundle);
            akmy l = l();
            if (bundle == null) {
                Object obj = l.a;
                if (((aknd) obj).c != null) {
                    if (!((aknd) obj).d) {
                        ((aknd) obj).c();
                    }
                } else {
                    ((aknd) obj).b(akna.b());
                }
            }
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

    @Override // defpackage.aiud, defpackage.cj, android.app.Activity
    protected final void onPostResume() {
        aksa f = this.q.f();
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

    @Override // defpackage.aiud, android.app.Activity
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

    @Override // defpackage.aiud, defpackage.cj, defpackage.re, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        aksa y = this.q.y();
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

    @Override // defpackage.aiud, defpackage.cj, android.app.Activity
    protected final void onResume() {
        aksa g = this.q.g();
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

    @Override // defpackage.aiud, defpackage.re, defpackage.dx, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        aksa z = this.q.z();
        try {
            super.onSaveInstanceState(bundle);
            Object obj = l().a;
            bundle.putInt("theme", ((aknd) obj).f);
            bundle.putInt("layout", ((aknd) obj).g);
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

    @Override // defpackage.aiud, defpackage.cj, android.app.Activity
    protected final void onStart() {
        aksa h = this.q.h();
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

    @Override // defpackage.aiud, defpackage.cj, android.app.Activity
    protected final void onStop() {
        aksa i = this.q.i();
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

    @Override // defpackage.aiud, android.app.Activity
    public final void onUserInteraction() {
        aksa k = this.q.k();
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

    @Override // defpackage.aiud, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        if (akec.y(intent, getApplicationContext())) {
            akto.m(intent);
        }
        super.startActivity(intent);
    }

    @Override // defpackage.aiud, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        if (akec.y(intent, getApplicationContext())) {
            akto.m(intent);
        }
        super.startActivity(intent, bundle);
    }
}
