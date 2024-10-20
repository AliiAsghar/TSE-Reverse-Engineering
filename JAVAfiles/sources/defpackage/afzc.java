package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afzc extends arsm {
    final /* synthetic */ afzd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afzc(afzd afzdVar) {
        super(null);
        this.a = afzdVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        afzq afzqVar = (afzq) obj2;
        cku ckuVar = null;
        if (afzqVar != null) {
            this.a.setHint(afzqVar.a);
            cku ckuVar2 = new cku(afzqVar.b);
            if (ckuVar2.i != 16) {
                ckuVar = ckuVar2;
            }
            if (ckuVar != null) {
                this.a.setHintTextColor(ckw.b(ckuVar.i));
                return;
            }
            return;
        }
        this.a.setHint((CharSequence) null);
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
