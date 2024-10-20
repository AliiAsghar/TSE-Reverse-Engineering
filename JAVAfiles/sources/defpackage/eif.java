package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.R;
import defpackage.ajw;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eif extends arrp implements arqv {
    private final /* synthetic */ int u;
    public static final eif t = new eif(20);
    public static final eif s = new eif(19);
    public static final eif r = new eif(18);
    public static final eif q = new eif(16);
    public static final eif p = new eif(15);
    public static final eif o = new eif(14);
    public static final eif n = new eif(13);
    public static final eif m = new eif(12);
    public static final eif l = new eif(11);
    public static final eif k = new eif(10);
    public static final eif j = new eif(9);
    public static final eif i = new eif(8);
    public static final eif h = new eif(7);
    public static final eif g = new eif(6);
    public static final eif f = new eif(5);
    public static final eif e = new eif(4);
    public static final eif d = new eif(3);
    public static final eif c = new eif(2);
    public static final eif b = new eif(1);
    public static final eif a = new eif(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eif(int i2) {
        super(2);
        this.u = i2;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        aein aeinVar;
        aein aeinVar2;
        int i2 = -1;
        boolean z = true;
        int i3 = 0;
        switch (this.u) {
            case 0:
                ((dyi) obj).getClass();
                throw null;
            case 1:
                obj.getClass();
                obj2.getClass();
                return 1;
            case 2:
                miu miuVar = (miu) obj;
                miu miuVar2 = (miu) obj2;
                miuVar.getClass();
                miuVar2.getClass();
                return Boolean.valueOf(d.F(miuVar.h(), miuVar2.h()));
            case 3:
                bwj bwjVar = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
                    bwjVar.v();
                } else {
                    cga.a aVar = cga.e;
                    awg awgVar = jxe.a;
                    cga e2 = amh.e(aVar, 24.0f, 24.0f);
                    ajw.e eVar = ajw.c;
                    int i4 = cfq.a;
                    cue a2 = akk.a(eVar, cfq.a.m, bwjVar, 0);
                    int a3 = bwg.a(bwjVar);
                    bwy d2 = bwjVar.d();
                    cga b2 = cfv.b(bwjVar, e2);
                    int i5 = cwl.a;
                    arqg arqgVar = cwl.a.a;
                    bwjVar.N();
                    bwjVar.A();
                    if (bwjVar.K()) {
                        bwjVar.l(arqgVar);
                    } else {
                        bwjVar.C();
                    }
                    caw.b(bwjVar, a2, cwl.a.e);
                    caw.b(bwjVar, d2, cwl.a.d);
                    arqv arqvVar = cwl.a.f;
                    if (bwjVar.K() || !d.F(bwjVar.h(), Integer.valueOf(a3))) {
                        Integer valueOf = Integer.valueOf(a3);
                        bwjVar.B(valueOf);
                        bwjVar.j(valueOf, arqvVar);
                    }
                    caw.b(bwjVar, b2, cwl.a.c);
                    hwr.aa(amh.j(cga.e, brg.a, brg.a, brg.a, 8.0f, 7), dga.a(R.string.sample_incoming_message_text, bwjVar), false, bwjVar, 6, 12);
                    hwr.aa(null, dga.a(R.string.sample_outgoing_message_text, bwjVar), true, bwjVar, 3072, 5);
                    bwjVar.p();
                }
                return arnb.a;
            case 4:
                bwj bwjVar2 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar2.L()) {
                    bwjVar2.v();
                } else {
                    ahji.N(aeke.bg(aerb.X, bwjVar2), null, amv.g(cga.e, 24.0f), bmp.a(bwjVar2).q, bwjVar2, 440, 0);
                }
                return arnb.a;
            case 5:
                bwj bwjVar3 = (bwj) obj;
                ((Number) obj2).intValue();
                bwjVar3.y(-411577369);
                bwjVar3.q();
                return true;
            case 6:
                bwj bwjVar4 = (bwj) obj;
                ((Number) obj2).intValue();
                bwjVar4.y(1731591792);
                long j2 = bmp.a(bwjVar4).a;
                bwjVar4.q();
                return new cku(j2);
            case 7:
                ((Number) obj).intValue();
                ((Number) obj2).intValue();
                return false;
            case 8:
                miz mizVar = (miz) obj;
                miz mizVar2 = (miz) obj2;
                mizVar.getClass();
                mizVar2.getClass();
                if (!lga.bx(mizVar) || !lga.bx(mizVar2)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                miz mizVar3 = (miz) obj;
                miz mizVar4 = (miz) obj2;
                mizVar3.getClass();
                mizVar4.getClass();
                if ((!lga.bz(mizVar3.e()) && !(mizVar3 instanceof kci)) || !lga.bz(mizVar4.e())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                miz mizVar5 = (miz) obj;
                miz mizVar6 = (miz) obj2;
                mizVar5.getClass();
                mizVar6.getClass();
                if (mizVar5.k() != null || mizVar6.k() != null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                miz mizVar7 = (miz) obj;
                miz mizVar8 = (miz) obj2;
                mizVar7.getClass();
                mizVar8.getClass();
                if (!ymd.b() || lga.by(mizVar7.e()) || lga.by(mizVar8.e())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 12:
                miz mizVar9 = (miz) obj;
                miz mizVar10 = (miz) obj2;
                mizVar9.getClass();
                mizVar10.getClass();
                if (mizVar9.u() != null || mizVar10.u() != null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                miz mizVar11 = (miz) obj;
                miz mizVar12 = (miz) obj2;
                mizVar11.getClass();
                mizVar12.getClass();
                if (mizVar11.a() != mizVar12.a()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                miz mizVar13 = (miz) obj;
                miz mizVar14 = (miz) obj2;
                mizVar13.getClass();
                mizVar14.getClass();
                return Boolean.valueOf(lga.ch(mizVar13, mizVar14));
            case 15:
                aeig aeigVar = (aeig) obj;
                boolean z2 = aeigVar instanceof aeie;
                aeig aeigVar2 = (aeig) obj2;
                if (z2 && ((aeie) aeigVar).a == aein.q) {
                    if (aeigVar2 instanceof aeid) {
                        return 1;
                    }
                    if ((aeigVar2 instanceof aeie) && ((aeinVar2 = ((aeie) aeigVar2).a) == aein.p || aeinVar2 == aein.n || aeinVar2 == aein.o)) {
                        return 1;
                    }
                } else if ((aeigVar2 instanceof aeie) && ((aeie) aeigVar2).a == aein.q && ((aeigVar instanceof aeid) || (z2 && ((aeinVar = ((aeie) aeigVar).a) == aein.p || aeinVar == aein.n || aeinVar == aein.o)))) {
                    return -1;
                }
                return 0;
            case 16:
                aeig aeigVar3 = (aeig) obj;
                aeig aeigVar4 = (aeig) obj2;
                if (aeigVar3.a() > aeigVar4.b()) {
                    if (aeigVar4.a() <= aeigVar3.b()) {
                        i2 = 1;
                    } else {
                        i2 = arro.a(aeigVar4.a(), aeigVar3.a());
                    }
                }
                return Integer.valueOf(i2);
            case 17:
                bwj bwjVar5 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar5.L()) {
                    bwjVar5.v();
                    return arnb.a;
                }
                cga b3 = adf.b(amv.o(cga.e), bmp.a(bwjVar5).p);
                ajw.e eVar2 = ajw.c;
                int i6 = cfq.a;
                cue a4 = akk.a(eVar2, cfq.a.m, bwjVar5, 0);
                int a5 = bwg.a(bwjVar5);
                bwy d3 = bwjVar5.d();
                cga b4 = cfv.b(bwjVar5, b3);
                int i7 = cwl.a;
                arqg arqgVar2 = cwl.a.a;
                bwjVar5.N();
                bwjVar5.A();
                if (bwjVar5.K()) {
                    bwjVar5.l(arqgVar2);
                } else {
                    bwjVar5.C();
                }
                caw.b(bwjVar5, a4, cwl.a.e);
                caw.b(bwjVar5, d3, cwl.a.d);
                arqv arqvVar2 = cwl.a.f;
                if (bwjVar5.K() || !d.F(bwjVar5.h(), Integer.valueOf(a5))) {
                    Integer valueOf2 = Integer.valueOf(a5);
                    bwjVar5.B(valueOf2);
                    bwjVar5.j(valueOf2, arqvVar2);
                }
                caw.b(bwjVar5, b4, cwl.a.c);
                cga a6 = akm.a(ako.a, afs.c(anh.b(cga.e, anl.e(bwjVar5)), afs.b(bwjVar5, 0), false, 14), 1.0f);
                cue a7 = akk.a(ajw.c, cfq.a.m, bwjVar5, 0);
                int a8 = bwg.a(bwjVar5);
                bwy d4 = bwjVar5.d();
                cga b5 = cfv.b(bwjVar5, a6);
                arqg arqgVar3 = cwl.a.a;
                bwjVar5.N();
                bwjVar5.A();
                if (bwjVar5.K()) {
                    bwjVar5.l(arqgVar3);
                } else {
                    bwjVar5.C();
                }
                caw.b(bwjVar5, a7, cwl.a.e);
                caw.b(bwjVar5, d4, cwl.a.d);
                arqv arqvVar3 = cwl.a.f;
                if (bwjVar5.K() || !d.F(bwjVar5.h(), Integer.valueOf(a8))) {
                    Integer valueOf3 = Integer.valueOf(a8);
                    bwjVar5.B(valueOf3);
                    bwjVar5.j(valueOf3, arqvVar3);
                }
                caw.b(bwjVar5, b5, cwl.a.c);
                cga.a aVar2 = cga.e;
                cue a9 = akk.a(ajw.c, cfq.a.m, bwjVar5, 0);
                int a10 = bwg.a(bwjVar5);
                bwy d5 = bwjVar5.d();
                cga b6 = cfv.b(bwjVar5, aVar2);
                arqg arqgVar4 = cwl.a.a;
                bwjVar5.N();
                bwjVar5.A();
                if (bwjVar5.K()) {
                    bwjVar5.l(arqgVar4);
                } else {
                    bwjVar5.C();
                }
                caw.b(bwjVar5, a9, cwl.a.e);
                caw.b(bwjVar5, d5, cwl.a.d);
                arqv arqvVar4 = cwl.a.f;
                if (bwjVar5.K() || !d.F(bwjVar5.h(), Integer.valueOf(a10))) {
                    Integer valueOf4 = Integer.valueOf(a10);
                    bwjVar5.B(valueOf4);
                    bwjVar5.j(valueOf4, arqvVar4);
                }
                caw.b(bwjVar5, b6, cwl.a.c);
                amx.a(amv.d(cga.e, 68.0f), bwjVar5);
                throw null;
            case 18:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                ((Set) obj).getClass();
                return bool;
            case 19:
                Boolean bool2 = (Boolean) obj2;
                bool2.booleanValue();
                ((Set) obj).getClass();
                return bool2;
            default:
                Cursor cursor = (Cursor) obj2;
                if (cursor != null) {
                    i3 = cursor.getCount();
                }
                return Integer.valueOf(i3);
        }
    }
}
