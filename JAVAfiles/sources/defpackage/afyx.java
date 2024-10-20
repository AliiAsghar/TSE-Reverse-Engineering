package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afyx extends arsm {
    final /* synthetic */ afzd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afyx(Object obj, afzd afzdVar) {
        super(obj);
        this.a = afzdVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        ayb aybVar = (ayb) obj2;
        aybVar.getClass();
        this.a.setOnEditorActionListener(new ild(aybVar, 3));
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
