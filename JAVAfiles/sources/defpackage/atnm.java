package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class atnm extends atmx {
    private static final long serialVersionUID = -18595042501413L;
    protected atmk a;

    @Override // defpackage.atmx
    public final String a() {
        return this.a.toString();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.a = new atmk(atktVar);
    }

    @Override // defpackage.atmx
    public void d(atkv atkvVar, atkn atknVar, boolean z) {
        this.a.h(atkvVar, null, z);
    }
}
