package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class astn {
    private final byte[] a;
    private final int b;

    public astn(byte[] bArr, int i) {
        this.a = atow.O(bArr);
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof astn) {
            astn astnVar = (astn) obj;
            if (astnVar.b == this.b) {
                return Arrays.equals(this.a, astnVar.a);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ atow.M(this.a);
    }
}
