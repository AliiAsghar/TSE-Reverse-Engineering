package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aasa extends rg {
    final /* synthetic */ aasb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aasa(aasb aasbVar) {
        super(true);
        this.a = aasbVar;
    }

    @Override // defpackage.rg
    public final void b() {
        aasb aasbVar = this.a;
        cg e = aasbVar.a.a().e("gallery_browser_fragment_tag");
        if (((Boolean) aarw.a.e()).booleanValue() && e != null) {
            if (e instanceof aarl) {
                aarm E = ((aarl) e).E();
                if (((Boolean) aarw.a.e()).booleanValue() && E.u.c()) {
                    return;
                }
            } else {
                throw new IllegalStateException("Unexpected full screen gallery fragment ".concat(e.toString()));
            }
        }
        aasbVar.e();
        rg rgVar = aasbVar.b;
        if (rgVar != null) {
            rgVar.h(false);
        }
        aasbVar.a.c().d();
    }
}
