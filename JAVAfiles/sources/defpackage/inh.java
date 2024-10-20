package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class inh implements inn, agar {
    public static final alwo a = alwo.o("BugleInputManager");
    public static final uuf b = uuh.q(161156130);
    public final armf c;
    public final armf d;
    public boolean e;
    public ipc f;
    public inj g;
    public inq h;
    public ins i;
    public final iou j;
    private final ajwt k;
    private final ConversationIdType l;
    private final cg m;
    private final armf n;
    private final armf o;
    private final Map p;
    private final armf q;
    private dk r;
    private final List s = new ArrayList();
    private inl t;
    private final armf u;
    private final armf v;

    public inh(String str, ing ingVar, armf armfVar, armf armfVar2, armf armfVar3, Map map, armf armfVar4, armf armfVar5, armf armfVar6, kor korVar, iou iouVar, ajwt ajwtVar, armf armfVar7) {
        this.l = ruy.b(str);
        this.k = ajwtVar;
        this.m = ingVar;
        this.n = armfVar;
        this.o = armfVar2;
        this.c = armfVar3;
        this.p = map;
        this.d = armfVar4;
        this.q = armfVar5;
        this.u = armfVar6;
        this.j = iouVar;
        lbj lbjVar = (lbj) korVar.c().orElse(null);
        gvc gvcVar = new gvc(this, 3);
        iouVar.a = lbjVar;
        iouVar.b = gvcVar;
        this.v = armfVar7;
    }

    private final void A(ins insVar) {
        int size = this.s.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((ino) this.s.get(size)).b(insVar);
            } else {
                return;
            }
        }
    }

    private final void B(inl inlVar, boolean z) {
        if (inlVar != null) {
            inlVar.b();
            cg a2 = inlVar.a();
            if (a2 != null) {
                dk x = x();
                if (z) {
                    x.A(R.anim.slide_in_bottom, R.anim.slide_out_bottom);
                }
                x.n(a2);
            }
        }
    }

    private final void C(boolean z) {
        inr z2 = z();
        if (z2 != inr.IME) {
            if (z2 != null) {
                inj injVar = this.g;
                injVar.getClass();
                injVar.f();
            }
            B(y(), z);
        }
    }

    private final void D() {
        ini iniVar;
        if (!F()) {
            E();
            B(this.t, false);
            if (this.e) {
                G(akto.j(new eyg(3)));
            }
            inj injVar = this.g;
            if (injVar != null) {
                if (injVar.h.d()) {
                    iniVar = ini.MATCHING_IME_TRANSIENT_HEIGHTS;
                } else {
                    iniVar = ini.NONE;
                }
                injVar.d(iniVar);
                int a2 = injVar.f - injVar.h.a();
                ioc iocVar = injVar.b;
                injVar.h.a();
                iocVar.d(a2);
            }
        }
    }

    private final void E() {
        if (!F()) {
            this.t = y();
            ins insVar = this.i;
            ins insVar2 = ins.IME;
            if (insVar != insVar2) {
                this.i = insVar2;
                A(insVar2);
            }
        }
    }

    private final boolean F() {
        inl y = y();
        if (y != null && y.f()) {
            return true;
        }
        return false;
    }

    private final void G(Runnable runnable) {
        aksa k = akqj.k();
        try {
            dk dkVar = this.r;
            if (dkVar != null) {
                dkVar.w(runnable);
                if (((Boolean) this.u.b()).booleanValue()) {
                    dkVar.b();
                } else {
                    dkVar.i();
                }
                this.r = null;
            } else {
                runnable.run();
            }
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

    private final dk x() {
        if (this.r == null) {
            this.r = new bd(this.m.G());
        }
        return this.r;
    }

    private final inl y() {
        return b(false);
    }

    private final inr z() {
        ins insVar = this.i;
        if (insVar == null) {
            if (((ink) this.c.b()).e()) {
                return inr.IME;
            }
            return null;
        }
        return ipq.i(insVar);
    }

    public final inh a() {
        return ((ing) this.m).E();
    }

    public final inl b(boolean z) {
        inr z2 = z();
        if (z2 == inr.HUGO) {
            if (!z) {
                ipc ipcVar = this.f;
                ipcVar.getClass();
                if (!ipcVar.l()) {
                    return null;
                }
            }
            return this.f;
        }
        if (z2 != null) {
            cg cgVar = this.m;
            eoz e = cgVar.G().e(z2.name());
            if (e != null) {
                return (inl) ((akkh) e).E();
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.inn
    public final ins c() {
        return this.i;
    }

    @Override // defpackage.inn
    public final void d(ino inoVar) {
        if (!this.s.contains(inoVar)) {
            this.s.add(inoVar);
        }
        ins insVar = this.i;
        if (insVar != null) {
            inoVar.b(insVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [armf, java.lang.Object] */
    public final void e(View view) {
        gpx gpxVar = (gpx) this.o.b();
        Activity activity = (Activity) gpxVar.b.b();
        ink inkVar = (ink) gpxVar.a.b();
        inkVar.getClass();
        atal atalVar = (atal) gpxVar.c.b();
        ioc iocVar = (ioc) gpxVar.d.b();
        view.getClass();
        this.g = new inj(activity, inkVar, atalVar, iocVar, view);
        ipd ipdVar = (ipd) this.n.b();
        inj injVar = this.g;
        ijm ijmVar = new ijm(this, 2);
        armf armfVar = ipdVar.a;
        armf armfVar2 = ipdVar.b;
        cg cgVar = (cg) ((apxx) armfVar).a;
        afxz afxzVar = (afxz) armfVar2.b();
        aiim aiimVar = (aiim) ipdVar.c.b();
        ioy ioyVar = (ioy) ipdVar.d.b();
        ioyVar.getClass();
        ifb ifbVar = (ifb) ipdVar.e.b();
        ifb ifbVar2 = (ifb) ipdVar.f.b();
        ifb ifbVar3 = (ifb) ipdVar.g.b();
        ifb ifbVar4 = (ifb) ipdVar.h.b();
        ifb ifbVar5 = (ifb) ipdVar.i.b();
        gqg gqgVar = (gqg) ipdVar.j.b();
        jat jatVar = (jat) ipdVar.k.b();
        ifb ifbVar6 = (ifb) ipdVar.l.b();
        ifb ifbVar7 = (ifb) ipdVar.m.b();
        ifb ifbVar8 = (ifb) ipdVar.n.b();
        rae raeVar = (rae) ipdVar.o.b();
        ipr iprVar = (ipr) ipdVar.p.b();
        iprVar.getClass();
        ifq ifqVar = (ifq) ipdVar.q.b();
        afks afksVar = (afks) ipdVar.r.b();
        afksVar.getClass();
        ksi ksiVar = (ksi) ipdVar.s.b();
        ksiVar.getClass();
        ygv ygvVar = (ygv) ipdVar.t.b();
        armf armfVar3 = ipdVar.u;
        armf armfVar4 = ipdVar.v;
        Object b2 = ipdVar.w.b();
        ConversationIdType conversationIdType = this.l;
        Optional optional = (Optional) ipdVar.x.b();
        injVar.getClass();
        ipc ipcVar = new ipc(cgVar, afxzVar, aiimVar, ioyVar, ifbVar, ifbVar2, ifbVar3, ifbVar4, ifbVar5, gqgVar, jatVar, ifbVar6, ifbVar7, ifbVar8, raeVar, iprVar, ifqVar, afksVar, ksiVar, ygvVar, armfVar3, armfVar4, (adwq) b2, optional, injVar, conversationIdType, ijmVar);
        this.f = ipcVar;
        ipcVar.h();
        afxy i = ipcVar.i();
        i.d();
        if (((Boolean) ((utz) ipe.q.get()).e()).booleanValue()) {
            agek agekVar = agek.g;
            iqm iqmVar = ipcVar.i;
            ascv ascvVar = iqmVar.a;
            ipf ipfVar = ipf.b;
            iqmVar.getClass();
            ascv ascvVar2 = iqmVar.c;
            asai asaiVar = iqmVar.b;
            ascv ascvVar3 = iqmVar.d;
            ascv ascvVar4 = iqmVar.e;
            apax apaxVar = ((nhs) nhr.g.e()).b;
            apaxVar.getClass();
            i.n(agekVar, new agip(ascvVar, ipfVar, iqmVar, ascvVar2, asaiVar, ascvVar3, ascvVar4, new agii(apaxVar, 13), ipcVar.e, true, 7168));
        }
        if (((Boolean) yig.af.e()).booleanValue()) {
            ipcVar.f.ifPresent(new ibo(new gsh(i, 18), 19));
        }
    }

    public final void f(ins insVar) {
        int size = this.s.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((ino) this.s.get(size)).a(insVar);
            } else {
                return;
            }
        }
    }

    public final void g(Bundle bundle, ins insVar) {
        inl b2;
        Bundle bundle2;
        if (insVar == ins.IME) {
            b2 = null;
        } else {
            b2 = b(true);
        }
        if (b2 != null) {
            p(b2);
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            if (ipe.a() > 1) {
                bundle2.putInt("input_type", insVar.ordinal());
            }
            b2.c(bundle2);
            agaq agaqVar = agaq.a;
            int ordinal = insVar.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        ((mgv) this.q.b()).f(mgv.E);
                    }
                } else {
                    ((mgv) this.q.b()).f(mgv.A);
                }
            } else {
                ((mgv) this.q.b()).f(mgv.D);
            }
        }
        if (insVar != ins.IME) {
            A(insVar);
        }
    }

    @Override // defpackage.inn
    public final void h(boolean z) {
        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/conversation/input/AccountInputManagerFragmentPeer", "hideInput", 468, "AccountInputManagerFragmentPeer.java")).D("InputManager: Hide input (visible input: %s on %s)", this.i, z());
        if (z() == inr.IME) {
            ink inkVar = (ink) this.c.b();
            View view = inkVar.d;
            if (view == null) {
                view = inkVar.a.getCurrentFocus();
            }
            if (view != null) {
                inkVar.c(view);
                inkVar.d = null;
            } else {
                inkVar.b.i();
            }
            if (!((Boolean) ipe.p.e()).booleanValue()) {
                inj injVar = this.g;
                injVar.getClass();
                injVar.b();
                return;
            }
            return;
        }
        if (this.e) {
            ins insVar = this.i;
            C(z);
            this.i = null;
            G(new fhh(this, insVar, 20));
        }
    }

    @Override // defpackage.inn
    public final void i(List list) {
        ipc ipcVar = this.f;
        if (ipcVar != null) {
            list.getClass();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
                ioq g = ipcVar.g(messagePartCoreData);
                if (g != null) {
                    qjh.l(ene.b(ipcVar.d), null, new gvr(ipcVar, g.h(), messagePartCoreData, (arpe) null, 6), 3);
                }
            }
            return;
        }
        throw new IllegalStateException("Attempted to use HugoInput before it was initialized");
    }

    @Override // defpackage.inn
    public final void j() {
        ipc ipcVar = this.f;
        if (ipcVar != null) {
            ipcVar.j(false, gvj.l);
            return;
        }
        throw new IllegalStateException("Attempted to use HugoInput before it was initialized");
    }

    @Override // defpackage.inn
    public final void k(MessagePartCoreData messagePartCoreData) {
        ipc ipcVar = this.f;
        if (ipcVar != null) {
            messagePartCoreData.getClass();
            ioq g = ipcVar.g(messagePartCoreData);
            if (g != null) {
                ipcVar.h().b.f((afcq) g.h().a(messagePartCoreData));
                return;
            }
            return;
        }
        throw new IllegalStateException("Attempted to use Hugo before it was initialized");
    }

    @Override // defpackage.agar
    public final void l(int i) {
        inj injVar = this.g;
        if (injVar != null && injVar.g != null) {
            int b2 = injVar.h.b();
            int ordinal = injVar.g.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            injVar.e(injVar.c, b2);
                            return;
                        }
                        return;
                    } else {
                        if (injVar.h.b.d() == agaq.a) {
                            injVar.e(injVar.c, b2);
                            return;
                        }
                        return;
                    }
                }
                if (injVar.h.b.d().e && b2 > 0) {
                    injVar.e(injVar.e, b2);
                    return;
                }
                return;
            }
            injVar.b.d(injVar.f - b2);
        }
    }

    @Override // defpackage.agar
    public final void m(agaq agaqVar) {
        inj injVar;
        agaq agaqVar2 = agaq.a;
        int ordinal = agaqVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        ins insVar = this.i;
                        ins insVar2 = ins.IME;
                        if (insVar == insVar2) {
                            this.i = null;
                            f(insVar2);
                            inj injVar2 = this.g;
                            if (injVar2 != null) {
                                injVar2.b();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (this.i == ins.IME && (injVar = this.g) != null) {
                    injVar.f();
                    return;
                }
                return;
            }
            E();
            return;
        }
        D();
    }

    @Override // defpackage.zqe
    public final boolean n() {
        inl y = y();
        if (y == null) {
            return false;
        }
        if (!y.n()) {
            h(false);
            return true;
        }
        return true;
    }

    @Override // defpackage.inn
    public final void o(ino inoVar) {
        this.s.remove(inoVar);
    }

    public final void p(inl inlVar) {
        inq inqVar = this.h;
        if (inqVar != null) {
            inlVar.e(inqVar);
        } else if (inlVar != this.f) {
            throw new IllegalStateException("Cannot show an input without an input sink!");
        }
        inlVar.d(a());
    }

    @Override // defpackage.inn
    public final void q(inq inqVar) {
        this.h = inqVar;
        ipc ipcVar = this.f;
        if (ipcVar != null) {
            p(ipcVar);
        }
    }

    @Override // defpackage.inn
    public final void r(ins insVar, boolean z, boolean z2) {
        s(insVar, z, z2, null);
    }

    @Override // defpackage.inn
    public final void s(ins insVar, boolean z, boolean z2, Bundle bundle) {
        armo armoVar;
        boolean z3;
        EditText d;
        inr i = ipq.i(insVar);
        if (this.e || i == inr.HUGO) {
            ins insVar2 = this.i;
            ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/conversation/input/AccountInputManagerFragmentPeer", "showInput", 333, "AccountInputManagerFragmentPeer.java")).J("InputManager: Show input %s (visible input: %s on %s)", insVar, insVar2, z());
            if (insVar2 != insVar) {
                if (insVar2 == null && z) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (insVar != ins.IME && i != z()) {
                    C(z3);
                }
                if (i == inr.IME) {
                    inq inqVar = this.h;
                    if (inqVar != null && (d = inqVar.d()) != null) {
                        if (((ink) this.c.b()).e()) {
                            D();
                        } else if (!((ink) this.c.b()).f(d)) {
                            inj injVar = this.g;
                            injVar.getClass();
                            injVar.c(inr.IME);
                        }
                        ink inkVar = (ink) this.c.b();
                        inkVar.d = d;
                        inkVar.b.f(d, false);
                    }
                } else {
                    this.i = insVar;
                    inj injVar2 = this.g;
                    injVar2.getClass();
                    injVar2.c(i);
                    if (i != inr.HUGO) {
                        String name = i.name();
                        cg e = this.m.G().e(name);
                        if (e != null) {
                            x().l(e);
                        } else {
                            inm inmVar = (inm) this.p.get(i);
                            if (inmVar != null) {
                                cg a2 = inmVar.a(this.k);
                                dk x = x();
                                inj injVar3 = this.g;
                                injVar3.getClass();
                                x.r(injVar3.e.getId(), a2, name);
                            } else {
                                throw new IllegalArgumentException(hht.b(i, "Factory for input surface ", " is not found!"));
                            }
                        }
                    }
                }
            }
            G(akto.j(new rgr(this, insVar2, insVar, i, bundle, 1)));
            if (!u(i)) {
                g(bundle, insVar);
            }
            if (z2) {
                jgq jgqVar = (jgq) this.v.b();
                insVar.getClass();
                alvw f = jgq.a.f();
                f.X(alwp.a, "BugleComposeRow2");
                ((alvg) f.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/navigation/ComposeRowNavigationListener", "onConv1InputSelected", 44, "ComposeRowNavigationListener.kt")).t("ComposeRowNavigationListener.onConv1InputSelected %s", insVar);
                int ordinal = insVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                    if (ordinal == 5) {
                                        armoVar = new armo(amqe.UNKNOWN_OPENING_SOURCE, amqh.UNKNOWN_COMPOSE_SCREEN_CATEGORY);
                                    } else {
                                        throw new armm();
                                    }
                                } else {
                                    armoVar = new armo(amqe.UNKNOWN_OPENING_SOURCE, amqh.VOICE);
                                }
                            } else {
                                armoVar = new armo(amqe.DRAFT_END_EMOJI_BUTTON, amqh.EMOTIVE);
                            }
                        } else {
                            armoVar = new armo(amqe.CAMERA_GALLERY_BUTTON, amqh.CAMERA_GALLERY);
                        }
                    } else {
                        armoVar = new armo(amqe.PLUS_BUTTON, amqh.ALL);
                    }
                } else {
                    armoVar = null;
                }
                if (armoVar != null) {
                    jgqVar.b.d((amqh) armoVar.b, amqi.EXPANDED, (amqe) armoVar.a, amqf.UNKNOWN_OPENING_STATE, null, null);
                }
            }
        }
    }

    @Override // defpackage.inn
    public final boolean t() {
        EditText d;
        inq inqVar = this.h;
        if ((inqVar != null && (d = inqVar.d()) != null && ((ink) this.c.b()).f(d)) || this.i != null) {
            return true;
        }
        return false;
    }

    public final boolean u(inr inrVar) {
        if (inrVar == inr.HUGO && ((Boolean) this.u.b()).booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.zqf
    public final void v() {
        y();
    }

    @Override // defpackage.inn
    public final void w() {
        y();
    }
}
