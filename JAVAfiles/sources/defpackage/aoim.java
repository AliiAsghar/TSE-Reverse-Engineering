package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoim {
    public final aodi a;
    private final aoip b;
    private final abpn c;
    private final aohf d;
    private final aohf e;
    private final aohi f;

    public aoim(aodi aodiVar, aoip aoipVar, abpn abpnVar, aohf aohfVar, aohf aohfVar2, aohi aohiVar) {
        this.a = aodiVar;
        this.b = aoipVar;
        this.c = abpnVar;
        this.d = aohfVar;
        this.e = aohfVar2;
        this.f = aohiVar;
    }

    public static final acir b(acir acirVar) {
        return acirVar.b(new aoil(0), new acca(12));
    }

    private final String c() {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(this.a.e().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    public final acir a(String str, String str2, Bundle bundle) {
        int b;
        try {
            bundle.putString("scope", str2);
            bundle.putString("sender", str);
            bundle.putString("subtype", str);
            bundle.putString("gmp_app_id", this.a.c().b);
            bundle.putString("gmsv", Integer.toString(this.b.a()));
            bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
            bundle.putString("app_ver", this.b.c());
            bundle.putString("app_ver_name", this.b.d());
            bundle.putString("firebase-app-name-hash", c());
            try {
                String str3 = ((aohm) actx.u(this.f.j())).a;
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("Goog-Firebase-Installations-Auth", str3);
                } else {
                    Log.w("FirebaseMessaging", "FIS auth token is empty");
                }
            } catch (InterruptedException | ExecutionException e) {
                Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            }
            bundle.putString("appid", (String) actx.u(this.f.a()));
            bundle.putString("cliv", "fcm-23.3.2_1p");
            aogs aogsVar = (aogs) this.e.a();
            aojm aojmVar = (aojm) this.d.a();
            if (aogsVar != null && aojmVar != null && (b = aogsVar.b()) != 1) {
                bundle.putString("Firebase-Client-Log-Type", Integer.toString(aode.ao(b)));
                bundle.putString("Firebase-Client", aojmVar.a());
            }
            return this.c.b(bundle);
        } catch (InterruptedException | ExecutionException e2) {
            return actx.r(e2);
        }
    }
}
