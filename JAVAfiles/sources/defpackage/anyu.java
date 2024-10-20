package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class anyu implements annh {
    private final atii a;

    public anyu(atii atiiVar) {
        this.a = atiiVar;
        if (atiiVar.i()) {
            antn.a.a();
            anme.E(atiiVar);
        }
    }

    @Override // defpackage.annh
    public final void a(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 5) {
            for (anty antyVar : this.a.g(Arrays.copyOf(bArr, 5))) {
                try {
                    ((annh) antyVar.a).a(bArr, bArr2);
                    int i = antyVar.d;
                    int length = bArr2.length;
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            for (anty antyVar2 : this.a.h()) {
                try {
                    ((annh) antyVar2.a).a(bArr, bArr2);
                    int i2 = antyVar2.d;
                    int length2 = bArr2.length;
                    return;
                } catch (GeneralSecurityException unused2) {
                }
            }
            throw new GeneralSecurityException("invalid signature");
        }
        throw new GeneralSecurityException("signature too short");
    }
}
