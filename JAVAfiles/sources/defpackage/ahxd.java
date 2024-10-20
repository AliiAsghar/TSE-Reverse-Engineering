package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ahxd {
    public final ahys a;
    private final Locale b;
    private final String c;
    private final agxw d;

    /* JADX INFO: Access modifiers changed from: protected */
    public ahxd(ahys ahysVar, Locale locale, String str, agxw agxwVar) {
        this.a = ahysVar;
        this.b = locale;
        this.c = str;
        this.d = agxwVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void e(Map map, String str, Object obj) {
        String str2;
        if (obj != null) {
            str2 = obj.toString();
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    protected abstract String a();

    public final String b() {
        new HashMap();
        String str = this.c;
        d.t(!TextUtils.isEmpty(str), "API key cannot be empty.");
        HashMap hashMap = new HashMap(d());
        Uri.Builder buildUpon = Uri.parse("https://maps.googleapis.com/").buildUpon();
        buildUpon.appendEncodedPath("maps/api/place/");
        buildUpon.appendEncodedPath(a());
        buildUpon.appendQueryParameter("key", str);
        Locale locale = this.b;
        if (locale != null) {
            String languageTag = locale.toLanguageTag();
            if (!TextUtils.isEmpty(languageTag)) {
                buildUpon.appendQueryParameter("language", languageTag);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }

    public final Map c() {
        HashMap hashMap = new HashMap();
        Context context = (Context) this.d.b;
        String packageName = context.getPackageName();
        String e = ahop.e(context.getPackageManager(), packageName);
        alok alokVar = new alok();
        if (packageName != null) {
            alokVar.h("X-Android-Package", packageName);
        }
        if (e != null) {
            alokVar.h("X-Android-Cert", e);
        }
        hashMap.putAll(alokVar.b());
        hashMap.put("X-Places-Android-Sdk", "4.1.0");
        return hashMap;
    }

    protected abstract Map d();

    public final adae f() {
        return this.a.a();
    }
}
