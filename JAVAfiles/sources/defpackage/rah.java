package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.action.GenericWorkerQueueAction;
import com.google.android.apps.messaging.shared.datamodel.action.RefreshNotificationIfOtpFoundAction;
import com.google.android.apps.messaging.shared.datamodel.action.SanitizeParticipantsAction;
import com.google.android.apps.messaging.shared.datamodel.action.SetupExpressiveStickersAction;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateAttachmentAfterResizingAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionExecutorImpl;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rah implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ rah(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r2v58, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int size;
        String str;
        rhv rhvVar;
        int i = 8;
        int i2 = 0;
        int i3 = 7;
        int i4 = 3;
        int i5 = 1;
        switch (this.c) {
            case 0:
                ((rat) this.a).e(this.b);
                return;
            case 1:
                ((GenericWorkerQueueAction) this.a).l(this.b).k(qiu.c(new rbc(i5)), andi.a);
                return;
            case 2:
                MessageIdType messageIdType = (MessageIdType) this.b;
                ryi a = yhq.a(messageIdType);
                if (!a.d.isEmpty()) {
                    Iterator it = a.d.iterator();
                    while (it.hasNext()) {
                        int g = aqas.g(((aqby) it.next()).d);
                        if (g != 0 && g == 3) {
                            Object obj = this.a;
                            alvw g2 = RefreshNotificationIfOtpFoundAction.b.g();
                            g2.X(alwp.a, "BugleNotifications");
                            ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/datamodel/action/RefreshNotificationIfOtpFoundAction", "executeAction", 143, "RefreshNotificationIfOtpFoundAction.java")).q("Updating notification from RefreshNotificationIfOtpFoundAction");
                            ((wpp) ((RefreshNotificationIfOtpFoundAction) obj).c.b()).J();
                            return;
                        }
                    }
                    return;
                }
                xyo d = RefreshNotificationIfOtpFoundAction.a.d();
                d.H("No annotation for message. ");
                d.c(messageIdType);
                d.q();
                return;
            case 3:
                tbb f = ParticipantsTable.f();
                f.ag();
                f.aj("sanitizeParticipant");
                Object obj2 = this.b;
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj2;
                f.w(bindData.N());
                f.i(bindData.s());
                f.q(bindData.L());
                f.o(bindData.K());
                f.D(bindData.v());
                f.B(bindData.O());
                f.F(bindData.P());
                f.g(bindData.H());
                f.M(new rbw(obj2, i3));
                SanitizeParticipantsAction sanitizeParticipantsAction = (SanitizeParticipantsAction) this.a;
                if (((Boolean) sanitizeParticipantsAction.c.b()).booleanValue()) {
                    f.z(bindData.B());
                    f.C(bindData.C());
                } else {
                    f.z(vox.PROFILE_UNSPECIFIED_SOURCE);
                    f.C(vox.PROFILE_UNSPECIFIED_SOURCE);
                }
                lru.g(bindData).c(f);
                if (((Boolean) ((utz) rxr.b.get()).e()).booleanValue()) {
                    size = ((rxs) sanitizeParticipantsAction.b.b()).b(f, rya.e);
                } else if (((Boolean) ((utz) rxr.a.get()).e()).booleanValue()) {
                    size = ((rxs) sanitizeParticipantsAction.b.b()).a(f.a());
                } else {
                    size = f.a().b().size();
                }
                rxq rxqVar = (rxq) sanitizeParticipantsAction.a.b();
                if (size != 1) {
                    str = "Failed to sanitize participant.";
                } else {
                    str = "Successfully sanitized participants.";
                }
                rxqVar.m(size, str);
                return;
            case 4:
                break;
            case 5:
                ((qyj) ((rgf) this.a).d.b()).b(this.b.z());
                return;
            case 6:
                Iterator it2 = this.b.iterator();
                while (it2.hasNext()) {
                    ((uli) ((SetupExpressiveStickersAction) this.a).b.b()).e((tfh) it2.next());
                }
                return;
            case 7:
                uhl.j(((UpdateAttachmentAfterResizingAction) this.b).b, (Uri) this.a);
                return;
            case 8:
                uhl.j(((UpdateAttachmentAfterResizingAction) this.b).b, (Uri) this.a);
                return;
            case 9:
                ?? r0 = this.b;
                synchronized (((ActionExecutorImpl) this.a).k) {
                    rhvVar = (rhv) r0.poll();
                }
                rhvVar.getClass();
                rhvVar.run();
                return;
            case 10:
                ((ria) this.b).j((Action) this.a);
                return;
            case 11:
                ((hgi) this.a).n("bundle_action_serialized_params", rib.e(((Action) this.b).u));
                return;
            case 12:
                Object obj3 = this.b;
                obj3.getClass();
                Object obj4 = this.a;
                rkb rkbVar = (rkb) ((rjx) obj4).i.b();
                rkbVar.d(rkbVar.a(), rkbVar.b(), "bugleDb");
                alvw g3 = rjx.a.g();
                g3.X(alwp.a, "BugleBackup");
                ((alvg) g3.h("com/google/android/apps/messaging/shared/datamodel/backup/DatabaseBackerUpper", "copyDataFromBugleDb", 158, "DatabaseBackerUpper.kt")).q("Writing Core Backup Tables");
                long c = rjt.c("DatabaseBackerUpper::copyDataFromBugleDb#coreBackup", new quz(obj4, obj3, 2));
                alvw g4 = rjx.a.g();
                g4.X(alwp.a, "BugleBackup");
                ((alvg) g4.h("com/google/android/apps/messaging/shared/datamodel/backup/DatabaseBackerUpper", "copyDataFromBugleDb", 169, "DatabaseBackerUpper.kt")).s("Total Core Backup time: [%s]ms", arut.g(c));
                alvw g5 = rjx.a.g();
                g5.X(alwp.a, "BugleBackup");
                ((alvg) g5.h("com/google/android/apps/messaging/shared/datamodel/backup/DatabaseBackerUpper", "copyDataFromBugleDb", 173, "DatabaseBackerUpper.kt")).q("Writing Feature Backup Tables");
                long c2 = rjt.c("DatabaseBackerUpper::copyDataFromBugleDb#featueBackup", new quz(obj4, obj3, 3));
                alvw g6 = rjx.a.g();
                g6.X(alwp.a, "BugleBackup");
                ((alvg) g6.h("com/google/android/apps/messaging/shared/datamodel/backup/DatabaseBackerUpper", "copyDataFromBugleDb", 186, "DatabaseBackerUpper.kt")).s("Total Feature Backup time: [%s]ms", arut.g(c2));
                return;
            case 13:
                uin uinVar = (uin) ((rsr) this.a).D.b();
                ?? r2 = this.b;
                Uri t = r2.t();
                t.getClass();
                uinVar.a(t, r0.A.b(-1), r2.U());
                return;
            case 14:
                Object obj5 = this.a;
                Object obj6 = this.b;
                try {
                    ((MessagePartData) obj6).b.getContentResolver().delete((Uri) obj5, null, null);
                    ((MessagePartData) obj6).c.ifPresent(new rbc(10));
                    return;
                } catch (SecurityException e) {
                    MessagePartData.a.n("Unable to remove message part data content.", e);
                    return;
                }
            case 15:
                Object obj7 = this.b;
                rul rulVar = (rul) this.a;
                ConversationIdType conversationIdType = (ConversationIdType) obj7;
                rulVar.T(conversationIdType, null, rulVar.c(conversationIdType), true);
                return;
            case 16:
                ((ruq) this.a).i.e((ConversationIdType) this.b, true);
                return;
            case 17:
                ((lgg) ((rvw) this.a).d.b()).g(new rug(this.b, i3));
                return;
            case 18:
                ?? r02 = this.a;
                Object obj8 = this.b;
                MessageIdType B = r02.B();
                rwd rwdVar = (rwd) obj8;
                if (rwdVar.q(B) != null) {
                    tbo tboVar = new tbo();
                    tboVar.f("deletePartsForMessage");
                    tboVar.b(new rwb(B, i));
                    xyl.d(tboVar.d(), 0, Integer.MAX_VALUE);
                    for (MessagePartCoreData messagePartCoreData : r02.W()) {
                        messagePartCoreData.aM(B);
                        ((rvw) rwdVar.j.b()).c(messagePartCoreData, r02.z());
                    }
                    rwdVar.O(r02.z(), B, r02.J());
                    return;
                }
                return;
            case 19:
                ((lgg) ((rxc) this.a).b.b()).g(new rug(this.b, 9));
                return;
            default:
                ((lgg) ((rxc) this.b).b.b()).g(new rug(this.a, i));
                return;
        }
        while (true) {
            ?? r03 = this.b;
            if (i2 < ((alsx) r03).c) {
                Object obj9 = this.a;
                ((SanitizeParticipantsAction) obj9).d.e("SanitizeParticipantsAction#sanitizeParticipant", new rah(obj9, (ParticipantsTable.BindData) r03.get(i2), i4));
                i2++;
            } else {
                return;
            }
        }
    }

    public /* synthetic */ rah(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
