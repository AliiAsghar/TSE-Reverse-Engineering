package defpackage;

import com.google.android.apps.messaging.R;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zbh extends arrp implements arqv {
    final /* synthetic */ afv a;
    final /* synthetic */ cas b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbh(afv afvVar, cas casVar) {
        super(2);
        this.a = afvVar;
        this.b = casVar;
    }

    public static final void b(byn bynVar, doj dojVar) {
        bynVar.h(dojVar);
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        String a;
        cga c;
        zav zavVar;
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            bwjVar.y(-1009878462);
            Object h = bwjVar.h();
            if (h == bwj.a.a) {
                h = new cit();
                bwjVar.B(h);
            }
            cit citVar = (cit) h;
            bwjVar.q();
            int i = cfq.a;
            afv afvVar = this.a;
            cas casVar = this.b;
            cfq.b bVar = cfq.a.n;
            cga.a aVar = cga.e;
            cue a2 = akk.a(ajw.c, bVar, bwjVar, 48);
            int a3 = bwg.a(bwjVar);
            bwy d = bwjVar.d();
            cga b = cfv.b(bwjVar, aVar);
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
                Object valueOf = Integer.valueOf(a3);
                bwjVar.B(valueOf);
                bwjVar.j(valueOf, arqvVar);
            }
            caw.b(bwjVar, b, cwl.a.c);
            String str = aabr.aP(casVar).e;
            String str2 = aabr.aP(casVar).f;
            aabr.aS(aabr.aP(casVar).a, aabr.aP(casVar).o, bwjVar, 64);
            cfq.b bVar2 = cfq.a.n;
            cga c2 = afs.c(cga.e, afvVar, false, 14);
            cue a4 = akk.a(ajw.c, bVar2, bwjVar, 48);
            int a5 = bwg.a(bwjVar);
            bwy d2 = bwjVar.d();
            cga b2 = cfv.b(bwjVar, c2);
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
            arqv arqvVar2 = cwl.a.f;
            if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a5))) {
                Object valueOf2 = Integer.valueOf(a5);
                bwjVar.B(valueOf2);
                bwjVar.j(valueOf2, arqvVar2);
            }
            caw.b(bwjVar, b2, cwl.a.c);
            aewf aewfVar = aabr.aP(casVar).b;
            bwjVar.y(1425945941);
            if (aewfVar != null && !aewfVar.a.isEmpty()) {
                cga aP = aetn.aP(amh.j(cga.e, brg.a, dfw.a(R.dimen.group_name_top_padding, bwjVar), brg.a, brg.a, 13));
                cue a6 = amq.a(ajw.a, cfq.a.j, bwjVar, 0);
                int a7 = bwg.a(bwjVar);
                bwy d3 = bwjVar.d();
                cga b3 = cfv.b(bwjVar, aP);
                arqg arqgVar3 = cwl.a.a;
                bwjVar.N();
                bwjVar.A();
                if (bwjVar.K()) {
                    bwjVar.l(arqgVar3);
                } else {
                    bwjVar.C();
                }
                caw.b(bwjVar, a6, cwl.a.e);
                caw.b(bwjVar, d3, cwl.a.d);
                arqv arqvVar3 = cwl.a.f;
                if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a7))) {
                    Object valueOf3 = Integer.valueOf(a7);
                    bwjVar.B(valueOf3);
                    bwjVar.j(valueOf3, arqvVar3);
                }
                caw.b(bwjVar, b3, cwl.a.c);
                adcx.aX(aewfVar, amv.d(cga.e, 24.0f), 0, false, bwjVar, 48, 12);
                bwjVar.p();
            }
            bwjVar.q();
            if (str.length() <= 100) {
                bwjVar.y(1255110695);
                a = dga.b(R.string.group_rename_remaining_text_count_text, new Object[]{Integer.valueOf(100 - str.length())}, bwjVar);
                bwjVar.q();
            } else {
                bwjVar.y(1255296788);
                a = dga.a(R.string.group_rename_remaining_text_characters_limit_reached, bwjVar);
                bwjVar.q();
            }
            bwjVar.y(1425971490);
            Object h2 = bwjVar.h();
            if (h2 == bwj.a.a) {
                String str3 = aabr.aP(casVar).e;
                int length = aabr.aP(casVar).e.length();
                long a8 = djd.a(length, length);
                long j = djc.a;
                Object byuVar = new byu(new doj(str3, a8, 4), cav.a);
                bwjVar.B(byuVar);
                h2 = byuVar;
            }
            byn bynVar = (byn) h2;
            bwjVar.q();
            doj dojVar = (doj) bynVar.a();
            c = amv.c(cga.e, 1.0f);
            cga a9 = civ.a(amh.e(c, 24.0f, 16.0f), citVar);
            ayc aycVar = new ayc(3, 0, 0, 126);
            boolean z = aabr.aP(casVar).l;
            bwjVar.y(1425988450);
            boolean G = bwjVar.G(casVar);
            Object h3 = bwjVar.h();
            if (G || h3 == bwj.a.a) {
                h3 = new wup(casVar, bynVar, 10, null);
                bwjVar.B(h3);
            }
            bwjVar.q();
            ahji.E(dojVar, (arqr) h3, a9, false, null, cdk.e(764895656, new lfw(casVar, 17), bwjVar), cdk.e(-1145630999, new lfw(str2, 18), bwjVar), cdk.e(-671717013, new ifn(casVar, bynVar, 9), bwjVar), cdk.e(-553241799, new ifn(a, str, 10), bwjVar), z, null, aycVar, null, 0, 0, null, null, null, bwjVar, 819462144, 199686, 0);
            ahji.e(aabr.aP(casVar).i, null, bmp.a(bwjVar).q, 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(bwjVar).l, bwjVar, 0, 0, 65530);
            bwjVar.y(1426043214);
            if (aabr.aP(casVar).p.a && (zavVar = aabr.aP(casVar).c) != null) {
                aabr.aR(zavVar, bwjVar, 0);
            }
            bwjVar.q();
            bwjVar.p();
            bwjVar.p();
            aabr.aT(citVar, bwjVar, 6);
        }
        return arnb.a;
    }
}
