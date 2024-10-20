package defpackage;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ansp implements annc {
    public static final Object a = new Object();

    @Override // defpackage.annc
    public final anmr a(String str) {
        anso ansoVar;
        try {
            synchronized (a) {
                ansoVar = new anso(aoci.e(str));
                byte[] b = anud.b(10);
                byte[] bArr = new byte[0];
                if (!Arrays.equals(b, ansoVar.a(ansoVar.b(b, bArr), bArr))) {
                    throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                }
            }
            return ansoVar;
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }

    @Override // defpackage.annc
    public final boolean b(String str) {
        if (str.toLowerCase(Locale.US).startsWith("android-keystore://")) {
            return true;
        }
        return false;
    }
}
