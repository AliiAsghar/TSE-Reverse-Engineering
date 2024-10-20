package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asvf {
    protected final int[] a;

    public asvf(int[] iArr) {
        this.a = (int[]) iArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asvf)) {
            return false;
        }
        return Arrays.equals(this.a, ((asvf) obj).a);
    }

    public final int hashCode() {
        return atow.N(this.a);
    }
}
