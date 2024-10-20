package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqmc implements aqmb {
    public static final ahtp a;
    public static final ahtp b;

    static {
        ahtn a2 = new ahtn(ahsy.a("com.google.android.ims.library")).a();
        a = a2.i("FiMultiSync__enable_fi_multi_sync_help_article_in_rcs_settings", false);
        b = a2.i("FiMultiSync__enable_grpc_to_tycho_for_fi_multi_sync_status", false);
    }

    @Override // defpackage.aqmb
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.aqmb
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }
}
