package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class arrd implements Serializable, arrl {
    private final Class a;
    protected final Object b;
    private final String c;
    private final String d;
    private final boolean e;
    private final int f;
    private final int g;

    public arrd(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.b = obj;
        this.a = cls;
        this.c = str;
        this.d = str2;
        this.e = 1 == (i2 & 1);
        this.f = i;
        this.g = i2 >> 1;
    }

    @Override // defpackage.arrl
    public final int dO() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arrd)) {
            return false;
        }
        arrd arrdVar = (arrd) obj;
        if (this.e == arrdVar.e && this.f == arrdVar.f && this.g == arrdVar.g && d.F(this.b, arrdVar.b) && d.F(this.a, arrdVar.a) && this.c.equals(arrdVar.c) && this.d.equals(arrdVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.b.hashCode() * 31) + this.a.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        if (true != this.e) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((((hashCode * 31) + i) * 31) + this.f) * 31) + this.g;
    }

    public final String toString() {
        return arrn.a(this);
    }

    public arrd(int i, Class cls, String str, String str2, int i2) {
        this(i, arrf.d, cls, str, str2, i2);
    }
}
