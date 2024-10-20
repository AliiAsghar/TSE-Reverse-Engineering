package com.google.android.apps.messaging.ui.conversation;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
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
import defpackage.apxh;
import defpackage.apxv;
import defpackage.bd;
import defpackage.cj;
import defpackage.enh;
import defpackage.eno;
import defpackage.hht;
import defpackage.kpb;
import defpackage.kqj;
import defpackage.yjv;
import defpackage.zas;
import defpackage.zji;
import defpackage.zrp;
import defpackage.zrs;
import defpackage.zrt;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LaunchConversationActivity extends zrp implements akkh, akkg, aklg {
    private zrs o;
    private boolean q;
    private Context r;
    private eno t;
    private boolean u;
    private final akpr p = new akpr(this, this);
    private final long s = SystemClock.elapsedRealtime();

    public LaunchConversationActivity() {
        u(new zji(this, 4));
    }

    @Override // defpackage.akkg
    public final long A() {
        return this.s;
    }

    @Override // defpackage.akkh
    public final Class C() {
        return zrs.class;
    }

    @Override // defpackage.akkh
    public final /* bridge */ /* synthetic */ Object E() {
        zrs zrsVar = this.o;
        if (zrsVar != null) {
            if (!this.u) {
                return zrsVar;
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

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        this.r = context;
        aktp.D(context);
        super.attachBaseContext(context);
        this.r = null;
    }

    @Override // android.app.Activity
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

    @Override // defpackage.zrp
    public final /* synthetic */ apxb k() {
        return new aklr(this);
    }

    public final void l() {
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
                            if (activity instanceof LaunchConversationActivity) {
                                LaunchConversationActivity launchConversationActivity = (LaunchConversationActivity) activity;
                                launchConversationActivity.getClass();
                                this.o = new zrs(launchConversationActivity, ((kqj) aS).d, apxv.a(((kqj) aS).aa), ((kqj) aS).b.aM);
                                e.close();
                                return;
                            }
                            throw new IllegalStateException(hht.d(activity, zrs.class, "Attempt to inject a Activity wrapper of type "));
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cj, defpackage.re, android.app.Activity
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

    @Override // defpackage.re, android.app.Activity
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

    @Override // defpackage.re, android.app.Activity, android.content.ComponentCallbacks
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

    /* JADX WARN: Type inference failed for: r1v16, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [apwt, java.lang.Object] */
    @Override // defpackage.zrp, defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        aksa s = this.p.s();
        try {
            this.q = true;
            ((aklh) N()).h(this.p);
            super.onCreate(bundle);
            l();
            zrs zrsVar = this.o;
            if (!((zas) zrsVar.c.b()).g((Activity) zrsVar.a)) {
                if (((Optional) zrsVar.b.b()).isPresent() && ((kpb) ((Optional) zrsVar.b.b()).get()).b() && !((yjv) zrsVar.d.b()).e()) {
                    kpb kpbVar = (kpb) ((Optional) zrsVar.b.b()).get();
                    ((LaunchConversationActivity) zrsVar.a).getIntent();
                    kpbVar.c();
                    ((LaunchConversationActivity) zrsVar.a).finish();
                } else if (((cj) zrsVar.a).a().d(R.id.content) == null) {
                    bd bdVar = new bd(((cj) zrsVar.a).a());
                    zrt zrtVar = new zrt();
                    apxh.e(zrtVar);
                    bdVar.z(R.id.content, zrtVar);
                    bdVar.b();
                }
            }
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

    @Override // defpackage.zrp, defpackage.cj, android.app.Activity
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

    @Override // defpackage.cj, defpackage.re, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        aksa u = this.p.u();
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.re, android.app.Activity
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

    @Override // android.app.Activity
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
    @Override // defpackage.cj, android.app.Activity
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

    @Override // android.app.Activity
    protected final void onPostCreate(Bundle bundle) {
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
    @Override // defpackage.cj, android.app.Activity
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

    @Override // android.app.Activity
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

    @Override // defpackage.cj, defpackage.re, android.app.Activity
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
    @Override // defpackage.cj, android.app.Activity
    public final void onResume() {
        aksa g = this.p.g();
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
    @Override // defpackage.re, defpackage.dx, android.app.Activity
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
    @Override // defpackage.cj, android.app.Activity
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
    @Override // defpackage.cj, android.app.Activity
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

    @Override // android.app.Activity
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

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        if (akec.y(intent, getApplicationContext())) {
            akto.m(intent);
        }
        super.startActivity(intent);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        if (akec.y(intent, getApplicationContext())) {
            akto.m(intent);
        }
        super.startActivity(intent, bundle);
    }
}
