package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aedu implements Closeable {
    public static final alvi a = alvi.m("com/google/android/libraries/abuse/hades/moirai/service/MoiraiExecutor");
    public final aruz b;
    public final aedb c;

    public aedu(aruz aruzVar, aedb aedbVar) {
        this.b = aruzVar;
        this.c = aedbVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }
}
