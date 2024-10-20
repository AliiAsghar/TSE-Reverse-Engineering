package defpackage;

import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iqo extends ijy<mnd> {
    private static final alwo a = alwo.o("BugleConversation");
    private final Runnable b;
    private final Consumer c;

    public iqo(Runnable runnable, Consumer consumer) {
        super("ConversationDisableModeCallback");
        this.b = runnable;
        this.c = consumer;
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        mnd mndVar = (mnd) obj;
        ((alwl) a.m().h("com/google/android/apps/messaging/conversation/input/disable/ConversationDisableModeCallback", "onNewData", 36, "ConversationDisableModeCallback.java")).t("ConversationDisableModeCallback#onNewData newMode %s", mndVar);
        if (mndVar == mnd.NONE) {
            this.b.run();
        } else {
            this.c.accept(mndVar);
        }
    }
}
