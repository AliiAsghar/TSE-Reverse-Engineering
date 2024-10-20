package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import io.grpc.Status;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aojh {
    public final Object a;

    public aojh(apdf apdfVar, Object obj, apdf apdfVar2, Object obj2) {
        this.a = new atii(apdfVar, obj, apdfVar2, obj2);
    }

    public static aojh A(byte[] bArr) {
        return new aojh(aocj.b(bArr));
    }

    public static final void J(String str) {
        throw new IOException(str);
    }

    public static final void K(String str, Object... objArr) {
        J(String.format(str, objArr));
    }

    public static int L(atii atiiVar, Object obj, Object obj2) {
        return aozu.a((apdf) atiiVar.c, 1, obj) + aozu.a((apdf) atiiVar.d, 2, obj2);
    }

    public static void M(aozl aozlVar, atii atiiVar, Object obj, Object obj2) {
        aozu.h(aozlVar, (apdf) atiiVar.c, 1, obj);
        aozu.h(aozlVar, (apdf) atiiVar.d, 2, obj2);
    }

    private static final String N(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    private static String O(String str) {
        if (!str.startsWith("gcm.n.")) {
            return str;
        }
        return str.replace("gcm.n.", "gcm.notification.");
    }

    private final synchronized String P(long j) {
        return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    private final synchronized String Q(String str) {
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.content.SharedPreferences, java.lang.Object] */
    private final synchronized void R() {
        ?? r0 = this.a;
        long j = r0.getLong("fire-count", 0L);
        String str = "";
        String str2 = null;
        for (Map.Entry<String, ?> entry : r0.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str3 : (Set) entry.getValue()) {
                    if (str2 == null || str2.compareTo(str3) > 0) {
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.a.getStringSet(str, new HashSet()));
        hashSet.remove(str2);
        this.a.edit().putStringSet(str, hashSet).putLong("fire-count", j - 1).commit();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.content.SharedPreferences, java.lang.Object] */
    private final synchronized void S(String str) {
        String Q = Q(str);
        if (Q == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.a.getStringSet(Q, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            this.a.edit().remove(Q).commit();
        } else {
            this.a.edit().putStringSet(Q, hashSet).commit();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.content.SharedPreferences, java.lang.Object] */
    private final synchronized void T(String str, String str2) {
        S(str2);
        HashSet hashSet = new HashSet(this.a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.a.edit().putStringSet(str, hashSet).commit();
    }

    public static String l(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    public static boolean o(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString(O("gcm.n.e")))) {
            return false;
        }
        return true;
    }

    public static aojh z(int i) {
        return new aojh(aocj.b(anud.b(i)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final boolean B() {
        return ((asqc) this.a.b()).y("com.google.android.apps.messaging.auto 45648001").e();
    }

    public final /* synthetic */ aqgb C() {
        apag s = ((aozy) this.a).s();
        s.getClass();
        return (aqgb) s;
    }

    public final void D(askq askqVar) {
        askqVar.getClass();
        aozy aozyVar = (aozy) this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        aqgb aqgbVar = (aqgb) aozyVar.b;
        aqgb aqgbVar2 = aqgb.a;
        aqgbVar.i = askqVar.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Deque] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Deque] */
    public final long E() {
        if (this.a.isEmpty()) {
            return 0L;
        }
        return ((Long) this.a.peek()).longValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Deque] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Deque] */
    public final void F() {
        if (!this.a.isEmpty()) {
            K("data item not completed, stackSize: %s scope: %s", Integer.valueOf(this.a.size()), Long.valueOf(E()));
        }
    }

    public final void G(long j) {
        long E = E();
        if (E != j) {
            if (E != -1) {
                if (E == -2) {
                    E = -2;
                } else {
                    return;
                }
            }
            K("expected non-string scope or scope %s but found %s", Long.valueOf(j), Long.valueOf(E));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Deque] */
    public final void H(long j) {
        this.a.push(Long.valueOf(j));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Deque] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Deque] */
    public final void I(long j) {
        this.a.pop();
        this.a.push(Long.valueOf(j));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized aoit a(String str, String str2) {
        aoit aoitVar;
        ?? r0 = this.a;
        String N = N(str, str2);
        aoitVar = null;
        String string = r0.getString(N, null);
        if (!TextUtils.isEmpty(string)) {
            if (string.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    aoitVar = new aoit(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                } catch (JSONException e) {
                    Log.w("FirebaseMessaging", "Failed to parse token: ".concat(e.toString()));
                }
            } else {
                aoitVar = new aoit(string, null, 0L);
            }
        }
        return aoitVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void b() {
        this.a.edit().clear().commit();
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void c(String str, String str2, String str3, String str4) {
        String str5;
        long currentTimeMillis = System.currentTimeMillis();
        long j = aoit.a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str3);
            jSONObject.put("appVersion", str4);
            jSONObject.put("timestamp", currentTimeMillis);
            str5 = jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to encode token: ".concat(e.toString()));
            str5 = null;
        }
        if (str5 == null) {
            return;
        }
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(N(str, str2), str5);
        edit.commit();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized boolean d() {
        return this.a.getAll().isEmpty();
    }

    public final synchronized Object e(Object obj) {
        return ((LinkedHashMap) this.a).get(obj);
    }

    public final synchronized void f(Object obj, Object obj2) {
        ((LinkedHashMap) this.a).put(obj, obj2);
    }

    public final Bundle g() {
        Bundle bundle = new Bundle((Bundle) this.a);
        for (String str : ((Bundle) this.a).keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public final Integer h(String str) {
        String k = k(str);
        if (!TextUtils.isEmpty(k)) {
            try {
                return Integer.valueOf(Integer.parseInt(k));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + l(str) + "(" + k + ") into an int");
                return null;
            }
        }
        return null;
    }

    public final String i(Resources resources, String str, String str2) {
        String[] strArr;
        String k = k(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(k)) {
            return null;
        }
        int identifier = resources.getIdentifier(k, "string", str);
        if (identifier != 0) {
            JSONArray m = m(str2.concat("_loc_args"));
            if (m == null) {
                strArr = null;
            } else {
                int length = m.length();
                strArr = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr[i] = m.optString(i);
                }
            }
            if (strArr == null) {
                return resources.getString(identifier);
            }
            try {
                return resources.getString(identifier, strArr);
            } catch (MissingFormatArgumentException e) {
                Log.w("NotificationParams", "Missing format argument for " + l(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
                return null;
            }
        }
        Log.w("NotificationParams", l(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
        return null;
    }

    public final String j(Resources resources, String str, String str2) {
        String k = k(str2);
        if (!TextUtils.isEmpty(k)) {
            return k;
        }
        return i(resources, str, str2);
    }

    public final String k(String str) {
        if (!((Bundle) this.a).containsKey(str) && str.startsWith("gcm.n.")) {
            String O = O(str);
            if (((Bundle) this.a).containsKey(O)) {
                str = O;
            }
        }
        return ((Bundle) this.a).getString(str);
    }

    public final JSONArray m(String str) {
        String k = k(str);
        if (!TextUtils.isEmpty(k)) {
            try {
                return new JSONArray(k);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + l(str) + ": " + k + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    public final boolean n(String str) {
        String k = k(str);
        if (!"1".equals(k) && !Boolean.parseBoolean(k)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized List p() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                HashSet hashSet = new HashSet((Set) entry.getValue());
                hashSet.remove(P(System.currentTimeMillis()));
                if (!hashSet.isEmpty()) {
                    arrayList.add(new aogt(entry.getKey(), new ArrayList(hashSet)));
                }
            }
        }
        t(System.currentTimeMillis());
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void q() {
        ?? r0 = this.a;
        SharedPreferences.Editor edit = r0.edit();
        int i = 0;
        for (Map.Entry<String, ?> entry : r0.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Set set = (Set) entry.getValue();
                String P = P(System.currentTimeMillis());
                String key = entry.getKey();
                if (set.contains(P)) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(P);
                    edit.putStringSet(key, hashSet);
                    i++;
                } else {
                    edit.remove(key);
                }
            }
        }
        if (i == 0) {
            edit.remove("fire-count");
        } else {
            edit.putLong("fire-count", i);
        }
        edit.commit();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void r() {
        String P = P(System.currentTimeMillis());
        this.a.edit().putString("last-used-date", P).commit();
        S(P);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v10, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void s(long j, String str) {
        ?? r0 = this.a;
        String P = P(j);
        if (r0.getString("last-used-date", "").equals(P)) {
            String Q = Q(P);
            if (Q != null && !Q.equals(str)) {
                T(str, P);
                return;
            }
            return;
        }
        long j2 = this.a.getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            R();
            j2 = this.a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.a.getStringSet(str, new HashSet()));
        hashSet.add(P);
        this.a.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", P).commit();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    final synchronized void t(long j) {
        this.a.edit().putLong("fire-global", j).commit();
    }

    final synchronized boolean u(long j, long j2) {
        return P(j).equals(P(j2));
    }

    public final synchronized boolean v(long j) {
        return w(j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.content.SharedPreferences, java.lang.Object] */
    final synchronized boolean w(long j) {
        if (this.a.contains("fire-global")) {
            if (!u(this.a.getLong("fire-global", -1L), j)) {
                this.a.edit().putLong("fire-global", j).commit();
                return true;
            }
            return false;
        }
        this.a.edit().putLong("fire-global", j).commit();
        return true;
    }

    public final int x() {
        return ((aocj) this.a).a();
    }

    public final byte[] y() {
        return ((aocj) this.a).c();
    }

    public aojh(armf armfVar) {
        this.a = armfVar;
    }

    public aojh(Object obj) {
        this.a = obj;
    }

    public aojh(Context context, String str) {
        this.a = context.getSharedPreferences("FirebaseHeartBeat".concat(str), 0);
    }

    public aojh(byte[] bArr) {
        this.a = new ArrayDeque(16);
    }

    public aojh(Bundle bundle) {
        this.a = new Bundle(bundle);
    }

    public aojh(Context context) {
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || d()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            b();
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: ".concat(String.valueOf(e.getMessage())));
            }
        }
    }

    public aojh(Status status, aqut aqutVar) {
        status.getClass();
        this.a = status;
        aqutVar.getClass();
    }

    public aojh() {
        this.a = new aosi();
    }
}
