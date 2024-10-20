package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afyy extends arsm {
    final /* synthetic */ afzd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afyy(Object obj, afzd afzdVar) {
        super(obj);
        this.a = afzdVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        float f = ((dqy) obj2).a;
        dqv b = this.a.b();
        dqy dqyVar = new dqy(f);
        if (true == Float.isNaN(dqyVar.a)) {
            dqyVar = null;
        }
        if (dqyVar != null) {
            int eo = b.eo(dqyVar.a);
            afzd afzdVar = this.a;
            afzdVar.setPadding(afzdVar.getPaddingLeft(), eo, afzdVar.getPaddingRight(), eo);
        }
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
