package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class accs implements alhr {
    protected final Context a;
    private final aegu b;
    private final accq c;

    public accs(Context context, aegu aeguVar, accq accqVar) {
        this.a = context;
        this.b = aeguVar;
        this.c = accqVar;
    }

    @Override // defpackage.alhr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final accr get() {
        algw algwVar;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String str2 = Build.BRAND;
            if (str2 != null) {
                String str3 = Build.PRODUCT;
                if (str3 != null) {
                    String str4 = Build.DEVICE;
                    if (str4 != null) {
                        String str5 = Build.MODEL;
                        if (str5 != null) {
                            String str6 = Build.MANUFACTURER;
                            if (str6 != null) {
                                int i = Build.VERSION.SDK_INT;
                                String str7 = Build.VERSION.BASE_OS;
                                if (str7 != null) {
                                    acco accoVar = new acco(str, str2, str3, str4, str5, str6, str7, i);
                                    Context context = this.a;
                                    accu accuVar = new accu(acct.a("ro.vendor.build.fingerprint"), acct.a("ro.boot.verifiedbootstate"), acct.b());
                                    String packageName = context.getPackageName();
                                    try {
                                        algwVar = algw.i(Long.valueOf(context.getPackageManager().getPackageInfo(packageName, 0).versionCode));
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        algwVar = alfd.a;
                                    }
                                    return new accr(accoVar, accuVar, this.c, new accp(packageName, algwVar), this.b.f().toEpochMilli());
                                }
                                throw new NullPointerException("Null baseOs");
                            }
                            throw new NullPointerException("Null manufacturer");
                        }
                        throw new NullPointerException("Null model");
                    }
                    throw new NullPointerException("Null device");
                }
                throw new NullPointerException("Null product");
            }
            throw new NullPointerException("Null brand");
        }
        throw new NullPointerException("Null fingerprint");
    }
}
