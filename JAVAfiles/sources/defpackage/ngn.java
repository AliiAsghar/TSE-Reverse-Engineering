package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ngn extends aker {
    private final qdq a;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public ngn(grn grnVar, qdq qdqVar) {
        super((aksr) grnVar.a, "ContentObserverManager notified", grnVar.d);
        this.a = qdqVar;
    }

    @Override // defpackage.aker
    public final void a(boolean z, Uri uri) {
        Object obj = this.a.a;
        ((ndi) obj).h.y(new mau(obj, uri, 8), "ConversationParticipantsChanged");
    }
}
