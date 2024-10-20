package defpackage;

import defpackage.bwj;
import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmh {
    public static final /* synthetic */ artm[] a;
    public static final dhn b;

    static {
        arrr arrrVar = new arrr(hmh.class, "displayedDrawable", "getDisplayedDrawable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/runtime/MutableState;", 1);
        int i = arsc.a;
        a = new artm[]{arrrVar};
        b = new dhn("DisplayedDrawable");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.Object r15, java.lang.String r16, defpackage.cga r17, defpackage.cfq r18, defpackage.csv r19, float r20, defpackage.arqr r21, defpackage.bwj r22, int r23) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hmh.a(java.lang.Object, java.lang.String, cga, cfq, csv, float, arqr, bwj, int):void");
    }

    public static final void b(hlp hlpVar, hld hldVar, cga cgaVar, String str, cfq cfqVar, csv csvVar, float f, bwj bwjVar, int i) {
        cga c;
        bwj c2 = bwjVar.c(-2117822551);
        c2.y(-38500790);
        bwk bwkVar = (bwk) c2;
        Object T = bwkVar.T();
        if (T == bwj.a.a) {
            T = bxl.a(arpj.a, c2);
            bwkVar.ad(T);
        }
        arwe arweVar = (arwe) T;
        c2.y(-1917399629);
        boolean G = c2.G(hlpVar) | c2.G(hldVar);
        Object T2 = bwkVar.T();
        if (G || T2 == bwj.a.a) {
            T2 = new hmi(hlpVar, hldVar, arweVar);
            bwkVar.ad(T2);
        }
        hmi hmiVar = (hmi) T2;
        bwkVar.Y();
        bwkVar.Y();
        c2.y(877917030);
        cga.a aVar = cga.e;
        c2.y(-110219596);
        boolean G2 = c2.G(hmiVar);
        Object T3 = bwkVar.T();
        if (G2 || T3 == bwj.a.a) {
            T3 = new gsh(hmiVar, 4);
            bwkVar.ad(T3);
        }
        bwkVar.Y();
        c = dhb.c(aVar, false, (arqr) T3);
        int i2 = i >> 3;
        aet.a(hmiVar, str, cgaVar.a(c), cfqVar, csvVar, f, c2, ((i >> 6) & 112) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (i2 & 3670016), 0);
        bwkVar.Y();
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new hmg(hlpVar, hldVar, cgaVar, str, cfqVar, csvVar, f, i, 0);
        }
    }
}
