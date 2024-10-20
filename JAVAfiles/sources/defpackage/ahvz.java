package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahvz extends Exception {
    public final int a;
    private final String b;

    public ahvz(int i, String str) {
        super(str);
        this.b = str;
        this.a = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "Error type: " + ((Object) a.b(this.a)) + ". " + this.b;
    }
}
