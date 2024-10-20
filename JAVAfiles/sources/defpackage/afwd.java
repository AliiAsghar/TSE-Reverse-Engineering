package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afwd extends arsm {
    final /* synthetic */ afwf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afwd(afwf afwfVar) {
        super(null);
        this.a = afwfVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        agem b;
        arqg arqgVar = (arqg) obj2;
        if (arqgVar != null && (b = this.a.b()) != null) {
            b.gB(arqgVar);
        }
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
