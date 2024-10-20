package defpackage;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jv implements Comparable {
    public final ResolveInfo a;
    public float b;

    public jv(ResolveInfo resolveInfo) {
        this.a = resolveInfo;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Float.floatToIntBits(((jv) obj).b) - Float.floatToIntBits(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && Float.floatToIntBits(this.b) == Float.floatToIntBits(((jv) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + 31;
    }

    public final String toString() {
        return "[resolveInfo:" + this.a.toString() + "; weight:" + new BigDecimal(this.b) + "]";
    }
}
