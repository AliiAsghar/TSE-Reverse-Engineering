package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vxc implements vxk {
    public static final alwo a = alwo.o("BugleGroupManagement");
    public static final utz b = uuh.e(uuh.b, "sync_rcs_group_period_days", 7);
    public final armf c;
    public final xnv d;
    public final vyv e;
    private final wfe f;
    private final mbl g;
    private final vyv h;

    public vxc(vyv vyvVar, vyv vyvVar2, wfe wfeVar, mbl mblVar, armf armfVar, xnv xnvVar) {
        this.e = vyvVar;
        this.h = vyvVar2;
        this.f = wfeVar;
        this.g = mblVar;
        this.c = armfVar;
        this.d = xnvVar;
    }

    private final void b() {
        this.g.e("Bugle.Rcs.Groups.Recovery.Disabled.Cause", 0);
        ((alwl) a.m().h("com/google/android/apps/messaging/shared/rcs/groups/recovery/PwqRecoverDisabledRcsGroupScheduler", "logRecoverDisabledRcsGroupChatNotReady", 210, "PwqRecoverDisabledRcsGroupScheduler.java")).q("Recover disabled RCS group disabled because Bugle is not ready to send and receive chat.");
    }

    /* JADX WARN: Type inference failed for: r9v11, types: [armf, java.lang.Object] */
    @Override // defpackage.vxk
    public final void a(ConversationIdType conversationIdType, int i, Optional optional) {
        if (i == 4) {
            this.g.c("Bugle.Rcs.Groups.Recovery.ConversationRecoveredFromTelephony.Triggered.Counts");
            alpt o = alpt.o(((xtj) this.c.b()).e());
            if (o.isEmpty()) {
                b();
                return;
            }
            aluq listIterator = o.listIterator();
            while (listIterator.hasNext()) {
                qei qeiVar = (qei) listIterator.next();
                if (!this.f.k(qeiVar)) {
                    b();
                } else {
                    ((alwl) a.m().h("com/google/android/apps/messaging/shared/rcs/groups/recovery/PwqRecoverDisabledRcsGroupScheduler", "scheduleRecoverDisabledRcsGroup", 159, "PwqRecoverDisabledRcsGroupScheduler.java")).q("Prerequisites to recover disabled RCS group conversation met. Scheduling RecoverDisabledRcsGroupHandler");
                    vyv vyvVar = this.e;
                    aozy createBuilder = vxj.a.createBuilder();
                    String a2 = conversationIdType.a();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    a2.getClass();
                    ((vxj) apagVar).c = a2;
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    vxj vxjVar = (vxj) createBuilder.b;
                    qeiVar.getClass();
                    vxjVar.d = qeiVar;
                    vxjVar.b |= 1;
                    vyvVar.f((vxj) createBuilder.s());
                }
            }
            return;
        }
        if (i == 7) {
            this.g.c("Bugle.Rcs.Groups.Recovery.ConversationDowngradedFromChatApiToVanillaRcs.Triggered.Counts");
            if (!this.f.l()) {
                b();
                return;
            }
            ((alwl) a.m().h("com/google/android/apps/messaging/shared/rcs/groups/recovery/PwqRecoverDisabledRcsGroupScheduler", "scheduleRecoverChatAPiToVanillaRcsDowngradedGroup", 179, "PwqRecoverDisabledRcsGroupScheduler.java")).q("Prerequisites to recover ChatAPI to Vanilla RCS downgraded group conversation met. Scheduling RecoverDisabledRcsGroupHandler");
            vyv vyvVar2 = this.h;
            aozy createBuilder2 = vxe.a.createBuilder();
            String a3 = conversationIdType.a();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            vxe vxeVar = (vxe) createBuilder2.b;
            a3.getClass();
            vxeVar.b = a3;
            ((uof) vyvVar2.a.b()).b(upk.a("recover_chat_api_to_vanilla_rcs_downgraded_rcs_group", (vxe) createBuilder2.s()));
            return;
        }
        alpt alptVar = (alpt) Collection.EL.stream(((xtj) this.c.b()).e()).filter(new rhq(this, optional, 7)).collect(alls.b);
        if (alptVar.isEmpty()) {
            ((alwl) a.m().h("com/google/android/apps/messaging/shared/rcs/groups/recovery/PwqRecoverDisabledRcsGroupScheduler", "scheduleRecoveryIfNeeded", 117, "PwqRecoverDisabledRcsGroupScheduler.java")).t("Recover disabled RCS group disabled because this conversation is not in a recoverable join state: %s", wcm.J(i));
        } else {
            Collection.EL.forEach(alptVar, new vxb(this, conversationIdType, 0));
        }
    }
}
