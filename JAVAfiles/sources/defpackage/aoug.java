package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aoug implements apak {
    PROVISIONING_RULE_UNSPECIFIED(0),
    SIM_ROLE_DEFAULT_CALL(1),
    SIM_ROLE_DEFAULT_SMS(2),
    SIM_ROLE_DEFAULT_DATA(3),
    SIM_ROLE_ANY(4),
    SIM_ROLE_DISABLED_FOR_NON_DEFAULT_CALL(5),
    UNRECOGNIZED(-1);

    private final int i;

    aoug(int i) {
        this.i = i;
    }

    public static aoug b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return SIM_ROLE_DISABLED_FOR_NON_DEFAULT_CALL;
                        }
                        return SIM_ROLE_ANY;
                    }
                    return SIM_ROLE_DEFAULT_DATA;
                }
                return SIM_ROLE_DEFAULT_SMS;
            }
            return SIM_ROLE_DEFAULT_CALL;
        }
        return PROVISIONING_RULE_UNSPECIFIED;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
