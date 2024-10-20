package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.common.ListEmptyView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import defpackage.aklx;
import j$.time.Duration;
import j$.util.Optional;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kux extends kwo implements akkh, apxq, akkf, aklk, akrw, akwc {
    private boolean ag;
    private kvw d;
    private Context e;
    public final eno a = new eno(this);
    private final akmy ah = new akmy((byte[]) null);

    @Deprecated
    public kux() {
        aiut.c();
    }

    public static kux a(ajwt ajwtVar) {
        kux kuxVar = new kux();
        apxh.e(kuxVar);
        aklw.b(kuxVar, ajwtVar);
        return kuxVar;
    }

    @Override // defpackage.akkh
    public final Class C() {
        return kvw.class;
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akrh e;
        ViewGroup viewGroup2;
        this.c.k();
        try {
            aM(layoutInflater, viewGroup, bundle);
            kvw E = E();
            akrh e2 = aktp.e("HomeFragment#onCreateView");
            try {
                if (((ohs) E.bi.b()).a()) {
                    e = aktp.e("setupRootView");
                    try {
                        viewGroup2 = E.h(layoutInflater, viewGroup);
                        e.close();
                    } finally {
                    }
                } else {
                    e = aktp.e("setupRootView");
                    try {
                        E.h(layoutInflater, viewGroup);
                        e.close();
                        E.v(bundle);
                        viewGroup2 = E.aD;
                    } finally {
                    }
                }
                e2.close();
                if (viewGroup2 == null) {
                    lga.N(this, E());
                }
                akqj.p();
                return viewGroup2;
            } finally {
            }
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg, defpackage.enm
    public final enh N() {
        return this.a;
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void X(int i, int i2, Intent intent) {
        aksa f = this.c.f();
        try {
            aO(i, i2, intent);
            kvw E = E();
            if (xxy.a() && (i == 719461746 || i == 719461747 || i == 719461748)) {
                ((Optional) ((apxx) E.am).a).ifPresent(new ixe(12));
            } else {
                if (i == 1) {
                    if (i2 == -1) {
                        kuy.a.o("successfully set as default sms");
                        E.s();
                        E.T.b();
                    } else {
                        i = 1;
                    }
                }
                if (((Boolean) ((utz) abgh.a.get()).e()).booleanValue() && i == 101 && i2 == -1) {
                    abfh abfhVar = (abfh) E.Q.b();
                    cj F = E.b.F();
                    intent.getClass();
                    int intExtra = intent.getIntExtra("welcome_flow_result", 0);
                    alvw m = abfh.b.m();
                    m.X(ydl.M, "WelcomeFlowEntryPoint");
                    m.r("Handling finish event with result: %s", intExtra);
                    if (aczv.D() && ((abgg) abfhVar.e.b()).f()) {
                        ((lqx) abfhVar.g.b()).d(15);
                        if (aczv.G()) {
                            ((lqx) abfhVar.g.b()).d(4);
                        }
                    } else if (intExtra != 1) {
                        if (intExtra == 2) {
                            qjh.l(abfhVar.c, null, new aafa(abfhVar, F, (arpe) null, 10, (byte[]) null), 3);
                        }
                    } else {
                        qjh.l(abfhVar.c, null, new aafa(abfhVar, F, (arpe) null, 9), 3);
                    }
                    E.g(E.b).setVisibility(0);
                }
            }
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

    @Override // defpackage.kwo, defpackage.aiuc, defpackage.cg
    public final void Y(Activity activity) {
        this.c.k();
        try {
            super.Y(activity);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiuc, defpackage.cg
    public final void Z(Menu menu, MenuInflater menuInflater) {
        super.Z(menu, menuInflater);
        E().E(menuInflater);
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final boolean aC(MenuItem menuItem) {
        aksa j = this.c.j();
        try {
            bg(menuItem);
            boolean C = E().C(menuItem);
            j.close();
            return C;
        } catch (Throwable th) {
            try {
                j.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg
    public final void aG(Intent intent) {
        if (akec.y(intent, x().getApplicationContext())) {
            akto.m(intent);
        }
        super.aG(intent);
    }

    @Override // defpackage.akkf
    @Deprecated
    public final Context aU() {
        if (this.e == null) {
            this.e = new aklm(this, super.x());
        }
        return this.e;
    }

    @Override // defpackage.aklf, defpackage.akrw
    public final aktr aW() {
        return this.c.a;
    }

    @Override // defpackage.aklk
    public final Locale aX() {
        return akec.q(this);
    }

    @Override // defpackage.aklf, defpackage.akrw
    public final void aY(aktr aktrVar, boolean z) {
        this.c.e(aktrVar, z);
    }

    @Override // defpackage.aklf, defpackage.akrw
    public final void aZ(aktr aktrVar) {
        this.c.b = aktrVar;
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void aa() {
        agmc agmcVar;
        agmc agmcVar2;
        aksa b = this.c.b();
        try {
            aQ();
            kvw E = E();
            alvw g = kvw.a.g();
            g.X(alwp.a, "HomeFragmentFlogger");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onDestroy", 3457, "HomeFragmentPeer.java")).q("HomeFragment onDestroy called");
            kyf D = E.D();
            if (D.r != null && abal.c() && ((Optional) ((apxx) D.h).a).isPresent()) {
                ((woj) ((Optional) ((apxx) D.h).a).get()).l();
            }
            kxx kxxVar = D.f;
            if (kxxVar != null) {
                lbt lbtVar = kxxVar.m;
                ldc ldcVar = lbtVar.c;
                if (ldcVar != null && (agmcVar2 = lbtVar.e) != null) {
                    ldcVar.G(agmcVar2);
                }
                lca lcaVar = lbtVar.d;
                if (lcaVar != null && (agmcVar = lbtVar.f) != null) {
                    lcaVar.G(agmcVar);
                }
            }
            E.aO.f();
            kuz kuzVar = E.aG;
            if (kuzVar != null) {
                kuzVar.f();
            }
            ((wtt) E.n.b()).d();
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

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void ad() {
        lqy lqyVar;
        this.c.k();
        try {
            ba();
            kvw E = E();
            alvw g = kvw.a.g();
            g.X(alwp.a, "HomeFragmentFlogger");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onPause", 3058, "HomeFragmentPeer.java")).q("HomeFragment onPause called");
            laj lajVar = (laj) E.v.b();
            mdg mdgVar = lajVar.n;
            if (mdgVar != null) {
                mdgVar.a();
                lajVar.n = null;
            }
            E.aR = false;
            ((rrt) E.aO.a()).d(false);
            if (E.aE.a() && (lqyVar = E.aQ) != null) {
                lqyVar.g(E.b.F());
                lqx lqxVar = E.ao;
                E.b.F();
                lqv lqvVar = lqxVar.j;
                if (lqvVar != null) {
                    lqvVar.i();
                }
            }
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void af() {
        aksa b = this.c.b();
        try {
            bb();
            kvw E = E();
            alvw g = kvw.a.g();
            g.X(alwp.a, "HomeFragmentFlogger");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onResume", 2566, "HomeFragmentPeer.java")).q("HomeFragment onResume called");
            akrh e = aktp.e("HomeFragment#onResume");
            try {
                ((laj) E.v.b()).a(laj.b);
                E.s.j(4);
                E.aR = true;
                akrh e2 = aktp.e("setDefaultSmsValueAndUpdateUi");
                try {
                    E.s();
                    e2.close();
                    akrh e3 = aktp.e("setScrolledToNewestConversationIfNeeded");
                    try {
                        E.u();
                        e3.close();
                        e3 = aktp.e("registerGrowthKitCallbacks");
                        try {
                            E.b.F();
                            int i = ksj.a;
                            e3.close();
                            laj lajVar = (laj) E.v.b();
                            amld amldVar = (amld) amld.a.createBuilder().s();
                            lajVar.n = ((mgu) lajVar.k.b()).h(173374, Duration.ofMinutes(10L));
                            aktp.ah(new irs(lajVar, amldVar, 14, null), lajVar.f);
                            lag lagVar = E.s;
                            lag.a.o("Marking homeFragmentShown");
                            lagVar.i.compareAndSet(false, true);
                            if (((ohi) E.av.b()).a()) {
                                ((Optional) ((apxx) E.aw).a).ifPresent(new ixe(13));
                            }
                            e.close();
                            b.close();
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        e2.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                b.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void ag(View view, Bundle bundle) {
        this.c.k();
        try {
            aktp.bH(this).a = view;
            E();
            lga.N(this, E());
            bf(view, bundle);
            kvw E = E();
            alvw g = kvw.a.g();
            g.X(alwp.a, "HomeFragmentFlogger");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onViewCreated", 2552, "HomeFragmentPeer.java")).q("HomeFragment onViewCreated called");
            akrh e = aktp.e("HomeFragment#onViewCreated");
            try {
                ((nhh) E.U.b()).c();
                if (((ohs) E.bi.b()).a()) {
                    E.v(bundle);
                }
                e.close();
                akqj.p();
            } finally {
            }
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg
    public final void ar(boolean z) {
        d.H(z);
    }

    @Override // defpackage.cg
    public final void au(Intent intent) {
        if (akec.y(intent, x().getApplicationContext())) {
            akto.m(intent);
        }
        aG(intent);
    }

    @Override // defpackage.akkh
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final kvw E() {
        kvw kvwVar = this.d;
        if (kvwVar != null) {
            if (!this.ag) {
                return kvwVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.akwc
    public final akwa e(akvv akvvVar) {
        return this.ah.k(akvvVar);
    }

    /* JADX WARN: Type inference failed for: r4v287, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [armf, java.lang.Object] */
    @Override // defpackage.kwo, defpackage.aklf, defpackage.cg
    public final void f(Context context) {
        Throwable th;
        uye uyeVar;
        kux kuxVar = this;
        kuxVar.c.k();
        try {
            if (!kuxVar.ag) {
                super.f(context);
                if (kuxVar.d == null) {
                    try {
                        Object aS = aS();
                        ajwt ajwtVar = (ajwt) ((kql) aS).ej.b.b();
                        cg cgVar = (cg) ((apxx) ((kql) aS).d).a;
                        if (cgVar instanceof kux) {
                            kux kuxVar2 = (kux) cgVar;
                            Activity activity = (Activity) ((kql) aS).el.e.b();
                            apya apyaVar = ((kql) aS).ca;
                            apya apyaVar2 = ((kql) aS).cd;
                            apya apyaVar3 = ((kql) aS).ce;
                            Optional empty = Optional.empty();
                            apya apyaVar4 = ((kql) aS).cf;
                            apya apyaVar5 = ((kql) aS).cg;
                            apya apyaVar6 = ((kql) aS).ch;
                            kqh kqhVar = ((kql) aS).el;
                            apya apyaVar7 = kqhVar.C;
                            apya apyaVar8 = kqhVar.D;
                            apya apyaVar9 = ((kql) aS).cj;
                            krv krvVar = ((kql) aS).a;
                            try {
                                apya apyaVar10 = krvVar.pP;
                                krx krxVar = krvVar.a;
                                apya apyaVar11 = krxVar.dV;
                                apya apyaVar12 = krvVar.ft;
                                apya apyaVar13 = krvVar.ko;
                                apya apyaVar14 = krxVar.cX;
                                yjr yjrVar = (yjr) krvVar.bO.b();
                                krv krvVar2 = ((kql) aS).a;
                                apya apyaVar15 = krvVar2.a.p;
                                apya apyaVar16 = ((kql) aS).cp;
                                apya apyaVar17 = ((kql) aS).cq;
                                apya apyaVar18 = ((kql) aS).ct;
                                apya apyaVar19 = ((kql) aS).cu;
                                apya apyaVar20 = ((kql) aS).cv;
                                apya apyaVar21 = ((kql) aS).cw;
                                apya apyaVar22 = krvVar2.gD;
                                xnv xnvVar = (xnv) krvVar2.bV.b();
                                apya apyaVar23 = ((kql) aS).a.pH;
                                apwt a = apxv.a(((kql) aS).el.M);
                                apwt a2 = apxv.a(((kql) aS).cx);
                                kyc kycVar = (kyc) ((kql) aS).cy.b();
                                kye kyeVar = new kye();
                                apwt a3 = apxv.a(((kql) aS).ba);
                                apya apyaVar24 = ((kql) aS).a.fD;
                                apwt a4 = apxv.a(((kql) aS).cC);
                                aohs aohsVar = (aohs) ((kql) aS).s.b();
                                akgu akguVar = (akgu) ((kql) aS).u.b();
                                akbo akboVar = (akbo) ((kql) aS).e.b();
                                kws h = ((kwt) ((apxq) ((aklj) ((kql) aS).el.f.b()).a).aS()).h();
                                h.getClass();
                                krv krvVar3 = ((kql) aS).a;
                                apya apyaVar25 = krvVar3.vq;
                                apya apyaVar26 = ((kql) aS).cD;
                                kwu N = krvVar3.N();
                                apya apyaVar27 = ((kql) aS).cE;
                                aksr aksrVar = (aksr) ((kql) aS).ej.d.b();
                                kqp kqpVar = ((kql) aS).ej;
                                apya apyaVar28 = kqpVar.u;
                                apwt a5 = apxv.a(kqpVar.al);
                                krv krvVar4 = ((kql) aS).a;
                                apya apyaVar29 = krvVar4.yJ;
                                apya apyaVar30 = ((kql) aS).cF;
                                apya apyaVar31 = krvVar4.bB;
                                krx krxVar2 = krvVar4.a;
                                apya apyaVar32 = krxVar2.dr;
                                apya apyaVar33 = ((kql) aS).ej.ag;
                                apya apyaVar34 = ((kql) aS).cH;
                                apya apyaVar35 = krxVar2.cL;
                                apya apyaVar36 = ((kql) aS).bL;
                                apya apyaVar37 = ((kql) aS).cK;
                                apya apyaVar38 = krvVar4.cy;
                                lqx lqxVar = (lqx) ((kql) aS).cM.b();
                                apya apyaVar39 = ((kql) aS).a.yF;
                                Optional.empty();
                                apya apyaVar40 = ((kql) aS).a.fa;
                                apya apyaVar41 = ((kql) aS).cP;
                                apya apyaVar42 = ((kql) aS).cQ;
                                apwt a6 = apxv.a(((kql) aS).cR);
                                lqn lqnVar = new lqn((armf) ((kql) aS).ej.d);
                                krv krvVar5 = ((kql) aS).a;
                                apya apyaVar43 = krvVar5.uF;
                                apya apyaVar44 = krvVar5.za;
                                apya apyaVar45 = ((kql) aS).ej.l;
                                qif qifVar = (qif) krvVar5.on.b();
                                apya apyaVar46 = ((kql) aS).a.dU;
                                Optional empty2 = Optional.empty();
                                apya apyaVar47 = ((kql) aS).cS;
                                apya apyaVar48 = ((kql) aS).cT;
                                abbc abbcVar = new abbc((anen) ((kql) aS).a.m.b(), ((kql) aS).a.de);
                                apya apyaVar49 = ((kql) aS).a.a.cH;
                                apwt a7 = apxv.a(((kql) aS).cU);
                                apwt a8 = apxv.a(((kql) aS).bb);
                                apwt a9 = apxv.a(((kql) aS).bc);
                                ahoo ahooVar = (ahoo) ((kql) aS).a.pF.b();
                                ahqr ahqrVar = (ahqr) ((kql) aS).a.id.b();
                                apya apyaVar50 = ((kql) aS).a.a.eh;
                                apya apyaVar51 = ((kql) aS).cX;
                                apya apyaVar52 = ((kql) aS).cY;
                                Optional optional = (Optional) ((apxx) ((kql) aS).cG).a;
                                kwl kwlVar = new kwl(((kql) aS).a.bO, (aksr) ((kql) aS).ej.d.b(), new oho() { // from class: npa
                                }, ((kql) aS).cZ, ((kql) aS).da, ((kql) aS).a.a.dQ, apxv.a(((kql) aS).db), ((kql) aS).a.a.ei);
                                Activity activity2 = (Activity) ((kql) aS).el.e.b();
                                ((abaz) ((apxq) ((aklj) ((kql) aS).el.f.b()).a).aS()).R().getClass();
                                ngu nguVar = new ngu(activity2);
                                apya apyaVar53 = ((kql) aS).ej.ao;
                                apya apyaVar54 = ((kql) aS).dc;
                                apya apyaVar55 = ((kql) aS).i;
                                apya apyaVar56 = ((kql) aS).aG;
                                apya apyaVar57 = ((kql) aS).dd;
                                apya apyaVar58 = ((kql) aS).de;
                                apya apyaVar59 = ((kql) aS).dg;
                                apya apyaVar60 = ((kql) aS).a.dd;
                                apya apyaVar61 = ((kql) aS).dh;
                                apya apyaVar62 = ((kql) aS).di;
                                apya apyaVar63 = ((kql) aS).dj;
                                lag i = ((lak) ((apxq) ((aklj) ((kql) aS).el.f.b()).a).aS()).i();
                                i.getClass();
                                apya apyaVar64 = ((kql) aS).dk;
                                apya apyaVar65 = ((kql) aS).dl;
                                apya apyaVar66 = ((kql) aS).dm;
                                apya apyaVar67 = ((kql) aS).a.a.A;
                                apya apyaVar68 = ((kql) aS).ej.v;
                                aqws aqwsVar = (aqws) ((kql) aS).el.l.b();
                                kor korVar = (kor) ((kql) aS).a.f8if.b();
                                krv krvVar6 = ((kql) aS).a;
                                krx krxVar3 = krvVar6.a;
                                apya apyaVar69 = krxVar3.B;
                                apya apyaVar70 = ((kql) aS).dn;
                                apya apyaVar71 = ((kql) aS).dp;
                                ohm G = krxVar3.G();
                                apya apyaVar72 = krvVar6.xB;
                                apya apyaVar73 = krvVar6.xL;
                                apya apyaVar74 = ((kql) aS).dq;
                                apya apyaVar75 = ((kql) aS).dr;
                                apwt a10 = apxv.a(((kql) aS).ds);
                                krx krxVar4 = ((kql) aS).a.a;
                                apya apyaVar76 = krxVar4.a.bN;
                                niw niwVar = new niw(apyaVar76);
                                nix nixVar = new nix(apyaVar76);
                                niz nizVar = new niz(apyaVar76);
                                niy niyVar = new niy(apyaVar76);
                                apya apyaVar77 = ((kql) aS).aB;
                                apya apyaVar78 = krxVar4.C;
                                kqh kqhVar2 = ((kql) aS).el;
                                apya apyaVar79 = kqhVar2.L;
                                apya apyaVar80 = ((kql) aS).dt;
                                apya apyaVar81 = kqhVar2.S;
                                AtomicBoolean atomicBoolean = (AtomicBoolean) krxVar4.ej.b();
                                apya apyaVar82 = ((kql) aS).du;
                                krv krvVar7 = ((kql) aS).a;
                                krx krxVar5 = krvVar7.a;
                                apya apyaVar83 = krxVar5.ek;
                                apya apyaVar84 = krxVar5.cQ;
                                apya apyaVar85 = ((kql) aS).dv;
                                apya apyaVar86 = krxVar5.dQ;
                                apya apyaVar87 = ((kql) aS).dw;
                                apya apyaVar88 = ((kql) aS).dx;
                                apya apyaVar89 = ((kql) aS).dy;
                                apya apyaVar90 = ((kql) aS).dz;
                                apya apyaVar91 = krxVar5.el;
                                apya apyaVar92 = ((kql) aS).dA;
                                apya apyaVar93 = ((kql) aS).dB;
                                apya apyaVar94 = krxVar5.dR;
                                apya apyaVar95 = krvVar7.rZ;
                                apya apyaVar96 = krvVar7.or;
                                apya apyaVar97 = krvVar7.dT;
                                apwt a11 = apxv.a(((kql) aS).db);
                                apwt a12 = apxv.a(((kql) aS).dD);
                                krx krxVar6 = ((kql) aS).a.a;
                                apya apyaVar98 = krxVar6.ec;
                                apya apyaVar99 = krxVar6.en;
                                apwt a13 = apxv.a(((kql) aS).dE);
                                apwt a14 = apxv.a(((kql) aS).dF);
                                krx krxVar7 = ((kql) aS).a.a;
                                kvw kvwVar = new kvw(ajwtVar, kuxVar2, activity, apyaVar, apyaVar2, empty, apyaVar4, apyaVar5, apyaVar6, apyaVar7, apyaVar8, apyaVar9, apyaVar10, apyaVar11, apyaVar12, apyaVar13, apyaVar14, yjrVar, apyaVar15, apyaVar16, apyaVar17, apyaVar18, apyaVar19, apyaVar20, apyaVar21, apyaVar22, xnvVar, apyaVar23, a, a2, kycVar, kyeVar, a3, apyaVar24, a4, aohsVar, akguVar, akboVar, h, apyaVar25, apyaVar26, N, apyaVar27, aksrVar, apyaVar28, a5, apyaVar29, apyaVar30, apyaVar31, apyaVar32, apyaVar33, apyaVar34, apyaVar35, apyaVar36, apyaVar37, apyaVar38, lqxVar, apyaVar39, apyaVar40, apyaVar41, apyaVar42, a6, lqnVar, apyaVar43, apyaVar44, apyaVar45, qifVar, apyaVar46, empty2, apyaVar47, apyaVar48, abbcVar, apyaVar49, a7, a8, a9, ahooVar, ahqrVar, apyaVar50, apyaVar51, apyaVar52, optional, kwlVar, nguVar, apyaVar53, apyaVar54, apyaVar55, apyaVar56, apyaVar57, apyaVar58, apyaVar59, apyaVar60, apyaVar61, apyaVar62, apyaVar63, i, apyaVar64, apyaVar65, apyaVar66, apyaVar67, apyaVar68, aqwsVar, korVar, apyaVar69, apyaVar70, apyaVar71, G, apyaVar72, apyaVar73, apyaVar74, apyaVar75, a10, niwVar, nixVar, nizVar, niyVar, apyaVar77, apyaVar78, apyaVar79, apyaVar80, apyaVar81, atomicBoolean, apyaVar82, apyaVar83, apyaVar84, apyaVar85, apyaVar86, apyaVar87, apyaVar89, apyaVar90, apyaVar91, apyaVar92, apyaVar93, apyaVar94, apyaVar95, apyaVar96, apyaVar97, a11, a12, apyaVar98, apyaVar99, a13, a14, krxVar7.df, ((kql) aS).dG, krxVar7.ep);
                                kuxVar = this;
                                kuxVar.d = kvwVar;
                                kuxVar.Z.c(new akli(kuxVar.c, kuxVar.a));
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                try {
                                    akqj.p();
                                    throw th;
                                } catch (Throwable th3) {
                                    th.addSuppressed(th3);
                                    throw th;
                                }
                            }
                        } else {
                            throw new IllegalStateException(hht.e(cgVar, kvw.class));
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    }
                }
                if (fe() != null) {
                    kvw kvwVar2 = kuxVar.d;
                    cj fe = fe();
                    alvw g = kvw.a.g();
                    g.X(alwp.a, "HomeFragmentFlogger");
                    ((alvg) ((alvg) g).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onAttach", 997, "HomeFragmentPeer.java")).q("HomeFragment onAttach called");
                    akrh e2 = aktp.e("HomeFragment#onAttach");
                    try {
                        Bundle bundle = kvwVar2.b.m;
                        if (bundle != null) {
                            int i2 = bundle.getInt("conversation_list_mode", uye.HOME.d);
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    uyeVar = uye.HOME;
                                } else {
                                    uyeVar = uye.SPAM_FOLDER;
                                }
                            } else {
                                uyeVar = uye.ARCHIVED;
                            }
                            kvwVar2.aE = uyeVar;
                        } else {
                            kvwVar2.aE = uye.HOME;
                        }
                        rrb rrbVar = kvwVar2.aO;
                        gqg gqgVar = (gqg) kvwVar2.d.b();
                        kvw j = kvwVar2.j();
                        uye uyeVar2 = kvwVar2.aE;
                        ?? r4 = gqgVar.c;
                        ?? r5 = gqgVar.b;
                        uac uacVar = (uac) gqgVar.a.b();
                        uacVar.getClass();
                        ?? r7 = gqgVar.d;
                        ?? r8 = gqgVar.e;
                        fe.getClass();
                        uyeVar2.getClass();
                        rrbVar.c(new rrt(r4, r5, uacVar, r7, r8, fe, j, uyeVar2, Optional.of(false), Optional.empty()));
                        e2.close();
                    } finally {
                    }
                }
                akqj.p();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (Throwable th4) {
            th = th4;
            th = th;
            akqj.p();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, anen] */
    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void g(Bundle bundle) {
        this.c.k();
        try {
            aP(bundle);
            kvw E = E();
            alvw g = kvw.a.g();
            g.X(alwp.a, "HomeFragmentFlogger");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onCreate", 1021, "HomeFragmentPeer.java")).q("HomeFragment onCreate called");
            akrh e = aktp.e("HomeFragment#onCreate");
            try {
                E.s.j(2);
                akrh e2 = aktp.e("HomeFragment#prewarmGlide");
                try {
                    kor korVar = (kor) E.bh.b();
                    int i = 0;
                    korVar.a.submit(akto.j(new kut(korVar, i)));
                    e2.close();
                    akrh e3 = aktp.e("HomeFragment#restoreSavedInstance");
                    if (bundle != null) {
                        try {
                            E.aF = bundle.getBoolean("returningFromWelcomeActivity");
                            if (((Boolean) ((utz) xxy.d.get()).e()).booleanValue() && ((Optional) ((apxx) E.al).a).isPresent() && bundle.getInt("storageCardState", Integer.MIN_VALUE) != Integer.MIN_VALUE) {
                                kpu kpuVar = (kpu) ((Optional) ((apxx) E.al).a).get();
                                bundle.getInt("storageCardState");
                                bundle.getLong("storageCardCapacityInBytes");
                                bundle.getLong("storageCardUsageInBytes");
                                kpuVar.g();
                            }
                        } finally {
                        }
                    }
                    e3.close();
                    akrh e4 = aktp.e("welcomeFlowLaunchCheck");
                    try {
                        int i2 = 5;
                        if (E.aX.c(bundle)) {
                            ((Optional) ((apxx) E.R).a).ifPresentOrElse(new ixe(7), new kut(E, i2));
                        } else {
                            ((abfh) E.Q.b()).b(E.b, new kva(E, i));
                        }
                        e4.close();
                        e3 = aktp.e("HomeFragment#setTransitions");
                        try {
                            e3.close();
                            akrh e5 = aktp.e("HomeFragment#registerFutureMixins");
                            try {
                                akrh e6 = aktp.e("HomeFragment#blockParticipants");
                                try {
                                    E.y.b(E.ap);
                                    e6.close();
                                    akrh e7 = aktp.e("HomeFragment#reportGroupCallback");
                                    try {
                                        E.y.b(E.aq);
                                        e7.close();
                                        akrh e8 = aktp.e("HomeFragment#archiveConversationsCallback");
                                        try {
                                            E.y.b(E.ar);
                                            e8.close();
                                            akrh e9 = aktp.e("HomeFragment#gaiaPromoCallback");
                                            try {
                                                E.y.b(E.at);
                                                e9.close();
                                                akrh e10 = aktp.e("HomeFragment#devicePairingMixins");
                                                try {
                                                    if (((Optional) ((apxx) E.C).a).isPresent()) {
                                                        ((aaow) ((Optional) ((apxx) E.C).a).get()).a();
                                                    }
                                                    e10.close();
                                                    akrh e11 = aktp.e("HomeFragment#launchOctarineCallback");
                                                    try {
                                                        if (kpt.a()) {
                                                            E.y.b(E.as);
                                                        }
                                                        e11.close();
                                                        akrh e12 = aktp.e("HomeFragment#autoAttachmentControllerCallback");
                                                        try {
                                                            E.y.b(((nhh) E.U.b()).d);
                                                            e12.close();
                                                            akrh e13 = aktp.e("HomeFragment#bnrEntryPointCallback");
                                                            try {
                                                                if (((Optional) ((apxx) E.am).a).isPresent()) {
                                                                    ((ihn) ((Optional) ((apxx) E.am).a).get()).a();
                                                                }
                                                                e13.close();
                                                                akrh e14 = aktp.e("HomeFragment#fiEntryPointCallback");
                                                                try {
                                                                    if (((Optional) ((apxx) E.an).a).isPresent()) {
                                                                        ((ihu) ((Optional) ((apxx) E.an).a).get()).b();
                                                                    }
                                                                    e14.close();
                                                                    akrh e15 = aktp.e("HomeFragment#accountMenuCardsCallback");
                                                                    try {
                                                                        if (((Optional) ((apxx) E.al).a).isPresent()) {
                                                                            ((kpu) ((Optional) ((apxx) E.al).a).get()).d();
                                                                        }
                                                                        e15.close();
                                                                        akrh e16 = aktp.e("HomeFragment#homeMenuExtensionCallback");
                                                                        try {
                                                                            int i3 = 8;
                                                                            E.S.ifPresent(new ixe(i3));
                                                                            e16.close();
                                                                            akrh e17 = aktp.e("HomeFragment#dittoWebActivityResultCallback");
                                                                            try {
                                                                                if (E.aW.c(bundle)) {
                                                                                    E.b.M(new sl(), new rv() { // from class: kvb
                                                                                        @Override // defpackage.rv
                                                                                        public final void a(Object obj) {
                                                                                            if (((ru) obj).a == -1) {
                                                                                                kuy.a.l("Switch to DittoWebActivity finish");
                                                                                            }
                                                                                        }
                                                                                    });
                                                                                }
                                                                                e17.close();
                                                                                akrh e18 = aktp.e("HomeFragment#superSortCallback");
                                                                                try {
                                                                                    ((Optional) ((apxx) E.L).a).ifPresent(new ixe(9));
                                                                                    e18.close();
                                                                                    akrh e19 = aktp.e("HomeFragment#blockAndReortSpamCallback");
                                                                                    try {
                                                                                        ((igz) E.E.b()).c(new ijm(E, 6));
                                                                                        e19.close();
                                                                                        akrh e20 = aktp.e("HomeFragment#autoSignInTooltipCallback");
                                                                                        try {
                                                                                            if (((Optional) ((apxx) E.ak).a).isPresent()) {
                                                                                                ((kqb) ((Optional) ((apxx) E.ak).a).get()).a();
                                                                                            }
                                                                                            e20.close();
                                                                                            akrh e21 = aktp.e("HomeFragment#launchConversationCallback");
                                                                                            try {
                                                                                                ((Optional) E.ax.b()).ifPresent(new ixe(10));
                                                                                                e21.close();
                                                                                                e5.close();
                                                                                                E.K.ifPresent(new ktm(E, i3));
                                                                                                E.b.a.c(E.N);
                                                                                                E.b.a.c(E.T);
                                                                                                e2 = aktp.e("HomeFragment#registerLocalSubscriptionMixins");
                                                                                                try {
                                                                                                    akrh e22 = aktp.e("HomeFragment#conversationSwipeLocalMixin");
                                                                                                    try {
                                                                                                        cj fe = E.b.fe();
                                                                                                        fe.getClass();
                                                                                                        E.aU = (lat) new eoy(fe).a(lat.class);
                                                                                                        las lasVar = (las) E.w.b();
                                                                                                        lasVar.e.a(R.id.swipe_action_settings, new xph((zmt) lasVar.d.b(), 5), new zhq(lasVar, 1));
                                                                                                        e22.close();
                                                                                                        akrh e23 = aktp.e("HomeFragment#gaiaAuthCheckLocalMixin");
                                                                                                        try {
                                                                                                            E.x.a(R.id.gaia_auth_check_local_subscription, new atse((uwu) E.ag.b(), 1), new isj(E, 4));
                                                                                                            e23.close();
                                                                                                            e14 = aktp.e("HomeFragment#accountMenuEntryPointLocalMixin");
                                                                                                            try {
                                                                                                                if (((Optional) ((apxx) E.al).a).isPresent()) {
                                                                                                                    ((kpu) ((Optional) ((apxx) E.al).a).get()).e();
                                                                                                                }
                                                                                                                e14.close();
                                                                                                                e17 = aktp.e("HomeFragment#screenDetectionLocalMixin");
                                                                                                                try {
                                                                                                                    ((wtt) E.n.b()).c(E.x, E.b.y());
                                                                                                                    e17.close();
                                                                                                                    e2.close();
                                                                                                                    E.T.k.c(bundle);
                                                                                                                    if (E.aE.a()) {
                                                                                                                        E.z();
                                                                                                                    }
                                                                                                                    e.close();
                                                                                                                    akqj.p();
                                                                                                                } finally {
                                                                                                                }
                                                                                                            } finally {
                                                                                                            }
                                                                                                        } finally {
                                                                                                            try {
                                                                                                                e23.close();
                                                                                                            } catch (Throwable th) {
                                                                                                                th.addSuppressed(th);
                                                                                                            }
                                                                                                        }
                                                                                                    } finally {
                                                                                                        try {
                                                                                                            e22.close();
                                                                                                        } catch (Throwable th2) {
                                                                                                            th.addSuppressed(th2);
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                }
                                                                                            } finally {
                                                                                                try {
                                                                                                    e21.close();
                                                                                                } catch (Throwable th3) {
                                                                                                    th.addSuppressed(th3);
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            try {
                                                                                                e20.close();
                                                                                            } catch (Throwable th4) {
                                                                                                th.addSuppressed(th4);
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        try {
                                                                                            e19.close();
                                                                                        } catch (Throwable th5) {
                                                                                            th.addSuppressed(th5);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    try {
                                                                                        e18.close();
                                                                                    } catch (Throwable th6) {
                                                                                        th.addSuppressed(th6);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                try {
                                                                                    e17.close();
                                                                                } catch (Throwable th7) {
                                                                                    th.addSuppressed(th7);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            try {
                                                                                e16.close();
                                                                            } catch (Throwable th8) {
                                                                                th.addSuppressed(th8);
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        try {
                                                                            e15.close();
                                                                        } catch (Throwable th9) {
                                                                            th.addSuppressed(th9);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    try {
                                                                        e14.close();
                                                                    } catch (Throwable th10) {
                                                                        th.addSuppressed(th10);
                                                                    }
                                                                }
                                                            } finally {
                                                                try {
                                                                    e13.close();
                                                                } catch (Throwable th11) {
                                                                    th.addSuppressed(th11);
                                                                }
                                                            }
                                                        } finally {
                                                            try {
                                                                e12.close();
                                                            } catch (Throwable th12) {
                                                                th.addSuppressed(th12);
                                                            }
                                                        }
                                                    } finally {
                                                        try {
                                                            e11.close();
                                                        } catch (Throwable th13) {
                                                            th.addSuppressed(th13);
                                                        }
                                                    }
                                                } finally {
                                                    try {
                                                        e10.close();
                                                    } catch (Throwable th14) {
                                                        th.addSuppressed(th14);
                                                    }
                                                }
                                            } finally {
                                                try {
                                                    e9.close();
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                }
                                            }
                                        } finally {
                                            try {
                                                e8.close();
                                            } catch (Throwable th16) {
                                                th.addSuppressed(th16);
                                            }
                                        }
                                    } finally {
                                        try {
                                            e7.close();
                                        } catch (Throwable th17) {
                                            th.addSuppressed(th17);
                                        }
                                    }
                                } finally {
                                    try {
                                        e6.close();
                                    } catch (Throwable th18) {
                                        th.addSuppressed(th18);
                                    }
                                }
                            } finally {
                                try {
                                    e5.close();
                                } catch (Throwable th19) {
                                    th.addSuppressed(th19);
                                }
                            }
                        } finally {
                            try {
                                e3.close();
                            } catch (Throwable th20) {
                                th.addSuppressed(th20);
                            }
                        }
                    } finally {
                        try {
                            e4.close();
                        } catch (Throwable th21) {
                            th.addSuppressed(th21);
                        }
                    }
                } finally {
                    try {
                        e2.close();
                    } catch (Throwable th22) {
                        th.addSuppressed(th22);
                    }
                }
            } finally {
            }
        } catch (Throwable th23) {
            try {
                akqj.p();
            } catch (Throwable th24) {
                th23.addSuppressed(th24);
            }
            throw th23;
        }
    }

    @Override // defpackage.cg
    public final LayoutInflater gl(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater aD = aD();
            LayoutInflater cloneInContext = aD.cloneInContext(new aklx.a(aD, this));
            LayoutInflater cloneInContext2 = cloneInContext.cloneInContext(new aklm(this, cloneInContext));
            akqj.p();
            return cloneInContext2;
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r3v15, types: [ascv, java.lang.Object] */
    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void h() {
        boolean z;
        aksa b = this.c.b();
        try {
            aT();
            kvw E = E();
            alvw g = kvw.a.g();
            g.X(alwp.a, "HomeFragmentFlogger");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onDestroyView", 3422, "HomeFragmentPeer.java")).q("HomeFragment onDestroyView called");
            if (!E.aC) {
                E.b(E.b).getViewTreeObserver().removeOnPreDrawListener(E.aA);
                E.aA = new kvu(1);
                E.b.F().findViewById(android.R.id.content).getViewTreeObserver().removeOnPreDrawListener(E.aB);
            }
            if (E.aE.a()) {
                E.D().i = E.aI.R();
                if (E.T.a() != null) {
                    kyf D = E.D();
                    kwl kwlVar = E.T;
                    if (kwlVar.k.b()) {
                        z = ((Boolean) ((ghw) kwlVar.c.b()).a.c()).booleanValue();
                    } else {
                        ExtendedFloatingActionButton extendedFloatingActionButton = kwlVar.h;
                        if (extendedFloatingActionButton != null) {
                            z = extendedFloatingActionButton.r;
                        } else {
                            z = false;
                        }
                    }
                    D.m = Boolean.valueOf(z);
                }
            }
            if (((ohi) E.av.b()).a()) {
                ((Optional) ((apxx) E.aw).a).ifPresent(new ixe(14));
            }
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

    @Override // defpackage.aiuc, defpackage.cg
    public final void i() {
        aksa a = this.c.a();
        try {
            aV();
            this.ag = true;
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

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void j(Bundle bundle) {
        this.c.k();
        try {
            bc(bundle);
            kvw E = E();
            bundle.putBoolean("returningFromWelcomeActivity", E.aF);
            if (E.aI != null) {
                E.k().M(E.aI.N(), bundle);
            }
            E.aW.a(bundle);
            E.aX.a(bundle);
            E.S.ifPresent(new ixe(15));
            if (((Boolean) ((utz) xxy.d.get()).e()).booleanValue() && ((Optional) ((apxx) E.al).a).isPresent() && ((kpu) ((Optional) ((apxx) E.al).a).get()).c().isPresent()) {
                bundle.putInt("storageCardState", ((ahjw) ((kpu) ((Optional) ((apxx) E.al).a).get()).c().get()).ordinal());
                bundle.putLong("storageCardCapacityInBytes", ((kpu) ((Optional) ((apxx) E.al).a).get()).a());
                bundle.putLong("storageCardUsageInBytes", ((kpu) ((Optional) ((apxx) E.al).a).get()).b());
            }
            E.T.k.a(bundle);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void l() {
        this.c.k();
        try {
            be();
            kvw E = E();
            alvw g = kvw.a.g();
            g.X(alwp.a, "HomeFragmentFlogger");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onStop", 3414, "HomeFragmentPeer.java")).q("HomeFragment onStop called");
            E.b(E.b).clearFocus();
            E.D().i = E.aI.R();
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.akwc
    public final void o(Class cls, akvz akvzVar) {
        this.ah.l(cls, akvzVar);
    }

    @Override // defpackage.aiuc, defpackage.cg, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        boolean z;
        boolean z2;
        super.onConfigurationChanged(configuration);
        kvw E = E();
        if (E.aJ.h() && E.aJ.a() == 0 && E.b.x() != null) {
            E.x((ListEmptyView) E.aJ.b());
        }
        if (configuration != null) {
            kux kuxVar = E.b;
            int i = configuration.orientation;
            if (E.c(kuxVar) != null && E.c(E.b).getVisibility() == 0 && E.i(E.b) != null) {
                int i2 = 0;
                if (i != 2 && !E.b.F().isInMultiWindowMode()) {
                    z = false;
                } else {
                    z = true;
                }
                if (E.i(E.b).getVisibility() != 8) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z != z2) {
                    LottieAnimationView i3 = E.i(E.b);
                    if (true == z) {
                        i2 = 8;
                    }
                    i3.setVisibility(i2);
                }
            }
        }
    }

    @Override // defpackage.kwo
    protected final /* bridge */ /* synthetic */ aklw p() {
        return new akls(this, false);
    }

    @Override // defpackage.kwo, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
