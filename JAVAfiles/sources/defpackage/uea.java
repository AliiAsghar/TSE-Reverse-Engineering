package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import com.google.android.ims.rcsservice.group.GroupInfo;
import com.google.android.ims.rcsservice.group.UserInfo;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uea implements Supplier {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public uea(ScheduledSendTable.BindData bindData, int i) {
        this.b = i;
        this.a = bindData;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v31, types: [uuf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.util.List, java.lang.Object] */
    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.b) {
            case 0:
                return ((ueb) this.a).j();
            case 1:
                return ((ueb) this.a).m();
            case 2:
                return ((ueb) this.a).k();
            case 3:
                return (amnl) ((aozy) this.a).s();
            case 4:
                return this.a;
            case 5:
                return (utz) this.a.get();
            case 6:
                int i = uzj.a;
                amfx amfxVar = (amfx) amfy.a.createBuilder();
                amfxVar.getClass();
                ahlp ahlpVar = new ahlp(amfxVar);
                this.a.a(ahlpVar);
                apag s = ((aozy) ahlpVar.a).s();
                s.getClass();
                return (amfy) s;
            case 7:
                aozy createBuilder = aqfn.a.createBuilder();
                asku askuVar = asku.PHONE_NUMBER;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((aqfn) createBuilder.b).b = askuVar.a();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj = this.a;
                apag apagVar = createBuilder.b;
                ((aqfn) apagVar).d = "RCS";
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                vgm vgmVar = ((vbq) obj).h;
                aqfn aqfnVar = (aqfn) createBuilder.b;
                String str = vgmVar.a;
                str.getClass();
                aqfnVar.c = str;
                return (aqfn) createBuilder.s();
            case 8:
                return (String) this.a.e();
            case 9:
                return ((vcv) this.a).e();
            case 10:
                return this.a;
            case 11:
                return this.a;
            case 12:
                vqw vqwVar = (vqw) this.a;
                Stream map = Collection.EL.stream(((adjc) vqwVar.o.b()).o()).map(new vmd(10));
                psq psqVar = (psq) vqwVar.p.b();
                psqVar.getClass();
                return map.map(new viu(psqVar, 12)).findFirst();
            case 13:
                return ((ryg) ((vqw) this.a).h.b()).d();
            case 14:
                vsj vsjVar = (vsj) this.a;
                Optional optional = vsjVar.g;
                alwo alwoVar = vsg.a;
                d.t(optional.isPresent(), "RCS group ID must be provided when getting or creating a group conversation");
                Optional optional2 = vsjVar.l;
                d.t(optional2.isPresent(), "RCS group participants must be provided when getting or creating a group conversation");
                GroupInfo groupInfo = new GroupInfo();
                groupInfo.a((String) optional.get());
                vsjVar.h.ifPresent(new vra(groupInfo, 17));
                groupInfo.a = (String) vsjVar.i.orElse(null);
                ?? r0 = optional2.get();
                alob alobVar = new alob();
                Iterator it = r0.iterator();
                while (it.hasNext()) {
                    String O = ((ParticipantsTable.BindData) it.next()).O();
                    if (O != null) {
                        alobVar.h(new UserInfo(O));
                    }
                }
                groupInfo.b = alobVar.g();
                return groupInfo;
            case 15:
                alwl alwlVar = (alwl) vtn.a.i();
                alwlVar.X(ydl.o, ((ConversationIdType) this.a).toString());
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/rcs/groups/database/RcsGroupDatabaseOperations", "rcsGroupIsReadyToBeUsedSync", 72, "RcsGroupDatabaseOperations.java")).q("No conversation data found while checking whether RCS group has valid global identifiers.");
                return false;
            case 16:
                alwl alwlVar2 = (alwl) vtq.a.i();
                alwlVar2.X(ydl.o, ((ConversationIdType) this.a).toString());
                ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/rcs/groups/datamigration/RcsGroupIdentifiersTelephonyMigrationActuator", "migrateRcsGroupIdentifiersFromTelephony", 116, "RcsGroupIdentifiersTelephonyMigrationActuator.java")).q("No conversation data found while attempting to migrate RCS group identifiers from Telephony.");
                return false;
            case 17:
                return ((via) ((vyt) this.a).b.b()).a();
            case 18:
                return ((xnv) this.a).f();
            case 19:
                return ((wnn) this.a).d();
            default:
                MessageIdType messageIdType = ((ScheduledSendTable.BindData) this.a).b;
                if (messageIdType == null || messageIdType.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((ScheduledSendTable.BindData) this.a).b));
        }
    }

    public /* synthetic */ uea(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
