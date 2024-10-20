package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vyp implements vyo {
    public static final xze a = xze.g("BugleRcs", "GetMessagesMethod");
    private final xnv b;
    private final anen c;
    private final wfh d;

    public vyp(wfh wfhVar, xnv xnvVar, anen anenVar) {
        this.d = wfhVar;
        this.b = xnvVar;
        this.c = anenVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    @Override // defpackage.vyo
    public final akul a(qgr qgrVar) {
        aozy createBuilder = wbd.a.createBuilder();
        apct j = aotl.j(this.b.f());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        wbd wbdVar = (wbd) apagVar;
        j.getClass();
        wbdVar.c = j;
        wbdVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        wfh wfhVar = this.d;
        wbd wbdVar2 = (wbd) createBuilder.b;
        qgrVar.getClass();
        wbdVar2.e = qgrVar;
        wbdVar2.b |= 4;
        return ((uof) wfhVar.a.b()).a(upk.a("rcs_engine_get_single_message", (wbd) createBuilder.s())).a().h(new vsw(17), this.c);
    }

    @Override // defpackage.vyo
    public final void b() {
        aozy createBuilder = wbd.a.createBuilder();
        apct j = aotl.j(this.b.f());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        wbd wbdVar = (wbd) apagVar;
        j.getClass();
        wbdVar.c = j;
        wbdVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        wfh wfhVar = this.d;
        wbd wbdVar2 = (wbd) createBuilder.b;
        wbdVar2.b |= 2;
        wbdVar2.d = true;
        wfhVar.c((wbd) createBuilder.s(), new uta(null, "perform_catch_up_work_item_dedup_tag", null, null, null, null));
    }
}
