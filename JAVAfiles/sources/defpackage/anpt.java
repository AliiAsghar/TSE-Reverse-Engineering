package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class anpt extends ThreadLocal {
    protected static final Cipher a() {
        try {
            Cipher cipher = (Cipher) aobo.a.a("ChaCha20-Poly1305");
            if (!anpu.e(cipher)) {
                return null;
            }
            return cipher;
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
