package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoqy extends aoon {
    final /* synthetic */ aoon a;
    final /* synthetic */ Class b;

    public aoqy(aoon aoonVar, Class cls) {
        this.a = aoonVar;
        this.b = cls;
    }

    @Override // defpackage.aoon
    public final Object a(aoro aoroVar) {
        Object a = this.a.a(aoroVar);
        if (a != null && !this.b.isInstance(a)) {
            Class cls = this.b;
            Class<?> cls2 = a.getClass();
            throw new aook("Expected a " + cls.getName() + " but was " + cls2.getName() + "; at path " + aoroVar.f());
        }
        return a;
    }

    @Override // defpackage.aoon
    public final void b(aorp aorpVar, Object obj) {
        this.a.b(aorpVar, obj);
    }
}
