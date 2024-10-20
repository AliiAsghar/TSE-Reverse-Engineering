package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aobg implements anng {
    private final byte[] a;

    public aobg(byte[] bArr) {
        if (anme.z(1)) {
            if (bArr.length == 32) {
                byte[] f = ansu.f(bArr);
                this.a = f;
                ansu.g(f);
                return;
            }
            throw new IllegalArgumentException(String.format("Given private key's length is not %s", 32));
        }
        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
    }
}
