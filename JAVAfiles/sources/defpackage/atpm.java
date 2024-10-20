package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpm extends asmp {
    public IOException a;
    private final asmp b;
    private final asqw c;

    public atpm(asmp asmpVar) {
        this.b = asmpVar;
        this.c = new asrk(new atpl(this, asmpVar.c()));
    }

    @Override // defpackage.asmp
    public final long a() {
        return this.b.a();
    }

    @Override // defpackage.asmp
    public final aslz b() {
        return this.b.b();
    }

    @Override // defpackage.asmp
    public final asqw c() {
        return this.c;
    }

    @Override // defpackage.asmp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
