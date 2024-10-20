package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Optional;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyPair;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vug implements ancs {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ vug(ahta ahtaVar, ListenableFuture listenableFuture, ahuv ahuvVar, String str, int i) {
        this.e = i;
        this.b = ahtaVar;
        this.d = listenableFuture;
        this.a = ahuvVar;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v193, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v5, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v124, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v142, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r2v150, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r2v98, types: [java.lang.Object, uns] */
    /* JADX WARN: Type inference failed for: r3v101, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v117, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r4v42, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r4v43, types: [xpz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v45, types: [java.lang.Object, uns] */
    /* JADX WARN: Type inference failed for: r4v87, types: [java.lang.Object, apbt] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.lang.Object, uns] */
    /* JADX WARN: Type inference failed for: r6v19, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v23, types: [java.lang.Object, uns] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        boolean z;
        boolean z2;
        abnr abnrVar;
        abnr abnrVar2;
        abnr abnrVar3;
        int i = 14;
        int i2 = 8;
        int i3 = 4;
        boolean z3 = true;
        switch (this.e) {
            case 0:
                qei qeiVar = (qei) obj;
                smr smrVar = (smr) this.b;
                String V = smrVar.V();
                V.getClass();
                String U = smrVar.U();
                U.getClass();
                aozy createBuilder = qfb.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj2 = this.a;
                qfb qfbVar = (qfb) createBuilder.b;
                qfbVar.b |= 1;
                qfbVar.c = V;
                vui vuiVar = (vui) obj2;
                qei a = vuiVar.j.a(U, true);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qfb qfbVar2 = (qfb) createBuilder.b;
                a.getClass();
                qfbVar2.d = a;
                qfbVar2.b |= 2;
                qfb qfbVar3 = (qfb) createBuilder.s();
                aozy createBuilder2 = qfx.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                Object obj3 = this.c;
                qfx qfxVar = (qfx) createBuilder2.b;
                qfxVar.b |= 1;
                qfxVar.c = V;
                UUID uuid = (UUID) obj3;
                String uuid2 = uuid.toString();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                qfx qfxVar2 = (qfx) createBuilder2.b;
                uuid2.getClass();
                qfxVar2.b = 8 | qfxVar2.b;
                qfxVar2.e = uuid2;
                qfx qfxVar3 = (qfx) createBuilder2.s();
                aozy createBuilder3 = qfy.a.createBuilder();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                qfy qfyVar = (qfy) createBuilder3.b;
                qfbVar3.getClass();
                qfyVar.c = qfbVar3;
                qfyVar.b |= 1;
                aozb byteString = qfxVar3.toByteString();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                qfy qfyVar2 = (qfy) createBuilder3.b;
                qfyVar2.b = 2 | qfyVar2.b;
                qfyVar2.e = byteString;
                createBuilder3.L(qeiVar);
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                Object obj4 = this.d;
                qfy qfyVar3 = (qfy) createBuilder3.b;
                qeiVar.getClass();
                qfyVar3.f = qeiVar;
                qfyVar3.b = 4 | qfyVar3.b;
                return vuiVar.i.c((qfy) createBuilder3.s()).i(new qcf(vuiVar, smrVar, uuid, (vuk) obj4, qeiVar, 10), vuiVar.b);
            case 1:
                alwl alwlVar = (alwl) vmf.a.g();
                vls vlsVar = (vls) this.b;
                alwlVar.X(ydl.p, vlsVar.a);
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageBlueprint", "createBuilderInfo", 390, "IncomingMessageBlueprint.java")).q("Finished the notification delay.");
                if (!((Boolean) obj).booleanValue()) {
                    return aktp.ag(null);
                }
                return ((vmf) this.a).b((vmq) this.d, vlsVar, this.c);
            case 2:
                qei qeiVar2 = (qei) obj;
                aozy createBuilder4 = qec.a.createBuilder();
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                Object obj5 = this.d;
                apag apagVar = createBuilder4.b;
                qec qecVar = (qec) apagVar;
                obj5.getClass();
                qecVar.c = (qfb) obj5;
                qecVar.b |= 1;
                if (!apagVar.isMutable()) {
                    createBuilder4.u();
                }
                qec qecVar2 = (qec) createBuilder4.b;
                apax apaxVar = qecVar2.d;
                if (!apaxVar.c()) {
                    qecVar2.d = apag.mutableCopy(apaxVar);
                }
                qecVar2.d.add(this.a);
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                Object obj6 = this.b;
                qec qecVar3 = (qec) createBuilder4.b;
                qeiVar2.getClass();
                qecVar3.f = qeiVar2;
                qecVar3.b |= 4;
                aozb byteString2 = ((aoyj) obj6).toByteString();
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                Object obj7 = this.c;
                qec qecVar4 = (qec) createBuilder4.b;
                qecVar4.b |= 2;
                qecVar4.e = byteString2;
                return ((vwv) obj7).g.a((qec) createBuilder4.s());
            case 3:
                vqh vqhVar = (vqh) obj;
                if (vqhVar.b != 0) {
                    return aktp.ag(vqhVar);
                }
                Object obj8 = this.a;
                Object obj9 = this.b;
                ?? r4 = this.d;
                xag xagVar = (xag) this.c;
                return xagVar.b.i(r4, (aoia) obj9, xagVar.a, new woc(15), (qft) obj8);
            case 4:
                UrlResponseInfo urlResponseInfo = (UrlResponseInfo) obj;
                if (urlResponseInfo == null) {
                    return aktp.af(new xpt(true, xoc.FILE_TRANSFER_FAILURE_REASON_EMPTY_HTTP_RESPONSE_BODY, "Download failed with empty server response."));
                }
                if (urlResponseInfo.getHttpStatusCode() != 200 && urlResponseInfo.getHttpStatusCode() != 206) {
                    boolean z4 = !xpq.a.contains(Integer.valueOf(urlResponseInfo.getHttpStatusCode()));
                    urlResponseInfo.getHttpStatusCode();
                    return aktp.af(new xpt(z4, "Download failed with invalid server response.", (byte[]) null));
                }
                Object obj10 = this.b;
                ((xpp) this.a).a((String) this.c, (FileOutputStream) this.d);
                return aktp.ag(obj10);
            case 5:
                Uri uri = (Uri) obj;
                alvw g = xql.a.g();
                g.X(alwp.a, "BugleFileTransfer");
                alvg alvgVar = (alvg) g;
                alvgVar.X(ydl.f, rve.a(((xqm) this.d).c));
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "completeIncomingFileTransferForValidMessage", 336, "FileDownloadCompletedHandler.java")).q("Persisting file to Telephony DB");
                xql xqlVar = (xql) this.a;
                return ((vqm) xqlVar.m.b()).f(this.b, uri, (String) this.c).h(new xqi(uri, 0), xqlVar.h);
            case 6:
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    Object obj11 = this.a;
                    alvw g2 = xql.a.g();
                    g2.X(alwp.a, "BugleFileTransfer");
                    alvg alvgVar2 = (alvg) g2;
                    alvgVar2.X(ydl.f, obj11);
                    ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "processPendingWorkItemAsync", 266, "FileDownloadCompletedHandler.java")).q("MessageCoreData not found for completing file transfer.");
                    return aktp.ag(upm.d());
                }
                MessageCoreData messageCoreData = (MessageCoreData) optional.get();
                if (messageCoreData.ck()) {
                    alvw g3 = xql.a.g();
                    g3.X(alwp.a, "BugleFileTransfer");
                    alvg alvgVar3 = (alvg) g3;
                    alvgVar3.X(ydl.p, messageCoreData.z());
                    alvgVar3.X(ydl.b, messageCoreData.B());
                    alvgVar3.X(ydl.f, messageCoreData.E());
                    ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "processPendingWorkItemAsync", 276, "FileDownloadCompletedHandler.java")).q("Message has already finished downloading. Skipping completing the incoming file transfer.");
                    return aktp.ag(upm.b());
                }
                Object obj12 = this.c;
                Object obj13 = this.b;
                Object obj14 = this.d;
                xqm xqmVar = (xqm) obj12;
                xql xqlVar2 = (xql) obj14;
                return aktp.ai(new imh(xqlVar2, xqmVar, messageCoreData, (Uri) obj13, 13), xqlVar2.i).i(new vug(xqlVar2, xqmVar, messageCoreData, albo.af(xqmVar.e), 5), xqlVar2.i).i(new xrd(obj14, (Object) messageCoreData, obj12, 1, (byte[]) null), xqlVar2.h).f(FileNotFoundException.class, new xfv(obj14, obj12, 6), xqlVar2.h).e(IOException.class, new xgu(20), xqlVar2.h);
            case 7:
                final tbt tbtVar = (tbt) obj;
                final xql xqlVar3 = (xql) this.c;
                agnq agnqVar = (agnq) xqlVar3.p.b();
                Object obj15 = this.b;
                final ?? r13 = this.d;
                final ?? r42 = this.a;
                final Uri uri2 = (Uri) obj15;
                if (((Boolean) agnqVar.a("IncomingRcsFileTransferUtils#completeFileTransfer", new agno() { // from class: xqg
                    /* JADX WARN: Removed duplicated region for block: B:13:0x017b  */
                    /* JADX WARN: Removed duplicated region for block: B:23:0x0223  */
                    @Override // defpackage.agno
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object a(defpackage.ukb r23) {
                        /*
                            Method dump skipped, instructions count: 567
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.xqg.a(ukb):java.lang.Object");
                    }
                })).booleanValue()) {
                    ((xcs) xqlVar3.w.b()).o(r42.E().f(), new ahka("ToFileDownloadedAndCommitted"), xcr.TACHYGRAM_MESSAGE_ARRIVED);
                    alvw g4 = xql.a.g();
                    g4.X(alwp.a, "BugleFileTransfer");
                    alvg alvgVar4 = (alvg) g4;
                    alvgVar4.X(ydl.b, r42.B());
                    alvgVar4.X(ydl.f, r42.E());
                    ((alvg) alvgVar4.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "saveIncomingFileTransferInBugleDbWithFuture", 583, "FileDownloadCompletedHandler.java")).q("Notifying bugle database message updated");
                    ((uhj) xqlVar3.q.b()).j(r42.z(), r42.B(), new String[0]);
                    xqc xqcVar = xqlVar3.z;
                    xqcVar.b(r42, "Bugle.Download.Success.Attachment.Size.Bucket.Rcs");
                    xqcVar.e(r42, 4, new xet(10));
                    return aktp.ag(true);
                }
                alvw h = xql.a.h();
                h.X(alwp.a, "BugleFileTransfer");
                alvg alvgVar5 = (alvg) h;
                alvgVar5.X(ydl.b, r42.B());
                alvgVar5.X(ydl.f, r42.E());
                ((alvg) alvgVar5.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "saveIncomingFileTransferInBugleDbWithFuture", 575, "FileDownloadCompletedHandler.java")).q("Failed to update message part in Bugle db.");
                return aktp.ag(false);
            case 8:
                Object obj16 = this.d;
                return ((xrf) this.c).e(this.b, (rve) this.a, (ParticipantsTable.BindData) obj16, (Optional) obj);
            case 9:
                alwo alwoVar = xrf.a;
                return this.a.a(this.b.B(), (FileInformation) this.c, ((aoyj) this.d).toByteString());
            case 10:
                Throwable th = (Throwable) obj;
                ((alwl) ((alwl) ((alwl) xsd.a.i()).g(th)).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "uploadOrResume", (char) 246, "FileUploadWorkHandler.java")).q("Unexpected exception occurred during file upload.");
                xsb xsbVar = (xsb) this.d;
                String str = xsbVar.c;
                qei qeiVar3 = xsbVar.l;
                if (qeiVar3 == null) {
                    qeiVar3 = qei.a;
                }
                qei qeiVar4 = qeiVar3;
                Object obj17 = this.a;
                ?? r43 = this.b;
                Object obj18 = this.c;
                pwq a2 = pwr.a();
                a2.f(xoc.FILE_TRANSFER_FAILURE_REASON_UNKNOWN);
                th.getClass();
                a2.c(th);
                return ((xsd) obj18).k(r43, (xrz) obj17, str, qeiVar4, a2.a());
            case 11:
                Throwable th2 = (Throwable) obj;
                ((alwl) ((alwl) ((alwl) xsd.a.i()).g(th2)).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "handleUnexpectedException", (char) 209, "FileUploadWorkHandler.java")).q("Unexpected exception occurred during file upload.");
                pwq a3 = pwr.a();
                a3.f(xoc.FILE_TRANSFER_FAILURE_REASON_UNKNOWN);
                th2.getClass();
                a3.c(th2);
                pwr a4 = a3.a();
                xsb xsbVar2 = (xsb) this.d;
                String str2 = xsbVar2.c;
                qei qeiVar5 = xsbVar2.l;
                if (qeiVar5 == null) {
                    qeiVar5 = qei.a;
                }
                return ((xsd) this.c).k(this.b, (xrz) this.a, str2, qeiVar5, a4);
            case 12:
                aozb aozbVar = (aozb) obj;
                xsb xsbVar3 = (xsb) this.d;
                String str3 = xsbVar3.h;
                String bD = yyb.bD();
                boolean isEmpty = TextUtils.isEmpty(str3);
                Object obj19 = this.a;
                Object obj20 = this.c;
                if (isEmpty) {
                    if (this.b.a().b != 0) {
                        z3 = false;
                    }
                    xsd xsdVar = (xsd) obj20;
                    wyp wypVar = xsdVar.f;
                    pzn a5 = pzn.a(xsdVar.e, bD);
                    xoj xojVar = xsdVar.c;
                    qei qeiVar6 = xsbVar3.l;
                    if (qeiVar6 == null) {
                        qeiVar6 = qei.a;
                    }
                    return wypVar.e((xrz) obj19, a5, xojVar, aozbVar, qeiVar6, z3);
                }
                xsd xsdVar2 = (xsd) obj20;
                wyp wypVar2 = xsdVar2.f;
                pzn a6 = pzn.a(xsdVar2.e, bD);
                xoj xojVar2 = xsdVar2.c;
                if (TextUtils.isEmpty(str3)) {
                    pwq a7 = pwr.a();
                    a7.f(xoc.FILE_TRANSFER_FAILURE_REASON_UNKNOWN);
                    return aktp.ag(new xta(a7.a()));
                }
                akrh e = aktp.e("TachygramFileUploadProvider#resume");
                try {
                    xsl xslVar = (xsl) wypVar2.g.b();
                    akul h2 = xslVar.a(a6, new xsk(xslVar, str3, a6, xojVar2, ((znj) wypVar2.b).P(), 0), (xrz) obj19, "").h(new way((Object) wypVar2, obj19, (Object) a6, 18, (byte[]) null), wypVar2.d);
                    e.b(h2);
                    akul e2 = h2.e(CancellationException.class, new xqp(i), wypVar2.f);
                    e.close();
                    return e2;
                } finally {
                }
            case 13:
                yyb yybVar = (yyb) obj;
                boolean z5 = yybVar instanceof xta;
                Object obj21 = this.c;
                Object obj22 = this.d;
                if (z5) {
                    xta xtaVar = (xta) yybVar;
                    if (xtaVar.a.f.orElse(null) instanceof xon) {
                        return ((xsd) obj21).d.a(((xsb) obj22).g).h(new xqp(7), andi.a);
                    }
                    xsb xsbVar4 = (xsb) obj22;
                    String str4 = xsbVar4.c;
                    qei qeiVar7 = xsbVar4.l;
                    if (qeiVar7 == null) {
                        qeiVar7 = qei.a;
                    }
                    return ((xsd) obj21).k(this.b, (xrz) this.a, str4, qeiVar7, xtaVar.a);
                }
                if (yybVar instanceof xsy) {
                    return ((xsd) obj21).d.b(((xsb) obj22).g).h(new xqp(i2), andi.a);
                }
                if (yybVar instanceof xsz) {
                    xsc xscVar = ((xsz) yybVar).a;
                    return ((xsd) obj21).b.a(xsd.j(xscVar.a, ((xsb) obj22).c), xscVar.b).h(new xqp(9), andi.a);
                }
                throw new AssertionError("Unreachable");
            case 14:
                yul.b.o("Storing vsms rcs token");
                yul yulVar = ((ytw) this.b).b;
                return yulVar.i(new yuh(yulVar, (String) this.d, (String) this.c, (aozb) this.a, 0));
            case 15:
                Void r0 = (Void) obj;
                ?? r2 = this.d;
                if (r2 != 0) {
                    Object obj23 = this.a;
                    ?? r3 = this.c;
                    Object obj24 = this.b;
                    xyo c = ytw.a.c();
                    c.H("Mapping given IMSI to phone number");
                    c.L("imsi", r2);
                    c.w("msisdn", r3, 2);
                    c.q();
                    ytw ytwVar = (ytw) obj24;
                    return ytwVar.b.b((String) r2, (String) r3).f(Throwable.class, new yui(obj24, obj23, 1), ytwVar.j);
                }
                return aktp.ag(r0);
            case 16:
                KeyPair keyPair = (KeyPair) obj;
                aozy createBuilder5 = anmf.a.createBuilder();
                aozb w = aozb.w(keyPair.getPublic().getEncoded());
                if (!createBuilder5.b.isMutable()) {
                    createBuilder5.u();
                }
                anmf anmfVar = (anmf) createBuilder5.b;
                apax apaxVar2 = anmfVar.f;
                if (!apaxVar2.c()) {
                    anmfVar.f = apag.mutableCopy(apaxVar2);
                }
                Object obj25 = this.a;
                anmfVar.f.add(w);
                yub yubVar = (yub) obj25;
                if (!yubVar.d.G()) {
                    ytw.a.o("Creating register request with RCS token...");
                    aozb aozbVar2 = yubVar.d;
                    if (!createBuilder5.b.isMutable()) {
                        createBuilder5.u();
                    }
                    anmf anmfVar2 = (anmf) createBuilder5.b;
                    aozbVar2.getClass();
                    anmfVar2.d = aozbVar2;
                }
                if (!yubVar.e.isEmpty()) {
                    ytw.a.o("Creating register request with C11N token...");
                    String str5 = yubVar.e;
                    if (!createBuilder5.b.isMutable()) {
                        createBuilder5.u();
                    }
                    anmf anmfVar3 = (anmf) createBuilder5.b;
                    str5.getClass();
                    anmfVar3.e = str5;
                }
                Object obj26 = this.d;
                Object obj27 = this.b;
                anmf anmfVar4 = (anmf) createBuilder5.s();
                ytw ytwVar2 = (ytw) obj27;
                String str6 = (String) obj26;
                msh n = ((msk) ytwVar2.m.b()).n(str6);
                anmfVar4.getClass();
                aozy builder = anmfVar4.toBuilder();
                anmq y = vjs.y();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                vjs vjsVar = ytwVar2.o;
                anmf anmfVar5 = (anmf) builder.b;
                y.getClass();
                anmfVar5.c = y;
                anmfVar5.b |= 1;
                anmf anmfVar6 = (anmf) builder.s();
                anmd anmdVar = (anmd) ((vdm) vjsVar.a).a().h(((Long) vdm.a.e()).longValue(), TimeUnit.MILLISECONDS);
                aqrs aqrsVar = anmdVar.a;
                aqux aquxVar = anme.c;
                if (aquxVar == null) {
                    synchronized (anme.class) {
                        aquxVar = anme.c;
                        if (aquxVar == null) {
                            aquu a8 = aqux.a();
                            a8.e = aquw.UNARY;
                            a8.a = aqux.c("google.communications.verifiedsms.v1.MessageVerificationService", "Register");
                            a8.b();
                            anmf anmfVar7 = anmf.a;
                            aozs aozsVar = arkx.a;
                            a8.c = new arkw(anmfVar7);
                            a8.d = new arkw(anmg.a);
                            aquxVar = a8.a();
                            anme.c = aquxVar;
                        }
                    }
                }
                return akul.g(akul.g(arlj.a(aqrsVar.a(aquxVar, anmdVar.b), anmfVar6))).f(Throwable.class, new xfv(obj27, anmfVar4, 18), ytwVar2.j).i(new qcf(ytwVar2, str6, n, keyPair, anmfVar4, 14), ytwVar2.j).i(new vug(ytwVar2, (String) this.c, str6, (Object) anmfVar4, 15), ytwVar2.j).h(new yts(2), ytwVar2.j).f(Throwable.class, new xdg(16), ytwVar2.j);
            case 17:
                if (((Boolean) obj).booleanValue()) {
                    Object obj28 = this.d;
                    ?? r22 = this.a;
                    Object obj29 = this.c;
                    rve E = r22.E();
                    yxr yxrVar = (yxr) obj29;
                    yxl yxlVar = (yxl) obj28;
                    String a9 = yxrVar.d.a(r22, yxlVar.d);
                    Instant f = yxrVar.c.f();
                    qel qelVar = yxm.a;
                    aozy createBuilder6 = wxq.a.createBuilder();
                    qel qelVar2 = yxm.a;
                    if (!createBuilder6.b.isMutable()) {
                        createBuilder6.u();
                    }
                    wxq wxqVar = (wxq) createBuilder6.b;
                    qelVar2.getClass();
                    wxqVar.e = qelVar2;
                    wxqVar.b |= 1;
                    aozb z6 = aozb.z(a9);
                    if (!createBuilder6.b.isMutable()) {
                        createBuilder6.u();
                    }
                    MessageCoreData messageCoreData2 = yxlVar.a;
                    Object obj30 = this.b;
                    wxq wxqVar2 = (wxq) createBuilder6.b;
                    wxqVar2.c = 2;
                    wxqVar2.d = z6;
                    return yxrVar.e(E, yxm.a(yxlVar.d, (qei) obj30, f, yxlVar.c, yxlVar.f, messageCoreData2, (wxq) createBuilder6.s()));
                }
                return aktp.ag(yxr.c());
            case 18:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Object obj31 = this.c;
                Object obj32 = this.d;
                Object obj33 = this.b;
                if (booleanValue) {
                    try {
                        Instant f2 = ((yxr) obj31).c.f();
                        qel qelVar3 = yxm.a;
                        alog alogVar = ((yxj) obj32).d;
                        if (alogVar.size() == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        d.t(z, "Expected exactly 1 recipient");
                        msh mshVar = (msh) alogVar.get(0);
                        MessageCoreData messageCoreData3 = ((yxj) obj32).a;
                        if (messageCoreData3.c() == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        d.t(z2, "Expected exactly 1 part");
                        aozy createBuilder7 = wxq.a.createBuilder();
                        String ag = messageCoreData3.ag();
                        if (ag != null) {
                            try {
                                qel qelVar4 = (qel) yxm.b.m().fu(ContentType.d(ag));
                                if (!createBuilder7.b.isMutable()) {
                                    createBuilder7.u();
                                }
                                wxq wxqVar3 = (wxq) createBuilder7.b;
                                qelVar4.getClass();
                                wxqVar3.e = qelVar4;
                                wxqVar3.b |= 1;
                                Optional.ofNullable(aozb.z(albo.ag(messageCoreData3.am()))).ifPresent(new ytq(createBuilder7, 2));
                                Optional.ofNullable(messageCoreData3.G()).filter(new ytt(i3)).map(new yug(12)).map(new yug(13)).filter(new ytt(5)).map(new yug(14)).ifPresent(new ytq(createBuilder7, 3));
                                return ((yxr) obj31).e(this.a.E(), yxm.a(mshVar, (qei) obj33, f2, ((yxj) obj32).c, ((yxj) obj32).e, messageCoreData3, (wxq) createBuilder7.s()));
                            } catch (IllegalArgumentException e3) {
                                throw new yxf(e3);
                            }
                        }
                        throw new yxf();
                    } catch (yxf unused) {
                        return aktp.ag(vqh.a(1, 0).a());
                    }
                }
                return aktp.ag(yxr.c());
            case 19:
                if (((Boolean) obj).booleanValue()) {
                    Object obj34 = this.a;
                    Object obj35 = this.b;
                    Object obj36 = this.d;
                    ahsg ahsgVar = (ahsg) obj34;
                    String str7 = ahsgVar.d;
                    if (ahsgVar.f) {
                        abnr abnrVar4 = ((ClearcutMetricSnapshotTransmitter) obj36).c;
                        abnrVar2 = abnrVar4;
                        if (abnrVar4 == null) {
                            synchronized (obj36) {
                                abnr abnrVar5 = ((ClearcutMetricSnapshotTransmitter) obj36).c;
                                abnrVar3 = abnrVar5;
                                if (abnrVar5 == null) {
                                    abnr i4 = abnr.i((Context) obj35, str7);
                                    ((ClearcutMetricSnapshotTransmitter) obj36).c = i4;
                                    abnrVar3 = i4;
                                }
                            }
                            abnrVar2 = abnrVar3;
                        }
                    } else {
                        abnr abnrVar6 = ((ClearcutMetricSnapshotTransmitter) obj36).b;
                        abnrVar2 = abnrVar6;
                        if (abnrVar6 == null) {
                            synchronized (obj36) {
                                abnr abnrVar7 = ((ClearcutMetricSnapshotTransmitter) obj36).b;
                                abnrVar = abnrVar7;
                                if (abnrVar7 == null) {
                                    abnr a10 = new abnm((Context) obj35, str7).a();
                                    ((ClearcutMetricSnapshotTransmitter) obj36).b = a10;
                                    abnrVar = a10;
                                }
                            }
                            abnrVar2 = abnrVar;
                        }
                    }
                    abnq g5 = abnrVar2.g(this.c);
                    Context context = (Context) obj35;
                    if (aqoj.a.get().a(context)) {
                        g5.q = aglt.b(context, (aglk) ClearcutMetricSnapshotTransmitter.a.get());
                    }
                    if (!ahsgVar.f) {
                        String str8 = ahsgVar.g;
                        if (!albo.ah(str8)) {
                            if (!g5.a.e()) {
                                apaa apaaVar = g5.o;
                                if (!apaaVar.b.isMutable()) {
                                    apaaVar.u();
                                }
                                apvz apvzVar = (apvz) apaaVar.b;
                                apvz apvzVar2 = apvz.a;
                                str8.getClass();
                                apvzVar.b |= 16777216;
                                apvzVar.j = str8;
                            } else {
                                throw new IllegalStateException("setZwiebackCookieOverride forbidden on deidentified logger");
                            }
                        }
                        if ((ahsgVar.c & 2) != 0) {
                            g5.g(ahsgVar.e);
                        }
                        if ((ahsgVar.c & 16) != 0) {
                            g5.h(ahsgVar.h);
                        }
                        apao apaoVar = ahsgVar.i;
                        if (!apaoVar.isEmpty()) {
                            g5.f(albo.cy(apaoVar));
                        }
                    }
                    return agkx.f(g5.c());
                }
                return aneh.a;
            default:
                ahvp ahvpVar = (ahvp) albo.bQ(this.d);
                if (ahvpVar.c.isEmpty()) {
                    return aneh.a;
                }
                Object obj37 = this.c;
                Object obj38 = this.a;
                ahta ahtaVar = (ahta) this.b;
                ahuv ahuvVar = (ahuv) obj38;
                return ancj.g(anee.o(ancj.f(anee.o(ahux.b(ahtaVar).a()), new agui(ahuvVar.a, 8), ahtaVar.d())), new ajym((String) obj37, ahuvVar, ahtaVar, ahvpVar, 1), ahtaVar.d());
        }
    }

    public /* synthetic */ vug(ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter, Context context, asjt asjtVar, ahsg ahsgVar, int i) {
        this.e = i;
        this.d = clearcutMetricSnapshotTransmitter;
        this.b = context;
        this.c = asjtVar;
        this.a = ahsgVar;
    }

    public /* synthetic */ vug(Object obj, MessageCoreData messageCoreData, Object obj2, Object obj3, int i) {
        this.e = i;
        this.c = obj;
        this.a = messageCoreData;
        this.d = obj2;
        this.b = obj3;
    }

    public /* synthetic */ vug(Object obj, Object obj2, Object obj3, apag apagVar, int i) {
        this.e = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = apagVar;
    }

    public /* synthetic */ vug(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
        this.d = obj4;
    }

    public /* synthetic */ vug(Object obj, Object obj2, Object obj3, Object obj4, int i, byte[] bArr) {
        this.e = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.a = obj4;
    }

    public /* synthetic */ vug(vmf vmfVar, vls vlsVar, vmq vmqVar, Set set, int i) {
        this.e = i;
        this.a = vmfVar;
        this.b = vlsVar;
        this.d = vmqVar;
        this.c = set;
    }

    public /* synthetic */ vug(vwv vwvVar, qfb qfbVar, qei qeiVar, qeb qebVar, int i) {
        this.e = i;
        this.c = vwvVar;
        this.d = qfbVar;
        this.a = qeiVar;
        this.b = qebVar;
    }

    public /* synthetic */ vug(xpp xppVar, String str, FileOutputStream fileOutputStream, Uri uri, int i) {
        this.e = i;
        this.a = xppVar;
        this.c = str;
        this.d = fileOutputStream;
        this.b = uri;
    }

    public /* synthetic */ vug(xql xqlVar, rve rveVar, Uri uri, xqm xqmVar, int i) {
        this.e = i;
        this.d = xqlVar;
        this.a = rveVar;
        this.b = uri;
        this.c = xqmVar;
    }

    public /* synthetic */ vug(xql xqlVar, xqm xqmVar, MessageCoreData messageCoreData, String str, int i) {
        this.e = i;
        this.a = xqlVar;
        this.d = xqmVar;
        this.b = messageCoreData;
        this.c = str;
    }

    public /* synthetic */ vug(ytw ytwVar, String str, String str2, Object obj, int i) {
        this.e = i;
        this.b = ytwVar;
        this.d = str;
        this.c = str2;
        this.a = obj;
    }

    public /* synthetic */ vug(ytw ytwVar, yub yubVar, String str, String str2, int i) {
        this.e = i;
        this.b = ytwVar;
        this.a = yubVar;
        this.d = str;
        this.c = str2;
    }
}
