package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aoom extends aoon {
    final /* synthetic */ aoon a;

    public aoom(aoon aoonVar) {
        this.a = aoonVar;
    }

    @Override // defpackage.aoon
    public final Object a(aoro aoroVar) {
        if (aoroVar.t() == 9) {
            aoroVar.p();
            return null;
        }
        return this.a.a(aoroVar);
    }

    @Override // defpackage.aoon
    public final void b(aorp aorpVar, Object obj) {
        if (obj == null) {
            aorpVar.j();
        } else {
            this.a.b(aorpVar, obj);
        }
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.a.toString() + "]";
    }
}
