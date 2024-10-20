package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqms implements aqmr {
    public static final ahtp a;

    static {
        ahtn a2 = new ahtn(ahsy.a("com.google.android.gms.droidguard")).b().a();
        a2.i("BugFixesFlags__catch_runtime_exception_from_fast_refresh", true);
        a = a2.i("BugFixesFlags__catch_security_exception_from_class_loader", true);
        a2.i("BugFixesFlags__remove_has_googler_account", true);
        a2.i("BugFixesFlags__throttle_full_refresh", false);
    }

    @Override // defpackage.aqmr
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }
}
