package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xhi {
    private static final alwo a;
    private final Context b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final armf j;
    private final armf k;

    static {
        uuh.w("telephony_recipient_update_use_create_from_send_participant");
        a = alwo.o("BugleDataModel");
    }

    public xhi(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9) {
        this.b = context;
        this.c = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.f = armfVar4;
        this.g = armfVar5;
        this.h = armfVar6;
        this.i = armfVar7;
        this.j = armfVar8;
        this.k = armfVar9;
    }

    private final boolean c(xhv xhvVar, ConversationIdType conversationIdType, String str, String str2) {
        boolean A = ((yjr) this.i.b()).A(str);
        if (A) {
            alwl alwlVar = (alwl) a.g();
            alwlVar.X(ydl.o, conversationIdType.toString());
            alwlVar.X(ydl.r, xhvVar);
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/telephony/UpdateTelephonyRecipient", "hasCountryCode", 510, "UpdateTelephonyRecipient.java")).t("Recipient id %s already has country code, skipping update", str2);
        }
        return A;
    }

    public final void a(ParticipantsTable.BindData bindData, xhv xhvVar, ConversationIdType conversationIdType) {
        if (((Boolean) qpf.a.e()).booleanValue()) {
            return;
        }
        akrh e = aktp.e("UpdateTelephonyRecipient.updateTelephonyCanonicalRecipient");
        try {
            msh s = ((msk) this.d.b()).s(bindData);
            if (s.y()) {
                alwo alwoVar = a;
                ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/telephony/UpdateTelephonyRecipient", "updateTelephonyCanonicalRecipient", 129, "UpdateTelephonyRecipient.java")).t("Verifying whether the Telephony canonical recipient can be updated to E164 %s", yyb.bh(s.m()));
                String m = s.m();
                if (m == null) {
                    alwl alwlVar = (alwl) alwoVar.g();
                    alwlVar.X(ydl.o, conversationIdType.toString());
                    alwlVar.X(ydl.r, xhvVar);
                    alwlVar.X(ydl.m, bindData.M());
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/telephony/UpdateTelephonyRecipient", "updateTelephonyCanonicalRecipient", 140, "UpdateTelephonyRecipient.java")).q("MessagingIdentity.getRawDestination() is null.");
                } else {
                    xhv b = xhv.b(((wzs) this.c.b()).d(this.b, m));
                    if (!b.equals(xhvVar)) {
                        alwl alwlVar2 = (alwl) alwoVar.i();
                        alwlVar2.X(ydl.o, conversationIdType.toString());
                        alwlVar2.X(ydl.r, xhvVar);
                        alwlVar2.X(ydl.m, bindData.M());
                        ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/telephony/UpdateTelephonyRecipient", "updateTelephonyCanonicalRecipient", 155, "UpdateTelephonyRecipient.java")).t("Passed in thread id does not match the found thread id %s.", b);
                    } else {
                        String G = ((wzs) this.c.b()).G(xhvVar);
                        if (G == null) {
                            alwl alwlVar3 = (alwl) alwoVar.g();
                            alwlVar3.X(ydl.o, conversationIdType.toString());
                            alwlVar3.X(ydl.r, xhvVar);
                            ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/telephony/UpdateTelephonyRecipient", "updateTelephonyCanonicalRecipient", 167, "UpdateTelephonyRecipient.java")).q("threadIdRecipient is null.");
                        } else if (G.isEmpty()) {
                            alwl alwlVar4 = (alwl) alwoVar.g();
                            alwlVar4.X(ydl.o, conversationIdType.toString());
                            alwlVar4.X(ydl.r, xhvVar);
                            ((alwl) alwlVar4.h("com/google/android/apps/messaging/shared/telephony/UpdateTelephonyRecipient", "updateTelephonyCanonicalRecipient", 176, "UpdateTelephonyRecipient.java")).q("threadIdRecipient is empty.");
                        } else if (G.contains(" ")) {
                            alwl alwlVar5 = (alwl) alwoVar.g();
                            alwlVar5.X(ydl.o, conversationIdType.toString());
                            alwlVar5.X(ydl.r, xhvVar);
                            ((alwl) alwlVar5.h("com/google/android/apps/messaging/shared/telephony/UpdateTelephonyRecipient", "updateTelephonyCanonicalRecipient", 185, "UpdateTelephonyRecipient.java")).q("Multiple recipients returned for 1:1 conversation.");
                        } else {
                            Optional A = ((wzs) this.c.b()).A(xhvVar);
                            if (A.isEmpty()) {
                                alwl alwlVar6 = (alwl) alwoVar.g();
                                alwlVar6.X(ydl.o, conversationIdType.toString());
                                alwlVar6.X(ydl.r, xhvVar);
                                ((alwl) alwlVar6.h("com/google/android/apps/messaging/shared/telephony/UpdateTelephonyRecipient", "updateTelephonyCanonicalRecipient", 197, "UpdateTelephonyRecipient.java")).q("No messaging identity found.");
                            } else if (((alog) A.get()).isEmpty()) {
                                alwl alwlVar7 = (alwl) alwoVar.g();
                                alwlVar7.X(ydl.o, conversationIdType.toString());
                                alwlVar7.X(ydl.r, xhvVar);
                                ((alwl) alwlVar7.h("com/google/android/apps/messaging/shared/telephony/UpdateTelephonyRecipient", "updateTelephonyCanonicalRecipient", 206, "UpdateTelephonyRecipient.java")).q("List of messaging identities found for thread is empty.");
                            } else {
                                String m2 = ((msh) ((alog) A.get()).get(0)).m();
                                if (m2 == null) {
                                    alwl alwlVar8 = (alwl) alwoVar.g();
                                    alwlVar8.X(ydl.o, conversationIdType.toString());
                                    alwlVar8.X(ydl.r, xhvVar);
                                    ((alwl) alwlVar8.h("com/google/android/apps/messaging/shared/telephony/UpdateTelephonyRecipient", "updateTelephonyCanonicalRecipient", 218, "UpdateTelephonyRecipient.java")).t("Raw destination for recipient id %s is null.", G);
                                } else if (!c(xhvVar, conversationIdType, m2, G)) {
                                    int c = ((wzs) this.c.b()).c(this.b.getContentResolver(), G, m);
                                    if (c != 1) {
                                        alwl alwlVar9 = (alwl) alwoVar.g();
                                        alwlVar9.X(ydl.o, conversationIdType.toString());
                                        alwlVar9.X(ydl.r, xhvVar);
                                        ((alwl) alwlVar9.h("com/google/android/apps/messaging/shared/telephony/UpdateTelephonyRecipient", "updateTelephonyCanonicalRecipient", 241, "UpdateTelephonyRecipient.java")).r("Expected to update one canonical address row, but instead updated %s rows", c);
                                        if (c > 0) {
                                        }
                                    } else {
                                        alwl alwlVar10 = (alwl) alwoVar.g();
                                        alwlVar10.X(ydl.p, conversationIdType);
                                        alwlVar10.X(ydl.r, xhvVar);
                                        ((alwl) alwlVar10.h("com/google/android/apps/messaging/shared/telephony/UpdateTelephonyRecipient", "updateTelephonyCanonicalRecipient", 249, "UpdateTelephonyRecipient.java")).t("Successfully updated the Telephony canonical recipient to E164 %s", yyb.bh(m));
                                    }
                                    ((mbl) this.k.b()).c("Bugle.Telephony.Update.UpdateTelephonyRecipient");
                                }
                            }
                        }
                    }
                }
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [msh, java.lang.Object] */
    public final void b(ParticipantsTable.BindData bindData, xhv xhvVar, final ConversationIdType conversationIdType) {
        akrh e;
        String str;
        final Optional empty;
        if (((Boolean) qpf.a.e()).booleanValue()) {
            empty = Optional.empty();
        } else {
            e = aktp.e("UpdateTelephonyRecipient.updateTelephonyCanonicalRecipient");
            try {
                msh s = ((msk) this.d.b()).s(bindData);
                if (!s.y()) {
                    alvw m = a.m();
                    m.X(ydl.m, bindData.M());
                    m.X(ydl.r, xhvVar);
                    m.X(ydl.o, conversationIdType.toString());
                    ((alwl) m.h("com/google/android/apps/messaging/shared/telephony/UpdateTelephonyRecipient", "updateTelephonyCanonicalRecipientAndReturnCanonicalAddress", 284, "UpdateTelephonyRecipient.java")).q("Input destination is not an E164 - not updating the Telephony recipient's canonical address.");
                    empty = Optional.empty();
                } else {
                    alwo alwoVar = a;
                    ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/telephony/UpdateTelephonyRecipient", "updateTelephonyCanonicalRecipientAndReturnCanonicalAddress", 290, "UpdateTelephonyRecipient.java")).t("Verifying whether the Telephony canonical recipient can be updated to E164 %s", yyb.bh(s.m()));
                    String m2 = s.m();
                    if (m2 == null) {
                        alwl alwlVar = (alwl) alwoVar.g();
                        alwlVar.X(ydl.o, conversationIdType.toString());
                        alwlVar.X(ydl.r, xhvVar);
                        alwlVar.X(ydl.m, bindData.M());
                        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/telephony/UpdateTelephonyRecipient", "updateTelephonyCanonicalRecipientAndReturnCanonicalAddress", 301, "UpdateTelephonyRecipient.java")).q("MessagingIdentity.getRawDestination() is null.");
                        empty = Optional.empty();
                    } else {
                        xhv b = xhv.b(((wzs) this.c.b()).d(this.b, m2));
                        if (!b.equals(xhvVar)) {
                            alwl alwlVar2 = (alwl) alwoVar.i();
                            alwlVar2.X(ydl.o, conversationIdType.toString());
                            alwlVar2.X(ydl.r, xhvVar);
                            alwlVar2.X(ydl.m, bindData.M());
                            ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/telephony/UpdateTelephonyRecipient", "updateTelephonyCanonicalRecipientAndReturnCanonicalAddress", 316, "UpdateTelephonyRecipient.java")).t("Passed in thread id does not match the found thread id %s.", b);
                            empty = Optional.empty();
                        } else {
                            String G = ((wzs) this.c.b()).G(xhvVar);
                            if (G == null) {
                                alwl alwlVar3 = (alwl) alwoVar.g();
                                alwlVar3.X(ydl.o, conversationIdType.toString());
                                alwlVar3.X(ydl.r, xhvVar);
                                ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/telephony/UpdateTelephonyRecipient", "updateTelephonyCanonicalRecipientAndReturnCanonicalAddress", 328, "UpdateTelephonyRecipient.java")).q("threadIdRecipient is null.");
                                empty = Optional.empty();
                            } else if (G.isEmpty()) {
                                alwl alwlVar4 = (alwl) alwoVar.g();
                                alwlVar4.X(ydl.o, conversationIdType.toString());
                                alwlVar4.X(ydl.r, xhvVar);
                                ((alwl) alwlVar4.h("com/google/android/apps/messaging/shared/telephony/UpdateTelephonyRecipient", "updateTelephonyCanonicalRecipientAndReturnCanonicalAddress", 337, "UpdateTelephonyRecipient.java")).q("threadIdRecipient is empty.");
                                empty = Optional.empty();
                            } else if (G.contains(" ")) {
                                alwl alwlVar5 = (alwl) alwoVar.g();
                                alwlVar5.X(ydl.o, conversationIdType.toString());
                                alwlVar5.X(ydl.r, xhvVar);
                                ((alwl) alwlVar5.h("com/google/android/apps/messaging/shared/telephony/UpdateTelephonyRecipient", "updateTelephonyCanonicalRecipientAndReturnCanonicalAddress", 346, "UpdateTelephonyRecipient.java")).q("Multiple recipients returned for 1:1 conversation.");
                                empty = Optional.empty();
                            } else {
                                Optional A = ((wzs) this.c.b()).A(xhvVar);
                                if (A.isEmpty()) {
                                    alwl alwlVar6 = (alwl) alwoVar.g();
                                    alwlVar6.X(ydl.o, conversationIdType.toString());
                                    alwlVar6.X(ydl.r, xhvVar);
                                    ((alwl) alwlVar6.h("com/google/android/apps/messaging/shared/telephony/UpdateTelephonyRecipient", "updateTelephonyCanonicalRecipientAndReturnCanonicalAddress", 358, "UpdateTelephonyRecipient.java")).q("No messaging identity found.");
                                    empty = Optional.empty();
                                } else if (((alog) A.get()).isEmpty()) {
                                    alwl alwlVar7 = (alwl) alwoVar.g();
                                    alwlVar7.X(ydl.o, conversationIdType.toString());
                                    alwlVar7.X(ydl.r, xhvVar);
                                    ((alwl) alwlVar7.h("com/google/android/apps/messaging/shared/telephony/UpdateTelephonyRecipient", "updateTelephonyCanonicalRecipientAndReturnCanonicalAddress", 367, "UpdateTelephonyRecipient.java")).q("List of messaging identities found for thread is empty.");
                                    empty = Optional.empty();
                                } else {
                                    msh mshVar = (msh) ((alog) A.get()).get(0);
                                    if (!((Boolean) ((utz) rxz.b.get()).e()).booleanValue()) {
                                        str = "No messaging identity found.";
                                    } else {
                                        Optional b2 = ((qrh) this.h.b()).b();
                                        String m3 = mshVar.m();
                                        if (m3 == null) {
                                            alwl alwlVar8 = (alwl) alwoVar.g();
                                            alwlVar8.X(ydl.o, conversationIdType.toString());
                                            alwlVar8.X(ydl.r, xhvVar);
                                            ((alwl) alwlVar8.h("com/google/android/apps/messaging/shared/telephony/UpdateTelephonyRecipient", "updateTelephonyCanonicalRecipientAndReturnCanonicalAddress", 384, "UpdateTelephonyRecipient.java")).q("Telephony canonical address is null, not updating the Telephony recipient.");
                                            empty = Optional.empty();
                                        } else if (((qqs) this.e.b()).f(m2, m3, ((Integer) b2.orElse(7)).intValue(), ((yjs) this.j.b()).a()) != 4) {
                                            str = "No messaging identity found.";
                                        } else {
                                            uqg uqgVar = (uqg) this.f.b();
                                            boolean booleanValue = ((Boolean) ((utz) rxz.a.get()).e()).booleanValue();
                                            List list = ryb.a;
                                            str = "No messaging identity found.";
                                            ryb g = vcp.g(null, null, null, null, m3, m2, null, null, null, null, (arst) uqgVar.d, 16191);
                                            ((alwl) ((aluw) uqgVar.a).i()).J("Mismatch between user input and telephony canonical address found: userInputNumber = [%s], telephonyCanonicalAddress = [%s], blockedUpdate = [%s]", uqg.h(g.j), uqg.h(g.i), uqg.g(String.valueOf(booleanValue)));
                                            if (((Boolean) ((utz) rxz.a.get()).e()).booleanValue()) {
                                                alwl alwlVar9 = (alwl) alwoVar.g();
                                                alwlVar9.X(ydl.p, conversationIdType);
                                                alwlVar9.X(ydl.r, xhvVar);
                                                ((alwl) alwlVar9.h("com/google/android/apps/messaging/shared/telephony/UpdateTelephonyRecipient", "updateTelephonyCanonicalRecipientAndReturnCanonicalAddress", 416, "UpdateTelephonyRecipient.java")).q("Mismatch found, blocking update of the Telephony recipient.");
                                                empty = Optional.empty();
                                            }
                                        }
                                    }
                                    String m4 = mshVar.m();
                                    if (m4 == null) {
                                        alwl alwlVar10 = (alwl) alwoVar.g();
                                        alwlVar10.X(ydl.o, conversationIdType.toString());
                                        alwlVar10.X(ydl.r, xhvVar);
                                        ((alwl) alwlVar10.h("com/google/android/apps/messaging/shared/telephony/UpdateTelephonyRecipient", "updateTelephonyCanonicalRecipientAndReturnCanonicalAddress", 429, "UpdateTelephonyRecipient.java")).t("Raw destination for recipient id %s is null.", G);
                                        empty = Optional.empty();
                                    } else {
                                        if (!c(xhvVar, conversationIdType, m4, G)) {
                                            int c = ((wzs) this.c.b()).c(this.b.getContentResolver(), G, m2);
                                            if (c != 1) {
                                                alwl alwlVar11 = (alwl) alwoVar.g();
                                                alwlVar11.X(ydl.o, conversationIdType.toString());
                                                alwlVar11.X(ydl.r, xhvVar);
                                                ((alwl) alwlVar11.h("com/google/android/apps/messaging/shared/telephony/UpdateTelephonyRecipient", "updateTelephonyCanonicalRecipientAndReturnCanonicalAddress", 452, "UpdateTelephonyRecipient.java")).r("Expected to update one canonical address row, but instead updated %s rows", c);
                                                if (c > 0) {
                                                }
                                            } else {
                                                alwl alwlVar12 = (alwl) alwoVar.g();
                                                alwlVar12.X(ydl.p, conversationIdType);
                                                alwlVar12.X(ydl.r, xhvVar);
                                                ((alwl) alwlVar12.h("com/google/android/apps/messaging/shared/telephony/UpdateTelephonyRecipient", "updateTelephonyCanonicalRecipientAndReturnCanonicalAddress", 460, "UpdateTelephonyRecipient.java")).t("Successfully updated the Telephony canonical recipient to E164 %s", yyb.bh(m2));
                                            }
                                            ((mbl) this.k.b()).c("Bugle.Telephony.Update.UpdateTelephonyRecipient");
                                        }
                                        Optional A2 = ((wzs) this.c.b()).A(xhvVar);
                                        if (!A2.isEmpty() && !((alog) A2.get()).isEmpty()) {
                                            String m5 = ((msh) ((alog) A2.get()).get(0)).m();
                                            if (m5 == null) {
                                                alwl alwlVar13 = (alwl) alwoVar.g();
                                                alwlVar13.X(ydl.o, conversationIdType.toString());
                                                alwlVar13.X(ydl.r, xhvVar);
                                                ((alwl) alwlVar13.h("com/google/android/apps/messaging/shared/telephony/UpdateTelephonyRecipient", "updateTelephonyCanonicalRecipientAndReturnCanonicalAddress", 489, "UpdateTelephonyRecipient.java")).q("Telephony canonical address's raw destination is null, not updating the Telephony recipient.");
                                                empty = Optional.empty();
                                            } else {
                                                empty = Optional.of(m5);
                                            }
                                        }
                                        alwl alwlVar14 = (alwl) alwoVar.g();
                                        alwlVar14.X(ydl.o, conversationIdType.toString());
                                        alwlVar14.X(ydl.r, xhvVar);
                                        ((alwl) alwlVar14.h("com/google/android/apps/messaging/shared/telephony/UpdateTelephonyRecipient", "updateTelephonyCanonicalRecipientAndReturnCanonicalAddress", 478, "UpdateTelephonyRecipient.java")).q(str);
                                        empty = Optional.empty();
                                    }
                                }
                            }
                        }
                    }
                }
                e.close();
            } finally {
            }
        }
        final rxz rxzVar = (rxz) this.g.b();
        e = aktp.e("UpdateBugleParticipantAndConversations.updateBugleParticipantToMoreCanonicalAndCompareTelephonyCanonicalAddress");
        try {
            final Optional c2 = rxzVar.c(bindData);
            if (!c2.isEmpty()) {
                ((alwl) ((alwl) rxz.c.g()).h("com/google/android/apps/messaging/shared/datamodel/data/participant/UpdateBugleParticipantAndConversations", "updateBugleParticipantToMoreCanonicalAndCompareTelephonyCanonicalAddress", 384, "UpdateBugleParticipantAndConversations.java")).t("Verifying whether the Bugle participant can be updated to E164 %s", yyb.bh(c2.get().m()));
                rxy rxyVar = (rxy) rxzVar.g.c("UpdateBugleParticipantAndConversations#updateBugleParticipantToMoreCanonicalAndCompareTelephonyCanonicalAddress", new alhr() { // from class: rxu
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:26:0x01e6  */
                    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Type inference failed for: r3v1, types: [msh, java.lang.Object] */
                    @Override // defpackage.alhr
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object get() {
                        /*
                            Method dump skipped, instructions count: 865
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.rxu.get():java.lang.Object");
                    }
                });
                if (rxyVar != null) {
                    rxzVar.e(rxyVar, conversationIdType, bindData);
                }
            }
            e.close();
        } finally {
        }
    }
}
