package defpackage;

import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class ablh implements abqy {
    public static final ablh a = new ablh(new ablg());
    public final String b = null;
    public final boolean c;
    public final String d;

    public ablh(ablg ablgVar) {
        this.c = ablgVar.a.booleanValue();
        this.d = ablgVar.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ablh)) {
            return false;
        }
        ablh ablhVar = (ablh) obj;
        String str = ablhVar.b;
        if (d.B(null, null) && this.c == ablhVar.c && d.B(this.d, ablhVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.c), this.d});
    }
}
