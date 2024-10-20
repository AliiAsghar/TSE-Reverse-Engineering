package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ncx implements ancr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ncx(ajnv ajnvVar, ylf ylfVar, Class cls, int i) {
        this.d = i;
        this.b = ajnvVar;
        this.a = ylfVar;
        this.c = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v145, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v149, types: [java.util.List, java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v31, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v37, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v53, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v74, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, mml] */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, apbt] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, apbt] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, apbt] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, apbt] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, apbt] */
    /* JADX WARN: Type inference failed for: r6v21, types: [ahiw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.ancr
    public final ListenableFuture a() {
        int U;
        int i = 3;
        byte[] bArr = null;
        int i2 = 1;
        switch (this.d) {
            case 0:
                ncz nczVar = (ncz) this.a;
                rwd rwdVar = (rwd) nczVar.h.b();
                Object obj = this.b;
                MessageIdType messageIdType = (MessageIdType) obj;
                MessageCoreData q = rwdVar.q(messageIdType);
                if (q == null) {
                    alwl alwlVar = (alwl) ncz.a.g();
                    alwlVar.X(ydl.b, obj);
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/protocol/fallback/RcsFallbackControllerImpl", "attemptClientSideFallback", 191, "RcsFallbackControllerImpl.java")).q("Fallback not initiated as message not found");
                    return aktp.ag(new ncw(messageIdType, 1));
                }
                return nczVar.a(q, (amfd) this.c);
            case 1:
                alwo alwoVar = mmg.a;
                return this.c.b(this.b, (miv) this.a);
            case 2:
                return ((ncz) this.a).a(this.b, (amfd) this.c);
            case 3:
                String str = ((qgs) ((Optional) this.c).get()).c;
                qco qcoVar = (qco) this.a;
                return qco.l(((uof) qcoVar.k.a.b()).a(upk.b("on_trigger_chat_group_full_state_update_complete", this.b, qcoVar.a(str))));
            case 4:
                String str2 = ((qfx) ((Optional) this.c).get()).c;
                qco qcoVar2 = (qco) this.a;
                return qco.l(((uof) qcoVar2.f.a.b()).a(upk.b("on_remove_user_from_group_chat_complete", this.b, qcoVar2.a(str2))));
            case 5:
                String str3 = ((qeb) ((Optional) this.c).get()).c;
                qco qcoVar3 = (qco) this.a;
                return qco.l(((uof) qcoVar3.h.a.b()).a(upk.b("on_add_user_to_group_chat_complete", this.b, qcoVar3.a(str3))));
            case 6:
                String str4 = ((qgd) ((Optional) this.c).get()).c;
                qco qcoVar4 = (qco) this.a;
                return qco.l(((uof) qcoVar4.i.a.b()).a(upk.b("chatapi_revoke_chat_message_response", this.b, qcoVar4.a(str4))));
            case 7:
                String str5 = ((qem) ((Optional) this.c).get()).c;
                qco qcoVar5 = (qco) this.a;
                return qco.l(((uof) qcoVar5.g.a.b()).a(upk.b("on_create_group_chat_complete", this.b, qcoVar5.a(str5))));
            case 8:
                if (((ulx) this.c).d) {
                    int i3 = alog.d;
                    return aktp.ag(alsx.a);
                }
                Object obj2 = this.a;
                xoa xoaVar = ((ulw) this.b).u;
                return aktp.aj(new xpx(xoaVar, obj2, i2, bArr), xoaVar.b);
            case 9:
                boolean isEmpty = ((ArrayList) this.c).isEmpty();
                Object obj3 = this.b;
                if (isEmpty) {
                    return aktp.ag(obj3);
                }
                return ((uqh) this.a).d(Integer.valueOf(((Integer) obj3).intValue() + 1));
            case 10:
                final uzu uzuVar = (uzu) albo.bQ(this.b);
                final int intValue = ((Integer) albo.bQ(this.c)).intValue();
                final uzv uzvVar = (uzv) this.a;
                return aktp.ai(new Callable() { // from class: uzt
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        uzv uzvVar2;
                        int i4;
                        aozy createBuilder = ulz.a.createBuilder();
                        aozy createBuilder2 = uzy.a.createBuilder();
                        aozy createBuilder3 = ulq.a.createBuilder();
                        uzu uzuVar2 = uzuVar;
                        alog a = uzuVar2.a();
                        int i5 = ((alsx) a).c;
                        int i6 = 0;
                        while (true) {
                            uzvVar2 = uzv.this;
                            if (i6 >= i5) {
                                break;
                            }
                            MessageCoreData messageCoreData = (MessageCoreData) a.get(i6);
                            MessageIdType B = messageCoreData.B();
                            xyo c = uzv.D.c();
                            c.H("Deleted local");
                            c.c(B);
                            c.q();
                            if (messageCoreData.cJ() && !messageCoreData.cP()) {
                                uzvVar2.f.c("Bugle.Rcs.Files.Transfer.Outgoing.Cancelled.Counts");
                            }
                            Uri t = messageCoreData.t();
                            if (t != null) {
                                createBuilder.P(t.toString());
                            }
                            Iterator it = messageCoreData.W().iterator();
                            while (true) {
                                i4 = i6 + 1;
                                if (it.hasNext()) {
                                    Uri t2 = ((MessagePartCoreData) it.next()).t();
                                    if (t2 != null) {
                                        if (((Boolean) uzvVar2.m.b()).booleanValue()) {
                                            if (uzz.c(t2)) {
                                                createBuilder2.T(t2.toString());
                                            } else {
                                                createBuilder.Q(t2.toString());
                                            }
                                        } else {
                                            createBuilder.Q(t2.toString());
                                        }
                                    }
                                }
                            }
                            i6 = i4;
                        }
                        uzvVar2.g.b(uzvVar2.b, (String[]) Collection.EL.stream(uzuVar2.a).map(new uzd(11)).filter(new uzr(0)).toArray(new mlo(13)));
                        alob alobVar = new alob();
                        if (!uzuVar2.b.isEmpty()) {
                            alobVar.h(vjs.b());
                            alobVar.h(vjs.g());
                        }
                        if (((ulz) createBuilder.b).c.size() > 0 || ((ulz) createBuilder.b).b.size() > 0) {
                            alobVar.h(upk.a("delete_message_from_telephony", (ulz) createBuilder.s()));
                        }
                        if (((Boolean) uzvVar2.m.b()).booleanValue() && ((uzy) createBuilder2.b).b.size() > 0) {
                            alobVar.h(upk.a("delete_part_cms_attachment", (uzy) createBuilder2.s()));
                        }
                        if (((ulq) createBuilder3.b).b.size() > 0) {
                            alobVar.h(upk.a("cancel_rcs_file_transfer", (ulq) createBuilder3.s()));
                        }
                        alvw g = uzv.a.g();
                        g.X(alwp.a, "BugleNotifications");
                        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/message/delete/DeleteMessageHandler", "getPostProcessingWorkQueueRequests", 407, "DeleteMessageHandler.java")).q("Creating notification from DeleteMessageHandler");
                        ((wpp) uzvVar2.j.b()).K();
                        return alobVar.g();
                    }
                }, uzvVar.d).i(new ancs() { // from class: uzp
                    @Override // defpackage.ancs
                    public final ListenableFuture a(Object obj4) {
                        alog alogVar = (alog) obj4;
                        upl a = upm.a();
                        a.b(true);
                        a.c(false);
                        Bundle bundle = new Bundle();
                        bundle.putInt("delete_count", intValue);
                        a.b = bundle;
                        if (!alogVar.isEmpty()) {
                            a.a = alogVar;
                        }
                        return aktp.ag(a.a());
                    }
                }, uzvVar.c);
            case 11:
                ArrayList arrayList = new ArrayList();
                Iterator it = this.c.iterator();
                while (true) {
                    Object obj4 = this.b;
                    if (it.hasNext()) {
                        StatusBarNotification statusBarNotification = (StatusBarNotification) it.next();
                        arrayList.add(new vkv((vlm) obj4, Optional.ofNullable(statusBarNotification.getTag()), statusBarNotification.getNotification().extras, dyd.d(statusBarNotification.getNotification())));
                    } else {
                        vjw vjwVar = (vjw) this.a;
                        vkp vkpVar = (vkp) vjwVar.b.get(vlm.NT_DIRECTOR);
                        vkpVar.getClass();
                        akul a = vkpVar.a(arrayList);
                        akul ag = aktp.ag(null);
                        if (vjwVar.b.containsKey(obj4)) {
                            vkp vkpVar2 = (vkp) vjwVar.b.get(obj4);
                            vkpVar2.getClass();
                            ag = vkpVar2.a(arrayList);
                        }
                        return aktp.ap(a, ag).h(new vcr(6), andi.a);
                    }
                }
            case 12:
                return aktp.ai(new vmb(this.c, this.b, 12, bArr), ((vwo) this.a).d);
            case 13:
                ?? r0 = this.c;
                unz unzVar = (unz) albo.bQ(this.b);
                if (((Boolean) albo.bQ(r0)).booleanValue()) {
                    Object obj5 = this.a;
                    alvg alvgVar = (alvg) wba.b.i();
                    qfo qfoVar = (qfo) obj5;
                    alvgVar.X(ydl.e, qfoVar.g);
                    alvgVar.X(ydl.p, ruy.b(qfoVar.h));
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/rcs/messaging/handler/GetSingleMessageHandler", "enqueueAndWaitForResultIfGroupConversationExists", 338, "GetSingleMessageHandler.java")).q("Group conversation missing, not waiting for message processing");
                    return unzVar.b().h(new wax(i), andi.a);
                }
                return unzVar.a().h(new wax(4), andi.a);
            case 14:
                return ((xff) this.a).e(this.c, ((aniv) this.b).a);
            case 15:
                Optional empty = Optional.empty();
                Optional.empty().isPresent();
                Object obj6 = this.a;
                xpp xppVar = (xpp) obj6;
                Context context = xppVar.d;
                Object obj7 = this.c;
                Uri d = uhl.d("file_".concat(String.valueOf(obj7)), xppVar.d);
                File i4 = uhl.i(d, context);
                empty.isPresent();
                AtomicReference atomicReference = new AtomicReference();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(i4, false);
                    Object obj8 = this.b;
                    String str6 = (String) obj7;
                    akul g = akul.g(d.m(new xpo(atomicReference, str6, fileOutputStream, empty, 0)));
                    pxe a2 = ((pxg) xppVar.b.b()).a((String) obj8, (UrlRequest.Callback) atomicReference.get()).a();
                    a2.b();
                    alwl alwlVar2 = (alwl) xpp.a.g();
                    alwlVar2.X(xod.a, obj7);
                    ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/transfer/downloads/CronetFileDownloader", "downloadInternal", 191, "CronetFileDownloader.java")).q("File download request is started.");
                    xppVar.e.put(obj7, a2);
                    if (!empty.isEmpty()) {
                        akrh e = aktp.e("CronetFileDownloader-TG::download");
                        try {
                            e.b(g);
                            e.close();
                        } finally {
                        }
                    }
                    return g.i(new vug(xppVar, str6, fileOutputStream, d, 4), xppVar.c).f(Throwable.class, new vwx(obj6, obj7, fileOutputStream, 19, (short[]) null), xppVar.c);
                } catch (FileNotFoundException e2) {
                    throw new xpt(false, "Failed to open a new output stream.", xoc.FILE_TRANSFER_FAILURE_REASON_WRITING_TO_FILE_FAILED, (Throwable) e2);
                }
            case 16:
                return akul.g(d.m(new gst(this.b, this.a, this.c, 9, (byte[]) null)));
            case 17:
                Object obj9 = this.b;
                Object obj10 = this.c;
                Object obj11 = this.a;
                try {
                    ((aiim) obj11).d.a((String) obj10, ((aiim) obj11).b.size() + 1);
                    ((aiim) obj11).b.put(obj10, obj9);
                    return aneh.a;
                } catch (Exception e3) {
                    ahiu.e(e3, "%s: Failed to add download future (%s) to map", "DownloadFutureMap", obj10);
                    return albo.bH(e3);
                }
            case 18:
                ahrn ahrnVar = (ahrn) this.a;
                if (!((ahmu) ahrnVar.a).c(null)) {
                    return aneh.a;
                }
                aozy aozyVar = (aozy) this.b;
                asim asimVar = (asim) aozyVar.b;
                int i5 = asimVar.s;
                int U2 = a.U(i5);
                if (((U2 != 0 && U2 == 3) || ((U = a.U(i5)) != 0 && U == 2)) && (asimVar.b & 16) == 0) {
                    return aneh.a;
                }
                Object obj12 = this.c;
                ahpz ahpzVar = (ahpz) ahrnVar.c.b();
                algw algwVar = ahpzVar.b;
                algw algwVar2 = ahpzVar.a;
                ListenableFuture bI = albo.bI(alfd.a);
                ListenableFuture bI2 = albo.bI(alfd.a);
                return albo.bW(bI, bI2).b(new tvp(ahrnVar, aozyVar, bI, bI2, (String) obj12, 8), andi.a);
            case 19:
                Set set = (Set) ((akkd) this.b).g.b();
                ArrayList arrayList2 = new ArrayList(set.size());
                Iterator it2 = set.iterator();
                Object obj13 = this.a;
                while (it2.hasNext()) {
                    try {
                        arrayList2.add(((ajzc) it2.next()).a((ajzd) obj13));
                    } catch (Exception e4) {
                        arrayList2.add(albo.bH(e4));
                    }
                }
                ?? r02 = this.c;
                r02.addAll(arrayList2);
                return albo.bX(r02).a(new aidu(bArr, 18), andi.a);
            default:
                ListenableFuture b = ((akcq) ((akdf) this.b).a.b()).b((WorkerParameters) this.a);
                ((akrh) this.c).b(b);
                return b;
        }
    }

    public /* synthetic */ ncx(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ ncx(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ ncx(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ ncx(mml mmlVar, DefaultConversation defaultConversation, miv mivVar, int i) {
        this.d = i;
        this.c = mmlVar;
        this.b = defaultConversation;
        this.a = mivVar;
    }
}
