package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.InsertNewMessageAction;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class wno implements ancs {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ wno(InsertNewMessageAction insertNewMessageAction, int i, int i2, amgj amgjVar, rat ratVar, int i3) {
        this.f = i3;
        this.d = insertNewMessageAction;
        this.a = i;
        this.b = i2;
        this.e = amgjVar;
        this.c = ratVar;
    }

    /* JADX WARN: Type inference failed for: r11v6, types: [wnp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        if (this.f != 0) {
            final MessageCoreData messageCoreData = (MessageCoreData) obj;
            Object obj2 = this.c;
            Object obj3 = this.e;
            final int i = this.b;
            final int i2 = this.a;
            final InsertNewMessageAction insertNewMessageAction = (InsertNewMessageAction) this.d;
            final amgj amgjVar = (amgj) obj3;
            final rat ratVar = (rat) obj2;
            return (ListenableFuture) insertNewMessageAction.d.b(new alhr() { // from class: rab
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v1, types: [armf, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v11, types: [armf, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v16, types: [java.util.concurrent.Executor, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object, ocb] */
                /* JADX WARN: Type inference failed for: r2v34, types: [armf, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v39, types: [java.util.concurrent.Executor, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, ocb] */
                /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, ocb] */
                /* JADX WARN: Type inference failed for: r4v37, types: [java.lang.Object, ocb] */
                @Override // defpackage.alhr
                public final Object get() {
                    alhr alhrVar;
                    boolean m;
                    rto z;
                    amgj amgjVar2;
                    MessageCoreData messageCoreData2 = messageCoreData;
                    if (messageCoreData2 == null) {
                        ((alwl) ((alwl) InsertNewMessageAction.a.i()).h("com/google/android/apps/messaging/shared/datamodel/action/InsertNewMessageAction", "runActionAsync", 475, "InsertNewMessageAction.java")).q("InsertNewMessageAction: Failed to create MessageData.");
                        return aktp.ag(null);
                    }
                    final InsertNewMessageAction insertNewMessageAction2 = InsertNewMessageAction.this;
                    if (((pde) insertNewMessageAction2.g.g.b()).a()) {
                        rto z2 = ((uac) insertNewMessageAction2.b.b()).z(messageCoreData2.z());
                        z = z2;
                        alhrVar = insertNewMessageAction2.g(messageCoreData2, z2);
                        m = ((rat) insertNewMessageAction2.i.b()).m(messageCoreData2);
                    } else {
                        alhr g = insertNewMessageAction2.g(messageCoreData2, null);
                        alhrVar = g;
                        m = ((rat) insertNewMessageAction2.i.b()).m(messageCoreData2);
                        z = ((uac) insertNewMessageAction2.b.b()).z(messageCoreData2.z());
                    }
                    amgj amgjVar3 = amgjVar;
                    final int i3 = i;
                    if (z != null) {
                        rat ratVar2 = (rat) insertNewMessageAction2.i.b();
                        if (amgjVar3 != null) {
                            amgjVar2 = amgjVar3;
                        } else {
                            amgjVar2 = amgj.UNKNOWN_BUGLE_MESSAGE_SOURCE;
                        }
                        final Integer c = ratVar2.c(z, messageCoreData2, i2, i3, amgjVar2);
                        if (c != null) {
                            int intValue = c.intValue();
                            akrh e = aktp.e("InsertNewMessageAction::canEarlySend");
                            try {
                                if (messageCoreData2.cI() && !messageCoreData2.cM() && !messageCoreData2.bZ() && ((messageCoreData2.u() == null || insertNewMessageAction2.g.e.a()) && !insertNewMessageAction2.u.y("has_rbm_bot_recipient") && ((qyj) insertNewMessageAction2.f.b()).c(messageCoreData2.z()))) {
                                    if (((wfe) insertNewMessageAction2.h.b()).m(intValue)) {
                                        if (((Boolean) ((utz) yig.Q.get()).e()).booleanValue() && !insertNewMessageAction2.g.e.a()) {
                                            List list = (List) alhrVar.get();
                                            if (list.size() <= 2) {
                                                Iterator it = list.iterator();
                                                while (it.hasNext()) {
                                                    if (((msh) it.next()).z()) {
                                                    }
                                                }
                                            }
                                        }
                                        e.close();
                                        if (insertNewMessageAction2.g.e.a()) {
                                            final rto rtoVar = z;
                                            final boolean z3 = m;
                                            final alhr alhrVar2 = alhrVar;
                                            return ((lru) insertNewMessageAction2.g.h.b()).k(messageCoreData2, (List) alhrVar.get()).h(new algk() { // from class: rac
                                                @Override // defpackage.algk
                                                public final Object apply(Object obj4) {
                                                    InsertNewMessageAction.this.j((MessageCoreData) obj4, rtoVar, c.intValue(), i3, z3, alhrVar2);
                                                    return null;
                                                }
                                            }, insertNewMessageAction2.g.c);
                                        }
                                        insertNewMessageAction2.j(messageCoreData2, z, c.intValue(), i3, m, alhrVar);
                                        return aktp.ag(null);
                                    }
                                }
                                e.close();
                            } finally {
                            }
                        }
                    }
                    rat ratVar3 = ratVar;
                    if (insertNewMessageAction2.g.e.a()) {
                        return ((lru) insertNewMessageAction2.g.h.b()).k(messageCoreData2, (List) alhrVar.get()).h(new rad(insertNewMessageAction2, ratVar3, amgjVar3, i3, m, 0), insertNewMessageAction2.g.c);
                    }
                    DeviceData deviceData = (DeviceData) insertNewMessageAction2.u.h("secondary_device");
                    MessageUsageStatisticsData messageUsageStatisticsData = (MessageUsageStatisticsData) insertNewMessageAction2.u.h("message_usage_stats_data");
                    rhl rhlVar = insertNewMessageAction2.u;
                    rhl rhlVar2 = insertNewMessageAction2.u;
                    rhl rhlVar3 = insertNewMessageAction2.u;
                    long d = rhlVar.d("sent_realtime");
                    int b = rhlVar.b("sub_id", -1);
                    boolean z4 = rhlVar2.z("update_draft", true);
                    String l = rhlVar3.l("archive");
                    boolean z5 = rhlVar3.z("should_refresh_notification", false);
                    rhl rhlVar4 = insertNewMessageAction2.u;
                    ratVar3.f(new rag(insertNewMessageAction2, messageCoreData2, deviceData, messageUsageStatisticsData, amgjVar3, d, b, i3, z4, l, z5, rhlVar4.y("from_notification"), rhlVar4.y("has_rbm_bot_recipient"), false, m, null));
                    return aktp.ag(null);
                }
            });
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i3 = this.a;
        ?? r1 = this.e;
        Object obj4 = this.c;
        if (booleanValue) {
            ?? r11 = this.d;
            wnq.a.l("The message is an OTP");
            return r11.fO(r1, i3).h(new woc(1), ((wnq) obj4).c);
        }
        return ((wnq) obj4).a((String) r1, i3, this.b + 1);
    }

    public /* synthetic */ wno(wnq wnqVar, wnp wnpVar, String str, int i, int i2, int i3) {
        this.f = i3;
        this.c = wnqVar;
        this.d = wnpVar;
        this.e = str;
        this.a = i;
        this.b = i2;
    }
}
