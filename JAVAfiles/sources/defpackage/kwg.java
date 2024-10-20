package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.action.MarkAsReadAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kwg implements rhi {
    final /* synthetic */ lfl a;

    public kwg(lfl lflVar) {
        this.a = lflVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    @Override // defpackage.rhi
    public final /* bridge */ /* synthetic */ void a(rhj rhjVar, Action action, Object obj, Object obj2) {
        ((abbu) this.a.d.b()).k(R.string.mark_all_messages_as_read_confirmation);
        int a = ((MarkAsReadAction) action).u.a("total_messages_marked_as_read");
        xyo a2 = ((xze) this.a.a).a();
        a2.F(a);
        a2.H(" message(s) marked as read and/or notified");
        a2.q();
    }

    @Override // defpackage.rhi
    public final /* bridge */ /* synthetic */ void b(rhj rhjVar, Object obj, Object obj2) {
        ((xze) this.a.a).q("Failed to mark all messages as read");
    }
}
