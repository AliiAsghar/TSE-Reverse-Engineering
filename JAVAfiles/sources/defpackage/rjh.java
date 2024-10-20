package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rjh {
    public boolean a;
    public ConversationIdType b = ruy.a;
    final /* synthetic */ rji c;
    private boolean d;
    private boolean e;

    public rjh(rji rjiVar) {
        this.c = rjiVar;
    }

    public final ThrottledAction a() {
        return this.c.d(this.d, this.e, this.a, this.b);
    }

    public final void b() {
        this.e = true;
    }

    public final void c() {
        this.d = true;
    }
}
