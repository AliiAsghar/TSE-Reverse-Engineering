package defpackage;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aljd<K, V> extends aljh<K, V> implements Serializable, alij {
    private static final long serialVersionUID = 1;
    transient alij a;

    public aljd(alkd alkdVar) {
        super(alkdVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a = b().f(this.n);
    }

    private Object readResolve() {
        return this.a;
    }

    @Override // defpackage.alij
    public final Object a(Object obj) {
        throw null;
    }

    @Override // defpackage.algk
    public final V apply(K k) {
        return (V) ((aljf) this.a).b(k);
    }
}
