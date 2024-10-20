package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.GoogleCertificatesQuery;
import com.google.android.gms.common.internal.IGoogleCertificatesApi;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abqk {
    static final abqi a;
    static final abqi b;
    public static volatile IGoogleCertificatesApi c;
    public static Context d;
    private static final Object e;

    static {
        new abqc(abqg.b("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new abqd(abqg.b("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        a = new abqe(abqg.b("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        b = new abqf(abqg.b("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        e = new Object();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static abqm a(String str, abqg abqgVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return b(str, abqgVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static abqm b(String str, abqg abqgVar, boolean z, boolean z2) {
        try {
            d();
            abhg.m(d);
            try {
                if (c.isGoogleOrPlatformSigned(new GoogleCertificatesQuery(str, abqgVar, z, z2), ObjectWrapper.wrap(d.getPackageManager()))) {
                    return abqm.a;
                }
                return new abql(new mti(z, str, abqgVar, 6));
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return new abqm(false, "module call", e2);
            }
        } catch (abya e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return new abqm(false, "module init: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void c(Context context) {
        synchronized (abqk.class) {
            if (d == null) {
                if (context != null) {
                    d = context.getApplicationContext();
                    return;
                }
                return;
            }
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        }
    }

    public static void d() {
        if (c != null) {
            return;
        }
        abhg.m(d);
        synchronized (e) {
            if (c == null) {
                c = IGoogleCertificatesApi.Stub.asInterface(DynamiteModule.c(d, DynamiteModule.b, "com.google.android.gms.googlecertificates").d());
            }
        }
    }
}
