package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iqy extends aker {
    final /* synthetic */ ira a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqy(ira iraVar, aksr aksrVar) {
        super(aksrVar, "BaseMessageListManager.MessageContentObserver#onChange", andi.a);
        this.a = iraVar;
    }

    @Override // defpackage.aker
    public final void a(boolean z, Uri uri) {
        if (uri == null) {
            ira.a.q("BaseMessageListManager.MessageContentObserver uri=null, can't determine messageId");
            return;
        }
        List<String> pathSegments = uri.getPathSegments();
        String lastPathSegment = uri.getLastPathSegment();
        if (pathSegments.size() == upb.o(this.a.b).getPathSegments().size() + 2 && lastPathSegment != null) {
            ira iraVar = this.a;
            iraVar.e.add(rvc.b(lastPathSegment));
            this.a.d();
        }
    }
}
