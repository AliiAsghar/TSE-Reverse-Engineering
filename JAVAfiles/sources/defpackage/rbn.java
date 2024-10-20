package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessConversationParticipantsUpdateAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.rcs.client.filetransfer.FileTransferService;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import com.google.communication.synapse.security.scytale.PrekeyBundle;
import com.google.communication.synapse.security.scytale.Scope;
import com.google.media.webrtc.common.StatusOr;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rbn implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ rbn(Object obj, ConversationIdType conversationIdType, Object obj2, int i) {
        this.d = i;
        this.b = obj;
        this.a = conversationIdType;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v133, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v40, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r0v91, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v57, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v83, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r2v89, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v46, types: [agnq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v49, types: [agnq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v54, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v72, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.List, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        String channelId;
        String shortcutId;
        String channelId2;
        int importance;
        int i;
        Uri x;
        int i2 = 3;
        int i3 = 6;
        int i4 = 2;
        boolean z = true;
        byte[] bArr = null;
        int i5 = 0;
        switch (this.d) {
            case 0:
                xze xzeVar = ProcessConversationParticipantsUpdateAsyncAction.a;
                aozy createBuilder = angd.a.createBuilder();
                aozy createBuilder2 = anfs.a.createBuilder();
                String a = ((BugleConversationId) this.a).a.a();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ?? r4 = this.c;
                ?? r5 = this.b;
                anfs anfsVar = (anfs) createBuilder2.b;
                a.getClass();
                anfsVar.b = a;
                createBuilder2.aR((Iterable) albo.bQ(r5));
                createBuilder2.aR((Iterable) albo.bQ(r4));
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                angd angdVar = (angd) createBuilder.b;
                anfs anfsVar2 = (anfs) createBuilder2.s();
                anfsVar2.getClass();
                angdVar.c = anfsVar2;
                angdVar.b = 8;
                return (angd) createBuilder.s();
            case 1:
                return ((qqw) this.a).b((String) this.b, this.c);
            case 2:
                ?? r0 = this.c;
                Object obj = this.b;
                Object obj2 = this.a;
                Object call = r0.call();
                ((mgv) obj2).h((ahqq) obj, mgv.b);
                return call;
            case 3:
                Uri uri = (Uri) this.a;
                String path = uri.getPath();
                Object obj3 = this.c;
                if (path != null) {
                    File file = new File(path);
                    if (file.exists()) {
                        try {
                            return FileProvider.a((Context) ((ryz) obj3).d.b(), ((Context) ((ryz) obj3).d.b()).getPackageName() + ".fileprovider", file);
                        } catch (Exception e) {
                            xyo e2 = ryz.a.e();
                            e2.H("Can't convert file uri to content uri.");
                            e2.k(uri);
                            e2.r(e);
                        }
                    }
                }
                return this.b.t();
            case 4:
                ArrayList<PrekeyBundle> arrayList = (ArrayList) twd.a((StatusOr) albo.bQ(this.a));
                if (!arrayList.isEmpty()) {
                    ((NativeMessageEncryptorV2) albo.bQ(this.b)).createSession((Scope) this.c, arrayList);
                }
                return null;
            case 5:
                ConversationIdType b = ruy.b(((twt) this.b).b);
                tws twsVar = (tws) this.a;
                alog d = ((tsa) twsVar.a.b()).d(b, (alog) this.c);
                mlb mlbVar = (mlb) twsVar.c.b();
                Stream map = Collection.EL.stream(d).map(new tvq(i4));
                int i6 = alog.d;
                Iterable iterable = (Iterable) map.collect(alls.a);
                aavj a2 = mlc.a();
                a2.i(21);
                a2.h(amlg.MESSAGE_TO_NON_ENCRYPTED_RECIPIENT);
                mlc g = a2.g();
                d.t(mlb.e(g.c), "terminal status is not a delivery failure");
                sya syaVar = new sya();
                syaVar.P(new mjz(iterable, i2));
                int i7 = g.c;
                amlg amlgVar = g.b;
                int i8 = g.d;
                if (i8 != 0) {
                    if (i8 != 1) {
                        z = false;
                    }
                    int a3 = mlbVar.a(syaVar, i7, amlgVar, z);
                    alsx alsxVar = (alsx) d;
                    if (alsxVar.c != a3) {
                        xyo e3 = tws.D.e();
                        e3.x("messagesSize", alsxVar.c);
                        e3.x("updateCount", a3);
                        e3.H("messages which failed to reach recipient who lost e2ee may already have been manually deleted");
                        e3.q();
                    }
                    int i9 = alsxVar.c;
                    while (i5 < i9) {
                        ((iji) twsVar.b.b()).s(((MessagesTable.BindData) d.get(i5)).D(), rve.a, 4, 27, 44);
                        i5++;
                    }
                    return upm.b();
                }
                throw null;
            case 6:
                MessageIdType b2 = rvc.b(((ujl) this.b).c);
                xyo c = ujk.a.c();
                c.H("removing obsolete uri");
                c.c(b2);
                c.q();
                tbt tbtVar = new tbt();
                tbtVar.aj("RichCardMediaUriCleanupHandler#processPendingWorkItemAsync1");
                tbtVar.t();
                tbtVar.v(new tux(b2, this.c, 9));
                tbtVar.a().e();
                rge rgeVar = new rge(this.a, b2, i3, bArr);
                rui ruiVar = new rui(b2, 16);
                MessagesTable.BindData a4 = MessagesTable.a(b2);
                if (a4 != null) {
                    rgeVar.q(a4);
                } else {
                    ruiVar.run();
                }
                return upm.b();
            case 7:
                ((uie) this.a).b.e((String) this.c, this.b);
                return null;
            case 8:
                return ((uie) this.a).b.c((String) this.c, this.b);
            case 9:
                Object obj4 = this.c;
                Object obj5 = this.a;
                final ulw ulwVar = (ulw) this.b;
                final ConversationIdType conversationIdType = (ConversationIdType) obj5;
                final ulx ulxVar = (ulx) obj4;
                return (upm) ulwVar.h.c("DeleteConversationHandler.deleteLocallyAndQueue", new alhr() { // from class: ulv
                    /* JADX WARN: Type inference failed for: r1v35, types: [armf, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r1v75, types: [armf, java.lang.Object] */
                    @Override // defpackage.alhr
                    public final Object get() {
                        xhv xhvVar;
                        String[] strArr;
                        uzl d2;
                        boolean z2;
                        upm c2;
                        ulw ulwVar2 = ulw.this;
                        xyo c3 = ulwVar2.d.c();
                        c3.H("Deleting conversation ");
                        ConversationIdType conversationIdType2 = conversationIdType;
                        c3.b(conversationIdType2);
                        c3.q();
                        ulx ulxVar2 = ulxVar;
                        try {
                            int i10 = ulxVar2.e;
                            boolean K = ((rwd) ulwVar2.m.b()).K(conversationIdType2);
                            tqc r = ((rtz) ulwVar2.l.b()).r(conversationIdType2);
                            amfh e4 = ulwVar2.o.e(conversationIdType2);
                            amfe b3 = amfe.b(i10);
                            ((wpp) ulwVar2.w.b()).q(conversationIdType2);
                            qzc qzcVar = new qzc(ulwVar2, e4, conversationIdType2, b3, K, r, 2);
                            long j = ulxVar2.c;
                            try {
                                xhvVar = ((ugy) ulwVar2.n.b()).a(conversationIdType2);
                            } catch (alia unused) {
                                xhvVar = new xhv();
                            }
                            SuperSortLabel a5 = SuperSortLabel.a(ulxVar2.f);
                            boolean d3 = ((qih) ulwVar2.k.b()).d(conversationIdType2, xhvVar);
                            uzl uzlVar = null;
                            if (d3) {
                                syc sycVar = new syc();
                                if (j != Long.MAX_VALUE) {
                                    sycVar.D(j);
                                }
                                strArr = ((qih) ulwVar2.k.b()).f(conversationIdType2, new syb(sycVar));
                            } else {
                                strArr = null;
                            }
                            if (ulxVar2.d) {
                                z2 = ((uzo) ulwVar2.j.b()).f(conversationIdType2);
                            } else {
                                aozy createBuilder3 = ulz.a.createBuilder();
                                sxy d4 = MessagesTable.d();
                                d4.w("getMessageIdsQuery");
                                d4.e(new uid(17));
                                d4.g(new lce(conversationIdType2, j, 13));
                                sxx b4 = d4.b();
                                sxy d5 = MessagesTable.d();
                                d5.w("+queueCleanupParts-messages");
                                d5.g(new uje(b4, 14));
                                sxt sxtVar = (sxt) d5.b().n();
                                while (sxtVar.moveToNext()) {
                                    try {
                                        Uri A = sxtVar.A();
                                        if (A != null) {
                                            createBuilder3.P(A.toString());
                                            if (((ulz) createBuilder3.b).c.size() >= ((Integer) ulw.b.e()).intValue()) {
                                                ulwVar2.z.b((ulz) createBuilder3.s());
                                                if (!createBuilder3.b.isMutable()) {
                                                    createBuilder3.u();
                                                }
                                                ((ulz) createBuilder3.b).c = apag.emptyProtobufList();
                                            }
                                        }
                                    } finally {
                                    }
                                }
                                sxtVar.close();
                                if (((ulz) createBuilder3.b).c.size() > 0) {
                                    ulwVar2.z.b((ulz) createBuilder3.s());
                                }
                                aozy createBuilder4 = uls.a.createBuilder();
                                aozy createBuilder5 = uzy.a.createBuilder();
                                tbs d6 = PartsTable.d();
                                d6.w("+queueCleanupParts-parts");
                                d6.g(new tux(conversationIdType2, b4, 10));
                                tbn tbnVar = (tbn) d6.b().n();
                                while (tbnVar.moveToNext()) {
                                    try {
                                        if (((Boolean) ulwVar2.x.b()).booleanValue()) {
                                            Uri v = tbnVar.v();
                                            if (v != null) {
                                                if (uzz.c(v)) {
                                                    createBuilder5.T(v.toString());
                                                } else {
                                                    ulwVar2.j(createBuilder4, tbnVar.h(), v);
                                                }
                                            }
                                        } else {
                                            Uri v2 = tbnVar.v();
                                            if (v2 != null) {
                                                ulwVar2.j(createBuilder4, tbnVar.h(), v2);
                                            }
                                        }
                                    } finally {
                                    }
                                }
                                tbnVar.close();
                                if (((uls) createBuilder4.b).b.size() > 0) {
                                    ulwVar2.A.c((uls) createBuilder4.s());
                                }
                                if (((Boolean) ulwVar2.x.b()).booleanValue() && ((uzy) createBuilder5.b).b.size() > 0) {
                                    ((uof) ulwVar2.B.a.b()).a(upk.a("delete_part_cms_attachment", (uzy) createBuilder5.s()));
                                }
                                if (amfe.b(ulxVar2.e) == amfe.CONVERSATION_FROM_CMS_ACTION) {
                                    d2 = ((uzo) ulwVar2.j.b()).e(conversationIdType2, a5, j);
                                } else {
                                    d2 = ((uzo) ulwVar2.j.b()).d(conversationIdType2, a5, j);
                                }
                                uzlVar = d2;
                                z2 = uzlVar.b;
                                ((uzo) ulwVar2.j.b()).g(conversationIdType2, j);
                            }
                            if (!z2) {
                                if (!ulxVar2.d) {
                                    xyo e5 = ulwVar2.d.e();
                                    e5.H("Could not delete local");
                                    e5.b(conversationIdType2);
                                    e5.q();
                                    if (amfe.b(ulxVar2.e) != amfe.CONVERSATION_FROM_CMS_ACTION) {
                                        ulwVar2.t.a();
                                    }
                                }
                                c2 = upm.b();
                            } else {
                                xyo c4 = ulwVar2.d.c();
                                c4.H("Deleted local");
                                c4.b(conversationIdType2);
                                c4.y("maxTimestampToDelete", j);
                                c4.q();
                                alob alobVar = new alob();
                                alvw g2 = ulw.a.g();
                                g2.X(alwp.a, "BugleNotifications");
                                alvg alvgVar = (alvg) g2;
                                alvgVar.X(ydl.o, conversationIdType2.toString());
                                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/workhandlers/DeleteConversationHandler", "deleteLocallyAndQueue", 338, "DeleteConversationHandler.java")).q("Deleting conversation, canceling IM notification (handler)");
                                ((wpp) ulwVar2.v.b()).H(conversationIdType2);
                                if (a5.b() && sni.a(conversationIdType2) != null) {
                                    c2 = upm.c(alobVar.g());
                                } else {
                                    ((vml) ulwVar2.e.b()).d(conversationIdType2);
                                    ulwVar2.s.d(conversationIdType2);
                                    ulwVar2.p.ifPresent(new uhb(4));
                                    if (!((Boolean) qpf.a.e()).booleanValue() && xhvVar.c()) {
                                        lpg lpgVar = ulwVar2.C;
                                        aozy createBuilder6 = umd.a.createBuilder();
                                        long cE = yyb.cE(xhvVar);
                                        if (!createBuilder6.b.isMutable()) {
                                            createBuilder6.u();
                                        }
                                        apag apagVar = createBuilder6.b;
                                        ((umd) apagVar).c = cE;
                                        if (!apagVar.isMutable()) {
                                            createBuilder6.u();
                                        }
                                        ((umd) createBuilder6.b).d = j;
                                        ((uof) lpgVar.a.b()).a(upk.a("delete_thread_from_telephony", (umd) createBuilder6.s()));
                                    } else if (d3) {
                                        if (strArr != null) {
                                            ulwVar2.i.b(ulwVar2.f, strArr);
                                        }
                                    } else {
                                        if (!((Boolean) qpf.a.e()).booleanValue()) {
                                            xyo e6 = ulwVar2.d.e();
                                            e6.H("Local conversation");
                                            e6.b(conversationIdType2);
                                            e6.H("has an invalid telephony thread id; will delete messages individually.");
                                            e6.q();
                                        }
                                        if (uzlVar != null) {
                                            alog<Uri> alogVar = uzlVar.a;
                                            aozy createBuilder7 = ulz.a.createBuilder();
                                            for (Uri uri2 : alogVar) {
                                                if (uri2 != null) {
                                                    createBuilder7.P(uri2.toString());
                                                    if (((ulz) createBuilder7.b).c.size() >= ((Integer) ulw.b.e()).intValue()) {
                                                        ulwVar2.z.b((ulz) createBuilder7.s());
                                                        if (!createBuilder7.b.isMutable()) {
                                                            createBuilder7.u();
                                                        }
                                                        ((ulz) createBuilder7.b).c = apag.emptyProtobufList();
                                                    }
                                                }
                                            }
                                            if (((ulz) createBuilder7.b).c.size() > 0) {
                                                ulwVar2.z.b((ulz) createBuilder7.s());
                                            }
                                        }
                                    }
                                    qzcVar.run();
                                    c2 = upm.c(alobVar.g());
                                }
                            }
                            return c2;
                        } finally {
                            ulwVar2.r.f(mgv.m);
                        }
                    }
                });
            case 10:
                ArrayList arrayList2 = new ArrayList();
                alog alogVar = (alog) albo.bQ(this.b);
                arrayList2.addAll(alogVar);
                Stream map2 = Collection.EL.stream((alog) albo.bQ(this.c)).filter(new uhe((alpt) Collection.EL.stream(alogVar).map(new vbi(14)).collect(alls.b), 7)).map(new vbk(this.a, 20));
                int i10 = alog.d;
                arrayList2.addAll((alog) map2.collect(alls.a));
                return alog.n(arrayList2);
            case 11:
                alog alogVar2 = (alog) albo.bQ(this.b);
                wyp wypVar = (wyp) this.a;
                alog B = wypVar.B(alogVar2);
                Stream filter = Collection.EL.stream(wypVar.B((alog) albo.bQ(this.c))).filter(new uhe((alpt) Collection.EL.stream(B).map(new vbi(13)).collect(alls.b), i3));
                int i11 = alog.d;
                alog alogVar3 = (alog) filter.collect(alls.a);
                alob alobVar = new alob();
                alobVar.j(B);
                alobVar.j(alogVar3);
                return alobVar.g();
            case 12:
                Iterator it = this.b.iterator();
                while (true) {
                    ?? r6 = this.c;
                    if (it.hasNext()) {
                        vlp vlpVar = (vlp) albo.bQ((akul) it.next());
                        try {
                            Notification a5 = vlpVar.a.a();
                            boolean isPresent = vlpVar.d.isPresent();
                            Object obj6 = this.a;
                            if (isPresent) {
                                ((vka) obj6).b.f((String) vlpVar.d.get(), vlpVar.b.i, a5);
                            } else {
                                ((vka) obj6).b.e(vlpVar.b.i, a5);
                            }
                            try {
                                dzt dztVar = ((vka) obj6).b;
                                channelId = a5.getChannelId();
                                NotificationChannel a6 = dztVar.a(channelId);
                                a6.getClass();
                                String str = "";
                                if (a5.actions != null && a5.actions.length > 0) {
                                    str = TextUtils.join(",", (Iterable) DesugarArrays.stream(a5.actions).map(new vil(i3)).collect(Collectors.toCollection(new uzg(11))));
                                }
                                alwl alwlVar = (alwl) vka.a.g();
                                alwlVar.X(vjh.n, vlpVar.b);
                                alwlVar.X(vjh.d, (String) vlpVar.d.orElse(null));
                                alvz alvzVar = vjh.t;
                                shortcutId = a5.getShortcutId();
                                alwlVar.X(alvzVar, shortcutId);
                                alvz alvzVar2 = vjh.k;
                                channelId2 = a5.getChannelId();
                                alwlVar.X(alvzVar2, channelId2);
                                alvz alvzVar3 = vjh.c;
                                importance = a6.getImportance();
                                alwlVar.X(alvzVar3, Integer.valueOf(importance));
                                alwlVar.X(vjh.s, str);
                                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/notification2o/CreateNotificationHandler", "logNotifyWithImportance", 640, "CreateNotificationHandler.java")).q("Notifying");
                            } catch (RuntimeException e4) {
                                ((alwl) ((alwl) ((alwl) vka.a.i()).g(e4)).h("com/google/android/apps/messaging/shared/notification2o/CreateNotificationHandler", "logNotifyWithImportance", (char) 642, "CreateNotificationHandler.java")).q("Error getting the notification channel importance for debug logs");
                            }
                            r6.add(new vkv(vlpVar.b, vlpVar.d, vlpVar.a.b(), vlpVar.c));
                        } catch (RuntimeException e5) {
                            StackTraceElement[] stackTrace = e5.getStackTrace();
                            if (stackTrace.length > 0 && TextUtils.equals(stackTrace[0].getClassName(), "android.os.Parcel") && TextUtils.equals(stackTrace[0].getMethodName(), "readIntArray")) {
                                ((alwl) ((alwl) vka.a.g()).h("com/google/android/apps/messaging/shared/notification2o/CreateNotificationHandler", "notify", 599, "CreateNotificationHandler.java")).q("Caught known notification bug: Parcel#readIntArray");
                            }
                            throw e5;
                        }
                    } else {
                        return r6;
                    }
                }
                break;
            case 13:
                Map hashMap = new HashMap();
                vmq vmqVar = (vmq) albo.bQ(this.b);
                if (!DesugarCollections.unmodifiableMap(vmqVar.c).isEmpty()) {
                    hashMap = vlu.c(alor.j(hashMap), alor.j(DesugarCollections.unmodifiableMap(vmqVar.c)));
                }
                ?? r3 = this.c;
                Object obj7 = this.a;
                vmq vmqVar2 = (vmq) albo.bQ(r3);
                vlu vluVar = (vlu) obj7;
                Map c2 = vlu.c(alor.j(vlu.c(alor.j(hashMap), alor.j(DesugarCollections.unmodifiableMap(vmqVar2.c)))), alor.j(DesugarCollections.unmodifiableMap(vluVar.g.c)));
                alwl alwlVar2 = (alwl) vlu.a.g();
                alwlVar2.X(vmt.a, vlu.a(vluVar.g));
                alwlVar2.X(vmt.b, vlu.a(vmqVar2));
                alwlVar2.X(vmt.c, vlu.a(vmqVar));
                alwlVar2.X(vmt.d, vlu.b(c2));
                ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/ConversationAndMessagesDataCreator", "createInputIds", 217, "ConversationAndMessagesDataCreator.java")).q("Creating notification input ids");
                return c2;
            case 14:
                List list = (List) albo.bQ(this.b);
                ((Optional) albo.bQ(this.c)).ifPresent(new vra(list, 19));
                int e6 = ((mho) ((vtb) this.a).c.b()).e();
                if (e6 >= 0) {
                    xou xouVar = new xou((short[]) null);
                    xouVar.j("CsApkVersionCode");
                    xouVar.k(String.valueOf(e6));
                    list.add(xouVar.i());
                }
                return list;
            case 15:
                smr q = ((rtz) ((vuo) this.b).b.b()).q((ConversationIdType) this.a);
                q.getClass();
                return Boolean.valueOf(wam.s((String) this.c, q.P(), q.B()));
            case 16:
                ((xcj) this.b).e((Set) this.c.b(), (xcg) this.a);
                return null;
            case 17:
                Object obj8 = this.b;
                akrh e7 = aktp.e("TachygramDatabaseOperations#participantQueryCount_dsdrGroupsFlag");
                try {
                    boolean a7 = ((okf) ((xep) obj8).e.b()).a();
                    Object obj9 = this.a;
                    Object obj10 = this.c;
                    int i12 = 4;
                    if (a7) {
                        taz e8 = ParticipantsTable.e();
                        e8.w("needsGroupSync");
                        smm smmVar = new smm(smp.a);
                        snf e9 = sni.e();
                        e9.h(new xeo(obj10, i5));
                        smmVar.A(agoh.b(e9.b(), sni.c.a, (agmh) smp.d.a).a());
                        smmVar.e(new xdo(i12));
                        e8.A(agoh.b(smmVar.b(), (agmh) smp.d.c, ParticipantsTable.c.a).a());
                        tbd tbdVar = new tbd();
                        tbdVar.b(new xeo(obj9, i4), new xeo(obj9, i2));
                        e8.f(tbdVar);
                        i = e8.b().i();
                    } else {
                        taz e10 = ParticipantsTable.e();
                        e10.w("needsGroupSync");
                        sla a8 = sld.a();
                        snf e11 = sni.e();
                        e11.h(new xeo(obj10, i12));
                        a8.A(agoh.b(e11.b(), sni.c.a, (agmh) sld.e.d).a());
                        int i13 = 5;
                        a8.f(new xdo(i13));
                        e10.A(agoh.b(a8.b(), (agmh) sld.e.e, ParticipantsTable.c.a).a());
                        tbd tbdVar2 = new tbd();
                        tbdVar2.b(new xeo(obj9, i13), new xeo(obj9, i3));
                        e10.f(tbdVar2);
                        i = e10.b().i();
                    }
                    e7.close();
                    if (i != 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                } finally {
                }
            case 18:
                return ((xot) this.a).b((String) this.c, (Optional) this.b);
            case 19:
                Object obj11 = this.a;
                Object obj12 = this.b;
                Object obj13 = this.c;
                try {
                    FileTransferService fileTransferService = (FileTransferService) ((xqb) obj11).b.b();
                    PendingIntent c3 = aipr.c(((xqb) obj11).e, xqb.d((FileInformation) obj12, (aozb) obj13), ((xqb) obj11).e((aozb) obj13), 1107296256, 3);
                    c3.getClass();
                    adxq adxqVar = new adxq();
                    adxqVar.d((FileInformation) obj12);
                    adxqVar.e(c3);
                    return (xpr) new xpj().fu(fileTransferService.downloadFile(adxqVar.c()));
                } catch (ajny e12) {
                    throw new xpt(false, "Exception occurred during file download IPC to RCS Engine.", (Throwable) e12);
                }
            default:
                alvw g2 = xql.a.g();
                g2.X(alwp.a, "BugleFileTransfer");
                alvg alvgVar = (alvg) g2;
                alvgVar.X(ydl.f, this.a.E());
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "completeIncomingFileTransferForSuccessfulBugleDbUpdate", 528, "FileDownloadCompletedHandler.java")).q("Successfully completed file transfer");
                xql xqlVar = (xql) this.c;
                if (!xqlVar.A.a() && (x = this.b.x()) != null) {
                    lpg lpgVar = (lpg) xqlVar.o.b();
                    aozy createBuilder3 = umb.a.createBuilder();
                    String uri2 = x.toString();
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    umb umbVar = (umb) createBuilder3.b;
                    uri2.getClass();
                    umbVar.b |= 1;
                    umbVar.c = uri2;
                    ((uof) lpgVar.a.b()).a(upk.a("delete_scratch_file", (umb) createBuilder3.s()));
                }
                return upm.b();
        }
    }

    public /* synthetic */ rbn(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ rbn(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ rbn(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ rbn(Object obj, String str, Object obj2, int i) {
        this.d = i;
        this.a = obj;
        this.c = str;
        this.b = obj2;
    }
}
