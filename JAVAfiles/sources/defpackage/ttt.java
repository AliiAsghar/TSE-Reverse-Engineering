package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ttt implements ancr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ ttt(mls mlsVar, akul akulVar, SelfIdentityId selfIdentityId, akul akulVar2, mlx mlxVar, smr smrVar, int i) {
        this.g = i;
        this.f = mlsVar;
        this.d = akulVar;
        this.b = selfIdentityId;
        this.e = akulVar2;
        this.c = mlxVar;
        this.a = smrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.concurrent.Future, java.lang.Object] */
    @Override // defpackage.ancr
    public final ListenableFuture a() {
        akul i;
        akul i2;
        qei qeiVar;
        Optional empty;
        int i3 = this.g;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            Bundle bundle = (Bundle) this.f;
                            String string = bundle.getString("chat.extra.customDeliveryReceiptContentType");
                            byte[] byteArray = bundle.getByteArray("chat.extra.customDeliveryReceipt");
                            Object obj = this.a;
                            if (string != null && byteArray != null) {
                                empty = Optional.of(new xai(string, byteArray, 1));
                            } else if (string == null && byteArray == null) {
                                empty = Optional.empty();
                            } else {
                                alwl alwlVar = (alwl) xrf.a.i();
                                alwlVar.X(ydl.e, ((rvf) obj).b);
                                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "getOptionalRcsMessageReceiptConverter", 1075, "IncomingFileTransferProcessor.java")).t("custom report contentType or receipt is null. Content type: %s", string);
                                throw new IllegalArgumentException("custom contentType and receipt must both be null or not null");
                            }
                            Optional optional = empty;
                            Object obj2 = this.d;
                            Object obj3 = this.b;
                            return ((xrf) obj2).j.c((rve) obj, (Instant) this.e, (aoia) this.c, optional, (qei) obj3);
                        }
                        Object obj4 = this.c;
                        Object obj5 = this.f;
                        Object obj6 = this.a;
                        return ((xrf) this.d).c(this.b, (xwa) this.e, (ParticipantsTable.BindData) obj6, (qei) obj5, (qwm) obj4);
                    }
                    Object obj7 = this.a;
                    Optional g = ((FileInformation) obj7).g();
                    ajqd ajqdVar = ajqd.FILE;
                    ajqdVar.getClass();
                    boolean isPresent = g.filter(new xdm(ajqdVar, 10)).isPresent();
                    Object obj8 = this.b;
                    if (isPresent) {
                        Object obj9 = this.d;
                        Object obj10 = this.e;
                        Object obj11 = this.f;
                        xpy xpyVar = (xpy) obj8;
                        if (((pel) xpyVar.d.b()).a()) {
                            if (!((xot) xpyVar.c.b()).n((MessageIdType) obj11, (String) obj10, xpg.DOWNLOAD, (qep) new pwc().m().fu(obj7), ((aozb) obj9).H())) {
                                alwl alwlVar2 = (alwl) xpy.a.h();
                                alwlVar2.X(ydl.b, obj11);
                                alwlVar2.X(xod.a, obj10);
                                ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/transfer/downloads/FileDownloadWorker", "insertFileTransferDatabaseEntry", BasePaymentResult.ERROR_REQUEST_TIMEOUT, "FileDownloadWorker.java")).q("Failed to insert OR update file transfer entry in database.");
                                throw new xpt(false, xoc.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_INSERT_OR_UPDATE_FILE_TRANSFER_ENTRY_IN_DB, String.format("Failed to insert OR update file transfer entry in database for message %s with transfer id %s", obj11, obj10));
                            }
                        } else {
                            albo.U(((xot) xpyVar.c.b()).n((MessageIdType) obj11, (String) obj10, xpg.DOWNLOAD, (qep) new pwc().m().fu(obj7), ((aozb) obj9).H()), "Failed to insert OR update file transfer entry in database.");
                        }
                    }
                    return ((xpy) obj8).c((xpv) this.c);
                }
                ttv ttvVar = (ttv) this.b;
                ((mbl) ttvVar.h.b()).e("Bugle.Etouffee.FileTransfer.Format.Outgoing", yyb.cV(2));
                iji ijiVar = (iji) ttvVar.i.b();
                ?? r2 = this.c;
                ijiVar.s(r2.E(), rve.a, 11, 11, 1);
                if (((okg) ttvVar.k.b()).a()) {
                    qeiVar = r2.w();
                } else {
                    qeiVar = null;
                }
                qei qeiVar2 = qeiVar;
                Object obj12 = this.f;
                Object obj13 = this.e;
                ?? r5 = this.d;
                return ttvVar.a.b(((apwk) albo.bQ(this.a)).toByteArray(), (String) albo.bQ(r5), qeiVar2, r2.E(), (alog) obj13, "application/vnd.gsma.rcs-ft-http+xml", ((aoia) obj12).e(), r2.V());
            }
            alog alogVar = (alog) albo.bQ(this.d);
            Optional h = mls.h(alogVar, this.b);
            mod modVar = (mod) albo.bQ(this.e);
            Object obj14 = this.c;
            mlx mlxVar = (mlx) obj14;
            mlxVar.m(modVar);
            boolean isEmpty = h.isEmpty();
            Object obj15 = this.a;
            Object obj16 = this.f;
            if (!isEmpty && ((nfw) h.get()).o()) {
                mls mlsVar = (mls) obj16;
                if (((pdb) mlsVar.n.b()).a()) {
                    smr smrVar = (smr) obj15;
                    if (smrVar.V() != null) {
                        return ((nfw) h.get()).d().b().i(new qcf(mlsVar, smrVar, alogVar, mlxVar, h, 1), mlsVar.c);
                    }
                }
                mlxVar.e = (nfw) h.get();
                return aktp.ag(mlxVar.a());
            }
            akrh e = aktp.e("BugleConversationPropertiesSupplier#getPropertiesFromBindData_dsdrGroupsFlag");
            try {
                if (((okf) ((mls) obj16).m.b()).a() && ((smr) obj15).V() != null) {
                    i2 = ((mls) obj16).g(((smr) obj15).x(), alogVar, (mlx) obj14);
                } else {
                    i2 = ((mls) obj16).g.d().i(new lso(obj14, 11), ((mls) obj16).b);
                }
                e.close();
                return i2;
            } finally {
            }
        } else {
            Object obj17 = this.a;
            final ttv ttvVar2 = (ttv) obj17;
            ((mbl) ttvVar2.h.b()).e("Bugle.Etouffee.FileTransfer.Format.Outgoing", yyb.cV(3));
            iji ijiVar2 = (iji) ttvVar2.i.b();
            final ?? r10 = this.b;
            ijiVar2.s(r10.E(), rve.a, 12, 11, 1);
            final String str = (String) albo.bQ(this.d);
            final apwk apwkVar = (apwk) albo.bQ(this.e);
            armf armfVar = ttvVar2.k;
            final apwq V = r10.V();
            final rve E = r10.E();
            if (((okg) armfVar.b()).a()) {
                i = ((ttb) ttvVar2.d.b()).b(r10.w().d);
            } else {
                i = ttvVar2.b.c().i(new tsz(obj17, 5), ttvVar2.j);
            }
            Object obj18 = this.f;
            final qeq qeqVar = (qeq) this.c;
            final aoia aoiaVar = (aoia) obj18;
            return i.i(new ancs() { // from class: tts
                @Override // defpackage.ancs
                public final ListenableFuture a(Object obj19) {
                    boolean z;
                    altk d;
                    NativeMessageEncryptorV2 nativeMessageEncryptorV2 = (NativeMessageEncryptorV2) obj19;
                    apwq apwqVar = V;
                    if (apwqVar == null) {
                        apwqVar = apwq.a;
                    }
                    aozy createBuilder = apwo.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    apwo apwoVar = (apwo) apagVar;
                    apwoVar.b |= 1;
                    apwoVar.c = "application/vnd.gsma.rcs-ft-http+xml";
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    apwk apwkVar2 = apwkVar;
                    String str2 = str;
                    apwo apwoVar2 = (apwo) createBuilder.b;
                    str2.getClass();
                    apwoVar2.b |= 2;
                    apwoVar2.d = str2;
                    aozb byteString = apwkVar2.toByteString();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar2 = createBuilder.b;
                    apwo apwoVar3 = (apwo) apagVar2;
                    apwoVar3.b |= 4;
                    apwoVar3.e = byteString;
                    if (!apagVar2.isMutable()) {
                        createBuilder.u();
                    }
                    aoia aoiaVar2 = aoiaVar;
                    apwo apwoVar4 = (apwo) createBuilder.b;
                    apwqVar.getClass();
                    apwoVar4.f = apwqVar;
                    apwoVar4.b |= 8;
                    apwo apwoVar5 = (apwo) createBuilder.s();
                    if (tte.i() && aoiaVar2.e()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    MessageCoreData messageCoreData = r10;
                    ttv ttvVar3 = ttv.this;
                    if (z) {
                        Stream stream = Collection.EL.stream(aoiaVar2.d());
                        msk mskVar = ttvVar3.c;
                        mskVar.getClass();
                        Stream map = stream.map(new ttr(mskVar, 2));
                        int i4 = alog.d;
                        d = ttvVar3.e.d((alog) map.collect(alls.a), true);
                    } else {
                        d = ttvVar3.e.d(ttvVar3.c.w(((rtz) ttvVar3.f.b()).K(messageCoreData.z())), false);
                    }
                    qeq qeqVar2 = qeqVar;
                    rve rveVar = E;
                    apwl c = ttvVar3.l.c(apwoVar5, rveVar, str2, d, false, z, amhz.ATTACHMENT, nativeMessageEncryptorV2);
                    pwc pwcVar = new pwc();
                    qep qepVar = qeqVar2.c;
                    if (qepVar == null) {
                        qepVar = qep.a;
                    }
                    ajqc c2 = ((FileInformation) pwcVar.fu(qepVar)).c();
                    c2.f("encrypted_file");
                    c2.d(trx.a);
                    MessagePartCoreData G = messageCoreData.G();
                    if (G != null && G.aW()) {
                        c2.c(Duration.ofMillis(G.k()));
                    }
                    arbj arbjVar = new arbj((byte[]) null, (char[]) null, (char[]) null);
                    arbjVar.E(c2.a());
                    if ((qeqVar2.b & 2) != 0) {
                        qep qepVar2 = qeqVar2.d;
                        if (qepVar2 == null) {
                            qepVar2 = qep.a;
                        }
                        ajqc c3 = ((FileInformation) pwcVar.fu(qepVar2)).c();
                        c3.d(trx.a);
                        arbjVar.F(c3.a());
                    }
                    arbjVar.D(c.toByteString());
                    aozb aozbVar = ttvVar3.g.b(FileTransferInformation.class).b(arbjVar.C()).a;
                    ChatMessage.Type type = ChatMessage.Type.FILE_TRANSFER;
                    byte[] H = aozbVar.H();
                    String str3 = rveVar.b;
                    str3.getClass();
                    return aktp.ag(new ChatMessage(type, H, str3));
                }
            }, ttvVar2.j);
        }
    }

    public /* synthetic */ ttt(ttv ttvVar, MessageCoreData messageCoreData, akul akulVar, akul akulVar2, alog alogVar, aoia aoiaVar, int i) {
        this.g = i;
        this.b = ttvVar;
        this.c = messageCoreData;
        this.a = akulVar;
        this.d = akulVar2;
        this.e = alogVar;
        this.f = aoiaVar;
    }

    public /* synthetic */ ttt(ttv ttvVar, MessageCoreData messageCoreData, qeq qeqVar, akul akulVar, akul akulVar2, aoia aoiaVar, int i) {
        this.g = i;
        this.a = ttvVar;
        this.b = messageCoreData;
        this.c = qeqVar;
        this.d = akulVar;
        this.e = akulVar2;
        this.f = aoiaVar;
    }

    public /* synthetic */ ttt(xpy xpyVar, MessageIdType messageIdType, String str, FileInformation fileInformation, aozb aozbVar, xpv xpvVar, int i) {
        this.g = i;
        this.b = xpyVar;
        this.f = messageIdType;
        this.e = str;
        this.a = fileInformation;
        this.d = aozbVar;
        this.c = xpvVar;
    }

    public /* synthetic */ ttt(xrf xrfVar, MessageCoreData messageCoreData, xwa xwaVar, ParticipantsTable.BindData bindData, qei qeiVar, qwm qwmVar, int i) {
        this.g = i;
        this.d = xrfVar;
        this.b = messageCoreData;
        this.e = xwaVar;
        this.a = bindData;
        this.f = qeiVar;
        this.c = qwmVar;
    }

    public /* synthetic */ ttt(xrf xrfVar, rve rveVar, Instant instant, aoia aoiaVar, Bundle bundle, qei qeiVar, int i) {
        this.g = i;
        this.d = xrfVar;
        this.a = rveVar;
        this.e = instant;
        this.c = aoiaVar;
        this.f = bundle;
        this.b = qeiVar;
    }
}
