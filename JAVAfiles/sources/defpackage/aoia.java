package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoia {
    public final boolean a;
    public final Object b;
    public final Object c;

    public aoia(ggg gggVar, byte[] bArr, boolean z) {
        this.c = gggVar;
        this.b = bArr;
        this.a = z;
    }

    public final synchronized boolean a() {
        return this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (((defpackage.alsx) r3.b).c == 1) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.qei b() {
        /*
            r3 = this;
            boolean r0 = r3.e()
            r1 = 0
            if (r0 != 0) goto L11
            java.lang.Object r0 = r3.b
            alsx r0 = (defpackage.alsx) r0
            int r0 = r0.c
            r2 = 1
            if (r0 != r2) goto L11
            goto L12
        L11:
            r2 = r1
        L12:
            java.lang.String r0 = "Recipients descriptor is not for 1 to 1 chat"
            defpackage.albo.U(r2, r0)
            java.lang.Object r0 = r3.b
            alog r0 = (defpackage.alog) r0
            java.lang.Object r0 = r0.get(r1)
            qei r0 = (defpackage.qei) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoia.b():qei");
    }

    public final qfb c() {
        albo.U(((Optional) this.c).isPresent(), "Recipients descriptor is not for group chat");
        return (qfb) ((Optional) this.c).get();
    }

    public final alog d() {
        albo.U(((Optional) this.c).isPresent(), "Recipients descriptor is not for group chat");
        return (alog) this.b;
    }

    public final boolean e() {
        return ((Optional) this.c).isPresent();
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [armf, java.lang.Object] */
    public final boolean f(Supplier supplier) {
        Object obj;
        boolean z = false;
        if (this.a) {
            try {
                obj = supplier.get();
                amfq amfqVar = (amfq) obj;
                if (1 == (((amfr) amfqVar.b).b & 1)) {
                    z = true;
                }
                d.s(z);
                ((maq) this.b.b()).j(amfqVar);
            } catch (Throwable th) {
                ((xze) this.c).n("Failed to emit event", th);
            }
            return true;
        }
        ((xze) this.c).l("Clearcut loggings are disabled.");
        return false;
    }

    public aoia(armf armfVar, yep yepVar) {
        this.c = xze.g("Bugle", "LogEmitter");
        this.b = armfVar;
        this.a = yepVar.i("bugle_enable_analytics", true);
    }

    public aoia(qei qeiVar) {
        this.b = alog.r(qeiVar);
        this.c = Optional.empty();
        this.a = false;
    }

    public aoia(qfb qfbVar, alog alogVar, boolean z) {
        this.b = alogVar;
        this.c = Optional.of(qfbVar);
        this.a = z;
    }

    public aoia(Context context, String str) {
        Context createDeviceProtectedStorageContext;
        createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        this.b = createDeviceProtectedStorageContext;
        SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:".concat(str), 0);
        this.c = sharedPreferences;
        boolean z = true;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                Context context2 = createDeviceProtectedStorageContext;
                PackageManager packageManager = createDeviceProtectedStorageContext.getPackageManager();
                if (packageManager != null) {
                    Context context3 = createDeviceProtectedStorageContext;
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(createDeviceProtectedStorageContext.getPackageName(), 128);
                    if (applicationInfo != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled")) {
                        z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        this.a = z;
    }
}
