package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akhe implements akma {
    private final /* synthetic */ int a;

    public /* synthetic */ akhe(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.akma
    public final void a(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            aodz aodzVar = (aodz) obj;
            aiut.c();
            Object obj2 = aodzVar.a;
            obj2.getClass();
            algw algwVar = ((akhk) obj2).b;
            if (algwVar.f()) {
                algwVar.b().cancel(false);
            }
            aodzVar.a = null;
            return;
        }
        tm tmVar = (tm) obj;
        for (akhq akhqVar : tmVar.values()) {
            aiut.c();
            albo.T(!akhqVar.d);
            akhp akhpVar = akhqVar.b;
            if (akhpVar != null) {
                akhqVar.e.t(akhpVar.a, akhpVar);
                akhqVar.b.close();
                akhqVar.b = null;
            }
            akhqVar.d = true;
        }
        tmVar.clear();
    }
}
