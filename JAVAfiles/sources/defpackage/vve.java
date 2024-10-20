package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vve implements vvp {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/MmsGroupUpgradeBackupScheduler");
    public static final ahka b = new ahka("MmsGroupUpgradeBackupSchedulerTimer");
    public static final ahka c = new ahka("MmsGroupUpgradeBackupSchedulerMemory");
    public final armf d;
    public final armf e;
    public final armf f;
    private final arwe g;

    public vve(arwe arweVar, armf armfVar, armf armfVar2, armf armfVar3) {
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        this.g = arweVar;
        this.d = armfVar;
        this.e = armfVar2;
        this.f = armfVar3;
    }

    @Override // defpackage.vvp
    public final akul a(ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        return qjh.j(this.g, new vpi(this, conversationIdType, (arpe) null, 2));
    }
}
