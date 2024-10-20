package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vqz {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/rcs/TransactionIdFactory");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v25, types: [msh, java.lang.Object] */
    public static String a(MessageCoreData messageCoreData, String str, smr smrVar) {
        boolean z;
        String str2 = "";
        boolean z2 = true;
        if (smrVar.h() == 2 && str != null) {
            if (anfi.a("bugle.enable_mms_group_upgrade_passive_upgrader", "bugle") && messageCoreData.cB()) {
                String ag = albo.ag(messageCoreData.aq());
                if (!vom.a(ag)) {
                    alvw d = a.d();
                    d.X(alwp.a, "BugleRcs");
                    alvg alvgVar = (alvg) d;
                    alvgVar.X(ydl.p, smrVar.x());
                    alvgVar.X(ydl.b, messageCoreData.B());
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/rcs/TransactionIdFactory", "createTransactionIdStringForMmsMessageInUpgradedGroup", 117, "TransactionIdFactory.java")).q("Trying to add RcsGroup info to non-serialized transactionId");
                    if (smrVar.P() != null) {
                        str2 = smrVar.P();
                    }
                    ag = vrf.c(ag, str2);
                }
                vre a2 = vrf.a(ag);
                if (a2 != null && !a2.e.isEmpty()) {
                    Object obj = a2.e.get();
                    aozy h = vrf.h(albo.ag(smrVar.W()), albo.ag(smrVar.V()), smrVar.P(), str);
                    aozy builder = ((apag) obj).toBuilder();
                    if (!builder.b.isMutable()) {
                        builder.u();
                    }
                    vqb vqbVar = (vqb) builder.b;
                    vqd vqdVar = (vqd) h.s();
                    vqdVar.getClass();
                    vqbVar.e = vqdVar;
                    vqbVar.b |= 1;
                    aozy createBuilder = vqa.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    vqa vqaVar = (vqa) createBuilder.b;
                    vqb vqbVar2 = (vqb) builder.s();
                    vqbVar2.getClass();
                    vqaVar.d = vqbVar2;
                    vqaVar.c = 3;
                    return vrf.e((vqa) createBuilder.s());
                }
                alvw i = a.i();
                i.X(alwp.a, "BugleRcs");
                alvg alvgVar2 = (alvg) i;
                alvgVar2.X(ydl.p, smrVar.x());
                alvgVar2.X(ydl.b, messageCoreData.B());
                ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/rcs/TransactionIdFactory", "createTransactionIdStringForMmsMessageInUpgradedGroup", 128, "TransactionIdFactory.java")).q("Cannot add RcsGroup info to non-serialized transactionId");
                return messageCoreData.aq();
            }
            rve E = messageCoreData.E();
            String ag2 = albo.ag(smrVar.W());
            String ag3 = albo.ag(smrVar.V());
            String P = smrVar.P();
            String d2 = d(messageCoreData);
            Optional Z = messageCoreData.Z();
            aozy h2 = vrf.h(ag2, ag3, P, str);
            aozy createBuilder2 = vqe.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            vqe vqeVar = (vqe) createBuilder2.b;
            vqd vqdVar2 = (vqd) h2.s();
            vqdVar2.getClass();
            vqeVar.d = vqdVar2;
            vqeVar.c = 2;
            if (E.k()) {
                String str3 = E.b;
                albo.C(str3);
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ((vqe) createBuilder2.b).e = str3;
            }
            if (d2 != null) {
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                vqe vqeVar2 = (vqe) createBuilder2.b;
                vqeVar2.b |= 2;
                vqeVar2.g = d2;
            }
            return vrf.e((vqa) vrf.g(Z, createBuilder2).s());
        }
        if (smrVar.ac()) {
            alog t = ush.h(smrVar.x()).t();
            albo.y(!t.isEmpty());
            if (((alsx) t).c < 2) {
                z = true;
            } else {
                z = false;
            }
            albo.y(z);
            if (((ParticipantsTable.BindData) t.get(0)).n() != 1) {
                z2 = false;
            }
            albo.y(z2);
            wyj cT = yyb.cT((ParticipantsTable.BindData) t.get(0));
            rve E2 = messageCoreData.E();
            String d3 = d(messageCoreData);
            Optional Z2 = messageCoreData.Z();
            Object obj2 = cT.b;
            Object obj3 = cT.a;
            Object obj4 = cT.c;
            alhr alhrVar = vrf.a;
            aozy createBuilder3 = vqc.a.createBuilder();
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            apag apagVar = createBuilder3.b;
            obj4.getClass();
            ((vqc) apagVar).d = (String) obj4;
            if (obj2 != null) {
                if (!apagVar.isMutable()) {
                    createBuilder3.u();
                }
                ((vqc) createBuilder3.b).b = (String) obj2;
            }
            if (obj3 != null) {
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                ((vqc) createBuilder3.b).c = (String) obj3;
            }
            vqc vqcVar = (vqc) createBuilder3.s();
            aozy createBuilder4 = vqe.a.createBuilder();
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            vqe vqeVar3 = (vqe) createBuilder4.b;
            vqcVar.getClass();
            vqeVar3.d = vqcVar;
            vqeVar3.c = 3;
            if (E2.k()) {
                String str4 = E2.b;
                albo.C(str4);
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                ((vqe) createBuilder4.b).e = str4;
            }
            if (d3 != null) {
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                vqe vqeVar4 = (vqe) createBuilder4.b;
                vqeVar4.b |= 2;
                vqeVar4.g = d3;
            }
            return vrf.e((vqa) vrf.g(Z2, createBuilder4).s());
        }
        qei qeiVar = null;
        if (messageCoreData.ac().isPresent()) {
            qeiVar = (qei) messageCoreData.ac().get().e().orElse(null);
        }
        rve E3 = messageCoreData.E();
        apwq V = messageCoreData.V();
        String d4 = d(messageCoreData);
        Optional Z3 = messageCoreData.Z();
        alhr alhrVar2 = vrf.a;
        if (E3.i()) {
            return "";
        }
        String str5 = E3.b;
        albo.C(str5);
        aozy createBuilder5 = vqe.a.createBuilder();
        if (!createBuilder5.b.isMutable()) {
            createBuilder5.u();
        }
        apag apagVar2 = createBuilder5.b;
        ((vqe) apagVar2).e = str5;
        if (d4 != null) {
            if (!apagVar2.isMutable()) {
                createBuilder5.u();
            }
            vqe vqeVar5 = (vqe) createBuilder5.b;
            vqeVar5.b = 2 | vqeVar5.b;
            vqeVar5.g = d4;
        }
        if (((Boolean) ((utz) yig.U.get()).e()).booleanValue() && qeiVar != null && vom.f(qeiVar, V)) {
            Optional i2 = wam.i(V, vxt.RCS_PENPAL_NAMESPACE, "PENPAL-COUNTERPARTY-NUMBER");
            if (i2.isPresent()) {
                aozy createBuilder6 = vpx.a.createBuilder();
                Object obj5 = i2.get();
                if (!createBuilder6.b.isMutable()) {
                    createBuilder6.u();
                }
                ((vpx) createBuilder6.b).b = (String) obj5;
                vpx vpxVar = (vpx) createBuilder6.s();
                if (!createBuilder5.b.isMutable()) {
                    createBuilder5.u();
                }
                vqe vqeVar6 = (vqe) createBuilder5.b;
                vpxVar.getClass();
                vqeVar6.f = vpxVar;
                vqeVar6.b |= 1;
            }
        }
        return vrf.e((vqa) vrf.g(Z3, createBuilder5).s());
    }

    public static String b(MessageCoreData messageCoreData, smr smrVar) {
        String aq = messageCoreData.aq();
        if (vom.a(aq)) {
            return aq;
        }
        return a(messageCoreData, smrVar.U(), smrVar);
    }

    public static byte[] c(MessageCoreData messageCoreData, String str, smr smrVar) {
        return a(messageCoreData, str, smrVar).getBytes(StandardCharsets.US_ASCII);
    }

    private static String d(MessageCoreData messageCoreData) {
        return uzz.a(messageCoreData.V());
    }
}
