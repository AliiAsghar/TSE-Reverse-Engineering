package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum apgs implements apak {
    RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_UNSET(0),
    RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_UNKNOWN(1),
    RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_DISABLED(2),
    RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_ENABLED(3),
    RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_API_NOT_SUPPORTED(4);

    public final int f;

    apgs(int i) {
        this.f = i;
    }

    public static apgs b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_API_NOT_SUPPORTED;
                    }
                    return RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_ENABLED;
                }
                return RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_DISABLED;
            }
            return RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_UNKNOWN;
        }
        return RCS_VOLTE_SINGLE_REGISTRATION_CAPABILITY_UNSET;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
