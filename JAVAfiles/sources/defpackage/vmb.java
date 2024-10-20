package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.rcs.client.lifecycle.RcsEngineLifecycleService;
import com.google.android.rcs.client.lifecycle.RcsEngineLifecycleServiceV2;
import com.google.android.rcs.client.messaging.AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.CreateGroupRequest;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vmb implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ vmb(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v133, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, vsy] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, vsy] */
    /* JADX WARN: Type inference failed for: r3v9, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.AbstractMap$SimpleEntry] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        long i;
        int i2 = 6;
        int i3 = 2;
        int i4 = 3;
        byte[] bArr = null;
        vws vwsVar = null;
        boolean z = false;
        z = false;
        int i5 = 1;
        switch (this.c) {
            case 0:
                List list = (List) albo.bQ(this.a);
                list.getClass();
                alog n = alog.n(list);
                if (n.isEmpty()) {
                    ((alwl) ((alwl) vmf.a.g()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageBlueprint", "createNotificationCreationPackage", 249, "IncomingMessageBlueprint.java")).q("No builder infos, not creating notification creation package");
                    return null;
                }
                vll vllVar = (vll) albo.bQ(this.b);
                if (vllVar == null) {
                    ((alwl) ((alwl) vmf.a.g()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageBlueprint", "createNotificationCreationPackage", 257, "IncomingMessageBlueprint.java")).q("summaryBuilderInfo is null, not creating notification creation package");
                    return null;
                }
                return new vku(n, Optional.of(vllVar));
            case 1:
                vmf vmfVar = (vmf) this.b;
                rtz rtzVar = (rtz) vmfVar.q.b();
                Object obj = this.a;
                ConversationIdType conversationIdType = (ConversationIdType) obj;
                tqc r = rtzVar.r(conversationIdType);
                if (r != null && (!yqt.a().booleanValue() ? r.e() || r.g() : r.f())) {
                    int ordinal = r.ordinal();
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5 && yqt.a().booleanValue()) {
                                ((mbl) vmfVar.o.b()).e("Bugle.Spam.Notification.Eligibility.Count", 9);
                            }
                        } else {
                            ((mbl) vmfVar.o.b()).e("Bugle.Spam.Notification.Eligibility.Count", 6);
                        }
                    } else {
                        ((mbl) vmfVar.o.b()).e("Bugle.Spam.Notification.Eligibility.Count", 5);
                    }
                    alwl alwlVar = (alwl) vmf.a.g();
                    alwlVar.X(ydl.p, obj);
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageBlueprint", "isConversationBlockedOrSpam", 829, "IncomingMessageBlueprint.java")).q("Conversation is in the blocked/spam/cross-country folder, skipping notification creation");
                } else if (Collection.EL.stream(rxq.d(conversationIdType)).anyMatch(new vmc(i5))) {
                    ((mbl) vmfVar.o.b()).e("Bugle.Spam.Notification.Eligibility.Count", 7);
                    alwl alwlVar2 = (alwl) vmf.a.g();
                    alwlVar2.X(ydl.p, obj);
                    ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageBlueprint", "isAnyConversationParticipantSpam", 858, "IncomingMessageBlueprint.java")).q("Conversation contains at least one spam participant, skipping notification creation");
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                Bundle bundle = (Bundle) this.a;
                ArrayList<String> stringArrayList = bundle.getStringArrayList("extra_im_notification_message_ids");
                stringArrayList.getClass();
                Stream map = Collection.EL.stream(stringArrayList).map(new vmd(i3));
                int i6 = alog.d;
                alog alogVar = (alog) map.collect(alls.a);
                String string = bundle.getString("extra_im_notification_conversation_id");
                string.getClass();
                long j = bundle.getLong("extra_im_notification_earliest_timestamp");
                ConversationIdType b = ruy.b(string);
                Object obj2 = ((zai) this.b).a;
                sbf q = ((ibi) ((vmu) obj2).d.b()).q(b, -1);
                sbh sbhVar = new sbh();
                alob alobVar = new alob();
                Iterator it = alogVar.iterator();
                while (it.hasNext()) {
                    alobVar.h(String.valueOf(rvc.a((MessageIdType) it.next())));
                }
                sbhVar.U(new agmf("messages._id", 3, sbh.X(alobVar.g()), true));
                q.k(new agpw(sbhVar));
                rry rryVar = (rry) Collection.EL.stream(((alog) Collection.EL.stream(((sbd) q.b().n()).cR()).map(new viu(obj2, i4)).collect(alls.a)).a()).findFirst().orElse(null);
                if (rryVar != null) {
                    aozy createBuilder = vmn.a.createBuilder();
                    if (rryVar.aC()) {
                        i = rryVar.k();
                    } else {
                        i = rryVar.i();
                    }
                    long min = Math.min(i, j);
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    vmn vmnVar = (vmn) createBuilder.b;
                    vmnVar.b |= 1;
                    vmnVar.c = min;
                    bArr = new AbstractMap.SimpleEntry(string, (vmn) createBuilder.s());
                }
                return bArr;
            case 3:
                return ((vsb) this.a).a((vsj) this.b);
            case 4:
                return ((vsd) this.a).a((vsj) this.b);
            case 5:
                return ((RcsEngineLifecycleService) this.a).triggerStartRcsStack((String) this.b);
            case 6:
                return ((RcsEngineLifecycleService) this.a).triggerStopRcsStack((String) this.b);
            case 7:
                return this.a.a((RcsEngineLifecycleServiceV2) this.b);
            case 8:
                return this.a.a((RcsEngineLifecycleServiceV2) this.b);
            case 9:
                Object obj3 = this.a;
                Object obj4 = this.b;
                return (Boolean) ((vtq) obj4).f.c("RcsGroupIdentifiersTelephonyMigrationHelper#migrateRcsGroupIdentifiersFromTelephony", new ubu(obj4, obj3, 12, bArr));
            case 10:
                return (qfb) sni.f((ConversationIdType) this.a, new vte(this.b, 5), new vtc(2));
            case 11:
                ConversationIdType conversationIdType2 = (ConversationIdType) this.a;
                if (conversationIdType2.b()) {
                    int i7 = alog.d;
                    return alsx.a;
                }
                vvr vvrVar = (vvr) this.b;
                Stream stream = Collection.EL.stream(((rtz) vvrVar.g.b()).K(conversationIdType2));
                msk mskVar = (msk) vvrVar.f.b();
                mskVar.getClass();
                Stream map2 = stream.map(new vte(mskVar, 13));
                int i8 = alog.d;
                return (List) map2.collect(alls.a);
            case 12:
                vwp vwpVar = (vwp) this.a;
                String str = vwpVar.e;
                if ((vwpVar.b & 1) != 0 && (vwsVar = vwpVar.g) == null) {
                    vwsVar = vws.a;
                }
                aozy createBuilder2 = vvb.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                Object obj5 = this.b;
                vvb vvbVar = (vvb) createBuilder2.b;
                str.getClass();
                vvbVar.d = str;
                String a = ((xwa) obj5).a.a();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                vvb vvbVar2 = (vvb) createBuilder2.b;
                a.getClass();
                vvbVar2.h = a;
                if (vwsVar != null) {
                    if ((vwsVar.b & 1) != 0) {
                        apct apctVar = vwsVar.c;
                        if (apctVar == null) {
                            apctVar = apct.a;
                        }
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        vvb vvbVar3 = (vvb) createBuilder2.b;
                        apctVar.getClass();
                        vvbVar3.f = apctVar;
                        vvbVar3.b |= 1;
                    }
                    String str2 = vwsVar.d;
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    vvb vvbVar4 = (vvb) createBuilder2.b;
                    str2.getClass();
                    vvbVar4.g = str2;
                }
                upk a2 = upk.a("update_rcs_group_name", createBuilder2.s());
                upl a3 = upm.a();
                a3.b(true);
                a3.c(false);
                a3.a = alog.r(a2);
                return a3.a();
            case 13:
                vwp vwpVar2 = (vwp) this.b;
                String str3 = vwpVar2.c;
                String str4 = vwpVar2.d;
                vsi a4 = vsj.a();
                a4.b(false);
                a4.h(true);
                a4.n(amku.GROUP_NOTIFICATION_VANILLA_RCS);
                a4.g(false);
                a4.k(str3);
                a4.j(str4);
                a4.e(vwpVar2.e);
                xwa c = ((vwo) this.a).b.c(a4.a());
                if (c == null) {
                    vwo.a.m("Conversation not found for incoming RCS group NOTIFY");
                    return Optional.empty();
                }
                return Optional.of(c);
            case 14:
                return ((rxq) ((vwy) this.a).j.b()).a((String) this.b);
            case 15:
                sng sngVar = new sng();
                sngVar.aj("YYYYY");
                sngVar.v(0);
                ConversationIdType conversationIdType3 = (ConversationIdType) this.a;
                sngVar.e(conversationIdType3);
                ((vxd) this.b).c.d(conversationIdType3);
                return upm.b();
            case 16:
                Object obj6 = this.b;
                uie uieVar = (uie) ((vyd) obj6).h.b();
                ?? r3 = this.a;
                final ConversationIdType k = uieVar.k(r3.g());
                if (k.b()) {
                    xyo e = vyd.a.e();
                    e.H("Could not get conversation from recipient destination");
                    e.H(r3.toString());
                    e.q();
                    return 0;
                }
                final sya syaVar = new sya();
                syaVar.aj("updateStatusForMessagesInLimbo#update");
                syaVar.o(false);
                syaVar.L(17);
                sxy d = MessagesTable.d();
                d.w("updateStatusForMessagesInLimbo");
                d.g(new vxg(k, i2));
                Stream w = d.b().w();
                try {
                    final vyd vydVar = (vyd) obj6;
                    Integer valueOf = Integer.valueOf(w.mapToInt(new ToIntFunction() { // from class: vyc
                        @Override // java.util.function.ToIntFunction
                        public final int applyAsInt(Object obj7) {
                            vyd vydVar2 = vyd.this;
                            MessagesTable.BindData bindData = (MessagesTable.BindData) obj7;
                            if (((ansy) ((nuj) vydVar2.t).a.b()).e("bugle.use_mark_delivery_failed_or_expired")) {
                                mlb mlbVar = (mlb) vydVar2.u.b();
                                mkw a5 = mkz.a();
                                a5.c(bindData.A());
                                a5.g(amlg.RECIPIENT_LOST_RCS);
                                a5.h(17);
                                if (mlbVar.f(a5.a())) {
                                    return 1;
                                }
                                return 0;
                            }
                            sya syaVar2 = syaVar;
                            if (((rwd) vydVar2.i.b()).O(k, bindData.A(), syaVar2)) {
                                MessageCoreData a6 = ((tqx) vydVar2.j.b()).a();
                                a6.bM(bindData);
                                ((mho) vydVar2.n.b()).U(a6);
                                return 1;
                            }
                            return 0;
                        }
                    }).sum());
                    if (w != null) {
                        w.close();
                        return valueOf;
                    }
                    return valueOf;
                } catch (Throwable th) {
                    if (w != null) {
                        try {
                            w.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            case 17:
                ?? r0 = this.b;
                int size = r0.size();
                int i9 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    i9 += ((Integer) albo.bQ((akul) r0.get(i10))).intValue();
                }
                if (i9 > 0) {
                    Object obj7 = this.a;
                    xyo a5 = vyd.a.a();
                    a5.H("Found");
                    a5.F(i9);
                    a5.H("message(s) in limbo.");
                    a5.q();
                    ((vjs) ((vyd) obj7).m.b()).h();
                }
                return null;
            case 18:
                sbf a6 = ((say) ((vyd) this.b).p.b()).a();
                a6.d((sbh) this.a);
                return a6.b().w();
            case 19:
                return ((vzd) this.a).a.addUserToGroup((AddUserToGroupRequest) this.b);
            default:
                return ((vyg) this.a).a.createGroup((CreateGroupRequest) this.b);
        }
    }

    public /* synthetic */ vmb(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
