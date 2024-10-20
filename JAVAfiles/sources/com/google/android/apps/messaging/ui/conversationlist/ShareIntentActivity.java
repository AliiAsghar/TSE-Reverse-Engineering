package com.google.android.apps.messaging.ui.conversationlist;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import defpackage.aaid;
import defpackage.aaih;
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
import defpackage.apwt;
import defpackage.apxb;
import defpackage.apxv;
import defpackage.apya;
import defpackage.enh;
import defpackage.eno;
import defpackage.hht;
import defpackage.kqj;
import defpackage.krv;
import defpackage.krx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ShareIntentActivity extends aaid implements akkh, akkg, aklg {
    private aaih n;
    private boolean p;
    private Context q;
    private eno s;
    private boolean x;
    private final akpr o = new akpr(this, this);
    private final long r = SystemClock.elapsedRealtime();

    private final void D() {
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
                            if (activity instanceof ShareIntentActivity) {
                                ShareIntentActivity shareIntentActivity = (ShareIntentActivity) activity;
                                shareIntentActivity.getClass();
                                krv krvVar = ((kqj) aS).b;
                                krx krxVar = krvVar.a;
                                apya apyaVar = krxVar.ak;
                                apya apyaVar2 = krvVar.um;
                                apya apyaVar3 = krvVar.dn;
                                apya apyaVar4 = krvVar.si;
                                apya apyaVar5 = krxVar.bF;
                                apya apyaVar6 = krvVar.yF;
                                apwt a = apxv.a(((kqj) aS).aa);
                                krv krvVar2 = ((kqj) aS).b;
                                this.n = new aaih(shareIntentActivity, apyaVar, apyaVar2, apyaVar3, apyaVar4, apyaVar5, apyaVar6, a, krvVar2.aM, krvVar2.yJ, krvVar2.f8if);
                                e.close();
                                return;
                            }
                            throw new IllegalStateException(hht.d(activity, aaih.class, "Attempt to inject a Activity wrapper of type "));
                        } catch (ClassCastException e2) {
                            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e2);
                        }
                    } finally {
                    }
                } finally {
                    try {
                        e.close();
                        throw th;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            } else {
                throw new IllegalStateException("createPeer() called outside of onCreate");
            }
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
        return aaih.class;
    }

    @Override // defpackage.akkh
    public final /* bridge */ /* synthetic */ Object E() {
        aaih aaihVar = this.n;
        if (aaihVar != null) {
            if (!this.x) {
                return aaihVar;
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
    /* JADX WARN: Removed duplicated region for block: B:24:0x00be A[Catch: all -> 0x025b, TryCatch #1 {all -> 0x025b, blocks: (B:3:0x000b, B:5:0x003d, B:7:0x0051, B:9:0x005f, B:10:0x0250, B:15:0x007c, B:17:0x0086, B:19:0x0094, B:22:0x00b6, B:24:0x00be, B:26:0x00ce, B:28:0x00e1, B:33:0x00f6, B:35:0x00fd, B:37:0x018f, B:38:0x019c, B:40:0x01a7, B:41:0x01b6, B:43:0x01c4, B:44:0x01d8, B:46:0x01e4, B:48:0x01f0, B:50:0x01fc, B:51:0x0228, B:53:0x0237), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f6 A[Catch: all -> 0x025b, TryCatch #1 {all -> 0x025b, blocks: (B:3:0x000b, B:5:0x003d, B:7:0x0051, B:9:0x005f, B:10:0x0250, B:15:0x007c, B:17:0x0086, B:19:0x0094, B:22:0x00b6, B:24:0x00be, B:26:0x00ce, B:28:0x00e1, B:33:0x00f6, B:35:0x00fd, B:37:0x018f, B:38:0x019c, B:40:0x01a7, B:41:0x01b6, B:43:0x01c4, B:44:0x01d8, B:46:0x01e4, B:48:0x01f0, B:50:0x01fc, B:51:0x0228, B:53:0x0237), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b6 A[Catch: all -> 0x025b, TryCatch #1 {all -> 0x025b, blocks: (B:3:0x000b, B:5:0x003d, B:7:0x0051, B:9:0x005f, B:10:0x0250, B:15:0x007c, B:17:0x0086, B:19:0x0094, B:22:0x00b6, B:24:0x00be, B:26:0x00ce, B:28:0x00e1, B:33:0x00f6, B:35:0x00fd, B:37:0x018f, B:38:0x019c, B:40:0x01a7, B:41:0x01b6, B:43:0x01c4, B:44:0x01d8, B:46:0x01e4, B:48:0x01f0, B:50:0x01fc, B:51:0x0228, B:53:0x0237), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    /* JADX WARN: Type inference failed for: r4v2, types: [akln, java.lang.Object] */
    @Override // defpackage.zgr, defpackage.zgw, defpackage.aitz, defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.conversationlist.ShareIntentActivity.onCreate(android.os.Bundle):void");
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
