package defpackage;

import android.graphics.RectF;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class diy {
    public final dix a;
    public final dia b;
    public final long c;
    public final float d;
    public final float e;
    public final List f;

    public diy(dix dixVar, dia diaVar, long j) {
        float a;
        this.a = dixVar;
        this.b = diaVar;
        this.c = j;
        boolean isEmpty = diaVar.g.isEmpty();
        float f = brg.a;
        if (isEmpty) {
            a = 0.0f;
        } else {
            a = ((dif) diaVar.g.get(0)).a.a();
        }
        this.d = a;
        if (!diaVar.g.isEmpty()) {
            dif difVar = (dif) aqjn.ac(diaVar.g);
            f = difVar.a(difVar.a.d());
        }
        this.e = f;
        this.f = diaVar.f;
    }

    public final float a(int i) {
        return this.b.a(i);
    }

    public final float b(int i) {
        float f;
        dia diaVar = this.b;
        diaVar.i(i);
        List list = diaVar.g;
        dif difVar = (dif) list.get(did.b(list, i));
        die dieVar = difVar.a;
        int f2 = difVar.f(i);
        djx djxVar = ((dhu) dieVar).b;
        float lineLeft = djxVar.e.getLineLeft(f2);
        if (f2 == djxVar.f - 1) {
            f = djxVar.h;
        } else {
            f = brg.a;
        }
        return lineLeft + f;
    }

    public final float c(int i) {
        float f;
        dia diaVar = this.b;
        diaVar.i(i);
        List list = diaVar.g;
        dif difVar = (dif) list.get(did.b(list, i));
        die dieVar = difVar.a;
        int f2 = difVar.f(i);
        djx djxVar = ((dhu) dieVar).b;
        float lineRight = djxVar.e.getLineRight(f2);
        if (f2 == djxVar.f - 1) {
            f = djxVar.i;
        } else {
            f = brg.a;
        }
        return lineRight + f;
    }

    public final float d(int i) {
        return this.b.b(i);
    }

    public final int e() {
        return this.b.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diy)) {
            return false;
        }
        diy diyVar = (diy) obj;
        if (d.F(this.a, diyVar.a) && d.F(this.b, diyVar.b) && a.bB(this.c, diyVar.c) && this.d == diyVar.d && this.e == diyVar.e && d.F(this.f, diyVar.f)) {
            return true;
        }
        return false;
    }

    public final int f(int i, boolean z) {
        int j;
        dia diaVar = this.b;
        diaVar.i(i);
        List list = diaVar.g;
        dif difVar = (dif) list.get(did.b(list, i));
        die dieVar = difVar.a;
        int f = difVar.f(i);
        if (z) {
            djx djxVar = ((dhu) dieVar).b;
            if (djz.c(djxVar.e, f) && djxVar.b == TextUtils.TruncateAt.END) {
                j = djxVar.e.getLineStart(f) + djxVar.e.getEllipsisStart(f);
            } else {
                djo o = djxVar.o();
                j = o.d(o.a.getLineEnd(f), o.a.getLineStart(f));
            }
        } else {
            j = ((dhu) dieVar).b.j(f);
        }
        return difVar.c(j);
    }

    public final int g(int i) {
        int a;
        dia diaVar = this.b;
        if (i >= diaVar.f().a()) {
            a = aqjn.z(diaVar.g);
        } else if (i < 0) {
            a = 0;
        } else {
            a = did.a(diaVar.g, i);
        }
        dif difVar = (dif) diaVar.g.get(a);
        die dieVar = difVar.a;
        return difVar.d(((dhu) dieVar).b.k(difVar.e(i)));
    }

    public final int h(float f) {
        return this.b.c(f);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a.A(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + this.f.hashCode();
    }

    public final int i(int i) {
        dia diaVar = this.b;
        diaVar.i(i);
        List list = diaVar.g;
        dif difVar = (dif) list.get(did.b(list, i));
        die dieVar = difVar.a;
        return difVar.c(((dhu) dieVar).b.m(difVar.f(i)));
    }

    public final int j(long j) {
        return this.b.d(j);
    }

    public final long k(int i) {
        int a;
        int b;
        int a2;
        dia diaVar = this.b;
        diaVar.h(i);
        if (i == diaVar.f().a()) {
            a = aqjn.z(diaVar.g);
        } else {
            a = did.a(diaVar.g, i);
        }
        dif difVar = (dif) diaVar.g.get(a);
        die dieVar = difVar.a;
        int e = difVar.e(i);
        dkg p = ((dhu) dieVar).b.p();
        if (p.h(p.b(e))) {
            p.c(e);
            b = e;
            while (b != -1) {
                if (p.h(b) && !p.e(b)) {
                    break;
                }
                b = p.b(b);
            }
            b = -1;
        } else {
            p.c(e);
            if (p.g(e)) {
                if (p.f(e) && !p.d(e)) {
                    b = e;
                } else {
                    b = p.b(e);
                }
            } else {
                if (p.d(e)) {
                    b = p.b(e);
                }
                b = -1;
            }
        }
        if (b == -1) {
            b = e;
        }
        if (p.e(p.a(e))) {
            p.c(e);
            a2 = e;
            while (a2 != -1) {
                if (!p.h(a2) && p.e(a2)) {
                    break;
                }
                a2 = p.a(a2);
            }
            a2 = -1;
        } else {
            p.c(e);
            if (p.d(e)) {
                if (p.f(e) && !p.g(e)) {
                    a2 = e;
                } else {
                    a2 = p.a(e);
                }
            } else {
                if (p.g(e)) {
                    a2 = p.a(e);
                }
                a2 = -1;
            }
        }
        if (a2 != -1) {
            e = a2;
        }
        long a3 = djd.a(b, e);
        long j = djc.a;
        return difVar.g(a3, false);
    }

    public final cjp l(int i) {
        boolean z;
        float f;
        float f2;
        float e;
        float e2;
        dia diaVar = this.b;
        diaVar.g(i);
        List list = diaVar.g;
        dif difVar = (dif) list.get(did.a(list, i));
        die dieVar = difVar.a;
        int e3 = difVar.e(i);
        if (e3 < 0 || e3 >= ((dhu) dieVar).c.length()) {
            doz.b("offset(" + e3 + ") is out of bounds [0," + ((dhu) dieVar).c.length() + ')');
        }
        djx djxVar = ((dhu) dieVar).b;
        int i2 = e3 + 1;
        int k = djxVar.k(e3);
        float d = djxVar.d(k);
        float c = djxVar.c(k);
        if (djxVar.n(k) == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean isRtlCharAt = djxVar.e.isRtlCharAt(e3);
        if (z && !isRtlCharAt) {
            f = djxVar.e(e3, false);
            f2 = djxVar.e(i2, true);
        } else {
            if (z) {
                e = djxVar.f(e3, false);
                e2 = djxVar.f(i2, true);
            } else if (isRtlCharAt) {
                e = djxVar.e(e3, false);
                e2 = djxVar.e(i2, true);
            } else {
                f = djxVar.f(e3, false);
                f2 = djxVar.f(i2, true);
            }
            float f3 = e2;
            f2 = e;
            f = f3;
        }
        RectF rectF = new RectF(f, d, f2, c);
        return difVar.h(new cjp(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final cjp m(int i) {
        int a;
        dia diaVar = this.b;
        diaVar.h(i);
        if (i == diaVar.f().a()) {
            a = aqjn.z(diaVar.g);
        } else {
            a = did.a(diaVar.g, i);
        }
        dif difVar = (dif) diaVar.g.get(a);
        die dieVar = difVar.a;
        int e = difVar.e(i);
        if (e < 0 || e > ((dhu) dieVar).c.length()) {
            doz.b("offset(" + e + ") is out of bounds [0," + ((dhu) dieVar).c.length() + ']');
        }
        dhu dhuVar = (dhu) dieVar;
        djx djxVar = dhuVar.b;
        float s = djx.s(djxVar, e);
        int k = djxVar.k(e);
        return difVar.h(new cjp(s, djxVar.d(k), s, dhuVar.b.c(k)));
    }

    public final clr n(int i, int i2) {
        dia diaVar = this.b;
        if (i < 0 || i > i2 || i2 > diaVar.f().b.length()) {
            doz.b("Start(" + i + ") or End(" + i2 + ") is out of range [0.." + diaVar.f().b.length() + "), or start > end!");
        }
        byte[] bArr = null;
        if (i == i2) {
            return new cke(bArr);
        }
        cke ckeVar = new cke(bArr);
        List list = diaVar.g;
        long a = djd.a(i, i2);
        long j = djc.a;
        did.d(list, a, new dib(ckeVar, i, i2));
        return ckeVar;
    }

    public final diy o(dix dixVar, long j) {
        return new diy(dixVar, this.b, j);
    }

    public final dqh p(int i) {
        int a;
        dia diaVar = this.b;
        diaVar.h(i);
        if (i == diaVar.f().a()) {
            a = aqjn.z(diaVar.g);
        } else {
            a = did.a(diaVar.g, i);
        }
        dif difVar = (dif) diaVar.g.get(a);
        return difVar.a.j(difVar.e(i));
    }

    public final dqh q(int i) {
        int a;
        dia diaVar = this.b;
        diaVar.h(i);
        if (i == diaVar.f().a()) {
            a = aqjn.z(diaVar.g);
        } else {
            a = did.a(diaVar.g, i);
        }
        dif difVar = (dif) diaVar.g.get(a);
        die dieVar = difVar.a;
        int e = difVar.e(i);
        djx djxVar = ((dhu) dieVar).b;
        if (djxVar.n(djxVar.k(e)) == 1) {
            return dqh.a;
        }
        return dqh.b;
    }

    public final boolean r() {
        dia diaVar = this.b;
        if (!diaVar.b) {
            if (((int) (this.c & 4294967295L)) >= diaVar.d) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean s() {
        if (((int) (this.c >> 32)) >= this.b.c && !r()) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) dri.c(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}
