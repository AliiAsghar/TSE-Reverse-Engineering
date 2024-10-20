package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ubu implements alhr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ubu(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v46, types: [msk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [algk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [ancr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v73, types: [yjf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, agno] */
    @Override // defpackage.alhr
    public final Object get() {
        String[] strArr;
        xhv b;
        int i = 5;
        int i2 = 18;
        switch (this.c) {
            case 0:
                return ucn.a((String) this.a, (String[]) this.b);
            case 1:
                tyo tyoVar = (tyo) this.b;
                rwd rwdVar = (rwd) tyoVar.f.b();
                Object obj = this.a;
                MessageIdType messageIdType = (MessageIdType) obj;
                MessageCoreData q = rwdVar.q(messageIdType);
                if (q == null) {
                    return false;
                }
                ConversationIdType z = q.z();
                sya syaVar = new sya();
                syaVar.aj("markMessageForManualUnencryptedResending");
                syaVar.ag();
                syaVar.v(0);
                syaVar.P(new tyl(obj, i));
                if (q.bZ()) {
                    syaVar.w(-1L);
                }
                return Boolean.valueOf(((rwd) tyoVar.f.b()).M(syaVar.a(), z, messageIdType));
            case 2:
                return uci.l((String) this.b, (ContentValues) this.a, 0);
            case 3:
                return ucn.a((String) this.a, (String[]) this.b);
            case 4:
                return uci.l((String) this.b, (ContentValues) this.a, 0);
            case 5:
                return ucn.a((String) this.a, (String[]) this.b);
            case 6:
                return ((uqg) this.b).d((rve) this.a);
            case 7:
                return ((uqg) this.b).c((MessageIdType) this.a);
            case 8:
                return this.b.a((ukb) this.a);
            case 9:
                Object obj2 = this.b;
                qin qinVar = new qin(obj2, 18);
                uoh uohVar = (uoh) this.a;
                List c = uohVar.c(qinVar);
                xyo c2 = uoh.a.c();
                c2.H("Cancelled rows with handler");
                c2.z("handlerKey", obj2);
                c2.x("itemCount", c.size());
                c2.q();
                ArrayList arrayList = new ArrayList(aqjn.J(c, 10));
                Iterator it = c.iterator();
                while (it.hasNext()) {
                    arrayList.add(((upr) it.next()).o());
                }
                uohVar.e(aqjn.aE(arrayList));
                return c;
            case 10:
                return ((uqo) this.b).k((upr) this.a);
            case 11:
                vjm vjmVar = (vjm) this.b;
                String.valueOf(vjmVar.b);
                boolean z2 = xzb.b;
                syc sycVar = new syc();
                sycVar.s();
                if (vjmVar.b.size() > 0) {
                    sycVar.h(ruy.c(vjmVar.b));
                }
                Object obj3 = this.a;
                if (vjmVar.b.size() == 0) {
                    qih qihVar = (qih) ((vjl) obj3).d.b();
                    ConversationIdType conversationIdType = ruy.a;
                    syc sycVar2 = new syc();
                    sycVar2.s();
                    strArr = qihVar.f(conversationIdType, new syb(sycVar2));
                    if (strArr == null) {
                        strArr = new String[0];
                    }
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    alog c3 = ruy.c(vjmVar.b);
                    int size = c3.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ConversationIdType conversationIdType2 = (ConversationIdType) c3.get(i3);
                        vjl vjlVar = (vjl) obj3;
                        if (((qih) vjlVar.d.b()).d(conversationIdType2, ((ugy) vjlVar.e.b()).a(conversationIdType2))) {
                            qih qihVar2 = (qih) vjlVar.d.b();
                            syc sycVar3 = new syc();
                            sycVar3.s();
                            String[] f = qihVar2.f(conversationIdType2, new syb(sycVar3));
                            if (f != null) {
                                Collections.addAll(arrayList2, f);
                            }
                        }
                    }
                    strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                }
                sya syaVar2 = new sya();
                syaVar2.aj("markConversationsAsNotifiedAndGetCloudSyncIdsToUpdate");
                syaVar2.o(true);
                syaVar2.O(sycVar);
                int e = syaVar2.a().e();
                if (e > 0) {
                    Collection.EL.stream(vjmVar.b).forEach(new uoa(obj3, 15));
                }
                ((alwl) ((alwl) vjl.a.g()).h("com/google/android/apps/messaging/shared/notification/workhandlers/MarkAsNotifiedHandler", "markConversationsAsNotifiedAndGetCloudSyncIdsToUpdate", 208, "MarkAsNotifiedHandler.java")).B("Marking conversation(s) %s as notified (updateCount %d)", vjmVar.b, e);
                return strArr;
            case 12:
                final vtq vtqVar = (vtq) this.b;
                Function function = new Function() { // from class: vtp
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo416andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:72:0x0348  */
                    /* JADX WARN: Removed duplicated region for block: B:73:0x0350  */
                    @Override // java.util.function.Function
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object apply(java.lang.Object r18) {
                        /*
                            Method dump skipped, instructions count: 1060
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.vtp.apply(java.lang.Object):java.lang.Object");
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                Object obj4 = this.a;
                return (Boolean) sni.f((ConversationIdType) obj4, function, new uea(obj4, 16));
            case 13:
                return this.a.b(((vqy) this.b).c);
            case 14:
                wen wenVar = (wen) this.b;
                Set h = wenVar.b.h();
                smv[] smvVarArr = rtk.a;
                sxy d = MessagesTable.d();
                d.w("getUnsentMessageQuery");
                d.k(rtk.b);
                d.g(new rsc(this.a, i));
                rtk.a(h, d);
                d.h(new atkn((Object) MessagesTable.c.i, false));
                snf e2 = sni.e();
                e2.c(rtk.a);
                d.A(agoh.b(e2.b(), sni.c.a, MessagesTable.c.b).a());
                return Boolean.valueOf(wenVar.d(d.b().t()));
            case 15:
                return ((wva) this.a).a(new wyk(this.b, 1));
            case 16:
                ?? r0 = this.b;
                Object obj5 = this.a;
                try {
                    apbt apbtVar = (apbt) r0.apply(((wva) obj5).q());
                    apbtVar.getClass();
                    if (((wva) obj5).v(apbtVar)) {
                        return apbtVar;
                    }
                } catch (apba e3) {
                    wva wvaVar = (wva) obj5;
                    ((alwl) ((alwl) wva.a.i()).g(e3)).D("Failed to update data store due to invalid data. key = %s, subkey = %s", wvaVar.e, yyb.bk(wvaVar.f));
                }
                throw new IllegalStateException("Failed to update data in settings store");
            case 17:
                return aktp.aj(this.b, ((xdq) this.a).f);
            case 18:
                snf e4 = sni.e();
                e4.w("fixThread");
                Object obj6 = this.a;
                e4.h(new xeo(obj6, i2));
                sna snaVar = (sna) e4.b().n();
                Object obj7 = this.b;
                try {
                    if (!snaVar.moveToFirst()) {
                        alvw i4 = xgw.a.i();
                        i4.X(alwp.a, "BugleBackup");
                        ((alvg) ((alvg) i4).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "fixThreadIdInTransaction", 1617, "ReverseTelephonySync.java")).t("Conversation was removed before it was fixed. ConversationId: %s", obj6);
                        b = new xhv();
                    } else if (!((wyj) ((xgw) obj7).e.b()).f()) {
                        alvw i5 = xgw.a.i();
                        i5.X(alwp.a, "BugleBackup");
                        ((alvg) ((alvg) i5).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "fixThreadIdInTransaction", 1623, "ReverseTelephonySync.java")).t("No sync permissions to fix conversation. ConversationId: %s", obj6);
                        b = snaVar.L();
                    } else if (!snaVar.ao()) {
                        alvw i6 = xgw.a.i();
                        i6.X(alwp.a, "BugleBackup");
                        ((alvg) ((alvg) i6).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "fixThreadIdInTransaction", 1629, "ReverseTelephonySync.java")).t("Conversation is not awaiting reverse sync. ConversationId: %s", obj6);
                        b = snaVar.L();
                    } else {
                        Optional d2 = ((xgw) obj7).d(snaVar, 1);
                        if (d2.isEmpty()) {
                            alvw i7 = xgw.a.i();
                            i7.X(alwp.a, "BugleBackup");
                            ((alvg) ((alvg) i7).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "fixThreadIdInTransaction", 1637, "ReverseTelephonySync.java")).t("Unable to create thread id for conversation. ConversationId: %s", obj6);
                            b = snaVar.L();
                        } else {
                            b = xhv.b(((Long) d2.get()).longValue());
                        }
                    }
                    snaVar.close();
                    return b;
                } catch (Throwable th) {
                    try {
                        snaVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 19:
                if (((Boolean) xja.b.e()).booleanValue()) {
                    if (this.a.i()) {
                        return ((yjy) this.b).j().p();
                    }
                    return "default_device_id";
                }
                return null;
            default:
                Object obj8 = this.a;
                Object obj9 = this.b;
                alwo alwoVar = xot.a;
                alob alobVar = new alob();
                Instant instant = (Instant) obj9;
                Duration duration = (Duration) obj8;
                alobVar.j(xot.d(instant, 110, 104, duration));
                alobVar.j(xot.d(instant, 12, 7, duration));
                return alobVar.g();
        }
    }

    public /* synthetic */ ubu(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
