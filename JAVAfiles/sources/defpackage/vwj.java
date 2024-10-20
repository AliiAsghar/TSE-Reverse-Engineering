package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vwj extends unp {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/backup/BackupUpgradedMmsGroupHandler");
    public static final ahka b = new ahka("BackupUpgradedMmsGroupHandlerTimer");
    public static final ahka c = new ahka("BackupUpgradedMmsGroupHandlerMemory");
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    private final arwe k;
    private final armf l;

    public vwj(arwe arweVar, armf armfVar, armf armfVar2, armf armfVar3, vyv vyvVar, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8) {
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        vyvVar.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        this.k = arweVar;
        this.d = armfVar;
        this.e = armfVar2;
        this.f = armfVar3;
        this.g = armfVar4;
        this.h = armfVar5;
        this.i = armfVar6;
        this.l = armfVar7;
        this.j = armfVar8;
    }

    private final int l(ConversationIdType conversationIdType) {
        rwd rwdVar = (rwd) this.f.b();
        sxy e = MessagesTable.e("getSuccessfullyBackedUpMessagesToTelephonyCount#query");
        e.g(new vte(conversationIdType, 14));
        e.f(wam.r());
        int i = 0;
        e.c(MessagesTable.c.s);
        alog D = rwdVar.D(e.b());
        D.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : D) {
            if (vom.a(((MessageCoreData) obj).aq())) {
                arrayList.add(obj);
            }
        }
        ArrayList<vre> arrayList2 = new ArrayList(aqjn.J(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(vrf.a(((MessageCoreData) it.next()).aq()));
        }
        if (!arrayList2.isEmpty()) {
            for (vre vreVar : arrayList2) {
                if (vreVar != null && vreVar.e.isPresent() && (((vqb) vreVar.e.get()).b & 1) != 0 && (i = i + 1) < 0) {
                    aqjn.F();
                }
            }
        }
        return i;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        a2.c(unv.WORKMANAGER_ONLY);
        a2.d((int) ((Number) this.l.b()).longValue());
        a2.g(gry.EXPONENTIAL);
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("BackupUpgradedMmsGroupHandler");
    }

    @Override // defpackage.unp
    public final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        akul c2;
        vwk vwkVar = (vwk) apbtVar;
        vwkVar.getClass();
        c2 = qjh.c(this.k, arpj.a, arwf.a, new qka(this, unsVar, vwkVar, (arpe) null, 16));
        return c2;
    }

    @Override // defpackage.unx
    public final apca e() {
        apca parserForType = vwk.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [armf, java.lang.Object] */
    public final upm j(ConversationIdType conversationIdType, vwk vwkVar, List list) {
        int i = 1;
        if (list.isEmpty()) {
            int l = l(conversationIdType);
            if (l >= vwkVar.f) {
                vco vcoVar = (vco) this.i.b();
                aozy createBuilder = amst.b.createBuilder();
                createBuilder.getClass();
                aktp.bm(((lzz) vcoVar.a.b()).a(conversationIdType), createBuilder);
                aktp.bn(7, createBuilder);
                aktp.br(createBuilder);
                vcoVar.j(aktp.bl(createBuilder));
                alvw g = a.g();
                g.X(alwp.a, "BugleGroupManagement");
                alvg alvgVar = (alvg) g;
                alvgVar.X(ydl.p, conversationIdType);
                alvg alvgVar2 = (alvg) alvgVar.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/backup/BackupUpgradedMmsGroupHandler", "onBackupCompleted", 273, "BackupUpgradedMmsGroupHandler.kt");
                int aa = a.aa(vwkVar.d);
                if (aa != 0) {
                    i = aa;
                }
                alvgVar2.t("BackupUpgradedMmsGroupHandler: Finished backing up upgraded MMS group to %s", wam.q(i));
                return upm.b();
            }
            ((vco) this.i.b()).l(conversationIdType, 8, vwkVar.f, l);
            alvw i2 = a.i();
            i2.X(alwp.a, "BugleGroupManagement");
            alvg alvgVar3 = (alvg) i2;
            alvgVar3.X(ydl.p, conversationIdType);
            alvg alvgVar4 = (alvg) alvgVar3.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/backup/BackupUpgradedMmsGroupHandler", "onBackupCompleted", 290, "BackupUpgradedMmsGroupHandler.kt");
            int aa2 = a.aa(vwkVar.d);
            if (aa2 != 0) {
                i = aa2;
            }
            alvgVar4.t("BackupUpgradedMmsGroupHandler: Finished backing up upgraded MMS group to %s, but not all messages were backed up", wam.q(i));
            return upm.d();
        }
        aozy createBuilder2 = vwk.a.createBuilder();
        createBuilder2.getClass();
        wam.l(conversationIdType.a(), createBuilder2);
        int aa3 = a.aa(vwkVar.d);
        if (aa3 == 0) {
            aa3 = 1;
        }
        wam.o(aa3, createBuilder2);
        wam.p(createBuilder2);
        wam.n(list, createBuilder2);
        wam.m(vwkVar.f, createBuilder2);
        wam.k(vwkVar.e + 1, createBuilder2);
        vwk j = wam.j(createBuilder2);
        int aa4 = a.aa(vwkVar.d);
        if (aa4 != 0) {
            i = aa4;
        }
        return upm.c(alog.r(upk.b("backup_upgraded_mms_group", j, new uta(wam.q(i), null, null, null, null, null))));
    }

    public final upm k(ConversationIdType conversationIdType, int i, vwk vwkVar) {
        String str;
        alvw i2 = a.i();
        i2.X(alwp.a, "BugleGroupManagement");
        alvg alvgVar = (alvg) i2;
        alvgVar.X(ydl.p, conversationIdType);
        alvg alvgVar2 = (alvg) alvgVar.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/backup/BackupUpgradedMmsGroupHandler", "onBackupFailed", 358, "BackupUpgradedMmsGroupHandler.kt");
        int aa = a.aa(vwkVar.d);
        if (aa == 0) {
            aa = 1;
        }
        switch (i) {
            case 1:
                str = "UNKNOWN_MMS_GROUP_CONVERSATION_BACKUP_FAILURE_REASON";
                break;
            case 2:
                str = "INVALID_PARAMETERS_MISSING_CONVERSATION_ID";
                break;
            case 3:
                str = "INVALID_PARAMETERS_UNKNOWN_CONVERSATION";
                break;
            case 4:
                str = "INVALID_PARAMETERS_CONVERSATION_NOT_RCS_GROUP";
                break;
            case 5:
                str = "INVALID_PARAMETERS_GROUP_WITHOUT_CONFERENCE_URI";
                break;
            case 6:
                str = "INVALID_PARAMETERS_NOT_ALL_MESSAGES_MMS";
                break;
            default:
                str = "CANCELLED_EXECUTION";
                break;
        }
        alvgVar2.D("BackupUpgradedMmsGroupHandler: %s Backup failed with %s reason", wam.q(aa), str);
        ((vco) this.i.b()).l(conversationIdType, i, vwkVar.f, l(conversationIdType));
        return upm.d();
    }
}
