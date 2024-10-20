package com.google.android.apps.messaging.main;

import android.app.Activity;
import android.app.DirectAction;
import android.app.VoiceInteractor;
import android.app.assist.AssistContent;
import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.SystemClock;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import defpackage.aegl;
import defpackage.agol;
import defpackage.ahka;
import defpackage.ahqe;
import defpackage.ajpx;
import defpackage.ajqy;
import defpackage.akec;
import defpackage.akkg;
import defpackage.akkh;
import defpackage.aklg;
import defpackage.aklh;
import defpackage.aklr;
import defpackage.akmy;
import defpackage.akpr;
import defpackage.akqj;
import defpackage.akrc;
import defpackage.akrh;
import defpackage.aksa;
import defpackage.aksr;
import defpackage.akto;
import defpackage.aktp;
import defpackage.akwb;
import defpackage.akwm;
import defpackage.akwn;
import defpackage.akwo;
import defpackage.akwp;
import defpackage.akwq;
import defpackage.akws;
import defpackage.akwv;
import defpackage.alaz;
import defpackage.albl;
import defpackage.albo;
import defpackage.alvg;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.anna;
import defpackage.aoyj;
import defpackage.aozy;
import defpackage.apag;
import defpackage.apax;
import defpackage.apxb;
import defpackage.apxv;
import defpackage.apxx;
import defpackage.apya;
import defpackage.aqws;
import defpackage.armd;
import defpackage.arwe;
import defpackage.cg;
import defpackage.cj;
import defpackage.d;
import defpackage.el;
import defpackage.en;
import defpackage.enh;
import defpackage.eno;
import defpackage.fcv;
import defpackage.hht;
import defpackage.iba;
import defpackage.ibb;
import defpackage.ibn;
import defpackage.ibp;
import defpackage.ihu;
import defpackage.ijf;
import defpackage.ipq;
import defpackage.isa;
import defpackage.ivi;
import defpackage.ivl;
import defpackage.ixd;
import defpackage.ixo;
import defpackage.jh;
import defpackage.jyp;
import defpackage.kju;
import defpackage.kpr;
import defpackage.kpt;
import defpackage.kqj;
import defpackage.krv;
import defpackage.krx;
import defpackage.ksj;
import defpackage.kux;
import defpackage.kvw;
import defpackage.kwf;
import defpackage.lel;
import defpackage.leq;
import defpackage.leu;
import defpackage.lex;
import defpackage.lga;
import defpackage.llh;
import defpackage.lpg;
import defpackage.lqv;
import defpackage.lqx;
import defpackage.oyb;
import defpackage.qoq;
import defpackage.rrl;
import defpackage.xxy;
import defpackage.yah;
import defpackage.yjv;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MainActivity extends lel implements akkh, akkg, aklg {
    private lex G;
    private boolean I;
    private Context J;
    private eno L;
    private boolean M;
    private final akpr H = new akpr(this, this);
    private final long K = SystemClock.elapsedRealtime();

    private final lex aa() {
        ab();
        return this.G;
    }

    private final void ab() {
        akrh akrhVar;
        if (this.G == null) {
            if (this.I) {
                if (this.M && !isFinishing()) {
                    throw new IllegalStateException("createPeer() called after destroyed.");
                }
                akrh e = aktp.e("CreateComponent");
                try {
                    aS();
                    e.close();
                    akrh e2 = aktp.e("CreatePeer");
                    try {
                        try {
                            try {
                                Object aS = aS();
                                Activity activity = (Activity) ((kqj) aS).c.b();
                                if (activity instanceof MainActivity) {
                                    MainActivity mainActivity = (MainActivity) activity;
                                    mainActivity.getClass();
                                    apya apyaVar = ((kqj) aS).D;
                                    krv krvVar = ((kqj) aS).b;
                                    apya apyaVar2 = krvVar.bV;
                                    apya apyaVar3 = ((kqj) aS).M;
                                    apya apyaVar4 = krvVar.si;
                                    apya apyaVar5 = krvVar.bB;
                                    apya apyaVar6 = ((kqj) aS).O;
                                    krx krxVar = krvVar.a;
                                    apya apyaVar7 = krxVar.dV;
                                    apya apyaVar8 = krxVar.ey;
                                    apya apyaVar9 = krvVar.pH;
                                    apya apyaVar10 = krvVar.dt;
                                    akrhVar = e2;
                                    apya apyaVar11 = krvVar.dn;
                                    try {
                                        apya apyaVar12 = krvVar.yJ;
                                        apya apyaVar13 = krvVar.gD;
                                        apya apyaVar14 = ((kqj) aS).d;
                                        aksr aksrVar = (aksr) krvVar.at.b();
                                        apya apyaVar15 = ((kqj) aS).R;
                                        aqws aqwsVar = (aqws) ((kqj) aS).k.b();
                                        ipq ipqVar = (ipq) ((kqj) aS).S.b();
                                        apya apyaVar16 = ((kqj) aS).C;
                                        apya apyaVar17 = ((kqj) aS).U;
                                        Optional of = Optional.of(((kqj) aS).b.a.fQ);
                                        krx krxVar2 = ((kqj) aS).b.a;
                                        apya apyaVar18 = krxVar2.c;
                                        apya apyaVar19 = ((kqj) aS).B;
                                        ibb ibbVar = (ibb) krxVar2.fJ.b();
                                        apya apyaVar20 = ((kqj) aS).W;
                                        apya apyaVar21 = ((kqj) aS).F;
                                        apya apyaVar22 = ((kqj) aS).X;
                                        apya apyaVar23 = ((kqj) aS).Y;
                                        apya apyaVar24 = ((kqj) aS).J;
                                        krv krvVar2 = ((kqj) aS).b;
                                        apya apyaVar25 = krvVar2.aM;
                                        apya apyaVar26 = ((kqj) aS).Z;
                                        apya apyaVar27 = ((kqj) aS).aa;
                                        apya apyaVar28 = ((kqj) aS).K;
                                        apya apyaVar29 = ((kqj) aS).o;
                                        krx krxVar3 = krvVar2.a;
                                        apya apyaVar30 = krxVar3.A;
                                        apya apyaVar31 = ((kqj) aS).ab;
                                        apya apyaVar32 = ((kqj) aS).ac;
                                        apya apyaVar33 = krxVar3.da;
                                        apya apyaVar34 = krvVar2.fC;
                                        Optional of2 = Optional.of((iba) krxVar3.fK.b());
                                        apya apyaVar35 = ((kqj) aS).ad;
                                        apya apyaVar36 = ((kqj) aS).af;
                                        apxv.a(((kqj) aS).ag);
                                        krv krvVar3 = ((kqj) aS).b;
                                        Optional empty = Optional.empty();
                                        apya apyaVar37 = ((kqj) aS).ah;
                                        apya apyaVar38 = ((kqj) aS).G;
                                        krv krvVar4 = ((kqj) aS).b;
                                        apya apyaVar39 = krvVar4.a.dQ;
                                        apya apyaVar40 = krvVar4.rZ;
                                        arwe arweVar = (arwe) krvVar4.dP.b();
                                        krv krvVar5 = ((kqj) aS).b;
                                        apya apyaVar41 = krvVar5.dq;
                                        apya apyaVar42 = krvVar5.um;
                                        apya apyaVar43 = krvVar5.yD;
                                        krx krxVar4 = krvVar5.a;
                                        this.G = new lex(mainActivity, apyaVar, apyaVar2, apyaVar3, apyaVar4, apyaVar5, apyaVar6, apyaVar7, apyaVar8, apyaVar9, apyaVar10, apyaVar11, apyaVar12, apyaVar13, apyaVar14, aksrVar, apyaVar15, aqwsVar, ipqVar, apyaVar16, apyaVar17, of, apyaVar18, apyaVar19, ibbVar, apyaVar20, apyaVar21, apyaVar22, apyaVar23, apyaVar24, apyaVar25, apyaVar26, apyaVar27, apyaVar28, apyaVar29, apyaVar30, apyaVar31, apyaVar32, apyaVar33, apyaVar34, of2, apyaVar35, apyaVar36, empty, apyaVar37, apyaVar38, apyaVar39, apyaVar40, arweVar, apyaVar41, apyaVar42, apyaVar43, krxVar4.fT, krxVar4.fy, krxVar4.fU, krxVar4.fV, krvVar5.cU, krxVar4.fx, krxVar4.fW);
                                        akrhVar.close();
                                        this.G.R = this;
                                        return;
                                    } catch (Throwable th) {
                                        th = th;
                                        Throwable th2 = th;
                                        try {
                                            akrhVar.close();
                                            throw th2;
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                            throw th2;
                                        }
                                    }
                                }
                                throw new IllegalStateException(hht.d(activity, lex.class, "Attempt to inject a Activity wrapper of type "));
                            } catch (ClassCastException e3) {
                                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e3);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            akrhVar = e2;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } finally {
                }
            } else {
                throw new IllegalStateException("createPeer() called outside of onCreate");
            }
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
        return lex.class;
    }

    @Override // defpackage.akkh
    public final /* bridge */ /* synthetic */ Object E() {
        lex lexVar = this.G;
        if (lexVar != null) {
            if (!this.M) {
                return lexVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.zgr
    protected final boolean F() {
        return aa().v.isEmpty();
    }

    @Override // defpackage.zgu
    public final boolean G() {
        aa().v.isPresent();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zgr
    public final void H() {
        lex aa = aa();
        aa.v.isPresent();
        if (aa.d().e()) {
            ahqe.a.d(new ahka("HomeScreen"));
        } else if (aa.d().d()) {
            ahqe.a.d(new ahka("ConversationScreen"));
        } else {
            super.H();
        }
    }

    @Override // defpackage.zgv
    public final void I(Toolbar toolbar) {
        aa().N(toolbar);
    }

    public final void J(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final void K() {
        super.recreate();
    }

    public final void L(Toolbar toolbar) {
        super.I(toolbar);
    }

    @Override // defpackage.zgu
    public final boolean M() {
        return aa().R();
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zgu
    public final void fa(en enVar) {
        super.fa(enVar);
        lex aa = aa();
        aa.v.isPresent();
        if (aa.T() && aa.d().d()) {
            enVar.hide();
            return;
        }
        ixd n = aa.n();
        if ((aa.c() == null || !aa.d().c()) && n != null && aa.d().d()) {
            if (!((Boolean) n.H(new isa(9), new ivi(enVar, 1))).booleanValue()) {
                cj fe = n.M.fe();
                if (fe != null) {
                    enVar.setBackgroundDrawable(new ColorDrawable(fe.getColor(R.color.color_primary_background_alpha96)));
                }
                int i = 16;
                if (n.aZ() && !n.aY()) {
                    enVar.setDisplayOptions(16);
                } else {
                    enVar.setDisplayOptions(20);
                    enVar.setHomeAsUpIndicator(0);
                    enVar.setHomeActionContentDescription(n.q().getResources().getString(R.string.navigate_up_button_content_description));
                }
                View customView = enVar.getCustomView();
                byte[] bArr = null;
                if (customView == null || customView.getId() != R.id.conversation_title_container) {
                    customView = LayoutInflater.from(n.q()).inflate(R.layout.action_bar_conversation_name, (ViewGroup) null);
                    enVar.setCustomView(customView, new el(-1, -1));
                }
                if (n.ce == null) {
                    n.cc = (ViewGroup) customView.findViewById(R.id.conversation_title_container);
                    n.cd = (ContactIconView) customView.findViewById(R.id.action_bar_contact_icon);
                    n.ce = (TextView) customView.findViewById(R.id.conversation_title);
                    n.cf = (TextView) customView.findViewById(R.id.conversation_subtitle);
                    customView.addOnLayoutChangeListener(new yah(n, customView, 1));
                }
                ViewGroup viewGroup = n.cc;
                if (viewGroup != null) {
                    viewGroup.setOnClickListener(new akwb(n.aC, "ConversationFragmentPeer#updateActionBar", new jh(n, i, bArr), 1));
                }
                ContactIconView contactIconView = n.cd;
                if (contactIconView != null) {
                    contactIconView.n = false;
                    String str = ((rrl) n.ca.a()).b.j;
                    if (str == null) {
                        n.cd.i(null);
                    } else {
                        n.cd.i(Uri.parse(str));
                    }
                }
                n.aG();
                String I = n.I();
                int i2 = 2;
                if (!TextUtils.isEmpty(I)) {
                    n.ce.setContentDescription((String) Collection.EL.stream(anna.g(", ").c(I)).map(new ivi(n, i2)).collect(Collectors.joining(", ")));
                    n.q().setTitle(I);
                } else {
                    String S = n.M.S(R.string.app_name);
                    if (!n.aZ()) {
                        n.ce.setText(S);
                        n.q().setTitle(S);
                    }
                }
                n.ce.invalidate();
                n.ce.requestLayout();
                if (!n.aZ()) {
                    if (n.as.b && n.av.m() && !n.aY()) {
                        enVar.hide();
                    } else {
                        enVar.show();
                    }
                }
                int[] iArr = new int[2];
                customView.getLocationInWindow(iArr);
                n.D = iArr[1] + customView.getMeasuredHeight();
            }
            if (aa.d().b()) {
                enVar.setDisplayHomeAsUpEnabled(false);
            }
        }
        if (aa.d().e()) {
            enVar.hide();
        } else {
            enVar.show();
        }
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

    @Override // defpackage.aitz, defpackage.cj
    public final void h(cg cgVar) {
        super.h(cgVar);
        lex aa = aa();
        aa.v.isPresent();
        if (cgVar instanceof kux) {
            aa.B = ((kux) cgVar).E();
        }
        kvw kvwVar = aa.B;
        if (kvwVar != null) {
            kvwVar.aG = aa;
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
        String string;
        lqx lqxVar;
        kvw p;
        aksa q = this.H.q();
        try {
            super.onActivityResult(i, i2, intent);
            lex aa = aa();
            aa.v.isPresent();
            if (((Boolean) xxy.e.e()).booleanValue() && (p = aa.p()) != null && kpt.a() && xxy.a() && ((Boolean) xxy.e.e()).booleanValue() && p.bk.get() && ((Optional) ((apxx) p.an).a).isPresent()) {
                ((ihu) ((Optional) ((apxx) p.an).a).get()).a();
            }
            if (i == 2) {
                if (i2 == -1) {
                    ixd n = aa.n();
                    if (n != null) {
                        n.ck = true;
                    } else {
                        alvw h = lex.a.h();
                        h.X(alwp.a, "Bugle");
                        ((alvg) h.h("com/google/android/apps/messaging/main/MainActivityPeer", "onActivityResult", 1917, "MainActivityPeer.kt")).q("ConversationFragment is missing after launching AttachmentChooserActivity!");
                    }
                    q.close();
                }
                i = 2;
            }
            if (i == 201) {
                kvw p2 = aa.p();
                if (p2 != null && (lqxVar = p2.ao) != null) {
                    MainActivity mainActivity = aa.b;
                    for (lqv lqvVar : lqxVar.g) {
                        lqvVar.g(mainActivity, i2);
                    }
                }
            } else if (i == 1038) {
                if (i2 == -1) {
                    string = aa.b.getString(R.string.manual_msisdn_complete_snack_bar_text);
                } else {
                    string = aa.b.getString(R.string.manual_msisdn_skipped_snack_bar_text_v2);
                }
                string.getClass();
                lga.E(aa.b, string);
            } else if (i2 == 1) {
                aa.b.finish();
            }
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
        ViewTreeObserver viewTreeObserver;
        aksa r = this.H.r();
        try {
            super.onConfigurationChanged(configuration);
            lex aa = aa();
            aa.v.isPresent();
            ixd n = aa.n();
            if (n != null) {
                n.E();
            }
            if (lga.q(aa.b, aa.P.a) != aa.H) {
                View findViewById = aa.b.findViewById(android.R.id.content);
                if (findViewById != null && (viewTreeObserver = findViewById.getViewTreeObserver()) != null) {
                    viewTreeObserver.addOnPreDrawListener(new leu(aa, findViewById, 0));
                }
                aa.I();
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
    /* JADX WARN: Type inference failed for: r1v3, types: [akln, java.lang.Object] */
    @Override // defpackage.zgv, defpackage.zgu, defpackage.zgr, defpackage.zgw, defpackage.aitz, defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    public final void onCreate(Bundle bundle) {
        aksa s = this.H.s();
        try {
            this.I = true;
            ab();
            ((aklh) N()).h(this.H);
            aS().K().g();
            aa().B(bundle);
            aktp.bG(this).a = findViewById(android.R.id.content);
            lex lexVar = this.G;
            aktp.F(this, llh.class, new kwf(lexVar, 6));
            aktp.F(this, kpr.class, new kwf(lexVar, 7));
            this.I = false;
            this.H.l();
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
        MessageCoreData messageCoreData;
        aksa c = this.H.c();
        try {
            super.onDestroy();
            lex aa = aa();
            aa.v.isPresent();
            ixd n = aa.n();
            if (n != null) {
                messageCoreData = n.E();
            } else {
                messageCoreData = null;
            }
            aa.N = messageCoreData;
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

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, apbt] */
    @Override // defpackage.aitz, android.app.Activity
    public final void onGetDirectActions(CancellationSignal cancellationSignal, Consumer consumer) {
        DirectAction.Builder extras;
        DirectAction.Builder locusId;
        DirectAction build;
        DirectAction.Builder extras2;
        DirectAction.Builder locusId2;
        DirectAction build2;
        Bundle extras3;
        Bundle extras4;
        VoiceInteractor voiceInteractor;
        boolean isDestroyed;
        lex aa = aa();
        cancellationSignal.getClass();
        consumer.getClass();
        ibp ibpVar = aa.L;
        if (ibpVar != null && ((Boolean) ibn.a.e()).booleanValue()) {
            Object obj = ibpVar.b().c;
            ArrayList arrayList = new ArrayList();
            int i = 17;
            ajpx ajpxVar = new ajpx(arrayList, i);
            akwn akwnVar = (akwn) obj;
            akwm akwmVar = new akwm(akwnVar.d, 0);
            aozy createBuilder = alaz.a.createBuilder();
            akws akwsVar = akwnVar.e;
            Iterable iterable = (Iterable) Collection.EL.stream(((aegl) akwsVar).a).filter(new agol(akwsVar, 12)).map(new ajqy(i)).collect(Collectors.toList());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            alaz alazVar = (alaz) createBuilder.b;
            apax apaxVar = alazVar.d;
            if (!apaxVar.c()) {
                alazVar.d = apag.mutableCopy(apaxVar);
            }
            aoyj.addAll(iterable, alazVar.d);
            aozy createBuilder2 = albl.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar = createBuilder2.b;
            albl alblVar = (albl) apagVar;
            alblVar.b |= 1;
            alblVar.c = 0L;
            if (!apagVar.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar2 = createBuilder2.b;
            albl alblVar2 = (albl) apagVar2;
            alblVar2.b |= 2;
            alblVar2.d = 0L;
            if (!apagVar2.isMutable()) {
                createBuilder2.u();
            }
            albl alblVar3 = (albl) createBuilder2.b;
            alblVar3.b |= 4;
            alblVar3.e = 1L;
            albl alblVar4 = (albl) createBuilder2.s();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            alaz alazVar2 = (alaz) createBuilder.b;
            alblVar4.getClass();
            alazVar2.c = alblVar4;
            alazVar2.b |= 1;
            akwq akwqVar = new akwq(DesugarCollections.unmodifiableList(new ArrayList(Collections.singletonList(new akmy((alaz) createBuilder.s())))));
            akwnVar.c.set(false);
            if (!((Optional) akwnVar.b.getAndSet(Optional.of(akwmVar))).isPresent()) {
                akwnVar.e.e.add(obj);
                akwo akwoVar = akwnVar.d;
                akwm akwmVar2 = new akwm(obj, 2);
                if (!akwoVar.a.isDestroyed() && (voiceInteractor = akwoVar.a.getVoiceInteractor()) != null) {
                    isDestroyed = voiceInteractor.isDestroyed();
                    if (!isDestroyed) {
                        voiceInteractor.registerOnDestroyedCallback(new fcv(akwoVar.b, 10), akwmVar2);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (akmy akmyVar : akwqVar.a) {
                DirectAction.Builder builder = new DirectAction.Builder("app_action");
                Bundle bundle = new Bundle();
                bundle.putBundle("metadata", albo.s("app_action_metadata", akmyVar.a));
                extras2 = builder.setExtras(bundle);
                locusId2 = extras2.setLocusId(new LocusId("unused"));
                build2 = locusId2.build();
                AtomicReference atomicReference = akwv.a;
                extras3 = build2.getExtras();
                extras3.getClass();
                extras4 = build2.getExtras();
                extras4.putString("com.google.assistant.appactions.HANDOVER_TOKEN", (String) ((Optional) akwv.a.get()).orElse(null));
                arrayList2.add(build2);
            }
            ajpxVar.q(DesugarCollections.unmodifiableList(arrayList2));
            akwo akwoVar2 = ((akwp) obj).d;
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("component_name", akwoVar2.a.getComponentName());
            extras = new DirectAction.Builder("foreground_app").setExtras(bundle2);
            locusId = extras.setLocusId(new LocusId("unused"));
            build = locusId.build();
            arrayList.add(build);
            consumer.q(DesugarCollections.unmodifiableList(arrayList));
            return;
        }
        super.onGetDirectActions(cancellationSignal, consumer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aitz, defpackage.re, android.app.Activity
    public final void onNewIntent(Intent intent) {
        aksa d = this.H.d(intent);
        try {
            super.onNewIntent(intent);
            lex aa = aa();
            intent.getClass();
            aa.v.isPresent();
            ConversationId s = aa.s(intent);
            if (s != null && !d.F(s, aa.r())) {
                Bundle extras = intent.getExtras();
                ((qoq) aa.c.b()).p(aa.b, s, Integer.valueOf(intent.getIntExtra("conversation_state", 1)), (MessageCoreData) intent.getParcelableExtra("draft_data"), intent.getBooleanExtra("open_keyboard", false), extras);
                aa.b.finish();
            } else {
                aa.M = true;
                MainActivity mainActivity = aa.b;
                MessageCoreData t = aa.t(intent);
                if (s == null && (t != null || intent.getBooleanExtra("open_keyboard", false))) {
                    lpg.m(aa.d().c, intent, false);
                }
                mainActivity.setIntent(intent);
                ixd n = aa.n();
                MessageCoreData t2 = aa.t(intent);
                if (n != null && t2 != null) {
                    n.aH(t2, intent.getBooleanExtra("combine_draft", false));
                    lga.o(intent);
                }
            }
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
            lex aa = aa();
            menuItem.getClass();
            aa.v.isPresent();
            boolean z = true;
            if (!super.onOptionsItemSelected(menuItem)) {
                if (menuItem.getItemId() == 16908332) {
                    aa.D();
                } else {
                    z = false;
                }
            }
            v.close();
            return z;
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
            lex aa = aa();
            aa.v.isPresent();
            aa.F = true;
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

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f7, code lost:
    
        if (r5 != 2) goto L33;
     */
    @Override // defpackage.aitz, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPerformDirectAction(java.lang.String r9, android.os.Bundle r10, android.os.CancellationSignal r11, java.util.function.Consumer r12) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.main.MainActivity.onPerformDirectAction(java.lang.String, android.os.Bundle, android.os.CancellationSignal, java.util.function.Consumer):void");
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

    @Override // defpackage.aitz, android.app.Activity
    public final void onProvideAssistContent(AssistContent assistContent) {
        ixo o;
        String str;
        String str2;
        super.onProvideAssistContent(assistContent);
        lex aa = aa();
        assistContent.getClass();
        aa.v.isPresent();
        ixd n = aa.n();
        if (n != null && n.aT()) {
            ConversationId r = aa.r();
            if (r != null) {
                str = r.b();
            } else {
                str = null;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                if (n.bc()) {
                    str2 = "Individual";
                } else {
                    str2 = "Group";
                }
                jSONObject.put("conversation_type", str2).put("conversation_id", str);
            } catch (JSONException e) {
                alvw i = lex.a.i();
                i.X(alwp.a, "Bugle");
                ((alvg) ((alvg) i).g(e).h("com/google/android/apps/messaging/main/MainActivityPeer", "onProvideAssistContent", 2049, "MainActivityPeer.kt")).q("Error parsing ConversationData for Assistant");
            }
            assistContent.setStructuredData(jSONObject.toString());
            assistContent.getIntent().putExtra("conversation_id", str);
            ConversationId r2 = aa.r();
            if (r2 != null) {
                assistContent.getIntent().putExtra("mapi_conversation_id", r2);
            }
        }
        if (((oyb) aa.y.b()).a() && (o = aa.o()) != null) {
            o.f(assistContent);
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
    @Override // defpackage.zgu, defpackage.zgr, android.app.Activity
    public final void onRestart() {
        super.onRestart();
        lex aa = aa();
        aa.v.isPresent();
        if (!kpt.b() && !aa.Q()) {
            return;
        }
        ((Optional) ((apxx) aa.r).a).ifPresent(new leq(jyp.p, 2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zgu, defpackage.zgr, defpackage.aitz, defpackage.cj, android.app.Activity
    public final void onResume() {
        aksa g = this.H.g();
        try {
            super.onResume();
            lex aa = aa();
            akrh e = aktp.e("MainActivity#onResume");
            try {
                aa.v.isPresent();
                aa.E = false;
                aa.F = false;
                MainActivity mainActivity = aa.b;
                int i = ksj.a;
                aa.O();
                int i2 = 1;
                if (aa.M) {
                    Intent intent = aa.b.getIntent();
                    intent.getClass();
                    aa.H(intent, null, true);
                    aa.G(intent, intent.getBooleanExtra("via_notification", false));
                    aa.M = false;
                }
                if (!((yjv) aa.o.b()).d() && aa.d().c() && aa.a() != null) {
                    aa.L();
                }
                if (kpt.b() || aa.Q()) {
                    ((Optional) ((apxx) aa.r).a).ifPresent(new leq(new kju(aa, 8), i2));
                }
                armd.i(e, null);
                g.close();
            } finally {
            }
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
            lex aa = aa();
            bundle.getClass();
            aa.v.isPresent();
            bundle.putParcelable("uistate", aa.d().clone());
            bundle.putParcelable("usstate", aa.m());
            bundle.putBoolean("rcscapabilityupdate", aa.I);
            bundle.putBoolean("shouldclearactivitystack", aa.J);
            aa.E = true;
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
            lex aa = aa();
            akrh e = aktp.e("MainActivity#onStart");
            try {
                aa.v.isPresent();
                aa.G = false;
                armd.i(e, null);
                h.close();
            } finally {
            }
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
            lex aa = aa();
            aa.v.isPresent();
            aa.G = true;
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

    @Override // defpackage.aitz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ixd n;
        super.onWindowFocusChanged(z);
        lex aa = aa();
        aa.v.isPresent();
        akrc b = aa.g.b("ConversationActivityPeer onWindowFocusChanged");
        try {
            if (((Boolean) ijf.a.e()).booleanValue()) {
                ixd n2 = aa.n();
                if (n2 != null) {
                    boolean S = n2.cB.S();
                    n2.cB.K();
                    if (z) {
                        n2.ax();
                        if (S) {
                            n2.bR.post(new ivl(n2, 2));
                        }
                    }
                }
                armd.i(b, null);
                return;
            }
            if (z && (n = aa.n()) != null) {
                n.ax();
            }
            armd.i(b, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                armd.i(b, th);
                throw th2;
            }
        }
    }

    @Override // android.app.Activity
    public final void recreate() {
        aa().I();
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
