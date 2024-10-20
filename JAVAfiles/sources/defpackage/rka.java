package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.DateRetargetClass;
import j$.util.Optional;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rka implements alhr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ rka(Object obj, MessageCoreData messageCoreData, sya syaVar, Optional optional, int i) {
        this.e = i;
        this.c = obj;
        this.a = messageCoreData;
        this.b = syaVar;
        this.d = optional;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [agnq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, apbt] */
    /* JADX WARN: Type inference failed for: r3v31, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v64, types: [java.lang.Object, arxm] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [agnw, java.lang.Object] */
    @Override // defpackage.alhr
    public final Object get() {
        int size;
        int i;
        Object apply;
        Date q;
        Instant instant;
        agnw d;
        agnw d2;
        boolean z;
        byte[] bArr = null;
        int i2 = 1;
        int i3 = 0;
        r5 = false;
        boolean z2 = false;
        switch (this.e) {
            case 0:
                Object obj = this.a;
                rkb rkbVar = (rkb) obj;
                Instant f = rkbVar.d.f();
                Object b = rkbVar.c.b();
                b.getClass();
                Instant plus = f.plus(Duration.ofSeconds(((Number) b).longValue()));
                ?? r6 = this.b;
                while (rkbVar.d.f().compareTo(plus) < 0) {
                    i3++;
                    try {
                        r6.j().disableWriteAheadLogging();
                        alvw g = rkb.a.g();
                        g.X(alwp.a, "BugleBackup");
                        ((alvg) g.h("com/google/android/apps/messaging/shared/datamodel/backup/database/BackupDatabaseAttacher", "tryRealHardToDisableWal", BasePaymentResult.ERROR_REQUEST_TIMEOUT, "BackupDatabaseAttacher.kt")).J("Time spent trying to disable WAL for database [%s]: [%s] attempts in [%s]ms", r6.n().b, Integer.valueOf(i3), Long.valueOf(Duration.between(f, ((rkb) obj).d.f()).toMillis()));
                        Object obj2 = this.d;
                        r6.z("ATTACH DATABASE \"" + ((String) this.c) + "\" AS " + ((String) obj2));
                        return arnb.a;
                    } catch (IllegalStateException e) {
                        String message = e.getMessage();
                        message.getClass();
                        if (!arsd.O(message, "Write Ahead Logging")) {
                            throw e;
                        }
                    }
                }
                throw new TimeoutException("Failed to disable WAL mode within the timeout");
            case 1:
                int intValue = ((Integer) this.d).intValue();
                altx altxVar = new altx(2);
                Object obj3 = this.b;
                boolean a = ((okf) ((qqw) obj3).f.b()).a();
                ?? r5 = this.c;
                Object obj4 = this.a;
                if (a) {
                    size = ((alog) r5).size();
                } else {
                    size = ((alog) r5).size() + 1;
                }
                akrh e2 = aktp.e("BugleCompatibleConversationMatcher#findAllGroupConversationSyncInTransaction");
                try {
                    alvw f2 = qqw.a.f();
                    f2.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) f2).h("com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher", "findAllConversationsSyncInTransaction", 823, "TelephonyCompatibleMatcher.java")).t("ConversationMatcher#findAllGroupConversationSyncInTransaction called with %s", new qqn((qqq) obj4, r5));
                    alob alobVar = new alob();
                    sna snaVar = (sna) qqw.s(new rbe(altxVar, size, i2)).n();
                    try {
                        alur it = snaVar.cR().iterator();
                        while (it.hasNext()) {
                            ((qqw) obj3).x((smr) it.next(), (alog) r5, intValue, (qqq) obj4).ifPresent(new qdm(alobVar, 6));
                        }
                        alog g2 = alobVar.g();
                        snaVar.close();
                        e2.close();
                        return g2;
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
            case 2:
                try {
                    long parseLong = Long.parseLong((String) this.d);
                    Object obj5 = this.b;
                    Object obj6 = this.c;
                    slb b2 = sld.b();
                    b2.aj("updateParticipantRcsGroupJoinStatusInConversation");
                    slc slcVar = new slc();
                    ConversationIdType conversationIdType = (ConversationIdType) obj6;
                    slcVar.b(conversationIdType);
                    slcVar.d(parseLong);
                    b2.Z(new agpw(slcVar));
                    rux ruxVar = (rux) obj5;
                    b2.c(ruxVar.a);
                    if (b2.a().e() > 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    smn smnVar = new smn();
                    smnVar.a.put("last_modified_by_key", vcp.n(vcp.m()));
                    smnVar.e.c().c("last_modified_by_key");
                    smnVar.aj("updateParticipantRcsGroupJoinStatusInConversation");
                    smo smoVar = new smo();
                    smoVar.b(conversationIdType);
                    smoVar.d(parseLong);
                    smnVar.Z(new agpw(smoVar));
                    smnVar.a.put("rcs_group_join_status", Integer.valueOf(ruxVar.a.e));
                    if (smnVar.a().e() <= 0) {
                        i2 = 0;
                    }
                    boolean z3 = i | i2;
                    if (z3 != 0) {
                        ((rul) this.a).R(conversationIdType);
                    }
                    return Boolean.valueOf(z3);
                } catch (NumberFormatException e3) {
                    throw new IllegalArgumentException("Unable to update RCS group join status due to invalid ID", e3);
                }
            case 3:
                aiut.b();
                lru lruVar = (lru) this.a;
                albo.T(lruVar.a.j());
                alob alobVar2 = new alob();
                for (ConversationIdType conversationIdType2 : this.d) {
                    Object obj7 = this.b;
                    sng sngVar = new sng();
                    sngVar.aj("setConversationsArchiveStatusLocally");
                    sngVar.h((tqc) obj7);
                    if (uyh.a()) {
                        sngVar.ab();
                    }
                    if (((rtz) lruVar.b.b()).ah(conversationIdType2, sngVar)) {
                        alobVar2.h(conversationIdType2);
                    }
                }
                ?? r2 = this.c;
                sli sliVar = new sli();
                sliVar.f("setConversationsArchiveStatusLocally");
                apply = new ruw(alobVar2, i3).apply(new sll());
                sliVar.a = new agpw((sll) apply);
                sliVar.d();
                alog g3 = alobVar2.g();
                ((uof) ((lpg) lruVar.c.b()).a.b()).a(upk.a("UPDATE_ARCHIVE_STATUS", r2));
                return g3;
            case 4:
                Object obj8 = this.b;
                rwb rwbVar = new rwb(obj8, 11);
                sya syaVar = (sya) this.d;
                syaVar.P(rwbVar);
                sxz a2 = syaVar.a();
                if (a2.e() <= 0) {
                    return false;
                }
                Object obj9 = this.a;
                rwd rwdVar = (rwd) this.c;
                ConversationIdType conversationIdType3 = (ConversationIdType) obj9;
                ((uhj) rwdVar.h.b()).j(conversationIdType3, (MessageIdType) obj8, a2.n());
                if (a2.l("message_status")) {
                    int a3 = a2.a();
                    if (!qkv.b.contains(Integer.valueOf(a3)) && !d.y(a3)) {
                        ((rtz) rwdVar.g.b()).S(conversationIdType3, null, false);
                    }
                }
                return true;
            case 5:
                ?? r0 = this.b;
                ?? r1 = this.c;
                ConversationIdType z4 = r0.z();
                MessageIdType B = r0.B();
                String Z = r1.Z();
                tbt tbtVar = new tbt();
                tbtVar.aj("updatePartContentUriAndRemoveFromScratch");
                Uri uri = (Uri) this.a;
                tbtVar.s(uri);
                Object obj10 = this.d;
                rxc rxcVar = (rxc) obj10;
                boolean e4 = rxcVar.e(z4, B, Z, tbtVar);
                if (e4) {
                    r1.as(uri);
                }
                ((agnq) rxcVar.c.b()).h(new rxa(i2), null, new rah(obj10, r1, 20, bArr));
                return Boolean.valueOf(e4);
            case 6:
                tzb tzbVar = (tzb) ((tzc) this.c).f.b();
                rwd rwdVar2 = (rwd) tzbVar.b.b();
                ?? r4 = this.a;
                MessageCoreData q2 = rwdVar2.q(r4.B());
                Object obj11 = this.b;
                if (q2 != null) {
                    ((tzp) tzbVar.d.b()).b(q2);
                    long n = r4.n();
                    try {
                        n = ((sya) obj11).c();
                    } catch (RuntimeException e5) {
                        tzb.a.r("receivedTimestamp not in builder, using existing receivedTimestamp", e5);
                    }
                    arml armlVar = tzy.a;
                    tzy a4 = tzx.a(tze.b(r4));
                    if (a4 != null) {
                        ((tzp) tzbVar.d.b()).a(r4, a4, (-1) + n);
                        tzs tzsVar = (tzs) tzbVar.c.b();
                        xyo a5 = tzs.a.a();
                        a5.H("updated message");
                        a5.z("messageId", r4.B());
                        a5.q();
                        sya syaVar2 = (sya) obj11;
                        if (MessageData.cF(syaVar2.b()) && ((Boolean) ((utz) mku.a.get()).e()).booleanValue()) {
                            Object obj12 = this.d;
                            mkw b3 = mkz.b(syaVar2, Optional.of(tzs.a));
                            b3.c(r4.B());
                            b3.i(Instant.ofEpochMilli(n));
                            b3.f = (Optional) obj12;
                            z2 = ((mlb) tzsVar.d.b()).g(b3.a());
                        } else {
                            z2 = ((rwd) tzsVar.b.b()).O(r4.z(), r4.B(), syaVar2);
                        }
                    }
                }
                return Boolean.valueOf(z2);
            case 7:
                tzn tznVar = (tzn) this.c;
                rwd rwdVar3 = (rwd) tznVar.e.b();
                ?? r42 = this.a;
                MessageCoreData q3 = rwdVar3.q(r42.B());
                if (q3 == null) {
                    return false;
                }
                Object obj13 = this.b;
                int b4 = tzn.b(r42.cI(), r42.cn());
                tznVar.e(q3);
                sya syaVar3 = (sya) obj13;
                long b5 = ujy.b(r42, syaVar3, tzn.a);
                if (!ttd.b() && !((ofu) tznVar.k.b()).a()) {
                    tznVar.g(r42, b4, (-1) + b5);
                } else {
                    tznVar.h(r42, b4, tzk.a(r42), r42.n() - 1);
                }
                if (MessageData.cF(syaVar3.b()) && ((Boolean) ((utz) mku.a.get()).e()).booleanValue()) {
                    Object obj14 = this.d;
                    mkw b6 = mkz.b(syaVar3, Optional.of(tzn.a));
                    b6.c(r42.B());
                    b6.i(Instant.ofEpochMilli(b5));
                    b6.f = (Optional) obj14;
                    return Boolean.valueOf(((mlb) tznVar.i.b()).g(b6.a()));
                }
                return Boolean.valueOf(((rwd) tznVar.e.b()).O(r42.z(), r42.B(), syaVar3));
            case 8:
                Object obj15 = this.d;
                alvi alviVar = uci.a;
                return ucn.a("UPDATE " + ((String) this.b) + " SET " + agnc.h((ContentValues) this.a, null, null) + " WHERE " + ((String) this.c), (String[]) obj15);
            case 9:
                Object obj16 = this.c;
                obj16.getClass();
                upy a6 = uqb.a();
                a6.w("getNextItemInQueue");
                a6.d(new uol(obj16, 19));
                a6.e(new atkn(uqb.c.a, (byte[]) null));
                a6.u(1);
                upr uprVar = (upr) ((upv) a6.b().n()).cO();
                Object obj17 = this.a;
                if (uprVar != null && (q = uprVar.q()) != null && (instant = DateRetargetClass.toInstant(q)) != null && instant.isBefore(((usz) obj17).b.f())) {
                    return usn.a;
                }
                ?? r3 = this.d;
                uqy uqyVar = new uqy();
                uqyVar.f("maybeScheduleNextWorkForQueue");
                uqyVar.b(new uol(obj16, 16));
                uqyVar.d();
                usz uszVar = (usz) obj17;
                ((mbl) uszVar.e.b()).e("Bugle.Pwq.ScheduledWorkManagerItems.Count", ush.c());
                if (r3 != 0) {
                    r3.v(null);
                }
                ?? r02 = this.b;
                if (r02 != 0) {
                    r02.run();
                }
                if (uprVar != null) {
                    return new uso(uszVar.c.k(uprVar));
                }
                return usm.a;
            case 10:
                sxy d3 = MessagesTable.d();
                d3.w("setMessageAnnotations");
                Object obj18 = this.b;
                d3.g(new yec(obj18, 3));
                if (d3.b().i() == 0) {
                    yhq.a.q("Message annotation is set on deleted message.");
                    return false;
                }
                ?? r03 = this.d;
                Object obj19 = this.a;
                Object obj20 = this.c;
                stg stgVar = new stg();
                stgVar.f("setMessageAnnotations");
                stgVar.b(new yec(obj18, 5));
                stgVar.d();
                return Boolean.valueOf(((yhq) obj20).b((ConversationIdType) obj19, (MessageIdType) obj18, r03));
            case 11:
                Iterator it2 = this.d.iterator();
                boolean z5 = true;
                while (true) {
                    Object obj21 = this.b;
                    Object obj22 = this.a;
                    if (it2.hasNext()) {
                        aqby aqbyVar = (aqby) it2.next();
                        String[] strArr = stl.a;
                        int i4 = ssv.a;
                        std stdVar = new std();
                        stdVar.d((ConversationIdType) obj22);
                        stdVar.e((MessageIdType) obj21);
                        stdVar.c(aqbyVar.d);
                        stdVar.b(aqbyVar);
                        stc a7 = stdVar.a();
                        d = agnc.d("$primary");
                        d2 = agnc.d("$primary");
                        long a8 = agnc.a(d2, "messages_annotations", a7, new spl(d, 9), new smq(a7, 8));
                        Long.valueOf(a8).getClass();
                        if (a8 > -1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z5 &= z;
                    } else {
                        yhq yhqVar = (yhq) this.c;
                        ConversationIdType conversationIdType4 = (ConversationIdType) obj22;
                        ((uhj) yhqVar.b.b()).g(conversationIdType4);
                        uhj uhjVar = (uhj) yhqVar.b.b();
                        String[] strArr2 = stl.a;
                        uhjVar.j(conversationIdType4, (MessageIdType) obj21, "messages_annotations");
                        return Boolean.valueOf(z5);
                    }
                }
            default:
                return ansy.q((String[]) this.d, (Uri) this.a, (String) this.b, (String) this.c);
        }
    }

    public /* synthetic */ rka(String str, ContentValues contentValues, String str2, String[] strArr, int i) {
        this.e = i;
        this.b = str;
        this.a = contentValues;
        this.c = str2;
        this.d = strArr;
    }

    public /* synthetic */ rka(lru lruVar, alog alogVar, tqc tqcVar, umr umrVar, int i) {
        this.e = i;
        this.a = lruVar;
        this.d = alogVar;
        this.b = tqcVar;
        this.c = umrVar;
    }

    public /* synthetic */ rka(qqw qqwVar, alog alogVar, Integer num, qqq qqqVar, int i) {
        this.e = i;
        this.b = qqwVar;
        this.c = alogVar;
        this.d = num;
        this.a = qqqVar;
    }

    public /* synthetic */ rka(rkb rkbVar, agnw agnwVar, String str, String str2, int i) {
        this.e = i;
        this.a = rkbVar;
        this.b = agnwVar;
        this.c = str;
        this.d = str2;
    }

    public /* synthetic */ rka(rul rulVar, String str, ConversationIdType conversationIdType, rux ruxVar, int i) {
        this.e = i;
        this.a = rulVar;
        this.d = str;
        this.c = conversationIdType;
        this.b = ruxVar;
    }

    public /* synthetic */ rka(rwd rwdVar, sya syaVar, MessageIdType messageIdType, ConversationIdType conversationIdType, int i) {
        this.e = i;
        this.c = rwdVar;
        this.d = syaVar;
        this.b = messageIdType;
        this.a = conversationIdType;
    }

    public /* synthetic */ rka(rxc rxcVar, MessageCoreData messageCoreData, MessagePartCoreData messagePartCoreData, Uri uri, int i) {
        this.e = i;
        this.d = rxcVar;
        this.b = messageCoreData;
        this.c = messagePartCoreData;
        this.a = uri;
    }

    public /* synthetic */ rka(usz uszVar, String str, arwl arwlVar, Runnable runnable, int i) {
        this.e = i;
        this.a = uszVar;
        this.c = str;
        this.d = arwlVar;
        this.b = runnable;
    }

    public /* synthetic */ rka(yhq yhqVar, MessageIdType messageIdType, ConversationIdType conversationIdType, List list, int i) {
        this.e = i;
        this.c = yhqVar;
        this.b = messageIdType;
        this.a = conversationIdType;
        this.d = list;
    }

    public /* synthetic */ rka(yhq yhqVar, List list, ConversationIdType conversationIdType, MessageIdType messageIdType, int i) {
        this.e = i;
        this.c = yhqVar;
        this.d = list;
        this.a = conversationIdType;
        this.b = messageIdType;
    }

    public /* synthetic */ rka(String[] strArr, Uri uri, String str, String str2, int i) {
        this.e = i;
        this.d = strArr;
        this.a = uri;
        this.b = str;
        this.c = str2;
    }
}
