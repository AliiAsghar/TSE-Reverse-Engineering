package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwi extends IllegalStateException {
    private final String a;

    public bwi(String str) {
        this.a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
