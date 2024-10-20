package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Optional;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qot implements qos {
    public static final alwo a = alwo.o("BugleBCM");
    public static final utz b = uuh.i(uuh.b, "update_thread_id_for_conversation", true);
    public static final utz c = uuh.i(uuh.b, "log_update_thread_id_for_conversation", true);
    public final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final Optional j;
    private final Context k;

    public qot(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, Optional optional, Context context) {
        this.e = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.d = armfVar4;
        this.h = armfVar5;
        this.i = armfVar6;
        this.j = optional;
        this.k = context;
    }

    public static void c(smr smrVar, xhv xhvVar) {
        alwo alwoVar = a;
        ((alwl) alwoVar.m().h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "updateThreadIdForConversationInternal", 256, "ConversationThreadIdGetterImpl.java")).J("BCM updating conversationId=%s, existingThreadId=%s, newThreadId=%s", smrVar.x(), smrVar.F(), xhvVar);
        if (xhvVar.d()) {
            ((alwl) ((alwl) alwoVar.i()).h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "updateThreadIdForConversationInternal", 261, "ConversationThreadIdGetterImpl.java")).J("BCM updating conversationId=%s error, telephony did not return a valid thread, existingThreadId=%s, newThreadId=%s", smrVar.x(), smrVar.F(), xhvVar);
            return;
        }
        sng sngVar = new sng();
        sngVar.aj("updateThreadIdForConversationInternal");
        sngVar.R(xhvVar);
        sngVar.e(smrVar.x());
    }

    private final xhv d(String str) {
        return new xhv(((wzs) this.f.b()).f(this.k, wxr.a, str));
    }

    private final xhv e(String str) {
        return new xhv(((wzs) this.f.b()).f(this.k, wxr.a, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v15, types: [xhv] */
    /* JADX WARN: Type inference failed for: r8v16, types: [xhv] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    private final xhv f(String str, boolean z, smr smrVar) {
        String str2;
        if (((Boolean) qpf.a.e()).booleanValue()) {
            try {
                if (z) {
                    str = d(str);
                } else {
                    str = e(str);
                }
            } catch (RuntimeException e) {
                ((mbl) this.i.b()).e("Bugle.ConversationThreadIdGetterImpl.FindThreadForConversation.TelephonyLookupRetry.Count", 1);
                alwl alwlVar = (alwl) ((alwl) a.i()).g(e);
                alwlVar.Z(alwk.FULL);
                alwl alwlVar2 = (alwl) alwlVar.h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "getRcsThreadId", 344, "ConversationThreadIdGetterImpl.java");
                if (true != z) {
                    str2 = "RCS group";
                } else {
                    str2 = "RBM";
                }
                alwlVar2.t("getOrCreateThreadId for %s failed with exception, attempting retry", str2);
                try {
                    if (z) {
                        str = d(str);
                    } else {
                        str = e(str);
                    }
                    ((mbl) this.i.b()).e("Bugle.ConversationThreadIdGetterImpl.FindThreadForConversation.TelephonyLookupRetry.Count", 2);
                } catch (RuntimeException e2) {
                    alwl alwlVar3 = (alwl) ((alwl) a.i()).g(e2);
                    alwlVar3.Z(alwk.FULL);
                    ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "getRcsThreadId", 353, "ConversationThreadIdGetterImpl.java")).t("getOrCreateThreadId retry failed for %s failed with exception. Returning threadId from conversation", str2);
                    str = smrVar.F();
                    h(str);
                }
            }
        } else if (z) {
            str = d(str);
        } else {
            str = e(str);
        }
        ((alwl) a.m().h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "getRcsThreadId", 366, "ConversationThreadIdGetterImpl.java")).D("RCS group conversationId=%s, threadId=%s", smrVar.x(), str);
        return str;
    }

    private final xhv g(alog alogVar) {
        return new xhv(((wzs) this.f.b()).g(this.k, wxr.a, (Collection) Collection.EL.stream(alogVar).filter(new nfp(14)).map(new qcq(13)).collect(alls.b)));
    }

    private static void h(xhv xhvVar) {
        if (xhvVar.d()) {
            ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "checkThreadIdIsKnown", 451, "ConversationThreadIdGetterImpl.java")).q("getOrCreateThreadId resolved threadId to -1");
        }
    }

    @Override // defpackage.qos
    public final xhv a(ConversationIdType conversationIdType) {
        albo.T(!aiut.g());
        smr a2 = sni.a(conversationIdType);
        if (a2 == null) {
            ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "getOrCreateThreadIdForConversation", 136, "ConversationThreadIdGetterImpl.java")).t("Conversation query returned null for conversation [%s]", conversationIdType);
            return new xhv();
        }
        albo.C(a2);
        return b(a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v41, types: [armf, java.lang.Object] */
    @Override // defpackage.qos
    public final xhv b(smr smrVar) {
        xhv F;
        boolean z;
        boolean z2;
        albo.T(!aiut.g());
        int h = smrVar.h();
        if (!tvu.d(h) && !tvu.f(h)) {
            if (tvu.e(h)) {
                F = f(((vxp) this.g.b()).a(albo.ag(smrVar.W()), albo.ag(smrVar.V()), smrVar.P()), false, smrVar);
            } else {
                throw new UnsupportedOperationException("Unknown conversation type, type=" + h + ", conversationId=" + String.valueOf(smrVar.x()));
            }
        } else {
            alog t = ush.h(smrVar.x()).t();
            if (smrVar.ac()) {
                albo.y(!t.isEmpty());
                if (((alsx) t).c < 2) {
                    z = true;
                } else {
                    z = false;
                }
                albo.y(z);
                if (((ParticipantsTable.BindData) t.get(0)).n() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                albo.y(z2);
                F = f(((vqq) this.e.b()).f(yyb.cT((ParticipantsTable.BindData) t.get(0))), true, smrVar);
            } else if (!((Boolean) qpf.a.e()).booleanValue()) {
                F = g(t);
            } else {
                try {
                    F = g(t);
                } catch (RuntimeException e) {
                    ((mbl) this.i.b()).e("Bugle.ConversationThreadIdGetterImpl.FindThreadForConversation.TelephonyLookupRetry.Count", 1);
                    alwl alwlVar = (alwl) ((alwl) a.i()).g(e);
                    alwlVar.Z(alwk.FULL);
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "findThreadForXmsConversation", 388, "ConversationThreadIdGetterImpl.java")).q("getOrCreateThreadId for XMS failed with exception, attempting retry");
                    try {
                        F = g(t);
                        ((mbl) this.i.b()).e("Bugle.ConversationThreadIdGetterImpl.FindThreadForConversation.TelephonyLookupRetry.Count", 2);
                    } catch (RuntimeException e2) {
                        alwl alwlVar2 = (alwl) ((alwl) a.i()).g(e2);
                        alwlVar2.Z(alwk.FULL);
                        ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "findThreadForXmsConversation", 396, "ConversationThreadIdGetterImpl.java")).q("getOrCreateThreadId retry failed for XMS failed with exception. Returning threadId from conversation");
                        F = smrVar.F();
                    }
                    ((alwl) a.m().h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "findThreadForXmsConversation", 403, "ConversationThreadIdGetterImpl.java")).D("XMS conversationId=%s, threadId=%s", smrVar.x(), F);
                    h(F);
                }
            }
        }
        if (((Boolean) b.e()).booleanValue() && !F.equals(smrVar.F())) {
            this.j.ifPresent(new qdm(smrVar, 4));
            if (((Boolean) c.e()).booleanValue()) {
                if (!F.equals(smrVar.F())) {
                    ((alwl) a.m().h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "updateThreadIdForConversation", 236, "ConversationThreadIdGetterImpl.java")).J("Scheduling ConversationThreadIdUpdaterWorker. conversationId=%s, existingThreadId=%s, newThreadId=%s", smrVar.x(), smrVar.F(), F);
                    rdc rdcVar = (rdc) this.h.b();
                    aozy createBuilder = apla.a.createBuilder();
                    String a2 = smrVar.x().a();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apla aplaVar = (apla) createBuilder.b;
                    a2.getClass();
                    aplaVar.b = a2;
                    long a3 = F.a();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ((apla) createBuilder.b).c = a3;
                    ((uof) rdcVar.a.b()).a(upk.a("conversation_thread_id_updater_worker", (apla) createBuilder.s()));
                }
            } else {
                c(smrVar, F);
            }
        }
        return F;
    }
}
