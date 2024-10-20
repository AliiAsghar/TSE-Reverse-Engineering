package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kgi implements jhp {
    private final /* synthetic */ int a;
    private final Object b;

    public kgi(owv owvVar, armf armfVar, armf armfVar2, int i) {
        jhp jhpVar;
        this.a = i;
        armfVar.getClass();
        armfVar2.getClass();
        if (owvVar.a()) {
            Object b = armfVar.b();
            b.getClass();
            jhpVar = (jhp) b;
        } else {
            Object b2 = armfVar2.b();
            b2.getClass();
            jhpVar = (jhp) b2;
        }
        this.b = jhpVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [jhp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, ascd] */
    @Override // defpackage.jhp
    public final void a(jhc jhcVar) {
        if (this.a != 0) {
            this.b.a(jhcVar);
        } else if (jhcVar.g != null) {
            ((ibi) this.b).a.f(true);
        }
    }

    public kgi(ibi ibiVar, int i) {
        this.a = i;
        ibiVar.getClass();
        this.b = ibiVar;
    }
}
