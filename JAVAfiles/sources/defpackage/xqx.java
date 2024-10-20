package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xqx implements ancs {
    public final /* synthetic */ qei a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    private final /* synthetic */ int j;

    public /* synthetic */ xqx(ttz ttzVar, rve rveVar, byte[] bArr, qei qeiVar, alog alogVar, String str, amhz amhzVar, boolean z, apwq apwqVar, int i) {
        this.j = i;
        this.i = ttzVar;
        this.d = rveVar;
        this.h = bArr;
        this.a = qeiVar;
        this.e = alogVar;
        this.g = str;
        this.f = amhzVar;
        this.b = z;
        this.c = apwqVar;
    }

    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        if (this.j != 0) {
            String str = (String) obj;
            boolean isEmpty = TextUtils.isEmpty(str);
            Object obj2 = this.d;
            Object obj3 = this.i;
            if (isEmpty) {
                ttz ttzVar = (ttz) obj3;
                ttzVar.g.e("Bugle.Etouffee.Encryption.Failure.Reason", 1);
                ttzVar.k.r((rve) obj2, 3);
            }
            Object obj4 = this.c;
            boolean z = this.b;
            Object obj5 = this.f;
            Object obj6 = this.g;
            Object obj7 = this.e;
            qei qeiVar = this.a;
            Object obj8 = this.h;
            albo.U(true ^ TextUtils.isEmpty(str), "Failed to retrieve local registration ID");
            return ((ttz) obj3).c((byte[]) obj8, str, qeiVar, (rve) obj2, (alog) obj7, (String) obj6, false, (amhz) obj5, z, (apwq) obj4);
        }
        final MessageCoreData messageCoreData = (MessageCoreData) obj;
        final xrf xrfVar = (xrf) this.c;
        ((wzp) xrfVar.l.b()).i(((Instant) this.h).toEpochMilli());
        Object obj9 = this.d;
        Object obj10 = this.e;
        Object obj11 = this.f;
        final ConversationIdType conversationIdType = ((xwa) this.g).a;
        final qei qeiVar2 = this.a;
        final boolean z2 = this.b;
        final qwm qwmVar = (qwm) this.i;
        final ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj11;
        final rve rveVar = (rve) obj10;
        final qfo qfoVar = (qfo) obj9;
        return aktp.ai(new Callable() { // from class: xqw
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                xcs xcsVar;
                String str2;
                int i;
                String str3;
                xrf xrfVar2 = xrf.this;
                rwd rwdVar = (rwd) xrfVar2.g.b();
                rve rveVar2 = rveVar;
                MessageCoreData r = rwdVar.r(rveVar2);
                MessageCoreData messageCoreData2 = messageCoreData;
                ConversationIdType conversationIdType2 = conversationIdType;
                String str4 = "com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor";
                if (r != null) {
                    alwl alwlVar = (alwl) xrf.a.i();
                    alwlVar.X(ydl.e, rveVar2.toString());
                    alwlVar.X(ydl.o, conversationIdType2.toString());
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "insertRcsFileTransferInBugleDb", 1497, "IncomingFileTransferProcessor.java")).q("Duplicate message found.");
                    if (((okf) xrfVar2.E.b()).a()) {
                        qiu.h(((wzi) xrfVar2.F.b()).a(messageCoreData2).h(new xqi(messageCoreData2, 5), xrfVar2.c));
                    }
                    pwh pwhVar = pwh.SUCCESS;
                    pwhVar.getClass();
                    return new xqe(pwhVar);
                }
                qei qeiVar3 = qeiVar2;
                ParticipantsTable.BindData bindData2 = bindData;
                xrfVar2.m.e("IncomingRcsFileTransferHandler#insertRcsFileTransferInBugleDb", new rgr(xrfVar2, messageCoreData2, conversationIdType2, bindData2, qeiVar3, 7));
                boolean c = ((ubl) xrfVar2.y.b()).c(messageCoreData2.z());
                boolean z3 = true;
                if (!messageCoreData2.cz() && !z2 && !c) {
                    z3 = false;
                }
                qfo qfoVar2 = qfoVar;
                qwm qwmVar2 = qwmVar;
                mho mhoVar = (mho) xrfVar2.d.b();
                int e = qwmVar2.e();
                amgu amguVar = qfoVar2.l;
                if (amguVar == null) {
                    amguVar = amgu.a;
                }
                amgl amglVar = (amgl) amguVar.toBuilder();
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar2 = (amgu) amglVar.b;
                amguVar2.h = 2;
                amguVar2.b = 2 | amguVar2.b;
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar3 = (amgu) amglVar.b;
                amguVar3.c |= 1073741824;
                amguVar3.aj = z3;
                mhoVar.M(messageCoreData2, e, amglVar);
                xqc xqcVar = xrfVar2.B;
                amfq c2 = xqcVar.c(messageCoreData2, 32, new xet(9));
                xcs xcsVar2 = (xcs) xqcVar.f.b();
                String f = messageCoreData2.E().f();
                Optional empty = Optional.empty();
                alog alogVar = xcs.i;
                int i2 = ((alsx) alogVar).c;
                int i3 = 0;
                while (i3 < i2) {
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) xcsVar2.u.get(((xcr) alogVar.get(i3)).ordinal());
                    if (concurrentHashMap.containsKey(f)) {
                        mbh mbhVar = ((xcq) concurrentHashMap.get(f)).b;
                        if (!empty.isEmpty()) {
                            xcsVar = xcsVar2;
                            str2 = f;
                            mbh mbhVar2 = (mbh) empty.get();
                            i = i2;
                            str3 = str4;
                            if (mbhVar.a < mbhVar2.a) {
                                if (mbhVar.b >= mbhVar2.b) {
                                }
                            }
                        } else {
                            xcsVar = xcsVar2;
                            str2 = f;
                            i = i2;
                            str3 = str4;
                        }
                        empty = Optional.of(mbhVar);
                    } else {
                        xcsVar = xcsVar2;
                        str2 = f;
                        i = i2;
                        str3 = str4;
                    }
                    i3++;
                    xcsVar2 = xcsVar;
                    f = str2;
                    str4 = str3;
                    i2 = i;
                }
                String str5 = str4;
                if (empty.isEmpty()) {
                    alvw g = xqc.a.g();
                    g.X(alwp.a, "BugleFileTransfer");
                    alvg alvgVar = (alvg) g;
                    alvgVar.X(ydl.f, messageCoreData2.E());
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/transfer/downloads/analytics/FileDownloadEventLogger", "logRcsMessageDownloadReceiving", 269, "FileDownloadEventLogger.java")).q("Receiving timestamp has not been recorded for message. Skipping logging of RECEIVING event.");
                } else {
                    mar a = ((mbb) xqcVar.b.b()).a();
                    a.g((mbh) empty.get());
                    a.b(c2, mbt.LOG_SPEC_MESSAGE_RECEIVING_NORTHSTAR_EVENTS);
                }
                xrfVar2.p.b(conversationIdType2, bindData2, messageCoreData2);
                alwl alwlVar2 = (alwl) xrf.a.g();
                alwlVar2.X(ydl.a, messageCoreData2.B().a());
                alwlVar2.X(ydl.o, conversationIdType2.toString());
                ((alwl) alwlVar2.h(str5, "insertRcsFileTransferInBugleDb", 1561, "IncomingFileTransferProcessor.java")).q("Received and processed RCS file transfer push message.");
                ((alwl) ((alwl) xrf.b.g()).h(str5, "insertRcsFileTransferInBugleDb", 1563, "IncomingFileTransferProcessor.java")).q("Creating notification from IncomingFileTransferProcessor");
                ((wpp) xrfVar2.A.b()).I(messageCoreData2.z(), Duration.ofMillis(messageCoreData2.n()), false);
                messageCoreData2.getClass();
                return new xqd(messageCoreData2);
            }
        }, xrfVar.c);
    }

    public /* synthetic */ xqx(xrf xrfVar, qfo qfoVar, rve rveVar, ParticipantsTable.BindData bindData, xwa xwaVar, qei qeiVar, Instant instant, boolean z, qwm qwmVar, int i) {
        this.j = i;
        this.c = xrfVar;
        this.d = qfoVar;
        this.e = rveVar;
        this.f = bindData;
        this.g = xwaVar;
        this.a = qeiVar;
        this.h = instant;
        this.b = z;
        this.i = qwmVar;
    }
}
