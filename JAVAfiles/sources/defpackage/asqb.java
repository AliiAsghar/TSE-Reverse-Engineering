package defpackage;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asqb extends Handler {
    public static final asqb a = new asqb();

    private asqb() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int i;
        int min;
        logRecord.getClass();
        CopyOnWriteArraySet copyOnWriteArraySet = asqa.a;
        String loggerName = logRecord.getLoggerName();
        loggerName.getClass();
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            i = 5;
        } else if (logRecord.getLevel().intValue() == Level.INFO.intValue()) {
            i = 4;
        } else {
            i = 3;
        }
        String message = logRecord.getMessage();
        message.getClass();
        Throwable thrown = logRecord.getThrown();
        String str = (String) asqa.b.get(loggerName);
        if (str == null) {
            str = arsd.ah(loggerName, 23);
        }
        if (Log.isLoggable(str, i)) {
            if (thrown != null) {
                message = message + "\n" + Log.getStackTraceString(thrown);
            }
            int i2 = 0;
            while (true) {
                int length = message.length();
                if (i2 < length) {
                    int S = arsd.S(message, '\n', i2, 4);
                    if (S != -1) {
                        length = S;
                    }
                    while (true) {
                        min = Math.min(length, i2 + 4000);
                        String substring = message.substring(i2, min);
                        substring.getClass();
                        Log.println(i, str, substring);
                        if (min >= length) {
                            break;
                        } else {
                            i2 = min;
                        }
                    }
                    i2 = min + 1;
                } else {
                    return;
                }
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
