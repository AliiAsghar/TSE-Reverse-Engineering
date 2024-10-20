package defpackage;

import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anek {
    private final String a;
    private volatile Logger b;
    private final arre c = new arre();

    public anek(Class cls) {
        this.a = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.b;
        if (logger != null) {
            return logger;
        }
        synchronized (this.c) {
            Logger logger2 = this.b;
            if (logger2 != null) {
                return logger2;
            }
            Logger logger3 = Logger.getLogger(this.a);
            this.b = logger3;
            return logger3;
        }
    }
}
