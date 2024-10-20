package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pxl {
    public static final alwo a = alwo.o("BugleFileTransfer");

    public static String a(String... strArr) {
        int i = ambp.a;
        return ambm.a.b(TextUtils.join(":", strArr).getBytes()).toString();
    }

    public static String b(String str) {
        return a.bW(str, "\"", "\"");
    }
}
