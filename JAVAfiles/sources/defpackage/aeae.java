package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeae extends adcx {
    public final int a;
    private final byte[] b;
    private final aefi c;

    public aeae() {
        this(0, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeae)) {
            return false;
        }
        aeae aeaeVar = (aeae) obj;
        if (this.a == aeaeVar.a && d.F(this.b, aeaeVar.b) && d.F(this.c, aeaeVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.a;
        int i2 = 0;
        if (i == 0) {
            i = 0;
        } else {
            a.bm(i);
        }
        byte[] bArr = this.b;
        if (bArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(bArr);
        }
        int i3 = i * 31;
        aefi aefiVar = this.c;
        if (aefiVar != null) {
            i2 = aefiVar.hashCode();
        }
        return ((i3 + hashCode) * 31) + i2;
    }

    public aeae(int i, byte[] bArr, aefi aefiVar) {
        super(null, null);
        this.a = i;
        this.b = bArr;
        this.c = aefiVar;
    }

    public /* synthetic */ aeae(int i, int i2) {
        this(1 == (i2 & 1) ? 0 : i, null, null);
    }
}
