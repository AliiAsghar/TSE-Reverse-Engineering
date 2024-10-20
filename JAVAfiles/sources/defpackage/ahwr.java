package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahwr {
    private static final ahyr a = new ahyr();
    private static volatile ahyp b;

    public static synchronized aibx a(Context context) {
        aibx b2;
        synchronized (ahwr.class) {
            try {
                context.getClass();
                String packageName = context.getPackageName();
                int i = 0;
                try {
                    i = context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (packageName != null) {
                    aicm aicmVar = new aicm(packageName, i);
                    d.t(!aicmVar.a.isEmpty(), "Package name must not be empty.");
                    b2 = b(context, aicmVar);
                } else {
                    throw new NullPointerException("Null packageName");
                }
            } catch (Error | RuntimeException e) {
                aico.b(e);
                throw e;
            }
        }
        return b2;
    }

    public static synchronized aibx b(Context context, aicm aicmVar) {
        ahxl ahxlVar;
        synchronized (ahwr.class) {
            try {
                albo.U(c(), "Places must be initialized first.");
                ahyp ahypVar = new ahyp(context, a, aicmVar);
                ahyr ahyrVar = ahypVar.a;
                agxw agxwVar = new agxw(ahypVar.b);
                agrk agrkVar = new agrk(ahypVar.b(), new adze((byte[]) null));
                adxs adxsVar = new adxs(ahypVar.b());
                ahiy c = ahypVar.c();
                aegu aeguVar = (aegu) ahypVar.c.b();
                int i = ahyk.a;
                aogy aogyVar = new aogy(ahyrVar, agxwVar, agrkVar, adxsVar, c, aeguVar);
                Context a2 = ahypVar.a();
                Context a3 = ahypVar.a();
                int i2 = acdh.a;
                ahwu ahwuVar = new ahwu(a2, new acdo(a3), new adze());
                ahwx ahwxVar = new ahwx(ahypVar.a(), (aegu) ahypVar.c.b());
                ahiy c2 = ahypVar.c();
                aegu aeguVar2 = (aegu) ahypVar.c.b();
                ahyr ahyrVar2 = ahypVar.a;
                aquc aqucVar = (aquc) ahypVar.d.b();
                ahiy c3 = ahypVar.c();
                aegu aeguVar3 = (aegu) ahypVar.c.b();
                Object b2 = ahypVar.e.b();
                Object b3 = ahypVar.f.b();
                Object b4 = ahypVar.g.b();
                Object b5 = ahypVar.h.b();
                Object b6 = ahypVar.i.b();
                Object b7 = ahypVar.j.b();
                Object b8 = ahypVar.k.b();
                ahxlVar = new ahxl(ahyrVar, aogyVar, ahwuVar, ahwxVar, c2, aeguVar2, new atsg(ahyrVar2, aqucVar, c3, aeguVar3, (adze) b3, (adef) b7, new adxs(ahypVar.a(), null)));
            } catch (Error | RuntimeException e) {
                aico.b(e);
                throw e;
            }
        }
        return ahxlVar;
    }

    public static synchronized boolean c() {
        boolean c;
        synchronized (ahwr.class) {
            try {
                c = a.c();
            } catch (Error | RuntimeException e) {
                aico.b(e);
                throw e;
            }
        }
        return c;
    }

    public static synchronized void d(Context context) {
        synchronized (ahwr.class) {
            try {
                context.getClass();
                d.t(true, "API Key must not be empty.");
                aico.a(context.getApplicationContext());
                a.e();
            } catch (Error | RuntimeException e) {
                aico.b(e);
                throw e;
            }
        }
    }

    public static void e(Context context) {
        try {
            d(context);
        } catch (Error | RuntimeException e) {
            aico.b(e);
            throw e;
        }
    }
}
