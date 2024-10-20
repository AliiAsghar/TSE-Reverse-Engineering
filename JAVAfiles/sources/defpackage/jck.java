package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.conversation2.viewmodel.ConversationViewModel;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversationId;
import defpackage.aklx;
import j$.time.Instant;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jck extends jcs implements akkh, apxq, akkf, aklk, akrw {
    private jco a;
    private boolean ag;
    private Context d;
    private final eno e = new eno(this);

    @Deprecated
    public jck() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return jco.class;
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            aM(layoutInflater, viewGroup, bundle);
            jco E = E();
            layoutInflater.getClass();
            akrh e = aktp.e("Conversation2Fragment::onCreateView");
            try {
                ComposeView composeView = new ComposeView(E.b.y(), null, 0, 6, null);
                E.m.ifPresent(new ixj(new jbs(8), 10));
                composeView.setFitsSystemWindows(true);
                composeView.setOnApplyWindowInsetsListener(new ivf(3));
                composeView.a(new cdj(1096399568, true, new gck(E, 9)));
                ((lfl) E.n.b()).v(composeView, 184228);
                if (((oek) E.v.b()).a()) {
                    e = aktp.e("logFirstTimeConversationOpenEvent");
                    try {
                        mgh mghVar = (mgh) E.t.b();
                        Instant f = ((xnv) E.u.b()).f();
                        f.getClass();
                        mdt mdtVar = (mdt) mghVar.b.b();
                        qiu.h(qjh.j(mghVar.d, new jyw(akul.g(mdtVar.c.a()).h(new mdr(0), mdtVar.b).i(new ikd(mdtVar, f, 13), mdtVar.b), mghVar, f, (arpe) null, 13)));
                        armd.i(e, null);
                    } finally {
                    }
                }
                armd.i(e, null);
                akqj.p();
                return composeView;
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
        return this.e;
    }

    @Override // defpackage.jcs, defpackage.aiuc, defpackage.cg
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
    public final jco E() {
        jco jcoVar = this.a;
        if (jcoVar != null) {
            if (!this.ag) {
                return jcoVar;
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
        aksa b = this.c.b();
        try {
            aQ();
            eea.c(E().b.F().getWindow(), true);
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
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void ad() {
        this.c.k();
        try {
            ba();
            jco E = E();
            ((ubl) E.g.b()).b(ruy.a);
            ((ktk) E.j.b()).a();
            ((khl) E.f.b()).f();
            if (((Boolean) ((utz) yig.Q.get()).e()).booleanValue() && ((Optional) ((apxx) E.a().i).a).isPresent()) {
                ((lqu) ((Optional) ((apxx) E.a().i).a).get()).a();
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
            jco E = E();
            akrh e = aktp.e("Conversation2Fragment::onResume");
            try {
                ConversationId conversationId = E.a().b;
                if (conversationId instanceof BugleConversationId) {
                    ((ubl) E.g.b()).b(((BugleConversationId) conversationId).a);
                } else if (((orj) E.w.b()).a() && (conversationId instanceof EmergencySosConversationId)) {
                    ((ubl) E.g.b()).b(((EmergencySosConversationId) conversationId).a);
                }
                ConversationViewModel a = E.a();
                arxm arxmVar = a.m;
                if (arxmVar != null) {
                    arxmVar.v(null);
                }
                a.m = null;
                armd.i(e, null);
                b.close();
            } finally {
            }
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

    @Override // defpackage.jcs
    protected final /* bridge */ /* synthetic */ aklw d() {
        return new akls(this, true);
    }

    @Override // defpackage.jcs, defpackage.aklf, defpackage.cg
    public final void f(Context context) {
        this.c.k();
        try {
            if (!this.ag) {
                super.f(context);
                if (this.a == null) {
                    try {
                        Object aS = aS();
                        cg cgVar = (cg) ((apxx) ((kql) aS).d).a;
                        if (cgVar instanceof jck) {
                            jck jckVar = (jck) cgVar;
                            apya apyaVar = ((kql) aS).an;
                            kqh kqhVar = ((kql) aS).el;
                            apya apyaVar2 = kqhVar.G;
                            apya apyaVar3 = kqhVar.H;
                            kqi kqiVar = ((kql) aS).ek;
                            apya apyaVar4 = kqiVar.h;
                            apya apyaVar5 = ((kql) aS).a.pP;
                            apya apyaVar6 = ((kql) aS).cb;
                            apya apyaVar7 = kqiVar.i;
                            apya apyaVar8 = kqhVar.A;
                            apya apyaVar9 = kqhVar.J;
                            apya apyaVar10 = kqhVar.L;
                            Optional empty = Optional.empty();
                            krx krxVar = ((kql) aS).a.a;
                            apya apyaVar11 = krxVar.dQ;
                            apya apyaVar12 = krxVar.dC;
                            Optional empty2 = Optional.empty();
                            krx krxVar2 = ((kql) aS).a.a;
                            try {
                                apya apyaVar13 = krxVar2.dR;
                                Optional of = Optional.of((lga) krxVar2.dS.b());
                                kqh kqhVar2 = ((kql) aS).el;
                                apya apyaVar14 = kqhVar2.l;
                                apya apyaVar15 = ((kql) aS).cc;
                                krv krvVar = ((kql) aS).a;
                                apya apyaVar16 = krvVar.bV;
                                krx krxVar3 = krvVar.a;
                                this.a = new jco(jckVar, apyaVar, apyaVar2, apyaVar3, apyaVar4, apyaVar5, apyaVar6, apyaVar7, apyaVar8, apyaVar9, apyaVar10, empty, apyaVar11, apyaVar12, empty2, apyaVar13, of, apyaVar14, apyaVar15, apyaVar16, krxVar3.dT, krvVar.cU, krxVar3.dU, kqhVar2.g);
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
                        } else {
                            throw new IllegalStateException(hht.e(cgVar, jco.class));
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

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void g(Bundle bundle) {
        boolean z;
        boolean z2;
        this.c.k();
        try {
            aP(bundle);
            jco E = E();
            akrh e = aktp.e("Conversation2Fragment::onCreate");
            try {
                ((khl) E.f.b()).d();
                boolean z3 = false;
                eea.c(E.b.F().getWindow(), false);
                if (((lga) arsd.k(E.r)) != null) {
                    yhx.d(E.b.F(), ((aqws) E.s.b()).a);
                }
                if (((Optional) E.l.b()).isEmpty()) {
                    lkc lkcVar = (lkc) E.d.b();
                    lkcVar.b();
                    Bundle bundle2 = E.b.m;
                    if (bundle2 != null) {
                        z = bundle2.getBoolean("can_navigate_back");
                    } else {
                        z = true;
                    }
                    Bundle bundle3 = E.b.m;
                    if (bundle3 != null) {
                        z2 = bundle3.getBoolean("is_bubble_activity");
                    } else {
                        z2 = false;
                    }
                    llg llgVar = llg.a;
                    if (z && !z2) {
                        z3 = true;
                    }
                    lkcVar.c(llgVar, z3);
                }
                ((zgd) E.e.b()).a();
                e = aktp.e("Conversation2Fragment::initializeExpressiveStickers");
                try {
                    if (((Boolean) utw.f.e()).booleanValue()) {
                        ((aark) E.o.b()).b();
                    }
                    armd.i(e, null);
                    E.p.ifPresent(new ixj(jbs.g, 11));
                    armd.i(e, null);
                    akqj.p();
                } finally {
                }
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
    public final void k() {
        this.c.k();
        try {
            bd();
            jco E = E();
            akrh e = aktp.e("Conversation2Fragment::onStart");
            try {
                lep lepVar = E.z;
                String b = E.a().b.b();
                b.getClass();
                lepVar.a(new lem(b));
                armd.i(e, null);
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

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void l() {
        this.c.k();
        try {
            be();
            jco E = E();
            E.z.a(new len());
            ConversationViewModel a = E.a();
            arxm arxmVar = a.m;
            if (arxmVar != null) {
                arxmVar.v(null);
            }
            if (a.l.a()) {
                a.m = qjh.l(a.c, null, new kbl(a, (arpe) null, 13), 3);
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

    @Override // defpackage.jcs, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
