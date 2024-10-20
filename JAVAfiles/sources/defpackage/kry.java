package defpackage;

import android.content.Context;
import j$.util.Optional;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kry implements apya {
    private final krv a;
    private final int b;
    private final kqp c;
    private final kqh d;
    private final kql e;
    private final kqr f;

    public kry(krv krvVar, kqp kqpVar, kqh kqhVar, kql kqlVar, kqr kqrVar, int i) {
        this.a = krvVar;
        this.c = kqpVar;
        this.d = kqhVar;
        this.e = kqlVar;
        this.f = kqrVar;
        this.b = i;
    }

    @Override // defpackage.armf, defpackage.arme
    public final Object b() {
        switch (this.b) {
            case 0:
                return ifc.i(this.f.a);
            case 1:
                return zfk.f(this.f.a);
            case 2:
                krv krvVar = this.a;
                kqr kqrVar = this.f;
                kql kqlVar = this.e;
                kqp kqpVar = this.c;
                kqh kqhVar = this.d;
                krx krxVar = krvVar.a;
                apya apyaVar = krvVar.dA;
                apya apyaVar2 = kqrVar.c;
                apya apyaVar3 = krvVar.eN;
                apya apyaVar4 = kqrVar.d;
                apya apyaVar5 = krxVar.eC;
                apya apyaVar6 = krvVar.oh;
                apya apyaVar7 = krvVar.av;
                apya apyaVar8 = krvVar.dt;
                apya apyaVar9 = kqrVar.e;
                apya apyaVar10 = kqrVar.h;
                apya apyaVar11 = krvVar.hA;
                apya apyaVar12 = krvVar.bV;
                apya apyaVar13 = krvVar.aF;
                apya apyaVar14 = krvVar.gD;
                apya apyaVar15 = krvVar.yJ;
                apya apyaVar16 = krvVar.bB;
                apya apyaVar17 = kqlVar.c;
                apya apyaVar18 = kqrVar.j;
                apya apyaVar19 = krvVar.ef;
                apya apyaVar20 = krvVar.je;
                apya apyaVar21 = kqpVar.d;
                apya apyaVar22 = krvVar.yF;
                apya apyaVar23 = krvVar.oG;
                apya apyaVar24 = krvVar.bO;
                apya apyaVar25 = kqrVar.k;
                apya apyaVar26 = kqlVar.n;
                apya apyaVar27 = kqrVar.l;
                apya apyaVar28 = krxVar.cX;
                apya apyaVar29 = kqrVar.m;
                apya apyaVar30 = krvVar.ft;
                apya apyaVar31 = kqhVar.e;
                apya apyaVar32 = kqlVar.j;
                apya a = apyb.a(kqlVar.aX);
                kqr kqrVar2 = this.f;
                krv krvVar2 = this.a;
                kqh kqhVar2 = this.d;
                kql kqlVar2 = this.e;
                krx krxVar2 = krvVar2.a;
                return new zrj(apyaVar, apyaVar2, apyaVar3, apyaVar4, apyaVar5, apyaVar6, apyaVar7, apyaVar8, apyaVar9, apyaVar10, apyaVar11, apyaVar12, apyaVar13, apyaVar14, apyaVar15, apyaVar16, apyaVar17, apyaVar18, apyaVar19, apyaVar20, apyaVar21, apyaVar22, apyaVar23, apyaVar24, apyaVar25, apyaVar26, apyaVar27, apyaVar28, apyaVar29, apyaVar30, apyaVar31, apyaVar32, a, kqrVar2.n, krvVar2.ur, krvVar2.mn, kqhVar2.c, kqlVar2.bt, krvVar2.ee, kqrVar2.o, krvVar2.ih, krvVar2.lC, krvVar2.dd, kqlVar2.v, krvVar2.hG, krvVar2.ok, kqlVar2.w, kqlVar2.bE, krxVar2.eF, krxVar2.eD);
            case 3:
                return zfk.j(this.f.a);
            case 4:
                return new adwg((ykw) this.a.av.b());
            case 5:
                krv krvVar3 = this.a;
                kqr kqrVar3 = this.f;
                kql kqlVar3 = this.e;
                krx krxVar3 = krvVar3.a;
                return new aair(krxVar3.cX, kqrVar3.f, krvVar3.bV, kqrVar3.g, krvVar3.de, kqlVar3.dK, krvVar3.dA, krxVar3.eD, null);
            case 6:
                return new zqx((Context) this.d.e.b(), (uac) this.a.ed.b(), Optional.empty());
            case 7:
                krv krvVar4 = this.a;
                return new zrs(krvVar4.bY, krvVar4.lA, (anen) krvVar4.m.b(), (anen) this.a.ay.b());
            case 8:
                kqr kqrVar4 = this.f;
                kqh kqhVar3 = this.d;
                krv krvVar5 = this.a;
                kqp kqpVar2 = this.c;
                return new wyp(kqrVar4.i, kqhVar3.e, krvVar5.a.eE, krvVar5.ec, kqpVar2.d, krvVar5.dA, krvVar5.eN, (char[]) null);
            case 9:
                return new zsg(new aabr());
            case 10:
                krv krvVar6 = this.a;
                kqp kqpVar3 = this.c;
                kql kqlVar4 = this.e;
                return new wyp(krvVar6.n, kqpVar3.d, kqlVar4.dK, krvVar6.av, kqlVar4.br, kqlVar4.bY, krvVar6.a.eD, null, null, null);
            case 11:
                zfh I = ((zxt) ((apxq) ((aklj) this.d.f.b()).a).aS()).I();
                I.getClass();
                return Optional.of(I);
            case 12:
                return new aabr();
            case 13:
                return zfk.n(this.f.a);
            default:
                kqr kqrVar5 = this.f;
                znp znpVar = new znp((Context) kqrVar5.p.e.b(), apxv.a(kqrVar5.b.fu));
                kqr kqrVar6 = this.f;
                return new znp(znpVar, new znp((Context) kqrVar6.b.n.b(), new zfh((armf) kqrVar6.q.bz, (byte[]) null)));
        }
    }
}
