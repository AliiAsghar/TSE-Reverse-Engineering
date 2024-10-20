package defpackage;

import java.io.UnsupportedEncodingException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wyi {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/sms/DatabaseMessages");

    public static String a(byte[] bArr, int i) {
        if (i != 0) {
            try {
                try {
                    return new String(bArr, gg.a(i));
                } catch (UnsupportedEncodingException unused) {
                    return new String(bArr, "iso-8859-1");
                }
            } catch (UnsupportedEncodingException unused2) {
                return new String(bArr);
            }
        }
        return new String(bArr);
    }

    public static byte[] b(String str, int i) {
        if (i == 0) {
            return str.getBytes();
        }
        try {
            return str.getBytes(gg.a(i));
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }
}
