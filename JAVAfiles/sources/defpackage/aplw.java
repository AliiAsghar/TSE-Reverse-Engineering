package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aplw implements apak {
    UNKNOWN_EVENT_TYPE(0),
    CREATE_GAIA_PAIRING(1),
    KEYCHAIN_STATUS(2),
    SKIP_GAIA_PAIRING(3),
    GAIA_PAIRING_STATUS(4),
    PROMO(5),
    WRONG_EMOJI_CODE(6),
    CREATE_GAIA_PAIRING_CLIENT_INIT(7),
    CREATE_GAIA_PAIRING_CLIENT_FINISHED(8),
    CREATE_GAIA_PAIRING_CANCELED(9),
    VERIFICATION_PROMPT_LAUNCHED(10),
    VERIFICATION_PROMPT_CLOSED(11),
    SHOW_VERIFICATION_PROMPT_NOTIFICATION(12),
    ATTEMPT_TO_LAUNCH_VERIFICATION_PROMPT(13),
    ATTEMPT_TO_LAUNCH_VERIFICATION_PROMPT_FROM_NOTIFICATION(14),
    UNRECOGNIZED(-1);

    private final int r;

    aplw(int i) {
        this.r = i;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.r;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
