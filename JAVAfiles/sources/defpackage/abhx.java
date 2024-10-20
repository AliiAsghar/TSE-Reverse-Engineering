package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import com.android.vcard.VCardConfig;
import com.google.android.gms.duokit.DuoId;
import com.google.android.gms.duokit.DuoKitContainerActivity;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abhx {
    public static volatile aqux a;

    private abhx() {
    }

    public static int a(ablp ablpVar) {
        return ablpVar.b().j;
    }

    public static void b(Context context) {
        Intent addFlags = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.tachyon")).addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        Log.d("SetupDuoHelper", "Try to install Duo via Play store link.");
        try {
            context.startActivity(addFlags);
        } catch (ActivityNotFoundException unused) {
            Log.e("SetupDuoHelper", "No activity to handle view intent.");
        }
    }

    public static boolean c(Context context) {
        if (context.getPackageManager().resolveActivity(new Intent("com.google.android.apps.tachyon.action.CALL").setData(Uri.parse(String.format("%s:%s", "tel", "+14255555555"))).setPackage("com.google.android.apps.tachyon"), 65536) == null) {
            return false;
        }
        return true;
    }

    public static final void d(DuoId duoId) {
        duoId.a = 1;
    }

    public static String e(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public static byte[] f(String str) {
        return h(str, Build.VERSION.SDK_INT, null);
    }

    public static byte[] g(String str, Throwable th) {
        return h(str, Build.VERSION.SDK_INT, th);
    }

    public static byte[] h(String str, int i, Throwable th) {
        String format = String.format(Locale.US, "ERROR : %s\nAPI_LEVEL: %d\nGMSCORE_VERSION: %s", str, Integer.valueOf(i), "24.41.99-000");
        if (th != null) {
            format = String.valueOf(format).concat(String.valueOf(String.format(Locale.US, "\nEXCEPTION: %s\nSTACK_TRACE: %s", th, Log.getStackTraceString(th))));
        }
        return String.valueOf(format).concat(String.valueOf(String.format(Locale.US, "\nBuild.FINGERPRINT: %s", Build.FINGERPRINT))).getBytes(StandardCharsets.UTF_8);
    }

    public static void i(Context context, acak acakVar, algw algwVar) {
        ApplicationInfo applicationInfo;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 0);
            if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
                if (applicationInfo.enabled) {
                    Intent addFlags = new Intent("com.google.android.gms.duokit.action.INSTALL_DUO_VIA_ALLEYOOP").setClassName(context, DuoKitContainerActivity.class.getName()).addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                    if (algwVar.f()) {
                        addFlags.putExtra("com.google.android.apps.tachyon.extra.REFERRER", (String) algwVar.b());
                    }
                    context.startActivity(addFlags);
                    acakVar.k(4);
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        b(context);
        acakVar.k(5);
    }
}
