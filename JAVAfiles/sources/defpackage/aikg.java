package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aikg {
    ABORTED("transaction aborted"),
    TRANSPORT_ERROR("transport error");

    public final String c;

    aikg(String str) {
        this.c = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.c;
    }
}
