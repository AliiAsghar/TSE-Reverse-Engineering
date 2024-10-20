package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afyv extends arsm {
    final /* synthetic */ afzd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afyv(afzd afzdVar) {
        super(null);
        this.a = afzdVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        int i;
        drk drkVar = (drk) obj2;
        if (drkVar != null) {
            afzd afzdVar = this.a;
            int ordinal = drkVar.ordinal();
            if (ordinal != 0) {
                i = 1;
                if (ordinal != 1) {
                    throw new armm();
                }
            } else {
                i = 0;
            }
            afzdVar.setLayoutDirection(i);
            afzdVar.setTextAlignment(5);
        }
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
