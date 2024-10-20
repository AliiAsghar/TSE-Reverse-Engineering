package defpackage;

import android.net.Uri;
import android.text.format.DateUtils;
import defpackage.bwj;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jkf extends arrp implements arqy {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkf(Object obj, int i) {
        super(5);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v10, types: [ascv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [ascv, java.lang.Object] */
    @Override // defpackage.arqy
    public final /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2;
        float f;
        float f2;
        float f3;
        int i3 = this.b;
        if (i3 == 0) {
            agcg agcgVar = (agcg) obj;
            cga cgaVar = (cga) obj2;
            jkl jklVar = (jkl) obj3;
            bwj bwjVar = (bwj) obj4;
            int intValue = ((Number) obj5).intValue();
            agcgVar.getClass();
            cgaVar.getClass();
            jklVar.getClass();
            if ((intValue & 14) == 0) {
                i = intValue | (true != bwjVar.G(agcgVar) ? 2 : 4);
            } else {
                i = intValue;
            }
            if ((intValue & 112) == 0) {
                i |= true != bwjVar.G(cgaVar) ? 16 : 32;
            }
            if ((intValue & 896) == 0) {
                i |= true != bwjVar.G(jklVar) ? 128 : 256;
            }
            if ((i & 5851) == 1170 && bwjVar.L()) {
                bwjVar.v();
            } else if (jkg.e(jklVar, bwjVar)) {
                cas a = cak.a(((jkg) this.a).c.a, bwjVar);
                bwjVar.y(-2006208963);
                if (((afgx) a.a()).a()) {
                    hld.t(bwjVar);
                }
                bwjVar.q();
                acf d = zs.d(500, 0, new aae(0.2f, brg.a, brg.a, 1.0f), 2);
                bwjVar.y(-2006202386);
                Object h = bwjVar.h();
                if (h == bwj.a.a) {
                    h = jbs.n;
                    bwjVar.B(h);
                }
                bwjVar.q();
                xl b = wx.b(d, (arqr) h);
                acf d2 = zs.d(1000, 0, new aae(0.2f, brg.a, brg.a, 1.0f), 2);
                bwjVar.y(-2006194866);
                Object h2 = bwjVar.h();
                if (h2 == bwj.a.a) {
                    h2 = jbs.o;
                    bwjVar.B(h2);
                }
                bwjVar.q();
                wf.a(true, null, b, wx.c(d2, new xj((arqr) h2)), null, cdk.e(-654097582, new qjl(jklVar, cgaVar, agcgVar, 1, (char[]) null), bwjVar), bwjVar, 196608, 18);
            }
            return arnb.a;
        }
        if (i3 != 1) {
            kep kepVar = (kep) obj;
            awg awgVar = (awg) obj2;
            bwj bwjVar2 = (bwj) obj4;
            int intValue2 = ((Number) obj5).intValue();
            kepVar.getClass();
            awgVar.getClass();
            obj3.getClass();
            String formatElapsedTime = DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(kepVar.c));
            aetk aetkVar = new aetk(false, 5);
            afbq afbqVar = new afbq(((ansy) ((pkm) ((hmk) this.a).a).a.b()).e("bugle.fix_video_thumbnail_bubble_uri_cache"));
            bwjVar2.y(2043933671);
            boolean z = (((intValue2 & 14) ^ 6) > 4 && bwjVar2.G(kepVar)) || (intValue2 & 6) == 4;
            Object h3 = bwjVar2.h();
            if (z || h3 == bwj.a.a) {
                h3 = new kdz(kepVar, 5);
                bwjVar2.B(h3);
            }
            aerg aergVar = kepVar.h;
            arqg arqgVar = kepVar.n;
            arqg arqgVar2 = kepVar.m;
            int i4 = kepVar.o;
            Integer num = kepVar.l;
            Integer num2 = kepVar.k;
            boolean z2 = kepVar.j;
            String str = kepVar.i;
            Uri uri = kepVar.b;
            bwjVar2.q();
            adom.bm(new afbr(kepVar.a, uri, (arqg) h3, formatElapsedTime, aergVar, afbqVar, str, z2, num2, num, i4, arqgVar2, arqgVar, aetkVar), obj3, awgVar, bwjVar2, ((intValue2 << 3) & 896) | 64);
            return arnb.a;
        }
        agcf agcfVar = (agcf) obj;
        cga cgaVar2 = (cga) obj2;
        jkl jklVar2 = (jkl) obj3;
        bwj bwjVar3 = (bwj) obj4;
        int intValue3 = ((Number) obj5).intValue();
        agcfVar.getClass();
        cgaVar2.getClass();
        jklVar2.getClass();
        if ((intValue3 & 14) == 0) {
            i2 = intValue3 | (true != bwjVar3.G(agcfVar) ? 2 : 4);
        } else {
            i2 = intValue3;
        }
        if ((intValue3 & 112) == 0) {
            i2 |= true != bwjVar3.G(cgaVar2) ? 16 : 32;
        }
        if ((intValue3 & 896) == 0) {
            i2 |= true != bwjVar3.G(jklVar2) ? 128 : 256;
        }
        if ((i2 & 5851) == 1170 && bwjVar3.L()) {
            bwjVar3.v();
        } else {
            int i5 = i2 & 14;
            dqv dqvVar = (dqv) bwjVar3.g(dch.d);
            bwjVar3.y(-1611894259);
            cas a2 = cap.a(new dqy(new alt(anl.d(bwjVar3), dqvVar).a()), bwjVar3);
            bwjVar3.q();
            cas a3 = cak.a(((jkg) this.a).c.a, bwjVar3);
            bwjVar3.y(-2006293443);
            if (((afgx) a3.a()).a()) {
                hld.t(bwjVar3);
            }
            bwjVar3.q();
            bwjVar3.y(-2006288336);
            bwjVar3.y(-2006286702);
            boolean e = jkg.e(jklVar2, bwjVar3);
            bwjVar3.q();
            if (!e) {
                f = ((dqy) a2.a()).a;
            } else {
                bwjVar3.y(-2006284588);
                float d3 = jkg.d(agcfVar, bwjVar3) + 10.0f;
                f3 = ((dqy) a2.a()).a;
                f = d3 - f3;
                bwjVar3.q();
            }
            bwjVar3.q();
            f2 = ((dqy) zl.b(f, zs.d(500, 0, new aae(0.2f, brg.a, brg.a, 1.0f), 2), bwjVar3, 48, 12).a()).a;
            if (jkg.f(jklVar2, bwjVar3)) {
                f2 += 75.0f;
            }
            hld.z(agcfVar, dea.a(amh.j(cgaVar2, brg.a, brg.a, brg.a, f2, 7), "DirectSend:Root"), jklVar2, bwjVar3, i5 | 512 | (i2 & 896));
        }
        return arnb.a;
    }
}
