package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aaxb implements abcy {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aaxb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.abcy
    public final void a(int i) {
        if (this.b != 0) {
            aabp aabpVar = (aabp) this.a;
            if (!aabpVar.o && !aabpVar.p) {
                aabpVar.t(i, -1L);
                xzb.j("Bugle", a.bV(i, "ConversationInputManager: IME height changed to: "));
                return;
            }
            return;
        }
        ((aaxd) this.a).g();
    }
}
