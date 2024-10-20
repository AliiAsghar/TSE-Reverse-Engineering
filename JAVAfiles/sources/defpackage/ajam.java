package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ajam implements ajah {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ajam(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ajah
    public final void a(String str) {
        if (this.b != 0) {
            ((ajag) this.a).d = str;
            return;
        }
        ajap ajapVar = (ajap) this.a;
        ajapVar.l = str;
        aiyz a = ajapVar.a();
        if (a != null) {
            asqc.z(ahnz.a, a);
        }
    }
}
