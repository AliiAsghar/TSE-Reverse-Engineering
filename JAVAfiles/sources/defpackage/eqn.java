package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqn {
    public static final /* synthetic */ int M = 0;
    public final byte[] A;
    public final int B;
    public final eqd C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    private int N;
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final erk l;
    public final Object m;
    public final String n;
    public final String o;
    public final int p;
    public final int q;
    public final List r;
    public final eqj s;
    public final long t;
    public final boolean u;
    public final int v;
    public final int w;
    public final float x;
    public final int y;
    public final float z;

    static {
        new eqn(new eqm());
        eul.M(0);
        eul.M(1);
        eul.M(2);
        eul.M(3);
        eul.M(4);
        eul.M(5);
        eul.M(6);
        eul.M(7);
        eul.M(8);
        eul.M(9);
        eul.M(10);
        eul.M(11);
        eul.M(12);
        eul.M(13);
        eul.M(14);
        eul.M(15);
        eul.M(16);
        eul.M(17);
        eul.M(18);
        eul.M(19);
        eul.M(20);
        eul.M(21);
        eul.M(22);
        eul.M(23);
        eul.M(24);
        eul.M(25);
        eul.M(26);
        eul.M(27);
        eul.M(28);
        eul.M(29);
        eul.M(30);
        eul.M(31);
        eul.M(32);
        eul.M(33);
    }

    public eqn(eqm eqmVar) {
        boolean z;
        String str;
        this.a = eqmVar.a;
        String O = eul.O(eqmVar.d);
        this.d = O;
        if (eqmVar.c.isEmpty() && eqmVar.b != null) {
            this.c = alog.r(new eqs(O, eqmVar.b));
            this.b = eqmVar.b;
        } else if (!eqmVar.c.isEmpty() && eqmVar.b == null) {
            this.c = eqmVar.c;
            List list = eqmVar.c;
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    eqs eqsVar = (eqs) it.next();
                    if (TextUtils.equals(eqsVar.a, O)) {
                        str = eqsVar.b;
                        break;
                    }
                } else {
                    str = ((eqs) list.get(0)).b;
                    break;
                }
            }
            this.b = str;
        } else {
            if (!eqmVar.c.isEmpty() || eqmVar.b != null) {
                for (int i = 0; i < eqmVar.c.size(); i++) {
                    if (!((eqs) eqmVar.c.get(i)).b.equals(eqmVar.b)) {
                    }
                }
                z = false;
                dzg.d(z);
                this.c = eqmVar.c;
                this.b = eqmVar.b;
            }
            z = true;
            dzg.d(z);
            this.c = eqmVar.c;
            this.b = eqmVar.b;
        }
        this.e = eqmVar.e;
        dzg.e(true, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.f = eqmVar.f;
        this.g = 0;
        int i2 = eqmVar.h;
        this.h = i2;
        int i3 = eqmVar.i;
        this.i = i3;
        this.j = i3 != -1 ? i3 : i2;
        this.k = eqmVar.j;
        this.l = eqmVar.k;
        this.m = null;
        this.n = eqmVar.l;
        this.o = eqmVar.m;
        this.p = eqmVar.n;
        this.q = eqmVar.o;
        List list2 = eqmVar.p;
        this.r = list2 == null ? Collections.emptyList() : list2;
        eqj eqjVar = eqmVar.q;
        this.s = eqjVar;
        this.t = eqmVar.r;
        this.u = eqmVar.s;
        this.v = eqmVar.t;
        this.w = eqmVar.u;
        this.x = eqmVar.v;
        int i4 = eqmVar.w;
        this.y = i4 == -1 ? 0 : i4;
        float f = eqmVar.x;
        this.z = f == -1.0f ? 1.0f : f;
        this.A = eqmVar.y;
        this.B = eqmVar.z;
        this.C = eqmVar.A;
        this.D = eqmVar.B;
        this.E = eqmVar.C;
        this.F = eqmVar.D;
        int i5 = eqmVar.E;
        this.G = i5 == -1 ? 0 : i5;
        int i6 = eqmVar.F;
        this.H = i6 != -1 ? i6 : 0;
        this.I = eqmVar.G;
        this.J = eqmVar.H;
        this.K = -1;
        int i7 = eqmVar.I;
        this.L = (i7 != 0 || eqjVar == null) ? i7 : 1;
    }

    public final int a() {
        int i;
        int i2 = this.v;
        if (i2 == -1 || (i = this.w) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final eqn b(int i) {
        eqm eqmVar = new eqm(this);
        eqmVar.I = i;
        return new eqn(eqmVar);
    }

    public final boolean c(eqn eqnVar) {
        if (this.r.size() != eqnVar.r.size()) {
            return false;
        }
        for (int i = 0; i < this.r.size(); i++) {
            if (!Arrays.equals((byte[]) this.r.get(i), (byte[]) eqnVar.r.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            eqn eqnVar = (eqn) obj;
            int i2 = this.N;
            if ((i2 == 0 || (i = eqnVar.N) == 0 || i2 == i) && this.e == eqnVar.e && this.f == eqnVar.f && this.h == eqnVar.h && this.i == eqnVar.i && this.p == eqnVar.p && this.t == eqnVar.t && this.v == eqnVar.v && this.w == eqnVar.w && this.y == eqnVar.y && this.B == eqnVar.B && this.D == eqnVar.D && this.E == eqnVar.E && this.F == eqnVar.F && this.G == eqnVar.G && this.H == eqnVar.H && this.I == eqnVar.I && this.L == eqnVar.L && Float.compare(this.x, eqnVar.x) == 0 && Float.compare(this.z, eqnVar.z) == 0 && Objects.equals(this.a, eqnVar.a) && Objects.equals(this.b, eqnVar.b) && this.c.equals(eqnVar.c) && Objects.equals(this.k, eqnVar.k) && Objects.equals(this.n, eqnVar.n) && Objects.equals(this.o, eqnVar.o) && Objects.equals(this.d, eqnVar.d) && Arrays.equals(this.A, eqnVar.A) && Objects.equals(this.l, eqnVar.l) && Objects.equals(this.C, eqnVar.C) && Objects.equals(this.s, eqnVar.s) && c(eqnVar) && Objects.equals(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int i = this.N;
        if (i == 0) {
            String str = this.a;
            int i2 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            String str2 = this.b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode7 = ((((hashCode + 527) * 31) + hashCode2) * 31) + this.c.hashCode();
            String str3 = this.d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i3 = ((((((((((hashCode7 * 31) + hashCode3) * 31) + this.e) * 31) + this.f) * 961) + this.h) * 31) + this.i) * 31;
            String str4 = this.k;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i4 = (i3 + hashCode4) * 31;
            erk erkVar = this.l;
            if (erkVar == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = erkVar.hashCode();
            }
            int i5 = (i4 + hashCode5) * 961;
            String str5 = this.n;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i6 = (i5 + hashCode6) * 31;
            String str6 = this.o;
            if (str6 != null) {
                i2 = str6.hashCode();
            }
            int floatToIntBits = ((((((((((((((((((((((((((((((((((i6 + i2) * 31) + this.p) * 31) + ((int) this.t)) * 31) + this.v) * 31) + this.w) * 31) + Float.floatToIntBits(this.x)) * 31) + this.y) * 31) + Float.floatToIntBits(this.z)) * 31) + this.B) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) - 1) * 31) - 1) * 31) + this.L;
            this.N = floatToIntBits;
            return floatToIntBits;
        }
        return i;
    }

    public final String toString() {
        return "Format(" + this.a + ", " + this.b + ", " + this.n + ", " + this.o + ", " + this.k + ", " + this.j + ", " + this.d + ", [" + this.v + ", " + this.w + ", " + this.x + ", " + String.valueOf(this.C) + "], [" + this.D + ", " + this.E + "])";
    }
}
