package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjc {
    public final arwe a;
    public final utz b;
    public final utz c;
    public final wul d;
    public boolean e;
    public arxm f;
    public final ascd g;
    public final ascd h;
    public final ascd i;
    private final arpi j;
    private final ascd k;

    public kjc(arpi arpiVar, arwe arweVar, armf armfVar) {
        arpiVar.getClass();
        arweVar.getClass();
        armfVar.getClass();
        this.j = arpiVar;
        this.a = arweVar;
        utz j = uuh.j(uuh.b, "conversation_2_min_pinch_to_zoom_scale", 1.0f);
        this.b = j;
        this.c = uuh.j(uuh.b, "conversation_2_max_pinch_to_zoom_scale", 1.6f);
        ascd a = ascy.a(false);
        this.k = a;
        ascd a2 = ascy.a(j.e());
        this.g = a2;
        znj znjVar = (znj) armfVar.b();
        aiwl a3 = wus.a();
        a3.i(wuk.CONVERSATION_SCALE);
        a3.k(zxk.a);
        this.d = znjVar.ab(a3.f());
        qjh.l(arweVar, arpiVar, new kbl(this, (arpe) null, 9), 2);
        this.h = a;
        this.i = a2;
    }

    public final void a(boolean z) {
        if (this.e) {
            this.h.f(Boolean.valueOf(z));
        }
    }
}
