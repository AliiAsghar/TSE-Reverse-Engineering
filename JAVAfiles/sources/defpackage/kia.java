package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kia extends arrp implements arqr {
    final /* synthetic */ float a;
    final /* synthetic */ dqv b;
    final /* synthetic */ byn c;
    final /* synthetic */ cas d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kia(float f, dqv dqvVar, byn bynVar, cas casVar) {
        super(1);
        this.a = f;
        this.b = dqvVar;
        this.c = bynVar;
        this.d = casVar;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        float f;
        int i;
        ((dqv) obj).getClass();
        float a = kic.a(this.c);
        f = ((dqy) this.d.a()).a;
        if (Float.compare(a - f, this.a) < 0) {
            i = (int) this.b.em(-240.0f);
        } else {
            i = 0;
        }
        return new dre(i & 4294967295L);
    }
}
