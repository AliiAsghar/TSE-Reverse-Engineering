package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tkp extends agps {
    public tkp() {
        super("self_participants");
    }

    public final int b(int i) {
        tkq tkqVar = new tkq();
        tkqVar.b(i);
        return Y(new agpw(tkqVar), "self_participants-buildAndUpdateForSubId");
    }

    @Override // defpackage.agps
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final agpr a() {
        ac();
        String str = this.c;
        agpt agptVar = this.e;
        return new agpr(str, this.a, this.b, this.d.g(), agptVar.a());
    }

    public final void d(int i) {
        this.a.put("sim_slot_index", Integer.valueOf(i));
    }

    public final void e(int i) {
        this.a.put("sub_id", Integer.valueOf(i));
    }

    public final void f(int i) {
        this.a.put("subscription_color", Integer.valueOf(i));
    }

    public final void g(tkq tkqVar) {
        Z(new agpw(tkqVar));
    }
}
