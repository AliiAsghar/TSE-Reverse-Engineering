package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abmg {
    private static final Lock c = new ReentrantLock();
    private static abmg d;
    public final Lock a = new ReentrantLock();
    public final SharedPreferences b;

    public abmg(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static abmg c(Context context) {
        abhg.m(context);
        Lock lock = c;
        lock.lock();
        try {
            if (d == null) {
                d = new abmg(context.getApplicationContext());
            }
            abmg abmgVar = d;
            lock.unlock();
            return abmgVar;
        } catch (Throwable th) {
            c.unlock();
            throw th;
        }
    }

    public final GoogleSignInAccount a() {
        String d2;
        Uri uri;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String d3 = d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(d3) || (d2 = d(e("googleSignInAccount", d3))) == null) {
            return null;
        }
        try {
            if (TextUtils.isEmpty(d2)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(d2);
            String optString = jSONObject.optString("photoUrl");
            if (!TextUtils.isEmpty(optString)) {
                uri = Uri.parse(optString);
            } else {
                uri = null;
            }
            long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
            HashSet hashSet = new HashSet();
            JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                hashSet.add(new Scope(jSONArray.getString(i)));
            }
            String optString2 = jSONObject.optString("id");
            if (jSONObject.has("tokenId")) {
                str = jSONObject.optString("tokenId");
            } else {
                str = null;
            }
            if (jSONObject.has("email")) {
                str2 = jSONObject.optString("email");
            } else {
                str2 = null;
            }
            if (jSONObject.has("displayName")) {
                str3 = jSONObject.optString("displayName");
            } else {
                str3 = null;
            }
            if (jSONObject.has("givenName")) {
                str4 = jSONObject.optString("givenName");
            } else {
                str4 = null;
            }
            if (jSONObject.has("familyName")) {
                str5 = jSONObject.optString("familyName");
            } else {
                str5 = null;
            }
            Long valueOf = Long.valueOf(parseLong);
            String string = jSONObject.getString("obfuscatedIdentifier");
            valueOf.getClass();
            abhg.k(string);
            GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(optString2, str, str2, str3, uri, null, parseLong, string, new ArrayList(hashSet), str4, str5);
            if (jSONObject.has("serverAuthCode")) {
                str6 = jSONObject.optString("serverAuthCode");
            } else {
                str6 = null;
            }
            googleSignInAccount.f = str6;
            return googleSignInAccount;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final GoogleSignInOptions b() {
        String d2;
        String str;
        Account account;
        String str2;
        String str3;
        String d3 = d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(d3) || (d2 = d(e("googleSignInOptions", d3))) == null) {
            return null;
        }
        try {
            if (TextUtils.isEmpty(d2)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(d2);
            HashSet hashSet = new HashSet();
            JSONArray jSONArray = jSONObject.getJSONArray("scopes");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                hashSet.add(new Scope(jSONArray.getString(i)));
            }
            if (jSONObject.has("accountName")) {
                str = jSONObject.optString("accountName");
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                account = new Account(str, "com.google");
            } else {
                account = null;
            }
            ArrayList arrayList = new ArrayList(hashSet);
            boolean z = jSONObject.getBoolean("idTokenRequested");
            boolean z2 = jSONObject.getBoolean("serverAuthRequested");
            boolean z3 = jSONObject.getBoolean("forceCodeForRefreshToken");
            if (jSONObject.has("serverClientId")) {
                str2 = jSONObject.optString("serverClientId");
            } else {
                str2 = null;
            }
            if (jSONObject.has("hostedDomain")) {
                str3 = jSONObject.optString("hostedDomain");
            } else {
                str3 = null;
            }
            return new GoogleSignInOptions(3, arrayList, account, z, z2, z3, str2, str3, new HashMap(), null);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String d(String str) {
        this.a.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            this.a.unlock();
        }
    }

    public final String e(String str, String str2) {
        return a.co(str2, str, ":");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(String str, String str2) {
        this.a.lock();
        try {
            this.b.edit().putString(str, str2).apply();
        } finally {
            this.a.unlock();
        }
    }
}
