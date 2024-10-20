package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aptb implements Comparable {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(byte b) {
        return (b >> 5) & 7;
    }

    private final aptb g(Class cls) {
        if (cls.isInstance(this)) {
            return (aptb) cls.cast(this);
        }
        throw new apta("Expected a " + cls.getName() + " value, but got " + getClass().getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int a();

    /* JADX INFO: Access modifiers changed from: protected */
    public int b() {
        return 0;
    }

    public final apsv d() {
        return (apsv) g(apsv.class);
    }

    public final apsx e() {
        return (apsx) g(apsx.class);
    }

    public final apsy f() {
        return (apsy) g(apsy.class);
    }
}
