package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afdx {
    public final String[] a;

    public /* synthetic */ afdx(String[] strArr) {
        this.a = strArr;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof afdx) && d.F(this.a, ((afdx) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return "MetadataProjection(names=" + Arrays.toString(this.a) + ")";
    }
}
