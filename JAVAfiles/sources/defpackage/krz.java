package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class krz implements apya {
    private final krv a;
    private final int b;
    private final kqj c;
    private final kqs d;

    public krz(krv krvVar, kqj kqjVar, kqs kqsVar, int i) {
        this.a = krvVar;
        this.c = kqjVar;
        this.d = kqsVar;
        this.b = i;
    }

    @Override // defpackage.armf, defpackage.arme
    public final Object b() {
        switch (this.b) {
            case 0:
                return new zfh(this.a.xy);
            case 1:
                return Optional.of((zfh) this.c.ap.b());
            case 2:
                krx krxVar = this.a.a;
                tzz tzzVar = new tzz((trz) krxVar.a.ee.b(), (ksi) krxVar.a.ft.b(), (ofy) krxVar.a.rt.b());
                uah uahVar = new uah(1);
                krx krxVar2 = this.a.a;
                Context context = (Context) krxVar2.a.n.b();
                krv krvVar = krxVar2.a;
                apya apyaVar = krvVar.yJ;
                trz trzVar = (trz) krvVar.ee.b();
                uad uadVar = new uad(context, apyaVar, trzVar, (ksi) krxVar2.a.ft.b());
                krx krxVar3 = this.a.a;
                Context context2 = (Context) krxVar3.a.n.b();
                uae uaeVar = new uae(context2);
                krx krxVar4 = this.a.a;
                uag uagVar = new uag((Context) krxVar4.a.n.b(), (ofy) krxVar4.a.rt.b());
                uah uahVar2 = new uah((ofy) this.a.a.a.rt.b(), 0);
                krx krxVar5 = this.a.a;
                Context context3 = (Context) krxVar5.a.n.b();
                krv krvVar2 = krxVar5.a;
                return alpt.v(tzzVar, uahVar, uadVar, uaeVar, uagVar, uahVar2, new uaj(context3, krvVar2.ci, (ofy) krvVar2.rt.b()));
            case 3:
                return Optional.of((gpx) this.a.a.gV.b());
            case 4:
                return new lrf((Context) this.a.n.b(), (xvc) this.a.dW.b(), this.a.dd);
            case 5:
                return new ush(this.a.dd);
            case 6:
                return new zsg(new aabr());
            case 7:
                return new ngv((Context) this.a.n.b(), (aneo) this.a.m.b(), (anen) this.a.z.b(), new hgj((byte[]) null, (char[]) null), (yxb) this.a.hw.b());
            case 8:
                krv krvVar3 = this.a;
                return new mcu(krvVar3.eB, new itw(4), (Executor) krvVar3.m.b());
            case 9:
                krv krvVar4 = this.a;
                return new mcx(krvVar4.eB, new itw(4), (Executor) krvVar4.m.b());
            case 10:
                krv krvVar5 = this.a;
                apya apyaVar2 = krvVar5.a.fP;
                apwt a = apxv.a(krvVar5.gD);
                aaya aayaVar = (aaya) this.d.l.b();
                mbl mblVar = (mbl) this.a.bB.b();
                xbf xbfVar = (xbf) this.a.hA.b();
                krv krvVar6 = this.a;
                return new abbj(apyaVar2, a, aayaVar, mblVar, xbfVar, krvVar6.yJ, (abbu) krvVar6.yF.b(), (aksr) this.a.at.b());
            case 11:
                krv krvVar7 = this.a;
                apya apyaVar3 = krvVar7.n;
                apya apyaVar4 = krvVar7.av;
                apya a2 = apyb.a(krvVar7.gD);
                krv krvVar8 = this.a;
                kqj kqjVar = this.c;
                apya apyaVar5 = krvVar8.bB;
                krx krxVar6 = krvVar8.a;
                return new aaya(apyaVar3, apyaVar4, a2, apyaVar5, krxVar6.cM, krxVar6.cN, kqjVar.ax, krvVar8.sR, krxVar6.L, krvVar8.bV, krvVar8.gC, krvVar8.at, krvVar8.ay, krvVar8.fY, krvVar8.fM, krvVar8.sY, krvVar8.gb);
            case 12:
                apya apyaVar6 = this.d.u;
                apyaVar6.getClass();
                Object b = apyaVar6.b();
                b.getClass();
                return (adjw) b;
            case 13:
                return new adjw();
            case 14:
                krv krvVar9 = this.a;
                return new znp(krvVar9.oO, krvVar9.bQ, (byte[]) null);
            case 15:
                arwe arweVar = (arwe) this.a.bQ.b();
                arpi arpiVar = (arpi) this.a.bP.b();
                xnv xnvVar = (xnv) this.a.bV.b();
                krv krvVar10 = this.a;
                return new mgr(arweVar, arpiVar, xnvVar, krvVar10.fB, krvVar10.et, krvVar10.fX);
            case 16:
                Context context4 = (Context) this.c.c.b();
                ydc ydcVar = (ydc) this.a.dU.b();
                ksi ksiVar = (ksi) this.a.ft.b();
                yyb yybVar = (yyb) this.a.a.cW.b();
                ykw ykwVar = (ykw) this.a.av.b();
                mho mhoVar = (mho) this.a.gD.b();
                xnv xnvVar2 = (xnv) this.a.bV.b();
                krv krvVar11 = this.a;
                apya apyaVar7 = krvVar11.oO;
                rgp rgpVar = (rgp) krvVar11.vi.b();
                apwt a3 = apxv.a(this.c.ao);
                znp znpVar = (znp) this.d.y.b();
                aksr aksrVar = (aksr) this.a.at.b();
                kqs kqsVar = this.d;
                return new aael(context4, ydcVar, ksiVar, yybVar, ykwVar, mhoVar, xnvVar2, apyaVar7, rgpVar, a3, znpVar, aksrVar, kqsVar.z, kqsVar.A);
            case 17:
                kqs kqsVar2 = this.d;
                znp znpVar2 = new znp((Context) kqsVar2.J.c.b(), apxv.a(kqsVar2.a.fu));
                kqs kqsVar3 = this.d;
                return new znp(znpVar2, new znp((Context) kqsVar3.a.n.b(), new zfh((armf) kqsVar3.a.a.f9do, (byte[]) null)));
            case 18:
                return new ygv((aquq) this.a.xy.b());
            case 19:
                return new uli(this.a.ff);
            case 20:
                return new ahmn((aksr) this.a.at.b());
            case 21:
                return new aajq((Context) this.a.n.b());
            case 22:
                krv krvVar12 = this.a;
                return new mcn(krvVar12.eB, new itw(4), (Executor) krvVar12.m.b());
            case 23:
                krv krvVar13 = this.a;
                kqs kqsVar4 = this.d;
                krx krxVar7 = krvVar13.a;
                return new aiim(krxVar7.cl, kqsVar4.G, kqsVar4.H, krxVar7.ck, null);
            case 24:
                krv krvVar14 = this.a;
                return new agcp(krvVar14.dO, krvVar14.yA, krvVar14.a.cp);
            default:
                krv krvVar15 = this.a;
                return new aday(krvVar15.dO, krvVar15.a.cg, null, null, null, null);
        }
    }
}
