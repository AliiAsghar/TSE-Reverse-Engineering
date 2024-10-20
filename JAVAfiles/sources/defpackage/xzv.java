package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xzv {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/common/StreamUtil");

    public static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            alvw h = a.h();
            h.X(alwp.a, "Bugle");
            ((alvg) ((alvg) ((alvg) h).g(e)).h("com/google/android/apps/messaging/shared/util/common/StreamUtil", "safeClose", 28, "StreamUtil.java")).t("Unable to close resource %s", yyb.bh(closeable.toString()));
        }
    }

    public static void b(AutoCloseable autoCloseable) {
        if (autoCloseable == null) {
            return;
        }
        try {
            autoCloseable.close();
        } catch (Exception e) {
            alvw h = a.h();
            h.X(alwp.a, "Bugle");
            ((alvg) ((alvg) ((alvg) h).g(e)).h("com/google/android/apps/messaging/shared/util/common/StreamUtil", "safeClose", 42, "StreamUtil.java")).t("Unable to close resource %s", yyb.bh(autoCloseable.toString()));
        }
    }
}
