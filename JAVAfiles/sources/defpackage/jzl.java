package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.bwj;
import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzl {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/messagelist/message/BugleMessageUiKt");

    public static final void a(jzj jzjVar, zj zjVar, bwj bwjVar, int i, int i2) {
        int i3;
        int i4;
        zj zjVar2;
        jzjVar.getClass();
        int i5 = i2 & 1;
        bwj c = bwjVar.c(1302270384);
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (true != c.G(jzjVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i3 = i | i4;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            int i6 = 16;
            if ((i2 & 2) == 0) {
                zjVar2 = zjVar;
                if (c.G(zjVar2)) {
                    i6 = 32;
                }
            } else {
                zjVar2 = zjVar;
            }
            i3 |= i6;
        } else {
            zjVar2 = zjVar;
        }
        if ((i3 & 91) == 18 && c.L()) {
            c.v();
        } else {
            int i7 = i2 & 2;
            c.w();
            if ((i & 1) != 0 && !c.J()) {
                c.v();
                if (i7 != 0) {
                    i3 &= -113;
                }
            } else if (i7 != 0) {
                i3 &= -113;
                zjVar2 = zk.a(brg.a);
            }
            zj zjVar3 = zjVar2;
            int i8 = i3;
            c.n();
            if (jzjVar instanceof kex) {
                c.y(2101812965);
                lga.bq((kex) jzjVar, d(c), zjVar3, c, ((i8 << 3) & 896) | 512);
                ((bwk) c).Y();
            } else if (jzjVar instanceof jzx) {
                c.y(2102009846);
                jzx jzxVar = (jzx) jzjVar;
                int i9 = (i8 & 112) | 64;
                if (jzxVar.e.a && (jzxVar.b instanceof aezf)) {
                    c.y(2102088400);
                    c(jzxVar, zjVar3, c, i9);
                    ((bwk) c).Y();
                } else {
                    c.y(2102148044);
                    b(jzxVar, zjVar3, c, i9);
                    ((bwk) c).Y();
                }
                ((bwk) c).Y();
            } else if (jzjVar instanceof kfc) {
                c.y(-1179111724);
                lga.bo((kfc) jzjVar, c, 0);
                ((bwk) c).Y();
            } else if (jzjVar instanceof kfg) {
                c.y(2102329735);
                kfg kfgVar = (kfg) jzjVar;
                aahr aahrVar = kfgVar.a;
                if (aahrVar != null) {
                    aabr.x(aahrVar, kfgVar.b, kfgVar.c, c, 8);
                }
                ((bwk) c).Y();
            } else if (jzjVar instanceof kes) {
                c.y(-1179103089);
                lga.bs((kes) jzjVar, c, 0);
                ((bwk) c).Y();
            } else if (jzjVar instanceof kew) {
                c.y(-1179101485);
                lga.br((kew) jzjVar, c, 0);
                ((bwk) c).Y();
            } else {
                c.y(-1179100294);
                Class<?> cls = jzjVar.getClass();
                int i10 = arsc.a;
                ahji.e("<message type not handled yet " + new arrh(cls) + ">", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, c, 0, 0, 131070);
                ((bwk) c).Y();
            }
            zjVar2 = zjVar3;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aeis(jzjVar, zjVar2, i, i2, 1);
        }
    }

    public static final void b(jzx jzxVar, zj zjVar, bwj bwjVar, int i) {
        int i2;
        cga a2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-1570945051);
        if (i5 == 0) {
            if (true != c.G(jzxVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(zjVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            aeul aeulVar = jzxVar.a;
            aeux d = d(c);
            cga cgaVar = cga.e;
            if (xyp.d()) {
                cgaVar = cts.a(cgaVar, new jwz(4));
            }
            jzv jzvVar = jzxVar.d;
            if (jzvVar != null) {
                String str = jzxVar.f;
                cga.a aVar = cga.e;
                aVar.getClass();
                a2 = aVar.a(new cfw("com.google.android.libraries.communications.ux.components.message.animation.sendingAnimation", str, new aett(str, jzvVar.b, jzvVar.a)));
                cgaVar = cgaVar.a(a2);
            }
            adcx.cf(aeulVar, cgaVar, zjVar, d, cdk.e(-1183806680, new jjs(jzxVar, 7), c), c, ((i2 << 3) & 896) | 25088, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new iea(jzxVar, zjVar, i, 10);
        }
    }

    public static final void c(jzx jzxVar, zj zjVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-1411618899);
        if (i5 == 0) {
            if (true != c.G(jzxVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(zjVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            aezf aezfVar = (aezf) jzxVar.b;
            String str = aezfVar.a;
            c.y(1633503145);
            if (str.length() <= jzxVar.e.b) {
                b(jzxVar, zjVar, c, (i2 & 14) | 64 | (i2 & 112));
                ((bwk) c).Y();
                bzz e = c.e();
                if (e != null) {
                    ((bzf) e).d = new iea(jzxVar, zjVar, i, 11);
                    return;
                }
                return;
            }
            bwk bwkVar = (bwk) c;
            bwkVar.Y();
            long j = dja.a(djb.a(c), str, adom.cg(aezfVar, c), 0, 0, 0L, 1020).c;
            dqv dqvVar = (dqv) c.g(dch.d);
            int eo = dqvVar.eo(adcx.bZ(jzxVar.a)) + dqvVar.eo(adcx.bX(jzxVar.a));
            c.y(1633517926);
            int i6 = ((int) (j & 4294967295L)) + eo;
            if (i6 < 262143) {
                b(jzxVar, zjVar, c, (i2 & 14) | 64 | (i2 & 112));
                bwkVar.Y();
                bzz e2 = c.e();
                if (e2 != null) {
                    ((bzf) e2).d = new iea(jzxVar, zjVar, i, 12);
                    return;
                }
                return;
            }
            bwkVar.Y();
            int i7 = i6 / 262143;
            int i8 = i7 + 1;
            int length = str.length() / i8;
            ((alvg) a.d().h("com/google/android/apps/messaging/conversation2/messagelist/message/BugleMessageUiKt", "SplitTextBubble", 126, "BugleMessageUi.kt")).J("Splitting text bubble with height %s into %d bubbles. textLength is %d", Integer.valueOf(i6), Integer.valueOf(i8), Integer.valueOf(length));
            for (int i9 = i7; i9 >= 0; i9--) {
                String substring = str.substring(i9 * length, Math.min((i9 + 1) * length, str.length()));
                substring.getClass();
                b(jzx.c(jzxVar, null, aezf.h(aezfVar, substring, null, null, null, null, false, 2097150), 29), zjVar, c, (i2 & 112) | 64);
            }
        }
        bzz e3 = c.e();
        if (e3 != null) {
            ((bzf) e3).d = new iea(jzxVar, zjVar, i, 13);
        }
    }

    private static final aeux d(bwj bwjVar) {
        bwjVar.y(505373486);
        Context context = (Context) bwjVar.g(AndroidCompositionLocals_androidKt.b);
        dja a2 = djb.a(bwjVar);
        bwjVar.y(371888467);
        bwk bwkVar = (bwk) bwjVar;
        Object T = bwkVar.T();
        if (T == bwj.a.a) {
            T = new aeux(jwz.d, eif.g, new ifo(a2, context, 3));
            bwkVar.ad(T);
        }
        aeux aeuxVar = (aeux) T;
        bwkVar.Y();
        bwkVar.Y();
        return aeuxVar;
    }
}
