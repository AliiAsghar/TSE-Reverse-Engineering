package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yda extends dyp {
    public yda() {
        super(null);
    }

    @Override // defpackage.dyp
    public final void a(Throwable th) {
        alvw i = ydc.a.i();
        i.X(alwp.a, "Bugle");
        ((alvg) ((alvg) ((alvg) i).g(th)).h("com/google/android/apps/messaging/shared/util/emoji/EmojiUtils$2", "onFailed", 'z', "EmojiUtils.java")).q("emoji2 EmojiCompat initialization failed");
    }

    @Override // defpackage.dyp
    public final void b() {
        alvw d = ydc.a.d();
        d.X(alwp.a, "Bugle");
        ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/util/emoji/EmojiUtils$2", "onInitialized", 116, "EmojiUtils.java")).q("emoji2 EmojiCompat initialized");
    }
}
