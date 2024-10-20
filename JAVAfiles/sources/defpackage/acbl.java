package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.util.Log;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class acbl {
    public static acbw b;
    public static String c;
    public static adqg f;
    public final Context d;
    public String e;
    private static final Map g = new tm();
    public static final long a = TimeUnit.DAYS.toMillis(7);

    protected acbl(Context context) {
        this.e = "";
        this.d = context.getApplicationContext();
        this.e = "";
    }

    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("InstanceID", "Never happens: can't find own package ".concat(e.toString()));
            return 0;
        }
    }

    public static String b(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("InstanceID", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public static synchronized acbl d(Context context) {
        synchronized (acbl.class) {
            Context applicationContext = context.getApplicationContext();
            if (f == null) {
                Log.w("InstanceID", "Instance ID SDK is deprecated, " + applicationContext.getPackageName() + " should update to use Firebase Instance ID");
                f = new adqg(applicationContext);
                b = new acbw(applicationContext);
            }
            c = Integer.toString(a(applicationContext));
            Map map = g;
            acbl acblVar = (acbl) map.get("");
            if (acblVar == null) {
                acbl acblVar2 = new acbl(applicationContext);
                map.put("", acblVar2);
                return acblVar2;
            }
            return acblVar;
        }
    }

    public final KeyPair c() {
        adqg adqgVar = f;
        abhg.m(adqgVar);
        return adqgVar.l(this.e).a;
    }
}
