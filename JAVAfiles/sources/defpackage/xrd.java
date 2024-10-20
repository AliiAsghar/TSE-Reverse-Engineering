package defpackage;

import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessPendingMessagesAction;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xrd implements ancs {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ xrd(aanj aanjVar, msh mshVar, int i) {
        this.d = i;
        this.b = aanjVar;
        this.a = "310260000000000";
        this.c = mshVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v155, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v163, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v197, types: [akin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v60, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v72, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v84, types: [java.util.concurrent.Future, com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v86, types: [ancs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v87, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r3v88, types: [ancs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r5v17, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v40, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v43, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v66, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        tqi tqiVar;
        String str;
        int i = 15;
        int i2 = 6;
        int i3 = 3;
        int i4 = 4;
        byte[] bArr = null;
        byte b = 0;
        byte b2 = 0;
        boolean z = true;
        boolean z2 = true;
        switch (this.d) {
            case 0:
                arjv arjvVar = (arjv) obj;
                mho mhoVar = (mho) ((xrf) this.a).d.b();
                Object obj2 = arjvVar.b;
                Object obj3 = arjvVar.c;
                Object obj4 = this.b;
                mhoVar.ao((rve) obj4, (amxb) obj2, (amxo) obj3);
                boolean z3 = arjvVar.a;
                Object obj5 = this.c;
                if (z3) {
                    alwl alwlVar = (alwl) xrf.a.g();
                    alwlVar.X(ydl.e, ((rvf) obj4).b);
                    alwlVar.X(ydl.n, yyb.bh(((qei) obj5).d));
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "sendDeliveryReportForBlockedUser", 1043, "IncomingFileTransferProcessor.java")).q("Completed a file transfer from a blocked user.");
                    return aktp.ag(pwh.SUCCESS);
                }
                alwl alwlVar2 = (alwl) xrf.a.h();
                alwlVar2.X(ydl.e, ((rvf) obj4).b);
                alwlVar2.X(ydl.n, yyb.bh(((qei) obj5).d));
                ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "sendDeliveryReportForBlockedUser", 1052, "IncomingFileTransferProcessor.java")).q("Failed to send delivery report for incoming file transfer push message from a blocked user. InvocationResultAndDiagnostic is not successful");
                return aktp.ag(pwh.FAIL_RETRY);
            case 1:
                xqj xqjVar = (xqj) obj;
                Uri uri = xqjVar.b;
                final ?? r3 = this.c;
                if (uri == null) {
                    alvw h = xql.a.h();
                    h.X(alwp.a, "BugleFileTransfer");
                    alvg alvgVar = (alvg) h;
                    alvgVar.X(ydl.f, r3.E());
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "completeIncomingFileTransferForValidMessage", 349, "FileDownloadCompletedHandler.java")).q("Failed to complete file transfer. Temporary file was not successfully persisted");
                    return aktp.ag(upm.e());
                }
                Object obj6 = this.a;
                Object obj7 = this.b;
                alvw g = xql.a.g();
                g.X(alwp.a, "BugleFileTransfer");
                alvg alvgVar2 = (alvg) g;
                alvgVar2.X(ydl.f, rve.a(((xqm) obj6).c));
                ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "completeIncomingFileTransferForValidMessage", 360, "FileDownloadCompletedHandler.java")).q("Completing incoming file transfer for successfully persisted file");
                final Uri uri2 = xqjVar.b;
                uri2.getClass();
                final Uri uri3 = xqjVar.a;
                final MessagePartCoreData G = r3.G();
                G.getClass();
                final xql xqlVar = (xql) obj7;
                return aktp.ai(new xqt((unp) obj7, (Object) G, uri2, (int) (z2 ? 1 : 0)), xqlVar.i).i(new vug(obj7, (MessageCoreData) r3, (Object) G, (Object) uri2, 7), xqlVar.i).h(new xpm(obj7, r3, i3), xqlVar.i).i(new ancs() { // from class: xqh
                    @Override // defpackage.ancs
                    public final ListenableFuture a(Object obj8) {
                        boolean z4;
                        boolean z5;
                        akul ag;
                        akul ag2;
                        boolean booleanValue = ((Boolean) obj8).booleanValue();
                        MessageCoreData messageCoreData = r3;
                        if (!booleanValue) {
                            alvw h2 = xql.a.h();
                            h2.X(alwp.a, "BugleFileTransfer");
                            alvg alvgVar3 = (alvg) h2;
                            alvgVar3.X(ydl.b, messageCoreData.B());
                            alvgVar3.X(ydl.f, messageCoreData.E());
                            alvgVar3.X(ydl.p, messageCoreData.z());
                            ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "completeIncomingFileTransferForSuccessfullyPersistedFile", 472, "FileDownloadCompletedHandler.java")).q("Failed to complete file transfer. Bugle db was not successfully updated.");
                            return aktp.ag(upm.e());
                        }
                        xql xqlVar2 = xql.this;
                        MessagePartCoreData G2 = messageCoreData.G();
                        if (G2 == null) {
                            alvw i5 = xql.a.i();
                            i5.X(alwp.a, "BugleFileTransfer");
                            ((alvg) ((alvg) i5).h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "refreshStatefulNotifications", 670, "FileDownloadCompletedHandler.java")).q("Not refreshing notification. Message part not found");
                            ag = aktp.ag(null);
                        } else {
                            if (messageCoreData.cs() && G2.bc()) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (G2.x() != null) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (yig.a()) {
                                if (z5 && !z4) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                            }
                            alvw g2 = xql.a.g();
                            g2.X(alwp.a, "BugleFileTransfer");
                            alvg alvgVar4 = (alvg) g2;
                            alvgVar4.X(ydl.b, messageCoreData.B());
                            alvgVar4.X(ydl.f, messageCoreData.E());
                            ((alvg) alvgVar4.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "refreshStatefulNotifications", 684, "FileDownloadCompletedHandler.java")).t("Notifying file transfer completed. shouldNotifySilently: %b", Boolean.valueOf(z5));
                            ((alwl) ((alwl) xql.b.g()).h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "refreshStatefulNotifications", 685, "FileDownloadCompletedHandler.java")).q("Creating notification from FileDownloadCompletedHandler");
                            if (z4) {
                                ((alwl) ((alwl) xql.b.g()).h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "refreshStatefulNotifications", 692, "FileDownloadCompletedHandler.java")).q("Creating notification for emotify reaction");
                                ((wpp) xqlVar2.t.b()).I(messageCoreData.z(), Duration.ofMillis(messageCoreData.n()), false);
                            } else {
                                ((wpp) xqlVar2.t.b()).J();
                            }
                            ag = aktp.ag(null);
                        }
                        akul akulVar = ag;
                        akul ai = aktp.ai(new imh(xqlVar2, messageCoreData, uri2, uri3, 14), xqlVar2.i);
                        akul q = xqlVar2.s.b(messageCoreData.B()).q();
                        if (((peh) xqlVar2.C.b()).a()) {
                            ag2 = new ProcessPendingMessagesAction(16).q();
                        } else {
                            ag2 = aktp.ag(null);
                        }
                        return aktp.ap(akulVar, ai, q, ag2).h(new rbn(xqlVar2, messageCoreData, G, 20, (byte[]) null), xqlVar2.i);
                    }
                }, xqlVar.h);
            case 2:
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return aktp.ag(upm.d());
                }
                Object obj8 = this.c;
                MessageCoreData messageCoreData = (MessageCoreData) optional.get();
                if (messageCoreData.ck()) {
                    xri.j((rve) obj8, messageCoreData.B(), "Message has already finished downloading. Skipping updating thumbnail.");
                    return aktp.ag(upm.b());
                }
                MessagePartCoreData G2 = messageCoreData.G();
                G2.getClass();
                String aa = G2.aa();
                if (aa == null) {
                    xri.j((rve) obj8, messageCoreData.B(), "Could not retrieve content type for the thumbnail of an incoming file transfer message. Skipping updating thumbnail.");
                    return aktp.ag(upm.d());
                }
                if (MimeTypeMap.getSingleton().getExtensionFromMimeType(aa) == null) {
                    xri.j((rve) obj8, messageCoreData.B(), "Could not retrieve file extension for the thumbnail of an incoming file transfer message. Skipping updating thumbnail.");
                    return aktp.ag(upm.d());
                }
                xrj xrjVar = (xrj) this.a;
                Uri parse = Uri.parse(xrjVar.d);
                String af = albo.af(xrjVar.c);
                aozy createBuilder = xrn.a.createBuilder();
                String str2 = ((rvf) obj8).b;
                str2.getClass();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                ((xrn) apagVar).b = str2;
                String ag = albo.ag(af);
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                ((xrn) createBuilder.b).d = ag;
                String uri4 = parse.toString();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj9 = this.b;
                xrn xrnVar = (xrn) createBuilder.b;
                uri4.getClass();
                xrnVar.c = uri4;
                ((xri) obj9).d.u((xrn) createBuilder.s());
                xri.j((rve) obj8, messageCoreData.B(), "Finished scheduling success handler for persisted thumbnail.");
                return aktp.ag(upm.b());
            case 3:
                Uri uri5 = (Uri) obj;
                ?? r32 = this.c;
                ConversationIdType z4 = r32.z();
                MessageIdType B = r32.B();
                MessagePartCoreData G3 = r32.G();
                G3.getClass();
                if (ymd.b()) {
                    tqiVar = tqi.PENDING_VERDICT;
                } else {
                    tqiVar = tqi.DEFAULT_NO_VERDICT;
                }
                tqi tqiVar2 = tqiVar;
                Object obj10 = this.a;
                Object obj11 = this.b;
                xrm xrmVar = (xrm) obj11;
                return aktp.an(aktp.ah(new xrl(xrmVar, z4, B, G3, uri5, tqiVar2, r32, 1), xrmVar.e).i(new xfv(obj11, r32, 8, bArr), xrmVar.d), xrmVar.l.g(r32, uri5, (String) obj10)).h(new vcr(15), xrmVar.d);
            case 4:
                Optional optional2 = (Optional) obj;
                if (optional2.isEmpty()) {
                    return aktp.ag(upm.d());
                }
                MessageCoreData messageCoreData2 = (MessageCoreData) optional2.get();
                if (messageCoreData2.ck()) {
                    alwl alwlVar3 = (alwl) xrm.a.g();
                    alwlVar3.X(ydl.o, messageCoreData2.z().toString());
                    alwlVar3.X(ydl.a, messageCoreData2.B().a());
                    alwlVar3.X(ydl.e, messageCoreData2.E().b);
                    ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/ThumbnailDownloadCompletedHandler", "processPendingWorkItemAsync", 185, "ThumbnailDownloadCompletedHandler.java")).q("Message has already finished downloading. Skipping updating thumbnail.");
                    return aktp.ag(upm.b());
                }
                Object obj12 = this.a;
                Object obj13 = this.c;
                Object obj14 = this.b;
                xqt xqtVar = new xqt((unp) obj14, (Object) messageCoreData2, (Uri) obj13, i3);
                xrm xrmVar2 = (xrm) obj14;
                return aktp.ai(xqtVar, xrmVar2.e).i(new xrd(obj14, (Object) messageCoreData2, obj12, 3, (byte[]) null), xrmVar2.d).e(IOException.class, new xqp(5), xrmVar2.d);
            case 5:
                xst xstVar = (xst) this.a;
                alwl alwlVar4 = (alwl) xstVar.a.g();
                Object obj15 = this.c;
                alwlVar4.X(ydl.b, obj15);
                xsq xsqVar = (xsq) this.b;
                alwlVar4.X(ydl.p, xsqVar.a.z());
                ((alwl) alwlVar4.h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploader", "uploadFile", 70, "TachygramFileUploader.java")).q("Starting the file upload to content server.");
                return ((xse) xstVar.b.b()).b(((MessageIdType) obj15).a(), xsqVar.a, xsqVar.b);
            case 6:
                return ((ytw) this.c).b((yuf) obj, (String) this.b, (String) this.a);
            case 7:
                aozy builder = ((apag) this.b).toBuilder();
                builder.getClass();
                ((Optional) obj).ifPresent(new ytq(builder, b == true ? 1 : 0));
                return ((ytw) this.c).a((String) this.a, (yub) builder.s(), null);
            case 8:
                yum yumVar = (yum) obj;
                String o = this.c.o(((Boolean) new mss(4).get()).booleanValue());
                o.getClass();
                boolean booleanValue = ((Boolean) yul.c.e()).booleanValue();
                yul yulVar = ((yuu) this.a).b;
                Object obj16 = this.b;
                if (booleanValue) {
                    return yulVar.i(new yuh(yulVar, o, yumVar, (yua) obj16, 2)).i(new ytu(yulVar, i2), yulVar.f).h(new xpm(o, yumVar, i), yulVar.f);
                }
                return yulVar.i(new yuh(yulVar, o, yumVar, (yua) obj16, 3));
            case 9:
                String o2 = this.c.o(((Boolean) new mss(4).get()).booleanValue());
                o2.getClass();
                return ((aanj) this.b).g.b((String) this.a, o2);
            case 10:
                if (!((Boolean) obj).booleanValue()) {
                    return aneh.a;
                }
                ahcc ahccVar = (ahcc) this.c;
                abnr a = ((ahck) this.a).a(ahccVar);
                if (a == null) {
                    return aneh.a;
                }
                ahcj ahcjVar = (ahcj) this.b;
                abnq h2 = a.h(ahcjVar.b, (abom) algw.h(null).d(new abom() { // from class: ahcl
                    @Override // defpackage.abom
                    public final void a(aozb aozbVar) {
                    }
                }));
                h2.j = ahcjVar.a;
                amnr amnrVar = ahcjVar.c;
                if (amnrVar != null) {
                    h2.c = amnrVar;
                }
                Integer num = ahcjVar.d;
                if (num != null) {
                    h2.i(num.intValue());
                }
                apwa apwaVar = ahcjVar.e;
                if (apwaVar != apwa.DEFAULT) {
                    h2.k = apwaVar;
                }
                if (!((abnr) h2.a).e()) {
                    h2.f(ahcjVar.g);
                }
                int[] iArr = ahcjVar.h;
                if (iArr != null) {
                    for (int i5 : iArr) {
                        if (h2.d == null) {
                            h2.d = new ArrayList();
                        }
                        h2.d.add(Integer.valueOf(i5));
                    }
                }
                int i6 = ahccVar.b - 1;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            throw new IllegalArgumentException("Dropped logs must not be logged.");
                        }
                    } else {
                        h2.h(null);
                    }
                } else {
                    h2.h(ahccVar.a);
                }
                if (Log.isLoggable("Logging.Clearcut", 3)) {
                    Log.d("Logging.Clearcut", h2.toString());
                }
                return agkx.f(h2.c());
            case 11:
                algw algwVar = (algw) obj;
                if (algwVar.f()) {
                    return (ListenableFuture) algwVar.b();
                }
                Object obj17 = this.b;
                Object obj18 = this.a;
                final ahja ahjaVar = (ahja) obj17;
                if (ahjaVar.d.f()) {
                    Object obj19 = ((adec) obj18).e;
                    Uri uri6 = ahjaVar.a;
                    Object b3 = ahjaVar.d.b();
                    Object obj20 = ((alha) obj19).a;
                    synchronized (ahiy.class) {
                        if (!((HashMap) ((ahiy) obj20).b).containsKey(uri6)) {
                            ((HashMap) ((ahiy) obj20).b).put(uri6, new ahix((ahiy) obj20, uri6, (uix) b3));
                        }
                    }
                }
                Object obj21 = this.c;
                anel anelVar = new anel(new agug(i3));
                final adec adecVar = (adec) obj18;
                ListenableFuture Z = aktp.Z(anelVar, new ancs() { // from class: ahjb
                    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
                    /* JADX WARN: Removed duplicated region for block: B:51:0x00df A[Catch: IOException -> 0x0132, RuntimeException -> 0x015f, TryCatch #0 {IOException -> 0x0132, blocks: (B:27:0x0096, B:37:0x00c6, B:38:0x00e5, B:49:0x00cb, B:50:0x00de, B:51:0x00df), top: B:26:0x0096, outer: #2 }] */
                    /* JADX WARN: Type inference failed for: r0v13, types: [alhr, java.lang.Object] */
                    @Override // defpackage.ancs
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r23) {
                        /*
                            Method dump skipped, instructions count: 470
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahjb.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                    }
                }, adecVar.d);
                ahit ahitVar = (ahit) obj21;
                aktp.aa(Z, new ahjd(adecVar, ahjaVar, ahitVar, 0), andi.a);
                Object obj22 = adecVar.a;
                String str3 = ahitVar.a;
                ahiu.f("%s: submitting request to add in-progress download future with key: %s", "DownloadFutureMap", str3);
                ncx ncxVar = new ncx(obj22, str3, Z, 17, (char[]) null);
                aiim aiimVar = (aiim) obj22;
                return aktp.Z(((adwv) aiimVar.a).d(ncxVar, aiimVar.c), new yui(anelVar, Z, 20, bArr), adecVar.d);
            case 12:
                List list = (List) obj;
                ahuv ahuvVar = (ahuv) this.b;
                if (!ahuvVar.e) {
                    list = alog.r("");
                }
                alob alobVar = new alob();
                Iterator it = list.iterator();
                while (true) {
                    Object obj23 = this.c;
                    if (it.hasNext()) {
                        Object obj24 = this.a;
                        String str4 = (String) it.next();
                        if (!ahvc.c.containsKey(new algx(obj24, str4))) {
                            ahta ahtaVar = (ahta) obj23;
                            akkw akkwVar = new akkw(ahtaVar, (String) obj24, str4, ahuvVar.c);
                            if (ahuvVar.d) {
                                str = ahvb.a(ahtaVar.d).getString(ahuvVar.a, "");
                            } else {
                                str = str4;
                            }
                            ListenableFuture d = akkwVar.d(str);
                            alobVar.h(ancj.g(ancj.g(anee.o(d), new ahce(akkwVar, i2), ahtaVar.d()), new vug(ahtaVar, d, ahuvVar, str4, 20), ahtaVar.d()));
                        }
                    } else {
                        return albo.bV(alobVar.g()).a(new agug(i2), ((ahta) obj23).d());
                    }
                }
            case 13:
                Object obj25 = this.a;
                atsg atsgVar = (atsg) this.c;
                aows aowsVar = (aows) ((arlb) atsgVar.e).i(new arll(((adxs) atsgVar.a).d((String) obj25, ((ahyr) atsgVar.g).a()), 0), ahji.ay());
                Locale b4 = ((ahyr) atsgVar.g).b();
                aozy createBuilder2 = aowa.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ((aowa) createBuilder2.b).b = "places/".concat(String.valueOf(((aibl) this.b).a));
                String languageTag = b4.toLanguageTag();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                aowa aowaVar = (aowa) createBuilder2.b;
                languageTag.getClass();
                aowaVar.c = languageTag;
                aowa aowaVar2 = (aowa) createBuilder2.s();
                aqrs aqrsVar = aowsVar.a;
                aqux aquxVar = aowt.d;
                if (aquxVar == null) {
                    synchronized (aowt.class) {
                        aquxVar = aowt.d;
                        if (aquxVar == null) {
                            aquu a2 = aqux.a();
                            a2.e = aquw.UNARY;
                            a2.a = aqux.c("google.maps.places.v1.Places", "GetPlace");
                            a2.b();
                            aowa aowaVar3 = aowa.a;
                            aozs aozsVar = arkx.a;
                            a2.c = new arkw(aowaVar3);
                            a2.d = new arkw(aowr.a);
                            aquxVar = a2.a();
                            aowt.d = aquxVar;
                        }
                    }
                }
                return arlj.a(aqrsVar.a(aquxVar, aowsVar.b), aowaVar2);
            case 14:
                ?? r0 = this.b;
                ?? r2 = this.a;
                boolean equals = albo.bQ(r0).equals(albo.bQ(r2));
                Object obj26 = this.c;
                if (equals) {
                    return albo.bI(obj);
                }
                ancs d2 = akto.d(new ahsi(obj26, r2, i4));
                aiws aiwsVar = (aiws) obj26;
                ListenableFuture g2 = ancj.g(r2, d2, aiwsVar.c);
                synchronized (aiwsVar.e) {
                }
                return g2;
            case 15:
                return ((aiwu) this.c).f.d(this.b, this.a);
            case 16:
                return ((aiwu) ((asqc) this.c).a).f.d(this.b, this.a);
            case 17:
                ajyz ajyzVar = (ajyz) obj;
                boolean z5 = ajyzVar.a;
                Object obj27 = this.c;
                Object obj28 = this.b;
                if (!z5) {
                    albo.T(true);
                    return albo.bI(new ajxc((ajwt) obj27, ajzb.a, ajyzVar, null, (ajxb) obj28));
                }
                return ancj.f(((ansy) ((aogy) this.a).b).B((ajwt) obj27), akto.a(new abdo(ajyzVar, obj28, 17, bArr)), andi.a);
            case 18:
                ((ajza) obj).getClass();
                return ((ahiy) this.b).o((String) this.a, (ajwt) this.c, true);
            default:
                akix akixVar = (akix) obj;
                aozy createBuilder3 = ahtt.a.createBuilder();
                aozy createBuilder4 = ahts.a.createBuilder();
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                ahts ahtsVar = (ahts) createBuilder4.b;
                ahtsVar.c = a.ak(4);
                ahtsVar.b |= 1;
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                ?? r6 = this.a;
                Object obj29 = this.c;
                Object obj30 = this.b;
                ahtt ahttVar = (ahtt) createBuilder3.b;
                ahts ahtsVar2 = (ahts) createBuilder4.s();
                ahtsVar2.getClass();
                ahttVar.d = ahtsVar2;
                ahttVar.b |= 2;
                akjb akjbVar = (akjb) obj30;
                akjbVar.c(createBuilder3);
                akie akieVar = (akie) obj29;
                akja C = akec.C(akieVar, createBuilder3, akjbVar.r, akjbVar.e);
                if (akixVar.d(r6, C)) {
                    if (((Boolean) akjbVar.o.a()).booleanValue()) {
                        return albo.bI(new akip(z));
                    }
                    return aktp.Y(akjbVar.j.b().b(akieVar.e, C.c), akto.a(new akdg(i2)), andi.a);
                }
                return albo.bI(new akip((boolean) (b2 == true ? 1 : 0)));
        }
    }

    public /* synthetic */ xrd(atsg atsgVar, String str, aibl aiblVar, int i) {
        this.d = i;
        this.c = atsgVar;
        this.a = str;
        this.b = aiblVar;
    }

    public /* synthetic */ xrd(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ xrd(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ xrd(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ xrd(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ xrd(Object obj, String str, Object obj2, int i) {
        this.d = i;
        this.b = obj;
        this.a = str;
        this.c = obj2;
    }
}
