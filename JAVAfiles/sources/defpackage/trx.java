package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class trx {
    public static final ContentType a = ajru.i;

    public static boolean a(String str, String str2) {
        if (str == null || str2 == null || !"encrypted_file".equals(str) || !a.f(str2)) {
            return false;
        }
        return true;
    }
}
