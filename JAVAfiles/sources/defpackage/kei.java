package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kei {
    public static final bzc a = new cat(kac.t);

    public static final void a(kep kepVar, awg awgVar, Object obj, bwj bwjVar, int i) {
        int i2;
        String str;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(-1332563899);
        if (i5 == 0) {
            if (true != c.G(kepVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(awgVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        c.w();
        if ((i & 1) != 0 && !c.J()) {
            c.v();
        }
        c.n();
        c.y(-1230741705);
        int i6 = i2 & 14;
        bwk bwkVar = (bwk) c;
        Object T = bwkVar.T();
        if (i6 == 4 || T == bwj.a.a) {
            T = new jsu(kepVar, (arpe) null, 12);
            bwkVar.ad(T);
        }
        bwkVar.Y();
        bxl.g(kepVar, (arqv) T, c);
        int ordinal = kepVar.e.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                c.y(502607533);
                adcx.bx(kepVar.d, null, cdk.e(2059906591, new keh(kepVar, awgVar, obj, 0), c), c, 384);
                bwkVar.Y();
            } else {
                c.y(-1230733244);
                String str2 = kepVar.f;
                String str3 = kepVar.g;
                String str4 = kepVar.i;
                if (str4 == null) {
                    str = "";
                } else {
                    str = str4;
                }
                aetn.aA(new aeki(new aejp(str2, str3, str, 4), new aekh((byte[]) null), str4, kepVar.j, (arqg) null, 48), null, awgVar, c, (i2 << 3) & 896, 2);
                bwkVar.Y();
            }
            bzz e = c.e();
            if (e != null) {
                ((bzf) e).d = new jkb((Object) kepVar, (Object) awgVar, obj, i, 6, (char[]) null);
                return;
            }
            return;
        }
        c.y(501829464);
        bwkVar.Y();
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new jkb((Object) kepVar, (Object) awgVar, obj, i, 5, (char[]) null);
        }
    }
}
