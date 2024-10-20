package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewn extends Thread {
    final /* synthetic */ ewo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ewn(ewo ewoVar) {
        super("ExoPlayer:SimpleDecoder");
        this.a = ewoVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (this.a.o());
    }
}
