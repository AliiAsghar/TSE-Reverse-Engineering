package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class algh extends algj implements Serializable {
    public static final algh a = new algh();
    private static final long serialVersionUID = 1;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.algj
    protected final int a(Object obj) {
        return obj.hashCode();
    }

    @Override // defpackage.algj
    protected final boolean b(Object obj, Object obj2) {
        return obj.equals(obj2);
    }
}
