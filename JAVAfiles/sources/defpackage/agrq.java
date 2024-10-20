package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agrq {
    public final SharedPreferences a;

    static {
        TimeUnit.HOURS.toMillis(24L);
    }

    private agrq(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public static agrq a(Context context) {
        Context applicationContext = context.getApplicationContext();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.google.android.libraries.hats20", 0);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return new agrq(sharedPreferences);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    public static String b(String str, String str2) {
        return a.co(str2, str, "_");
    }

    public final void c(String str) {
        this.a.edit().remove(b(str, "EXPIRATION_DATE")).remove(b(str, "RESPONSE_CODE")).remove(b(str, "CONTENT")).apply();
    }
}
