package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abpq implements abqy {
    public final int a;
    public final int b;

    public abpq(abpp abppVar) {
        this.a = abppVar.a;
        this.b = abppVar.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof abpq)) {
            return false;
        }
        abpq abpqVar = (abpq) obj;
        if (this.a == abpqVar.a && this.b == abpqVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }
}
