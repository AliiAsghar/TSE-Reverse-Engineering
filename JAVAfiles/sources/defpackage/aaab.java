package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaab extends arrp implements arqx {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaab(gqg gqgVar, Object obj, cas casVar, int i) {
        super(4);
        this.d = i;
        this.c = gqgVar;
        this.b = obj;
        this.a = casVar;
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, yg] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, yg] */
    /* JADX WARN: Type inference failed for: r3v17, types: [cas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [cas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [cas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.arqx
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        jxb jxbVar;
        int i;
        int i2;
        boolean booleanValue;
        cga a;
        int i3 = this.d;
        if (i3 != 0) {
            int i4 = 16;
            ahhm ahhmVar = null;
            if (i3 != 1) {
                if (i3 != 2) {
                    int intValue = ((Number) obj2).intValue();
                    bwj bwjVar = (bwj) obj3;
                    int intValue2 = ((Number) obj4).intValue();
                    ((app) obj).getClass();
                    if ((intValue2 & 112) == 0) {
                        if (true == bwjVar.E(intValue)) {
                            i4 = 32;
                        }
                        intValue2 |= i4;
                    }
                    if ((intValue2 & 721) == 144 && bwjVar.L()) {
                        bwjVar.v();
                    } else {
                        Object g = ((gqg) this.c).g(intValue);
                        if (g != null) {
                            aftr aftrVar = (aftr) g;
                            a = adf.a(adw.f(cga.e, false, null, new aenj(this.b, aftrVar, 12, null), 127), bmp.a(bwjVar).G, clw.a);
                            aeke.bE(a, aftrVar, a.x(this.a).indexOf(aftrVar), bwjVar, 64);
                        } else {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    return arnb.a;
                }
                int intValue3 = ((Number) obj2).intValue();
                bwj bwjVar2 = (bwj) obj3;
                int intValue4 = ((Number) obj4).intValue();
                ((anq) obj).getClass();
                if ((intValue4 & 112) == 0) {
                    if (true == bwjVar2.E(intValue3)) {
                        i4 = 32;
                    }
                    intValue4 |= i4;
                }
                if ((intValue4 & 721) == 144 && bwjVar2.L()) {
                    bwjVar2.v();
                } else {
                    aanr aanrVar = (aanr) ((gqg) this.c).g(intValue3);
                    if (aanrVar != null) {
                        Object obj5 = this.b;
                        booleanValue = ((Boolean) this.a.a()).booleanValue();
                        aaoc.d((aaoc) obj5, null, !booleanValue, aanrVar.b, aanrVar.c, aanrVar.d, bwjVar2, 262144);
                    }
                }
                return arnb.a;
            }
            int intValue5 = ((Number) obj2).intValue();
            bwj bwjVar3 = (bwj) obj3;
            int intValue6 = ((Number) obj4).intValue();
            ((app) obj).getClass();
            if ((intValue6 & 112) == 0) {
                if (true == bwjVar3.E(intValue5)) {
                    i4 = 32;
                }
                intValue6 |= i4;
            }
            if ((intValue6 & 721) == 144 && bwjVar3.L()) {
                bwjVar3.v();
            } else {
                if (intValue5 == 0) {
                    jxbVar = null;
                } else {
                    jxbVar = (jxb) this.c.get(intValue5 - 1);
                }
                boolean F = d.F(this.a, jxbVar);
                if (jxbVar != null) {
                    i = jxbVar.c;
                } else {
                    i = R.string.default_theme;
                }
                String a2 = dga.a(i, bwjVar3);
                int i5 = intValue5 + 1;
                int size = this.c.size() + 1;
                bwjVar3.y(-300708558);
                if (true != F) {
                    i2 = R.string.unselected_theme_content_description;
                } else {
                    i2 = R.string.selected_theme_content_description;
                }
                String b = dga.b(i2, new Object[]{a2, Integer.valueOf(i5), Integer.valueOf(size)}, bwjVar3);
                bwjVar3.q();
                if (jxbVar != null) {
                    ahhmVar = jxbVar.b;
                }
                hwr.Y(ahhmVar, cdk.e(1083984525, new jxg(intValue5, b, F, jxbVar, (arqr) this.b, 0), bwjVar3), bwjVar3, 48);
            }
            return arnb.a;
        }
        wb wbVar = (wb) obj;
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        bwj bwjVar4 = (bwj) obj3;
        ((Number) obj4).intValue();
        wbVar.getClass();
        if (!booleanValue2) {
            bwjVar4.y(-860708851);
            ?? r2 = this.a;
            zzw a3 = aaae.a(this.c);
            a3.getClass();
            aaae.d(r2, a3, wbVar, bwjVar4, 512);
            bwjVar4.q();
        } else {
            bwjVar4.y(-860545729);
            aabr.L(this.a, ((aaaa) this.b).i, wbVar, bwjVar4, 576);
            bwjVar4.q();
        }
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaab(List list, jxb jxbVar, arqr arqrVar, int i) {
        super(4);
        this.d = i;
        this.c = list;
        this.a = jxbVar;
        this.b = arqrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaab(yg ygVar, aaaa aaaaVar, cas casVar, int i) {
        super(4);
        this.d = i;
        this.a = ygVar;
        this.b = aaaaVar;
        this.c = casVar;
    }
}
