package defpackage;

import com.google.android.apps.messaging.R;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cwl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kib extends arrp implements arqw {
    final /* synthetic */ khy a;
    final /* synthetic */ bqn b;
    final /* synthetic */ byn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kib(khy khyVar, bqn bqnVar, byn bynVar) {
        super(3);
        this.a = khyVar;
        this.b = bqnVar;
        this.c = bynVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cga b;
        bwj bwjVar = (bwj) obj2;
        int intValue = ((Number) obj3).intValue();
        ((amj) obj).getClass();
        if ((intValue & 81) != 16 || !bwjVar.L()) {
            b = amv.b(cga.e, 1.0f);
            khy khyVar = this.a;
            bqn bqnVar = this.b;
            byn bynVar = this.c;
            int i = cfq.a;
            cue a = akc.a(cfq.a.a, false);
            int a2 = bwg.a(bwjVar);
            bwy d = bwjVar.d();
            cga b2 = cfv.b(bwjVar, b);
            int i2 = cwl.a;
            arqg arqgVar = cwl.a.a;
            bwjVar.N();
            bwjVar.A();
            if (bwjVar.K()) {
                bwjVar.l(arqgVar);
            } else {
                bwjVar.C();
            }
            caw.b(bwjVar, a, cwl.a.e);
            caw.b(bwjVar, d, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwjVar.B(valueOf);
                bwjVar.j(valueOf, arqvVar);
            }
            caw.b(bwjVar, b2, cwl.a.c);
            kid kidVar = khyVar.n;
            akf akfVar = akf.a;
            bwjVar.y(1938840078);
            if (kidVar != null) {
                kidVar.a();
            }
            bwjVar.q();
            bwjVar.y(-25360627);
            kic.d(akfVar, khyVar, bwjVar, 6);
            bwjVar.q();
            jym jymVar = khyVar.b;
            cga b3 = anh.b(akfVar.b(cga.e), new amc(anl.e(bwjVar), 16));
            bwjVar.y(1938853855);
            boolean G = bwjVar.G(khyVar);
            Object h = bwjVar.h();
            if (G || h == bwj.a.a) {
                h = new kbt(khyVar, 14);
                bwjVar.B(h);
            }
            arqr arqrVar = (arqr) h;
            bwjVar.q();
            b3.getClass();
            arqrVar.getClass();
            hwr.L(jymVar, kic.a(bynVar), cru.a(b3, arnb.a, new kiz(arqrVar, 0)), bwjVar, 0);
            kic.g(khyVar, cdk.e(-1637165938, new ifn(khyVar, akfVar, 7), bwjVar), bwjVar, 48);
            arqg arqgVar2 = khyVar.h;
            bwjVar.y(1938870193);
            if (arqgVar2 != null) {
                cga a3 = cha.a(amd.b(akfVar.a(cga.e, cfq.a.c), -8.0f, ((dqv) bwjVar.g(dch.d)).eh(((Number) cao.b(khyVar.f, 0, null, bwjVar, 2).a()).intValue()) + 8.0f), 0.25f);
                String a4 = dga.a(R.string.conversation_2_dogfood_information, bwjVar);
                bwjVar.y(138716685);
                boolean G2 = bwjVar.G(arqgVar2);
                Object h2 = bwjVar.h();
                if (G2 || h2 == bwj.a.a) {
                    h2 = new kdz(arqgVar2, 17);
                    bwjVar.B(h2);
                }
                bwjVar.q();
                kic.i(adw.c(a3, false, a4, (arqg) h2, 5), bwjVar, 0);
            }
            bwjVar.q();
            bwjVar.y(-23838899);
            kic.e(akfVar, khyVar, bwjVar, 6);
            bwjVar.q();
            kic.c(khyVar, bqnVar, bwjVar, 48);
            kic.g(khyVar, cdk.e(-1481577723, new gck(khyVar, 17), bwjVar), bwjVar, 48);
            bwjVar.p();
        } else {
            bwjVar.v();
        }
        return arnb.a;
    }
}
