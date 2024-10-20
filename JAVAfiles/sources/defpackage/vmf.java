package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vmf extends vkh {
    public static final alwo a = alwo.o("BugleNotifications");
    private final vlx A;
    private final vmy B;
    private final vlw C;
    private final armf D;
    private final xgj E;
    private final yyt F;
    public final Context b;
    public final anen c;
    public final aneo d;
    public final qoq e;
    public final Optional f;
    public final armf g;
    public final xnv h;
    public final Optional i;
    public final Optional j;
    public final Optional k;
    public final armf l;
    public final armf m;
    public final armf n;
    public final armf o;
    public final armf p;
    public final armf q;
    public final armf r;
    public final armf s;
    public final armf t;
    public final vti u;
    public final vjs v;
    public final vco w;
    public final zap x;
    private final anen y;
    private final vml z;

    public vmf(Context context, anen anenVar, anen anenVar2, aneo aneoVar, vti vtiVar, xgj xgjVar, zap zapVar, vml vmlVar, vlx vlxVar, qoq qoqVar, Optional optional, armf armfVar, xnv xnvVar, yyt yytVar, vjs vjsVar, vmy vmyVar, vlw vlwVar, Optional optional2, armf armfVar2, Optional optional3, vco vcoVar, Optional optional4, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11) {
        this.b = context;
        this.y = anenVar;
        this.c = anenVar2;
        this.d = aneoVar;
        this.E = xgjVar;
        this.x = zapVar;
        this.z = vmlVar;
        this.A = vlxVar;
        this.e = qoqVar;
        this.f = optional;
        this.g = armfVar;
        this.h = xnvVar;
        this.F = yytVar;
        this.v = vjsVar;
        this.B = vmyVar;
        this.C = vlwVar;
        this.i = optional2;
        this.D = armfVar2;
        this.j = optional3;
        this.w = vcoVar;
        this.k = optional4;
        this.l = armfVar3;
        this.m = armfVar4;
        this.n = armfVar5;
        this.o = armfVar6;
        this.u = vtiVar;
        this.p = armfVar7;
        this.q = armfVar8;
        this.r = armfVar9;
        this.t = armfVar11;
        this.s = armfVar10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [armf, java.lang.Object] */
    @Override // defpackage.vkh
    public final /* bridge */ /* synthetic */ akul a(List list, Object obj) {
        akul h;
        final vmq vmqVar = (vmq) obj;
        byte[] bArr = null;
        if (list.isEmpty() && DesugarCollections.unmodifiableMap(vmqVar.c).isEmpty() && !vmqVar.e) {
            ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageBlueprint", "createNotificationCreationPackage", 223, "IncomingMessageBlueprint.java")).q("No inputs, not creating incoming message notification");
            return aktp.ag(null);
        }
        final zai Y = this.F.Y(list);
        xgj xgjVar = this.E;
        boolean z = vmqVar.e;
        Context context = (Context) xgjVar.h.b();
        context.getClass();
        ((anen) xgjVar.d.b()).getClass();
        anen anenVar = (anen) xgjVar.f.b();
        anenVar.getClass();
        anen anenVar2 = (anen) xgjVar.c.b();
        anenVar2.getClass();
        vmu vmuVar = (vmu) xgjVar.e.b();
        vmuVar.getClass();
        vjs vjsVar = (vjs) xgjVar.b.b();
        vjsVar.getClass();
        yyt yytVar = (yyt) xgjVar.a.b();
        yytVar.getClass();
        vmv vmvVar = (vmv) xgjVar.g.b();
        vmvVar.getClass();
        vmqVar.getClass();
        final vlu vluVar = new vlu(context, anenVar, anenVar2, vmuVar, vjsVar, yytVar, vmvVar, vmqVar, z);
        zai Y2 = vluVar.j.Y(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = Y2.c.iterator();
        while (true) {
            int i = 2;
            if (!it.hasNext()) {
                break;
            }
            Bundle bundle = (Bundle) it.next();
            if (bundle.containsKey("extra_im_notification_conversation_id") && bundle.containsKey("extra_im_notification_message_ids") && bundle.containsKey("extra_im_notification_earliest_timestamp")) {
                arrayList.add(aktp.ai(new vmb(Y2, bundle, i, bArr), Y2.b));
            }
        }
        akul h2 = aktp.ao(arrayList).h(new vib(arrayList, 7), Y2.e);
        vmv vmvVar2 = vluVar.f;
        if (!vluVar.h) {
            h = aktp.ag(vmq.a);
        } else {
            h = vmvVar2.c.h().e(apba.class, new vip(10), vmvVar2.b).h(new vip(9), vmvVar2.b);
        }
        akul h3 = aktp.ap(h2, h).h(new rbn(vluVar, h, h2, 13), vluVar.c).h(new algk() { // from class: vlt
            @Override // defpackage.algk
            public final Object apply(Object obj2) {
                rru rruVar;
                String str;
                alob alobVar = new alob();
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    vlu vluVar2 = vlu.this;
                    ConversationIdType b = ruy.b((String) entry.getKey());
                    long j = ((vmn) entry.getValue()).c;
                    vmu vmuVar2 = vluVar2.e;
                    rru rruVar2 = (rru) vmuVar2.c.b();
                    akrh e = aktp.e("IncomingMessageNotificationQueries#getConversationSync_dsdrGroupsFlag");
                    try {
                        if (((okf) vmuVar2.f.b()).a()) {
                            sac sacVar = (sac) ((saf) vom.o(b).n()).cO();
                            if (sacVar == null) {
                                alwl alwlVar = (alwl) vmu.a.g();
                                alwlVar.X(ydl.o, b.a());
                                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageNotificationQueries", "getConversationSync", 146, "IncomingMessageNotificationQueries.java")).q("Unable to find ConversationListItemData for conversation id");
                                e.close();
                                rruVar = null;
                            } else {
                                rruVar2.N(sacVar);
                                e.close();
                                rruVar = rruVar2;
                            }
                        } else {
                            san sanVar = (san) ((sar) vom.m(b).n()).cO();
                            if (sanVar == null) {
                                alwl alwlVar2 = (alwl) vmu.a.g();
                                alwlVar2.X(ydl.o, b.a());
                                ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageNotificationQueries", "getConversationSync", 159, "IncomingMessageNotificationQueries.java")).q("Unable to find ConversationListItemData for conversation id");
                                e.close();
                                rruVar = null;
                            } else {
                                rruVar2.O(sanVar);
                                e.close();
                                rruVar = rruVar2;
                            }
                        }
                        if (rruVar == null) {
                            alwl alwlVar3 = (alwl) vlu.a.g();
                            alwlVar3.X(ydl.o, b.toString());
                            alwlVar3.X(vjh.r, Long.valueOf(j));
                            ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/ConversationAndMessagesDataCreator", "createConversationAndMessagesDataList", 107, "ConversationAndMessagesDataCreator.java")).q("conversationData is null, skipping");
                        } else {
                            vmu vmuVar3 = vluVar2.e;
                            rvv rvvVar = (rvv) vmuVar3.b.b();
                            e = aktp.e("ConversationMessageListDatabaseOperations#getLastMessagesInConversationWithReactions");
                            try {
                                sbd sbdVar = (sbd) ((ibi) rvvVar.c.b()).q(b, 7).b().n();
                                e.close();
                                alog a2 = ((alog) Collection.EL.stream(sbdVar.cR()).map(new viu(vmuVar3, 4)).filter(new aien(j, 1)).collect(alls.a)).a();
                                if (a2.isEmpty()) {
                                    alwl alwlVar4 = (alwl) vlu.a.g();
                                    alwlVar4.X(ydl.o, b.toString());
                                    alwlVar4.X(vjh.r, Long.valueOf(j));
                                    ((alwl) alwlVar4.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/ConversationAndMessagesDataCreator", "createConversationAndMessagesDataList", 119, "ConversationAndMessagesDataCreator.java")).q("messagesData is null or empty, skipping");
                                } else {
                                    String join = TextUtils.join(",", (Iterable) Collection.EL.stream(a2).map(new vil(14)).collect(Collectors.toCollection(new uzg(14))));
                                    alwl alwlVar5 = (alwl) vlu.a.g();
                                    alwlVar5.X(ydl.o, b.a());
                                    alwlVar5.X(vmt.e, join);
                                    ((alwl) alwlVar5.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/ConversationAndMessagesDataCreator", "createConversationAndMessagesDataList", 133, "ConversationAndMessagesDataCreator.java")).q("Queried message ids");
                                    rry rryVar = (rry) alzz.aO(a2);
                                    vjs vjsVar2 = vluVar2.i;
                                    Context context2 = vluVar2.b;
                                    boolean S = rruVar.S();
                                    if (rruVar.S()) {
                                        str = rruVar.r();
                                    } else {
                                        str = null;
                                    }
                                    vmr t = vjsVar2.t(context2, rryVar, S, str);
                                    sbf q = ((ibi) vluVar2.e.d.b()).q(b, -1);
                                    sbh sbhVar = new sbh();
                                    sbhVar.d(j);
                                    q.d(sbhVar);
                                    int i2 = q.b().i();
                                    albo.T(!a2.isEmpty());
                                    alobVar.h(new vls(b, j, rruVar, a2, t, i2));
                                }
                            } finally {
                            }
                        }
                    } finally {
                    }
                }
                return alobVar.g();
            }
        }, vluVar.d);
        akul i2 = h3.i(new ancs() { // from class: vlz
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v24, types: [arwe, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.lang.Object] */
            @Override // defpackage.ancs
            public final ListenableFuture a(Object obj2) {
                alor alorVar;
                int i3;
                vmq vmqVar2;
                akul ag;
                boolean z2;
                boolean z3;
                akul ag2;
                char c;
                akul ag3;
                akul c2;
                vlz vlzVar = this;
                alog alogVar = (alog) obj2;
                ArrayList arrayList2 = new ArrayList();
                alok alokVar = new alok();
                for (Bundle bundle2 : Y.c) {
                    if (bundle2.containsKey("extra_im_notification_conversation_id") && bundle2.containsKey("extra_im_notification_message_ids")) {
                        ConversationIdType b = ruy.b(bundle2.getString("extra_im_notification_conversation_id"));
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("extra_im_notification_message_ids");
                        stringArrayList.getClass();
                        alokVar.h(b, (Set) Collection.EL.stream(stringArrayList).map(new vmd(2)).collect(Collectors.toCollection(new uzg(17))));
                    }
                }
                final vmf vmfVar = vmf.this;
                alor g = alokVar.g();
                int i4 = 16;
                String str = "com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageBlueprint";
                String str2 = "IncomingMessageBlueprint.java";
                if (alogVar.isEmpty()) {
                    ((alwl) ((alwl) vmf.a.g()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageBlueprint", "cancelNotificationsWithNoMessages", 316, "IncomingMessageBlueprint.java")).q("New set of conversations empty, canceling notifications");
                    aluq listIterator = g.keySet().listIterator();
                    while (listIterator.hasNext()) {
                        vmfVar.w.u(vlm.NT_INCOMING_MESSAGE, vmfVar.v.s((ConversationIdType) listIterator.next()));
                    }
                } else {
                    Set set = (Set) Collection.EL.stream(alogVar).map(new vil(19)).collect(Collectors.toCollection(new uzg(16)));
                    aluq listIterator2 = g.keySet().listIterator();
                    while (listIterator2.hasNext()) {
                        ConversationIdType conversationIdType = (ConversationIdType) listIterator2.next();
                        if (!set.contains(conversationIdType)) {
                            alwl alwlVar = (alwl) vmf.a.g();
                            alwlVar.X(ydl.o, conversationIdType.a());
                            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageBlueprint", "cancelNotificationsWithNoMessages", 336, "IncomingMessageBlueprint.java")).q("Missing conversation in new set, canceling notification");
                            vmfVar.w.u(vlm.NT_INCOMING_MESSAGE, vmfVar.v.s(conversationIdType));
                        }
                    }
                }
                int size = alogVar.size();
                int i5 = 0;
                while (i5 < size) {
                    vmq vmqVar3 = vmqVar;
                    final vls vlsVar = (vls) alogVar.get(i5);
                    final Set set2 = (Set) Collection.EL.stream(DesugarCollections.unmodifiableMap(vmqVar3.c).keySet()).map(new vmd(1)).collect(Collectors.toCollection(new uzg(i4)));
                    ConversationIdType conversationIdType2 = vlsVar.a;
                    alog alogVar2 = vlsVar.d;
                    boolean z4 = vmqVar3.d;
                    boolean z5 = vmqVar3.e;
                    rry rryVar = (rry) alzz.aO(alogVar2);
                    alog alogVar3 = alogVar;
                    if (vmfVar.i.isPresent() && ((yhs) vmfVar.i.get()).a() && rryVar != null && rryVar.aC()) {
                        alwl alwlVar2 = (alwl) vmf.a.g();
                        alwlVar2.X(ydl.o, conversationIdType2.toString());
                        ((alwl) alwlVar2.h(str, "shouldCreateBuilderInfo", 732, str2)).q("Recent outgoing message and paired with ditto, skipping notification creation and canceling notification");
                        vmfVar.w.u(vlm.NT_INCOMING_MESSAGE, vmfVar.v.s(rryVar.t()));
                        ag = aktp.ag(false);
                        alorVar = g;
                        i3 = size;
                        vmqVar2 = vmqVar3;
                    } else {
                        tqc M = vlsVar.c.M();
                        if (!yqt.a().booleanValue() ? !(M.e() || M.g()) : !M.f()) {
                            Set set3 = (Set) Map.EL.getOrDefault(g, conversationIdType2, new HashSet());
                            alorVar = g;
                            i3 = size;
                            vmqVar2 = vmqVar3;
                            int i6 = 0;
                            boolean z6 = false;
                            for (int size2 = alogVar2.size(); i6 < size2; size2 = size2) {
                                rry rryVar2 = (rry) alogVar2.get(i6);
                                set3.getClass();
                                z6 |= !set3.contains(rryVar2.u());
                                i6++;
                            }
                            if (!z4 && !z5) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (!z6 && !z2) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            if (!z3) {
                                alwl alwlVar3 = (alwl) vmf.a.g();
                                alwlVar3.X(ydl.o, conversationIdType2.toString());
                                alwlVar3.X(vmt.e, TextUtils.join(",", set3));
                                ((alwl) alwlVar3.h(str, "shouldCreateBuilderInfo", 778, str2)).I("Skipping notification creation: hasNewMessageIds=%b, hasAnyUpdate=%b", z6, z2);
                            }
                            ag = aktp.ag(Boolean.valueOf(z3));
                        } else {
                            alorVar = g;
                            i3 = size;
                            vmqVar2 = vmqVar3;
                            alwl alwlVar4 = (alwl) vmf.a.g();
                            alwlVar4.X(ydl.p, conversationIdType2);
                            ((alwl) alwlVar4.h(str, "shouldCreateBuilderInfo", 748, str2)).q("Conversation is in the blocked/spam/cross-country folder, skipping notification creation");
                            ag = aktp.ag(false);
                        }
                    }
                    ConversationIdType conversationIdType3 = vlsVar.a;
                    if (!vmfVar.j.isEmpty() && ((ywy) ((armf) vmfVar.j.get()).b()).a()) {
                        if (set2.isEmpty()) {
                            ag2 = aktp.ag(true);
                        } else {
                            ag2 = ((ywy) ((armf) vmfVar.j.get()).b()).b().h(new vgd(conversationIdType3, 8), andi.a);
                        }
                    } else if (((pqe) vmfVar.m.b()).a() && !((osr) vmfVar.t.b()).a()) {
                        akul ag4 = aktp.ag(true);
                        ag4.getClass();
                        ag2 = ag4.h(new uvz(vmfVar, conversationIdType3, 20, null), andi.a);
                    } else {
                        ag2 = aktp.ag(true);
                    }
                    final akul akulVar = ag2;
                    if (set2.contains(vlsVar.a) && !vlsVar.d.isEmpty()) {
                        rry rryVar3 = (rry) vlsVar.d.get(0);
                        wyp wypVar = (wyp) vmfVar.p.b();
                        MessageIdType u = rryVar3.u();
                        ConversationIdType t = rryVar3.t();
                        String F = rryVar3.F();
                        u.getClass();
                        t.getClass();
                        c2 = qjh.c(wypVar.b, arpj.a, arwf.a, new wju(wypVar, u, t, F, (arpe) null, 5));
                        ag3 = c2;
                        c = 0;
                    } else {
                        c = 0;
                        ag3 = aktp.ag(false);
                    }
                    ListenableFuture[] listenableFutureArr = new ListenableFuture[3];
                    listenableFutureArr[c] = ag3;
                    listenableFutureArr[1] = ag;
                    listenableFutureArr[2] = akulVar;
                    final akul akulVar2 = ag;
                    final vmq vmqVar4 = vmqVar2;
                    int i7 = i5;
                    final akul akulVar3 = ag3;
                    arrayList2.add(aktp.ap(listenableFutureArr).i(new ancr() { // from class: vly
                        @Override // defpackage.ancr
                        public final ListenableFuture a() {
                            byte[] bArr2 = null;
                            if (((Boolean) albo.bQ(akulVar2)).booleanValue() && ((Boolean) albo.bQ(akulVar)).booleanValue()) {
                                Set set4 = set2;
                                vmq vmqVar5 = vmqVar4;
                                vls vlsVar2 = vlsVar;
                                akul akulVar4 = akulVar3;
                                vmf vmfVar2 = vmf.this;
                                if (((Boolean) albo.bQ(akulVar4)).booleanValue()) {
                                    alwl alwlVar5 = (alwl) vmf.a.g();
                                    alwlVar5.X(ydl.p, vlsVar2.a);
                                    ((alwl) alwlVar5.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageBlueprint", "createBuilderInfo", 380, "IncomingMessageBlueprint.java")).q("Notification is eligible for delay. Enacting the delay.");
                                    ConversationIdType conversationIdType4 = vlsVar2.a;
                                    aneo aneoVar = vmfVar2.d;
                                    int i8 = 1;
                                    Callable k = akto.k(new vmb(vmfVar2, conversationIdType4, i8, bArr2));
                                    Object e = ymd.i.e();
                                    e.getClass();
                                    return akul.g(aneoVar.schedule(k, ((Number) e).longValue(), TimeUnit.MILLISECONDS)).i(new vug(vmfVar2, vlsVar2, vmqVar5, set4, i8), vmfVar2.c);
                                }
                                ((mbl) vmfVar2.o.b()).e("Bugle.Spam.Notification.Eligibility.Count", 0);
                                return vmfVar2.b(vmqVar5, vlsVar2, set4);
                            }
                            return aktp.ag(null);
                        }
                    }, vmfVar.c));
                    i5 = i7 + 1;
                    i4 = 16;
                    str2 = str2;
                    str = str;
                    g = alorVar;
                    alogVar = alogVar3;
                    size = i3;
                    vlzVar = this;
                }
                return aktp.ao(arrayList2).h(new vib(arrayList2, 6), andi.a);
            }
        }, andi.a);
        akul h4 = h3.h(new vip(8), this.y);
        return aktp.ap(i2, h4).h(new vmb(i2, h4, 0), this.y);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x04df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.akul b(final defpackage.vmq r36, final defpackage.vls r37, final java.util.Set r38) {
        /*
            Method dump skipped, instructions count: 1398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vmf.b(vmq, vls, java.util.Set):akul");
    }

    @Override // defpackage.vkh
    public final vlf c() {
        return new vme(this);
    }

    @Override // defpackage.vkh
    public final vlm d() {
        return vlm.NT_INCOMING_MESSAGE;
    }

    @Override // defpackage.vkh
    public final akul e() {
        return aktp.ag(true);
    }

    @Override // defpackage.vkh
    public final Optional f() {
        return Optional.of(this.z.c());
    }

    @Override // defpackage.vkh
    public final String g() {
        return "msg";
    }
}
