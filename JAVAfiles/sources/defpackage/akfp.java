package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akfp implements andb {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ akfp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, arqr] */
    @Override // defpackage.andb
    public final void a(ahmn ahmnVar) {
        if (this.b != 0) {
            this.a.a(ahmnVar);
            return;
        }
        Object obj = this.a;
        synchronized (((akfq) obj).a) {
            ((akfq) obj).b = ahmnVar;
        }
    }
}
