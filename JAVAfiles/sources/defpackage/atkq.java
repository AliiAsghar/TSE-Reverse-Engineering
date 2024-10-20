package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atkq extends atmx {
    private static final long serialVersionUID = -8214820200808997707L;
    private byte[] a;

    @Override // defpackage.atmx
    public final String a() {
        return atow.c(this.a);
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atkq();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.a = atktVar.h();
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        atkvVar.a(this.a);
    }
}
