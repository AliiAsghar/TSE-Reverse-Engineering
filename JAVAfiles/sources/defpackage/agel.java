package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agel extends arsm {
    final /* synthetic */ agem a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agel(agem agemVar) {
        super(null);
        this.a = agemVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        afzr afzrVar = (afzr) obj2;
        if (afzrVar != null) {
            agem agemVar = this.a;
            if (agemVar.aQ) {
                agemVar.aT(afzrVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Do not attempt to apply null HugoColors. This should not happen.");
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
