package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ydp {
    public static final utz a;
    public static final utz b;
    public static final utz c;
    public static final utz d;
    private static final int e;

    static {
        int intValue = Level.INFO.intValue();
        e = intValue;
        a = uuh.e(uuh.b, "flogger_client_logging_minimum_log_level", Level.WARNING.intValue());
        b = uuh.e(uuh.b, "flogger_logs_file_rotation_set_size", 4);
        c = uuh.e(uuh.b, "flogger_logs_file_size_limit", 4194304);
        d = uuh.e(uuh.b, "flogger_logs_file_minimum_log_level", intValue);
    }
}
