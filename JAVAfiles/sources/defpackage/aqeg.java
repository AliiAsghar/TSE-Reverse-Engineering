package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aqeg implements apak {
    UNKNOWN_MESSAGE_ORIGIN(0),
    COLLIDER_FIRST_FANOUT_ATTEMPT(1),
    COLLIDER_SECOND_FANOUT_ATTEMPT(2),
    INITIAL_PULL_MESSAGES(3),
    UNRECOGNIZED(-1);

    private final int g;

    aqeg(int i) {
        this.g = i;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
