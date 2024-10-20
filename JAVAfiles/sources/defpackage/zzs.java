package defpackage;

import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzs extends arrp implements arqx {
    final /* synthetic */ dqv a;
    final /* synthetic */ avc b;
    final /* synthetic */ List c;
    final /* synthetic */ byn d;
    final /* synthetic */ zzt e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(dqv dqvVar, avc avcVar, List list, byn bynVar, zzt zztVar) {
        super(4);
        this.a = dqvVar;
        this.b = avcVar;
        this.c = list;
        this.d = bynVar;
        this.e = zztVar;
    }

    @Override // defpackage.arqx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        cga c;
        int intValue = ((Number) obj2).intValue();
        bwj bwjVar = (bwj) obj3;
        ((Number) obj4).intValue();
        ((auw) obj).getClass();
        Object h = bwjVar.h();
        if (h == bwj.a.a) {
            h = bxl.a(arpj.a, bwjVar);
            bwjVar.B(h);
        }
        lhz lhzVar = new lhz((arwe) h, this.b, intValue, this.c, 5);
        c = amv.c(cgh.a(cga.e, 10.0f), 1.0f);
        cga t = amv.t(amv.q(c, brg.a, 400.0f, 1), brg.a, 400.0f, 1);
        bwjVar.y(-1910074231);
        boolean G = bwjVar.G(this.a);
        dqv dqvVar = this.a;
        byn bynVar = this.d;
        Object h2 = bwjVar.h();
        if (G || h2 == bwj.a.a) {
            h2 = new wup(dqvVar, bynVar, 18, null);
            bwjVar.B(h2);
        }
        bwjVar.q();
        cga a = cuw.a(t, (arqr) h2);
        int i = cfq.a;
        List list = this.c;
        zzt zztVar = this.e;
        cue a2 = akc.a(cfq.a.e, false);
        int a3 = bwg.a(bwjVar);
        bwy d = bwjVar.d();
        cga b = cfv.b(bwjVar, a);
        int i2 = cwl.a;
        arqg arqgVar = cwl.a.a;
        bwjVar.N();
        bwjVar.A();
        if (bwjVar.K()) {
            bwjVar.l(arqgVar);
        } else {
            bwjVar.C();
        }
        caw.b(bwjVar, a2, cwl.a.e);
        caw.b(bwjVar, d, cwl.a.d);
        arqv arqvVar = cwl.a.f;
        if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a3))) {
            Integer valueOf = Integer.valueOf(a3);
            bwjVar.B(valueOf);
            bwjVar.j(valueOf, arqvVar);
        }
        caw.b(bwjVar, b, cwl.a.c);
        aewg aewgVar = ((zzt) list.get(intValue)).a;
        cga.a aVar = cga.e;
        bwjVar.y(1692139740);
        boolean G2 = bwjVar.G(lhzVar);
        Object h3 = bwjVar.h();
        if (G2 || h3 == bwj.a.a) {
            h3 = new zzq(lhzVar, 4);
            bwjVar.B(h3);
        }
        bwjVar.q();
        adcx.bo(aewgVar, aetn.aN(adw.c(aVar, false, null, (arqg) h3, 7), zztVar.c, true), bwjVar, 0);
        bwjVar.p();
        return arnb.a;
    }
}
