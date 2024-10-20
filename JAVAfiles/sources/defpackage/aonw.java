package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aonw extends aoqd {
    public aoon a = null;

    private final aoon e() {
        aoon aoonVar = this.a;
        if (aoonVar != null) {
            return aoonVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // defpackage.aoon
    public final Object a(aoro aoroVar) {
        return e().a(aoroVar);
    }

    @Override // defpackage.aoon
    public final void b(aorp aorpVar, Object obj) {
        e().b(aorpVar, obj);
    }

    @Override // defpackage.aoqd
    public final aoon c() {
        return e();
    }
}
