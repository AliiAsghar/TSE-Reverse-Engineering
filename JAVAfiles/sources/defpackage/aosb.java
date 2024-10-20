package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aosb extends Exception {
    public final int a;

    public aosb(int i, String str) {
        super(str);
        this.a = i;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "Error type: " + a.b(this.a) + ". " + getMessage();
    }
}
