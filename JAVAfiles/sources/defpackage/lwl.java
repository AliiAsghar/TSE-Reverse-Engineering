package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lwl implements lul {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/restore/listeners/ConversationRefreshListener");
    private final armf b;
    private final armf c;

    public lwl(armf armfVar, armf armfVar2) {
        armfVar.getClass();
        armfVar2.getClass();
        this.b = armfVar;
        this.c = armfVar2;
    }

    @Override // defpackage.lul
    public final akrh a() {
        return aktp.e("ConversationRefreshListener::onRestoreCompleted");
    }

    @Override // defpackage.lul
    public final void b(luk lukVar) {
        if (((phd) this.c.b()).a()) {
            UUID uuid = lukVar.a;
            alvi alviVar = a;
            alvw g = alviVar.g();
            g.X(alwp.a, "BugleBackup");
            ((alvg) g.h("com/google/android/apps/messaging/restore/listeners/ConversationRefreshListener", "onRestoreCompleted", 52, "ConversationRefreshListener.kt")).t("Restore completed - scheduling conversation metadata refresh [%s]", uuid);
            lxa lxaVar = (lxa) this.b.b();
            UUID uuid2 = lukVar.a;
            ((alwl) lxa.a.g()).t("Queueing work to refresh conversations [%s]", uuid2);
            aozy createBuilder = lwy.a.createBuilder();
            createBuilder.getClass();
            lgc.k(yyb.bX(uuid2), createBuilder);
            aozy createBuilder2 = lww.a.createBuilder();
            createBuilder2.getClass();
            apag s = createBuilder2.s();
            s.getClass();
            lww lwwVar = (lww) s;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            lwy lwyVar = (lwy) createBuilder.b;
            lwyVar.d = lwwVar;
            lwyVar.c = 7;
            lxaVar.a(lgc.i(createBuilder));
            alvw g2 = alviVar.g();
            g2.X(alwp.a, "BugleBackup");
            ((alvg) g2.h("com/google/android/apps/messaging/restore/listeners/ConversationRefreshListener", "onRestoreCompleted", 54, "ConversationRefreshListener.kt")).t("Scheduled conversation metadata refresh [%s]", uuid);
        }
    }
}
