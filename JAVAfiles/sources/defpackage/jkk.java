package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jkk implements jow {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/DirectSendUiAdapter");
    public final jjr b;
    public final afku c;
    public final armf d;
    public final lig e;
    public final jxv f;
    public final agcp g;
    public final izc h;
    public final aday i;
    public final nei j;
    private jow k;

    public jkk(jjr jjrVar, agcp agcpVar, afku afkuVar, jxv jxvVar, aday adayVar, nei neiVar, lig ligVar, armf armfVar, izc izcVar) {
        afkuVar.getClass();
        jxvVar.getClass();
        adayVar.getClass();
        armfVar.getClass();
        this.b = jjrVar;
        this.g = agcpVar;
        this.c = afkuVar;
        this.f = jxvVar;
        this.i = adayVar;
        this.j = neiVar;
        this.e = ligVar;
        this.d = armfVar;
        this.h = izcVar;
    }

    @Override // defpackage.jow
    public final void a() {
        jow jowVar = this.k;
        if (jowVar != null) {
            jowVar.a();
        }
        b(null);
    }

    public final void b(jow jowVar) {
        if (jowVar != null && this.k != null) {
            throw new IllegalStateException("A projection was already bound to DraftClearedListener");
        }
        this.k = jowVar;
    }
}
