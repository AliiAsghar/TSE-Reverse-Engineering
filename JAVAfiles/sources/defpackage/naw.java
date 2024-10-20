package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class naw extends arpw implements arqv {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public naw(MessageId messageId, mzb mzbVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = messageId;
        this.b = mzbVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                return ((naw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 1:
                ((naw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
                return null;
            case 2:
                return ((naw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 3:
                return ((naw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 4:
                return ((naw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 5:
                return ((naw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 6:
                return ((naw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 7:
                return ((naw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 8:
                return ((naw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 9:
                return ((naw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 10:
                return ((naw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 11:
                return ((naw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 12:
                return ((naw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 13:
                return ((naw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 14:
                return ((naw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 15:
                return ((naw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 16:
                return ((naw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 17:
                return ((naw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 18:
                return ((naw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 19:
                return ((naw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            default:
                return ((naw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r12v120, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r12v21, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r12v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v46, types: [com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v70, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        MessagePartData g;
        akrh e;
        int i = 14;
        int i2 = 10;
        byte[] bArr = null;
        switch (this.c) {
            case 0:
                aqil.P(obj);
                ((ryx) ((nej) this.a).b.b()).d((String) this.b);
                return arnb.a;
            case 1:
                aqil.P(obj);
                if (d.F(this.a, ((mzb) this.b).c)) {
                    ((mzb) this.b).e.y(new mqr(i2), "RichCardFileTransferProgressSupplier:Notify");
                }
                return null;
            case 2:
                aqil.P(obj);
                return new Long(((nay) this.b).d.b((Uri) this.a));
            case 3:
                aqil.P(obj);
                alvw d = nfm.a.d();
                d.X(alwp.a, "BugleRecipientSync");
                ((alvg) d.h("com/google/android/apps/messaging/shared/api/messaging/recipient/sync/RecipientContactSyncListenerImpl$onRecipientsChangedFromContacts$1", "invokeSuspend", 37, "RecipientContactSyncListenerImpl.kt")).q("Starting onRecipientsChangedFromContacts");
                ?? r12 = this.b;
                ArrayList arrayList = new ArrayList(aqjn.J(r12, 10));
                for (ParticipantsTable.BindData bindData : r12) {
                    Object obj2 = this.a;
                    ((qyg) ((nfm) obj2).e.b()).b(bindData.M(), bindData);
                    arrayList.add(arnb.a);
                }
                Object obj3 = this.a;
                ?? r0 = this.b;
                rtz rtzVar = (rtz) ((nfm) obj3).f.b();
                ArrayList arrayList2 = new ArrayList(aqjn.J(r0, 10));
                Iterator it = r0.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ParticipantsTable.BindData) it.next()).M());
                }
                rtzVar.Q(new ArrayList(arrayList2));
                alvw d2 = nfm.a.d();
                d2.X(alwp.a, "BugleRecipientSync");
                ((alvg) d2.h("com/google/android/apps/messaging/shared/api/messaging/recipient/sync/RecipientContactSyncListenerImpl$onRecipientsChangedFromContacts$1", "invokeSuspend", 40, "RecipientContactSyncListenerImpl.kt")).q("Finished onRecipientsChangedFromContacts");
                return arnb.a;
            case 4:
                aqil.P(obj);
                alvw d3 = nfm.a.d();
                d3.X(alwp.a, "BugleRecipientSync");
                ((alvg) d3.h("com/google/android/apps/messaging/shared/api/messaging/recipient/sync/RecipientContactSyncListenerImpl$onRecipientsUpdatedFromContacts$1", "invokeSuspend", 47, "RecipientContactSyncListenerImpl.kt")).q("Starting onRecipientsUpdatedFromContacts");
                nfm nfmVar = (nfm) this.a;
                osz oszVar = nfmVar.g;
                Object obj4 = this.b;
                if (oszVar.a()) {
                    nfmVar.d.ifPresent(new mpv(new lnn(obj4, 19), 13));
                } else {
                    nfmVar.c.ifPresent(new mpv(new lnn(obj4, 20), i));
                }
                alvw d4 = nfm.a.d();
                d4.X(alwp.a, "BugleRecipientSync");
                ((alvg) d4.h("com/google/android/apps/messaging/shared/api/messaging/recipient/sync/RecipientContactSyncListenerImpl$onRecipientsUpdatedFromContacts$1", "invokeSuspend", 49, "RecipientContactSyncListenerImpl.kt")).q("Finished onRecipientsUpdatedFromContacts");
                return arnb.a;
            case 5:
                aqil.P(obj);
                ?? r122 = this.b;
                nfv nfvVar = ((nfu) this.a).b;
                Optional map = Optional.ofNullable(nfvVar.b.c(r122)).map(new nfc(nfvVar, 8));
                map.getClass();
                return map;
            case 6:
                aqil.P(obj);
                Object obj5 = this.a;
                return ConcurrentMap.EL.getOrDefault(((prz) this.b).l, ((prw) obj5).a, akfa.a);
            case 7:
                aqil.P(obj);
                rwd rwdVar = (rwd) ((pyr) this.a).b.b();
                Object obj6 = this.b;
                akrh e2 = aktp.e("MessageDatabaseOperations#readMessageAndParts-processingId");
                try {
                    aiut.b();
                    rxc rxcVar = (rxc) rwdVar.f.b();
                    akrh e3 = aktp.e("MessagePartDatabaseOperations#readMessagePartData-processingId");
                    try {
                        tbs d5 = PartsTable.d();
                        d5.w("readMessagePartData-processingId");
                        d5.q();
                        d5.g(new rxb(obj6, 5));
                        PartsTable.BindData bindData2 = (PartsTable.BindData) ((tbn) d5.b().n()).cO();
                        if (bindData2 == null) {
                            e3.close();
                            g = null;
                        } else {
                            g = ((rtb) rxcVar.a.b()).g(bindData2);
                            e3.close();
                        }
                        if (g == null) {
                            alvg j = rwd.a.j();
                            j.X(xod.j, obj6);
                            ((alvg) j.h("com/google/android/apps/messaging/shared/datamodel/data/message/MessageDatabaseOperations", "readMessageAndParts", 204, "MessageDatabaseOperations.java")).q("Message part not found for processingId.");
                        } else {
                            MessageCoreData u = rwdVar.u(g.A());
                            if (u == 0) {
                                alvg j2 = rwd.a.j();
                                j2.X(xod.j, obj6);
                                ((alvg) j2.h("com/google/android/apps/messaging/shared/datamodel/data/message/MessageDatabaseOperations", "readMessageAndParts", 212, "MessageDatabaseOperations.java")).q("Message not found for part with processingId.");
                            } else {
                                u.aH(g);
                                bArr = u;
                            }
                        }
                        e2.close();
                        return bArr;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        e2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 8:
                aqil.P(obj);
                return ((pzf) this.a).a.f(this.b, 2);
            case 9:
                aqil.P(obj);
                return Boolean.valueOf(((rwd) ((pzq) this.a).a.b()).N(this.b));
            case 10:
                aqil.P(obj);
                Object obj7 = this.b;
                Object obj8 = this.a;
                e = aktp.e("FileProcessingDatabaseOperations#updateFileTransferEntryWithFileEncryptionMetadata");
                try {
                    qjh.o((pyz) obj8, (apwj) obj7, qam.a);
                    armd.i(e, null);
                    return arnb.a;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            case 11:
                aqil.P(obj);
                Object obj9 = this.b;
                Object obj10 = this.a;
                e = aktp.e("FileProcessingDatabaseOperations#updateFileTransferEntryWithThumbnailEncryptionMetadata");
                try {
                    qjh.o((pyz) obj10, (apwj) obj9, qam.b);
                    armd.i(e, null);
                    return arnb.a;
                } finally {
                }
            case 12:
                aqil.P(obj);
                int i3 = qoa.d;
                ((qoa) this.a).c.e((qoj) this.b);
                return arnb.a;
            case 13:
                aqil.P(obj);
                return qta.a((String) this.b, (qsn) this.a);
            case 14:
                aqil.P(obj);
                Object obj11 = this.b;
                qvy a = qwa.a("MyIdentityTablesOperations#getMyIdentitiesForTokens");
                a.c(new qsb(obj11, i));
                alog t = a.b().t();
                t.getClass();
                ArrayList arrayList3 = new ArrayList(aqjn.J(t, 10));
                alur it2 = t.iterator();
                while (it2.hasNext()) {
                    Object obj12 = this.a;
                    qvw qvwVar = (qvw) it2.next();
                    qvwVar.getClass();
                    arrayList3.add(((qwd) obj12).i(qvwVar));
                }
                return arrayList3;
            case 15:
                aqil.P(obj);
                Object obj13 = this.b;
                qvy a2 = qwa.a("MyIdentityTablesOperations#getMyIdentityForToken");
                a2.c(new qsb(obj13, 15));
                alog t2 = a2.b().t();
                int i4 = ((alsx) t2).c;
                if (i4 <= 1) {
                    t2.getClass();
                    Object obj14 = this.a;
                    ArrayList arrayList4 = new ArrayList(aqjn.J(t2, 10));
                    alur it3 = t2.iterator();
                    while (it3.hasNext()) {
                        qvw qvwVar2 = (qvw) it3.next();
                        qvwVar2.getClass();
                        arrayList4.add(((qwd) obj14).i(qvwVar2));
                    }
                    qvo qvoVar = (qvo) aqjn.ah(arrayList4);
                    if (qvoVar != null) {
                        return qvoVar;
                    }
                    Object obj15 = this.b;
                    Objects.toString(obj15);
                    throw new IllegalArgumentException("No MyIdentity found for token ".concat(String.valueOf(obj15)));
                }
                throw new IllegalStateException("there are " + i4 + " identities for token " + ((xwb) this.b).a);
            case 16:
                aqil.P(obj);
                Object obj16 = this.b;
                qvy a3 = qwa.a("MyIdentityTablesOperations#getMyIdentityForToken");
                a3.c(new qsb(obj16, 16));
                alog t3 = a3.b().t();
                int i5 = ((alsx) t3).c;
                if (i5 <= 1) {
                    t3.getClass();
                    Object obj17 = this.a;
                    ArrayList arrayList5 = new ArrayList(aqjn.J(t3, 10));
                    alur it4 = t3.iterator();
                    while (it4.hasNext()) {
                        qvw qvwVar3 = (qvw) it4.next();
                        qvwVar3.getClass();
                        arrayList5.add(((qwd) obj17).i(qvwVar3));
                    }
                    return aqjn.ah(arrayList5);
                }
                throw new IllegalStateException("there are " + i5 + " identities for token " + ((xwb) this.b).a);
            case 17:
                aqil.P(obj);
                ?? r123 = this.b;
                ArrayList arrayList6 = new ArrayList(aqjn.J(r123, 10));
                for (ykb ykbVar : r123) {
                    String y = ykbVar.y();
                    int a4 = ykbVar.a();
                    String t4 = ykbVar.t();
                    msh mshVar = (msh) arsd.k(ykbVar.j(false));
                    y.getClass();
                    t4.getClass();
                    arrayList6.add(new qxc(a4, y, mshVar, t4, 16));
                }
                return ((qwd) this.a).a(arrayList6);
            case 18:
                aqil.P(obj);
                File e4 = uhm.e(((rcr) this.b).b, (Uri) this.a);
                long j3 = 0;
                if (e4 != null) {
                    try {
                        bArr = amcu.b(e4);
                    } catch (FileNotFoundException e5) {
                        xyo b = rcr.a.b();
                        b.H("MMS download file not found:");
                        b.H(e4);
                        b.r(e5);
                    } catch (IOException e6) {
                        xyo b2 = rcr.a.b();
                        b2.H("Error reading MMS download file:");
                        b2.H(e4);
                        b2.r(e6);
                    }
                }
                if (bArr != null) {
                    j3 = bArr.length;
                }
                if (e4 != null && e4.exists()) {
                    e4.delete();
                    xyo a5 = rcr.a.a();
                    a5.H("Deleted temp file with downloaded MMS pdu:");
                    a5.H(e4);
                    a5.q();
                }
                return new rce(bArr, j3);
            case 19:
                aqil.P(obj);
                return Boolean.valueOf(((reb) this.a).S.b((ConversationIdType) this.b));
            default:
                aqil.P(obj);
                return Boolean.valueOf(((reb) this.a).S.b((ConversationIdType) this.b));
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, java.lang.Object] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        switch (this.c) {
            case 0:
                return new naw((nej) this.a, (String) this.b, arpeVar, 0);
            case 1:
                return new naw((MessageId) this.a, (mzb) this.b, arpeVar, 1);
            case 2:
                return new naw((nay) this.b, (Uri) this.a, arpeVar, 2);
            case 3:
                return new naw((nfm) this.a, (alog) this.b, arpeVar, 3);
            case 4:
                return new naw((nfm) this.a, (alog) this.b, arpeVar, 4, (byte[]) null);
            case 5:
                return new naw((nfu) this.a, (SelfIdentityId) this.b, arpeVar, 5);
            case 6:
                return new naw((prz) this.b, (prw) this.a, arpeVar, 6);
            case 7:
                return new naw((pyr) this.a, (pyz) this.b, arpeVar, 7);
            case 8:
                return new naw((pzf) this.a, (MessageCoreData) this.b, arpeVar, 8);
            case 9:
                return new naw((pzq) this.a, (MessageCoreData) this.b, arpeVar, 9);
            case 10:
                return new naw((pyz) this.a, (apwj) this.b, arpeVar, 10);
            case 11:
                return new naw((pyz) this.a, (apwj) this.b, arpeVar, 11, (byte[]) null);
            case 12:
                return new naw((qoa) this.a, (qoj) this.b, arpeVar, 12);
            case 13:
                return new naw((String) this.b, (qsn) this.a, arpeVar, 13);
            case 14:
                return new naw((Iterable) this.b, (qwd) this.a, arpeVar, 14);
            case 15:
                return new naw((qwe) this.b, (qwd) this.a, arpeVar, 15);
            case 16:
                return new naw((qwe) this.b, (qwd) this.a, arpeVar, 16, (byte[]) null);
            case 17:
                return new naw((Collection) this.b, (qwd) this.a, arpeVar, 17);
            case 18:
                return new naw((rcr) this.b, (Uri) this.a, arpeVar, 18);
            case 19:
                return new naw((reb) this.a, (ConversationIdType) this.b, arpeVar, 19);
            default:
                return new naw((reb) this.a, (ConversationIdType) this.b, arpeVar, 20, (byte[]) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public naw(Iterable iterable, qwd qwdVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = iterable;
        this.a = qwdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public naw(String str, qsn qsnVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = str;
        this.a = qsnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public naw(Collection collection, qwd qwdVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = collection;
        this.a = qwdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public naw(nay nayVar, Uri uri, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = nayVar;
        this.a = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public naw(nej nejVar, String str, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = nejVar;
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public naw(nfm nfmVar, alog alogVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = nfmVar;
        this.b = alogVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public naw(nfm nfmVar, alog alogVar, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.c = i;
        this.a = nfmVar;
        this.b = alogVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public naw(nfu nfuVar, SelfIdentityId selfIdentityId, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = nfuVar;
        this.b = selfIdentityId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public naw(prz przVar, prw prwVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = przVar;
        this.a = prwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public naw(pyr pyrVar, pyz pyzVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = pyrVar;
        this.b = pyzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public naw(pyz pyzVar, apwj apwjVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = pyzVar;
        this.b = apwjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public naw(pyz pyzVar, apwj apwjVar, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.c = i;
        this.a = pyzVar;
        this.b = apwjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public naw(pzf pzfVar, MessageCoreData messageCoreData, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = pzfVar;
        this.b = messageCoreData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public naw(pzq pzqVar, MessageCoreData messageCoreData, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = pzqVar;
        this.b = messageCoreData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public naw(qoa qoaVar, qoj qojVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = qoaVar;
        this.b = qojVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public naw(qwe qweVar, qwd qwdVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = qweVar;
        this.a = qwdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public naw(qwe qweVar, qwd qwdVar, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.c = i;
        this.b = qweVar;
        this.a = qwdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public naw(rcr rcrVar, Uri uri, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = rcrVar;
        this.a = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public naw(reb rebVar, ConversationIdType conversationIdType, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = rebVar;
        this.b = conversationIdType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public naw(reb rebVar, ConversationIdType conversationIdType, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.c = i;
        this.a = rebVar;
        this.b = conversationIdType;
    }
}
