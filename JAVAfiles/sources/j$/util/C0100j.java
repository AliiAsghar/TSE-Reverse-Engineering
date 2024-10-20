package j$.util;

import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0100j extends C0098h implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    private Object writeReplace() {
        return new C0098h(this.c);
    }

    @Override // j$.util.C0098h, java.util.List
    public final java.util.List subList(int i, int i2) {
        C0098h c0098h;
        synchronized (this.b) {
            c0098h = new C0098h(this.c.subList(i, i2), this.b);
        }
        return c0098h;
    }
}
