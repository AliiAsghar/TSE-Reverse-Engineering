package defpackage;

import java.io.Closeable;
import java.util.zip.Inflater;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahuf implements Closeable {
    public final Object a;
    private final /* synthetic */ int b;

    public ahuf(algk algkVar, int i) {
        this.b = i;
        this.a = algkVar;
        albo.U(!((Boolean) algkVar.apply(null)).booleanValue(), "database closed before starting work");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [algk, java.lang.Object] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b != 0) {
            albo.U(!((Boolean) this.a.apply(null)).booleanValue(), "database closed while doing work");
        } else {
            ((Inflater) this.a).end();
        }
    }

    public ahuf(int i) {
        this.b = i;
        this.a = new Inflater(true);
    }
}
