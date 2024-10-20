package defpackage;

import java.io.Closeable;
import java.io.Reader;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class asmp implements Closeable {
    public Reader d;

    public abstract long a();

    public abstract aslz b();

    public abstract asqw c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        asmt.p(c());
    }
}
