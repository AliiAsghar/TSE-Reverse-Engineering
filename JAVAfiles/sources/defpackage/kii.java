package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kii extends arrp implements arqx {
    final /* synthetic */ List a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kii(List list, Object obj, int i) {
        super(4);
        this.c = i;
        this.a = list;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [cas, java.lang.Object] */
    @Override // defpackage.arqx
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        cga b;
        int i4 = this.c;
        int i5 = 16;
        int i6 = 4;
        boolean z = true;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    int intValue = ((Number) obj2).intValue();
                    bwj bwjVar = (bwj) obj3;
                    ((Number) obj4).intValue();
                    ((auw) obj).getClass();
                    b = amv.b(cga.e, 1.0f);
                    agcz agczVar = (agcz) this.a.get(intValue);
                    if (agczVar instanceof agdb) {
                        bwjVar.y(882184159);
                        afzv.C((agcf) this.b, (agdb) agczVar, b, bwjVar, 448);
                        bwjVar.q();
                    } else if (agczVar instanceof agdi) {
                        bwjVar.y(882310143);
                        afzv.w((agcf) this.b, (agdi) agczVar, b, bwjVar, 448);
                        bwjVar.q();
                    } else {
                        bwjVar.y(882410614);
                        bwjVar.q();
                    }
                    return arnb.a;
                }
                anq anqVar = (anq) obj;
                int intValue2 = ((Number) obj2).intValue();
                bwj bwjVar2 = (bwj) obj3;
                int intValue3 = ((Number) obj4).intValue();
                if ((intValue3 & 6) == 0) {
                    if (true != bwjVar2.G(anqVar)) {
                        i6 = 2;
                    }
                    i3 = intValue3 | i6;
                } else {
                    i3 = intValue3;
                }
                if ((intValue3 & 48) == 0) {
                    if (true == bwjVar2.E(intValue2)) {
                        i5 = 32;
                    }
                    i3 |= i5;
                }
                if ((i3 & 147) == 146 && bwjVar2.L()) {
                    bwjVar2.v();
                } else {
                    kim kimVar = (kim) this.a.get(intValue2);
                    bwjVar2.y(-1424059137);
                    String str = kimVar.a;
                    String str2 = kimVar.b;
                    if (intValue2 != ((Number) this.b.a()).intValue()) {
                        z = false;
                    }
                    aetn.F(new aest(str, str2, z, kimVar.c), null, bwjVar2, 0, 2);
                    bwjVar2.q();
                }
                return arnb.a;
            }
            anq anqVar2 = (anq) obj;
            int intValue4 = ((Number) obj2).intValue();
            bwj bwjVar3 = (bwj) obj3;
            int intValue5 = ((Number) obj4).intValue();
            if ((intValue5 & 6) == 0) {
                if (true != bwjVar3.G(anqVar2)) {
                    i6 = 2;
                }
                i2 = intValue5 | i6;
            } else {
                i2 = intValue5;
            }
            if ((intValue5 & 48) == 0) {
                if (true == bwjVar3.E(intValue4)) {
                    i5 = 32;
                }
                i2 |= i5;
            }
            if ((i2 & 147) == 146 && bwjVar3.L()) {
                bwjVar3.v();
            } else {
                ift iftVar = (ift) this.a.get(intValue4);
                bwjVar3.y(-960229200);
                hlc.r(iftVar, (bhv) this.b, bwjVar3, 0);
                bwjVar3.q();
            }
            return arnb.a;
        }
        anq anqVar3 = (anq) obj;
        int intValue6 = ((Number) obj2).intValue();
        bwj bwjVar4 = (bwj) obj3;
        int intValue7 = ((Number) obj4).intValue();
        if ((intValue7 & 6) == 0) {
            if (true != bwjVar4.G(anqVar3)) {
                i6 = 2;
            }
            i = intValue7 | i6;
        } else {
            i = intValue7;
        }
        if ((intValue7 & 48) == 0) {
            if (true == bwjVar4.E(intValue6)) {
                i5 = 32;
            }
            i |= i5;
        }
        if ((i & 147) == 146 && bwjVar4.L()) {
            bwjVar4.v();
        } else {
            jxh jxhVar = (jxh) this.a.get(intValue6);
            bwjVar4.y(750628908);
            List list = jxhVar.b;
            bwjVar4.y(750657613);
            lga.bf(jxhVar, ((kih) this.b).b, bwjVar4, 0);
            bwjVar4.q();
            bwjVar4.q();
        }
        return arnb.a;
    }
}
