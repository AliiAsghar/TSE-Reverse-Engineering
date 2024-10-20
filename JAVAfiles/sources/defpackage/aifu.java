package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aifu implements aipb {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aifu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.aipb
    public final void a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            ((aigf) this.a).c();
                            return;
                        } else {
                            ((aifj) this.a).a.close();
                            return;
                        }
                    }
                    ((aifm) this.a).a.startHandshake();
                    return;
                }
                ((aigc) this.a).c();
                return;
            }
            ((aifr) this.a).d();
            return;
        }
        ((aifv) this.a).a();
    }
}
