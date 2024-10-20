package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ycz extends dyl {
    final /* synthetic */ ydc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycz(ydc ydcVar) {
        super(null);
        this.a = ydcVar;
    }

    @Override // defpackage.dyl
    public final void d(Throwable th) {
        if (th != null) {
            alvw i = ydc.a.i();
            i.X(alwp.a, "Bugle");
            ((alvg) ((alvg) ((alvg) i).g(th)).h("com/google/android/apps/messaging/shared/util/emoji/EmojiUtils$1", "onFailed", 'i', "EmojiUtils.java")).q("EmojiCompat initialization failed");
        } else {
            alvw i2 = ydc.a.i();
            i2.X(alwp.a, "Bugle");
            ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/util/emoji/EmojiUtils$1", "onFailed", 107, "EmojiUtils.java")).q("EmojiCompat initialization failed (unknown error)");
        }
    }

    @Override // defpackage.dyl
    public final void e() {
        alvw d = ydc.a.d();
        d.X(alwp.a, "Bugle");
        ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/util/emoji/EmojiUtils$1", "onInitialized", 98, "EmojiUtils.java")).q("EmojiCompat initialized");
        this.a.b = ejx.b();
    }
}
