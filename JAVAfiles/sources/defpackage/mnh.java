package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mnh implements ngo {
    private final anen a;
    private final sne b;
    private final BugleConversationId c;

    public mnh(anen anenVar, sne sneVar, BugleConversationId bugleConversationId) {
        this.a = anenVar;
        this.b = sneVar;
        this.c = bugleConversationId;
    }

    @Override // defpackage.ngo
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final mnd d() {
        return b(this.b.t());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final mnd b(alog alogVar) {
        boolean z;
        if (alogVar.isEmpty()) {
            alwl alwlVar = (alwl) mni.a.i();
            alwlVar.X(ydl.o, this.c.a.toString());
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/conversation/compose/disable/database/DatabaseConversationDisableModeObserver$ConversationDisableModeResultSupplier", "transformToConversationDisableMode", 144, "DatabaseConversationDisableModeObserver.java")).q("No conversation found for ConversationDisableModeResultSupplier");
            return mnd.NONE;
        }
        if (alogVar.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        albo.X(z, "Multiple conversations with id %s found", this.c);
        qpd w = ((smr) alogVar.get(0)).w();
        int ordinal = w.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            throw new AssertionError(w.a() + " is not a defined ConversationErrorState?");
                        }
                        throw new IllegalStateException("UNRECOGNIZED ConversationErrorState");
                    }
                } else {
                    return mnd.RCS_GROUP_CREATED_TOO_LARGE;
                }
            } else {
                return mnd.RCS_GROUP_SELF_ONLY;
            }
        }
        return mnd.NONE;
    }

    @Override // defpackage.ngo
    public final akul c() {
        return this.b.s().h(new mds(this, 13), this.a);
    }
}
