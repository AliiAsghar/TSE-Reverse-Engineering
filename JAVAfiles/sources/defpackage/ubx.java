package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ubx implements Closeable {
    public static final ubx a = new ubx(2);
    private final /* synthetic */ int b;

    public /* synthetic */ ubx(int i) {
        this.b = i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.b;
        if (i != 0) {
            boolean z = true;
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i != 4) {
                        boolean z2 = akqj.a;
                        return;
                    }
                    aiut.c();
                    if (akbe.a <= 0) {
                        z = false;
                    }
                    albo.T(z);
                    akbe.a--;
                    return;
                }
                return;
            }
            ubo.b.q("Bugle database has been closed.");
            return;
        }
        uci.V().b();
    }
}
