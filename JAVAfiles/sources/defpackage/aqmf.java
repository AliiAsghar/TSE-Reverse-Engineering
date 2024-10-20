package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqmf implements aqme {
    public static final ahtp a;
    public static final ahtp b;

    static {
        ahtn a2 = new ahtn(ahsy.a("com.google.android.ims.library")).a();
        a = a2.h("PhenotypeRcsFlags__bugle_max_typing_send_frequency_milliseconds", 4000L);
        b = a2.h("PhenotypeRcsFlags__bugle_stopped_typing_send_timeout_milliseconds", 10000L);
        a2.i("PhenotypeRcsFlags__save_all_logs", false);
    }

    @Override // defpackage.aqme
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.aqme
    public final long b() {
        return ((Long) b.b()).longValue();
    }
}
