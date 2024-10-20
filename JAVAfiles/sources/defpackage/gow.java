package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gow implements Comparable {
    public static final gow a;
    public final int b;
    public final int c;
    public final int d;
    private final String e;
    private final arml f = armd.a(new gov(this, 0));

    static {
        new gow(0, 0, 0, "");
        a = new gow(0, 1, 0, "");
        new gow(1, 0, 0, "");
    }

    public gow(int i, int i2, int i3, String str) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str;
    }

    private final BigInteger b() {
        Object a2 = this.f.a();
        a2.getClass();
        return (BigInteger) a2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(gow gowVar) {
        gowVar.getClass();
        return b().compareTo(gowVar.b());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gow)) {
            return false;
        }
        gow gowVar = (gow) obj;
        if (this.b != gowVar.b || this.c != gowVar.c || this.d != gowVar.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.b + 527) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        String str;
        if (!arsd.M(this.e)) {
            str = "-" + this.e;
        } else {
            str = "";
        }
        return this.b + '.' + this.c + '.' + this.d + str;
    }
}
