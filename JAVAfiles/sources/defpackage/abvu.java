package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abvu {
    public static final Feature a;
    public static final Feature b;
    public static final Feature c;
    public static final Feature d;
    public static final Feature e;
    public static final Feature f;
    public static final Feature g;
    public static final Feature[] h;

    static {
        Feature feature = new Feature("asterism_consent", 3L);
        a = feature;
        Feature feature2 = new Feature("one_time_verification", 1L);
        b = feature2;
        Feature feature3 = new Feature("carrier_auth", 1L);
        c = feature3;
        Feature feature4 = new Feature("verify_phone_number", 2L);
        d = feature4;
        Feature feature5 = new Feature("get_iid_token", 1L);
        e = feature5;
        Feature feature6 = new Feature("ts43", 1L);
        f = feature6;
        Feature feature7 = new Feature("verify_phone_number_local_read", 1L);
        g = feature7;
        h = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7};
    }
}
