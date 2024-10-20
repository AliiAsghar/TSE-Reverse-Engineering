package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class asqy implements asro {
    public final asro b;

    public asqy(asro asroVar) {
        this.b = asroVar;
    }

    @Override // defpackage.asro
    public final asrs a() {
        return this.b.a();
    }

    @Override // defpackage.asro, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.close();
    }

    @Override // defpackage.asro, java.io.Flushable
    public void flush() {
        this.b.flush();
    }

    @Override // defpackage.asro
    public void hq(asqu asquVar, long j) {
        throw null;
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.b + ")";
    }
}
