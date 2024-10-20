package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aquw {
    UNARY,
    CLIENT_STREAMING,
    SERVER_STREAMING,
    BIDI_STREAMING,
    UNKNOWN;

    public final boolean a() {
        if (this != UNARY && this != SERVER_STREAMING) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        if (this != UNARY && this != CLIENT_STREAMING) {
            return false;
        }
        return true;
    }
}
