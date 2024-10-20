package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.IllegalFormatException;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class advr {
    public static String a = "CarrierServices";
    private static boolean g;
    private static boolean h;
    private static boolean i;
    private static final alvi d = alvi.m("com/google/android/ims/util/log/CarrierServicesLog");
    public static final advp b = new advp("");
    private static final String e = advr.class.getName();
    private static final AtomicReference f = new AtomicReference();
    public static int c = 4;

    private advr() {
    }

    @Deprecated
    public static String a(Object obj) {
        return advq.UNKNOWN.c(obj);
    }

    public static String b(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (Log.isLoggable(a, 3)) {
            return obj.toString();
        }
        return "Redacted-" + obj.toString().length() + "-chars";
    }

    @Deprecated
    public static void c(String str, Object... objArr) {
        n(3, b, null, str, objArr);
    }

    public static void d(advp advpVar, String str, Object... objArr) {
        n(3, advpVar, null, str, objArr);
    }

    @Deprecated
    public static void e(Throwable th, String str, Object... objArr) {
        n(3, b, th, str, objArr);
    }

    public static void f(PrintWriter printWriter) {
        advv advvVar = (advv) f.get();
        if (advvVar != null) {
            advvVar.a(printWriter);
        }
    }

    @Deprecated
    public static void g(String str, Object... objArr) {
        n(6, b, null, str, objArr);
    }

    public static void h(advp advpVar, String str, Object... objArr) {
        n(6, advpVar, null, str, objArr);
    }

    @Deprecated
    public static void i(Throwable th, String str, Object... objArr) {
        n(6, b, th, str, objArr);
    }

    public static void j(Throwable th, advp advpVar, String str, Object... objArr) {
        n(6, advpVar, th, str, objArr);
    }

    @Deprecated
    public static void k(String str, Object... objArr) {
        n(4, b, null, str, objArr);
    }

    public static void l(advp advpVar, String str, Object... objArr) {
        n(4, advpVar, null, str, objArr);
    }

    public static void m(advp advpVar, String str, Object... objArr) {
        adru adruVar = new adru(4);
        if (((Boolean) acpy.h.a()).booleanValue()) {
            p(advpVar, str, objArr);
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            for (Thread thread : allStackTraces.keySet()) {
                if (d$$ExternalSyntheticApiModelOutline0.m(adruVar, thread)) {
                    p(advpVar, "Thread: %s, ", thread);
                    StackTraceElement[] stackTraceElementArr = allStackTraces.get(thread);
                    StringBuilder sb = new StringBuilder();
                    for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                        sb.append("at ");
                        sb.append(stackTraceElement);
                        sb.append("\n");
                    }
                    p(advpVar, "stack: %s", sb.toString());
                }
            }
        }
    }

    public static void n(int i2, advp advpVar, Throwable th, String str, Object... objArr) {
        StackTraceElement stackTraceElement;
        String str2;
        Level level;
        if (!Log.isLoggable(a, i2)) {
            return;
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i3 = 1;
        while (true) {
            if (i3 < stackTrace.length) {
                stackTraceElement = stackTrace[i3];
                String className = stackTraceElement.getClassName();
                if (!className.equals(e) && !className.endsWith("Log")) {
                    break;
                } else {
                    i3++;
                }
            } else {
                stackTraceElement = new StackTraceElement("<unknown>", "<unknown>", "<unknown>", 0);
                break;
            }
        }
        if (advpVar != b && advpVar != null) {
            str2 = advpVar.a;
        } else {
            str2 = null;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 != 6 && i2 != Integer.MAX_VALUE) {
                        level = Level.FINEST;
                    } else {
                        level = Level.SEVERE;
                    }
                } else {
                    level = Level.WARNING;
                }
            } else {
                level = Level.INFO;
            }
        } else {
            level = Level.FINE;
        }
        try {
            alvg a2 = d.a(level);
            a2.X(alwp.a, a);
            a2.X(ydl.O, str2);
            a2.X(ydl.K, Long.valueOf(Thread.currentThread().getId()));
            ((alvg) ((alvg) ((alvg) a2.h(stackTraceElement.getClassName(), stackTraceElement.getMethodName(), stackTraceElement.getLineNumber(), null)).g(th)).h("com/google/android/ims/util/log/CarrierServicesLog", "logWithFlogger", 510, "CarrierServicesLog.java")).Q(str, objArr);
        } catch (IllegalFormatException e2) {
            alvi alviVar = d;
            alvg alvgVar = (alvg) alviVar.h();
            alvgVar.X(alwp.a, a);
            alvgVar.X(ydl.O, str2);
            ((alvg) alvgVar.h(stackTraceElement.getClassName(), stackTraceElement.getMethodName(), stackTraceElement.getLineNumber(), null)).q(str);
            alvg alvgVar2 = (alvg) alviVar.h();
            alvgVar2.X(alwp.a, a);
            alvgVar2.X(ydl.O, str2);
            ((alvg) ((alvg) alvgVar2.g(e2)).h("com/google/android/ims/util/log/CarrierServicesLog", "logWithFlogger", 527, "CarrierServicesLog.java")).q("IllegalFormatException while formatting logging.");
        }
    }

    @Deprecated
    public static void o(String str, Object... objArr) {
        n(2, b, null, str, objArr);
    }

    public static void p(advp advpVar, String str, Object... objArr) {
        n(2, advpVar, null, str, objArr);
    }

    @Deprecated
    public static void q(String str, Object... objArr) {
        n(5, b, null, str, objArr);
    }

    public static void r(advp advpVar, String str, Object... objArr) {
        n(5, advpVar, null, str, objArr);
    }

    @Deprecated
    public static void s(Throwable th, String str, Object... objArr) {
        n(5, b, th, str, objArr);
    }

    public static void t(Throwable th, advp advpVar, String str, Object... objArr) {
        n(5, advpVar, th, str, objArr);
    }

    @Deprecated
    public static void u(String str, Object... objArr) {
        n(Integer.MAX_VALUE, b, null, str, objArr);
    }

    public static boolean v() {
        if (c <= 3) {
            return true;
        }
        return false;
    }

    public static void w(int i2, int i3, String str, Object... objArr) {
        String str2;
        if (!TextUtils.isEmpty((CharSequence) acpy.j.a())) {
            switch (i2) {
                case 1:
                    str2 = "EVENT_SENT_VIA_EVENT_HUB";
                    break;
                case 2:
                    str2 = "IMDN_REPORT_PAGER_MSG_QUEUED";
                    break;
                case 3:
                    str2 = "IMDN_REPORT_PAGER_MSG_SENDING";
                    break;
                case 4:
                    str2 = "IMDN_REPORT_PAGER_RESPONSE_RECEIVED";
                    break;
                case 5:
                    str2 = "IMDN_REPORT_PAGER_MSG_CREATED";
                    break;
                case 6:
                    str2 = "IMDN_REPORT_PAGER_MSG_RECEIVED";
                    break;
                case 7:
                    str2 = "INTENT_SENT_TO_BUGLE";
                    break;
                case 8:
                    str2 = "MSRP_CONNECTION_ESTABLISHED";
                    break;
                case 9:
                    str2 = "MSRP_CONNECTION_DISCONNECTED";
                    break;
                case 10:
                    str2 = "MSRP_INIT_MSG_QUEUED";
                    break;
                case 11:
                    str2 = "MSRP_MSG_CANCELLED";
                    break;
                case 12:
                    str2 = "MSRP_MSG_GENERATED";
                    break;
                case 13:
                    str2 = "MSRP_MSG_QUEUED";
                    break;
                case 14:
                    str2 = "MSRP_MSG_RESPONSE_RECEIVED";
                    break;
                case 15:
                    str2 = "MSRP_MSG_SENDING";
                    break;
                case 16:
                    str2 = "MSRP_MSG_SENT";
                    break;
                case 17:
                    str2 = "MSRP_MSG_RECEIVED";
                    break;
                case 18:
                    str2 = "MSRP_REQUEST_RECEIVED";
                    break;
                case 19:
                    str2 = "MSRP_RESPONSE_RECEIVED";
                    break;
                case 20:
                    str2 = "MSRP_RESPONSE_SENT";
                    break;
                case 21:
                    str2 = "SIP_CONNECTION_ESTABLISHED";
                    break;
                case 22:
                    str2 = "SIP_CONNECTION_DISCONNECTED";
                    break;
                case 23:
                    str2 = "SIP_INVITE_CREATED";
                    break;
                case 24:
                    str2 = "SIP_INVITE_SENDING";
                    break;
                case 25:
                    str2 = "SIP_MSG_RECEIVED";
                    break;
                case 26:
                    str2 = "SIP_MSG_SENT";
                    break;
                default:
                    str2 = "SIP_RESPONSE_RECEIVED";
                    break;
            }
            n(i3, new advp("BSS_EVENT:".concat(str2)), null, str, objArr);
        }
    }

    public static byte[] x(byte[] bArr, int i2) {
        int length = bArr.length;
        if (length <= i2) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i3 = length - i2;
        byteArrayOutputStream.write(String.format(Locale.US, "*** Initial %d bytes truncated ***\n", Integer.valueOf(i3)).getBytes(StandardCharsets.UTF_8));
        byteArrayOutputStream.write(bArr, i3, i2);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bf A[Catch: all -> 0x0170, TryCatch #0 {all -> 0x0170, blocks: (B:3:0x0003, B:6:0x0015, B:8:0x001f, B:9:0x0023, B:12:0x0042, B:14:0x0052, B:18:0x0095, B:20:0x00bf, B:24:0x00cf, B:27:0x00e9, B:30:0x00f1, B:34:0x00fc, B:45:0x0104, B:47:0x0112, B:48:0x013c, B:52:0x0137, B:53:0x014c, B:64:0x00e0, B:65:0x0065, B:67:0x0073, B:70:0x008d, B:73:0x0085), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1 A[Catch: all -> 0x0170, TryCatch #0 {all -> 0x0170, blocks: (B:3:0x0003, B:6:0x0015, B:8:0x001f, B:9:0x0023, B:12:0x0042, B:14:0x0052, B:18:0x0095, B:20:0x00bf, B:24:0x00cf, B:27:0x00e9, B:30:0x00f1, B:34:0x00fc, B:45:0x0104, B:47:0x0112, B:48:0x013c, B:52:0x0137, B:53:0x014c, B:64:0x00e0, B:65:0x0065, B:67:0x0073, B:70:0x008d, B:73:0x0085), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0160 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014c A[Catch: all -> 0x0170, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0170, blocks: (B:3:0x0003, B:6:0x0015, B:8:0x001f, B:9:0x0023, B:12:0x0042, B:14:0x0052, B:18:0x0095, B:20:0x00bf, B:24:0x00cf, B:27:0x00e9, B:30:0x00f1, B:34:0x00fc, B:45:0x0104, B:47:0x0112, B:48:0x013c, B:52:0x0137, B:53:0x014c, B:64:0x00e0, B:65:0x0065, B:67:0x0073, B:70:0x008d, B:73:0x0085), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e0 A[Catch: all -> 0x0170, TryCatch #0 {all -> 0x0170, blocks: (B:3:0x0003, B:6:0x0015, B:8:0x001f, B:9:0x0023, B:12:0x0042, B:14:0x0052, B:18:0x0095, B:20:0x00bf, B:24:0x00cf, B:27:0x00e9, B:30:0x00f1, B:34:0x00fc, B:45:0x0104, B:47:0x0112, B:48:0x013c, B:52:0x0137, B:53:0x014c, B:64:0x00e0, B:65:0x0065, B:67:0x0073, B:70:0x008d, B:73:0x0085), top: B:2:0x0003 }] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [advv] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [advv] */
    /* JADX WARN: Type inference failed for: r9v11, types: [advv] */
    /* JADX WARN: Type inference failed for: r9v7, types: [advv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void y(android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.advr.y(android.content.Context):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int z(String str) {
        char c2;
        if (str == null) {
            return 4;
        }
        switch (str.hashCode()) {
            case 2251950:
                if (str.equals("INFO")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 2656902:
                if (str.equals("WARN")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 64921139:
                if (str.equals("DEBUG")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 66247144:
                if (str.equals("ERROR")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1069090146:
                if (str.equals("VERBOSE")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            return 3;
        }
        if (c2 != 2) {
            if (c2 != 3) {
                if (c2 != 4) {
                    return 4;
                }
                return 2;
            }
            return 6;
        }
        return 5;
    }
}
