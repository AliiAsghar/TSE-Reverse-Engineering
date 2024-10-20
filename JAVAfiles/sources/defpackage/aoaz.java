package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.SecretKey;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoaz implements anmr {
    public final SecretKey a;
    public final byte[] b;

    public aoaz(byte[] bArr, aocj aocjVar) {
        if (anme.z(2)) {
            this.a = anpq.d(bArr);
            this.b = aocjVar.c();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // defpackage.anmr
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    @Override // defpackage.anmr
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
