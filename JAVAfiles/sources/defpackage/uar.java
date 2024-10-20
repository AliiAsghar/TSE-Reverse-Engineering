package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uar extends Exception {
    private final String a;

    public uar(String str) {
        this.a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
