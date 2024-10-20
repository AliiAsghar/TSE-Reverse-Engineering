package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class asqz implements asrq {
    public final asrq b;

    public asqz(asrq asrqVar) {
        asrqVar.getClass();
        this.b = asrqVar;
    }

    @Override // defpackage.asrq
    public final asrs a() {
        return this.b.a();
    }

    @Override // defpackage.asrq
    public long b(asqu asquVar, long j) {
        throw null;
    }

    @Override // defpackage.asrq, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.b + ")";
    }
}
