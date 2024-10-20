package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mjw implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ mjw(akul akulVar, akul akulVar2, int i, int i2) {
        this.d = i2;
        this.b = akulVar;
        this.c = akulVar2;
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v61, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object, android.database.Cursor] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        akrh e;
        akrh e2;
        sbd sbdVar;
        int i = 14;
        int i2 = 12;
        switch (this.d) {
            case 0:
                return new mkk((alog) albo.bQ(this.b), Math.min(((Integer) albo.bQ(this.c)).intValue(), this.a), Math.max((r0 - r2) - r3.size(), 0));
            case 1:
                int i3 = this.a;
                iki ikiVar = (iki) this.b;
                ikiVar.k.set(i3);
                if (ikiVar.n.a()) {
                    alvw d = iki.a.d();
                    d.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) d).h("com/google/android/apps/messaging/conversation/dataservice/RcsCapabilitiesDataSourceWrapper", "updateCurrentSubIdInDataSources", 367, "RcsCapabilitiesDataSourceWrapper.java")).r("UCC is on, not updating data sources subId with %d", i3);
                } else {
                    int ordinal = ((amuk) ikiVar.m.get()).ordinal();
                    if (ordinal != 0 && ordinal != 1) {
                        if (ordinal == 2 || ordinal == 3) {
                            alvw d2 = iki.a.d();
                            d2.X(alwp.a, "Bugle");
                            ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/conversation/dataservice/RcsCapabilitiesDataSourceWrapper", "updateCurrentSubIdInDataSources", 374, "RcsCapabilitiesDataSourceWrapper.java")).r("updateCurrentSubIdInDataSources for Tachygram/SR with subId=%d", i3);
                            ikiVar.c.o.set(i3);
                        }
                    } else {
                        alvw d3 = iki.a.d();
                        d3.X(alwp.a, "Bugle");
                        ((alvg) ((alvg) d3).h("com/google/android/apps/messaging/conversation/dataservice/RcsCapabilitiesDataSourceWrapper", "updateCurrentSubIdInDataSources", 379, "RcsCapabilitiesDataSourceWrapper.java")).r("updateCurrentSubIdInDataSources for dual reg with subId=%d", i3);
                        ((ikc) ikiVar.b.get()).g.set(i3);
                    }
                }
                ?? r2 = this.c;
                alvw g = iki.a.g();
                g.X(alwp.a, "Bugle");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/conversation/dataservice/RcsCapabilitiesDataSourceWrapper", "notifyRemoteStateChange", 355, "RcsCapabilitiesDataSourceWrapper.java")).B("notifyRemoteStateChange called with selfId: %s and subId: %d", r2, i3);
                ikiVar.w.r(aktp.ag(null), "rcs_capabilities");
                alvw d4 = iki.a.d();
                d4.X(alwp.a, "Bugle");
                ((alvg) ((alvg) d4).h("com/google/android/apps/messaging/conversation/dataservice/RcsCapabilitiesDataSourceWrapper", "updateCurrentSubIdInDatabase", 360, "RcsCapabilitiesDataSourceWrapper.java")).D("Updating conversation %s entry with selfId = %s", ikiVar.i.a(), r2);
                ((rtz) ikiVar.h.b()).ai(ikiVar.i, r2);
                return null;
            case 2:
                Object obj = this.c;
                Object obj2 = this.b;
                int i4 = this.a;
                e = aktp.e("MessageListCachedLoader#loadMoreAfter");
                try {
                    rvv rvvVar = (rvv) ((rwe) obj).a.b();
                    ConversationIdType t = ((rry) obj2).t();
                    MessageIdType u = ((rry) obj2).u();
                    long i5 = ((rry) obj2).i();
                    e2 = aktp.e("ConversationMessageListDatabaseOperations#loadConversationMessagesAfter");
                    try {
                        xyl.h();
                        xyl.q(i4);
                        xyo a = rvv.a.a();
                        a.H("ConversationMessageListDatabaseOperations loadConversationMessagesAfter starts.");
                        a.q();
                        ibi ibiVar = (ibi) rvvVar.c.b();
                        String str = scq.a;
                        sda sdaVar = new sda(sdc.a);
                        sdaVar.w("getMessageIdsAfterIdChunk");
                        sdaVar.o(scq.h, "messages.received_timestamp");
                        sdaVar.o(scq.d, u.a());
                        sdaVar.o(scq.b, "ASC");
                        sdaVar.o(scq.f, ">");
                        sdaVar.o(scq.a, t.a());
                        sdaVar.o(scq.c, "messages.message_status <> 3");
                        sdaVar.o(scq.g, String.valueOf(i5));
                        sdaVar.c(new sal(11));
                        sdaVar.u(i4);
                        sbdVar = (sbd) ibiVar.m(false, sdaVar.b()).b().n();
                        try {
                            List b = rvv.b(rvvVar.b, sbdVar);
                            sbdVar.close();
                            e2.close();
                            List list = (List) Collection.EL.stream(b).map(new rwb(obj, i2)).collect(Collectors.toCollection(new roi(14)));
                            e.close();
                            return list;
                        } finally {
                            try {
                                sbdVar.close();
                                throw th;
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                    } finally {
                        try {
                            e2.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                } finally {
                }
            case 3:
                Object obj3 = this.c;
                Object obj4 = this.b;
                int i6 = this.a;
                e = aktp.e("MessageListCachedLoader#loadMoreBefore");
                try {
                    rvv rvvVar2 = (rvv) ((rwe) obj3).a.b();
                    ConversationIdType t2 = ((rry) obj4).t();
                    MessageIdType u2 = ((rry) obj4).u();
                    long i7 = ((rry) obj4).i();
                    e2 = aktp.e("ConversationMessageListDatabaseOperations#loadConversationMessagesBefore");
                    try {
                        xyl.h();
                        xyl.q(i6);
                        xyo a2 = rvv.a.a();
                        a2.H("ConversationMessageListDatabaseOperations loadConversationMessagesBefore starts.");
                        a2.q();
                        sbdVar = (sbd) ((ibi) rvvVar2.c.b()).m(false, scq.b(t2, u2, i7, i6).b()).b().n();
                        try {
                            List b2 = rvv.b(rvvVar2.b, sbdVar);
                            sbdVar.close();
                            e2.close();
                            List list2 = (List) Collection.EL.stream(b2).map(new rwb(obj3, i2)).collect(Collectors.toCollection(new roi(i)));
                            e.close();
                            return list2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            case 4:
                Object obj5 = this.c;
                rvv rvvVar3 = (rvv) ((rwe) obj5).a.b();
                Object obj6 = this.b;
                int i8 = this.a;
                akrh e3 = aktp.e("ConversationMessageListDatabaseOperations#loadLatestConversationMessages");
                try {
                    xyl.h();
                    xyl.q(i8);
                    xyo a3 = rvv.a.a();
                    a3.H("ConversationMessageListDatabaseOperations loadLatestConversationMessages starts.");
                    a3.q();
                    sbd sbdVar2 = (sbd) ((ibi) rvvVar3.c.b()).m(true, scq.a((ConversationIdType) obj6, i8).b()).b().n();
                    try {
                        List b3 = rvv.b(rvvVar3.b, sbdVar2);
                        sbdVar2.close();
                        e3.close();
                        return (List) Collection.EL.stream(b3).map(new rwb(obj5, i2)).collect(Collectors.toCollection(new roi(i)));
                    } finally {
                    }
                } finally {
                }
            case 5:
                final tzn tznVar = (tzn) this.c;
                ((tzr) tznVar.j.b()).b(1);
                alvw d5 = tzn.b.d();
                d5.X(alwp.a, "BugleEtouffee");
                alvg alvgVar = (alvg) d5;
                alvz alvzVar = ydl.p;
                Object obj7 = this.b;
                alvgVar.X(alvzVar, obj7);
                alvg alvgVar2 = (alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "insertProtocolTombstoneIfDraftTypeChanged", 186, "ProtocolChangeTombstoneManagerImpl.java");
                final int i9 = this.a;
                alvgVar2.r("insertProtocolTombstoneIfDraftTypeChanged, with draftMessageType: %d", i9);
                final ConversationIdType conversationIdType = (ConversationIdType) obj7;
                tznVar.g.e("ProtocolChangeTombstoneManagerImpl#insertProtocolTombstoneIfDraftTypeChanged", new Runnable() { // from class: tzm
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10;
                        tzk tzkVar;
                        int i11;
                        int i12;
                        tzn tznVar2 = tzn.this;
                        rwd rwdVar = (rwd) tznVar2.e.b();
                        ConversationIdType conversationIdType2 = conversationIdType;
                        MessageCoreData l = rwdVar.l(conversationIdType2);
                        int i13 = i9;
                        if (l != null && !tzn.n(l)) {
                            if (!ttd.b() && !((ofu) tznVar2.k.b()).a()) {
                                int a4 = tzn.a(i13);
                                if (!d.z(l.j())) {
                                    if (a4 != tzn.b(l.cI(), l.cn())) {
                                        tznVar2.f(conversationIdType2, a4, l.n() + 1);
                                        return;
                                    }
                                    return;
                                }
                                if (rvx.e(l.j()) && !tzn.m(l.j(), a4)) {
                                    MessageCoreData n = ((rwd) tznVar2.e.b()).n(conversationIdType2);
                                    if (a4 == 216 && ((rwd) tznVar2.e.b()).i(conversationIdType2) == null) {
                                        i12 = 219;
                                    } else {
                                        i12 = a4;
                                    }
                                    if (n == null) {
                                        l.bI(i12);
                                        ((rwd) tznVar2.e.b()).H(l);
                                        tznVar2.c.e("Bugle.Tombstone.Generated", i12);
                                        alvw d6 = tzn.b.d();
                                        d6.X(alwp.a, "BugleEtouffee");
                                        alvg alvgVar3 = (alvg) d6;
                                        alvgVar3.X(ydl.p, conversationIdType2);
                                        ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "setProtocolChangeTombstone", 388, "ProtocolChangeTombstoneManagerImpl.java")).r("setProtocolChangeTombstone found no messages before last tombstone; updating tombstone. newTombstoneStatus: %s", i12);
                                        return;
                                    }
                                    if (tzn.m(i12, tzn.b(n.cI(), n.cn()))) {
                                        if (((nzt) tznVar2.l.b()).a()) {
                                            tznVar2.j(l, shs.p);
                                        }
                                        ((uzo) tznVar2.f.b()).a(l.B());
                                        alvw d7 = tzn.b.d();
                                        d7.X(alwp.a, "BugleEtouffee");
                                        alvg alvgVar4 = (alvg) d7;
                                        alvgVar4.X(ydl.p, conversationIdType2);
                                        ((alvg) alvgVar4.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "setProtocolChangeTombstone", 409, "ProtocolChangeTombstoneManagerImpl.java")).q("setProtocolChangeTombstone deleted tombstone");
                                        return;
                                    }
                                    l.bI(i12);
                                    ((rwd) tznVar2.e.b()).H(l);
                                    tznVar2.c.e("Bugle.Tombstone.Generated", i12);
                                    alvw d8 = tzn.b.d();
                                    d8.X(alwp.a, "BugleEtouffee");
                                    alvg alvgVar5 = (alvg) d8;
                                    alvgVar5.X(ydl.p, conversationIdType2);
                                    ((alvg) alvgVar5.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "setProtocolChangeTombstone", 419, "ProtocolChangeTombstoneManagerImpl.java")).r("setProtocolChangeTombstone updated tombstone, newTombstone: %s", i12);
                                    return;
                                }
                                return;
                            }
                            alvw d9 = tzn.b.d();
                            d9.X(alwp.a, "BugleEtouffee");
                            ((alvg) ((alvg) d9).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "setProtocolChangeTombstoneV2", 246, "ProtocolChangeTombstoneManagerImpl.java")).q("setProtocolChangeTombstoneV2");
                            int a5 = tzn.a(i13);
                            if (i13 != 30) {
                                if (i13 != 40) {
                                    tzkVar = tzk.a;
                                } else {
                                    tzkVar = tzk.c;
                                }
                            } else {
                                tzkVar = tzk.b;
                            }
                            if (!d.z(l.j())) {
                                tzk a6 = tzk.a(l);
                                if (tzkVar == a6) {
                                    alvw d10 = tzn.b.d();
                                    d10.X(alwp.a, "BugleEtouffee");
                                    alvg alvgVar6 = (alvg) d10;
                                    alvgVar6.X(ydl.p, conversationIdType2);
                                    ((alvg) alvgVar6.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "setProtocolChangeTombstoneV2", 257, "ProtocolChangeTombstoneManagerImpl.java")).D("protocols haven't changed. returning. draftTypeProtocol: %s, lastMessageProtocol: %s", tzkVar, a6);
                                    return;
                                }
                                long n2 = l.n() + 1;
                                tzu a7 = tzu.a(a6, tzkVar);
                                tznVar2.f(conversationIdType2, a5, n2);
                                tznVar2.c.e("Bugle.Tombstone.Generated", a7.j);
                                return;
                            }
                            if (rvx.e(l.j())) {
                                tzk b4 = tzk.b(l.j());
                                if (tzkVar == b4) {
                                    alvw d11 = tzn.b.d();
                                    d11.X(alwp.a, "BugleEtouffee");
                                    alvg alvgVar7 = (alvg) d11;
                                    alvgVar7.X(ydl.p, conversationIdType2);
                                    ((alvg) alvgVar7.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "setProtocolChangeTombstoneV2", 277, "ProtocolChangeTombstoneManagerImpl.java")).D("protocols haven't changed. returning. DraftTypeProtocol: %s, lastMessageProtocol: %s", tzkVar, b4);
                                    return;
                                }
                                tzu a8 = tzu.a(b4, tzkVar);
                                MessageCoreData n3 = ((rwd) tznVar2.e.b()).n(conversationIdType2);
                                if (a5 == 216 && ((rwd) tznVar2.e.b()).i(conversationIdType2) == null) {
                                    i11 = 219;
                                } else {
                                    i11 = a5;
                                }
                                if (n3 == null) {
                                    l.bI(i11);
                                    ((rwd) tznVar2.e.b()).H(l);
                                    tznVar2.c.e("Bugle.Tombstone.Generated", a8.j);
                                    alvw d12 = tzn.b.d();
                                    d12.X(alwp.a, "BugleEtouffee");
                                    alvg alvgVar8 = (alvg) d12;
                                    alvgVar8.X(ydl.p, conversationIdType2);
                                    ((alvg) alvgVar8.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "setProtocolChangeTombstoneV2", 308, "ProtocolChangeTombstoneManagerImpl.java")).r("setProtocolChangeTombstone found no messages before last tombstone; updating tombstone, with newTombstoneStatus: %s", a8.j);
                                    return;
                                }
                                tzk a9 = tzk.a(n3);
                                if (a9 == tzkVar) {
                                    if (((nzt) tznVar2.l.b()).a()) {
                                        tznVar2.j(l, shs.p);
                                    }
                                    ((uzo) tznVar2.f.b()).a(l.B());
                                    alvw d13 = tzn.b.d();
                                    d13.X(alwp.a, "BugleEtouffee");
                                    alvg alvgVar9 = (alvg) d13;
                                    alvgVar9.X(ydl.p, conversationIdType2);
                                    ((alvg) alvgVar9.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "setProtocolChangeTombstoneV2", 329, "ProtocolChangeTombstoneManagerImpl.java")).q("setProtocolChangeTombstone deleted tombstone");
                                    return;
                                }
                                tzu a10 = tzu.a(a9, tzkVar);
                                l.bI(i11);
                                ((rwd) tznVar2.e.b()).H(l);
                                tznVar2.c.e("Bugle.Tombstone.Generated", a10.j);
                                alvw d14 = tzn.b.d();
                                d14.X(alwp.a, "BugleEtouffee");
                                alvg alvgVar10 = (alvg) d14;
                                alvgVar10.X(ydl.p, conversationIdType2);
                                ((alvg) alvgVar10.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "setProtocolChangeTombstoneV2", 343, "ProtocolChangeTombstoneManagerImpl.java")).r("setProtocolChangeTombstone updated tombstone. newTombstone: %s", a10.j);
                                return;
                            }
                            return;
                        }
                        if (i13 == 40) {
                            i10 = 213;
                        } else if (i13 == 30) {
                            i10 = 207;
                        } else {
                            i10 = 206;
                        }
                        if (l == null) {
                            tznVar2.c.c("Bugle.Etouffee.UI.PredictiveTombstone.Found.Empty.Conversation");
                            alvw d15 = tzn.b.d();
                            d15.X(alwp.a, "BugleEtouffee");
                            alvg alvgVar11 = (alvg) d15;
                            alvgVar11.X(ydl.p, conversationIdType2);
                            ((alvg) alvgVar11.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "setConversationCreationTombstone", 444, "ProtocolChangeTombstoneManagerImpl.java")).r("setConversationCreationTombstone skip insert, no messages in conversation. Tombstone: %s", i10);
                            return;
                        }
                        if (tzn.n(l)) {
                            if (l.j() == i10) {
                                alvw d16 = tzn.b.d();
                                d16.X(alwp.a, "BugleEtouffee");
                                alvg alvgVar12 = (alvg) d16;
                                alvgVar12.X(ydl.p, conversationIdType2);
                                ((alvg) alvgVar12.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "updateMessageTombstone", 459, "ProtocolChangeTombstoneManagerImpl.java")).u("Attempting to update message tombstone, but current and new tombstones are equal. CurrentTombstone: %s, newTombstone: %s", l.j(), i10);
                                return;
                            }
                            int j = l.j();
                            l.bI(i10);
                            ((rwd) tznVar2.e.b()).H(l);
                            tznVar2.c.e("Bugle.Tombstone.Generated", i10);
                            alvw d17 = tzn.b.d();
                            d17.X(alwp.a, "BugleEtouffee");
                            alvg alvgVar13 = (alvg) d17;
                            alvgVar13.X(ydl.p, conversationIdType2);
                            ((alvg) alvgVar13.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/tombstone/ProtocolChangeTombstoneManagerImpl", "updateMessageTombstone", 472, "ProtocolChangeTombstoneManagerImpl.java")).u("setConversationCreationTombstone updated conversation creation tombstone. oldTombstone: %s, newTombstone: %s", j, i10);
                        }
                    }
                });
                return null;
            case 6:
                ArrayList arrayList = new ArrayList();
                int length = zlt.b.length;
                int[] iArr = new int[4];
                int i10 = 0;
                while (true) {
                    ?? r9 = this.b;
                    if (i10 < 4) {
                        iArr[i10] = r9.getColumnIndex(zlt.b[i10]);
                        i10++;
                    } else {
                        int i11 = 0;
                        while (r9.moveToNext()) {
                            int i12 = this.a;
                            Object obj8 = this.c;
                            zln zlnVar = new zln();
                            zls zlsVar = (zls) obj8;
                            zlnVar.b = ((msk) zlsVar.b.f.b()).t(r9.getString(iArr[0]), i12);
                            zlnVar.a = r9.getString(iArr[1]);
                            zlnVar.c = zlsVar.b.a(r9.getLong(iArr[2]));
                            zlnVar.c(r9.getInt(iArr[3]));
                            zlnVar.b(i11);
                            arrayList.add(zlnVar.a());
                            i11++;
                        }
                        return arrayList;
                    }
                }
            default:
                int i13 = this.a;
                Object obj9 = this.b;
                ?? r3 = this.c;
                try {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = ((akkl) obj9).h.values().iterator();
                    while (it.hasNext()) {
                        Object b4 = ((armf) it.next()).b();
                        b4.getClass();
                        arrayList2.add(b4);
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((akkj) it2.next()).a();
                    }
                    akec.v((RandomAccessFile) r3, i13);
                    armd.i(r3, null);
                    return null;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        armd.i(r3, th3);
                        throw th4;
                    }
                }
        }
    }

    public /* synthetic */ mjw(iki ikiVar, int i, SelfIdentityId selfIdentityId, int i2) {
        this.d = i2;
        this.b = ikiVar;
        this.a = i;
        this.c = selfIdentityId;
    }

    public /* synthetic */ mjw(Object obj, Object obj2, int i, int i2) {
        this.d = i2;
        this.c = obj;
        this.b = obj2;
        this.a = i;
    }
}
