package com.google.android.apps.messaging.datadonation.ui;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import defpackage.a;
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
import defpackage.amjl;
import defpackage.amjp;
import defpackage.amjq;
import defpackage.aozy;
import defpackage.apxb;
import defpackage.apxh;
import defpackage.apxx;
import defpackage.bd;
import defpackage.enh;
import defpackage.enm;
import defpackage.eno;
import defpackage.ixl;
import defpackage.klb;
import defpackage.klc;
import defpackage.klr;
import defpackage.kls;
import defpackage.klu;
import defpackage.kmg;
import defpackage.kmh;
import defpackage.kmm;
import defpackage.kmo;
import defpackage.kqj;
import defpackage.ksi;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DataDonationActivity extends kmh implements akkh, akkg, aklg {
    private kls n;
    private boolean p;
    private Context q;
    private eno s;
    private boolean x;
    private final akpr o = new akpr(this, this);
    private final long r = SystemClock.elapsedRealtime();

    private final kls D() {
        G();
        return this.n;
    }

    private final void G() {
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
                            this.n = new kls(((kqj) aS).q, ((kqj) aS).r, ((kqj) aS).s, ((kqj) aS).b.ft);
                            e.close();
                            this.n.f = this;
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
        return this.r;
    }

    @Override // defpackage.zgw
    public final /* synthetic */ apxb B() {
        return new aklr(this);
    }

    @Override // defpackage.akkh
    public final Class C() {
        return kls.class;
    }

    @Override // defpackage.akkh
    public final /* bridge */ /* synthetic */ Object E() {
        kls klsVar = this.n;
        if (klsVar != null) {
            if (!this.x) {
                return klsVar;
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
            ((DataDonationActivity) D().a.b()).c().d();
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
    /* JADX WARN: Type inference failed for: r2v2, types: [akln, java.lang.Object] */
    @Override // defpackage.zgr, defpackage.zgw, defpackage.aitz, defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int Y;
        aksa s = this.o.s();
        try {
            this.p = true;
            G();
            ((aklh) N()).h(this.o);
            aS().K().g();
            super.onCreate(bundle);
            kls D = D();
            if (((klb) ((Optional) ((apxx) D.b).a).get()).b()) {
                ((klb) ((Optional) ((apxx) D.b).a).get()).a();
            }
            if (bundle == null) {
                D.a(0, 0);
                bd bdVar = new bd(((DataDonationActivity) D.a.b()).a());
                klu kluVar = new klu();
                apxh.e(kluVar);
                bdVar.v(R.id.content, kluVar, "dd_fragment_tag");
                bdVar.b();
            }
            Intent intent = ((DataDonationActivity) D.a.b()).getIntent();
            if (intent != null && (Y = a.Y(intent.getIntExtra("DATA_DONATION_OPEN_SOURCE", 0))) != 1) {
                klc klcVar = (klc) D.c.b();
                aozy createBuilder = amjq.a.createBuilder();
                aozy createBuilder2 = amjp.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                amjp amjpVar = (amjp) createBuilder2.b;
                int i = Y - 1;
                if (Y != 0) {
                    amjpVar.c = i;
                    amjpVar.b |= 1;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amjq amjqVar = (amjq) createBuilder.b;
                    amjp amjpVar2 = (amjp) createBuilder2.s();
                    amjpVar2.getClass();
                    amjqVar.c = amjpVar2;
                    amjqVar.b = 1;
                    klcVar.c(createBuilder);
                } else {
                    throw null;
                }
            }
            ((ksi) D.d.b()).a();
            ((DataDonationActivity) D.a.b()).c().b((enm) D.a.b(), new klr(D));
            aktp.bG(this).a = findViewById(R.id.content);
            kls klsVar = this.n;
            aktp.F(this, kmm.class, new ixl(klsVar, 10));
            aktp.F(this, kmo.class, new ixl(klsVar, 11));
            aktp.F(this, kmg.class, new ixl(klsVar, 12));
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
            kls D = D();
            klc klcVar = (klc) D.c.b();
            int i = D.e;
            aozy createBuilder = amjq.a.createBuilder();
            aozy createBuilder2 = amjl.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            amjl amjlVar = (amjl) createBuilder2.b;
            int i2 = i - 1;
            if (i != 0) {
                amjlVar.c = i2;
                amjlVar.b |= 1;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amjq amjqVar = (amjq) createBuilder.b;
                amjl amjlVar2 = (amjl) createBuilder2.s();
                amjlVar2.getClass();
                amjqVar.c = amjlVar2;
                amjqVar.b = 4;
                klcVar.c(createBuilder);
                this.x = true;
                c.close();
                return;
            }
            throw null;
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
        boolean onOptionsItemSelected;
        aksa v = this.o.v();
        try {
            kls D = D();
            if (menuItem.getItemId() == 16908332) {
                ((DataDonationActivity) D.a.b()).c().d();
                onOptionsItemSelected = true;
            } else {
                onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            }
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
