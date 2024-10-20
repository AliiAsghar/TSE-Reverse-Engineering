package j$.util;

import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0239u extends C0105o implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    private Object writeReplace() {
        return new C0105o(this.b);
    }

    @Override // j$.util.C0105o, java.util.List
    public final java.util.List subList(int i, int i2) {
        return new C0105o(this.b.subList(i, i2));
    }
}
