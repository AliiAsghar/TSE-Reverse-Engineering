package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erh {
    public static final erh a = new erh(new erg());
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final byte[] g;
    public final Integer h;
    public final Integer i;
    public final Integer j;

    @Deprecated
    public final Integer k;
    public final Boolean l;

    @Deprecated
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Integer r;
    public final Integer s;
    public final CharSequence t;
    public final CharSequence u;
    public final CharSequence v;
    public final CharSequence w;
    public final CharSequence x;
    public final Integer y;
    public final alog z;

    static {
        eul.M(0);
        eul.M(1);
        eul.M(2);
        eul.M(3);
        eul.M(4);
        eul.M(5);
        eul.M(6);
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
        eul.M(1000);
    }

    public erh(erg ergVar) {
        Boolean bool = ergVar.k;
        Integer num = ergVar.j;
        Integer num2 = ergVar.w;
        int i = 1;
        int i2 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    num = Integer.valueOf(i);
                }
                i = 0;
                num = Integer.valueOf(i);
            }
        } else if (num != null) {
            boolean z = num.intValue() != -1;
            bool = Boolean.valueOf(z);
            bool.getClass();
            if (z && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                num2 = Integer.valueOf(i2);
            }
        } else {
            num = null;
        }
        this.b = ergVar.a;
        this.c = ergVar.b;
        this.d = ergVar.c;
        this.e = ergVar.d;
        this.f = ergVar.e;
        this.g = ergVar.f;
        this.h = ergVar.g;
        this.i = ergVar.h;
        this.j = ergVar.i;
        this.k = num;
        this.l = bool;
        Integer num3 = ergVar.l;
        this.m = num3;
        this.n = num3;
        this.o = ergVar.m;
        this.p = ergVar.n;
        this.q = ergVar.o;
        this.r = ergVar.p;
        this.s = ergVar.q;
        this.t = ergVar.r;
        this.u = ergVar.s;
        this.v = ergVar.t;
        this.w = ergVar.u;
        this.x = ergVar.v;
        this.y = num2;
        this.z = ergVar.x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            erh erhVar = (erh) obj;
            if (Objects.equals(this.b, erhVar.b) && Objects.equals(this.c, erhVar.c) && Objects.equals(this.d, erhVar.d) && Objects.equals(this.e, erhVar.e) && Objects.equals(null, null) && Objects.equals(null, null) && Objects.equals(this.f, erhVar.f) && Objects.equals(null, null) && Objects.equals(null, null) && Objects.equals(null, null) && Arrays.equals(this.g, erhVar.g) && Objects.equals(this.h, erhVar.h) && Objects.equals(null, null) && Objects.equals(this.i, erhVar.i) && Objects.equals(this.j, erhVar.j) && Objects.equals(this.k, erhVar.k) && Objects.equals(this.l, erhVar.l) && Objects.equals(null, null) && Objects.equals(this.n, erhVar.n) && Objects.equals(this.o, erhVar.o) && Objects.equals(this.p, erhVar.p) && Objects.equals(this.q, erhVar.q) && Objects.equals(this.r, erhVar.r) && Objects.equals(this.s, erhVar.s) && Objects.equals(this.t, erhVar.t) && Objects.equals(this.u, erhVar.u) && Objects.equals(this.v, erhVar.v) && Objects.equals(null, null) && Objects.equals(null, null) && Objects.equals(this.w, erhVar.w) && Objects.equals(null, null) && Objects.equals(this.x, erhVar.x) && Objects.equals(this.y, erhVar.y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, null, null, this.f, null, null, null, Integer.valueOf(Arrays.hashCode(this.g)), this.h, null, this.i, this.j, this.k, this.l, null, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, null, null, this.w, null, this.x, this.y, true});
    }
}
