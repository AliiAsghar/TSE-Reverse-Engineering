package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class pwv implements pwx {
    final /* synthetic */ pwz a;
    private Optional b = Optional.empty();

    public pwv(pwz pwzVar) {
        this.a = pwzVar;
    }

    @Override // defpackage.pwx
    public final String a() {
        return "HttpExecutionState";
    }

    @Override // defpackage.pwx
    public final void b(pwu pwuVar) {
        alwl alwlVar = (alwl) pwz.a.g();
        alwlVar.X(xod.a, this.a.c);
        alwlVar.X(xod.i, "HttpExecutionState");
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/InProgressFileTransfer$HttpExecutionState", "enter", 212, "InProgressFileTransfer.java")).q("Starting the HTTP execution.");
        if (pwuVar.b() == 2) {
            pxe a = pwuVar.a();
            this.b = Optional.of(a);
            a.b();
            return;
        }
        throw new IllegalStateException(String.format("Transfer id %s can't enter %s without a UrlHttpRequest.", this.a.c, "HttpExecutionState"));
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, pxe] */
    @Override // defpackage.pwx
    public final void c() {
        if (this.b.isEmpty()) {
            return;
        }
        alwl alwlVar = (alwl) pwz.a.g();
        alwlVar.X(xod.a, this.a.c);
        alwlVar.X(xod.i, "HttpExecutionState");
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/InProgressFileTransfer$HttpExecutionState", "exit", 234, "InProgressFileTransfer.java")).q("Cancelling the HTTP execution.");
        ?? r0 = this.b.get();
        this.b = Optional.empty();
        r0.a();
    }
}
