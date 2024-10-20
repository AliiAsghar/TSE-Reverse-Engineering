package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.DesugarArrays;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mlg extends arpw implements arqv {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlg(arqg arqgVar, arsb arsbVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = arqgVar;
        this.b = arsbVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return ((mlg) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 1:
                return ((mlg) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 2:
                return ((mlg) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 3:
                return ((mlg) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 4:
                return ((mlg) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 5:
                return ((mlg) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 6:
                return ((mlg) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 7:
                return ((mlg) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 8:
                return ((mlg) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 9:
                return ((mlg) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 10:
                return ((mlg) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 11:
                return ((mlg) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 12:
                return ((mlg) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 13:
                return ((mlg) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 14:
                return ((mlg) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 15:
                return ((mlg) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 16:
                return ((mlg) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 17:
                return ((mlg) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 18:
                return ((mlg) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 19:
                return ((mlg) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            default:
                return ((mlg) c((qss) obj, (arpe) obj2)).b(arnb.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v87, types: [java.lang.Object, uns] */
    /* JADX WARN: Type inference failed for: r2v11, types: [com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v128, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v172, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v47, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v66, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v67, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v68, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Object k;
        boolean z;
        Object c;
        Object F;
        Object F2;
        Object apply;
        alog b;
        Object m;
        Object apply2;
        Integer valueOf;
        Object F3;
        Object F4;
        Object q;
        int i = 7;
        boolean z2 = false;
        switch (this.d) {
            case 0:
                arpl arplVar = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                    k = obj;
                } else {
                    aqil.P(obj);
                    akul b2 = ((DefaultConversation) this.b).e.b();
                    b2.getClass();
                    akul b3 = this.b.f().b();
                    b3.getClass();
                    akul b4 = this.b.i().c().b();
                    b4.getClass();
                    arwl[] arwlVarArr = {qjh.e(b2), qjh.e(b3), qjh.e(b4)};
                    this.a = 1;
                    k = arrj.k(arwlVarArr, this);
                    if (k == arplVar) {
                        return arplVar;
                    }
                }
                List list = (List) k;
                Object obj2 = list.get(0);
                obj2.getClass();
                mll mllVar = (mll) obj2;
                Object obj3 = list.get(1);
                obj3.getClass();
                alog alogVar = (alog) obj3;
                Object obj4 = list.get(2);
                obj4.getClass();
                mjq mjqVar = ((mwc) obj4).c;
                boolean z3 = mjqVar.g;
                if (((Boolean) ((utz) yig.Q.get()).e()).booleanValue() && alogVar.size() == 1 && ((ResolvedRecipient) aqjn.X(alogVar)).f().z()) {
                    z = true;
                } else {
                    z = false;
                }
                mho mhoVar = (mho) ((mlh) this.c).a.b();
                Object obj5 = this.b;
                amfe amfeVar = amfe.UNKNOWN_BUGLE_CONVERSATION_ORIGIN;
                int size = alogVar.size();
                boolean l = mllVar.l();
                if (mllVar.x() == amjj.SEND_MODE_XMS_LATCH) {
                    z2 = true;
                }
                Boolean valueOf2 = Boolean.valueOf(z2);
                int r = mllVar.r();
                lfl lflVar = (lfl) ((mlh) this.c).b.b();
                ArrayList arrayList = new ArrayList(aqjn.J(alogVar, 10));
                Iterator<E> it = alogVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ResolvedRecipient) it.next()).f());
                }
                alog o = lflVar.o(alzz.aZ(arrayList));
                boolean C = mllVar.C();
                if (mllVar.b() == mit.ONE_ON_ONE && alogVar.size() == 1) {
                    i = yzc.g(((ResolvedRecipient) aqjn.ag(alogVar)).B().c);
                }
                mhoVar.aC(((DefaultConversation) obj5).a.a, amfeVar, 0, size, l, valueOf2, z3, z, r, o, C, i, mjqVar.h, tqc.i(mllVar.g()));
                return null;
            case 1:
                arpl arplVar2 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                    c = obj;
                } else {
                    aqil.P(obj);
                    Object obj6 = this.c;
                    ?? r4 = this.b;
                    this.a = 1;
                    if (r4.length() > 0) {
                        uuf uufVar = mde.a;
                        if (arnv.a.contains(r4) && !((aplg) mde.d.e()).b.contains(r4)) {
                            c = true;
                        } else {
                            c = ((lru) obj6).c(this);
                        }
                        if (c == arplVar2) {
                            return arplVar2;
                        }
                    } else {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
                return Boolean.valueOf(!((Boolean) c).booleanValue());
            case 2:
                arpl arplVar3 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                    F = obj;
                } else {
                    aqil.P(obj);
                    akul i2 = ((mlu) ((mpu) this.c).b.b()).i((alog) this.b);
                    i2.getClass();
                    this.a = 1;
                    F = arro.F(i2, this);
                    if (F == arplVar3) {
                        return arplVar3;
                    }
                }
                Optional map = ((Optional) F).map(new moh(lgk.q, 6));
                map.getClass();
                return map;
            case 3:
                arpl arplVar4 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                    F2 = obj;
                } else {
                    aqil.P(obj);
                    akul h = ((mlu) ((mpu) this.c).b.b()).h((mqy) this.b);
                    this.a = 1;
                    F2 = arro.F(h, this);
                    if (F2 == arplVar4) {
                        return arplVar4;
                    }
                }
                alog<ConversationId> alogVar2 = (alog) F2;
                ArrayList arrayList2 = new ArrayList(aqjn.J(alogVar2, 10));
                for (ConversationId conversationId : alogVar2) {
                    conversationId.getClass();
                    arrayList2.add(new RbmConversationId(((BugleConversationId) conversationId).a));
                }
                return alzz.aZ(arrayList2);
            case 4:
                arpl arplVar5 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    long j = mra.a;
                    this.a = 1;
                    if (arwi.n(j, this) == arplVar5) {
                        return arplVar5;
                    }
                }
                lqn lqnVar = (lqn) ((mra) this.c).c.b();
                Object obj7 = this.b;
                aozy createBuilder = mrc.a.createBuilder();
                createBuilder.getClass();
                mzc mzcVar = (mzc) obj7;
                String b5 = mzcVar.a.b.b();
                b5.getClass();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                mrc mrcVar = (mrc) apagVar;
                mrcVar.b |= 1;
                mrcVar.c = b5;
                long j2 = mzcVar.h;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                mrc mrcVar2 = (mrc) createBuilder.b;
                mrcVar2.b = 2 | mrcVar2.b;
                mrcVar2.d = (float) j2;
                DesugarCollections.unmodifiableList(mrcVar2.e).getClass();
                alog alogVar3 = mzcVar.d;
                alogVar3.getClass();
                ArrayList arrayList3 = new ArrayList(aqjn.J(alogVar3, 10));
                Iterator<E> it2 = alogVar3.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(String.valueOf(((mxf) it2.next()).b()));
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                mrc mrcVar3 = (mrc) createBuilder.b;
                apax apaxVar = mrcVar3.e;
                if (!apaxVar.c()) {
                    mrcVar3.e = apag.mutableCopy(apaxVar);
                }
                aoyj.addAll(arrayList3, mrcVar3.e);
                apag s = createBuilder.s();
                s.getClass();
                ((uof) lqnVar.a.b()).a(upk.b("suggestion_send_message_listener_handler", (mrc) s, new uta(null, null, mra.b, null, null, null)));
                return arnb.a;
            case 5:
                arpl arplVar6 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    this.a = 1;
                    if (yyb.aB() == arplVar6) {
                        return arplVar6;
                    }
                }
                return upm.b();
            case 6:
                arpl arplVar7 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                    return obj;
                }
                aqil.P(obj);
                Object obj8 = this.b;
                Object obj9 = this.c;
                this.a = 1;
                sup supVar = new sup(sur.a);
                supVar.w("+loadEditHistory");
                supVar.d(new mvp(obj9, 11));
                apply = new nas(8).apply(sur.d);
                supVar.c((sul[]) apply);
                supVar.z((String) DesugarArrays.stream(new atkn[]{new atkn(sur.d.b, true)}).map(new sho(i)).collect(Collectors.joining(", ")));
                supVar.D(agoh.b(lgc.A(null, null, null, null, 15).b(), MessagesTable.c.a, (agmh) sur.d.e).a());
                alog cR = ((sun) supVar.b().n()).cR();
                cR.getClass();
                ArrayList arrayList4 = new ArrayList();
                alur it3 = cR.iterator();
                while (it3.hasNext()) {
                    suj sujVar = (suj) it3.next();
                    MessagesTable.BindData bindData = (MessagesTable.BindData) sujVar.al("messages", MessagesTable.BindData.class);
                    if (bindData == null) {
                        b = null;
                    } else {
                        lfl lflVar2 = (lfl) obj8;
                        Object obj10 = lflVar2.b;
                        String[] strArr = PartsTable.a;
                        aglz[] au = sujVar.au("parts", new PartsTable.BindData[0]);
                        au.getClass();
                        b = ((muu) obj10).b(bindData, alzz.bb(au), new BugleConversationId(bindData.z()), (ifs) lflVar2.c, (alor) lflVar2.d, mzx.a, null);
                        alur it4 = b.iterator();
                        it4.getClass();
                        while (it4.hasNext()) {
                            miz mizVar = (miz) it4.next();
                            mizVar.getClass();
                            sujVar.ao(4, "received_at_timestamp_ms");
                            Instant instant = sujVar.e;
                            instant.getClass();
                            ((mtb) mizVar).g = instant;
                        }
                    }
                    if (b != null) {
                        arrayList4.add(b);
                    }
                }
                alog aZ = alzz.aZ(aqjn.K(arrayList4));
                if (aZ == arplVar7) {
                    return arplVar7;
                }
                return aZ;
            case 7:
                arpl arplVar8 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                    return obj;
                }
                aqil.P(obj);
                Object obj11 = this.b;
                ?? r3 = this.c;
                this.a = 1;
                Object d = ((neh) obj11).d(r3, this);
                if (d == arplVar8) {
                    return arplVar8;
                }
                return d;
            case 8:
                arpl arplVar9 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                    m = obj;
                } else {
                    aqil.P(obj);
                    Object obj12 = this.c;
                    Object obj13 = this.b;
                    this.a = 1;
                    m = ((qxr) obj12).m((ConversationIdType) obj13, this);
                    if (m == arplVar9) {
                        return arplVar9;
                    }
                }
                if (!((Boolean) m).booleanValue()) {
                    return psk.HIDE;
                }
                sge a = sgh.a();
                a.w("getToolstoneState");
                apply2 = new prj(i).apply(sgh.d);
                sgb[] sgbVarArr = {(sgb) apply2};
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (((Integer) sgh.b.getOrDefault(sgbVarArr[0].toString(), -1)).intValue() > intValue) {
                    agnc.t("columnReference.toString()", intValue);
                }
                a.m(sgbVarArr);
                a.c(new nfc(this.b, 17));
                alog t = a.b().t();
                if (!t.isEmpty() && ((sga) t.get(0)).h() != psk.NOT_SET) {
                    if (((sga) t.get(0)).h() == psk.HIDE) {
                        Object e = psn.k.e();
                        e.getClass();
                        if (((Boolean) e).booleanValue()) {
                            return ((qxr) this.c).p(4, (ConversationIdType) this.b);
                        }
                        ((qxr) this.c).q(4, (ConversationIdType) this.b);
                        return psk.HIDE;
                    }
                    psk h2 = ((sga) t.get(0)).h();
                    h2.getClass();
                    return h2;
                }
                ((qxr) this.c).n((ConversationIdType) this.b);
                Object e2 = psn.f.e();
                e2.getClass();
                if (((Boolean) e2).booleanValue()) {
                    return psk.SHOW;
                }
                return psk.HIDE;
            case 9:
                arpl arplVar10 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                    return obj;
                }
                aqil.P(obj);
                Object obj14 = this.c;
                Object obj15 = this.b;
                this.a = 1;
                Object d2 = ((kkg) obj14).d((qfo) obj15, this);
                if (d2 == arplVar10) {
                    return arplVar10;
                }
                return d2;
            case 10:
                Object obj16 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    Object obj17 = this.b;
                    Object obj18 = this.c;
                    this.a = 1;
                    Object F5 = arro.F(((mlw) ((qnu) obj17).a.b()).a((BugleConversationId) obj18), this);
                    if (F5 != arpl.a) {
                        F5 = arnb.a;
                    }
                    if (F5 == obj16) {
                        return obj16;
                    }
                }
                return null;
            case 11:
                arpl arplVar11 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                    return obj;
                }
                aqil.P(obj);
                Object obj19 = this.c;
                Object obj20 = this.b;
                this.a = 1;
                Object b6 = ((qhg) obj19).b((qhl) obj20, this);
                if (b6 == arplVar11) {
                    return arplVar11;
                }
                return b6;
            case 12:
                arpl arplVar12 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                    return obj;
                }
                aqil.P(obj);
                Object obj21 = this.b;
                Object obj22 = this.c;
                this.a = 1;
                Object b7 = ((qho) obj21).b((qhl) obj22, this);
                if (b7 == arplVar12) {
                    return arplVar12;
                }
                return b7;
            case 13:
                arpl arplVar13 = arpl.a;
                int i3 = this.a;
                try {
                    if (i3 != 0) {
                        if (i3 != 1) {
                            aqil.P(obj);
                            qhq.a.m().q("Recovering by register refresh succeeds.");
                            return qhi.a;
                        }
                        aqil.P(obj);
                        F3 = obj;
                    } else {
                        aqil.P(obj);
                        Object obj23 = this.c;
                        if (obj23 instanceof qhp) {
                            qei qeiVar = ((qhp) obj23).a;
                            String str = qeiVar.d;
                            str.getClass();
                            if (str.length() > 0) {
                                akul d3 = ((qhq) this.b).c.d(qeiVar.d, 5);
                                d3.getClass();
                                this.a = 1;
                                F3 = arro.F(d3, this);
                                if (F3 == arplVar13) {
                                    return arplVar13;
                                }
                            } else {
                                throw new IllegalStateException("Recovering by register refresh but empty chat endpoint is found.");
                            }
                        } else {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    akul l2 = ((vbq) F3).l(vaz.FORCE_REFRESH);
                    this.a = 2;
                    if (arro.F(l2, this) == arplVar13) {
                        return arplVar13;
                    }
                    qhq.a.m().q("Recovering by register refresh succeeds.");
                    return qhi.a;
                } catch (Throwable th) {
                    if (vch.d(th)) {
                        ((alwl) ((alwl) qhq.a.i()).g(th)).q("Recovering by register refresh but fails with a transient error.");
                        return qhi.c;
                    }
                    ((alwl) ((alwl) qhq.a.i()).g(th)).q("Recovering by register refresh but fails with a permanent error.");
                    return qhi.d;
                }
            case 14:
                arpl arplVar14 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                    return obj;
                }
                aqil.P(obj);
                Object obj24 = this.b;
                Object obj25 = this.c;
                this.a = 1;
                qhq qhqVar = (qhq) obj24;
                Object q2 = arro.q(qhqVar.b, new mlg(qhqVar, (qhl) obj25, (arpe) null, 13), this);
                if (q2 == arplVar14) {
                    return arplVar14;
                }
                return q2;
            case 15:
                arpl arplVar15 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    this.c.a();
                    this.a = 1;
                    if (arwi.m(1000L, this) == arplVar15) {
                        return arplVar15;
                    }
                }
                ((arsb) this.b).a = null;
                return arnb.a;
            case 16:
                arpl arplVar16 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                    return obj;
                }
                aqil.P(obj);
                Object obj26 = this.c;
                ?? r32 = this.b;
                this.a = 1;
                Object m2 = ((qmj) obj26).m(r32, this);
                if (m2 == arplVar16) {
                    return arplVar16;
                }
                return m2;
            case 17:
                arpl arplVar17 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                    return obj;
                }
                aqil.P(obj);
                Object obj27 = this.c;
                ?? r33 = this.b;
                this.a = 1;
                Object n = ((qmj) obj27).n(r33, this);
                if (n == arplVar17) {
                    return arplVar17;
                }
                return n;
            case 18:
                arpl arplVar18 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                    return obj;
                }
                aqil.P(obj);
                Object obj28 = this.c;
                ?? r34 = this.b;
                this.a = 1;
                Object o2 = ((qmj) obj28).o(r34, this);
                if (o2 == arplVar18) {
                    return arplVar18;
                }
                return o2;
            case 19:
                arpl arplVar19 = arpl.a;
                int i4 = this.a;
                try {
                    try {
                        if (i4 != 0) {
                            if (i4 != 1) {
                                aqil.P(obj);
                                ((ahqr) ((qmw) this.c).f.b()).g(qld.g, null, ahqp.SUCCESS);
                                if (((oxg) ((qmw) this.c).h.b()).a() && !((Boolean) ((qmw) this.c).j.b()).booleanValue()) {
                                    ((lgg) ((qmw) this.c).i.b()).g(new qab(i));
                                }
                                return upm.b();
                            }
                            aqil.P(obj);
                            F4 = obj;
                        } else {
                            aqil.P(obj);
                            akul j3 = ((qmw) this.c).b.j(new qda(14));
                            this.a = 1;
                            F4 = arro.F(j3, this);
                            if (F4 == arplVar19) {
                                return arplVar19;
                            }
                        }
                        qln qlnVar = ((qlo) F4).d;
                        if (qlnVar == null) {
                            qlnVar = qln.a;
                        }
                        apct apctVar = qlnVar.d;
                        if (apctVar == null) {
                            apctVar = apct.a;
                        }
                        ((alwl) qmw.a.g()).t("Completed contacts import in %s", Duration.between(Instant.ofEpochMilli(apds.a(apctVar)), ((qmw) this.c).d.f()));
                        ((alwl) qmw.a.d()).q("Observing contacts changes and forcing sync");
                        ((qmw) this.c).c.b();
                        qnq qnqVar = ((qmw) this.c).c;
                        this.a = 2;
                        if (qnqVar.a(this) == arplVar19) {
                            return arplVar19;
                        }
                        ((ahqr) ((qmw) this.c).f.b()).g(qld.g, null, ahqp.SUCCESS);
                        if (((oxg) ((qmw) this.c).h.b()).a()) {
                            ((lgg) ((qmw) this.c).i.b()).g(new qab(i));
                        }
                        return upm.b();
                    } catch (Exception e3) {
                        if (!((oaz) ((qmw) this.c).e.b()).a() && ((Boolean) qlb.h.e()).booleanValue() && (!((Boolean) qlb.k.e()).booleanValue() || (((Boolean) qlb.k.e()).booleanValue() && qlm.c(e3)))) {
                            ((alwl) ((alwl) qmw.a.i()).g(e3)).q("Caught exception while force syncing contacts. Marking WorkQueueResult as failedRetry.");
                            if (!this.b.c()) {
                                ((qmw) this.c).j();
                            }
                            Object b8 = ((qmw) this.c).g.b();
                            b8.getClass();
                            qlm.d((mbl) b8, 4);
                            return upm.e();
                        }
                        throw e3;
                    }
                } catch (Exception e4) {
                    ((qmw) this.c).j();
                    Object b9 = ((qmw) this.c).g.b();
                    b9.getClass();
                    qlm.d((mbl) b9, 4);
                    throw e4;
                }
            default:
                arpl arplVar20 = arpl.a;
                int i5 = this.a;
                aqil.P(obj);
                if (i5 != 0) {
                    q = obj;
                } else {
                    alvw d4 = qsm.a.d();
                    d4.X(alwp.a, "BugleCME");
                    ((alvg) d4.h("com/google/android/apps/messaging/shared/core/destination/CachingDestinationManager$getDestination$2$1", "invokeSuspend", 56, "CachingDestinationManager.kt")).t("Cache miss fetching destination from token %s. Loading from database.", this.b);
                    qtc qtcVar = (qtc) ((qsm) this.c).c.b();
                    Set e5 = aqjn.e(this.b);
                    this.a = 1;
                    q = arro.q(qtcVar.b, new pze(e5, (arpe) null, 5), this);
                    if (q == arplVar20) {
                        return arplVar20;
                    }
                }
                qso qsoVar = (qso) aqjn.af((Iterable) q);
                ((qsm) this.c).b.b(qsoVar.c, qsoVar.a);
                return qsoVar;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, uns] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        switch (this.d) {
            case 0:
                return new mlg((BugleConversation) this.b, (mlh) this.c, arpeVar, 0);
            case 1:
                return new mlg((lru) this.c, (String) this.b, arpeVar, 1);
            case 2:
                return new mlg((mpu) this.c, (alog) this.b, arpeVar, 2);
            case 3:
                return new mlg((mpu) this.c, (mqy) this.b, arpeVar, 3);
            case 4:
                return new mlg((mra) this.c, (mzc) this.b, arpeVar, 4);
            case 5:
                return new mlg((mrd) this.b, (mrc) this.c, arpeVar, 5);
            case 6:
                return new mlg((lfl) this.b, (MessageId) this.c, arpeVar, 6);
            case 7:
                return new mlg((neh) this.b, (msh) this.c, arpeVar, 7);
            case 8:
                return new mlg((qxr) this.c, (ConversationIdType) this.b, arpeVar, 8);
            case 9:
                return new mlg((kkg) this.c, (qfo) this.b, arpeVar, 9);
            case 10:
                return new mlg((qnu) this.b, (BugleConversationId) this.c, arpeVar, 10);
            case 11:
                return new mlg((qhg) this.c, (qhl) this.b, arpeVar, 11);
            case 12:
                return new mlg((qho) this.b, (qhl) this.c, arpeVar, 12);
            case 13:
                return new mlg((qhq) this.b, (qhl) this.c, arpeVar, 13);
            case 14:
                return new mlg((qhq) this.b, (qhl) this.c, arpeVar, 14, (byte[]) null);
            case 15:
                return new mlg((arqg) this.c, (arsb) this.b, arpeVar, 15);
            case 16:
                return new mlg((qmj) this.c, (List) this.b, arpeVar, 16);
            case 17:
                return new mlg((qmj) this.c, (List) this.b, arpeVar, 17, (byte[]) null);
            case 18:
                return new mlg((qmj) this.c, (List) this.b, arpeVar, 18, (char[]) null);
            case 19:
                return new mlg((qmw) this.c, (uns) this.b, arpeVar, 19);
            default:
                return new mlg((qss) this.b, (qsm) this.c, arpeVar, 20);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlg(BugleConversation bugleConversation, mlh mlhVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = bugleConversation;
        this.c = mlhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlg(kkg kkgVar, qfo qfoVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = kkgVar;
        this.b = qfoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlg(lfl lflVar, MessageId messageId, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = lflVar;
        this.c = messageId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlg(lru lruVar, String str, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = lruVar;
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlg(mpu mpuVar, alog alogVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = mpuVar;
        this.b = alogVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlg(mpu mpuVar, mqy mqyVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = mpuVar;
        this.b = mqyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlg(mra mraVar, mzc mzcVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = mraVar;
        this.b = mzcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlg(mrd mrdVar, mrc mrcVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = mrdVar;
        this.c = mrcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlg(neh nehVar, msh mshVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = nehVar;
        this.c = mshVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlg(qhg qhgVar, qhl qhlVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = qhgVar;
        this.b = qhlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlg(qho qhoVar, qhl qhlVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = qhoVar;
        this.c = qhlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlg(qhq qhqVar, qhl qhlVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = qhqVar;
        this.c = qhlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlg(qhq qhqVar, qhl qhlVar, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.d = i;
        this.b = qhqVar;
        this.c = qhlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlg(qmj qmjVar, List list, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = qmjVar;
        this.b = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlg(qmj qmjVar, List list, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.d = i;
        this.c = qmjVar;
        this.b = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlg(qmj qmjVar, List list, arpe arpeVar, int i, char[] cArr) {
        super(2, arpeVar);
        this.d = i;
        this.c = qmjVar;
        this.b = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlg(qmw qmwVar, uns unsVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = qmwVar;
        this.b = unsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlg(qnu qnuVar, BugleConversationId bugleConversationId, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = qnuVar;
        this.c = bugleConversationId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlg(qss qssVar, qsm qsmVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = qssVar;
        this.c = qsmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlg(qxr qxrVar, ConversationIdType conversationIdType, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = qxrVar;
        this.b = conversationIdType;
    }
}
