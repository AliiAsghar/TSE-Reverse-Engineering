package defpackage;

import j$.util.Optional;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ywh {
    public static final uuf a = uuh.i(uuh.b, "enable_wear_clearcut_rpc_logging", true);
    public static final amui b = amui.SUCCESS;
    public static final amui c = amui.GMS_ERROR;
    private final armf d;
    private final Optional e;

    public ywh(armf armfVar, Optional optional) {
        armfVar.getClass();
        this.d = armfVar;
        this.e = optional;
    }

    public static /* synthetic */ void d(ywh ywhVar, int i, String str, String str2, amui amuiVar) {
        ywhVar.c(i, str, str2, null, amuiVar);
    }

    public final amui a(Throwable th) {
        if (th instanceof abra) {
            return yzc.e(((abra) th).a());
        }
        if (th instanceof TimeoutException) {
            return amui.TASK_TIMEOUT;
        }
        return amui.CLIENT_FAILURE;
    }

    public final boolean b() {
        Object e = a.e();
        e.getClass();
        return ((Boolean) e).booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0077, code lost:
    
        if (r9.equals("/bugle/rpc/send_message/") == false) goto L140;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r8, java.lang.String r9, java.lang.String r10, j$.time.Duration r11, defpackage.amui r12) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ywh.c(int, java.lang.String, java.lang.String, j$.time.Duration, amui):void");
    }
}
