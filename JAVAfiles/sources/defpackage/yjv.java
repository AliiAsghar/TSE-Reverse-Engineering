package defpackage;

import android.content.Context;
import android.provider.Telephony;
import android.telephony.TelephonyManager;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yjv {
    public static final alwo a = alwo.o("Bugle");
    public final Context b;
    public final alhr c;
    public final alhr d;
    public final alhr e;
    private alhr f;
    private alhr g;

    public yjv(Context context) {
        this.b = context;
        context.getClass();
        this.c = albo.D(new yim(context, 3));
        this.d = albo.D(new yim(this, 4));
        this.e = albo.D(new yim(context, 5));
        this.f = albo.E(new yim(context, 6), Duration.ofMinutes(1L));
        this.g = h();
    }

    private final synchronized alhr g() {
        return albo.E(new yim(this, 7), Duration.ofMinutes(1L));
    }

    private final alhr h() {
        return albo.E(new yim(this, 8), Duration.ofMinutes(1L));
    }

    public final synchronized String a() {
        return (String) this.f.get();
    }

    public final synchronized String b() {
        return Telephony.Sms.getDefaultSmsPackage(this.b);
    }

    public final synchronized void c() {
        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/util/phone/PhoneConfiguration", "updateDefaultSmsApp", 173, "PhoneConfiguration.java")).q("Updating default SMS app");
        this.f = g();
        this.g = h();
    }

    public final boolean d() {
        boolean equals;
        akrh e = aktp.e("PhoneConfiguration#isDefaultSmsApp");
        try {
            if (yhx.c) {
                equals = ((Boolean) this.g.get()).booleanValue();
            } else {
                equals = this.b.getPackageName().equals(a());
            }
            e.close();
            return equals;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean e() {
        TelephonyManager telephonyManager = (TelephonyManager) this.d.get();
        if (telephonyManager != null && telephonyManager.isSmsCapable()) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (e() && d()) {
            return true;
        }
        return false;
    }
}
