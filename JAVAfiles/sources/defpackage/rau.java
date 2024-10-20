package defpackage;

import android.net.Uri;
import android.os.PowerManager;
import com.google.android.apps.messaging.shared.datamodel.action.InsertRcsMessageInTelephonyAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessConversationParticipantsUpdateAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessConversationUpdateAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessMessageUpdateAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessUserAlertAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.RebuildShortcutsAction;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveSmsMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.ResumeRcsFileTransferAction;
import com.google.android.apps.messaging.shared.datamodel.action.SetupExpressiveStickersAction;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rau implements algk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rau(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r3v26, types: [rvm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        aour aourVar;
        int i;
        int i2;
        Object apply;
        boolean z;
        int i3 = 2;
        boolean z2 = true;
        switch (this.b) {
            case 0:
                uuf uufVar = InsertRcsMessageInTelephonyAction.a;
                return this.a;
            case 1:
                ?? r0 = this.a;
                ttl.d(r0);
                return r0;
            case 2:
                List list = (List) obj;
                ((ProcessConversationParticipantsUpdateAsyncAction) this.a).c.e("Bugle.Ditto.Action.Success.Metrics.Counts", 18);
                return list;
            case 3:
                aqdu aqduVar = (aqdu) obj;
                ((ProcessConversationUpdateAsyncAction) this.a).c.e("Bugle.Ditto.Action.Success.Metrics.Counts", 16);
                return aqduVar;
            case 4:
                xze xzeVar = ProcessConversationUpdateAsyncAction.a;
                aozy aozyVar = (aozy) this.a;
                aozyVar.aS((List) obj);
                return (anfu) aozyVar.s();
            case 5:
                xze xzeVar2 = ProcessConversationUpdateAsyncAction.a;
                aozy aozyVar2 = (aozy) this.a;
                aozyVar2.aT((anfr) obj);
                return (anfu) aozyVar2.s();
            case 6:
                Object obj2 = this.a;
                ((aljg) ProcessMessageUpdateAsyncAction.b).a.putAll(alzz.af(DesugarCollections.unmodifiableList(((angn) ((aozy) obj2).b).b), new qyv(8)));
                return null;
            case 7:
                aqdu aqduVar2 = (aqdu) obj;
                ((ProcessMessageUpdateAsyncAction) this.a).j.e("Bugle.Ditto.Action.Success.Metrics.Counts", 14);
                return aqduVar2;
            case 8:
                aqdu aqduVar3 = (aqdu) obj;
                ((ProcessUserAlertAsyncAction) this.a).d.e("Bugle.Ditto.Action.Success.Metrics.Counts", 20);
                return aqduVar3;
            case 9:
                ((RebuildShortcutsAction) this.a).b.a();
                return null;
            case 10:
                return ((rfa) this.a).c((res) obj);
            case 11:
                ret retVar = (ret) obj;
                if (retVar != null) {
                    ReceiveSmsMessageAction receiveSmsMessageAction = (ReceiveSmsMessageAction) this.a;
                    receiveSmsMessageAction.b.h(receiveSmsMessageAction.b.d(retVar, null));
                }
                return null;
            case 12:
                alvw i4 = ResumeRcsFileTransferAction.a.i();
                i4.X(alwp.a, "BugleDataModel");
                alvg alvgVar = (alvg) i4;
                ?? r3 = this.a;
                alvgVar.X(ydl.b, r3.B());
                alvgVar.X(ydl.f, r3.E());
                ((alvg) ((alvg) alvgVar.g((xpt) obj)).h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeDownloadForChatApi", 387, "ResumeRcsFileTransferAction.java")).q("Cannot resume download for rcs file transfer.");
                return rfo.DOWNLOAD_RESUME_FAILED;
            case 13:
                alvw d = ResumeRcsFileTransferAction.a.d();
                d.X(alwp.a, "BugleDataModel");
                alvg alvgVar2 = (alvg) d;
                ?? r6 = this.a;
                alvgVar2.X(ydl.b, r6.B());
                alvgVar2.X(ydl.f, r6.E());
                alvgVar2.X(xod.a, ((xpr) obj).a);
                ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "startDownloadForChatApi", 408, "ResumeRcsFileTransferAction.java")).q("Manual download successfully queued.");
                return rfo.DOWNLOAD_START_SUCCESS;
            case 14:
                alvw i5 = ResumeRcsFileTransferAction.a.i();
                i5.X(alwp.a, "BugleDataModel");
                alvg alvgVar3 = (alvg) ((alvg) i5).g((xpt) obj);
                ?? r2 = this.a;
                alvgVar3.X(ydl.b, r2.B());
                alvgVar3.X(ydl.f, r2.E());
                ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "startDownloadForChatApi", 419, "ResumeRcsFileTransferAction.java")).q("Cannot start manual download.");
                return rfo.DOWNLOAD_START_FAILED;
            case 15:
                List list2 = (List) obj;
                ArrayList arrayList = new ArrayList();
                int size = list2.size() - 1;
                while (true) {
                    Object obj3 = this.a;
                    if (size >= 0) {
                        aouy aouyVar = (aouy) list2.get(size);
                        String str = aouyVar.b;
                        aour aourVar2 = aouyVar.d;
                        if (aourVar2 == null) {
                            aourVar2 = aour.a;
                        }
                        SetupExpressiveStickersAction setupExpressiveStickersAction = (SetupExpressiveStickersAction) obj3;
                        Uri l = setupExpressiveStickersAction.l(str, aourVar2.b);
                        if (l != null) {
                            aour aourVar3 = aouyVar.d;
                            if (aourVar3 == null) {
                                aourVar3 = aour.a;
                            }
                            aouq aouqVar = aourVar3.d;
                            if (aouqVar == null) {
                                aouqVar = aouq.a;
                            }
                            int i6 = aouqVar.b;
                            aour aourVar4 = aouyVar.d;
                            if (aourVar4 == null) {
                                aourVar = aour.a;
                            } else {
                                aourVar = aourVar4;
                            }
                            aouq aouqVar2 = aourVar.d;
                            if (aouqVar2 == null) {
                                aouqVar2 = aouq.a;
                            }
                            int i7 = aouqVar2.c;
                            String str2 = aouyVar.b;
                            if (aourVar4 == null) {
                                aourVar4 = aour.a;
                            }
                            if (i6 > 0) {
                                i = i6;
                            } else {
                                i = -1;
                            }
                            if (i7 > 0) {
                                i2 = i7;
                            } else {
                                i2 = -1;
                            }
                            arrayList.add(ucm.b(str2, l, ubh.a(aourVar4), i, i2, setupExpressiveStickersAction.d.f().toEpochMilli()));
                        }
                        size--;
                    } else {
                        if (!arrayList.isEmpty()) {
                            ((SetupExpressiveStickersAction) obj3).f.e("SetupExpressiveStickersAction#saveAsDefaultRecentItems", new rah(obj3, arrayList, 6));
                            return null;
                        }
                        ((SetupExpressiveStickersAction) obj3).g.d(4);
                        throw new IllegalStateException("Failed to download any recent stickers");
                    }
                }
            case 16:
                SetupExpressiveStickersAction setupExpressiveStickersAction2 = (SetupExpressiveStickersAction) this.a;
                setupExpressiveStickersAction2.c.h("is_expressive_stickers_setup_done", true);
                aozy createBuilder = aodd.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                airh airhVar = setupExpressiveStickersAction2.g;
                ((aodd) createBuilder.b).b = aode.a(42);
                airhVar.a((aodd) createBuilder.s());
                ((aiqj) setupExpressiveStickersAction2.e.b()).h();
                return null;
            case 17:
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) obj;
                if (wakeLock != null) {
                    try {
                        wakeLock.release();
                    } catch (RuntimeException e) {
                        Object obj4 = this.a;
                        alvw g = rhv.a.g();
                        g.X(alwp.a, "BugleDataModel");
                        ((alvg) ((alvg) ((alvg) g).g(e)).h("com/google/android/apps/messaging/shared/datamodel/action/execution/ActionRunnable", "releaseWakeLock", 175, "ActionRunnable.java")).t("%s took so long that the OS released the wakelock before it finished", ((rhv) obj4).f);
                    }
                }
                return null;
            case 18:
                snt sntVar = new snt();
                sntVar.f("DataUpgradeHandler#doDowngrade");
                ?? r32 = this.a;
                apply = new ruw(r32, i3).apply(new sny());
                sntVar.a = new agpw((sny) apply);
                if (sntVar.d() != 0) {
                    return null;
                }
                throw new IllegalStateException("failed to delete DataUpgrader " + r32.a().a() + " after downgrade");
            case 19:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Object obj5 = this.a;
                if (booleanValue) {
                    aozy aozyVar3 = (aozy) obj5;
                    if (!aozyVar3.b.isMutable()) {
                        aozyVar3.u();
                    }
                    amfo amfoVar = (amfo) aozyVar3.b;
                    amfo amfoVar2 = amfo.a;
                    amfoVar.c = 1;
                    amfoVar.b |= 1;
                } else {
                    aozy aozyVar4 = (aozy) obj5;
                    if (!aozyVar4.b.isMutable()) {
                        aozyVar4.u();
                    }
                    amfo amfoVar3 = (amfo) aozyVar4.b;
                    amfo amfoVar4 = amfo.a;
                    amfoVar3.c = 2;
                    amfoVar3.b |= 1;
                }
                return (amfo) ((aozy) obj5).s();
            default:
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return true;
                }
                Object obj6 = this.a;
                apao apaoVar = ((aqhz) optional.get()).b;
                trz trzVar = (trz) ((tsp) obj6).j.b();
                if (apaoVar.contains(Integer.valueOf(vbe.ETOUFFEE.g)) && apaoVar.contains(Integer.valueOf(vbe.ETOUFFEE_GROUPS.g))) {
                    z = true;
                } else {
                    z = false;
                }
                if (z != trzVar.i()) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
        }
    }
}
