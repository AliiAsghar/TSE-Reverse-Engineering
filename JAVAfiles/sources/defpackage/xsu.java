package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xsu extends aovn {
    public static final alwo a = alwo.o("BugleFileTransfer");
    public final armf b;
    public final pzn c;
    private final xoj d;
    private final long e;
    private final anen f;

    public xsu(xoj xojVar, armf armfVar, pzn pznVar, long j, anen anenVar) {
        this.d = xojVar;
        this.b = armfVar;
        this.c = pznVar;
        this.e = j;
        this.f = anenVar;
    }

    @Override // defpackage.aovn
    public final void a(apvh apvhVar) {
        String str = ((apvf) apvhVar).a;
        str.getClass();
        qiu.h(aktp.ah(new wnc(this, str, 13, null), this.f));
    }

    @Override // defpackage.aovn
    public final void b(apvh apvhVar) {
        long a2 = apvhVar.a();
        String d = apvhVar.d();
        alwl alwlVar = (alwl) a.g();
        alwlVar.X(xod.b, d);
        alwlVar.X(xod.e, Long.valueOf(a2));
        alwlVar.X(xod.f, Long.valueOf(this.e));
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramTransferListener", "onUploadProgress", 105, "TachygramTransferListener.java")).q("Upload progress reported.");
        xof xofVar = new xof();
        xofVar.b(a2);
        xofVar.c(this.e);
        qiu.h(this.d.a(this.c, xofVar.a()));
    }
}
