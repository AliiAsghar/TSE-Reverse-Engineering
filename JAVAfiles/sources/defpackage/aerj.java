package defpackage;

import com.google.android.apps.messaging.R;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aerj extends arrp implements arqw {
    final /* synthetic */ long a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aerj(long j, int i) {
        super(3);
        this.b = i;
        this.a = j;
    }

    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cga b;
        int i;
        if (this.b != 0) {
            amt amtVar = (amt) obj;
            bwj bwjVar = (bwj) obj2;
            int intValue = ((Number) obj3).intValue();
            amtVar.getClass();
            if ((intValue & 14) == 0) {
                if (true != bwjVar.G(amtVar)) {
                    i = 2;
                } else {
                    i = 4;
                }
                intValue |= i;
            }
            if ((intValue & 91) == 18 && bwjVar.L()) {
                bwjVar.v();
            } else {
                cga d = amh.d(amv.h(cga.e, 48.0f), 6.0f);
                int i2 = cfq.a;
                long j = this.a;
                cue a = akc.a(cfq.a.e, false);
                int a2 = bwg.a(bwjVar);
                bwy d2 = bwjVar.d();
                cga b2 = cfv.b(bwjVar, d);
                int i3 = cwl.a;
                arqg arqgVar = cwl.a.a;
                bwjVar.N();
                bwjVar.A();
                if (bwjVar.K()) {
                    bwjVar.l(arqgVar);
                } else {
                    bwjVar.C();
                }
                caw.b(bwjVar, a, cwl.a.e);
                caw.b(bwjVar, d2, cwl.a.d);
                arqv arqvVar = cwl.a.f;
                if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a2))) {
                    Integer valueOf = Integer.valueOf(a2);
                    bwjVar.B(valueOf);
                    bwjVar.j(valueOf, arqvVar);
                }
                caw.b(bwjVar, b2, cwl.a.c);
                amx.a(adcx.aT(chk.a(akf.a.b(cga.e), awh.a), new cku(j), 6), bwjVar);
                ahji.N(aeke.bg(aerb.ct, bwjVar), dga.a(R.string.audiobubble_loading_text, bwjVar), aeke.bh(cga.e, (drk) bwjVar.g(dch.i)), bmp.a(bwjVar).n, bwjVar, 8, 0);
                bwjVar.p();
                b = amtVar.b(cga.e, 1.0f, true);
                akc.b(adcx.aT(chk.a(amv.d(amh.j(b, 8.0f, brg.a, brg.a, brg.a, 14), 14.0f), awh.a(20.0f)), new cku(this.a), 6), bwjVar, 0);
            }
            return arnb.a;
        }
        cga cgaVar = (cga) obj;
        bwj bwjVar2 = (bwj) obj2;
        ((Number) obj3).intValue();
        cgaVar.getClass();
        bwjVar2.y(-474393620);
        bwjVar2.y(-1125987896);
        boolean F = bwjVar2.F(this.a);
        Object h = bwjVar2.h();
        if (F || h == bwj.a.a) {
            h = new aeri(this.a, 0);
            bwjVar2.B(h);
        }
        bwjVar2.q();
        cga c = cho.c(cgaVar, (arqr) h);
        bwjVar2.q();
        return c;
    }
}
