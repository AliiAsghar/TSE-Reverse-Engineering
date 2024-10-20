package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akrk extends akrl implements akrj {
    public static final akrl a = new akrk(null, new vl(0)).f();
    static final akrl b;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        akrj b2 = akrl.b();
        b2.a(akrl.e, true);
        b = ((akrl) b2).f();
    }

    public akrk(akrl akrlVar, vl vlVar) {
        super(akrlVar, vlVar);
    }

    @Override // defpackage.akrj
    public final void a(aktp aktpVar, Object obj) {
        albo.U(!this.d, "Can't mutate after handing to trace");
        obj.getClass();
        albo.U(!i(aktpVar), "Key already present");
        this.c.put(aktpVar, obj);
    }
}
