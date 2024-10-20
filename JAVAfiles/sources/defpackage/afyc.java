package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afyc extends arsm {
    final /* synthetic */ afye a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afyc(afye afyeVar) {
        super(null);
        this.a = afyeVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        afzs afzsVar = (afzs) obj2;
        afzs afzsVar2 = (afzs) obj;
        if (afzsVar2 != null) {
            afzsVar2.setSelected(false);
        }
        if (afzsVar != null) {
            afzsVar.setSelected(true);
            if (this.a.f.c() != agaq.d) {
                this.a.c.e(afzsVar, false);
            }
        }
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
