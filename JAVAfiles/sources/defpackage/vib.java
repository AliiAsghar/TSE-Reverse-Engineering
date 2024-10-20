package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.rcs.availability.metrics.RcsAvailabilityLogWorker;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vib implements Callable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ vib(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v114, types: [xvu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v116, types: [xvu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, via] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, via] */
    /* JADX WARN: Type inference failed for: r7v0, types: [armf, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = 5;
        int i2 = 2;
        boolean z = true;
        int i3 = 0;
        switch (this.b) {
            case 0:
                aiut.b();
                wyp wypVar = (wyp) ((aaya) this.a).b.b();
                aiut.b();
                aiut.b();
                return ((vjs) wypVar.c).l(new iie(wypVar, ((xwx) wypVar.d).a((Context) wypVar.e, ((xvc) wypVar.b).s(null, null, ((msk) wypVar.a.b()).f(), null, false, true, false), wypVar.f.d().a.getWidth(), wypVar.f.d().a.getHeight()), i2), vhu.AUTOMOVED_SPAM, new vie(wypVar, true ? 1 : 0));
            case 1:
                alvw g = vfv.c.g();
                g.X(alwp.a, "BugleNetwork");
                alvg alvgVar = (alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "onAppBackgroundingInternal", 371, "BindHandlerImpl.java");
                Object obj = this.a;
                vfv vfvVar = (vfv) obj;
                alvgVar.t("%s BindHandler: App backgrounded. Refresh the idle timer.", akec.aD(vfvVar.E));
                synchronized (vfvVar.m) {
                    ScheduledFuture scheduledFuture = ((vfv) obj).o;
                    if (scheduledFuture != null && !scheduledFuture.isDone()) {
                        ((vfv) obj).h();
                    }
                }
                return null;
            case 2:
                ArrayList arrayList = new ArrayList();
                while (true) {
                    ?? r2 = this.a;
                    if (i3 < ((alsx) r2).c) {
                        arrayList.add((upm) albo.bQ((akul) r2.get(i3)));
                        i3++;
                    } else {
                        return vka.k(arrayList);
                    }
                }
            case 3:
                alwo alwoVar = vka.a;
                if (((AtomicBoolean) this.a).get()) {
                    ((alwl) ((alwl) vka.a.g()).h("com/google/android/apps/messaging/shared/notification2o/CreateNotificationHandler", "notify", 569, "CreateNotificationHandler.java")).q("Notification cancelled while processing, refreshing notifications");
                    return upm.e();
                }
                return upm.b();
            case 4:
                vka vkaVar = (vka) this.a;
                if (vkaVar.i.isPresent() && ((yxc) ((armf) vkaVar.i.get()).b()).a() == 1) {
                    ((alwl) ((alwl) vka.a.g()).h("com/google/android/apps/messaging/shared/notification2o/CreateNotificationHandler", "shouldShowNotification", 660, "CreateNotificationHandler.java")).q("Notification disabled for TMO Digits-enabled wear device");
                    return false;
                }
                if (vkaVar.j.isPresent() && !((yww) ((armf) vkaVar.j.get()).b()).a()) {
                    ((alwl) ((alwl) vka.a.g()).h("com/google/android/apps/messaging/shared/notification2o/CreateNotificationHandler", "shouldShowNotification", 670, "CreateNotificationHandler.java")).q("Notification disabled for wear device");
                    return false;
                }
                if (!vkaVar.n.d()) {
                    ((alwl) ((alwl) vka.a.g()).h("com/google/android/apps/messaging/shared/notification2o/CreateNotificationHandler", "shouldShowNotification", 676, "CreateNotificationHandler.java")).q("Notification disabled as it's not default sms app");
                    return false;
                }
                return Boolean.valueOf(vkaVar.b.g());
            case 5:
                alwo alwoVar2 = vlw.a;
                alob alobVar = new alob();
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    vke vkeVar = (vke) albo.bQ((akul) it.next());
                    if (vkeVar != null) {
                        alobVar.h(vkeVar);
                    }
                }
                return alobVar.g();
            case 6:
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = this.a.iterator();
                while (it2.hasNext()) {
                    vkn vknVar = (vkn) albo.bQ((akul) it2.next());
                    if (vknVar != null) {
                        arrayList2.add(vknVar);
                    }
                }
                return arrayList2;
            case 7:
                aozy createBuilder = vmq.a.createBuilder();
                Iterator it3 = this.a.iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) albo.bQ((akul) it3.next());
                    if (entry != null) {
                        createBuilder.V((String) entry.getKey(), (vmn) entry.getValue());
                    }
                }
                return (vmq) createBuilder.s();
            case 8:
                RcsAvailabilityLogWorker rcsAvailabilityLogWorker = (RcsAvailabilityLogWorker) this.a;
                rcsAvailabilityLogWorker.c(((vrn) ((xyt) rcsAvailabilityLogWorker.f.b()).a()).x(), Optional.empty());
                return new gsw();
            case 9:
                return Boolean.valueOf(vtn.a((ConversationIdType) this.a));
            case 10:
                alwo alwoVar3 = vtr.a;
                ?? r0 = this.a;
                int size = r0.size();
                int i4 = 0;
                while (i3 < size) {
                    if (!((Boolean) albo.bQ((akul) r0.get(i3))).booleanValue()) {
                        i4++;
                    }
                    i3++;
                }
                alog alogVar = (alog) r0;
                ((alwl) vtr.a.m().h("com/google/android/apps/messaging/shared/rcs/groups/datamigration/RcsGroupIdentifiersTelephonyMigrationHandler", "processPendingWorkItemAsync", 132, "RcsGroupIdentifiersTelephonyMigrationHandler.java")).J("Finished RCS group identifiers Telephony data batch migration. Migration attempted count: %d. Success count: %d. Failed count: %d", Integer.valueOf(alogVar.size()), Integer.valueOf(alogVar.size() - i4), Integer.valueOf(i4));
                if (i4 == 0) {
                    return upm.b();
                }
                return upm.d();
            case 11:
                return ((vbu) this.a).k();
            case 12:
                vum vumVar = (vum) this.a;
                qwm d = vumVar.d.d();
                final long epochMilli = vumVar.c.f().toEpochMilli();
                snf e = sni.e();
                e.w("getAllActiveRcsGroups");
                e.q();
                smu smuVar = sni.c;
                e.c(smuVar.a, smuVar.M);
                e.h(new vrx(19));
                alog t = e.b().t();
                vumVar.h.c("Bugle.Groups.MarkedLeft.Count");
                alsx alsxVar = (alsx) t;
                ((alwl) ((alwl) vum.a.g()).h("com/google/android/apps/messaging/shared/rcs/groups/leave/MarkAllRcsGroupsAsLeftHandler", "processPendingWorkItemAsync", 103, "MarkAllRcsGroupsAsLeftHandler.java")).r("Marking %d groups as left.", alsxVar.c);
                int i5 = alsxVar.c;
                while (i3 < i5) {
                    smr smrVar = (smr) t.get(i3);
                    final ConversationIdType x = smrVar.x();
                    final long s = smrVar.s();
                    final vum vumVar2 = vumVar;
                    final qwm qwmVar = d;
                    vumVar.f.e("MarkAllRcsGroupsAsLeftHandler#processPendingWorkItemAsync", new Runnable() { // from class: vul
                        @Override // java.lang.Runnable
                        public final void run() {
                            vum vumVar3 = vum.this;
                            ujv ujvVar = vumVar3.e;
                            qwm qwmVar2 = qwmVar;
                            long j = epochMilli;
                            ConversationIdType conversationIdType = x;
                            ujvVar.g(qwmVar2, j, conversationIdType, s, BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED);
                            ((rtz) vumVar3.b.b()).M(conversationIdType);
                            vumVar3.f.h(new rxa(14), null, new ung(vumVar3, conversationIdType, 18, null));
                        }
                    });
                    i3++;
                    vumVar = vumVar;
                    d = d;
                }
                return upm.b();
            case 13:
                aozy createBuilder2 = amks.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                Object obj2 = this.a;
                apag apagVar = createBuilder2.b;
                amks amksVar = (amks) apagVar;
                amksVar.b = 2 | amksVar.b;
                vup vupVar = (vup) obj2;
                amksVar.d = vupVar.a;
                if (!apagVar.isMutable()) {
                    createBuilder2.u();
                }
                boolean z2 = vupVar.b;
                amks amksVar2 = (amks) createBuilder2.b;
                amksVar2.b = 1 | amksVar2.b;
                amksVar2.c = z2;
                return (amks) createBuilder2.s();
            case 14:
                return Integer.valueOf(((yyt) ((zap) this.a).c).Q(vqk.t));
            case 15:
                snf e2 = sni.e();
                e2.w("getConversationData");
                e2.c(new smv[0]);
                e2.h(new vte(this.a, 16));
                return (smr) ((sna) e2.b().n()).cO();
            case 16:
                alwo alwoVar4 = vxd.a;
                snf e3 = sni.e();
                e3.w("RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler#getConversation");
                e3.e(new vvi(i));
                e3.h(new vte(this.a, 20));
                return Optional.ofNullable((smr) ((sna) e3.b().n()).cO());
            case 17:
                alwo alwoVar5 = vxh.a;
                snf e4 = sni.e();
                e4.w("RecoverdisabledRcsGroupHandler#getConversation-conversations1");
                smu smuVar2 = sni.c;
                e4.c(smuVar2.a, smuVar2.b, smuVar2.aa, smuVar2.ab, smuVar2.N);
                e4.h(new vxg(this.a, true ? 1 : 0));
                return Optional.ofNullable((smr) ((sna) e4.b().n()).cO());
            case 18:
                return this.a.b();
            case 19:
                return Integer.valueOf(this.a.a());
            default:
                if (!aczv.J() || !((wih) ((wka) this.a).c.b()).a().equals(wiz.TOGGLE_STATE_USER_DISABLED)) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
