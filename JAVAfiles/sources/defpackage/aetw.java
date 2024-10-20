package defpackage;

import defpackage.ajw;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aetw extends arrp implements arqv {
    final /* synthetic */ aeul a;
    final /* synthetic */ arqg b;
    final /* synthetic */ cpm c;
    final /* synthetic */ byn d;
    final /* synthetic */ float e;
    final /* synthetic */ arqv f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aetw(aeul aeulVar, arqg arqgVar, cpm cpmVar, byn bynVar, float f, arqv arqvVar) {
        super(2);
        this.a = aeulVar;
        this.b = arqgVar;
        this.c = cpmVar;
        this.d = bynVar;
        this.e = f;
        this.f = arqvVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        cga a;
        boolean z;
        cga b;
        arqr arqrVar;
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            bwjVar.y(-1222096563);
            cga.a aVar = cga.e;
            bwjVar.y(-1222082357);
            byn bynVar = this.d;
            Object h = bwjVar.h();
            if (h == bwj.a.a) {
                h = new aeql(bynVar, 11);
                bwjVar.B(h);
            }
            bwjVar.q();
            aeul aeulVar = this.a;
            a = aVar.a(new cfw("com.google.android.libraries.communications.ux.components.message.bubble.addBubbleTouchGestures", aeulVar, new qjl(aeulVar, this.c, this.b, 9, (char[]) null)));
            bwjVar.q();
            aeul aeulVar2 = this.a;
            aron aronVar = new aron((byte[]) null);
            String str = aeulVar2.s;
            if (str != null && (arqrVar = aeulVar2.r) != null) {
                aronVar.add(new dgr(str, new aetz(arqrVar, 3)));
            }
            List x = aqjn.x(aronVar);
            if (!x.isEmpty()) {
                a = dhb.c(a, false, new aeql(x, 14));
            }
            aeul aeulVar3 = this.a;
            byn bynVar2 = this.d;
            float f = this.e;
            arqv arqvVar = this.f;
            cga aO = aetn.aO(a);
            cue a2 = akc.a(adcx.cb(aeulVar3), false);
            int a3 = bwg.a(bwjVar);
            bwy d = bwjVar.d();
            cga b2 = cfv.b(bwjVar, aO);
            int i = cwl.a;
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
            arqv arqvVar2 = cwl.a.f;
            if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                bwjVar.B(valueOf);
                bwjVar.j(valueOf, arqvVar2);
            }
            caw.b(bwjVar, b2, cwl.a.c);
            if (f == brg.a) {
                z = false;
            } else {
                z = true;
            }
            akf akfVar = akf.a;
            adcx.cn(akfVar, aeulVar3, bynVar2, z, bwjVar, 390);
            adcx.cl(akfVar, aeulVar3, bwjVar, 6);
            if (aeulVar3.y.a) {
                int i2 = aeulVar3.B - 1;
                if (i2 != 0) {
                    if (i2 != 1) {
                        b = amv.c(cga.e, 1.0f);
                    } else {
                        b = alw.b(cga.e, alx.a);
                    }
                } else {
                    b = alw.b(cga.e, alx.b);
                }
            } else if (aeulVar3.g) {
                b = alw.b(cga.e, alx.b);
            } else {
                b = alw.b(cga.e, alx.a);
            }
            ajw.e eVar = ajw.c;
            int i3 = cfq.a;
            cue a4 = akk.a(eVar, cfq.a.m, bwjVar, 0);
            int a5 = bwg.a(bwjVar);
            bwy d2 = bwjVar.d();
            cga b3 = cfv.b(bwjVar, b);
            arqg arqgVar2 = cwl.a.a;
            bwjVar.N();
            bwjVar.A();
            if (bwjVar.K()) {
                bwjVar.l(arqgVar2);
            } else {
                bwjVar.C();
            }
            caw.b(bwjVar, a4, cwl.a.e);
            caw.b(bwjVar, d2, cwl.a.d);
            arqv arqvVar3 = cwl.a.f;
            if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a5))) {
                Integer valueOf2 = Integer.valueOf(a5);
                bwjVar.B(valueOf2);
                bwjVar.j(valueOf2, arqvVar3);
            }
            caw.b(bwjVar, b3, cwl.a.c);
            adcx.co(aeulVar3, bwjVar, 0);
            arqvVar.a(bwjVar, 0);
            bwjVar.p();
            bwjVar.p();
        }
        return arnb.a;
    }
}
