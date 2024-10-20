package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.mediapicker.c2o.contact.VCardContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.file.FileContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.LocationContentItem;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ipc implements inl {
    public static final arml a = armd.a(gqj.r);
    public static final arml b = armd.a(gqj.s);
    public static final arml c = armd.a(gqj.t);
    private final arml A;
    private final arml B;
    private afxy C;
    private aflf D;
    private inn E;
    private List F;
    private final adwq G;
    private final ifb H;
    private final ifb I;
    private final ifb J;
    private final aiim K;
    private final ifb L;
    private final rae M;
    private final ifb N;
    private final ifb O;
    public final cg d;
    public final ygv e;
    public final Optional f;
    public final inj g;
    public final Supplier h;
    public final iqm i;
    public afkq j;
    public boolean k;
    public ins l;
    public final gqg m;
    public final jat n;
    public final ifb o;
    public final ifb p;
    private final afxz q;
    private final ioy r;
    private final ipr s;
    private final afks t;
    private final ksi u;
    private final armf v;
    private final armf w;
    private final iql x;
    private final arml y;
    private final arml z;

    /* JADX WARN: Type inference failed for: r10v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [armf, java.lang.Object] */
    public ipc(cg cgVar, afxz afxzVar, aiim aiimVar, ioy ioyVar, ifb ifbVar, ifb ifbVar2, ifb ifbVar3, ifb ifbVar4, ifb ifbVar5, gqg gqgVar, jat jatVar, ifb ifbVar6, ifb ifbVar7, ifb ifbVar8, rae raeVar, ipr iprVar, ifq ifqVar, afks afksVar, ksi ksiVar, ygv ygvVar, @oht armf armfVar, @ohv armf armfVar2, adwq adwqVar, Optional optional, inj injVar, ConversationIdType conversationIdType, Supplier supplier) {
        this.d = cgVar;
        this.q = afxzVar;
        this.K = aiimVar;
        this.r = ioyVar;
        this.I = ifbVar;
        this.H = ifbVar2;
        this.O = ifbVar3;
        this.N = ifbVar4;
        this.p = ifbVar5;
        this.m = gqgVar;
        this.n = jatVar;
        this.L = ifbVar6;
        this.J = ifbVar7;
        this.o = ifbVar8;
        this.M = raeVar;
        this.s = iprVar;
        this.t = afksVar;
        this.u = ksiVar;
        this.e = ygvVar;
        this.v = armfVar;
        this.w = armfVar2;
        this.G = adwqVar;
        this.f = optional;
        this.g = injVar;
        this.h = supplier;
        ifa ifaVar = new ifa(this, 13);
        inn j = ipq.j(cgVar);
        ijm ijmVar = new ijm(this, 4);
        lig ligVar = (lig) ifqVar.b.b();
        iql iqlVar = (iql) ifqVar.c.b();
        iji ijiVar = (iji) ifqVar.d.b();
        jgq jgqVar = (jgq) ifqVar.a.b();
        jgqVar.getClass();
        this.x = new iql(ligVar, iqlVar, ijiVar, jgqVar, ifaVar, j, ijmVar);
        inn j2 = ipq.j(cgVar);
        ngv ngvVar = (ngv) raeVar.b.b();
        arwe arweVar = (arwe) raeVar.e.b();
        arweVar.getClass();
        ahiy ahiyVar = (ahiy) raeVar.f.b();
        ahiyVar.getClass();
        xnv xnvVar = (xnv) raeVar.h.b();
        xnvVar.getClass();
        rtb rtbVar = (rtb) raeVar.d.b();
        rtbVar.getClass();
        ngw ngwVar = (ngw) raeVar.i.b();
        abbu abbuVar = (abbu) raeVar.g.b();
        abbuVar.getClass();
        this.i = new iqm(ngvVar, arweVar, ahiyVar, xnvVar, rtbVar, ngwVar, abbuVar, (mcu) raeVar.c.b(), (mcx) raeVar.a.b(), j2, supplier);
        this.y = armd.a(new ifa(this, 10));
        this.z = armd.a(new ifa(this, 14));
        this.A = armd.a(new ifa(this, 11));
        this.B = armd.a(new ifa(this, 15));
    }

    @Override // defpackage.inl
    public final /* synthetic */ cg a() {
        return null;
    }

    @Override // defpackage.inl
    public final void b() {
        j(false, new gsh(this, 19));
    }

    @Override // defpackage.inl
    public final void c(Bundle bundle) {
        ins insVar;
        afxy i = i();
        this.k = true;
        Integer num = null;
        agek agekVar = null;
        if (ipe.a() <= 1) {
            insVar = ins.EMOTIVE;
        } else {
            Integer valueOf = Integer.valueOf(bundle.getInt("input_type", -1));
            int intValue = valueOf.intValue();
            if (intValue < 0 || intValue >= ipq.e().length) {
                valueOf = null;
            }
            if (valueOf != null) {
                insVar = ipq.e()[valueOf.intValue()];
            } else {
                insVar = null;
            }
        }
        if (insVar != null) {
            int ordinal = insVar.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                i.k(agek.h);
                            } else {
                                Objects.toString(insVar);
                                throw new IllegalStateException("Unsupported input type ".concat(insVar.toString()));
                            }
                        } else {
                            i.k(agek.g);
                        }
                    } else if (((Boolean) ipe.c.e()).booleanValue()) {
                        List c2 = ipq.c();
                        Integer valueOf2 = Integer.valueOf(bundle.getInt("initial_screen", -1));
                        if (valueOf2.intValue() < 0) {
                            valueOf2 = null;
                        }
                        if (valueOf2 != null) {
                            agekVar = ((agek[]) a.a())[valueOf2.intValue()];
                        }
                        i.m(c2, agekVar, ipq.d(bundle));
                    } else {
                        List c3 = ipq.c();
                        String d = ipq.d(bundle);
                        c3.getClass();
                        i.m(c3, null, d);
                    }
                } else {
                    i.k(agek.a);
                }
            } else {
                if (((Boolean) ((utz) ipe.o.get()).e()).booleanValue()) {
                    this.u.a();
                }
                if (bundle.getBoolean("open_location_chooser")) {
                    num = Integer.valueOf(R.string.location_shortcut_title);
                } else {
                    Integer valueOf3 = Integer.valueOf(bundle.getInt("auto_launch_shortcut", -1));
                    if (valueOf3.intValue() >= 0) {
                        num = valueOf3;
                    }
                }
                if (num != null) {
                    i.l(num.intValue());
                } else {
                    i.k(agek.e);
                }
            }
            this.l = insVar;
            return;
        }
        throw new IllegalStateException("No input type provided to Hugo input");
    }

    @Override // defpackage.inl
    public final void d(inn innVar) {
        this.E = innVar;
    }

    @Override // defpackage.inl
    public final void e(inq inqVar) {
        h();
    }

    @Override // defpackage.inl
    public final boolean f() {
        if (j(false, gvj.j) == agdp.b) {
            return true;
        }
        return false;
    }

    public final ioq g(MessagePartCoreData messagePartCoreData) {
        List list = this.F;
        Object obj = null;
        if (list == null) {
            arro.b("onDraftRemovalListeners");
            list = null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((ioq) next).i(messagePartCoreData)) {
                obj = next;
                break;
            }
        }
        return (ioq) obj;
    }

    /* JADX WARN: Type inference failed for: r5v22, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v31, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v39, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v44, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v49, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v53, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v23, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [armf, java.lang.Object] */
    public final afkq h() {
        Object obj;
        if (this.j == null) {
            aiim aiimVar = this.K;
            obj = this.h.get();
            EditText d = ((inq) obj).d();
            d.getClass();
            this.D = aiimVar.o(d);
            adwq adwqVar = this.G;
            new afks();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList = new ArrayList();
            int i = 1;
            if (((Boolean) ipe.e.e()).booleanValue()) {
                if (((Boolean) utw.o.e()).booleanValue()) {
                    ifb ifbVar = this.I;
                    Supplier supplier = this.h;
                    mci mciVar = (mci) ifbVar.a.b();
                    ifb ifbVar2 = (ifb) ifbVar.b.b();
                    ifbVar2.getClass();
                    iow iowVar = new iow(mciVar, ifbVar2, supplier, 1);
                    int i2 = arsc.a;
                    aeke.bm(new arrh(inf.class), iowVar, linkedHashMap);
                } else {
                    ifb ifbVar3 = this.H;
                    iow iowVar2 = new iow((mci) ifbVar3.a.b(), (ifb) ifbVar3.b.b(), this.h, 0, (char[]) null);
                    int i3 = arsc.a;
                    aeke.bm(new arrh(VCardContentItem.class), iowVar2, linkedHashMap);
                }
                if (((Boolean) utw.o.e()).booleanValue()) {
                    ifb ifbVar4 = this.O;
                    Supplier supplier2 = this.h;
                    mci mciVar2 = (mci) ifbVar4.a.b();
                    ifb ifbVar5 = (ifb) ifbVar4.b.b();
                    ifbVar5.getClass();
                    aeke.bm(new arrh(imy.class), new iow(mciVar2, ifbVar5, supplier2, 2, (byte[]) null), linkedHashMap);
                } else {
                    ifb ifbVar6 = this.N;
                    aeke.bm(new arrh(FileContentItem.class), new iow((mci) ifbVar6.a.b(), (ifb) ifbVar6.b.b(), this.h, 3, null, null), linkedHashMap);
                }
                if (((Boolean) utw.o.e()).booleanValue()) {
                    ifb ifbVar7 = this.L;
                    Supplier supplier3 = this.h;
                    mci mciVar3 = (mci) ifbVar7.a.b();
                    ifb ifbVar8 = (ifb) ifbVar7.b.b();
                    ifbVar8.getClass();
                    aeke.bm(new arrh(ind.class), new ipl(mciVar3, ifbVar8, supplier3), linkedHashMap);
                } else {
                    ifb ifbVar9 = this.J;
                    aeke.bm(new arrh(LocationContentItem.class), new ipn((mci) ifbVar9.a.b(), (ifb) ifbVar9.b.b(), this.h), linkedHashMap);
                }
            }
            ipu ipuVar = (ipu) this.y.a();
            if (ipuVar != null) {
                int i4 = arsc.a;
                aeke.bm(new arrh(afql.class), ipuVar, linkedHashMap);
                arrayList.add(ipuVar);
            }
            ipu ipuVar2 = (ipu) this.z.a();
            if (ipuVar2 != null) {
                int i5 = arsc.a;
                aeke.bm(new arrh(afxr.class), ipuVar2, linkedHashMap);
                arrayList.add(ipuVar2);
            }
            ipi ipiVar = (ipi) this.A.a();
            if (ipiVar != null) {
                int i6 = arsc.a;
                aeke.bm(new arrh(afto.class), ipiVar, linkedHashMap);
                arrayList.add(ipiVar);
            }
            ipx ipxVar = (ipx) this.B.a();
            if (ipxVar != null) {
                int i7 = arsc.a;
                aeke.bm(new arrh(aftq.class), ipxVar, linkedHashMap);
                arrayList.add(ipxVar);
            }
            this.F = arrayList;
            afks afksVar = this.t;
            aflf aflfVar = this.D;
            if (aflfVar == null) {
                arro.b("draftTextController");
                aflfVar = null;
            }
            this.j = new afkq(aflfVar, new afkw((Activity) adwqVar.a, afksVar, new mrr(aqjn.r(linkedHashMap), 4)));
            iql iqlVar = this.x;
            iqlVar.getClass();
            aktp.H(this.d, iqk.class, new nhf(iqlVar, i));
        }
        aflf aflfVar2 = this.D;
        if (aflfVar2 == null) {
            arro.b("draftTextController");
            aflfVar2 = null;
        }
        aflfVar2.i(this.r);
        afkq afkqVar = this.j;
        if (afkqVar == null) {
            arro.b("draftController");
            return null;
        }
        return afkqVar;
    }

    public final afxy i() {
        ipc ipcVar;
        if (this.C == null) {
            ViewGroup viewGroup = this.g.d;
            viewGroup.getClass();
            afxz afxzVar = this.q;
            ipr iprVar = this.s;
            da G = this.d.G();
            ifa ifaVar = new ifa(this, 12);
            rl rlVar = new rl(this, 6, (float[]) null);
            ibo iboVar = new ibo(this, 18);
            int dimensionPixelSize = this.d.z().getDimensionPixelSize(R.dimen.compose_elevation_on_scroll);
            Object b2 = this.v.b();
            b2.getClass();
            boolean booleanValue = ((Boolean) b2).booleanValue();
            Object b3 = this.w.b();
            b3.getClass();
            afye a2 = afxzVar.a(iprVar, G, ifaVar, new agdq(rlVar, viewGroup, iboVar, dimensionPixelSize, booleanValue, true, ((Boolean) b3).booleanValue(), false, false, false, 64512));
            ipcVar = this;
            ipcVar.C = a2;
        } else {
            ipcVar = this;
        }
        afxy afxyVar = ipcVar.C;
        if (afxyVar == null) {
            arro.b("hugoManager");
            return null;
        }
        return afxyVar;
    }

    public final Object j(boolean z, arqr arqrVar) {
        afxy afxyVar;
        if (z) {
            afxyVar = i();
        } else {
            afxyVar = this.C;
            if (afxyVar == null) {
                afxyVar = null;
            }
        }
        if (afxyVar == null) {
            return null;
        }
        return arqrVar.a(afxyVar);
    }

    public final void k() {
        j(false, gvj.h);
        aflf aflfVar = this.D;
        if (aflfVar == null) {
            arro.b("draftTextController");
            aflfVar = null;
        }
        aflfVar.l(this.r);
    }

    public final boolean l() {
        afxy afxyVar = this.C;
        if (afxyVar != null && afxyVar.c() != agdp.d) {
            return true;
        }
        return false;
    }

    @Override // defpackage.zqe
    public final boolean n() {
        boolean F = d.F(j(false, gvj.i), true);
        if (F && this.E != null && !l()) {
            inn innVar = this.E;
            if (innVar == null) {
                arro.b("inputManager");
                innVar = null;
            }
            innVar.h(false);
        }
        return F;
    }

    @Override // defpackage.zqf
    public final void v() {
        throw null;
    }
}
