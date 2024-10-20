package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class anrk implements anmu {
    private final atii a;

    public anrk(atii atiiVar) {
        this.a = atiiVar;
        if (atiiVar.i()) {
            antn.a.a();
            anme.E(atiiVar);
        }
    }

    @Override // defpackage.anmu
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 5) {
            for (anty antyVar : this.a.g(Arrays.copyOfRange(bArr, 0, 5))) {
                try {
                    byte[] a = ((anmu) antyVar.a).a(bArr, bArr2);
                    int i = antyVar.d;
                    int length = bArr.length;
                    return a;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (anty antyVar2 : this.a.h()) {
            try {
                byte[] a2 = ((anmu) antyVar2.a).a(bArr, bArr2);
                int i2 = antyVar2.d;
                int length2 = bArr.length;
                return a2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
