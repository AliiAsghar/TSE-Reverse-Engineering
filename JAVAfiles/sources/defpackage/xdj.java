package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xdj {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/tachygram/bindings/TachygramFlogger");

    public static final void a(anjt anjtVar) {
        Level level;
        int i = anjtVar.e;
        alvi alviVar = a;
        if (i != 0) {
            int i2 = i - 1;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        level = Level.FINEST;
                    } else {
                        level = Level.INFO;
                    }
                } else {
                    level = Level.WARNING;
                }
            } else {
                level = Level.SEVERE;
            }
            alvg a2 = alviVar.a(level);
            a2.X(alwp.a, "tachygram");
            alvg alvgVar = (alvg) a2.g((Throwable) anjtVar.c.orElse(null));
            alvgVar.X(ydl.e, (String) anjtVar.b.orElse(null));
            alvgVar.X(ydl.w, (String) anjtVar.d.orElse(null));
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/tachygram/bindings/TachygramFlogger", "log", 34, "TachygramFlogger.java")).t("TachygramLogger: %s", anjtVar.a);
            return;
        }
        throw null;
    }
}
