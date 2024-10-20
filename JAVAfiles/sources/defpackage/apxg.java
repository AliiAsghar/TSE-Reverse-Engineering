package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apxg implements apxq {
    private volatile Object a;
    private final Object b = new Object();
    private final qdq c;

    public apxg(qdq qdqVar) {
        this.c = qdqVar;
    }

    @Override // defpackage.apxq
    public final Object aS() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    qdq qdqVar = this.c;
                    apya apyaVar = ksg.a;
                    this.a = new krv(new aojh(qdqVar.a));
                }
            }
        }
        return this.a;
    }
}
