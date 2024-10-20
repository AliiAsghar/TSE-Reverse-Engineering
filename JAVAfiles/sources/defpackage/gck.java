package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.messagedetails.viewmodel.MessageDetailsViewModel;
import defpackage.bwj;
import j$.time.Duration;
import j$.util.Optional;
import java.util.Arrays;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gck extends arrp implements arqv {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gck(Object obj, int i) {
        super(2);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v124, types: [java.lang.Object, arml] */
    /* JADX WARN: Type inference failed for: r2v140, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [ascv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r2v83, types: [cas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, arml] */
    /* JADX WARN: Type inference failed for: r3v20, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [armf, java.lang.Object] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        epf epfVar;
        arpi arpiVar;
        boolean z = true;
        agak agakVar = null;
        int i = 11;
        switch (this.b) {
            case 0:
                ((gcl) this.a).F();
                return arnb.a;
            case 1:
                iba ibaVar = (iba) obj;
                iba ibaVar2 = (iba) obj2;
                ibaVar.getClass();
                ibaVar2.getClass();
                if (dyh.e((gef) this.a, (gef) ibaVar.a, gbb.PREPEND)) {
                    ibaVar.g((gef) this.a);
                }
                if (dyh.e((gef) this.a, (gef) ibaVar2.a, gbb.APPEND)) {
                    ibaVar2.g((gef) this.a);
                }
                return arnb.a;
            case 2:
                bwj bwjVar = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
                    bwjVar.v();
                } else {
                    ifd ifdVar = (ifd) ((ifb) this.a).b.a();
                    ibi ibiVar = ifdVar.a;
                    synchronized (eos.a) {
                        epfVar = (epf) ifdVar.j("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
                        if (epfVar == null) {
                            try {
                                arwb arwbVar = arws.a;
                                arpiVar = asfh.a.i();
                            } catch (armn unused) {
                                arpiVar = arpj.a;
                            } catch (IllegalStateException unused2) {
                                arpiVar = arpj.a;
                            }
                            epf epfVar2 = new epf(arpiVar.plus(new aryj(null)));
                            ifdVar.l("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", epfVar2);
                            epfVar = epfVar2;
                        }
                    }
                    kkc kkcVar = (kkc) ibiVar.a.b();
                    iji ijiVar = (iji) kkcVar.a.b();
                    gpx gpxVar = (gpx) kkcVar.b.b();
                    ktk ktkVar = (ktk) kkcVar.c.b();
                    ktkVar.getClass();
                    hlc.p(new ifx(new ifs(ijiVar, gpxVar, ktkVar, epfVar).e), bwjVar, 0);
                }
                return arnb.a;
            case 3:
                bwj bwjVar2 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar2.L()) {
                    bwjVar2.v();
                } else {
                    zfu.a(false, false, cdk.e(-1027481752, new gck(this.a, 2), bwjVar2), bwjVar2, 384);
                }
                return arnb.a;
            case 4:
                bwj bwjVar3 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar3.L()) {
                    bwjVar3.v();
                } else {
                    Object obj3 = this.a;
                    aron aronVar = new aron((byte[]) null);
                    aronVar.add(aerd.a.c(((ifb) obj3).a.b()));
                    bzd[] bzdVarArr = (bzd[]) aqjn.x(aronVar).toArray(new bzd[0]);
                    bwx.b((bzd[]) Arrays.copyOf(bzdVarArr, bzdVarArr.length), cdk.e(221768952, new gck(this.a, 3), bwjVar3), bwjVar3, 56);
                }
                return arnb.a;
            case 5:
                bwj bwjVar4 = (bwj) obj;
                ((Number) obj2).intValue();
                bwjVar4.y(154650652);
                int intValue = ((Number) this.a.a()).intValue();
                bwjVar4.q();
                return Integer.valueOf(intValue);
            case 6:
                bwj bwjVar5 = (bwj) obj;
                ((Number) obj2).intValue();
                bwjVar5.y(1803126868);
                int intValue2 = ((Number) this.a.a()).intValue();
                bwjVar5.q();
                return Integer.valueOf(intValue2);
            case 7:
                bwj bwjVar6 = (bwj) obj;
                ((Number) obj2).intValue();
                bwjVar6.y(341213565);
                int b = ckw.b(adom.bX(bwjVar6).c.a((String) this.a));
                bwjVar6.q();
                return Integer.valueOf(b);
            case 8:
                bwj bwjVar7 = (bwj) obj;
                ((Number) obj2).intValue();
                bwjVar7.y(800670789);
                int b2 = ckw.b(adom.bX(bwjVar7).c.a((String) this.a));
                bwjVar7.q();
                return Integer.valueOf(b2);
            case 9:
                bwj bwjVar8 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar8.L()) {
                    bwjVar8.v();
                } else {
                    Optional optional = (Optional) ((jco) this.a).k.b();
                    bwjVar8.y(-1158501547);
                    Object h = bwjVar8.h();
                    if (h == bwj.a.a) {
                        ivi iviVar = new ivi(jbs.h, i);
                        bwjVar8.B(iviVar);
                        h = iviVar;
                    }
                    Function m329m = d$$ExternalSyntheticApiModelOutline0.m329m(h);
                    bwjVar8.q();
                    Object orElse = optional.map(m329m).orElse(ascy.a(lxy.a));
                    orElse.getClass();
                    cas a = cak.a((ascv) orElse, bwjVar8);
                    boolean booleanValue = ((Boolean) cao.b(((jco) this.a).a().d.g, false, null, bwjVar8, 2).a()).booleanValue();
                    bzd[] bzdVarArr2 = new bzd[6];
                    bzdVarArr2[0] = aerd.a.c(((jco) this.a).c.b());
                    bzdVarArr2[1] = kei.a.c(((jco) this.a).a().n);
                    bzdVarArr2[2] = kic.a.c(((jco) this.a).a().o);
                    bzdVarArr2[3] = qjf.a.c(((kkc) ((jco) this.a).h.b()).a);
                    bzdVarArr2[4] = lyb.a.c((lxz) a.a());
                    armf armfVar = ((jco) this.a).x;
                    bzc bzcVar = agas.a;
                    if (((obl) armfVar.b()).a()) {
                        agakVar = (agak) ((jco) this.a).y.b();
                    }
                    bzdVarArr2[5] = bzcVar.c(agakVar);
                    bwx.b(bzdVarArr2, cdk.e(-1653874800, new aerv(this.a, booleanValue, 1), bwjVar8), bwjVar8, 56);
                }
                return arnb.a;
            case 10:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                num.getClass();
                num2.getClass();
                if (num.intValue() > 0) {
                    return Integer.valueOf(num.intValue() + num2.intValue());
                }
                throw new IllegalArgumentException("EmojiUsage added to draft but has non-positive cache value " + num + ": " + this.a);
            case 11:
                bwj bwjVar9 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar9.L()) {
                    bwjVar9.v();
                } else {
                    String str = hld.u(this.a).a;
                    if (str != null) {
                        adom.by(str, bwjVar9, 48);
                    }
                }
                return arnb.a;
            case 12:
                bwj bwjVar10 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar10.L()) {
                    bwjVar10.v();
                } else {
                    ahji.N(aeke.bg((aerb) this.a, bwjVar10), dga.a(R.string.close_button_content_description, bwjVar10), null, adom.cb(bwjVar10).h, bwjVar10, 8, 4);
                }
                return arnb.a;
            case 13:
                ((Boolean) obj2).booleanValue();
                ((Context) obj).getClass();
                return this.a;
            case 14:
                ((Boolean) obj2).booleanValue();
                ((Context) obj).getClass();
                return this.a;
            case 15:
                miz mizVar = (miz) obj;
                miz mizVar2 = (miz) obj2;
                mizVar.getClass();
                mizVar2.getClass();
                Duration abs = Duration.between(mizVar.h(), mizVar2.h()).abs();
                Object b3 = ((kck) this.a).i.b();
                b3.getClass();
                if (abs.compareTo(Duration.ofSeconds(((Number) b3).longValue())) >= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 16:
                bwj bwjVar11 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar11.L()) {
                    bwjVar11.v();
                } else {
                    bqk.a((bqn) this.a, ani.a(cga.e), null, bwjVar11, 6, 4);
                }
                return arnb.a;
            case 17:
                bwj bwjVar12 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar12.L()) {
                    bwjVar12.v();
                } else {
                    kic.b((khy) this.a, bwjVar12, 0);
                }
                return arnb.a;
            case 18:
                bwj bwjVar13 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar13.L()) {
                    bwjVar13.v();
                } else {
                    lfo lfoVar = (lfo) ((MessageDetailsViewModel) ((lfl) this.a).d.a()).a.b();
                    akrh e = aktp.e("MessageDetailsScreenUiAdapter#createUiData");
                    try {
                        akul j = lfoVar.b.a(lfoVar.d, miv.MINIMAL).b().j(lfoVar.e);
                        j.getClass();
                        asai a2 = asbm.a(new aghw(qjh.g(j), 11), new lfn(lfoVar, (arpe) null, 0));
                        armd.i(e, null);
                        lga.n(a2, bwjVar13, 8);
                    } finally {
                    }
                }
                return arnb.a;
            case 19:
                bwj bwjVar14 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar14.L()) {
                    bwjVar14.v();
                } else {
                    yzc.t(null, null, false, null, false, cdk.e(-693138264, new gck(this.a, 18), bwjVar14), bwjVar14, 196608, 31);
                }
                return arnb.a;
            default:
                bwj bwjVar15 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar15.L()) {
                    bwjVar15.v();
                } else {
                    bwx.a(aerd.a.c(((lfl) this.a).b.b()), cdk.e(2047796156, new gck(this.a, 19), bwjVar15), bwjVar15, 56);
                }
                return arnb.a;
        }
    }
}
