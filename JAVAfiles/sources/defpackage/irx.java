package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.messagelist.MessageListRecyclerView;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.common.PinnedLinearLayoutManager;
import defpackage.aklx;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class irx extends itp implements akkh, apxq, akkf, aklk, akrw, akwc {
    private itb a;
    private boolean ag;
    private Context d;
    private final eno e = new eno(this);
    private final akmy ah = new akmy((byte[]) null);

    @Deprecated
    public irx() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return itb.class;
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            aM(layoutInflater, viewGroup, bundle);
            itb E = E();
            View inflate = layoutInflater.inflate(R.layout.message_list_fragment, viewGroup, false);
            E.ao = (MessageListRecyclerView) inflate.findViewById(android.R.id.list);
            E.ao.ak((oc) E.P.b());
            if (inflate == null) {
                ipq.m(this, E());
            }
            akqj.p();
            return inflate;
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
        return this.e;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [arwe, java.lang.Object] */
    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void W(Bundle bundle) {
        this.c.k();
        try {
            aN(bundle);
            itb E = E();
            int i = 1;
            if (((Boolean) wsm.a.e()).booleanValue()) {
                E.v.ifPresent(new iry(E, i));
            }
            E.r.ifPresent(new iry(E, 0));
            if (E.ag.b()) {
                yyp yypVar = (yyp) E.x.b();
                E.bd.C(new akfk((ansy) yypVar.c.b(), new ikn(yypVar, 12), "SafeUrlSettingCacheCallback_DATASOURCE_KEY", 2), yypVar);
            }
            if (E.ai.b() && ((Optional) E.J.b()).isPresent()) {
                E.bd.C(((zxm) ((Optional) E.J.b()).get()).b(), E.W);
            }
            aohs aohsVar = E.bd;
            kkc kkcVar = (kkc) E.al.b();
            AtomicReference atomicReference = new AtomicReference(akfa.a);
            aohsVar.C(new akgq(kkcVar.a, new jue(atomicReference, (arpe) null, 3), new vvd(atomicReference, kkcVar, (arpe) null, 1)), new isl(E));
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

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void X(int i, int i2, Intent intent) {
        aksa f = this.c.f();
        try {
            aO(i, i2, intent);
            itb E = E();
            if (i2 == -1) {
                ?? r9 = E.aY.c;
                Integer valueOf = Integer.valueOf(i);
                if (r9.containsKey(valueOf) && intent != null && intent.getData() != null) {
                    iji ijiVar = E.aY;
                    Uri data = intent.getData();
                    MessagePartCoreData messagePartCoreData = (MessagePartCoreData) ijiVar.c.get(valueOf);
                    if (messagePartCoreData != null && data != null) {
                        Uri t = messagePartCoreData.t();
                        String U = messagePartCoreData.U();
                        if (t != null && U != null) {
                            ibr o = ((gpx) ijiVar.a).o("Bugle.Async.ConversationFragment.ActionMode.Callback.onActionItemClicked.Duration");
                            o.c(t, data, U);
                            o.e(new Void[0]);
                        }
                        ijiVar.c.remove(valueOf);
                    }
                    E.an.l();
                }
            }
            if (i == 100) {
                E.q();
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

    @Override // defpackage.itp, defpackage.aiuc, defpackage.cg
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

    @Override // defpackage.akkh
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final itb E() {
        itb itbVar = this.a;
        if (itbVar != null) {
            if (!this.ag) {
                return itbVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
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
        if (this.d == null) {
            this.d = new aklm(this, super.x());
        }
        return this.d;
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
        nq nqVar;
        aksa b = this.c.b();
        try {
            aQ();
            itb E = E();
            ValueAnimator valueAnimator = E.aA;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                E.aA = null;
            }
            MessageListRecyclerView messageListRecyclerView = E.ao;
            if (messageListRecyclerView != null && (nqVar = E.aV) != null) {
                messageListRecyclerView.aM(nqVar);
            }
            jbp jbpVar = E.u;
            if (jbpVar != null) {
                jbpVar.c = true;
            }
            isz iszVar = E.an;
            if (iszVar != null) {
                iszVar.l();
            }
            itu ituVar = E.h;
            if (ituVar != null && ituVar.f > 0) {
                aozy createBuilder = amty.a.createBuilder();
                aozy createBuilder2 = amtz.a.createBuilder();
                long j = ituVar.g;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                amtz amtzVar = (amtz) createBuilder2.b;
                amtzVar.b = 1 | amtzVar.b;
                amtzVar.c = j;
                amtz amtzVar2 = (amtz) createBuilder2.s();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amty amtyVar = (amty) createBuilder.b;
                amtzVar2.getClass();
                amtyVar.d = amtzVar2;
                amtyVar.c |= 2;
                ((mgu) ituVar.d.b()).g(174017, (amty) createBuilder.s());
                ituVar.f = 0L;
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

    @Override // defpackage.cg
    public final void ac(boolean z) {
        irg irgVar;
        itb E = E();
        if (!z && (irgVar = E.ar) != null) {
            irgVar.b.clear();
            irgVar.e = true;
        }
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void ad() {
        this.c.k();
        try {
            ba();
            itb E = E();
            nw nwVar = E.ao.m;
            if (nwVar != null) {
                E.d = nwVar.R();
                akqj.p();
                return;
            }
            throw new IllegalStateException("RecyclerView has no LayoutManager during onPause().");
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r11v22, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [armf, java.lang.Object] */
    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void ag(View view, Bundle bundle) {
        irw irwVar;
        this.c.k();
        try {
            aktp.bH(this).a = view;
            E();
            ipq.m(this, E());
            bf(view, bundle);
            itb E = E();
            E.aq.e.c = true;
            E.ao = (MessageListRecyclerView) view.findViewById(android.R.id.list);
            if (!E.ai.b()) {
                itf E2 = E.ao.E();
                Context x = E.f.x();
                x.getClass();
                E2.a = new ScaleGestureDetector(x, (ScaleGestureDetector.OnScaleGestureListener) E.y.b());
            }
            E.ao.aF();
            E.ao.aj(E.ap);
            E.ao.ag(E.aq.f);
            E.aV = new akvg(E.aX, new isk(E));
            E.ao.aL(E.aV);
            jbp jbpVar = E.u;
            ajwt ajwtVar = E.g;
            cj fe = E.f.fe();
            MessageListRecyclerView messageListRecyclerView = E.ao;
            ajwtVar.getClass();
            messageListRecyclerView.getClass();
            messageListRecyclerView.getViewTreeObserver().addOnPreDrawListener(new kwm(jbpVar, messageListRecyclerView, ajwtVar, fe, 1));
            E.az = ViewConfiguration.get(E.f.F()).getScaledTouchSlop();
            if (((Boolean) utw.ab.e()).booleanValue()) {
                if (((Boolean) utw.ag.e()).booleanValue()) {
                    iji ijiVar = E.aZ;
                    MessageListRecyclerView messageListRecyclerView2 = E.ao;
                    Context context = (Context) ijiVar.b.b();
                    context.getClass();
                    xnv xnvVar = (xnv) ijiVar.a.b();
                    xnvVar.getClass();
                    Optional optional = (Optional) ((apxx) ijiVar.c).a;
                    messageListRecyclerView2.getClass();
                    irwVar = new irw(context, xnvVar, optional, messageListRecyclerView2, E, 0);
                } else {
                    iji ijiVar2 = E.aZ;
                    MessageListRecyclerView messageListRecyclerView3 = E.ao;
                    Context context2 = (Context) ijiVar2.b.b();
                    context2.getClass();
                    xnv xnvVar2 = (xnv) ijiVar2.a.b();
                    xnvVar2.getClass();
                    Optional optional2 = (Optional) ((apxx) ijiVar2.c).a;
                    messageListRecyclerView3.getClass();
                    irwVar = new irw(context2, xnvVar2, optional2, messageListRecyclerView3, E, 217);
                }
                E.ao.ah(irwVar);
            }
            ifb ifbVar = E.ba;
            MessageListRecyclerView messageListRecyclerView4 = E.ao;
            boolean A = E.be.A();
            zpt zptVar = (zpt) ifbVar.a.b();
            zptVar.getClass();
            znj znjVar = (znj) ifbVar.b.b();
            znjVar.getClass();
            messageListRecyclerView4.getClass();
            irg irgVar = new irg(zptVar, znjVar, messageListRecyclerView4, A ? 1 : 0);
            irgVar.a.addOnLayoutChangeListener(irgVar);
            irgVar.a.aL(irgVar);
            irgVar.a.w(irgVar);
            no noVar = irgVar.a.l;
            if (noVar != null) {
                noVar.D(new irf(irgVar));
            }
            irgVar.X();
            irgVar.W(false);
            irgVar.c.setAlpha(brg.a);
            E.ar = irgVar;
            if (bundle != null) {
                E.ax = bundle.getParcelableArrayList("attachmentDataToSaveKey");
                E.d = bundle.getParcelable("conversationViewState");
            }
            E.as = new irq(E.ao, new zlp(E, 1), E.F);
            E.ao.af(E.as);
            E.w.f(E.ao, mgv.q, null);
            ((nhh) E.R.b()).c();
            E.aW = new ipq();
            E.aM = (Optional) ((apxx) E.S).a;
            E.aM.ifPresent(new iry(E, 6));
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

    @Override // defpackage.cg
    public final void ak(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        albo.U(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.ak(bundle);
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

    @Override // defpackage.itp
    protected final /* bridge */ /* synthetic */ aklw d() {
        return new akls(this, true);
    }

    @Override // defpackage.akwc
    public final akwa e(akvv akvvVar) {
        return this.ah.k(akvvVar);
    }

    @Override // defpackage.itp, defpackage.aklf, defpackage.cg
    public final void f(Context context) {
        this.c.k();
        try {
            if (!this.ag) {
                super.f(context);
                if (this.a == null) {
                    try {
                        Object aS = aS();
                        ajwt ajwtVar = (ajwt) ((kql) aS).ej.b.b();
                        cg cgVar = (cg) ((apxx) ((kql) aS).d).a;
                        ((kql) aS).n();
                        kor korVar = (kor) ((kql) aS).a.za.b();
                        zmr zmrVar = new zmr(korVar);
                        Optional optional = (Optional) ((apxx) ((kql) aS).aF).a;
                        mho mhoVar = (mho) ((kql) aS).a.gD.b();
                        anen anenVar = (anen) ((kql) aS).a.z.b();
                        anen anenVar2 = (anen) ((kql) aS).a.m.b();
                        mbl mblVar = (mbl) ((kql) aS).a.bB.b();
                        nct nctVar = (nct) ((kql) aS).n.b();
                        eoy eoyVar = (eoy) ((kql) aS).k.b();
                        krv krvVar = ((kql) aS).a;
                        itu ituVar = new itu(anenVar, anenVar2, mblVar, nctVar, eoyVar, krvVar.tV, krvVar.bV, krvVar.dA);
                        abco abcoVar = (abco) ((kql) aS).j.b();
                        zjm zjmVar = (zjm) ((kql) aS).a.a.cF.b();
                        nei neiVar = new nei(((kql) aS).aJ, ((kql) aS).a.bV, ((kql) aS).aK, ((kql) aS).aL, ((kql) aS).aM, ((kql) aS).aN, null, null, null, null);
                        mgv mgvVar = (mgv) ((kql) aS).a.pH.b();
                        yti ytiVar = (yti) ((kql) aS).a.oX.b();
                        wfh wfhVar = (wfh) ((kql) aS).a.ec.b();
                        krv krvVar2 = ((kql) aS).a;
                        iji ijiVar = new iji(krvVar2.n, krvVar2.bV, ((kql) aS).aO, (byte[]) null, (byte[]) null);
                        yjf yjfVar = (yjf) ((kql) aS).a.bU.b();
                        apya apyaVar = ((kql) aS).el.k;
                        yjy yjyVar = (yjy) ((kql) aS).a.aF.b();
                        xnv xnvVar = (xnv) ((kql) aS).a.bV.b();
                        krv krvVar3 = ((kql) aS).a;
                        apya apyaVar2 = krvVar3.yJ;
                        qky qkyVar = (qky) krvVar3.a.cL.b();
                        Optional empty = Optional.empty();
                        iyh iyhVar = (iyh) ((kql) aS).el.m.b();
                        trz trzVar = (trz) ((kql) aS).a.ee.b();
                        Optional empty2 = Optional.empty();
                        aohs aohsVar = (aohs) ((kql) aS).s.b();
                        abbj abbjVar = (abbj) ((kql) aS).aR.b();
                        rbh rbhVar = (rbh) ((kql) aS).ej.ad.b();
                        krv krvVar4 = ((kql) aS).a;
                        try {
                            ifb ifbVar = new ifb(krvVar4.ef, krvVar4.fd, (byte[]) null, (short[]) null);
                            gpx QN = ((kql) aS).a.QN();
                            iji ijiVar2 = new iji((yyb) ((kql) aS).a.a.cP.b(), ((kql) aS).a.QN());
                            krv krvVar5 = ((kql) aS).a;
                            Optional optional2 = (Optional) ((apxx) krvVar5.CV).a;
                            usk uskVar = (usk) krvVar5.rB.b();
                            xpi xpiVar = (xpi) ((kql) aS).a.rh.b();
                            aneo aneoVar = (aneo) ((kql) aS).a.m.b();
                            akbo akboVar = (akbo) ((kql) aS).e.b();
                            akgu akguVar = (akgu) ((kql) aS).u.b();
                            akmy s = ((kql) aS).s();
                            Optional optional3 = (Optional) ((apxx) ((kql) aS).aS).a;
                            Optional optional4 = (Optional) ((apxx) ((kql) aS).aT).a;
                            Optional optional5 = (Optional) ((apxx) ((kql) aS).a.Ck).a;
                            aksr aksrVar = (aksr) ((kql) aS).ej.d.b();
                            apya apyaVar3 = ((kql) aS).ej.ab;
                            apya apyaVar4 = ((kql) aS).aU;
                            apya apyaVar5 = ((kql) aS).aV;
                            krv krvVar6 = ((kql) aS).a;
                            zjq zjqVar = new zjq(krvVar6.yJ, krvVar6.gD, Optional.empty());
                            apya apyaVar6 = ((kql) aS).aW;
                            apwt a = apxv.a(((kql) aS).aY);
                            ahoo ahooVar = (ahoo) ((kql) aS).a.pF.b();
                            jbp jbpVar = new jbp((aksr) ((kql) aS).ej.d.b(), ((kql) aS).a.pH, (eoy) ((kql) aS).k.b());
                            krv krvVar7 = ((kql) aS).a;
                            jat jatVar = new jat((armf) krvVar7.z, (armf) krvVar7.m, (armf) ((kql) aS).k, (armf) ((kql) aS).n, (armf) krvVar7.ee, (armf) krvVar7.fm, (armf) krvVar7.dA, (byte[]) null);
                            Optional empty3 = Optional.empty();
                            Optional empty4 = Optional.empty();
                            apya apyaVar7 = ((kql) aS).aZ;
                            gpx v = ((kql) aS).v();
                            apya apyaVar8 = ((kql) aS).a.ft;
                            apwt a2 = apxv.a(((kql) aS).bb);
                            apwt a3 = apxv.a(((kql) aS).bc);
                            apya apyaVar9 = ((kql) aS).el.n;
                            kor korVar2 = (kor) ((kql) aS).l.b();
                            apya apyaVar10 = ((kql) aS).i;
                            apwt a4 = apxv.a(((kql) aS).bd);
                            Optional empty5 = Optional.empty();
                            apwt a5 = apxv.a(((kql) aS).a.jC);
                            apya apyaVar11 = ((kql) aS).be;
                            apya apyaVar12 = ((kql) aS).bf;
                            apya apyaVar13 = ((kql) aS).bg;
                            apya apyaVar14 = ((kql) aS).ej.ai;
                            krv krvVar8 = ((kql) aS).a;
                            this.a = new itb(ajwtVar, cgVar, zmrVar, optional, mhoVar, ituVar, abcoVar, zjmVar, neiVar, mgvVar, ytiVar, wfhVar, ijiVar, yjfVar, apyaVar, yjyVar, xnvVar, apyaVar2, qkyVar, empty, iyhVar, trzVar, empty2, aohsVar, abbjVar, rbhVar, ifbVar, QN, ijiVar2, optional2, uskVar, xpiVar, aneoVar, akboVar, akguVar, s, optional3, optional4, optional5, aksrVar, apyaVar3, apyaVar4, apyaVar5, zjqVar, apyaVar6, a, ahooVar, jbpVar, jatVar, empty3, empty4, apyaVar7, v, apyaVar8, a2, a3, apyaVar9, korVar2, apyaVar10, a4, empty5, a5, apyaVar11, apyaVar12, apyaVar13, apyaVar14, krvVar8.a.cT, ((kql) aS).bh, ((kql) aS).bi, krvVar8.uF, ((kql) aS).bj, krvVar8.vE, ((kql) aS).g(), (nzq) ((kql) aS).a.xC.b());
                            this.Z.c(new akli(this.c, this.e));
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            try {
                                akqj.p();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    }
                }
                akqj.p();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Type inference failed for: r0v73, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25, types: [armf, java.lang.Object] */
    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void g(Bundle bundle) {
        final boolean z;
        akgr qjaVar;
        final boolean z2;
        akgr qjaVar2;
        this.c.k();
        try {
            aP(bundle);
            final itb E = E();
            E.ag.c(bundle);
            E.ah.c(bundle);
            E.ai.c(bundle);
            E.aj.c(bundle);
            E.ak.c(bundle);
            jbp jbpVar = E.u;
            if (bundle == null) {
                ((mgv) jbpVar.e.b()).e(mgv.w);
            }
            final int i = 0;
            E.D.a(R.id.outgoing_reactions_count_subscription, new iuh((iui) E.t.b()), new isj(E, 0));
            final int i2 = 1;
            if (((Boolean) ((utz) aagh.a.get()).e()).booleanValue() && ((Optional) ((apxx) E.L).a).isPresent()) {
                z = true;
            } else {
                z = false;
            }
            akgu akguVar = E.D;
            if (z) {
                qjaVar = ((aagp) ((Optional) ((apxx) E.L).a).get()).b();
            } else {
                qjaVar = new qja(false);
            }
            akguVar.a(R.id.suggestion_shortcut_dialog_subscription, qjaVar, new akgs() { // from class: isc
                @Override // defpackage.akgs
                public final /* synthetic */ void a(Throwable th) {
                    if (i2 != 0) {
                        akec.l(th);
                    } else {
                        akec.l(th);
                    }
                }

                /* JADX WARN: Type inference failed for: r1v6, types: [arwe, java.lang.Object] */
                @Override // defpackage.akgs
                public final void b(Object obj) {
                    akul c;
                    if (i2 != 0) {
                        Boolean bool = (Boolean) obj;
                        if (z) {
                            itb itbVar = E;
                            if (!itbVar.aj.b() && Boolean.TRUE.equals(bool)) {
                                aagf aagfVar = new aagf();
                                apxh.e(aagfVar);
                                aagfVar.q(itbVar.f.G(), "SuggestionShortcutDialogFragment");
                                ((aagp) ((Optional) ((apxx) itbVar.L).a).get()).c();
                                itbVar.aj.d();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    String str = (String) obj;
                    if (z && ((Boolean) ((utz) aagh.b.get()).e()).booleanValue()) {
                        itb itbVar2 = E;
                        if (!itbVar2.ak.b() && !TextUtils.isEmpty(str)) {
                            ahmv ahmvVar = (ahmv) itbVar2.N.b();
                            ConversationIdType conversationIdType = itbVar2.af;
                            MessageIdType b = rvc.b(str);
                            conversationIdType.getClass();
                            c = qjh.c(ahmvVar.i, arpj.a, arwf.a, new yiv(ahmvVar, conversationIdType, b, (arpe) null, 3));
                            qiu.h(c);
                            itbVar2.ak.d();
                        }
                    }
                }
            });
            if (((Boolean) ((utz) aagh.a.get()).e()).booleanValue() && ((Optional) ((apxx) E.L).a).isPresent()) {
                z2 = true;
            } else {
                z2 = false;
            }
            akgu akguVar2 = E.D;
            if (z2) {
                qjaVar2 = ((aagp) ((Optional) ((apxx) E.L).a).get()).a();
            } else {
                qjaVar2 = new qja("");
            }
            akguVar2.a(R.id.star_toolstone_subscription, qjaVar2, new akgs() { // from class: isc
                @Override // defpackage.akgs
                public final /* synthetic */ void a(Throwable th) {
                    if (i != 0) {
                        akec.l(th);
                    } else {
                        akec.l(th);
                    }
                }

                /* JADX WARN: Type inference failed for: r1v6, types: [arwe, java.lang.Object] */
                @Override // defpackage.akgs
                public final void b(Object obj) {
                    akul c;
                    if (i != 0) {
                        Boolean bool = (Boolean) obj;
                        if (z2) {
                            itb itbVar = E;
                            if (!itbVar.aj.b() && Boolean.TRUE.equals(bool)) {
                                aagf aagfVar = new aagf();
                                apxh.e(aagfVar);
                                aagfVar.q(itbVar.f.G(), "SuggestionShortcutDialogFragment");
                                ((aagp) ((Optional) ((apxx) itbVar.L).a).get()).c();
                                itbVar.aj.d();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    String str = (String) obj;
                    if (z2 && ((Boolean) ((utz) aagh.b.get()).e()).booleanValue()) {
                        itb itbVar2 = E;
                        if (!itbVar2.ak.b() && !TextUtils.isEmpty(str)) {
                            ahmv ahmvVar = (ahmv) itbVar2.N.b();
                            ConversationIdType conversationIdType = itbVar2.af;
                            MessageIdType b = rvc.b(str);
                            conversationIdType.getClass();
                            c = qjh.c(ahmvVar.i, arpj.a, arwf.a, new yiv(ahmvVar, conversationIdType, b, (arpe) null, 3));
                            qiu.h(c);
                            itbVar2.ak.d();
                        }
                    }
                }
            });
            akwb akwbVar = new akwb(E.F, "MessageListFragmentPeer#onCreate.onClick", new jh(new jh(E, 12, null), 13, null), 1);
            afvl afvlVar = new afvl(E.F, "MessageListFragmentPeer#onCreate.onLongClick", new ish(new ish(E, 0), 2), 2);
            E.f.F();
            E.ap = new PinnedLinearLayoutManager();
            nei neiVar = E.bb;
            cj F = E.f.F();
            PinnedLinearLayoutManager pinnedLinearLayoutManager = E.ap;
            ifq ifqVar = (ifq) neiVar.a.b();
            xnv xnvVar = (xnv) neiVar.d.b();
            xnvVar.getClass();
            ifb ifbVar = (ifb) neiVar.b.b();
            ifb ifbVar2 = (ifb) neiVar.f.b();
            ?? r3 = neiVar.e;
            Optional optional = (Optional) ((apxx) neiVar.c).a;
            pinnedLinearLayoutManager.getClass();
            E.aq = new ird(ifqVar, xnvVar, ifbVar, ifbVar2, r3, optional, F, pinnedLinearLayoutManager, E, akwbVar, afvlVar);
            ((abbo) E.P.b()).h(((Integer) ite.d.e()).intValue(), R.layout.conversation_message_view);
            Context x = E.f.x();
            x.getClass();
            abbn abbnVar = new abbn(x, new kvd(E, 1));
            oc ocVar = (oc) E.P.b();
            Context x2 = E.f.x();
            x2.getClass();
            ((abbq) E.Q.b()).a(new abbp(abbnVar, ocVar, x2, ((Integer) ite.d.e()).intValue(), R.layout.conversation_message_view, 3));
            E.f.N().c((enl) E.Q.b());
            E.f.N().c(E.aq);
            E.C.b(E.X);
            E.C.b(E.Y);
            E.C.b(E.Z);
            E.C.b(E.aa);
            E.C.b(E.ab);
            E.C.b(E.ac);
            E.C.b(E.ad);
            ((Optional) ((apxx) E.j).a).ifPresent(new iry(E, 7));
            ((Optional) ((apxx) E.k).a).ifPresent(new iry(E, 8));
            E.D.a(R.id.typing_indicator_data_local_subscription, new xph(E.bc, 1), new isj(E, 3));
            E.D.a(R.id.file_transfer_progress_data_local_subscription, new xph(E.s, 0), new isj(E, 2));
            E.q.ifPresent(new isb(6));
            E.H.ifPresent(new isb(7));
            E.C.b(((nhh) E.R.b()).d);
            akqj.p();
        } finally {
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
            itb E = E();
            ArrayList<? extends Parcelable> arrayList = E.ax;
            if (arrayList != null) {
                bundle.putParcelableArrayList("attachmentDataToSaveKey", arrayList);
            }
            Parcelable parcelable = E.d;
            if (parcelable != null) {
                bundle.putParcelable("conversationViewState", parcelable);
            }
            E.ag.a(bundle);
            E.ah.a(bundle);
            E.ai.a(bundle);
            E.aj.a(bundle);
            E.ak.a(bundle);
            E.q.ifPresent(new ile(17));
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
    public final void k() {
        this.c.k();
        try {
            bd();
            itb E = E();
            E.aR.a(E.ao);
            E.E.ifPresent(new iry(E, 2));
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

    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void l() {
        this.c.k();
        try {
            be();
            itb E = E();
            ArrayList arrayList = new ArrayList();
            Object obj = E.aR.a;
            ((ReentrantLock) ((aagk) obj).g).lock();
            try {
                for (xyw xywVar : ((aagk) obj).d.values()) {
                    if (xywVar.b == 2) {
                        arrayList.add(xywVar);
                    }
                }
                ((aagk) obj).d.clear();
                ((ReentrantLock) ((aagk) obj).g).unlock();
                ((aagk) obj).c(arrayList);
                E.E.ifPresent(new iry(E, 3));
                akqj.p();
            } catch (Throwable th) {
                ((ReentrantLock) ((aagk) obj).g).unlock();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                akqj.p();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // defpackage.akwc
    public final void o(Class cls, akvz akvzVar) {
        this.ah.l(cls, akvzVar);
    }

    @Override // defpackage.itp, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
