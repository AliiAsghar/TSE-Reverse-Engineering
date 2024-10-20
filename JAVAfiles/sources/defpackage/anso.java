package defpackage;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.ProviderException;
import javax.crypto.BadPaddingException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anso implements anmr {
    private static final String a = "anso";
    private final anmr b;

    public anso(String str) {
        this.b = new ansn(str, anme.y());
    }

    private static void c() {
        try {
            Thread.sleep((int) (Math.random() * 100.0d));
        } catch (InterruptedException unused) {
        }
    }

    @Override // defpackage.anmr
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            return this.b.a(bArr, bArr2);
        } catch (GeneralSecurityException e) {
            e = e;
            Log.w(a, "encountered a potentially transient KeyStore error, will wait and retry", e);
            c();
            return this.b.a(bArr, bArr2);
        } catch (ProviderException e2) {
            e = e2;
            Log.w(a, "encountered a potentially transient KeyStore error, will wait and retry", e);
            c();
            return this.b.a(bArr, bArr2);
        } catch (BadPaddingException e3) {
            throw e3;
        }
    }

    @Override // defpackage.anmr
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            return this.b.b(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w(a, "encountered a potentially transient KeyStore error, will wait and retry", e);
            c();
            return this.b.b(bArr, bArr2);
        }
    }
}
