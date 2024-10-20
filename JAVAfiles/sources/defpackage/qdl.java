package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.action.GenericWorkerQueueAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessPendingRevocationsAction;
import com.google.android.apps.messaging.shared.datamodel.action.SetupExpressiveStickersAction;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.rcs.client.messaging.data.BasicTextMessage;
import com.google.android.rcs.client.messaging.data.ChatMessage;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Optional;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qdl implements ancs {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ qdl(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v86, types: [ancs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v100, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v134, types: [rvm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v49, types: [ukn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r4v17, types: [msh, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        agpk agpkVar;
        Object obj2;
        alog n;
        akul c;
        int i = 4;
        int i2 = 18;
        int i3 = 8;
        int i4 = 7;
        int i5 = 0;
        int i6 = 1;
        switch (this.c) {
            case 0:
                qdn qdnVar = (qdn) this.a;
                vxx vxxVar = (vxx) qdnVar.g.b();
                Object obj3 = this.b;
                vqx a = qdnVar.a();
                a.a = ((ChatMessage) obj3).b().D();
                return vxxVar.d(a.a());
            case 1:
                pwh pwhVar = (pwh) obj;
                if (pwh.SUCCESS.equals(pwhVar)) {
                    qfo qfoVar = (qfo) this.b;
                    if (qfoVar.j.size() != 1) {
                        Object obj4 = this.a;
                        akia b = qdk.b();
                        b.n(qfoVar);
                        b.m(1);
                        return ((qdc) obj4).c.a(b.l());
                    }
                }
                return aktp.ag(pwhVar);
            case 2:
                qdn qdnVar2 = (qdn) this.a;
                vxx vxxVar2 = (vxx) qdnVar2.g.b();
                Object obj5 = this.b;
                vqx a2 = qdnVar2.a();
                a2.a = ((BasicTextMessage) obj5).a();
                return vxxVar2.d(a2.a());
            case 3:
                qdn qdnVar3 = (qdn) this.a;
                if (((trz) qdnVar3.e.b()).h()) {
                    vqx a3 = qdnVar3.a();
                    a3.e = ajru.e.toString();
                    a3.a = ((Context) qdnVar3.h.b()).getString(((iew) qdnVar3.f.b()).j());
                    a3.g(114);
                    return ((vxx) qdnVar3.g.b()).d(a3.a());
                }
                Object obj6 = this.b;
                vqx a4 = qdnVar3.a();
                a4.e = ajru.e.toString();
                a4.a = ((ChatMessage) obj6).b().D();
                return ((vxx) qdnVar3.g.b()).d(a4.a());
            case 4:
                qdn qdnVar4 = (qdn) this.a;
                vxx vxxVar3 = (vxx) qdnVar4.g.b();
                Object obj7 = this.b;
                vqx a5 = qdnVar4.a();
                a5.a = ((ChatMessage) obj7).b().D();
                return vxxVar3.d(a5.a());
            case 5:
                smr smrVar = (smr) obj;
                if (smrVar != null) {
                    return aktp.ag(Optional.of(smrVar));
                }
                Object obj8 = this.b;
                qpn qpnVar = (qpn) this.a;
                return ((qpj) qpnVar.e.b()).h((alog) obj8).h(new qlf(obj8, 9), qpnVar.g);
            case 6:
                final Integer num = (Integer) obj;
                final alor alorVar = (alor) this.b;
                final alor alorVar2 = (alor) Collection.EL.stream(alorVar.keySet()).collect(alls.b(new qqi(i4), new qqi(i3), new mcb(5)));
                Stream distinct = Collection.EL.stream(alorVar2.keySet()).distinct();
                Object obj9 = this.a;
                String str = (String) distinct.map(new qcr(obj9, i2)).collect(Collectors.joining(","));
                final qqw qqwVar = (qqw) obj9;
                int i7 = 2;
                if (((osv) qqwVar.j.b()).a()) {
                    agpkVar = new agpk("$V IN ($R)", new Object[]{qqw.u(ParticipantsTable.c.f), str});
                } else {
                    agpkVar = new agpk("substr($V, max(0, length($V) - $V)) IN ($R)", new Object[]{ParticipantsTable.c.f, ParticipantsTable.c.f, 3, str});
                }
                taz e = ParticipantsTable.e();
                tbd tbdVar = new tbd();
                tbdVar.q(-2);
                tbdVar.W(agpkVar);
                e.f(tbdVar);
                e.w("findRecipientsForDestinations");
                tay b2 = e.b();
                lff lffVar = new lff(b2, i7);
                obj2 = b2.h.get();
                return akuk.b(lffVar, (Executor) obj2).d(new ancy() { // from class: qqu
                    @Override // defpackage.ancy
                    public final Object a(ahmn ahmnVar, Object obj10) {
                        tav tavVar = (tav) obj10;
                        HashMap hashMap = new HashMap();
                        tavVar.da();
                        while (tavVar.moveToNext()) {
                            alor alorVar3 = alorVar2;
                            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) tavVar.cK();
                            String O = bindData.O();
                            O.getClass();
                            alog alogVar = (alog) alorVar3.get(qqw.y(O));
                            if (alogVar != null) {
                                int size = alogVar.size();
                                for (int i8 = 0; i8 < size; i8++) {
                                    Integer num2 = num;
                                    alor alorVar4 = alorVar;
                                    qqw qqwVar2 = qqw.this;
                                    String str2 = (String) alogVar.get(i8);
                                    msh mshVar = (msh) alorVar4.get(str2);
                                    mshVar.getClass();
                                    if (qqw.C(bindData, qqwVar2.z(mshVar.i()), num2.intValue())) {
                                        msh mshVar2 = (msh) alorVar4.get(str2);
                                        mshVar2.getClass();
                                        ((List) Map.EL.computeIfAbsent(hashMap, mshVar2, new qqi(2))).add(bindData);
                                    }
                                }
                            }
                        }
                        return hashMap;
                    }
                }, qqwVar.d).f();
            case 7:
                return qrb.a((qra) this.a, (ConversationIdType) this.b);
            case 8:
                return ((qri) this.a).c.f((String) this.b);
            case 9:
                Integer num2 = (Integer) obj;
                if (num2.intValue() != -1) {
                    Object obj10 = this.b;
                    Object obj11 = this.a;
                    return akul.g(((qyo) obj11).d.k(num2.intValue())).h(new qlf(obj11, 15), andi.a).f(Exception.class, new qdl(obj11, obj10, 10), andi.a);
                }
                alvw i8 = qyo.a.i();
                i8.X(alwp.a, "BugleCms");
                ((alvg) ((alvg) i8).h("com/google/android/apps/messaging/shared/datamodel/accounts/LinkedAccountManager", "getLinkedAccountAsync", 164, "LinkedAccountManager.java")).q("LinkedAccountManager: No valid stored accountId, throwing NoLinkedAccountException.");
                throw new qyp();
            case 10:
                Exception exc = (Exception) obj;
                ((qyo) this.a).c.c("Bugle.Cms.LinkedAccountManager.GetLinkedAccountAsync.Failure.Count");
                exc.getClass();
                int i9 = alhx.a;
                Object obj12 = this.b;
                Exception exc2 = exc;
                Throwable th = exc2;
                while (true) {
                    Throwable cause = exc2.getCause();
                    if (cause != null) {
                        if (cause != th) {
                            if (i5 != 0) {
                                th = th.getCause();
                            }
                            i5 ^= 1;
                            exc2 = cause;
                        } else {
                            throw new IllegalArgumentException("Loop in causal chain detected.", cause);
                        }
                    } else {
                        try {
                            exc2.initCause((Throwable) obj12);
                        } catch (Exception unused) {
                            exc2.getClass();
                            armd.c(exc2, (Throwable) obj12);
                        }
                        return aktp.af(exc);
                    }
                }
            case 11:
                Boolean bool = (Boolean) obj;
                Object obj13 = GenericWorkerQueueAction.a;
                if (bool.booleanValue()) {
                    Object obj14 = this.a;
                    ?? r1 = this.b;
                    srd srdVar = (srd) obj14;
                    if (r1.b(srdVar)) {
                        return r1.a(srdVar);
                    }
                }
                return aktp.ag(bool);
            case 12:
                Object obj15 = this.a;
                qzw qzwVar = (qzw) obj15;
                rjm rjmVar = qzwVar.o;
                Object obj16 = this.b;
                return aktp.ah(new itl(obj15, obj16, rjmVar.a(), 17, (char[]) null), qzwVar.x).e(Throwable.class, new raw(obj15, obj16, i6), qzwVar.u);
            case 13:
                anfu anfuVar = (anfu) obj;
                ArrayList arrayList = new ArrayList();
                if (anfuVar.b.size() <= 1) {
                    arrayList.add(anfuVar);
                    n = alog.n(arrayList);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (anfr anfrVar : anfuVar.b) {
                        if (anfrVar.h) {
                            arrayList2.add(anfrVar);
                        } else {
                            arrayList3.add(anfrVar);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        aozy createBuilder = anfu.a.createBuilder();
                        createBuilder.aS(arrayList2);
                        arrayList.add((anfu) createBuilder.s());
                    }
                    if (!arrayList3.isEmpty()) {
                        aozy createBuilder2 = anfu.a.createBuilder();
                        createBuilder2.aS(arrayList3);
                        arrayList.add((anfu) createBuilder2.s());
                    }
                    n = alog.n(arrayList);
                }
                ArrayList arrayList4 = new ArrayList();
                int size = n.size();
                while (i5 < size) {
                    arrayList4.add(trn.g(this.b, new rbp(this.a, (anfu) n.get(i5), i6)));
                    i5++;
                }
                return aktp.ad(arrayList4).h(new qyv(i4), andi.a);
            case 14:
                if (((Boolean) obj).booleanValue()) {
                    Object obj17 = this.b;
                    uie uieVar = (uie) obj17;
                    return ((ProcessPendingRevocationsAction) this.a).a.l(uieVar.b, uieVar.a);
                }
                return aktp.ag(false);
            case 15:
                if (((Boolean) obj).booleanValue()) {
                    Object obj18 = this.b;
                    vqj vqjVar = (vqj) ((ProcessPendingRevocationsAction) this.a).c.b();
                    uie uieVar2 = (uie) obj18;
                    c = qjh.c(vqjVar.c, arpj.a, arwf.a, new qka(vqjVar, (MessageCoreData) uieVar2.b, (msh) uieVar2.a, (arpe) null, 15));
                    return c;
                }
                return aktp.ag(false);
            case 16:
                return d.m(new mfg(this.a, this.b, i));
            case 17:
                aouz aouzVar = (aouz) this.b;
                int size2 = aouzVar.e.size();
                Object obj19 = this.a;
                int i10 = 13;
                if (size2 > 0) {
                    Stream stream = Collection.EL.stream(aouzVar.e);
                    aiqj aiqjVar = (aiqj) ((SetupExpressiveStickersAction) obj19).e.b();
                    aiqjVar.getClass();
                    return ancj.f(albo.bO((List) stream.map(new rbw(aiqjVar, 11)).collect(Collectors.toCollection(new qxs(i10)))), new rgh(i6), andi.a);
                }
                Stream stream2 = Collection.EL.stream(aouzVar.b);
                aiqj aiqjVar2 = (aiqj) ((SetupExpressiveStickersAction) obj19).e.b();
                aiqjVar2.getClass();
                return ancj.f(albo.bO((List) stream2.map(new rbw(aiqjVar2, 12)).collect(Collectors.toCollection(new qxs(i10)))), new rgh(i5), andi.a);
            case 18:
                rvj rvjVar = (rvj) obj;
                if (rvjVar == rvj.DISABLED) {
                    return aktp.ag(null);
                }
                Object obj20 = this.b;
                Object obj21 = this.a;
                rvk rvkVar = (rvk) obj21;
                return aktp.ai(new rbg(obj20, i3), rvkVar.d).i(new qbt(obj21, obj20, rvjVar, 10, (char[]) null), rvkVar.c);
            case 19:
                ?? r13 = this.b;
                akul b3 = r13.b();
                Object obj22 = this.a;
                return b3.i(new qdl(obj22, r13, i2), ((rvk) obj22).c);
            default:
                return this.b.a(this.a);
        }
    }

    public /* synthetic */ qdl(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
