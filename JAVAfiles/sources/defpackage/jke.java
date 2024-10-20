package defpackage;

import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jke extends arrp implements arqy {
    private final /* synthetic */ int e;
    public static final jke d = new jke(5);
    public static final jke c = new jke(4);
    public static final jke b = new jke(3);
    public static final jke a = new jke(1);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jke(int i) {
        super(5);
        this.e = i;
    }

    @Override // defpackage.arqy
    public final /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        float f;
        int i2;
        int i3 = this.e;
        int i4 = 128;
        int i5 = 16;
        int i6 = 4;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            bwj bwjVar = (bwj) obj4;
                            int intValue = ((Number) obj5).intValue();
                            ((agcg) obj).getClass();
                            ((cga) obj2).getClass();
                            if ((intValue & 5121) == 1024 && bwjVar.L()) {
                                bwjVar.v();
                            }
                            return arnb.a;
                        }
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        ahhm ahhmVar = (ahhm) obj2;
                        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
                        bwj bwjVar2 = (bwj) obj4;
                        ((Number) obj5).intValue();
                        ahhmVar.getClass();
                        bwjVar2.y(2003408507);
                        aezm b2 = aezn.b(ahhmVar, booleanValue, booleanValue2);
                        bwjVar2.q();
                        return b2;
                    }
                    boolean booleanValue3 = ((Boolean) obj).booleanValue();
                    ahhm ahhmVar2 = (ahhm) obj2;
                    boolean booleanValue4 = ((Boolean) obj3).booleanValue();
                    bwj bwjVar3 = (bwj) obj4;
                    ((Number) obj5).intValue();
                    ahhmVar2.getClass();
                    bwjVar3.y(6708044);
                    aezm b3 = aezn.b(ahhmVar2, booleanValue3, booleanValue4);
                    bwjVar3.q();
                    return b3;
                }
                aeno aenoVar = (aeno) obj;
                aenk aenkVar = (aenk) obj2;
                aeoi aeoiVar = (aeoi) obj3;
                aenoVar.getClass();
                aenkVar.getClass();
                aeoiVar.getClass();
                return new aenr(aenoVar, aenkVar, (aenp) obj4, aeoiVar, (aenl) obj5, new aenq(null));
            }
            agch agchVar = (agch) obj;
            cga cgaVar = (cga) obj2;
            jkl jklVar = (jkl) obj3;
            bwj bwjVar4 = (bwj) obj4;
            int intValue2 = ((Number) obj5).intValue();
            agchVar.getClass();
            cgaVar.getClass();
            jklVar.getClass();
            if ((intValue2 & 14) == 0) {
                if (true != bwjVar4.G(agchVar)) {
                    i6 = 2;
                }
                i2 = i6 | intValue2;
            } else {
                i2 = intValue2;
            }
            if ((intValue2 & 112) == 0) {
                if (true == bwjVar4.G(cgaVar)) {
                    i5 = 32;
                }
                i2 |= i5;
            }
            if ((intValue2 & 896) == 0) {
                if (true == bwjVar4.G(jklVar)) {
                    i4 = 256;
                }
                i2 |= i4;
            }
            if ((i2 & 5851) == 1170 && bwjVar4.L()) {
                bwjVar4.v();
            } else {
                hld.t(bwjVar4);
                hld.w(agchVar, cgaVar, jklVar, bwjVar4, (i2 & 126) | 512 | (i2 & 896));
            }
            return arnb.a;
        }
        agcg agcgVar = (agcg) obj;
        cga cgaVar2 = (cga) obj2;
        jkl jklVar2 = (jkl) obj3;
        bwj bwjVar5 = (bwj) obj4;
        int intValue3 = ((Number) obj5).intValue();
        agcgVar.getClass();
        cgaVar2.getClass();
        jklVar2.getClass();
        if ((intValue3 & 14) == 0) {
            if (true != bwjVar5.G(agcgVar)) {
                i6 = 2;
            }
            i = i6 | intValue3;
        } else {
            i = intValue3;
        }
        if ((intValue3 & 112) == 0) {
            if (true == bwjVar5.G(cgaVar2)) {
                i5 = 32;
            }
            i |= i5;
        }
        if ((intValue3 & 896) == 0) {
            if (true == bwjVar5.G(jklVar2)) {
                i4 = 256;
            }
            i |= i4;
        }
        if ((i & 5851) == 1170 && bwjVar5.L()) {
            bwjVar5.v();
        } else if (jkg.f(jklVar2, bwjVar5)) {
            jxq jxqVar = ((jjq) cak.a(jklVar2.d, bwjVar5).a()).a;
            dqv dqvVar = (dqv) bwjVar5.g(dch.d);
            bwjVar5.y(480951659);
            cas a2 = cap.a(new dqy(new alt(anl.c(bwjVar5), dqvVar).a()), bwjVar5);
            bwjVar5.q();
            bwjVar5.y(-2006243831);
            if (!hld.s(jklVar2, bwjVar5)) {
                cga.a aVar = cga.e;
                dqy dqyVar = new dqy(jkg.d(agcgVar, bwjVar5) + 10.0f);
                f = ((dqy) a2.a()).a;
                cgaVar2 = cgaVar2.a(amh.j(aVar, brg.a, brg.a, brg.a, ((dqy) arrn.y(dqyVar, new dqy(f))).a, 7));
            }
            bwjVar5.q();
            hwr.O(jxqVar, cgaVar2, null, bwjVar5, 0);
        }
        return arnb.a;
    }
}
