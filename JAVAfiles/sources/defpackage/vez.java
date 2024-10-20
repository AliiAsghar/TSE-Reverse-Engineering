package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
enum vez {
    JIBE_HAS_TOKEN(1),
    JIBE_NO_TOKEN(2),
    JIBE_NO_TOKEN_BLOCKED(3),
    THIRD_PARTY_HAS_TOKEN(4),
    THIRD_PARTY_NO_TOKEN(5),
    UNKNOWN_BACKEND_HAS_TOKEN(6),
    UNKNOWN_BACKEND_NO_TOKEN(7),
    UNKNOWN_BACKEND_NO_TOKEN_BLOCKED(8);

    public final int i;

    vez(int i) {
        this.i = i;
    }
}
