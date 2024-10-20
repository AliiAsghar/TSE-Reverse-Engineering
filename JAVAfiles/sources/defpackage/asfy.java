package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asfy extends asfz {
    public static final asfy a = new asfy();

    private asfy() {
        super(asgc.c, asgc.d, asgc.e, asgc.a);
    }

    @Override // defpackage.asfz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.arwb
    public final String toString() {
        return "Dispatchers.Default";
    }
}
