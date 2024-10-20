package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class akrx implements aksa {
    public final akrh a;

    public akrx(akrh akrhVar) {
        this.a = akrhVar;
    }

    @Override // defpackage.aksa, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }
}
