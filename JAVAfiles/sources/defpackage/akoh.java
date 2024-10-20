package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akoh implements akoi {
    private static final alvi a = alvi.m("com/google/apps/tiktok/sync/impl/NoOpSyncManager");

    @Override // defpackage.akoi
    public final ListenableFuture a() {
        ((alvg) ((alvg) a.h()).h("com/google/apps/tiktok/sync/impl/NoOpSyncManager", "poke", 18, "NoOpSyncManager.java")).q("Skipping #poke() because this is not a supported process");
        return aneh.a;
    }

    @Override // defpackage.akoi
    public final ListenableFuture b() {
        ((alvg) ((alvg) a.h()).h("com/google/apps/tiktok/sync/impl/NoOpSyncManager", "sync", 24, "NoOpSyncManager.java")).q("Skipping #sync() because this is not a supported process");
        return aneh.a;
    }
}
