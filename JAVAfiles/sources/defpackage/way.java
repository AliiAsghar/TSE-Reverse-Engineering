package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.telecom.TelecomManager;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.contacts.ContactsServiceResult;
import com.google.android.rcs.client.messaging.RcsMessagingService;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class way implements algk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ way(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v101, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v121, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [j$.time.temporal.Temporal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v72, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r1v96, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Object, xne] */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r2v6, types: [j$.time.temporal.Temporal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.Set, java.lang.Object] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        xta xtaVar;
        xsz xszVar;
        Intent createManageBlockedNumbersIntent;
        int i = 0;
        int i2 = 4;
        int i3 = 2;
        int i4 = 9;
        byte[] bArr = null;
        switch (this.d) {
            case 0:
                RcsMessagingService rcsMessagingService = (RcsMessagingService) obj;
                Object obj2 = this.a;
                if (aczf.v()) {
                    ?? r1 = this.b;
                    wba wbaVar = (wba) obj2;
                    wbaVar.f.b.g("Bugle.MessagingService.GetMessages.Binder.OnDemand.Connect.Latency", Duration.between(r1, Instant.ofEpochMilli(wbaVar.h.a())).toMillis());
                }
                if (((Boolean) ((utz) vzh.e.get()).e()).booleanValue()) {
                    Object obj3 = this.c;
                    vzh vzhVar = ((wba) obj2).g;
                    qgr qgrVar = ((wbd) obj3).e;
                    if (qgrVar == null) {
                        qgrVar = qgr.a;
                    }
                    vzhVar.g(qgrVar, rve.a, 9, 19);
                }
                return rcsMessagingService.getMessages(wba.c);
            case 1:
                vzf vzfVar = (vzf) this.a;
                vzfVar.d.b.g("Bugle.MessagingService.SendMessageRequest.Binder.OnDemand.Connect.Latency", Duration.between(this.b, Instant.ofEpochMilli(vzfVar.b.a())).toMillis());
                return ((RcsMessagingService) obj).sendMessage((SendMessageRequest) this.c);
            case 2:
                wxm wxmVar = (wxm) obj;
                if (((Boolean) ((utz) vzh.b.get()).e()).booleanValue()) {
                    Object obj4 = this.b;
                    Object obj5 = this.c;
                    qgr qgrVar2 = ((wxk) obj4).h;
                    if (qgrVar2 == null) {
                        qgrVar2 = qgr.a;
                    }
                    ((vzh) ((yyt) obj5).d).c(qgrVar2, (rve) this.a);
                }
                return wxmVar;
            case 3:
                wxo wxoVar = (wxo) obj;
                if (((Boolean) ((utz) vzh.d.get()).e()).booleanValue()) {
                    Object obj6 = this.c;
                    Object obj7 = this.b;
                    aozy createBuilder = qgr.a.createBuilder();
                    String str = ((wdu) obj6).c;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    vzh vzhVar2 = ((wel) obj7).c;
                    Object obj8 = this.a;
                    qgr qgrVar3 = (qgr) createBuilder.b;
                    str.getClass();
                    qgrVar3.b = 1 | qgrVar3.b;
                    qgrVar3.c = str;
                    vzhVar2.g((qgr) createBuilder.s(), rve.a(((wda) obj8).c), 9, 16);
                }
                return wxoVar;
            case 4:
                Object obj9 = this.c;
                ((wjy) this.a).m(((adiw) obj9).a, 0L, false, gso.REPLACE, (amww) this.b);
                return null;
            case 5:
                ContactsServiceResult contactsServiceResult = (ContactsServiceResult) obj;
                if (contactsServiceResult == null) {
                    contactsServiceResult = new ContactsServiceResult(1, "ContactsService returned null.");
                }
                Object obj10 = this.b;
                if (contactsServiceResult.succeeded()) {
                    wue.a.o("Capabilities feched in bot id resolving for user: ".concat((String) obj10));
                } else {
                    ((wue) this.c).b(new psu(contactsServiceResult), (dtq) this.a, (String) obj10);
                }
                return null;
            case 6:
                ((wue) this.c).b(new psu("Jibe ContactsService had an error.", (ajny) obj), (dtq) this.a, (String) this.b);
                return null;
            case 7:
                qgg qggVar = (qgg) obj;
                nej nejVar = (nej) ((wxz) this.c).f.b();
                Optional optional = (Optional) this.b;
                if (!optional.isEmpty()) {
                    nejVar.d((qgr) optional.get(), (rve) this.a, 21, 8, 9);
                }
                return qggVar;
            case 8:
                xbu xbuVar = (xbu) obj;
                int i5 = xbw.c;
                ((AtomicReference) this.a).set(xbuVar.d);
                apct apctVar = xbuVar.e;
                if (apctVar == null) {
                    apctVar = apct.a;
                }
                ((AtomicReference) this.c).set(aotl.l(apctVar));
                apct apctVar2 = xbuVar.f;
                if (apctVar2 == null) {
                    apctVar2 = apct.a;
                }
                ((AtomicReference) this.b).set(aotl.l(apctVar2));
                aozy builder = xbuVar.toBuilder();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                apag apagVar = builder.b;
                xbu xbuVar2 = (xbu) apagVar;
                xbuVar2.b &= -3;
                xbuVar2.d = xbu.a.d;
                if (!apagVar.isMutable()) {
                    builder.u();
                }
                apag apagVar2 = builder.b;
                xbu xbuVar3 = (xbu) apagVar2;
                xbuVar3.e = null;
                xbuVar3.b &= -5;
                if (!apagVar2.isMutable()) {
                    builder.u();
                }
                xbu xbuVar4 = (xbu) builder.b;
                xbuVar4.f = null;
                xbuVar4.b &= -9;
                return (xbu) builder.s();
            case 9:
                int i6 = xbw.c;
                return xbw.c((String) ((AtomicReference) this.a).get()).map(new uzn(this.c, this.b, 8, bArr));
            case 10:
                Object obj11 = this.a;
                int i7 = xbw.c;
                return xbv.a((UUID) obj11, (Instant) ((AtomicReference) this.c).get(), (Instant) ((AtomicReference) this.b).get());
            case 11:
                List list = (List) obj;
                ((alwl) ((alwl) xdn.a.g()).h("com/google/android/apps/messaging/shared/tachygram/capabilities/TachygramNetworkCapabilitiesProvider", "getBatchCapabilities", 141, "TachygramNetworkCapabilitiesProvider.java")).u("[Tachygram] %d registrations were fetched from the network for %d requested users", list.size(), this.b.size());
                Stream stream = Collection.EL.stream(list);
                Object obj12 = this.c;
                return (Map) stream.filter(new xdm(obj12, i)).collect(alls.a(new wki(obj12, 17), new wki(this.a, 18)));
            case 12:
                String str2 = ((aqfn) this.b).c;
                alpt n = alpt.n(xes.a((anjf) this.c));
                alpt alptVar = (alpt) DesugarArrays.stream(qes.values()).filter(new wjl(9)).filter(new xdm(n, i3)).collect(alls.b);
                aozy createBuilder2 = qey.c.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar3 = createBuilder2.b;
                qey qeyVar = (qey) apagVar3;
                str2.getClass();
                qeyVar.d = 1 | qeyVar.d;
                qeyVar.e = str2;
                if (!apagVar3.isMutable()) {
                    createBuilder2.u();
                }
                qey qeyVar2 = (qey) createBuilder2.b;
                apao apaoVar = qeyVar2.h;
                if (!apaoVar.c()) {
                    qeyVar2.h = apag.mutableCopy(apaoVar);
                }
                Iterator<E> it = n.iterator();
                while (it.hasNext()) {
                    qeyVar2.h.g(((qes) it.next()).f);
                }
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                qey qeyVar3 = (qey) createBuilder2.b;
                apao apaoVar2 = qeyVar3.i;
                if (!apaoVar2.c()) {
                    qeyVar3.i = apag.mutableCopy(apaoVar2);
                }
                Iterator<E> it2 = alptVar.iterator();
                while (it2.hasNext()) {
                    qeyVar3.i.g(((qes) it2.next()).f);
                }
                Object obj13 = this.a;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                qei qeiVar = ((xew) obj13).e;
                qey qeyVar4 = (qey) createBuilder2.b;
                qeiVar.getClass();
                qeyVar4.q = qeiVar;
                qeyVar4.d |= 256;
                return (qey) createBuilder2.s();
            case 13:
                Object obj14 = this.b;
                return this.c.a((apbt) obj, (Uri) this.a, (String) obj14);
            case 14:
                xov xovVar = (xov) obj;
                boolean isEmpty = xovVar.a.isEmpty();
                Object obj15 = this.b;
                if (!isEmpty && !xovVar.b.isEmpty()) {
                    Object obj16 = this.a;
                    ?? r2 = xovVar.a.get();
                    xoe xoeVar = (xoe) obj16;
                    long epochMilli = xoeVar.c.f().toEpochMilli();
                    if (xpg.DOWNLOAD.equals(((xow) xovVar.b.get()).n())) {
                        MessageData messageData = (MessageData) r2;
                        messageData.j.X(epochMilli);
                        messageData.j.an(110);
                    } else {
                        MessageData messageData2 = (MessageData) r2;
                        messageData2.j.ah(epochMilli);
                        messageData2.j.an(12);
                    }
                    ((Optional) this.c).ifPresent(new wqw(r2, 20));
                    alwl alwlVar = (alwl) xoe.a.g();
                    alwlVar.X(xod.a, obj15);
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/FileTransferPausedCallbackHandler", "markMessagePaused", 82, "FileTransferPausedCallbackHandler.java")).q("File transfer paused. Marking message paused.");
                    if (xoeVar.d.a()) {
                        rwd rwdVar = (rwd) xoeVar.b.b();
                        ConversationIdType z = r2.z();
                        MessageIdType B = r2.B();
                        sya syaVar = new sya();
                        syaVar.aj("updateFileTransferMessagePaused");
                        syaVar.z(r2.n());
                        syaVar.G(r2.q());
                        syaVar.L(r2.j());
                        syaVar.u(r2.f());
                        rwdVar.O(z, B, syaVar);
                    } else {
                        ((rwd) xoeVar.b.b()).N(r2);
                    }
                } else {
                    alwl alwlVar2 = (alwl) xoe.a.i();
                    alwlVar2.X(xod.a, obj15);
                    ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/transfer/FileTransferPausedCallbackHandler", "markMessagePaused", 67, "FileTransferPausedCallbackHandler.java")).q("Could not find a valid FileTransferMessageCoreData to handle file transfer paused callback.");
                }
                return null;
            case 15:
                xpt xptVar = (xpt) obj;
                alwl alwlVar3 = (alwl) ((alwl) xrf.a.i()).g(xptVar);
                ?? r12 = this.a;
                alwlVar3.X(ydl.b, r12.B());
                alwlVar3.X(ydl.f, r12.E());
                ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "downloadFile", 1431, "IncomingFileTransferProcessor.java")).q("File was not successfully queued for auto download.");
                aozy createBuilder3 = xqr.a.createBuilder();
                String str3 = r12.E().b;
                str3.getClass();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                apag apagVar4 = createBuilder3.b;
                xqr xqrVar = (xqr) apagVar4;
                xqrVar.b = 1 | xqrVar.b;
                xqrVar.c = str3;
                if (!apagVar4.isMutable()) {
                    createBuilder3.u();
                }
                Object obj17 = this.b;
                xqr xqrVar2 = (xqr) createBuilder3.b;
                obj17.getClass();
                xqrVar2.e = (amgu) obj17;
                xqrVar2.b |= 4;
                String message = xptVar.getMessage();
                if (message != null) {
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    xqr xqrVar3 = (xqr) createBuilder3.b;
                    xqrVar3.b |= 2;
                    xqrVar3.d = message;
                }
                ((uof) ((vyv) ((xrf) this.c).v.b()).a.b()).a(upk.a("file_download_failed", (xqr) createBuilder3.s()));
                return Optional.empty();
            case 16:
                Throwable th = (Throwable) obj;
                Object obj18 = this.a;
                Object obj19 = this.c;
                synchronized (((xsl) obj19).g) {
                    ((xsl) obj19).h.remove(obj18);
                }
                if (th instanceof CancellationException) {
                    return xsy.a;
                }
                Object obj20 = this.b;
                if (th instanceof FileNotFoundException) {
                    pwq a = pwr.a();
                    a.f(xoc.FILE_TRANSFER_FAILURE_REASON_OPENING_THE_FILE_FAILED);
                    a.c(th);
                    a.g((String) obj20);
                    xtaVar = new xta(a.a());
                } else {
                    if (th instanceof IllegalArgumentException) {
                        pwq a2 = pwr.a();
                        a2.f(xoc.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_GET_FILE_SIZE);
                        a2.g((String) obj20);
                        return new xta(a2.a());
                    }
                    pwq a3 = pwr.a();
                    a3.f(xoc.FILE_TRANSFER_FAILURE_REASON_UNKNOWN);
                    a3.c(th);
                    a3.g((String) obj20);
                    xtaVar = new xta(a3.a());
                }
                return xtaVar;
            case 17:
                return yyb.dj((asmb) obj, new xsm((xrz) this.a, i), ((aqhu) this.b).c);
            case 18:
                yyb yybVar = (yyb) obj;
                if (yybVar instanceof xsz) {
                    Object obj21 = this.a;
                    Object obj22 = this.b;
                    xsc xscVar = ((xsz) yybVar).a;
                    pzv a4 = ((pzw) ((wyp) obj22).a.b()).a((pzn) obj21);
                    if (a4.b() == 1) {
                        aozy builder2 = xscVar.a.toBuilder();
                        qep a5 = a4.a();
                        if (!builder2.b.isMutable()) {
                            builder2.u();
                        }
                        qeq qeqVar = (qeq) builder2.b;
                        qeqVar.d = a5;
                        qeqVar.b |= 2;
                        xszVar = new xsz(new xsc((qeq) builder2.s()));
                    } else {
                        pwr c = a4.c();
                        if (c.b == xoc.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_READ_THUMBNAIL_INFO_IN_DB) {
                            return new xta(c);
                        }
                        String str4 = (String) ((xrz) this.c).c.map(new xos(i4)).orElse("");
                        if ((gh.z(str4) || gh.m(str4)) && !gh.i(str4)) {
                            xszVar = new xsz(new xsc(xscVar.a, Optional.of(c)));
                        } else {
                            return new xsz(xscVar);
                        }
                    }
                    return xszVar;
                }
                return yybVar;
            case 19:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Object obj23 = this.a;
                if (booleanValue) {
                    xxe xxeVar = (xxe) this.c;
                    if (!xxeVar.c()) {
                        taz e = ParticipantsTable.e();
                        e.w("launchBlockedContacts");
                        e.g(new xos(14));
                        if (e.b().M()) {
                            xxeVar.a(true);
                        }
                    }
                    TelecomManager telecomManager = (TelecomManager) ((Context) obj23).getSystemService("telecom");
                    try {
                        telecomManager.getClass();
                        createManageBlockedNumbersIntent = telecomManager.createManageBlockedNumbersIntent();
                        akto.n((Context) obj23, createManageBlockedNumbersIntent);
                    } catch (Throwable unused) {
                        ((alwl) ((alwl) xxe.a.g()).h("com/google/android/apps/messaging/shared/util/block/BlockedParticipantsUtil", "launchBlockedContacts", 130, "BlockedParticipantsUtil.java")).q("launchBlockedContacts: haveSystemBlockList but failed to open");
                    }
                    return null;
                }
                Context context = (Context) obj23;
                akto.n(context, new Intent(context, (Class<?>) this.b));
                return null;
            default:
                Stream flatMap = Collection.EL.stream((List) obj).map(new uoc(this.a, (java.util.Collection) this.b, (String) this.c, i2)).flatMap(new yug(i2));
                int i8 = alog.d;
                return (List) flatMap.collect(alls.a);
        }
    }

    public /* synthetic */ way(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ way(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ way(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ way(Object obj, Object obj2, rve rveVar, int i) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = rveVar;
    }
}
