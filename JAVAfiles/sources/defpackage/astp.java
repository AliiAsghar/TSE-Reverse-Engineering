package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class astp {
    public final byte[] a;
    public final int b;

    public astp(byte[] bArr, int i) {
        this.a = atow.O(bArr);
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof astp) {
            astp astpVar = (astp) obj;
            if (astpVar.b == this.b) {
                return Arrays.equals(this.a, astpVar.a);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ atow.M(this.a);
    }
}
