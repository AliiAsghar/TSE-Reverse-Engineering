package defpackage;

import java.util.logging.Filter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alyk extends alww {
    private static volatile boolean a = false;
    private final Logger b;

    public alyk(Logger logger) {
        this.b = logger;
    }

    private static void f(Logger logger, LogRecord logRecord) {
        Logger parent;
        for (Handler handler : logger.getHandlers()) {
            handler.publish(logRecord);
        }
        if (logger.getUseParentHandlers() && (parent = logger.getParent()) != null) {
            f(parent, logRecord);
        }
    }

    @Override // defpackage.alww
    public final void b(alwv alwvVar) {
        e(new alym(alwvVar, alxu.f(), (byte[]) null), alwvVar.S());
    }

    @Override // defpackage.alww
    public final boolean c(Level level) {
        return this.b.isLoggable(level);
    }

    @Override // defpackage.alww
    public final String d() {
        return this.b.getName();
    }

    public final void e(LogRecord logRecord, boolean z) {
        if (z && !this.b.isLoggable(logRecord.getLevel())) {
            Filter filter = this.b.getFilter();
            if (filter != null) {
                filter.isLoggable(logRecord);
            }
            if (this.b.getClass() != Logger.class && !a) {
                Logger logger = Logger.getLogger(String.valueOf(this.b.getName()).concat(".__forced__"));
                try {
                    logger.setLevel(Level.ALL);
                    logger.log(logRecord);
                    return;
                } catch (SecurityException unused) {
                    a = true;
                    Logger.getLogger("").logp(Level.SEVERE, "com.google.common.flogger.backend.system.AbstractBackend", "forceLoggingViaChildLogger", "Forcing log statements with Flogger has been partially disabled.\nThe Flogger library cannot modify logger log levels, which is necessary to force log statements. This is likely due to an installed SecurityManager.\nForced log statements will still be published directly to log handlers, but will not be visible to the 'log(LogRecord)' method of Logger subclasses.\n");
                    f(this.b, logRecord);
                    return;
                }
            }
            f(this.b, logRecord);
            return;
        }
        this.b.log(logRecord);
    }

    @Override // defpackage.alww
    public final void g(RuntimeException runtimeException, alwv alwvVar) {
        e(new alym(runtimeException, alwvVar, alxu.f()), alwvVar.S());
    }
}
