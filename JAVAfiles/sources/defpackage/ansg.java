package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ansg implements anmu {
    private final anmu a;
    private final byte[] b;

    public ansg(anmu anmuVar, byte[] bArr) {
        this.a = anmuVar;
        this.b = bArr;
    }

    @Override // defpackage.anmu
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.b;
        if (bArr3.length == 0) {
            return this.a.a(bArr, bArr2);
        }
        if (anuk.e(bArr3, bArr)) {
            byte[] bArr4 = this.b;
            return this.a.a(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
    }
}
