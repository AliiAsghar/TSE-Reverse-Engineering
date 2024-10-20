package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeac implements Closeable {
    public final aeab a;
    private final aeac b;

    public aeac(aeab aeabVar, aeac aeacVar) {
        this.a = aeabVar;
        this.b = aeacVar;
    }

    public final Object a(aech aechVar, arpe arpeVar) {
        return this.b.a(aechVar, arpeVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
