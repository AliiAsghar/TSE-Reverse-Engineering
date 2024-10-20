package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afyt extends arsm {
    final /* synthetic */ afzd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afyt(afzd afzdVar) {
        super(null);
        this.a = afzdVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        Boolean bool = (Boolean) obj2;
        if (d.F(bool, true)) {
            if (!this.a.hasFocus()) {
                this.a.requestFocus();
                return;
            } else {
                this.a.g();
                return;
            }
        }
        if (d.F(bool, false)) {
            this.a.f();
        }
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
