package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mdg implements Closeable {
    public final int a;
    public final int b;
    public final long c;
    final /* synthetic */ mgu d;

    public mdg(mgu mguVar, int i, int i2, long j) {
        this.d = mguVar;
        this.a = i;
        this.b = i2;
        this.c = j;
    }

    public final void a() {
        this.d.i(this, 3);
    }

    public final void b() {
        mgu.j(this.d, this);
    }

    public final void c(int i) {
        if (i == 0) {
            i = 4;
        }
        this.d.i(this, i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        mgu.j(this.d, this);
    }
}
