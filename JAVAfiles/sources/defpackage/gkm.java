package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gkm implements gkg {
    public final Context a;
    public final String b;
    public final gke c;
    public final boolean d;
    public final boolean e;
    public boolean f;
    private final arml g = armd.a(new rd(this, 19));

    public gkm(Context context, String str, gke gkeVar, boolean z, boolean z2) {
        this.a = context;
        this.b = str;
        this.c = gkeVar;
        this.d = z;
        this.e = z2;
    }

    private final gkl a() {
        return (gkl) this.g.a();
    }

    @Override // defpackage.gkg
    public final gkd b() {
        return a().b();
    }

    @Override // defpackage.gkg
    public final void c(boolean z) {
        if (this.g.b()) {
            a().setWriteAheadLoggingEnabled(z);
        }
        this.f = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g.b()) {
            a().close();
        }
    }
}
