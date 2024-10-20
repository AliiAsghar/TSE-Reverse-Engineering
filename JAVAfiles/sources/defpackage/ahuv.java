package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahuv {
    private static final Object f = new Object();
    private static volatile Map g;
    public final String a;
    public final aocu b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ahuv(Context context, ahuw ahuwVar) {
        String str;
        if (ahuwVar.c) {
            str = ahsy.c(context, ahuwVar.b);
        } else {
            str = ahuwVar.b;
        }
        this.a = str;
        aocu b = aocu.b(ahuwVar.d);
        this.b = b == null ? aocu.UNKNOWN : b;
        this.c = ahuwVar.g;
        this.d = ahuwVar.e;
        this.e = ahuwVar.f;
    }

    public static Map a(Context context) {
        Map map = g;
        if (map == null) {
            synchronized (f) {
                map = g;
                if (map == null) {
                    alok alokVar = new alok();
                    try {
                        String[] list = context.getAssets().list("phenotype");
                        if (list != null) {
                            for (String str : list) {
                                if (str.endsWith("_package_metadata.binarypb")) {
                                    try {
                                        InputStream open = context.getAssets().open(a.cp(str, "phenotype/"));
                                        try {
                                            aozs aozsVar = aozs.a;
                                            apcc apccVar = apcc.a;
                                            ahuv ahuvVar = new ahuv(context, (ahuw) apag.parseFrom(ahuw.a, open, aozs.a));
                                            alokVar.h(ahuvVar.a, ahuvVar);
                                            if (open != null) {
                                                open.close();
                                            }
                                        } catch (Throwable th) {
                                            if (open != null) {
                                                try {
                                                    open.close();
                                                } catch (Throwable th2) {
                                                    th.addSuppressed(th2);
                                                }
                                            }
                                            throw th;
                                            break;
                                        }
                                    } catch (apba e) {
                                        Log.e("PackageInfo", a.cp(str, "Unable to read Phenotype PackageMetadata for "), e);
                                    }
                                }
                            }
                        }
                    } catch (IOException e2) {
                        Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e2);
                    }
                    alor b = alokVar.b();
                    g = b;
                    map = b;
                }
            }
        }
        return map;
    }
}
