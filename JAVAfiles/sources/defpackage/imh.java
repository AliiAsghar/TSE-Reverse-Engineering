package defpackage;

import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.communication.synapse.security.scytale.ConversationCode;
import com.google.communication.synapse.security.scytale.MessageEncryptorV2Builder;
import com.google.communication.synapse.security.scytale.NativeBaseCrypto;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import com.google.communication.synapse.security.scytale.PrekeyBundle;
import com.google.communication.synapse.security.scytale.ReceiptInfo;
import com.google.communication.synapse.security.scytale.RecreateFtdSessionResult;
import com.google.communication.synapse.security.scytale.Scope;
import com.google.communication.synapse.security.scytale.UserDevice;
import com.google.media.webrtc.common.StatusOr;
import j$.util.Collection;
import j$.util.List;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class imh implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ imh(adhf adhfVar, adfn adfnVar, String str, ailf ailfVar, int i) {
        this.e = i;
        this.a = adhfVar;
        this.d = adfnVar;
        this.c = str;
        this.b = ailfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v103, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v105, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v112, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v116, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v127, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v133, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v57, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v97, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v54, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v78, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v77, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v44, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.util.concurrent.Future, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Optional map;
        String name;
        ?? r5;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        int i = 3;
        String str2 = null;
        boolean z4 = false;
        switch (this.e) {
            case 0:
                ?? r0 = this.c;
                ?? r2 = this.b;
                imj imjVar = (imj) albo.bQ(this.a);
                rto rtoVar = (rto) albo.bQ(r2);
                Optional optional = (Optional) albo.bQ(r0);
                Object obj = this.d;
                akrh e = aktp.e("DraftDataService#buildDraftData");
                try {
                    if (rtoVar == null) {
                        map = Optional.empty();
                    } else {
                        map = imjVar.a.map(new ndc(rtoVar, imjVar, optional, (iml) obj, 1));
                    }
                    e.close();
                    return map;
                } finally {
                }
            case 1:
                return Boolean.valueOf(((xwt) ((ijw) this.d).e.b()).b((ConversationIdType) this.a, (tqc) this.b, (amfe) this.c));
            case 2:
                Optional of = Optional.of(this.a);
                vsi a = vsj.a();
                a.b(true);
                a.g(false);
                a.h(true);
                a.n(amku.GROUP_NOTIFICATION);
                qez qezVar = (qez) this.b;
                a.k(qezVar.d);
                qei qeiVar = qezVar.e;
                if (qeiVar == null) {
                    qeiVar = qei.a;
                }
                a.j(qeiVar.d);
                qfj qfjVar = qezVar.h;
                if (qfjVar == null) {
                    qfjVar = qfj.a;
                }
                ?? r52 = this.c;
                Object obj2 = this.d;
                a.e(qfjVar.c);
                a.i(r52);
                qcb qcbVar = (qcb) obj2;
                if (((okf) qcbVar.k.b()).a()) {
                    qei qeiVar2 = qezVar.k;
                    if (qeiVar2 == null) {
                        qeiVar2 = qei.a;
                    }
                    of = Optional.of(qeiVar2);
                }
                a.d(of);
                a.b = Optional.of(qcbVar.c(qezVar));
                ConversationIdType a2 = qcbVar.e.a(a.a());
                if (a2.b()) {
                    alvw i2 = qcb.a.i();
                    i2.X(alwp.a, "BugleGroupManagement");
                    ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter", "findOrCreateRcsConversation", 332, "IncomingRcsGroupNotificationConversationGetter.java")).q("Failed to retrieve conversation for an incoming GroupFullState notification.");
                    return null;
                }
                return a2;
            case 3:
                qqz qqzVar = (qqz) albo.bQ(this.a);
                qqz qqzVar2 = (qqz) albo.bQ(this.b);
                qqz a3 = qqz.a();
                int i3 = alog.d;
                ((qrb) this.d).e(qqzVar, qqzVar2, a3, alsx.a, (amra) this.c);
                return null;
            case 4:
                NativeBaseCrypto nativeBaseCrypto = (NativeBaseCrypto) albo.bQ(this.a);
                String str3 = (String) albo.bQ(this.b);
                Scope create = Scope.create(((ttb) this.d).d.b());
                MessageEncryptorV2Builder createBuilder = MessageEncryptorV2Builder.createBuilder(nativeBaseCrypto, alzz.ap((String) this.c), str3);
                albo.C(createBuilder);
                MessageEncryptorV2Builder requireUserTrustedInfo = createBuilder.setRequireUserTrustedInfo(true);
                albo.C(requireUserTrustedInfo);
                return (NativeMessageEncryptorV2) twd.a(requireUserTrustedInfo.build(create));
            case 5:
                ?? r02 = this.a;
                ?? r22 = this.c;
                if (albo.bQ(r02) == vec.LOW_PREKEYS) {
                    xyo c = tth.a.c();
                    c.H("Needs prekeys");
                    c.w(ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER, r22, 2);
                    c.q();
                    z4 = true;
                }
                if (((Boolean) albo.bQ(this.b)).booleanValue()) {
                    tth.a.o("Prekeys are missing, will re-upload");
                } else if (!z4) {
                    xyo a4 = tth.a.a();
                    a4.H("Skip. Not low keys nor missing prekeys.");
                    a4.w(ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER, r22, 2);
                    a4.q();
                    return null;
                }
                ((iew) ((tth) this.d).f.b()).i((String) r22);
                return null;
            case 6:
                ajrt ajrtVar = (ajrt) this.c;
                String C = ajrtVar.a.C(StandardCharsets.US_ASCII);
                String contentType = ajrtVar.b.toString();
                qfo qfoVar = ((qdk) this.d).a;
                qei qeiVar3 = qfoVar.d;
                if (qeiVar3 == null) {
                    qeiVar3 = qei.a;
                }
                boolean c2 = ((tum) this.b).b.c(C, contentType, qeiVar3, (qei) this.a);
                rve a5 = rve.a(qfoVar.g);
                String str4 = qfoVar.h;
                if (c2) {
                    alwl alwlVar = (alwl) tum.a.g();
                    alwlVar.X(ydl.f, a5);
                    alwlVar.X(ydl.p, ruy.b(str4));
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeSinglePartIncomingChatMessageProcessor", "processFailedToDecryptReceipt", 373, "EtouffeeSinglePartIncomingChatMessageProcessor.java")).q("Completed processing FTD receipt. The original message has been scheduled for resending. (The RCS message ID included with this log is for the FTD receipt.)");
                    return pwh.SUCCESS;
                }
                alwl alwlVar2 = (alwl) tum.a.i();
                alwlVar2.X(ydl.f, a5);
                alwlVar2.X(ydl.p, ruy.b(str4));
                ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeSinglePartIncomingChatMessageProcessor", "processFailedToDecryptReceipt", 384, "EtouffeeSinglePartIncomingChatMessageProcessor.java")).q("Completed processing FTD receipt. The original message will not be resent. (The RCS message ID included with this log is for the FTD receipt.)");
                return pwh.FAIL_NO_RETRY;
            case 7:
                NativeMessageEncryptorV2 nativeMessageEncryptorV2 = (NativeMessageEncryptorV2) albo.bQ(this.d);
                return new tuo(!((RecreateFtdSessionResult) twd.a(nativeMessageEncryptorV2.recreateFtdSession((Scope) this.c, r2, (ReceiptInfo) this.b))).getCanReencryptMessageId().isEmpty(), Optional.of(aozb.w(((PrekeyBundle) alzz.aP((Iterable) twd.a((StatusOr) albo.bQ(this.a)))).getIdentityKey())));
            case 8:
                String str5 = (String) albo.bQ(this.a);
                NativeMessageEncryptorV2 nativeMessageEncryptorV22 = (NativeMessageEncryptorV2) albo.bQ(this.b);
                Optional optional2 = (Optional) albo.bQ(this.c);
                if (optional2.isPresent()) {
                    StatusOr<ConversationCode> conversationCode = nativeMessageEncryptorV22.getConversationCode(Scope.create(((txg) this.d).i.b()), str5, (UserDevice) optional2.get());
                    if (conversationCode.hasValue) {
                        return Optional.of(conversationCode.value.getPrintableCode());
                    }
                    xyo e2 = txg.a.e();
                    e2.H("scytale getConversationCode status not ok");
                    e2.z("Status", conversationCode.status);
                    e2.q();
                }
                return Optional.empty();
            case 9:
                alwl alwlVar3 = (alwl) vkl.a.g();
                alwlVar3.X(vjh.n, this.b);
                alwlVar3.X(vjh.d, (String) ((vkn) this.a).a.orElse(null));
                ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/notification2o/NotificationBuilder", "setConversationSpecificInfoForBuilder", 339, "NotificationBuilder.java")).q("Conversation specific info added to notification builder");
                Iterator it = this.c.iterator();
                while (true) {
                    Object obj3 = this.d;
                    if (it.hasNext()) {
                        ((dyu) obj3).f((dzv) albo.bQ((akul) it.next()));
                    } else {
                        return obj3;
                    }
                }
            case 10:
                ?? r03 = this.c;
                ?? r23 = this.b;
                ?? r3 = this.a;
                alwl alwlVar4 = (alwl) vlw.a.g();
                alwlVar4.X(ydl.o, ((ConversationIdType) this.d).a());
                ((alwl) alwlVar4.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createActions", 265, "IncomingMessageActionCreator.java")).q("Notification actions created");
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((Collection) Objects.requireNonNullElse((AbstractCollection) albo.bQ(r3), new ArrayList()));
                arrayList.addAll((Collection) Objects.requireNonNullElse((List) albo.bQ(r23), new ArrayList()));
                arrayList.addAll((Collection) Objects.requireNonNullElse((List) albo.bQ(r03), new ArrayList()));
                List.EL.sort(arrayList, vlw.c);
                return alog.n(arrayList);
            case 11:
                ?? r04 = this.a;
                ?? r24 = this.b;
                ?? r32 = this.c;
                vkm vkmVar = (vkm) albo.bQ(r04);
                vkmVar.e(Optional.of((java.util.List) albo.bQ(r24)));
                alog alogVar = (alog) albo.bQ(r32);
                Optional.empty();
                Optional.empty();
                Optional.empty();
                vkmVar.c = Optional.of(new vlr(Optional.of(alogVar), Optional.empty()));
                alwl alwlVar5 = (alwl) vmf.a.g();
                alwlVar5.X(ydl.p, ((vls) this.d).a);
                ((alwl) alwlVar5.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageBlueprint", "createNotificationBuilderInfoFuture", 470, "IncomingMessageBlueprint.java")).q("Notification builder info created");
                return vkmVar.a();
            case 12:
                Iterator it2 = this.c.iterator();
                int i4 = 0;
                while (it2.hasNext()) {
                    qed qedVar = (qed) albo.bQ((akul) it2.next());
                    qeg qegVar = qedVar.c;
                    if (qegVar == null) {
                        qegVar = qeg.a;
                    }
                    qef b = qef.b(qegVar.c);
                    if (b == null) {
                        b = qef.UNKNOWN_STATUS;
                    }
                    if (!qef.PENDING.equals(b) && !qef.OK.equals(b)) {
                        Object obj4 = this.d;
                        Object obj5 = this.a;
                        smr smrVar = (smr) obj4;
                        vwv.j(Level.WARNING, smrVar.x(), smrVar.V(), "Failed to add user to group");
                        ((vti) ((vwv) obj5).f.b()).b(qedVar);
                    } else {
                        i4++;
                    }
                }
                if (i4 == ((alog) this.b).size()) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 13:
                alvw g = xql.a.g();
                g.X(alwp.a, "BugleFileTransfer");
                alvg alvgVar = (alvg) g;
                alvgVar.X(ydl.f, rve.a(((xqm) this.c).c));
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "completeIncomingFileTransferForValidMessage", 321, "FileDownloadCompletedHandler.java")).q("Converting file to unencrypted");
                return ((xql) this.b).E.b(this.a.E(), (Uri) this.d, 2);
            case 14:
                Object obj6 = this.a;
                Object obj7 = this.d;
                Uri uri = (Uri) obj6;
                if (uri.equals(obj7)) {
                    alvw g2 = xql.a.g();
                    g2.X(alwp.a, "BugleFileTransfer");
                    ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "deleteTemporaryFile", 732, "FileDownloadCompletedHandler.java")).q("Skipping deleting temporary file. Temporary file and persisted file are the same");
                } else if (((xql) this.c).g.getContentResolver().delete(uri, null, null) != 1) {
                    ?? r05 = this.b;
                    alvw i5 = xql.a.i();
                    i5.X(alwp.a, "BugleFileTransfer");
                    alvg alvgVar2 = (alvg) i5;
                    alvgVar2.X(ydl.b, r05.B());
                    alvgVar2.X(ydl.f, r05.E());
                    alvgVar2.X(ydl.y, ((Uri) obj7).toString());
                    ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "deleteTemporaryFile", 745, "FileDownloadCompletedHandler.java")).q("Failed to delete temporary file");
                }
                return null;
            case 15:
                Object obj8 = this.d;
                ?? r25 = this.b;
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) albo.bQ(this.a);
                BusinessInfoData businessInfoData = (BusinessInfoData) albo.bQ(r25);
                qei qeiVar4 = (qei) obj8;
                if (!xrf.h(qeiVar4, bindData)) {
                    return rxn.b(qeiVar4.d);
                }
                if (bindData != null) {
                    alwl alwlVar6 = (alwl) xrf.a.g();
                    alwlVar6.X(ydl.n, yyb.bh(qeiVar4.d));
                    ((alwl) alwlVar6.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "getSenderParticipant", 1122, "IncomingFileTransferProcessor.java")).q("Existing RBM bot participant found");
                    return bindData;
                }
                if (businessInfoData == null) {
                    Optional optional3 = (Optional) this.c;
                    if (optional3.isPresent()) {
                        ((alwl) ((alwl) xrf.a.g()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "getSenderParticipant", 1128, "IncomingFileTransferProcessor.java")).q("Using Agent Name from Custom Header to create participant");
                        return rxn.a(qeiVar4.d, (String) optional3.get(), null);
                    }
                }
                if (businessInfoData == null) {
                    alwl alwlVar7 = (alwl) xrf.a.i();
                    alwlVar7.X(ydl.n, yyb.bh(qeiVar4.d));
                    ((alwl) alwlVar7.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "getNewParticipantDataForRbmBot", 1233, "IncomingFileTransferProcessor.java")).q("No business info available for incoming RCS file transfer. Using defaults");
                }
                if (businessInfoData == null) {
                    name = null;
                } else {
                    name = businessInfoData.getName();
                }
                if (businessInfoData != null) {
                    str2 = businessInfoData.getColor();
                }
                ParticipantsTable.BindData a6 = rxn.a(qeiVar4.d, name, str2);
                alwl alwlVar8 = (alwl) xrf.a.g();
                alwlVar8.X(ydl.n, yyb.bh(qeiVar4.d));
                ((alwl) alwlVar8.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "getNewParticipantDataForRbmBot", 1244, "IncomingFileTransferProcessor.java")).D("No existing bot participant. Creating one: Name: %s. Color: %s", yyb.bh(name), str2);
                return a6;
            case 16:
                Object obj9 = this.b;
                Object obj10 = this.a;
                Object obj11 = this.d;
                aozy aozyVar = (aozy) this.c;
                ytp.b(aozyVar, (akul) obj11, (akul) obj10, (akul) obj9, 3);
                return (anmo) aozyVar.s();
            case 17:
                ArrayList f = ((rsa) this.d).f();
                if (f != null && !f.isEmpty() && !((ConversationIdType) this.a).b() && (r5 = this.c) != 0 && !r5.isEmpty()) {
                    smr smrVar2 = (smr) r5.get(0);
                    if (f.size() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    tqc A = smrVar2.A();
                    if (A == tqc.SPAM_FOLDER) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z && !z2) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    ParticipantsTable.BindData L = znj.L(f);
                    if (L != null) {
                        if (z && L.R()) {
                            i = 1;
                        } else if (L.T() && yyb.G(L.m()).c() && z3) {
                            i = 2;
                        } else {
                            if (L.T() && z2) {
                                i = 4;
                            }
                            i = 0;
                        }
                    } else {
                        if (z2) {
                            L = null;
                        }
                        i = 0;
                    }
                    if (i == 0) {
                        return new zwq(null, 5, A);
                    }
                    if (i != 1 && z) {
                        if (((zwt) this.b).c.e(((ParticipantsTable.BindData) f.get(0)).O())) {
                            return new zwq(null, 5, A);
                        }
                    }
                    return new zwq(L, i, A);
                }
                return new zwq(null, 5, tqc.UNARCHIVED);
            case 18:
                Object obj12 = this.a;
                Object obj13 = this.d;
                Object obj14 = this.c;
                try {
                    Network network = ((adfn) obj13).c;
                    ailh o = adcx.o((adfn) obj13, ((adhf) obj12).b.G);
                    NetworkCapabilities networkCapabilities = ((adfn) obj13).d;
                    if (networkCapabilities.hasTransport(0)) {
                        str = "Mobile";
                    } else if (networkCapabilities.hasTransport(1)) {
                        str = "WiFi";
                    } else if (networkCapabilities.hasTransport(4)) {
                        str = "VPN";
                    } else {
                        str = "Unknown";
                    }
                    return ((adhf) obj12).g(network, o, str, (String) obj14, (java.util.List) Collection.EL.stream(((adfn) obj13).b).map(new addg(20)).collect(Collectors.toList()));
                } catch (aild e3) {
                    throw new IOException("Failed to create a SIP transport.", e3);
                }
            case 19:
                aozy createBuilder2 = ahsg.a.createBuilder();
                boolean isMutable = createBuilder2.b.isMutable();
                ?? r4 = this.c;
                ?? r53 = this.b;
                ?? r6 = this.a;
                if (!isMutable) {
                    createBuilder2.u();
                }
                Object obj15 = this.d;
                apag apagVar = createBuilder2.b;
                ahsg ahsgVar = (ahsg) apagVar;
                ahsgVar.c = 1 | ahsgVar.c;
                ahsh ahshVar = (ahsh) obj15;
                ahsgVar.d = ahshVar.b;
                if (!apagVar.isMutable()) {
                    createBuilder2.u();
                }
                String str6 = ahshVar.a;
                apag apagVar2 = createBuilder2.b;
                ahsg ahsgVar2 = (ahsg) apagVar2;
                ahsgVar2.c = 2 | ahsgVar2.c;
                ahsgVar2.e = str6;
                if (!apagVar2.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar3 = createBuilder2.b;
                ahsg ahsgVar3 = (ahsg) apagVar3;
                ahsgVar3.c = 4 | ahsgVar3.c;
                ahsgVar3.f = false;
                boolean z5 = ahshVar.c;
                if (!apagVar3.isMutable()) {
                    createBuilder2.u();
                }
                ahsg ahsgVar4 = (ahsg) createBuilder2.b;
                ahsgVar4.c |= 32;
                ahsgVar4.j = z5;
                try {
                    algw algwVar = (algw) albo.bQ(r6);
                    if (algwVar.f()) {
                        String str7 = (String) algwVar.b();
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        ahsg ahsgVar5 = (ahsg) createBuilder2.b;
                        ahsgVar5.c |= 16;
                        ahsgVar5.h = str7;
                    }
                } catch (Exception e4) {
                    ((alvg) ((alvg) ((alvg) ahkh.a.d()).g(e4)).h("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotBuilder", "buildExtension", '^', "ClearcutMetricSnapshotBuilder.java")).q("Failed to set Account Name, falling back to Zwieback logging.");
                }
                try {
                    java.util.List list = (java.util.List) albo.bQ(r53);
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    ahsg ahsgVar6 = (ahsg) createBuilder2.b;
                    apao apaoVar = ahsgVar6.i;
                    if (!apaoVar.c()) {
                        ahsgVar6.i = apag.mutableCopy(apaoVar);
                    }
                    aoyj.addAll(list, ahsgVar6.i);
                } catch (Exception e5) {
                    ((alvg) ((alvg) ((alvg) ahkh.a.d()).g(e5)).h("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotBuilder", "buildExtension", 'f', "ClearcutMetricSnapshotBuilder.java")).q("Failed to set external Experiment Ids.");
                }
                try {
                    algw algwVar2 = (algw) albo.bQ(r4);
                    if (algwVar2.f()) {
                        String str8 = (String) algwVar2.b();
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        ahsg ahsgVar7 = (ahsg) createBuilder2.b;
                        ahsgVar7.c |= 8;
                        ahsgVar7.g = str8;
                    }
                } catch (Exception e6) {
                    ((alvg) ((alvg) ((alvg) ahkh.a.d()).g(e6)).h("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotBuilder", "buildExtension", 'p', "ClearcutMetricSnapshotBuilder.java")).q("Failed to set Zwieback.");
                }
                apaa apaaVar = (apaa) ahsb.a.createBuilder();
                apaaVar.ct(ahsg.b, (ahsg) createBuilder2.s());
                return (ahsb) apaaVar.s();
            default:
                Object obj16 = this.c;
                Object obj17 = this.b;
                java.util.List i6 = ((atal) obj17).i((Class) obj16);
                try {
                    ((aihq) this.d).b.a(aiie.d((atal) obj17, (aihy) this.a, i6));
                } catch (RuntimeException e7) {
                    advr.i(e7, "unexpected runtime exception handling resolve result", new Object[0]);
                }
                return i6;
        }
    }

    public /* synthetic */ imh(akul akulVar, akul akulVar2, Object obj, Object obj2, int i) {
        this.e = i;
        this.a = akulVar;
        this.b = akulVar2;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ imh(aozy aozyVar, akul akulVar, akul akulVar2, akul akulVar3, int i) {
        this.e = i;
        this.c = aozyVar;
        this.d = akulVar;
        this.a = akulVar2;
        this.b = akulVar3;
    }

    public /* synthetic */ imh(Object obj, akul akulVar, Object obj2, Object obj3, int i) {
        this.e = i;
        this.d = obj;
        this.a = akulVar;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ imh(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.d = obj;
        this.a = obj2;
        this.b = obj3;
        this.c = obj4;
    }

    public /* synthetic */ imh(Object obj, Object obj2, Object obj3, Object obj4, int i, byte[] bArr) {
        this.e = i;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
        this.a = obj4;
    }

    public /* synthetic */ imh(tum tumVar, qdk qdkVar, ajrt ajrtVar, qei qeiVar, int i) {
        this.e = i;
        this.b = tumVar;
        this.d = qdkVar;
        this.c = ajrtVar;
        this.a = qeiVar;
    }

    public /* synthetic */ imh(vlm vlmVar, vkn vknVar, java.util.List list, dyu dyuVar, int i) {
        this.e = i;
        this.b = vlmVar;
        this.a = vknVar;
        this.c = list;
        this.d = dyuVar;
    }

    public /* synthetic */ imh(vwv vwvVar, java.util.List list, smr smrVar, alog alogVar, int i) {
        this.e = i;
        this.a = vwvVar;
        this.c = list;
        this.d = smrVar;
        this.b = alogVar;
    }

    public /* synthetic */ imh(xql xqlVar, MessageCoreData messageCoreData, Uri uri, Uri uri2, int i) {
        this.e = i;
        this.c = xqlVar;
        this.b = messageCoreData;
        this.d = uri;
        this.a = uri2;
    }

    public /* synthetic */ imh(xql xqlVar, xqm xqmVar, MessageCoreData messageCoreData, Uri uri, int i) {
        this.e = i;
        this.b = xqlVar;
        this.c = xqmVar;
        this.a = messageCoreData;
        this.d = uri;
    }

    public /* synthetic */ imh(zwt zwtVar, rsa rsaVar, ConversationIdType conversationIdType, java.util.List list, int i) {
        this.e = i;
        this.b = zwtVar;
        this.d = rsaVar;
        this.a = conversationIdType;
        this.c = list;
    }
}
