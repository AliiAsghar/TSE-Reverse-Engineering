package defpackage;

import android.app.Application;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aduv {
    public static final abja a;
    public static final abja b;
    public static final abja c;
    public static final abja d;
    public static final abja e;
    public static final abja f;
    public static final abja g;
    public static final abja h;
    public static final abja i;
    private static final alhr j;

    static {
        alhr D = albo.D(new abnl(4));
        j = D;
        a = new abix((abjc) D.get(), "last_stored_signatures_white_list", "");
        b = new abix((abjc) D.get(), "last_stored_signatures_test_service_white_list", "");
        c = new abix((abjc) D.get(), "last_stored_packages_white_list", "");
        d = new abix((abjc) D.get(), "last_stored_packages_test_service_white_list", "");
        e = new abix((abjc) D.get(), "provisionId", null);
        f = new abiz((abjc) D.get(), "operation_mode", 0);
        g = new abiy((abjc) D.get(), "migration_complete", false);
        h = new abiz((abjc) D.get(), "encryption_key", 0);
        i = new abix((abjc) D.get(), "tachyon_anonymous_device_id", null);
    }

    public static /* synthetic */ abjc a() {
        try {
            return new abjc("carrier_services");
        } catch (NullPointerException e2) {
            try {
                Context applicationContext = ((Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null)).getApplicationContext();
                applicationContext.getClass();
                abjc.b = applicationContext;
                return new abjc("carrier_services");
            } catch (ReflectiveOperationException | RuntimeException unused) {
                throw e2;
            }
        }
    }
}
