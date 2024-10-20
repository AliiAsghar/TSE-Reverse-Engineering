package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class rji implements rhp<Void> {
    public abstract ThrottledAction b(Parcel parcel);

    @Override // defpackage.rhp
    public /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        throw null;
    }

    public abstract ThrottledAction d(boolean z, boolean z2, boolean z3, ConversationIdType conversationIdType);

    public final void e(boolean z, ConversationIdType conversationIdType) {
        rjh rjhVar = new rjh(this);
        rjhVar.c();
        rjhVar.b = conversationIdType;
        rjhVar.a = z;
        rjhVar.a().J();
    }

    public final void f() {
        rjh rjhVar = new rjh(this);
        rjhVar.b();
        rjhVar.a().J();
    }

    public final void g() {
        h(ruy.a);
    }

    public final void h(ConversationIdType conversationIdType) {
        rjh rjhVar = new rjh(this);
        rjhVar.b();
        rjhVar.c();
        rjhVar.b = conversationIdType;
        rjhVar.a().J();
    }
}
