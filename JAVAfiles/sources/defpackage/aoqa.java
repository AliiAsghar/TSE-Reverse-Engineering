package defpackage;

import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoqa extends aopy {
    private final aopj a;

    public aoqa(aopj aopjVar, aoqb aoqbVar) {
        super(aoqbVar);
        this.a = aopjVar;
    }

    @Override // defpackage.aopy
    public final Object c() {
        return this.a.a();
    }

    @Override // defpackage.aopy
    public final void f(Object obj, aoro aoroVar, aopz aopzVar) {
        Object a = aopzVar.g.a(aoroVar);
        if (a == null && aopzVar.h) {
            return;
        }
        if (aopzVar.d) {
            ReflectiveTypeAdapterFactory.b(obj, aopzVar.b);
        } else if (aopzVar.i) {
            throw new aooe("Cannot set value of 'static final' ".concat(aorl.e(aopzVar.b, false)));
        }
        aopzVar.b.set(obj, a);
    }

    @Override // defpackage.aopy
    public final Object e(Object obj) {
        return obj;
    }
}
