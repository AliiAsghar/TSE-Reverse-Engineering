package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ptb {
    public static final alwo a = alwo.o("Bugle");
    public final psz b;
    public final anen c;
    public final qsa d;
    public final qsa e;
    private final msk f;
    private final armf g;
    private final psw h;

    public ptb(psz pszVar, msk mskVar, anen anenVar, armf armfVar, psw pswVar, qsa qsaVar, qsa qsaVar2) {
        this.b = pszVar;
        this.f = mskVar;
        this.c = anenVar;
        this.g = armfVar;
        this.h = pswVar;
        this.d = qsaVar2;
        this.e = qsaVar;
    }

    public final msh a(String str) {
        return this.f.r(str);
    }

    public final akul b(msh mshVar, MessageCoreData messageCoreData) {
        akul e;
        akrh e2 = aktp.e("RcsContactsCacheRefresher::refreshCapabilitiesForMessageProtocolAndCacheMismatch");
        try {
            boolean y = rvx.y(messageCoreData.d());
            ConversationIdType z = messageCoreData.z();
            if (this.h.a()) {
                e = aktp.aj(new pta(this, z, y, mshVar, 1), this.c).h(new psf(5), andi.a);
            } else {
                e = aktp.aj(new pta(this, z, y, mshVar, 0), this.c).e(psx.class, new psf(6), this.c);
            }
            e2.close();
            return e;
        } catch (Throwable th) {
            try {
                e2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean c(ConversationIdType conversationIdType, boolean z) {
        smr q = ((rtz) this.g.b()).q(conversationIdType);
        if (q == null) {
            ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/chatapi/capabilities/RcsContactsCacheRefresher", "shouldCheckCachedCapabilities", 196, "RcsContactsCacheRefresher.java")).t("Could not check cached capabilities, conversation data for conversationId=%s is null", conversationIdType);
            return false;
        }
        if ((!z && q.p() == 2) || !tvu.d(q.h()) || q.ac()) {
            return false;
        }
        return true;
    }
}
