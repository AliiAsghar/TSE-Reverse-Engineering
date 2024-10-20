package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xcm implements xcl {
    private static final alwo b = alwo.o("BugleNotifications");
    public final Context a;
    private final via c;
    private final vjs d;

    public xcm(Context context, vjs vjsVar, via viaVar) {
        this.a = context;
        this.d = vjsVar;
        this.c = viaVar;
    }

    @Override // defpackage.xcl
    public final void a() {
        if (this.c.E()) {
            this.c.D(this.d.k(new vgg(this, 3), vhu.EXHAUSTED_STORAGE_SPACE));
        } else {
            ((alwl) b.m().h("com/google/android/apps/messaging/shared/storage/notification/ExhaustedStorageSpaceNotifierImpl", "postExhaustedStorageSpaceNotification", 49, "ExhaustedStorageSpaceNotifierImpl.java")).q("Notifications disabled, won't notify");
        }
    }
}
