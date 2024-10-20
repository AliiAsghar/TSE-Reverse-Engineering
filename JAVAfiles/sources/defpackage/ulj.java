package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ulj extends unp {
    public static final xze a = xze.g("BugleCms", "CmsBackFillBnrStateForFiMdWorkHandler");
    public static final utz b = uuh.e(uuh.b, "cms_back_fill_bnr_state_for_fi_md_max_attempts", 10);
    public final qif c;
    public final mbl d;
    private final anen e;
    private final uie f;

    public ulj(qif qifVar, anen anenVar, mbl mblVar, uie uieVar) {
        this.c = qifVar;
        this.e = anenVar;
        this.d = mblVar;
        this.f = uieVar;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        a2.d(((Integer) b.e()).intValue());
        a2.c(unv.WAKELOCK);
        a2.g(gry.LINEAR);
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("CmsBackFillBnrStateForFiMdWorkHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        int i = unsVar.a().b;
        return this.f.d("CmsBackFillBnrStateForFiMdWorkHandler#processPendingWorkItemAsync", new rui(this, 18)).h(new uhw(6), this.e).e(Throwable.class, new ikg(this, i, 8), this.e);
    }

    @Override // defpackage.unx
    public final apca e() {
        return und.a.getParserForType();
    }
}
