package defpackage;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfz implements Closeable, mjc {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSourceChangeHandler");
    private final kfy b;
    private final kgd c;
    private final AtomicBoolean d = new AtomicBoolean(false);
    private final yga e;

    public kfz(kfy kfyVar, kgd kgdVar, mjd mjdVar) {
        this.b = kfyVar;
        this.c = kgdVar;
        this.e = mjdVar.c(this);
    }

    @Override // defpackage.mjc
    public final void a() {
        if (this.d.get()) {
            ((alvg) a.g().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSourceChangeHandler", "invalidate", 36, "MessageListPagingSourceChangeHandler.kt")).q("Skipping invalidate since the source is already closed");
        } else {
            if (this.b.h()) {
                ((alvg) a.g().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSourceChangeHandler", "invalidate", 40, "MessageListPagingSourceChangeHandler.kt")).q("Skipping invalidate since the source is already invalid");
                return;
            }
            ((alvg) a.g().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSourceChangeHandler", "invalidate", 43, "MessageListPagingSourceChangeHandler.kt")).q("Invalidating pagingSource due to data change");
            this.b.e();
            this.c.a = null;
        }
    }

    @Override // defpackage.mjc
    public final void b(miq miqVar, mjb mjbVar) {
        if (this.d.get()) {
            ((alvg) a.g().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSourceChangeHandler", "onChanged", 23, "MessageListPagingSourceChangeHandler.kt")).q("Skipping invalidate since the source is already closed");
        } else if (this.b.h()) {
            ((alvg) a.g().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSourceChangeHandler", "onChanged", 27, "MessageListPagingSourceChangeHandler.kt")).q("Skipping onChanged since the source is already invalid");
        } else {
            ((alvg) a.g().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSourceChangeHandler", "onChanged", 30, "MessageListPagingSourceChangeHandler.kt")).D("Invalidating pagingSource,operation %s on %s", miqVar, mjbVar);
            this.b.e();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.set(true);
        this.e.close();
    }
}
