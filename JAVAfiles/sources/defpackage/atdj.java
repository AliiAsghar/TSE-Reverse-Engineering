package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atdj extends IllegalStateException {
    private final Throwable a;

    public atdj(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
