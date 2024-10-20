package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class vyq extends enq implements apxr {
    private volatile apxl a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.apxr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final apxl aR() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new apxl(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.enq, android.app.Service
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            aS();
        }
        super.onCreate();
    }
}
