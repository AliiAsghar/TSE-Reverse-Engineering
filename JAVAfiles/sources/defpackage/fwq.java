package defpackage;

import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwq {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final int h;
    public final eqd i;
    public final int j;
    public final int k;
    public final int l;
    public final String m;
    public final String n;
    public final int o;
    public final fwo p;
    final alog q;

    public fwq(alog alogVar, long j, long j2, int i, int i2, int i3, String str, String str2, int i4, eqd eqdVar, int i5, int i6, int i7, String str3, String str4, int i8, fwo fwoVar) {
        this.q = alogVar;
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = eqdVar;
        this.j = i5;
        this.k = i6;
        this.l = i7;
        this.m = str3;
        this.n = str4;
        this.o = i8;
        this.p = fwoVar;
        a(str2, i8, alogVar, 1);
        a(str4, i8, alogVar, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(String str, int i, List list, int i2) {
        Object obj;
        if (str != null && i != 1) {
            alur it = ((alog) list).iterator();
            char c = 0;
            while (it.hasNext()) {
                ico icoVar = (ico) it.next();
                if (i2 == 1) {
                    obj = icoVar.a;
                } else {
                    obj = icoVar.b;
                }
                if (obj == null) {
                    if (c != 1) {
                        c = 2;
                    } else {
                        return;
                    }
                } else if (c != 2) {
                    c = 1;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwq)) {
            return false;
        }
        fwq fwqVar = (fwq) obj;
        if (Objects.equals(this.q, fwqVar.q) && this.a == fwqVar.a && this.b == fwqVar.b && this.c == fwqVar.c && this.d == fwqVar.d && this.e == fwqVar.e && Objects.equals(this.f, fwqVar.f) && Objects.equals(this.g, fwqVar.g) && this.h == fwqVar.h && Objects.equals(this.i, fwqVar.i) && this.j == fwqVar.j && this.k == fwqVar.k && this.l == fwqVar.l && Objects.equals(this.m, fwqVar.m) && Objects.equals(this.n, fwqVar.n) && this.o == fwqVar.o && Objects.equals(this.p, fwqVar.p)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Objects.hashCode(this.q) * 31;
        String str = this.f;
        return ((((((((((((((((((((((((((((((hashCode + ((int) this.a)) * 31) + ((int) this.b)) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + Objects.hashCode(str)) * 31) + Objects.hashCode(this.g)) * 31) + this.h) * 31) + Objects.hashCode(this.i)) * 31) + this.j) * 31) + this.k) * 31) + this.l) * 31) + Objects.hashCode(this.m)) * 31) + Objects.hashCode(this.n)) * 31) + this.o) * 31) + Objects.hashCode(this.p);
    }
}
