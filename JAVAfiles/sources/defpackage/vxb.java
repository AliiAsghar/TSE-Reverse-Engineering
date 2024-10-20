package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vxb implements Consumer {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ vxb(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r1v16, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v38, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, wtl] */
    /* JADX WARN: Type inference failed for: r7v39, types: [armf, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        boolean isEmpty;
        switch (this.c) {
            case 0:
                qei qeiVar = (qei) obj;
                ((alwl) vxc.a.m().h("com/google/android/apps/messaging/shared/rcs/groups/recovery/PwqRecoverDisabledRcsGroupScheduler", "scheduleRecoveryIfNeeded", 125, "PwqRecoverDisabledRcsGroupScheduler.java")).q("Scheduling group metadata sync for RCS group");
                aozy createBuilder = vxj.a.createBuilder();
                String a = ((ConversationIdType) this.b).a();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                a.getClass();
                ((vxj) apagVar).c = a;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                Object obj2 = this.a;
                vxj vxjVar = (vxj) createBuilder.b;
                qeiVar.getClass();
                vxjVar.d = qeiVar;
                vxjVar.b |= 1;
                ((vxc) obj2).e.f((vxj) createBuilder.s());
                return;
            case 1:
                vti vtiVar = (vti) ((vwy) this.b).e.b();
                qgr qgrVar = ((vwz) this.a).f;
                if (qgrVar == null) {
                    qgrVar = qgr.a;
                }
                qgrVar.getClass();
                vtiVar.i(qgrVar, amwx.CHAT_API_ERROR_CAUSE_UNKNOWN);
                return;
            case 2:
                alwo alwoVar = vxx.a;
                String M = ((ParticipantsTable.BindData) this.a).M();
                uuf uufVar = rxn.a;
                ((mag) obj).a(this.b, ParticipantsTable.a(M));
                return;
            case 3:
                ((ujz) obj).a((MessageIdType) this.b, (rve) this.a);
                return;
            case 4:
                aozy createBuilder2 = qfm.a.createBuilder();
                qei a2 = ((psq) ((znj) this.b).a.b()).a(((RcsDestinationId) obj).a(), false);
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                Object obj3 = this.a;
                qfm qfmVar = (qfm) createBuilder2.b;
                a2.getClass();
                qfmVar.c = a2;
                qfmVar.b |= 1;
                aozy aozyVar = (aozy) obj3;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                qff qffVar = (qff) aozyVar.b;
                qfm qfmVar2 = (qfm) createBuilder2.s();
                qff qffVar2 = qff.a;
                qfmVar2.getClass();
                qffVar.e = qfmVar2;
                qffVar.b |= 4;
                return;
            case 5:
                nfw nfwVar = (nfw) obj;
                rrl rrlVar = (rrl) this.b;
                if (rrlVar.r()) {
                    ((alvg) ((alvg) wet.a.d()).h("com/google/android/apps/messaging/shared/rcs/performance/PhoneChannelAwaker", "onMessageSendingFireAndForget", 181, "PhoneChannelAwaker.java")).q("Not prewarming bot conversation");
                    return;
                }
                String n = rrlVar.n();
                if (n == null) {
                    ((alvg) ((alvg) wet.a.d()).h("com/google/android/apps/messaging/shared/rcs/performance/PhoneChannelAwaker", "onMessageSendingFireAndForget", 189, "PhoneChannelAwaker.java")).q("No prewarming, other participant is null");
                    return;
                } else {
                    ((wet) this.a).d(nfwVar, n);
                    return;
                }
            case 6:
                ((wet) this.b).e((nfw) obj, (String) this.a);
                return;
            case 7:
                amww n2 = wkk.n((vrk) this.b);
                double doubleValue = ((Double) obj).doubleValue();
                maq maqVar = (maq) ((wkk) this.a).t.a.b();
                amfq m = vco.m();
                if (!m.b.isMutable()) {
                    m.u();
                }
                amfr amfrVar = (amfr) m.b;
                amfr amfrVar2 = amfr.a;
                amfrVar.ar = n2.aa;
                amfrVar.e |= 1;
                maqVar.p(m, doubleValue);
                return;
            case 8:
                ((adnf) this.a).b(((adnv) ((wkk) this.b).m.b()).b((String) obj));
                return;
            case 9:
                ((wkk) this.b).u((adiw) this.a, ((wxb) obj).d, amww.SIM_SWAP);
                return;
            case 10:
                ((wng) this.b).s((wni) this.a);
                return;
            case 11:
                Object obj4 = this.a;
                Object obj5 = this.b;
                wni wniVar = (wni) obj5;
                synchronized (wniVar.a) {
                    ((wni) obj5).b.remove(obj4);
                    isEmpty = ((wni) obj5).b.isEmpty();
                }
                if (isEmpty) {
                    wniVar.c.set(null);
                    return;
                }
                return;
            case 12:
                ((lzv) ((armf) obj).b()).z((Context) this.a, (ContentValues) this.b);
                return;
            case 13:
                Object obj6 = this.a;
                Integer num = (Integer) obj;
                akrc b = ((aksr) ((wtp) obj6).d.b()).b("ScreenDetectionHelper.onRecordingCallback");
                ?? r3 = this.b;
                try {
                    num.getClass();
                    r3.a(((wtp) obj6).h(num.intValue()));
                    armd.i(b, null);
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        armd.i(b, th);
                        throw th2;
                    }
                }
            case 14:
                ((Bundle) this.b).putBoolean((String) this.a, ((Boolean) obj).booleanValue());
                return;
            case 15:
                alwo alwoVar2 = xdl.a;
                ((puj) obj).f(this.b, psv.a(((pto) this.a).a()));
                return;
            case 16:
                qei qeiVar2 = (qei) obj;
                aqfn cI = yyb.cI(qeiVar2);
                this.a.add(cI);
                this.b.put(cI.c, qeiVar2);
                return;
            case 17:
                alwo alwoVar3 = xew.a;
                aozy createBuilder3 = qfm.a.createBuilder();
                qei qeiVar3 = (qei) new xei().m().fu((aqfn) obj);
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                Object obj7 = this.a;
                qfm qfmVar3 = (qfm) createBuilder3.b;
                qeiVar3.getClass();
                qfmVar3.c = qeiVar3;
                qfmVar3.b |= 1;
                apct j = aotl.j((Instant) obj7);
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                Object obj8 = this.b;
                qfm qfmVar4 = (qfm) createBuilder3.b;
                j.getClass();
                qfmVar4.d = j;
                qfmVar4.b |= 2;
                qfm qfmVar5 = (qfm) createBuilder3.s();
                aozy aozyVar2 = (aozy) obj8;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                qey qeyVar = (qey) aozyVar2.b;
                apap apapVar = qey.a;
                qfmVar5.getClass();
                qeyVar.o = qfmVar5;
                qeyVar.d |= 64;
                return;
            case 18:
                qel qelVar = (qel) ((pwb) this.b).m().fu((ContentType) obj);
                aozy aozyVar3 = (aozy) this.a;
                if (!aozyVar3.b.isMutable()) {
                    aozyVar3.u();
                }
                qep qepVar = (qep) aozyVar3.b;
                qep qepVar2 = qep.a;
                qelVar.getClass();
                qepVar.e = qelVar;
                qepVar.b |= 1;
                return;
            case 19:
                alwo alwoVar4 = xse.a;
                qel qelVar2 = (qel) ((algf) this.b).fu((ContentType) obj);
                aozy aozyVar4 = (aozy) this.a;
                if (!aozyVar4.b.isMutable()) {
                    aozyVar4.u();
                }
                xsb xsbVar = (xsb) aozyVar4.b;
                xsb xsbVar2 = xsb.a;
                qelVar2.getClass();
                xsbVar.i = qelVar2;
                xsbVar.b |= 64;
                return;
            default:
                amgl amglVar = (amgl) obj;
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                Object obj9 = this.a;
                Object obj10 = this.b;
                amgu amguVar = (amgu) amglVar.b;
                amgu amguVar2 = amgu.a;
                obj10.getClass();
                amguVar.an = (amrl) obj10;
                amguVar.d |= 4;
                yyt.G(amglVar, (Optional) obj9);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.c) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            case 1:
                return Consumer$CC.$default$andThen(this, consumer);
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            case 3:
                return Consumer$CC.$default$andThen(this, consumer);
            case 4:
                return Consumer$CC.$default$andThen(this, consumer);
            case 5:
                return Consumer$CC.$default$andThen(this, consumer);
            case 6:
                return Consumer$CC.$default$andThen(this, consumer);
            case 7:
                return Consumer$CC.$default$andThen(this, consumer);
            case 8:
                return Consumer$CC.$default$andThen(this, consumer);
            case 9:
                return Consumer$CC.$default$andThen(this, consumer);
            case 10:
                return Consumer$CC.$default$andThen(this, consumer);
            case 11:
                return Consumer$CC.$default$andThen(this, consumer);
            case 12:
                return Consumer$CC.$default$andThen(this, consumer);
            case 13:
                return Consumer$CC.$default$andThen(this, consumer);
            case 14:
                return Consumer$CC.$default$andThen(this, consumer);
            case 15:
                return Consumer$CC.$default$andThen(this, consumer);
            case 16:
                return Consumer$CC.$default$andThen(this, consumer);
            case 17:
                return Consumer$CC.$default$andThen(this, consumer);
            case 18:
                return Consumer$CC.$default$andThen(this, consumer);
            case 19:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    public /* synthetic */ vxb(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
