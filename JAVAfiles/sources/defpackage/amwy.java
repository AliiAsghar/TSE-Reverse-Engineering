package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amwy implements apak {
    CHAT_API_UNKNOWN(0),
    CHAT_API_OK(1),
    CHAT_API_PENDING(2),
    CHAT_API_FAILED_TRANSIENTLY(3),
    CHAT_API_FAILED_PERMANENTLY(4);

    public final int f;

    amwy(int i) {
        this.f = i;
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
