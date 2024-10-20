package defpackage;

import android.net.Uri;
import androidx.compose.foundation.BackgroundElement;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.csv;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aejx extends arrp implements arqw {
    final /* synthetic */ aeja a;
    final /* synthetic */ cga b;
    final /* synthetic */ cmb c;
    final /* synthetic */ drk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aejx(aeja aejaVar, cga cgaVar, cmb cmbVar, drk drkVar) {
        super(3);
        this.a = aejaVar;
        this.b = cgaVar;
        this.c = cmbVar;
        this.d = drkVar;
    }

    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long j;
        Object cmdVar;
        long j2;
        long j3;
        cga a;
        Uri uri;
        bwj bwjVar;
        drk drkVar;
        aeja aejaVar;
        long j4;
        bwj bwjVar2 = (bwj) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ake) obj).getClass();
        if ((intValue & 81) == 16 && bwjVar2.L()) {
            bwjVar2.v();
        } else {
            aeja aejaVar2 = this.a;
            bwjVar2.y(585630543);
            afbz b = aejaVar2.b();
            if (b != null) {
                bwjVar2.y(1192210934);
                long j5 = b.d;
                long d = ckw.d(b.c);
                long d2 = ckw.d(j5);
                if (aejaVar2.d()) {
                    j4 = adom.bX(bwjVar2).E;
                } else {
                    j4 = cku.g;
                }
                cmdVar = new afbw(b.e, d, d2, j4);
                bwjVar2.q();
            } else if (aejaVar2.d()) {
                bwjVar2.y(1192221736);
                cmdVar = new cmd(adom.bX(bwjVar2).b.j);
                bwjVar2.q();
            } else if (aejaVar2.f() && aejaVar2.e()) {
                bwjVar2.y(1192225341);
                cmdVar = new clk(aqjn.B(new cku(adom.bX(bwjVar2).b.g), new cku(adom.bX(bwjVar2).b.h)), 0L, 9187343241974906880L);
                bwjVar2.q();
            } else if (aejaVar2.f()) {
                bwjVar2.y(-1695529999);
                if (adom.cd(bwjVar2)) {
                    bwjVar2.y(-1695469797);
                    j3 = adom.cb(bwjVar2).P;
                    bwjVar2.q();
                } else {
                    bwjVar2.y(-1695410835);
                    j3 = adom.bX(bwjVar2).b.e;
                    bwjVar2.q();
                }
                cmdVar = new cmd(j3);
                bwjVar2.q();
            } else if (aejaVar2.e()) {
                bwjVar2.y(-1695289501);
                if (adom.cd(bwjVar2)) {
                    bwjVar2.y(-1695229299);
                    j2 = agkx.o(adom.bX(bwjVar2).a);
                    bwjVar2.q();
                } else {
                    bwjVar2.y(-1695156883);
                    j2 = adom.bX(bwjVar2).b.c;
                    bwjVar2.q();
                }
                cmdVar = new cmd(j2);
                bwjVar2.q();
            } else {
                bwjVar2.y(-1695041935);
                if (adom.cd(bwjVar2)) {
                    bwjVar2.y(-1694981733);
                    j = adom.cb(bwjVar2).P;
                    bwjVar2.q();
                } else {
                    bwjVar2.y(-1694922771);
                    j = adom.bX(bwjVar2).b.a;
                    bwjVar2.q();
                }
                cmdVar = new cmd(j);
                bwjVar2.q();
            }
            bwjVar2.q();
            long j6 = bmp.a(bwjVar2).a;
            bwjVar2.y(-766869190);
            boolean G = bwjVar2.G(this.a) | bwjVar2.F(j6);
            Object h = bwjVar2.h();
            if (!G && h != bwj.a.a) {
                cmdVar = h;
            } else {
                bwjVar2.B(cmdVar);
            }
            bwjVar2.q();
            cga cgaVar = this.b;
            cmb cmbVar = this.c;
            a = chk.a(cgaVar, cmbVar).a(new BackgroundElement(0L, (cko) cmdVar, cmbVar, 1));
            cga l = amv.l(a, adcx.ce(brg.a, bwjVar2, 1));
            aeja aejaVar3 = this.a;
            drk drkVar2 = this.d;
            int i = cfq.a;
            cue a2 = akc.a(cfq.a.a, false);
            int a3 = bwg.a(bwjVar2);
            bwy d3 = bwjVar2.d();
            cga b2 = cfv.b(bwjVar2, l);
            int i2 = cwl.a;
            arqg arqgVar = cwl.a.a;
            bwjVar2.N();
            bwjVar2.A();
            if (bwjVar2.K()) {
                bwjVar2.l(arqgVar);
            } else {
                bwjVar2.C();
            }
            caw.b(bwjVar2, a2, cwl.a.e);
            caw.b(bwjVar2, d3, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwjVar2.K() || !d.F(bwjVar2.h(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                bwjVar2.B(valueOf);
                bwjVar2.j(valueOf, arqvVar);
            }
            caw.b(bwjVar2, b2, cwl.a.c);
            akf akfVar = akf.a;
            afbz b3 = aejaVar3.b();
            if (b3 != null) {
                uri = b3.b;
            } else {
                uri = null;
            }
            Uri uri2 = uri;
            bwjVar2.y(782426741);
            if (uri2 != null) {
                cga b4 = akfVar.b(cgh.a(cga.e, brg.a));
                cfq cfqVar = cfq.a.g;
                int i3 = csv.a;
                drkVar = drkVar2;
                aejaVar = aejaVar3;
                bwjVar = bwjVar2;
                aeke.bf(uri2, null, b4, null, null, cfqVar, csv.a.d, null, brg.a, null, null, null, "audio_bubble_background_loaded", null, null, null, bwjVar, 14155784, 196608, 491320);
            } else {
                bwjVar = bwjVar2;
                drkVar = drkVar2;
                aejaVar = aejaVar3;
            }
            bwjVar.q();
            bwx.a(dch.i.c(drkVar), cdk.e(-97304818, new aejw(aejaVar), bwjVar), bwjVar, 56);
            bwjVar.y(782481283);
            bwjVar.q();
            bwjVar.p();
        }
        return arnb.a;
    }
}
