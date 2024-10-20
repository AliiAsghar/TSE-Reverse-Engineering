package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class anqg extends ThreadLocal {
    protected static final Cipher a() {
        try {
            Cipher cipher = (Cipher) aobo.a.a("AES/GCM-SIV/NoPadding");
            if (!anqh.c(cipher)) {
                return null;
            }
            return cipher;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
