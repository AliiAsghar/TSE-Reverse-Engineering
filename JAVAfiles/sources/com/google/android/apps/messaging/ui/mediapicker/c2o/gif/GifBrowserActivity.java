package com.google.android.apps.messaging.ui.mediapicker.c2o.gif;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.common.BugleSearchView;
import defpackage.aajq;
import defpackage.aajt;
import defpackage.aarv;
import defpackage.aats;
import defpackage.aatu;
import defpackage.aatv;
import defpackage.aaua;
import defpackage.abdc;
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
import defpackage.alcm;
import defpackage.alcn;
import defpackage.amqh;
import defpackage.anen;
import defpackage.aozy;
import defpackage.apxb;
import defpackage.apya;
import defpackage.aqaa;
import defpackage.brg;
import defpackage.en;
import defpackage.enh;
import defpackage.eno;
import defpackage.hht;
import defpackage.ivf;
import defpackage.kqj;
import defpackage.krv;
import defpackage.mho;
import defpackage.utw;
import defpackage.xvw;
import defpackage.xyt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GifBrowserActivity extends aaua implements akkh, akkg, aklg {
    private aats H;
    private boolean J;
    private Context K;
    private eno M;
    private boolean N;
    private final akpr I = new akpr(this, this);
    private final long L = SystemClock.elapsedRealtime();

    private final aats aa() {
        ab();
        return this.H;
    }

    private final void ab() {
        if (this.H == null) {
            if (this.J) {
                if (this.N && !isFinishing()) {
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
                            if (activity instanceof GifBrowserActivity) {
                                GifBrowserActivity gifBrowserActivity = (GifBrowserActivity) activity;
                                gifBrowserActivity.getClass();
                                anen anenVar = (anen) ((kqj) aS).b.eh.b();
                                anen anenVar2 = (anen) ((kqj) aS).b.DD.b();
                                krv krvVar = ((kqj) aS).b;
                                apya apyaVar = krvVar.gD;
                                alcn alcnVar = (alcn) krvVar.a.dm.b();
                                alcm alcmVar = new alcm((alcn) ((kqj) aS).b.a.dm.b());
                                krv krvVar2 = ((kqj) aS).b;
                                this.H = new aats(gifBrowserActivity, anenVar, anenVar2, apyaVar, alcnVar, alcmVar, krvVar2.pY, (xyt) krvVar2.dS.b(), (abdc) ((kqj) aS).b.a.cX.b(), new aajq(((kqj) aS).av));
                                e.close();
                                this.H.v = this;
                                return;
                            }
                            throw new IllegalStateException(hht.d(activity, aats.class, "Attempt to inject a Activity wrapper of type "));
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
        return this.L;
    }

    @Override // defpackage.zgw
    public final /* synthetic */ apxb B() {
        return new aklr(this);
    }

    @Override // defpackage.akkh
    public final Class C() {
        return aats.class;
    }

    @Override // defpackage.akkh
    public final /* bridge */ /* synthetic */ Object E() {
        aats aatsVar = this.H;
        if (aatsVar != null) {
            if (!this.N) {
                return aatsVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.zgr
    protected final boolean F() {
        return false;
    }

    @Override // defpackage.aapj
    protected final amqh I() {
        aa();
        return amqh.GIF;
    }

    @Override // defpackage.aapj
    protected final Class J() {
        aa();
        return GifContentItem.class;
    }

    @Override // defpackage.dx, defpackage.enm
    public final enh N() {
        if (this.M == null) {
            this.M = new aklh(this);
        }
        return this.M;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.K;
        }
        aktp.E(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ex, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        this.K = context;
        aktp.D(context);
        super.attachBaseContext(context);
        this.K = null;
    }

    @Override // defpackage.aitz, android.app.Activity
    public final void finish() {
        aksa a = this.I.a();
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
        aksa j = this.I.j();
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
        aksa q = this.I.q();
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
        aksa b = this.I.b();
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
        aksa r = this.I.r();
        try {
            super.onConfigurationChanged(configuration);
            aats aa = aa();
            aa.k.ae(aa.i.d);
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) aa.j.m;
            if (staggeredGridLayoutManager != null) {
                staggeredGridLayoutManager.J(aats.c(configuration));
            }
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
    /* JADX WARN: Type inference failed for: r2v6, types: [armf, java.lang.Object] */
    @Override // defpackage.aapj, defpackage.zgu, defpackage.zgr, defpackage.zgw, defpackage.aitz, defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    public final void onCreate(Bundle bundle) {
        aksa s = this.I.s();
        try {
            this.J = true;
            ab();
            ((aklh) N()).h(this.I);
            aS().K().g();
            super.onCreate(bundle);
            aats aa = aa();
            aa.a.setContentView(R.layout.activity_gif_browser);
            aajq aajqVar = aa.u;
            GifBrowserActivity gifBrowserActivity = aa.a;
            aajt aajtVar = (aajt) aajqVar.a.b();
            aajtVar.getClass();
            aa.i = new aatv(aajtVar, gifBrowserActivity, aa);
            GifBrowserActivity gifBrowserActivity2 = aa.a;
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
            aa.l = (ProgressBar) aa.a.findViewById(R.id.gif_browser_loading_spinner);
            aa.k = (RecyclerView) aa.a.findViewById(R.id.gif_browser_category_recycler_view);
            aa.k.ag(aa.i);
            aa.k.aj(linearLayoutManager);
            aa.k.aF();
            aatu aatuVar = new aatu(aa.a, aa);
            aatuVar.A(true);
            aa.h = aatuVar;
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(aats.c(aa.a.getResources().getConfiguration()));
            staggeredGridLayoutManager.V(null);
            if (staggeredGridLayoutManager.h != 2) {
                staggeredGridLayoutManager.h = 2;
                staggeredGridLayoutManager.bc();
            }
            aa.j = (RecyclerView) aa.a.findViewById(R.id.gif_recycler_view);
            aa.j.ag(aa.h);
            aa.j.aj(staggeredGridLayoutManager);
            aa.j.aF();
            aozy createBuilder = aqaa.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((aqaa) createBuilder.b).b = 180;
            aqaa aqaaVar = (aqaa) createBuilder.s();
            Intent intent = aa.a.getIntent();
            aa.e.d = aa;
            alcm alcmVar = aa.e;
            aozy createBuilder2 = aqaa.a.createBuilder();
            int intExtra = intent.getIntExtra("max_attachment_width", 0);
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            ((aqaa) createBuilder2.b).b = intExtra;
            int intExtra2 = intent.getIntExtra("max_attachment_height", 0);
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            ((aqaa) createBuilder2.b).c = intExtra2;
            alcmVar.e.d = (aqaa) createBuilder2.s();
            aa.e.e.a = intent.getIntExtra("max_attachment_size", 0);
            alcm alcmVar2 = aa.e;
            alcmVar2.e.e = aqaaVar;
            alcmVar2.e.b = ((Integer) utw.e.e()).intValue();
            String stringExtra = intent.getStringExtra("search_text");
            aa.g(true);
            if (((Boolean) utw.d.e()).booleanValue() && TextUtils.isEmpty(stringExtra)) {
                aa.r = true;
                aa.f();
                aa.k(stringExtra);
            } else {
                aa.r = false;
                aa.s = stringExtra;
                aa.e.a(stringExtra);
                if (!aa.k(stringExtra)) {
                    aa.q = stringExtra;
                    aa.t = 4;
                } else {
                    aa.t = 3;
                }
            }
            View findViewById = aa.a.findViewById(R.id.gif_browser_activity);
            findViewById.setSystemUiVisibility(1792);
            findViewById.setOnApplyWindowInsetsListener(new ivf(12));
            aa.j.setOnApplyWindowInsetsListener(new ivf(13));
            ((mho) aa.c.b()).aG(2, aa.t, aa.n());
            this.J = false;
            this.I.l();
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

    @Override // defpackage.zgu, defpackage.aitz, android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        aats aa = aa();
        aa.a.getMenuInflater().inflate(R.menu.gif_browser_menu, menu);
        aa.p = (BugleSearchView) menu.findItem(R.id.action_search_gifs).getActionView();
        aa.p.setZeroEffectivePadding();
        aa.p.setMaxWidth(Integer.MAX_VALUE);
        aa.p.setQueryHint(aa.a.getString(R.string.c2o_gif_hint));
        aa.p.setOnQueryTextListener(aa);
        BugleSearchView bugleSearchView = aa.p;
        bugleSearchView.setImeOptions(bugleSearchView.getImeOptions() | VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        aa.p.getSearchTextView().setTypeface(xvw.a(aa.a));
        aa.n = (ImageView) aa.p.findViewById(R.id.search_close_btn);
        aa.n.setImageResource(R.drawable.tinted_quantum_ic_close_24);
        aa.o = (ImageView) aa.p.findViewById(R.id.search_button);
        aa.o.setOnClickListener(new aarv(aa, 7));
        if (!TextUtils.isEmpty(aa.q)) {
            aa.h(false);
            aa.p.setQuery(aa.q, false);
            aa.p.clearFocus();
        } else if (aa.a.getIntent().hasExtra("search_text")) {
            aa.h(true);
        } else {
            aa.h(false);
            aa.n.setVisibility(8);
        }
        aa.j();
        en j = aa.a.j();
        if (j != null) {
            j.setHomeAsUpIndicator((Drawable) null);
            j.setHomeActionContentDescription(R.string.action_back);
            j.setElevation(brg.a);
            View customView = j.getCustomView();
            if (customView == null || customView.getId() != R.id.gif_browser_title_container) {
                j.setDisplayShowTitleEnabled(false);
                j.setDisplayShowCustomEnabled(true);
                j.setCustomView(R.layout.action_bar_gif_browser_title_m2);
                TextView textView = (TextView) j.getCustomView().findViewById(R.id.gif_browser_title);
                textView.setText(aa.a.getString(R.string.action_search_gifs));
                textView.setOnClickListener(new aarv(aa, 8));
            }
        }
        return true;
    }

    @Override // defpackage.re, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        aksa t = this.I.t();
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
        aksa c = this.I.c();
        try {
            aats aa = aa();
            alcm alcmVar = aa.e;
            alcmVar.b.removeCallbacks(alcmVar.a);
            alcmVar.d = null;
            ((mho) aa.c.b()).aG(5, aa.t, aa.n());
            super.onDestroy();
            this.N = true;
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
        aksa d = this.I.d(intent);
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

    @Override // defpackage.aapj, defpackage.zgu, defpackage.aitz, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        aksa v = this.I.v();
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
        aksa e = this.I.e();
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
        aksa w = this.I.w();
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
        aksa x = this.I.x();
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
        aksa f = this.I.f();
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
        aksa y = this.I.y();
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
        aksa g = this.I.g();
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
        aksa z = this.I.z();
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
        aksa h = this.I.h();
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
        aksa i = this.I.i();
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
        aksa k = this.I.k();
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
