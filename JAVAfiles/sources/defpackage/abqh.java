package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abqh extends abqg {
    public final byte[] a;

    public abqh(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.a = bArr;
    }

    @Override // defpackage.abqg
    public final byte[] c() {
        return this.a;
    }
}
