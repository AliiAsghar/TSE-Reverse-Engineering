package defpackage;

import j$.util.Collection;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum vbe {
    NONE(0),
    ETOUFFEE(1, "E2EE"),
    ETOUFFEE_GROUPS(2, "GROUP_E2EE"),
    MMS_GROUP_UPGRADE_METRICS_COLLECTION(3),
    MULTI_DEVICE(4, "MULTI_DEVICE"),
    TACHYGRAM(5, "TACHYGRAM");

    private static final alog h = alog.p(values());
    public final int g;
    private final String j;

    vbe(int i2) {
        this(i2, null);
    }

    public static vbe b(int i2) {
        return (vbe) Collection.EL.stream(h).filter(new myg(i2, 2)).findAny().orElse(NONE);
    }

    public final long a() {
        return 1 << this.g;
    }

    public final Optional c() {
        return Optional.ofNullable(this.j);
    }

    vbe(int i2, String str) {
        d.t(true, "MessagesFeature value should be less than 64 because we are representing a user's features in the remote registrations table using a long as a hash.");
        this.g = i2;
        this.j = str;
    }
}
