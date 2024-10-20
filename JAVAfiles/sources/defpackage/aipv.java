package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aipv {
    public Boolean a;
    private final alob c = new alob();
    private final alob d = new alob();
    public boolean b = false;

    public final aipw a() {
        this.a.getClass();
        return new aipw(this.a.booleanValue(), this.b, this.c.g(), this.d.g());
    }

    public final void b(aiqa aiqaVar) {
        this.a.getClass();
        this.c.h(aiqaVar);
    }

    public final void c() {
        boolean z;
        if (this.a == null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "A SourcePolicy can only set internal() or external() once.");
        this.a = false;
    }
}
