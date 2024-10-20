package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBuglePartialMessageId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mtr {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/api/messaging/message/BuglePagingClipToBounds");
    public final arqr b;
    private final anen c;
    private final boolean d;
    private final lxe e;

    public mtr(lxe lxeVar, anen anenVar, mtn mtnVar, boolean z) {
        this.e = lxeVar.n(z);
        this.c = anenVar;
        this.b = new gxy(mtnVar, 5);
        this.d = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void f(boolean z, String str) {
        if (!z) {
            alvw i = a.i();
            i.X(alwp.a, "BugleMapi");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePagingClipToBounds", "checkConsistency", 329, "BuglePagingClipToBounds.java")).t("PagingClipToBounds check consistency failed: %s", str);
        }
    }

    public final alog a(alog alogVar, int i, int i2) {
        int min = Math.min(i2, alogVar.size());
        if (i < 0) {
            alvw g = a.g();
            g.X(alwp.a, "BugleMapi");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePagingClipToBounds", "subList", 303, "BuglePagingClipToBounds.java")).q("Correcting clip to bounds newStart, previously was out of bounds");
            i = 0;
        }
        alvw g2 = a.g();
        g2.X(alwp.a, "BugleMapi");
        ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePagingClipToBounds", "subList", 307, "BuglePagingClipToBounds.java")).J("clipping message list, newStart: %d, newEnd (exclusive) %d, list's size: %d", Integer.valueOf(i), Integer.valueOf(min), Integer.valueOf(alogVar.size()));
        return alogVar.subList(i, min);
    }

    public final boolean b(alog alogVar) {
        if (!this.d || alogVar.size() < 2) {
            return false;
        }
        if (!(((miz) alogVar.get(0)).b() instanceof CoreBuglePartialMessageId) && !(((miz) alzz.aO(alogVar)).b() instanceof CoreBuglePartialMessageId)) {
            return false;
        }
        return true;
    }

    public final void c(nae naeVar, int i) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (naeVar.b >= 0) {
            z = true;
        } else {
            z = false;
        }
        f(z, "PagingResults itemsBefore cannot be negative");
        if (naeVar.c >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        f(z2, "PagingResults itemsAfter cannot be negative");
        if (naeVar.a.size() >= i || naeVar.c == 0 || naeVar.b == 0) {
            z3 = true;
        }
        f(z3, "PagingResults cannot have remaining items before and after if the returned list's size is less than the limit requested.");
    }

    public final akul d(alog alogVar, int i, boolean z) {
        int i2 = 0;
        if (!b(alogVar)) {
            alvw d = a.d();
            d.X(alwp.a, "BugleMapi");
            ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePagingClipToBounds", "clip", 61, "BuglePagingClipToBounds.java")).J("returning message list without clipping, offset: %d, limit %d, list's size: %d", 0, Integer.valueOf(i), Integer.valueOf(alogVar.size()));
            return aktp.ag(alogVar);
        }
        miz mizVar = (miz) alogVar.get(0);
        if (!(mizVar.b() instanceof CoreBuglePartialMessageId)) {
            return aktp.ag(a(alogVar, 0, i));
        }
        CoreBuglePartialMessageId coreBuglePartialMessageId = (CoreBuglePartialMessageId) mizVar.b();
        return this.e.g((BugleConversationId) mizVar.d(), coreBuglePartialMessageId.a, coreBuglePartialMessageId.b, mizVar.h().toEpochMilli(), z).h(new mtq(this, alogVar, i, i2), this.c);
    }

    public final akul e(nae naeVar, int i, int i2) {
        if (b(naeVar.a)) {
            alog alogVar = naeVar.a;
            miz mizVar = (miz) alogVar.get(0);
            if (!(mizVar.b() instanceof CoreBuglePartialMessageId)) {
                nae naeVar2 = new nae(a(alogVar, 0, i2), naeVar.b, naeVar.c + Math.max(0, naeVar.a.size() - i2), this.b);
                c(naeVar2, i2);
                return aktp.ag(naeVar2);
            }
            CoreBuglePartialMessageId coreBuglePartialMessageId = (CoreBuglePartialMessageId) mizVar.b();
            return this.e.g((BugleConversationId) mizVar.d(), coreBuglePartialMessageId.a, coreBuglePartialMessageId.b, mizVar.h().toEpochMilli(), false).h(new mtp(this, i, alogVar, i2, naeVar, 0), this.c);
        }
        c(naeVar, i2);
        return aktp.ag(naeVar);
    }
}
