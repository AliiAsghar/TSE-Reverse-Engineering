package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class xzb {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/common/LogUtil");
    private static final AtomicReference c = new AtomicReference();
    private static volatile boolean d = false;
    public static volatile boolean b = false;

    @Deprecated
    public static String a(Intent intent) {
        String bh;
        StringBuilder sb = new StringBuilder();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str : extras.keySet()) {
                Object obj = extras.get(str);
                sb.append("\n");
                sb.append(str);
                sb.append(" = ");
                if (obj == null) {
                    bh = "null";
                } else {
                    bh = yyb.bh(obj.toString());
                }
                sb.append(bh);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Level b(int i) {
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        return Level.FINEST;
                    }
                    return Level.SEVERE;
                }
                return Level.WARNING;
            }
            return Level.INFO;
        }
        return Level.FINE;
    }

    @Deprecated
    public static void c(String str, String str2) {
        alvg alvgVar = (alvg) a.d();
        alvgVar.X(alwp.a, str);
        alvgVar.Y(alvr.a);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/util/common/LogUtil", "d", 245, "LogUtil.java")).t("%s", str2);
    }

    @Deprecated
    public static void d(String str, String str2, Object... objArr) {
        alvg alvgVar = (alvg) a.d();
        alvgVar.X(alwp.a, str);
        alvgVar.Y(alvr.a);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/util/common/LogUtil", "d", 263, "LogUtil.java")).Q(str2, objArr);
    }

    @Deprecated
    public static void e(String str, Throwable th, String str2) {
        alvg alvgVar = (alvg) a.d();
        alvgVar.X(alwp.a, str);
        alvgVar.Y(alvr.a);
        ((alvg) ((alvg) alvgVar.g(th)).h("com/google/android/apps/messaging/shared/util/common/LogUtil", "d", 287, "LogUtil.java")).t("%s", str2);
    }

    @Deprecated
    public static void f(Context context, yep yepVar, PrintWriter printWriter, xzc xzcVar) {
        boolean z;
        xza a2;
        xza xzaVar = null;
        try {
            if (xzcVar != xzc.BUGLE) {
                z = false;
            } else {
                z = true;
            }
            if (z == yhx.f(context)) {
                a2 = (xza) c.get();
            } else {
                a2 = xza.a(context, yepVar, xzcVar.d, "Bugle");
                xzaVar = a2;
            }
            if (a2 != null) {
                a2.b(printWriter, xzcVar);
            }
            if (xzaVar != null) {
                try {
                    xzaVar.close();
                } catch (IOException e) {
                    Log.e("Bugle", "priorLogSaver.close: ", e);
                }
            }
        } catch (Throwable th) {
            if (xzaVar != null) {
                try {
                    xzaVar.close();
                } catch (IOException e2) {
                    Log.e("Bugle", "priorLogSaver.close: ", e2);
                }
            }
            throw th;
        }
    }

    @Deprecated
    public static void g(String str, String str2) {
        alvg alvgVar = (alvg) a.h();
        alvgVar.X(alwp.a, str);
        alvgVar.Y(alvr.a);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/util/common/LogUtil", "e", 451, "LogUtil.java")).t("%s", str2);
    }

    @Deprecated
    public static void h(String str, String str2, Object... objArr) {
        alvg alvgVar = (alvg) a.h();
        alvgVar.X(alwp.a, str);
        alvgVar.Y(alvr.a);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/util/common/LogUtil", "e", 468, "LogUtil.java")).Q(str2, objArr);
    }

    @Deprecated
    public static void i(String str, Throwable th, String str2) {
        alvg alvgVar = (alvg) a.h();
        alvgVar.X(alwp.a, str);
        alvgVar.Y(alvr.a);
        ((alvg) ((alvg) alvgVar.g(th)).h("com/google/android/apps/messaging/shared/util/common/LogUtil", "e", 491, "LogUtil.java")).t("%s", str2);
    }

    @Deprecated
    public static void j(String str, String str2) {
        alvg alvgVar = (alvg) a.g();
        alvgVar.X(alwp.a, str);
        alvgVar.Y(alvr.a);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/util/common/LogUtil", "i", 308, "LogUtil.java")).t("%s", str2);
    }

    @Deprecated
    public static void k(String str, String str2, Object... objArr) {
        alvg alvgVar = (alvg) a.g();
        alvgVar.X(alwp.a, str);
        alvgVar.Y(alvr.a);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/util/common/LogUtil", "i", 325, "LogUtil.java")).Q(str2, objArr);
    }

    @Deprecated
    public static void l(String str, String str2) {
        alvg alvgVar = (alvg) a.f();
        alvgVar.X(alwp.a, str);
        alvgVar.Y(alvr.a);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/util/common/LogUtil", "v", 183, "LogUtil.java")).t("%s", str2);
    }

    @Deprecated
    public static void m(String str, String str2, Object... objArr) {
        alvg alvgVar = (alvg) a.f();
        alvgVar.X(alwp.a, str);
        alvgVar.Y(alvr.a);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/util/common/LogUtil", "v", BasePaymentResult.ERROR_REQUEST_FAILED, "LogUtil.java")).Q(str2, objArr);
    }

    @Deprecated
    public static void n(String str, String str2) {
        alvg alvgVar = (alvg) a.i();
        alvgVar.X(alwp.a, str);
        alvgVar.Y(alvr.a);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/util/common/LogUtil", "w", 369, "LogUtil.java")).t("%s", str2);
    }

    @Deprecated
    public static void o(String str, String str2, Object... objArr) {
        alvg alvgVar = (alvg) a.i();
        alvgVar.X(alwp.a, str);
        alvgVar.Y(alvr.a);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/util/common/LogUtil", "w", 386, "LogUtil.java")).Q(str2, objArr);
    }

    @Deprecated
    public static void p(String str, Throwable th, String str2) {
        alvg alvgVar = (alvg) a.i();
        alvgVar.X(alwp.a, str);
        alvgVar.Y(alvr.a);
        ((alvg) ((alvg) alvgVar.g(th)).h("com/google/android/apps/messaging/shared/util/common/LogUtil", "w", 409, "LogUtil.java")).t("%s", str2);
    }

    @Deprecated
    public static boolean q(String str, int i) {
        if (!Log.isLoggable(str, i)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void r(StringBuilder sb, String str, String str2) {
        if (sb.length() + str.length() > 4000) {
            j("Bugle", sb.toString());
            sb.setLength(0);
            if (!TextUtils.isEmpty(str2)) {
                sb.append(str2);
            }
        }
        sb.append(str);
    }

    @Deprecated
    public static void s(Throwable th, String str) {
        alvg alvgVar = (alvg) a.g();
        alvgVar.X(alwp.a, "Bugle");
        alvgVar.Y(alvr.a);
        ((alvg) ((alvg) alvgVar.g(th)).h("com/google/android/apps/messaging/shared/util/common/LogUtil", "i", 348, "LogUtil.java")).t("%s", str);
    }

    public static byte[] t(byte[] bArr, int i) {
        int length = bArr.length;
        if (length <= i) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = length - i;
        byteArrayOutputStream.write(String.format("*** Initial %d bytes truncated ***\n", Integer.valueOf(i2)).getBytes(StandardCharsets.UTF_8));
        byteArrayOutputStream.write(bArr, i2, i);
        return byteArrayOutputStream.toByteArray();
    }

    @Deprecated
    public static void u(Throwable th, String str, Object... objArr) {
        alvg alvgVar = (alvg) a.i();
        alvgVar.X(alwp.a, "RcsClientLib");
        alvgVar.Y(alvr.a);
        ((alvg) ((alvg) alvgVar.g(th)).h("com/google/android/apps/messaging/shared/util/common/LogUtil", "w", 429, "LogUtil.java")).Q(str, objArr);
    }

    public static void v() {
        b = false;
    }
}
