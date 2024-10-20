package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anqd implements anmr {
    private final /* synthetic */ int a;

    public anqd(atii atiiVar, int i) {
        this.a = i;
        if (atiiVar.i()) {
            antn.a.a();
            anme.E(atiiVar);
        }
    }

    public static anmr c(aocj aocjVar) {
        return new anqd(aocjVar.c(), 0);
    }

    public static boolean d() {
        if (anpu.c() != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.anmr
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    @Override // defpackage.anmr
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    public anqd(byte[] bArr, int i) {
        this.a = i;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
    }

    public anqd(byte[] bArr, aocj aocjVar, int i) {
        this.a = i;
        new aobv(bArr);
        aocjVar.c();
    }

    public anqd(byte[] bArr, int i, byte[] bArr2) {
        this.a = i;
        if (anme.z(1)) {
            if (d()) {
                if (bArr.length != 32) {
                    throw new InvalidKeyException("The key length in bytes must be 32.");
                }
                return;
            }
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public anqd(byte[] bArr, int i, char[] cArr) {
        this.a = i;
        new anpz(bArr);
    }

    public anqd(byte[] bArr, int i, short[] sArr) {
        this.a = i;
        new anqc(bArr);
    }
}
