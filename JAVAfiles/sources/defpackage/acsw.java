package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acsw extends Thread {
    final /* synthetic */ acsx a;

    public acsw(acsx acsxVar) {
        this.a = acsxVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.a.b.abort();
    }
}
