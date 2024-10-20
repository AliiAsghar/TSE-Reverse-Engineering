package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.ContactsContract;
import android.telecom.PhoneAccount;
import android.telephony.PhoneNumberUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.filetransfer.FileTransferInfo;
import com.google.android.ims.rcsservice.filetransfer.FileTransferServiceResult;
import com.google.android.rcs.client.filetransfer.FileTransferService;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xfb implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ xfb(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v142, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v168, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, apbt] */
    /* JADX WARN: Type inference failed for: r2v100, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v109, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v113, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, apbt] */
    /* JADX WARN: Type inference failed for: r3v60, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        vqh vqhVar;
        Object apply;
        agnw d;
        Optional ofNullable;
        int i = 11;
        int i2 = 8;
        int i3 = 6;
        String str = null;
        int i4 = 1;
        switch (this.c) {
            case 0:
                wfh wfhVar = (wfh) ((xfc) this.a).e.b();
                ?? r2 = this.b;
                qen qenVar = (qen) r2;
                ((uof) wfhVar.a.b()).a(upk.b("tachygram_create_group", r2, xfc.i(qenVar.c)));
                alwl alwlVar = (alwl) xfc.b.g();
                alwlVar.X(ydl.I, qenVar.c);
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "createGroupChat", 182, "TachygramOutgoingChatApi.java")).q("CreateGroupChatRequest is queued.");
                aozb aozbVar = qenVar.h;
                aozy createBuilder = qeo.a.createBuilder();
                qeg qegVar = xfc.a;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                qeo qeoVar = (qeo) apagVar;
                qegVar.getClass();
                qeoVar.c = qegVar;
                qeoVar.b |= 1;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar2 = createBuilder.b;
                qeo qeoVar2 = (qeo) apagVar2;
                aozbVar.getClass();
                qeoVar2.b |= 4;
                qeoVar2.e = aozbVar;
                amxo amxoVar = amxo.RCS_TACHYGRAM;
                if (!apagVar2.isMutable()) {
                    createBuilder.u();
                }
                qeo qeoVar3 = (qeo) createBuilder.b;
                qeoVar3.f = amxoVar.h;
                qeoVar3.b |= 8;
                return (qeo) createBuilder.s();
            case 1:
                wfh wfhVar2 = (wfh) ((xfc) this.a).g.b();
                ?? r22 = this.b;
                qfy qfyVar = (qfy) r22;
                qfb qfbVar = qfyVar.c;
                if (qfbVar == null) {
                    qfbVar = qfb.a;
                }
                ((uof) wfhVar2.a.b()).a(upk.b("tachygram_remove_user_from_group", r22, xfc.i(qfbVar.c)));
                alwl alwlVar2 = (alwl) xfc.b.g();
                alvz alvzVar = ydl.I;
                qfb qfbVar2 = qfyVar.c;
                if (qfbVar2 == null) {
                    qfbVar2 = qfb.a;
                }
                alwlVar2.X(alvzVar, qfbVar2.c);
                ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "removeUserFromGroupChat", 226, "TachygramOutgoingChatApi.java")).q("RemoveUserFromGroupChatRequest is queued.");
                aozb aozbVar2 = qfyVar.e;
                aozy createBuilder2 = qfz.a.createBuilder();
                qeg qegVar2 = xfc.a;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar3 = createBuilder2.b;
                qfz qfzVar = (qfz) apagVar3;
                qegVar2.getClass();
                qfzVar.c = qegVar2;
                qfzVar.b |= 1;
                if (!apagVar3.isMutable()) {
                    createBuilder2.u();
                }
                qfz qfzVar2 = (qfz) createBuilder2.b;
                aozbVar2.getClass();
                qfzVar2.b |= 2;
                qfzVar2.d = aozbVar2;
                return (qfz) createBuilder2.s();
            case 2:
                Object obj = this.a;
                Object obj2 = this.b;
                akrh e = aktp.e("TachygramOutgoingChatApi::sendMessageNowWithoutUsingPwq");
                try {
                    xfl xflVar = (xfl) ((xfc) obj).l.b();
                    akrh e2 = aktp.e("TachygramSendMessageWorkHandler::processSendChatMessageRequest");
                    try {
                        xff xffVar = xflVar.b;
                        akrh e3 = aktp.e("TachygramOutgoingOperationTemplate::processWithoutUsingPwq");
                        try {
                            akul d2 = xffVar.d(obj2, null, new xeo(xffVar, i));
                            e3.b(d2);
                            e3.close();
                            e2.b(d2);
                            e2.close();
                            akul h = d2.e(Throwable.class, new xeu(obj2, 5), ((xfc) obj).k).h(new whh(obj, obj2, 15), ((xfc) obj).k);
                            e.b(h);
                            umz umzVar = (umz) ((xfc) obj).m.b();
                            int d3 = umzVar.d(EnumSet.allOf(umy.class), h, new wxx(obj, 2));
                            umzVar.f("Bugle.DataModel.Action.SendMessage.Rcs.Tachygram.AttachingAndroidFutureWrapper.Count", d3);
                            if (d3 == 1) {
                                ((wfh) ((xfc) obj).c.b()).j((qgf) obj2, ((xfc) obj).h((qgf) obj2));
                            } else {
                                qiu.h(h);
                            }
                            e.close();
                            wpp wppVar = (wpp) ((xfc) obj).j.b();
                            qgf qgfVar = (qgf) obj2;
                            if ((qgfVar.b & 512) != 0) {
                                qgr qgrVar = qgfVar.l;
                                if (qgrVar == null) {
                                    qgrVar = qgr.a;
                                }
                                wppVar.l(qgrVar, rve.a(qgfVar.f), 6);
                            }
                            alwl alwlVar3 = (alwl) xfc.b.g();
                            alwlVar3.X(ydl.a, qgfVar.f);
                            alwlVar3.X(ydl.o, qgfVar.g);
                            ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "sendMessage", 140, "TachygramOutgoingChatApi.java")).q("SendChatMessageRequest is queued.");
                            aozb aozbVar3 = qgfVar.j;
                            aozy createBuilder3 = qgg.a.createBuilder();
                            qeg qegVar3 = xfc.a;
                            if (!createBuilder3.b.isMutable()) {
                                createBuilder3.u();
                            }
                            apag apagVar4 = createBuilder3.b;
                            qgg qggVar = (qgg) apagVar4;
                            qegVar3.getClass();
                            qggVar.c = qegVar3;
                            qggVar.b |= 1;
                            if (!apagVar4.isMutable()) {
                                createBuilder3.u();
                            }
                            qgg qggVar2 = (qgg) createBuilder3.b;
                            aozbVar3.getClass();
                            qggVar2.b |= 2;
                            qggVar2.d = aozbVar3;
                            amgu cL = yyb.cL();
                            if (!createBuilder3.b.isMutable()) {
                                createBuilder3.u();
                            }
                            qgg qggVar3 = (qgg) createBuilder3.b;
                            cL.getClass();
                            qggVar3.h = cL;
                            qggVar3.b |= 32;
                            return (qgg) createBuilder3.s();
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            case 3:
                for (xgm xgmVar : ((xgn) this.b).b) {
                    Object obj3 = this.a;
                    ((xni) obj3).a.c(xgmVar.b, Uri.parse(xgmVar.c));
                }
                return upm.b();
            case 4:
                alob alobVar = new alob();
                for (MessageIdType messageIdType : this.a) {
                    Object obj4 = this.b;
                    xov a = ((xoa) obj4).c.a(messageIdType);
                    if (!a.a()) {
                        alvw m = xoa.a.m();
                        m.X(ydl.a, messageIdType.a());
                        ((alwl) m.h("com/google/android/apps/messaging/shared/transfer/CancelFileTransferHelper", "cancelOngoingFileTransfersByMessageIds", 88, "CancelFileTransferHelper.java")).q("Trying to cancel a file transfer for a message that does not have a valid file transfer.");
                    } else {
                        alobVar.h(a);
                    }
                }
                return alobVar.g();
            case 5:
                return (MessageIdType) ((xoi) this.b).b.c("FileTransferProgressCallbackHandler#readMessageIdForFileTransferFromBugleDatabase", new vvk(this.a, 10));
            case 6:
                Object obj5 = this.b;
                xpi xpiVar = (xpi) this.a;
                if (xpiVar.b.containsKey(obj5)) {
                    return Optional.of((xog) xpiVar.b.get(obj5));
                }
                return Optional.empty();
            case 7:
                return Boolean.valueOf(((rwd) ((xqq) this.a).f.b()).N(this.b));
            case 8:
                return Boolean.valueOf(((xxh) ((xrf) this.a).u.b()).e(((qei) this.b).d));
            case 9:
                MessageIdType B = this.b.B();
                qep qepVar = (qep) new pwc().m().fu(this.a);
                akrh e4 = aktp.e("FileTransferDatabaseOperations#upsertFileTransferEntryForManualDownload");
                try {
                    xox b = xpf.b();
                    b.c(B);
                    b.e("");
                    b.f(xpg.DOWNLOAD);
                    b.b(qepVar);
                    xow a2 = b.a();
                    xpe xpeVar = new xpe();
                    xpeVar.b(B);
                    boolean s = a2.s(new agpw(xpeVar));
                    e4.close();
                    return Boolean.valueOf(s);
                } finally {
                }
            case 10:
                rwd rwdVar = (rwd) ((xrg) this.a).b.b();
                Object obj6 = this.b;
                MessageCoreData r = rwdVar.r((rve) obj6);
                if (r != null) {
                    if (r.G() != null) {
                        if (r.t() != null) {
                            alwl alwlVar4 = (alwl) xrg.a.g();
                            alwlVar4.X(ydl.e, ((rvf) obj6).b);
                            alwlVar4.X(ydl.o, r.z().toString());
                            alwlVar4.X(ydl.a, String.valueOf(r.B().a));
                            ((alwl) alwlVar4.h("com/google/android/apps/messaging/shared/transfer/incoming/MessageCoreDataGetter", "getMessageCoreDataLegacy", 149, "MessageCoreDataGetter.java")).q("MessageCoreData found for incoming file transfer");
                            return Optional.of(r);
                        }
                        alwl alwlVar5 = (alwl) xrg.a.i();
                        alwlVar5.X(ydl.e, ((rvf) obj6).b);
                        ((alwl) alwlVar5.h("com/google/android/apps/messaging/shared/transfer/incoming/MessageCoreDataGetter", "getMessageCoreDataLegacy", 133, "MessageCoreDataGetter.java")).q("Message SMS URI is null");
                        throw new xpt(true, xoc.FILE_TRANSFER_FAILURE_REASON_INVALID_MESSAGE, "Message SMS URI is null");
                    }
                    alwl alwlVar6 = (alwl) xrg.a.i();
                    alwlVar6.X(ydl.e, ((rvf) obj6).b);
                    ((alwl) alwlVar6.h("com/google/android/apps/messaging/shared/transfer/incoming/MessageCoreDataGetter", "getMessageCoreDataLegacy", 117, "MessageCoreDataGetter.java")).q("Message has no attachments");
                    throw new xpt(false, xoc.FILE_TRANSFER_FAILURE_REASON_INVALID_MESSAGE, "Message has no attachments");
                }
                alwl alwlVar7 = (alwl) xrg.a.i();
                alwlVar7.X(ydl.e, ((rvf) obj6).b);
                ((alwl) alwlVar7.h("com/google/android/apps/messaging/shared/transfer/incoming/MessageCoreDataGetter", "getMessageCoreDataLegacy", 105, "MessageCoreDataGetter.java")).q("Message does not exist");
                throw new xpt(false, xoc.FILE_TRANSFER_FAILURE_REASON_MESSAGE_NOT_FOUND, "Message does not exist");
            case 11:
                Object obj7 = this.a;
                Object obj8 = this.b;
                try {
                    if (((xsg) obj8).d((String) obj7)) {
                        FileTransferServiceResult resumeUploadToContentServer = ((FileTransferService) ((xsg) obj8).b.b()).resumeUploadToContentServer(Long.parseLong((String) obj7));
                        if (resumeUploadToContentServer.succeeded()) {
                            alwl alwlVar8 = (alwl) xsg.a.g();
                            alwlVar8.X(xod.a, obj7);
                            ((alwl) alwlVar8.h("com/google/android/apps/messaging/shared/transfer/uploads/LegacyRcsFileUploader", "resumeUpload", 195, "LegacyRcsFileUploader.java")).q("Resumed file upload.");
                            vqhVar = vqh.a;
                        } else {
                            alwl alwlVar9 = (alwl) xsg.a.i();
                            alwlVar9.X(xod.a, obj7);
                            ((alwl) alwlVar9.h("com/google/android/apps/messaging/shared/transfer/uploads/LegacyRcsFileUploader", "resumeUpload", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "LegacyRcsFileUploader.java")).r("Failed to resume the upload: %s.", resumeUploadToContentServer.getCode());
                            vqhVar = vqh.a(3, 0).a();
                        }
                    } else {
                        vqhVar = vqh.a;
                    }
                    return vqhVar;
                } catch (ajny unused) {
                    return vqh.a(3, 0).a();
                }
            case 12:
                xsg xsgVar = (xsg) this.b;
                Context context = xsgVar.d;
                xsq xsqVar = (xsq) this.a;
                context.grantUriPermission("com.google.android.ims", xsqVar.b.d, 1);
                FileTransferService fileTransferService = (FileTransferService) xsgVar.b.b();
                String e5 = rve.e(xsqVar.a.E());
                adst adstVar = adst.FILE_TRANSFER;
                xos xosVar = new xos(i3);
                xrz xrzVar = xsqVar.b;
                return fileTransferService.uploadToContentServer(e5, new FileTransferInfo(adstVar, xrzVar.d, (String) xrzVar.c.map(xosVar).orElse(null), (String) xrzVar.e.orElse(null), xrzVar.f.orElse(-1L), ((Long) xrzVar.b.map(new xos(7)).orElse(0L)).longValue(), (byte[]) xrzVar.h.map(new xos(i2)).orElse(null), (String) xrzVar.g.map(new xos(i3)).orElse(null)));
            case 13:
                pzv a3 = ((pzw) ((wyp) this.a).a.b()).a((pzn) this.b);
                if (a3.b() == 1) {
                    return Optional.of(a3.a());
                }
                if (a3.c().b != xoc.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_READ_THUMBNAIL_INFO_IN_DB) {
                    return Optional.empty();
                }
                throw new xrv();
            case 14:
                uuf uufVar = xzk.a;
                String[] strArr = tcz.a;
                int i5 = taq.a;
                tcs tcsVar = new tcs();
                ?? r23 = this.b;
                tcsVar.b(r23.toString());
                tcsVar.c(this.a.toString());
                tcr a4 = tcsVar.a();
                apply = new xol(r23, 12).apply(new tcy());
                agpw agpwVar = new agpw((tcy) apply);
                d = agnc.d("$primary");
                Boolean bool = (Boolean) d.r(new tdw((aglz) a4, agpwVar, d, i4));
                bool.booleanValue();
                return bool;
            case 15:
                Object obj9 = this.a;
                Object obj10 = this.b;
                try {
                    MediaPlayer mediaPlayer = ((ygs) obj10).e;
                    if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                        ((ygs) obj10).e.stop();
                        ((alwl) ygs.a.m().h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "stop", 87, "PlaybackSession.java")).t("Stopping due to: %s", obj9);
                        ygs ygsVar = (ygs) obj10;
                        ygsVar.b();
                        ahjj ahjjVar = ygsVar.h;
                        if (ahjjVar == null) {
                            return true;
                        }
                        ahjjVar.t();
                        ygsVar.h = null;
                        return true;
                    }
                    return false;
                } finally {
                    ygs ygsVar2 = (ygs) obj10;
                    ygsVar2.b();
                    ahjj ahjjVar2 = ygsVar2.h;
                    if (ahjjVar2 != null) {
                        ahjjVar2.t();
                        ygsVar2.h = null;
                    }
                }
            case 16:
                aozy createBuilder4 = aldb.a.createBuilder();
                createBuilder4.aC(((aldb) albo.bQ(this.b)).b);
                createBuilder4.aC(((aldb) albo.bQ(this.a)).b);
                return (aldb) createBuilder4.s();
            case 17:
                Iterator it = this.a.iterator();
                while (true) {
                    Object obj11 = this.b;
                    if (it.hasNext()) {
                        Iterator it2 = ((List) albo.bQ((akul) it.next())).iterator();
                        while (it2.hasNext()) {
                            ((aozy) obj11).aD((alda) it2.next());
                        }
                    } else {
                        return (aldb) ((aozy) obj11).s();
                    }
                }
            case 18:
                qyn qynVar = ((ytj) this.b).d;
                String str2 = (String) this.a;
                sep a5 = qynVar.a(str2);
                if (a5 == null) {
                    ofNullable = Optional.empty();
                } else {
                    ofNullable = Optional.ofNullable(a5.a);
                }
                if (ofNullable.isEmpty()) {
                    ytj.a.q("No brand data found for sender ".concat(str2));
                    return new atal(2, (char[]) null);
                }
                ytj.a.o("Successfully loaded brand data");
                tox toxVar = (tox) ofNullable.get();
                Uri h2 = toxVar.h();
                BusinessInfoData.Builder builder = BusinessInfoData.builder(toxVar.k());
                builder.setName(toxVar.m());
                builder.setVerifiedBrand(true);
                builder.setDescription(toxVar.l());
                if (h2 != null) {
                    str = h2.toString();
                }
                builder.setLogoImageLocalUri(str);
                return new atal(builder.build());
            case 19:
                Object obj12 = this.b;
                PhoneAccount a6 = ((yvn) ((yvu) obj12).c.b()).a();
                ?? r5 = this.a;
                if (a6 != null && a6.hasCapabilities(8) && a6.hasCapabilities(256) && !r5.isEmpty()) {
                    String[] strArr2 = {"data1", "carrier_presence"};
                    HashSet hashSet = new HashSet();
                    algs algsVar = new algs(",");
                    Stream map = Collection.EL.stream(r5).map(new yug(i));
                    int i6 = alog.d;
                    try {
                        Cursor a7 = new rri(((yvu) obj12).b, ContactsContract.Data.CONTENT_URI, strArr2, "contact_id IN (" + algsVar.d((Iterable) map.collect(alls.a)) + ") AND mimetype=?", new String[]{"vnd.android.cursor.item/phone_v2"}, null).a();
                        if (a7 != null) {
                            while (a7.moveToNext()) {
                                try {
                                    if ((a7.getInt(1) & 1) != 0) {
                                        hashSet.add(PhoneNumberUtils.normalizeNumber(a7.getString(0)));
                                    }
                                } finally {
                                }
                            }
                        }
                        if (a7 != null) {
                            a7.close();
                        }
                    } catch (Exception e6) {
                        yvu.a.r("Failed to retrieve ViLTE video reachability", e6);
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (ParticipantsTable.BindData bindData : r5) {
                        String M = bindData.M();
                        if (hashSet.contains(bindData.O())) {
                            arrayList.add(M);
                        } else {
                            arrayList2.add(bindData);
                        }
                    }
                    tbb f = ParticipantsTable.f();
                    f.af();
                    f.aj("updateReachability");
                    f.K(2);
                    f.M(new yur(arrayList, 9));
                    f.a().e();
                    return arrayList2;
                }
                return r5;
            default:
                return Boolean.valueOf(((yxr) this.a).f(((yxj) this.b).a));
        }
    }

    public /* synthetic */ xfb(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
