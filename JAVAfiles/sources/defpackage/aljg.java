package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aljg<K, V> implements Serializable, alib {
    private static final long serialVersionUID = 1;
    public final alkd a;

    public aljg(alkd alkdVar) {
        this.a = alkdVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use ManualSerializationProxy");
    }

    @Override // defpackage.alib
    public final Object l(Object obj) {
        obj.getClass();
        alkd alkdVar = this.a;
        int a = alkdVar.a(obj);
        return alkdVar.b(a).f(obj, a);
    }

    @Override // defpackage.alib
    public final void m(Object obj) {
        this.a.remove(obj);
    }

    @Override // defpackage.alib
    public final void n(Object obj, Object obj2) {
        this.a.put(obj, obj2);
    }

    Object writeReplace() {
        return new aljh(this.a);
    }
}
