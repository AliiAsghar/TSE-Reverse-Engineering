package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afza extends arsm {
    final /* synthetic */ afzd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afza(Object obj, afzd afzdVar) {
        super(obj);
        this.a = afzdVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        int i;
        float f = ((dqy) obj2).a;
        dqv b = this.a.b();
        if (!Float.isNaN(f)) {
            i = b.eo(f);
        } else {
            i = -1;
        }
        this.a.setMaxHeight(i);
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
