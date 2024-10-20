package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arlm extends arlc {
    final aqvr a;
    volatile boolean b;
    private boolean c;
    private boolean d = false;
    private boolean e = false;

    public arlm(aqvr aqvrVar) {
        this.a = aqvrVar;
    }

    @Override // defpackage.arlq
    public final void a() {
        this.a.a(Status.b, new aqut());
        this.e = true;
    }

    @Override // defpackage.arlq
    public final void b(Throwable th) {
        aqut a = Status.a(th);
        if (a == null) {
            a = new aqut();
        }
        this.a.a(Status.c(th), a);
        this.d = true;
    }

    @Override // defpackage.arlq
    public final void c(Object obj) {
        albo.U(!this.d, "Stream was terminated by error, no further calls are allowed");
        albo.U(!this.e, "Stream is already completed, no further calls are allowed");
        if (!this.c) {
            this.a.b(new aqut());
            this.c = true;
        }
        this.a.g(obj);
    }
}
