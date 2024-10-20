package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class arst {
    public static final arss a = new arss();
    public static final arst b;

    static {
        arst arsvVar;
        if (arqb.a != null && arqb.a.intValue() < 34) {
            arsvVar = new arsq();
        } else {
            arsvVar = new arsv();
        }
        b = arsvVar;
    }

    public abstract int a(int i);

    public int b() {
        throw null;
    }

    public long c() {
        return (b() << 32) + b();
    }

    public int e() {
        throw null;
    }

    public long f(long j) {
        long a2;
        int b2;
        long c;
        long j2;
        if (j > 0) {
            if (((-j) & j) == j) {
                long j3 = j >>> 32;
                int i = (int) j;
                if (i != 0) {
                    b2 = a(arrj.b(i));
                } else {
                    if (((int) j3) == 1) {
                        b2 = b();
                    } else {
                        a2 = (a(arrj.b(r11)) << 32) + (b() & 4294967295L);
                        return a2;
                    }
                }
                a2 = b2 & 4294967295L;
                return a2;
            }
            do {
                c = c() >>> 1;
                j2 = c % j;
            } while ((c - j2) + (-1) + j < 0);
            return j2;
        }
        throw new IllegalArgumentException(arrj.d(0L, Long.valueOf(j)));
    }

    public long ha(long j) {
        return f(j);
    }
}
