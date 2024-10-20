package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class algi extends algj implements Serializable {
    public static final algi a = new algi();
    private static final long serialVersionUID = 1;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.algj
    protected final int a(Object obj) {
        return System.identityHashCode(obj);
    }

    @Override // defpackage.algj
    protected final boolean b(Object obj, Object obj2) {
        return false;
    }
}
