package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kft {
    public final List a;
    public final int b;
    public final int c;

    public kft(List list, int i, int i2) {
        list.getClass();
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kft)) {
            return false;
        }
        kft kftVar = (kft) obj;
        if (d.F(this.a, kftVar.a) && this.b == kftVar.b && this.c == kftVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "LoadResultInternal(list=" + this.a + ", itemsBefore=" + this.b + ", itemsAfter=" + this.c + ")";
    }
}
