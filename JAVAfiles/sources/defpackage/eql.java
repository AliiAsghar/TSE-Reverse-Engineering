package defpackage;

import android.util.SparseBooleanArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eql {
    private final SparseBooleanArray a;

    public eql(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int i) {
        dzg.f(i, b());
        return this.a.keyAt(i);
    }

    public final int b() {
        return this.a.size();
    }

    public final boolean c(int i) {
        return this.a.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eql)) {
            return false;
        }
        int i = eul.a;
        return this.a.equals(((eql) obj).a);
    }

    public final int hashCode() {
        int i = eul.a;
        return this.a.hashCode();
    }
}
