package defpackage;

import j$.util.DesugarArrays;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uot {
    public static final uuf a;
    public final xnv b;
    public final uop c;
    public final Object d = new Object();
    public alms e = new alms(((Integer) a.e()).intValue());

    static {
        int i;
        ahtn ahtnVar = uuh.b;
        if (true != xyp.d()) {
            i = 100;
        } else {
            i = 5000;
        }
        a = uuh.k(ahtnVar, "WorkQueueDebugHistoryCount", i);
    }

    public uot(xnv xnvVar, uop uopVar) {
        this.b = xnvVar;
        this.c = uopVar;
    }

    public static long a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return 0L;
        }
        return Arrays.hashCode(DesugarArrays.stream(stackTraceElementArr).map(new unt(5)).toArray());
    }

    public static String b(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return "EXECUTION_RESULT";
                        }
                        return "INITIATE_HANDLER_EXECUTION";
                    }
                    return "JANITOR_DISCOVER";
                }
                return "SUBMIT_TO_WORK_MANAGER";
            }
            return "SUBMIT_TO_EXECUTOR";
        }
        return "WORK_MANAGER_WORK_STARTED";
    }
}
