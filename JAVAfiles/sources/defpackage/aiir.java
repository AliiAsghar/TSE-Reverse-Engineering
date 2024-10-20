package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiir extends Thread {
    final /* synthetic */ aiik a;
    final /* synthetic */ aiit b;

    public aiir(aiit aiitVar, aiik aiikVar) {
        this.a = aiikVar;
        this.b = aiitVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.a.b();
        } catch (Exception e) {
            advr.j(e, this.b.d, "Can't create the MSRP server session", new Object[0]);
        }
    }
}
