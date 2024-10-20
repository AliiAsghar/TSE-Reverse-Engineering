package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pwz {
    public static final alwo a = alwo.o("BugleFileTransfer");
    public final anen b;
    public final String c;
    public final pxo d;
    public final pwx e;
    public final pwx f;
    public final pwx g;
    public final pwx h;
    public pwx i;
    public final pyd j;
    public final rhx k;

    public pwz(anen anenVar, String str, rhx rhxVar, pxo pxoVar, pyd pydVar) {
        pwy pwyVar = new pwy();
        this.e = pwyVar;
        this.f = new pww(this, 0);
        this.g = new pwv(this);
        this.h = new pww(this, 1);
        this.b = anenVar;
        this.c = str;
        this.k = rhxVar;
        this.d = pxoVar;
        this.i = pwyVar;
        this.j = pydVar;
    }

    public final synchronized void a(pwx pwxVar, pwu pwuVar) {
        if (this.i == this.h) {
            alwl alwlVar = (alwl) a.i();
            alwlVar.X(xod.a, this.c);
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/InProgressFileTransfer", "transition", 88, "InProgressFileTransfer.java")).q("InProgressFileTransfer already finished.");
            return;
        }
        alwl alwlVar2 = (alwl) a.g();
        alwlVar2.X(xod.a, this.c);
        ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/InProgressFileTransfer", "transition", 94, "InProgressFileTransfer.java")).D("Transitioning from %s to %s.", this.i.a(), pwxVar.a());
        this.i.c();
        this.i = pwxVar;
        pwxVar.b(pwuVar);
    }
}
