package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum wja implements apak {
    PER_SIM_TOGGLE_STATE_UNSPECIFIED(0),
    PER_SIM_TOGGLE_STATE_ENABLED(1),
    PER_SIM_TOGGLE_STATE_DISABLED(2),
    PER_SIM_TOGGLE_STATE_AUTOMATICALLY_DISABLED(3),
    PER_SIM_TOGGLE_STATE_PROVISIONING_RULE_DISABLED(4);

    public static final apal f = new whn(2);
    public final int g;

    wja(int i) {
        this.g = i;
    }

    public static wja b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return PER_SIM_TOGGLE_STATE_PROVISIONING_RULE_DISABLED;
                    }
                    return PER_SIM_TOGGLE_STATE_AUTOMATICALLY_DISABLED;
                }
                return PER_SIM_TOGGLE_STATE_DISABLED;
            }
            return PER_SIM_TOGGLE_STATE_ENABLED;
        }
        return PER_SIM_TOGGLE_STATE_UNSPECIFIED;
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
