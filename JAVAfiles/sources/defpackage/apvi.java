package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum apvi {
    BAD_URL(false),
    CANCELED(false),
    REQUEST_BODY_READ_ERROR(false),
    CONNECTION_ERROR(true),
    SERVER_ERROR(true),
    UNKNOWN(false);

    public final boolean g;

    apvi(boolean z) {
        this.g = z;
    }
}
