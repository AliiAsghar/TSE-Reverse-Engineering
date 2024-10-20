package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anqi {
    public static final Logger a = Logger.getLogger(anqi.class.getName());
    private static final AtomicBoolean b = new AtomicBoolean(false);

    private anqi() {
    }

    public static boolean a() {
        if (b.get()) {
            return true;
        }
        return false;
    }
}
