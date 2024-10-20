package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum qfu implements apak {
    RECOVERY_STRATEGY_UNSPECIFIED(0),
    RECOVERY_STRATEGY_NONE(1),
    RECOVERY_STRATEGY_REFRESH_REGISTRATION(2),
    RECOVERY_STRATEGY_REPROVISION(3),
    RECOVERY_STRATEGY_RECREATE_GROUP(4),
    RECOVERY_STRATEGY_INVALIDATE_CAPABILITIES_CACHE(5);

    public final int g;

    qfu(int i) {
        this.g = i;
    }

    public static qfu b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return RECOVERY_STRATEGY_INVALIDATE_CAPABILITIES_CACHE;
                        }
                        return RECOVERY_STRATEGY_RECREATE_GROUP;
                    }
                    return RECOVERY_STRATEGY_REPROVISION;
                }
                return RECOVERY_STRATEGY_REFRESH_REGISTRATION;
            }
            return RECOVERY_STRATEGY_NONE;
        }
        return RECOVERY_STRATEGY_UNSPECIFIED;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
