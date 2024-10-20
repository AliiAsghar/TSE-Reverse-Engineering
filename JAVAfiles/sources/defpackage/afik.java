package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afik extends arsm {
    final /* synthetic */ afil a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afik(afil afilVar) {
        super(null);
        this.a = afilVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        afil afilVar = this.a;
        if (afilVar.d == 0) {
            afilVar.d = 1;
            afilVar.s(0);
        }
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
