package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxv {
    public final List a;
    public final int b;
    public final int c;
    public final boolean d;

    public kxv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kxv) {
            kxv kxvVar = (kxv) obj;
            if (this.a.equals(kxvVar.a) && this.b == kxvVar.b && this.c == kxvVar.c && this.d == kxvVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ 1000003;
        if (true != this.d) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((((hashCode * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ i;
    }

    public final String toString() {
        return "InitialQueryResult{getList=" + this.a.toString() + ", getPosition=" + this.b + ", getTotalCount=" + this.c + ", wasQueryCancelled=" + this.d + "}";
    }

    public kxv(List list, int i, int i2, boolean z) {
        if (list == null) {
            throw new NullPointerException("Null getList");
        }
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = z;
    }
}
