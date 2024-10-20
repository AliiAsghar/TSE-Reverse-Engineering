package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afws extends arsm {
    final /* synthetic */ afwt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afws(afwt afwtVar) {
        super(null);
        this.a = afwtVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        afwt afwtVar = this.a;
        agem agemVar = (agem) obj2;
        if (afwtVar.h) {
            if (afwtVar.i || afwtVar.f) {
                afwtVar.g(agemVar);
            }
        }
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
