package defpackage;

import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbc {
    public static final int a(dia diaVar, long j, deo deoVar) {
        float f;
        if (deoVar != null) {
            f = deoVar.a();
        } else {
            f = brg.a;
        }
        int i = (int) (4294967295L & j);
        int c = diaVar.c(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) >= diaVar.b(c) - f && Float.intBitsToFloat(i) <= diaVar.a(c) + f) {
            int i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) >= (-f)) {
                if (Float.intBitsToFloat(i2) <= diaVar.c + f) {
                    return c;
                }
            }
        }
        return -1;
    }

    public static final int b(ayd aydVar, long j, deo deoVar) {
        diy diyVar;
        cti e;
        long l;
        dia diaVar;
        int a;
        baa d = aydVar.d();
        if (d == null || (diyVar = d.a) == null || (e = aydVar.e()) == null || (a = a((diaVar = diyVar.b), (l = e.l(j)), deoVar)) == -1) {
            return -1;
        }
        return diaVar.d(cjn.h(l, (diaVar.b(a) + diaVar.a(a)) / 2.0f, 1));
    }

    public static final long c(ayd aydVar, cjp cjpVar, int i, div divVar) {
        diy diyVar;
        baa d = aydVar.d();
        dia diaVar = null;
        if (d != null && (diyVar = d.a) != null) {
            diaVar = diyVar.b;
        }
        cti e = aydVar.e();
        if (diaVar != null && e != null) {
            return diaVar.e(cjpVar.f(e.l(0L)), i, divVar);
        }
        return djc.a;
    }

    public static final long d(ayd aydVar, cjp cjpVar, cjp cjpVar2, int i, div divVar) {
        long c = c(aydVar, cjpVar, i, divVar);
        if (djc.h(c)) {
            return djc.a;
        }
        long c2 = c(aydVar, cjpVar2, i, divVar);
        if (djc.h(c2)) {
            return djc.a;
        }
        return djd.a(Math.min(djc.e(c), djc.e(c)), Math.max(djc.a(c2), djc.a(c2)));
    }

    public static final long e(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public static final boolean f(diy diyVar, int i) {
        int f;
        int g = diyVar.g(i);
        if (i != diyVar.i(g)) {
            f = diyVar.f(g, false);
            if (i != f) {
                if (diyVar.p(i) != diyVar.p(i - 1)) {
                    return true;
                }
                return false;
            }
        }
        if (diyVar.q(i) != diyVar.p(i)) {
            return true;
        }
        return false;
    }

    public static final boolean g(int i) {
        if (!Character.isWhitespace(i) && i != 160) {
            return false;
        }
        return true;
    }

    public static final boolean h(int i) {
        int type;
        if (g(i) && (type = Character.getType(i)) != 14 && type != 13 && i != 10) {
            return true;
        }
        return false;
    }
}
