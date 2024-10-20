package defpackage;

import android.app.Notification;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import java.util.EnumSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class una implements umz {
    public static final alwo a = alwo.o("Bugle");
    public final armf b;
    private final akat c;
    private final anen d;

    public una(akat akatVar, armf armfVar, anen anenVar) {
        this.c = akatVar;
        this.b = armfVar;
        this.d = anenVar;
    }

    @Override // defpackage.umz
    public final void a(akul akulVar) {
        this.c.d(akulVar, aktp.c());
    }

    @Override // defpackage.umz
    public final void b(akul akulVar) {
        String c = aktp.c();
        akat akatVar = this.c;
        akatVar.d(akulVar, c);
        akatVar.e(akulVar, c);
    }

    @Override // defpackage.umz
    public final void c(akul akulVar) {
        this.c.g(akulVar);
    }

    @Override // defpackage.umz
    public final int d(EnumSet enumSet, akul akulVar, Supplier supplier) {
        Object obj;
        if (enumSet.contains(umy.WAKELOCK)) {
            try {
                c(akulVar);
            } catch (Throwable th) {
                ((alwl) ((alwl) ((alwl) a.i()).g(th)).h("com/google/android/apps/messaging/shared/datamodel/workqueue/AndroidFuturesWrapperImpl", "attach", (char) 148, "AndroidFuturesWrapperImpl.java")).q("AndroidFuturesWrapper attach wakelock request failed.");
            }
        }
        if (enumSet.contains(umy.BACKGROUND_SERVICE)) {
            try {
                a(akulVar);
                return 2;
            } catch (Throwable th2) {
                ((alwl) ((alwl) a.m().g(th2)).h("com/google/android/apps/messaging/shared/datamodel/workqueue/AndroidFuturesWrapperImpl", "attach", 157, "AndroidFuturesWrapperImpl.java")).q("AndroidFuturesWrapper attaching background service request failed.");
            }
        }
        if (enumSet.contains(umy.FOREGROUND_SERVICE)) {
            try {
                obj = supplier.get();
                Notification notification = (Notification) obj;
                if (notification != null) {
                    e(akulVar, notification, 11);
                    return 3;
                }
                return 1;
            } catch (Throwable th3) {
                ((alwl) ((alwl) a.m().g(th3)).h("com/google/android/apps/messaging/shared/datamodel/workqueue/AndroidFuturesWrapperImpl", "attach", 170, "AndroidFuturesWrapperImpl.java")).q("AndroidFuturesWrapper attaching foreground service request failed.");
                return 1;
            }
        }
        return 1;
    }

    @Override // defpackage.umz
    public final void e(akul akulVar, Notification notification, int i) {
        this.c.h(akulVar, notification);
        qiu.h(akulVar.h(new uhw(8), andi.a).e(Exception.class, new ikg(this, i, 9), this.d));
    }

    @Override // defpackage.umz
    public final void f(String str, int i) {
        ((mbl) this.b.b()).e(str, i - 1);
    }

    @Override // defpackage.umz
    public final void g(akul akulVar, Notification notification, Class cls, int i) {
        akat akatVar = this.c;
        boolean z = false;
        try {
            akatVar.c.getPackageManager().getServiceInfo(new ComponentName(akatVar.c, (Class<?>) cls), 0);
            z = true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        albo.N(z, "Unable to find serviceClass \"%s\".", cls.getName());
        akatVar.f.w(cls).f(akulVar, notification, i);
        qiu.h(akulVar.h(new uhw(7), andi.a).e(Exception.class, new ult(this, 3), this.d));
    }
}
