package defpackage;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqzz {
    static final Logger a = Logger.getLogger(aqrt.class.getName());
    public final Object b = new Object();
    public final aqtf c;

    public aqzz(aqtf aqtfVar, long j, String str) {
        aqtfVar.getClass();
        this.c = aqtfVar;
        atcz atczVar = new atcz();
        atczVar.a = str.concat(" created");
        atczVar.b = aqsz.CT_INFO;
        atczVar.b(j);
        b(atczVar.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(aqtf aqtfVar, Level level, String str) {
        Logger logger = a;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + aqtfVar.toString() + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(aqta aqtaVar) {
        Level level;
        int ordinal = aqtaVar.b.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                level = Level.FINEST;
            } else {
                level = Level.FINE;
            }
        } else {
            level = Level.FINER;
        }
        synchronized (this.b) {
        }
        a(this.c, level, aqtaVar.a);
    }
}
