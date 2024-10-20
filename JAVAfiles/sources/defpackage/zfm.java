package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.util.Log;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfm {
    public final Object a;

    public zfm(Object obj) {
        this.a = obj;
    }

    public static String b(Context context, String str, Map map) {
        return new zfm(context, (byte[]) null).c(str, map, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final Object a(Object obj) {
        return this.a.get(obj);
    }

    public final String c(String str, Map map, DroidGuardResultsRequest droidGuardResultsRequest) {
        Object b;
        addy addyVar = (addy) this.a;
        abvx abvxVar = new abvx(addyVar, str, droidGuardResultsRequest, map);
        abhg.g("This method must not be called on the main thread.");
        ((abwd) addyVar.c).b(abvxVar);
        try {
            b = abvxVar.a.a(abvxVar.e.a());
            if (b == null) {
                b = abvxVar.b("timeout: " + abvxVar.e.a() + " ms", null);
            }
        } catch (InterruptedException e) {
            b = abvxVar.b("takeWithTimeout(" + abvxVar.e.a() + ") got interrupted", e);
        }
        return (String) b;
    }

    public final ApplicationInfo d(String str, int i) {
        return ((Context) this.a).getPackageManager().getApplicationInfo(str, i);
    }

    public final PackageInfo e(String str, int i) {
        return ((Context) this.a).getPackageManager().getPackageInfo(str, i);
    }

    public final boolean f(int i) {
        return Log.isLoggable((String) this.a, i);
    }

    public final void g(String str) {
        if (f(4)) {
            Log.i("ParentalControlsClient", str);
        }
    }

    public zfm(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public zfm(Context context, byte[] bArr) {
        ahtp.f(context);
        this.a = new addy(context);
    }

    public zfm(arwe arweVar, Optional optional) {
        Object qjrVar;
        asai d;
        arweVar.getClass();
        zhc zhcVar = (zhc) arsd.k(optional);
        if (zhcVar != null && (d = zhcVar.d()) != null) {
            int i = ascp.a;
            qjrVar = arrn.T(d, arweVar, asco.a(0L, 3), true);
        } else {
            qjrVar = new qjr(yyo.i);
        }
        this.a = qjrVar;
    }

    public zfm() {
        this.a = DesugarCollections.synchronizedMap(new HashMap());
    }

    public zfm(Context context) {
        this.a = new abnm(context, "TACHYON_LOG_REQUEST").a();
    }

    public zfm(File file) {
        this.a = new adve(file);
    }

    public zfm(armf armfVar, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public zfm(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public zfm(String str) {
        abhg.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.a = str;
    }
}
