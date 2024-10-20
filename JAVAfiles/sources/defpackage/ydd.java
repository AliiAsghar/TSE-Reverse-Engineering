package defpackage;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ydd {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/encryption/KeyStoreUtils");

    public static String a(String str) {
        try {
            StringBuilder sb = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(str.getBytes())).toString(16));
            while (sb.length() < 32) {
                sb.insert(0, "0");
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            alvw h = a.h();
            h.X(alwp.a, "Bugle");
            ((alvg) ((alvg) h).h("com/google/android/apps/messaging/shared/util/encryption/KeyStoreUtils", "getSha1HashedString", 31, "KeyStoreUtils.java")).q("Exception while getting SHA value for message");
            return "";
        }
    }
}
