package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class algw<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public static algw g() {
        return alfd.a;
    }

    public static algw h(Object obj) {
        if (obj == null) {
            return alfd.a;
        }
        return new alha(obj);
    }

    public static algw i(Object obj) {
        obj.getClass();
        return new alha(obj);
    }

    public abstract algw a(algk algkVar);

    public abstract Object b();

    public abstract Object c(alhr alhrVar);

    public abstract Object d(Object obj);

    public abstract Object e();

    public abstract boolean equals(Object obj);

    public abstract boolean f();

    public abstract int hashCode();
}
