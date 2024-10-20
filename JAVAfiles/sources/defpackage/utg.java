package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class utg extends xzq {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ Runnable c;
    final /* synthetic */ ahmv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public utg(ahmv ahmvVar, int i, String str, Runnable runnable) {
        super("Bugle.Async.Compose.updateMessageTextStats.Duration");
        this.a = i;
        this.b = str;
        this.c = runnable;
        this.d = ahmvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.l(this.a, this.b);
        xzw.d(this.c);
    }
}
