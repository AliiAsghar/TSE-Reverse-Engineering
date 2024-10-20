package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum yal implements apak {
    SUBSCRIPTION_TYPE_UNSPECIFIED(0),
    DEFAULT_SYSTEM_SUBSCRIPTION(1),
    ALL_ACTIVE_SUBSCRIPTIONS(2),
    SPECIFIED_SUBSCRIPTION(3);

    public final int e;

    yal(int i) {
        this.e = i;
    }

    public static yal b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return SPECIFIED_SUBSCRIPTION;
                }
                return ALL_ACTIVE_SUBSCRIPTIONS;
            }
            return DEFAULT_SYSTEM_SUBSCRIPTION;
        }
        return SUBSCRIPTION_TYPE_UNSPECIFIED;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
