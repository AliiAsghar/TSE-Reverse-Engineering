package defpackage;

import android.content.Context;
import defpackage.ajxm;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksd implements apya {
    private final krv a;
    private final int b;
    private final kqu c;

    public ksd(krv krvVar, kqu kquVar, int i) {
        this.a = krvVar;
        this.c = kquVar;
        this.b = i;
    }

    @Override // defpackage.armf, defpackage.arme
    public final Object b() {
        switch (this.b) {
            case 0:
                kqu kquVar = this.c;
                return new ajxm.a(kquVar.a, kquVar.d);
            case 1:
                return new ifd(new ibi(this.c.h, (char[]) null), (ktk) this.c.g.b());
            case 2:
                kqu kquVar2 = this.c;
                return new kkc((armf) kquVar2.e, (armf) kquVar2.f, (armf) kquVar2.g, (char[]) null);
            case 3:
                arpi arpiVar = (arpi) this.a.dN.b();
                krv krvVar = this.c.c;
                return new iji(arpiVar, new uie(krvVar.jc, krvVar.dd, (char[]) null, (byte[]) null));
            case 4:
                krv krvVar2 = this.a;
                return new gpx(krvVar2.bP, krvVar2.pp, krvVar2.xy, krvVar2.at, null, null, null);
            case 5:
                return new ktk((ahqr) this.a.id.b(), (ahpf) this.a.py.b());
            case 6:
                kqu kquVar3 = this.c;
                return new iks(kquVar3.a, kquVar3.i, kquVar3.j, kquVar3.k, kquVar3.l);
            case 7:
                return new ico((arpi) this.a.dN.b(), this.c.c());
            case 8:
                return new ifs((arpi) this.a.dN.b(), (qya) this.a.ol.b(), this.c.c(), (rur) this.a.ru.b(), (okf) this.a.dA.b());
            case 9:
                return new ifb((arpi) this.a.dN.b(), this.c.c());
            case 10:
                return new iji((arpi) this.a.dN.b(), new iew(this.c.d(), (byte[]) null), (ndi) this.a.nk.b());
            case 11:
                kqu kquVar4 = this.c;
                krv krvVar3 = this.a;
                apya apyaVar = krvVar3.pH;
                apya apyaVar2 = krvVar3.ox;
                uvi uviVar = (uvi) krvVar3.de.b();
                arwe arweVar = (arwe) this.a.bQ.b();
                kqu kquVar5 = this.c;
                krv krvVar4 = this.a;
                apya apyaVar3 = kquVar5.m;
                kor korVar = (kor) krvVar4.f8if.b();
                krv krvVar5 = this.a;
                return new jbo(kquVar4.a, apyaVar, krvVar3.a.p, apyaVar2, uviVar, arweVar, apyaVar3, korVar, krvVar5.a.G(), krvVar5.tC);
            case 12:
                krv krvVar6 = this.a;
                return new znj((Object) krvVar6.bY, (Object) krvVar6.bB, (char[]) null);
            case 13:
                return new lat();
            case 14:
                return new ajyv(this.c.a);
            case 15:
                arwe arweVar2 = (arwe) this.c.o.b();
                kqu kquVar6 = this.c;
                return new aanw(arweVar2, new abac(new zof((arpi) kquVar6.c.dj.b(), (aaoc) kquVar6.c.a.dg.b()), new zkm((agnw) kquVar6.c.cb.b(), (Context) kquVar6.c.n.b(), (arpi) kquVar6.c.dj.b())), (aaoc) this.a.a.dg.b(), (arpi) this.a.dj.b(), (uck) this.a.xR.b());
            case 16:
                return akdp.e((arpi) this.c.n.b(), this.c.b);
            case 17:
                krv krvVar7 = this.a;
                return akdp.t(krvVar7.Rh(), (aneo) krvVar7.ba.b(), (algw) ((apxx) this.a.f).a);
            case 18:
                kqu kquVar7 = this.c;
                return new akbs(kquVar7.a, (Context) this.a.n.b(), (Executor) this.a.ba.b());
            case 19:
                return new lez();
            case 20:
                return new akgl((aegu) this.a.i.b(), (ahiy) this.a.aC.b(), (Executor) this.a.ba.b());
            default:
                return new znz(new aabr());
        }
    }
}
