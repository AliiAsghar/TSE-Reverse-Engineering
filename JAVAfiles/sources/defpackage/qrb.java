package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qrb {
    public static final utz a = uuh.q(185945909);
    public final armf b;
    public final usk c;
    private final anen d;
    private final qxr e;

    public qrb(qxr qxrVar, usk uskVar, anen anenVar, armf armfVar) {
        this.e = qxrVar;
        this.c = uskVar;
        this.d = anenVar;
        this.b = armfVar;
    }

    public static akul a(final qra qraVar, final ConversationIdType conversationIdType) {
        if (conversationIdType.b()) {
            return aktp.ag(qqz.a());
        }
        return aktp.ai(new Callable() { // from class: qqy
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v61, types: [java.util.List, java.lang.Object] */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Optional empty;
                qra qraVar2 = qra.this;
                uie uieVar = (uie) qraVar2.f.b();
                ConversationIdType conversationIdType2 = conversationIdType;
                rto m = uieVar.m(conversationIdType2);
                List K = ((rtz) qraVar2.e.b()).K(conversationIdType2);
                aozy createBuilder = amqz.a.createBuilder();
                aozy createBuilder2 = amrf.a.createBuilder();
                long j = conversationIdType2.a;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amqz amqzVar = (amqz) createBuilder.b;
                amqzVar.b |= 1;
                amqzVar.c = j;
                if (m == null) {
                    return new qqz((amqz) createBuilder.s(), (amrf) createBuilder2.s());
                }
                long cE = yyb.cE(m.h());
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amqz amqzVar2 = (amqz) createBuilder.b;
                amqzVar2.b |= 2;
                amqzVar2.d = cE;
                if (((Boolean) qra.b.e()).booleanValue() && m.h().c() && ((wyj) qraVar2.g.b()).f()) {
                    akrh e = aktp.e("ConversationInfoCreator#populateTelephonyThreadRecipients");
                    try {
                        xhv h = m.h();
                        if (!((wyj) qraVar2.g.b()).f()) {
                            empty = Optional.empty();
                        } else if (h.d()) {
                            empty = Optional.empty();
                        } else {
                            try {
                                empty = ((wzs) qraVar2.i.b()).A(h);
                            } catch (Throwable th) {
                                ((alwl) ((alwl) qra.a.a(Level.WARNING).g(th)).h("com/google/android/apps/messaging/shared/conversation/match/logging/ConversationInfoCreator", "getTelephonyThreadRecipients", BasePaymentResult.ERROR_REQUEST_FAILED, "ConversationInfoCreator.java")).q("Unable to iterate through canonical recipients");
                                empty = Optional.empty();
                            }
                        }
                        if (!empty.isEmpty()) {
                            ?? r0 = empty.get();
                            int size = r0.size();
                            for (int i = 0; i < size; i++) {
                                qqo a2 = qraVar2.h.a(albo.ag(((msh) r0.get(i)).m()));
                                amqw a3 = qra.a(a2);
                                if (!createBuilder.b.isMutable()) {
                                    createBuilder.u();
                                }
                                amqz amqzVar3 = (amqz) createBuilder.b;
                                a3.getClass();
                                apax apaxVar = amqzVar3.h;
                                if (!apaxVar.c()) {
                                    amqzVar3.h = apag.mutableCopy(apaxVar);
                                }
                                amqzVar3.h.add(a3);
                                amri b = qra.b(a2);
                                if (!createBuilder2.b.isMutable()) {
                                    createBuilder2.u();
                                }
                                amrf amrfVar = (amrf) createBuilder2.b;
                                b.getClass();
                                apax apaxVar2 = amrfVar.c;
                                if (!apaxVar2.c()) {
                                    amrfVar.c = apag.mutableCopy(apaxVar2);
                                }
                                amrfVar.c.add(b);
                            }
                        }
                        e.close();
                    } finally {
                    }
                }
                if (m.G() == 2) {
                    String t = m.t();
                    if (t == null) {
                        t = "";
                    }
                    aozy createBuilder3 = amre.a.createBuilder();
                    aozy createBuilder4 = amqw.a.createBuilder();
                    aozy createBuilder5 = amqy.a.createBuilder();
                    String b2 = qraVar2.h.b(t);
                    if (!createBuilder5.b.isMutable()) {
                        createBuilder5.u();
                    }
                    amqy amqyVar = (amqy) createBuilder5.b;
                    amqyVar.b |= 1;
                    amqyVar.c = b2;
                    if (!createBuilder4.b.isMutable()) {
                        createBuilder4.u();
                    }
                    amqw amqwVar = (amqw) createBuilder4.b;
                    amqy amqyVar2 = (amqy) createBuilder5.s();
                    amqyVar2.getClass();
                    amqwVar.d = amqyVar2;
                    amqwVar.c = 4;
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    amre amreVar = (amre) createBuilder3.b;
                    amqw amqwVar2 = (amqw) createBuilder4.s();
                    amqwVar2.getClass();
                    amreVar.c = amqwVar2;
                    amreVar.b |= 1;
                    createBuilder.bv(createBuilder3);
                } else {
                    alur it = ((alog) K).iterator();
                    while (it.hasNext()) {
                        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
                        aozy createBuilder6 = amre.a.createBuilder();
                        String O = bindData.O();
                        if (O != null) {
                            amqw a4 = qra.a(qraVar2.h.a(O));
                            if (!createBuilder6.b.isMutable()) {
                                createBuilder6.u();
                            }
                            amre amreVar2 = (amre) createBuilder6.b;
                            a4.getClass();
                            amreVar2.c = a4;
                            amreVar2.b |= 1;
                        }
                        String P = bindData.P();
                        if (P != null) {
                            amqw a5 = qra.a(qraVar2.h.a(P));
                            if (!createBuilder6.b.isMutable()) {
                                createBuilder6.u();
                            }
                            amre amreVar3 = (amre) createBuilder6.b;
                            a5.getClass();
                            amreVar3.d = a5;
                            amreVar3.b |= 2;
                        }
                        if (bindData.n() == 1) {
                            Optional d = qraVar2.h.d(yyb.cT(bindData));
                            d.isPresent();
                            aozy createBuilder7 = amqw.a.createBuilder();
                            Object obj = d.get();
                            if (!createBuilder7.b.isMutable()) {
                                createBuilder7.u();
                            }
                            amqw amqwVar3 = (amqw) createBuilder7.b;
                            amqwVar3.d = obj;
                            amqwVar3.c = 5;
                            amqw amqwVar4 = (amqw) createBuilder7.t();
                            if (!createBuilder6.b.isMutable()) {
                                createBuilder6.u();
                            }
                            amre amreVar4 = (amre) createBuilder6.b;
                            amqwVar4.getClass();
                            amqw amqwVar5 = amreVar4.c;
                            if (amqwVar5 != null && amqwVar5 != amqw.a) {
                                aozy createBuilder8 = amqw.a.createBuilder(amqwVar5);
                                createBuilder8.w(amqwVar4);
                                amreVar4.c = (amqw) createBuilder8.t();
                            } else {
                                amreVar4.c = amqwVar4;
                            }
                            amreVar4.b |= 1;
                        }
                        aozy createBuilder9 = amrg.a.createBuilder();
                        String O2 = bindData.O();
                        if (O2 != null) {
                            amri b3 = qra.b(qraVar2.h.a(O2));
                            if (!createBuilder9.b.isMutable()) {
                                createBuilder9.u();
                            }
                            amrg amrgVar = (amrg) createBuilder9.b;
                            b3.getClass();
                            amrgVar.d = b3;
                            amrgVar.b |= 2;
                        }
                        String P2 = bindData.P();
                        if (P2 != null) {
                            amri b4 = qra.b(qraVar2.h.a(P2));
                            if (!createBuilder9.b.isMutable()) {
                                createBuilder9.u();
                            }
                            amrg amrgVar2 = (amrg) createBuilder9.b;
                            b4.getClass();
                            amrgVar2.c = b4;
                            amrgVar2.b |= 1;
                        }
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        amrf amrfVar2 = (amrf) createBuilder2.b;
                        amrg amrgVar3 = (amrg) createBuilder9.s();
                        amrgVar3.getClass();
                        apax apaxVar3 = amrfVar2.b;
                        if (!apaxVar3.c()) {
                            amrfVar2.b = apag.mutableCopy(apaxVar3);
                        }
                        amrfVar2.b.add(amrgVar3);
                        createBuilder.bv(createBuilder6);
                    }
                }
                int c = qra.c(m);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amqz amqzVar4 = (amqz) createBuilder.b;
                amqzVar4.e = c - 1;
                amqzVar4.b |= 4;
                boolean R = m.R();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amqz amqzVar5 = (amqz) createBuilder.b;
                amqzVar5.b |= 8;
                amqzVar5.f = R;
                return new qqz((amqz) createBuilder.s(), (amrf) createBuilder2.s());
            }
        }, qraVar.d);
    }

    public final akul b(ConversationIdType conversationIdType, utz utzVar, amra amraVar) {
        return aktp.ah(new eex((Object) this, (Object) conversationIdType, (Object) utzVar, (Enum) amraVar, 15), this.d);
    }

    public final akul c(ConversationIdType conversationIdType, ConversationIdType conversationIdType2, ConversationIdType conversationIdType3, alog alogVar, amra amraVar) {
        ConversationIdType conversationIdType4;
        if (!conversationIdType.b()) {
            conversationIdType4 = conversationIdType3;
            if (conversationIdType.equals(conversationIdType3)) {
                conversationIdType4 = ruy.a;
            }
        } else {
            conversationIdType4 = conversationIdType3;
        }
        d.s(!conversationIdType.equals(conversationIdType2));
        qxr qxrVar = this.e;
        usk uskVar = this.c;
        qqq b = qxrVar.b();
        qra g = uskVar.g(b);
        akul a2 = a(g, conversationIdType);
        akul a3 = a(g, conversationIdType2);
        akul a4 = a(g, conversationIdType4);
        Stream map = Collection.EL.stream(alogVar).map(new qcr(b, 19));
        int i = alog.d;
        return aktp.ap(a2, a3, a4).h(new irk(this, a2, a3, a4, (alog) map.collect(alls.a), amraVar, 2), this.d);
    }

    public final akul d(ConversationIdType conversationIdType, Runnable runnable, amra amraVar) {
        qra g = this.c.g(this.e.b());
        akul a2 = a(g, conversationIdType);
        akul i = a2.i(new prf(runnable, 11), this.d).i(new qdl(g, conversationIdType, 7), this.d);
        return aktp.ap(a2, i).h(new imh((Object) this, (Object) a2, (Object) i, (Object) amraVar, 3), this.d);
    }

    public final void e(qqz qqzVar, qqz qqzVar2, qqz qqzVar3, alog alogVar, amra amraVar) {
        int i;
        aozy createBuilder = amrb.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amqz amqzVar = qqzVar.a;
        apag apagVar = createBuilder.b;
        amrb amrbVar = (amrb) apagVar;
        amrbVar.f = amqzVar;
        amrbVar.b |= 16;
        amqz amqzVar2 = qqzVar2.a;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amrb amrbVar2 = (amrb) createBuilder.b;
        amrbVar2.h = amqzVar2;
        amrbVar2.b |= 64;
        Stream map = Collection.EL.stream(alogVar).map(new qqi(16));
        int i2 = alog.d;
        Iterable iterable = (Iterable) map.collect(alls.a);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amrb amrbVar3 = (amrb) createBuilder.b;
        apax apaxVar = amrbVar3.i;
        if (!apaxVar.c()) {
            amrbVar3.i = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(iterable, amrbVar3.i);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amrb amrbVar4 = (amrb) apagVar2;
        amrbVar4.d = 1;
        amrbVar4.b |= 2;
        if (1 != (qqzVar2.a.b & 1)) {
            i = 3;
        } else {
            i = 2;
        }
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        amrb amrbVar5 = (amrb) apagVar3;
        amrbVar5.e = i - 1;
        amrbVar5.b |= 8;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        apag apagVar4 = createBuilder.b;
        amrb amrbVar6 = (amrb) apagVar4;
        amrbVar6.c = amraVar.n;
        amrbVar6.b |= 1;
        amqz amqzVar3 = qqzVar3.a;
        if ((amqzVar3.b & 1) != 0) {
            if (!apagVar4.isMutable()) {
                createBuilder.u();
            }
            amrb amrbVar7 = (amrb) createBuilder.b;
            amrbVar7.g = amqzVar3;
            amrbVar7.b |= 32;
        }
        aozy createBuilder2 = amrh.a.createBuilder();
        amrf amrfVar = qqzVar.b;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar5 = createBuilder2.b;
        amrh amrhVar = (amrh) apagVar5;
        amrhVar.d = amrfVar;
        amrhVar.b |= 2;
        amrf amrfVar2 = qqzVar2.b;
        if (!apagVar5.isMutable()) {
            createBuilder2.u();
        }
        amrh amrhVar2 = (amrh) createBuilder2.b;
        amrhVar2.e = amrfVar2;
        amrhVar2.b |= 4;
        Iterable iterable2 = (Iterable) Collection.EL.stream(alogVar).map(new qqi(17)).collect(alls.a);
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amrh amrhVar3 = (amrh) createBuilder2.b;
        apax apaxVar2 = amrhVar3.f;
        if (!apaxVar2.c()) {
            amrhVar3.f = apag.mutableCopy(apaxVar2);
        }
        aoyj.addAll(iterable2, amrhVar3.f);
        Collection.EL.stream(qqzVar.a.g).map(new qqi(15)).findFirst().ifPresent(new qdm(createBuilder2, 7));
        maq maqVar = (maq) this.b.b();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_CONVERSATION_MATCHING;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        aozy createBuilder3 = amfj.a.createBuilder();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        amfj amfjVar = (amfj) createBuilder3.b;
        amrb amrbVar8 = (amrb) createBuilder.s();
        amrbVar8.getClass();
        amfjVar.c = amrbVar8;
        amfjVar.b = 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amfj amfjVar2 = (amfj) createBuilder3.s();
        amfjVar2.getClass();
        amfrVar2.aD = amfjVar2;
        amfrVar2.e |= 131072;
        maqVar.j(amfqVar);
        maq maqVar2 = (maq) this.b.b();
        amfq amfqVar2 = (amfq) amfr.a.createBuilder();
        amfp amfpVar2 = amfp.BUGLE_CONVERSATION_MATCHING;
        if (!amfqVar2.b.isMutable()) {
            amfqVar2.u();
        }
        amfr amfrVar3 = (amfr) amfqVar2.b;
        amfrVar3.i = amfpVar2.dg;
        amfrVar3.b |= 1;
        aozy createBuilder4 = amfj.a.createBuilder();
        if (!createBuilder4.b.isMutable()) {
            createBuilder4.u();
        }
        amfj amfjVar3 = (amfj) createBuilder4.b;
        amrh amrhVar4 = (amrh) createBuilder2.s();
        amrhVar4.getClass();
        amfjVar3.c = amrhVar4;
        amfjVar3.b = 2;
        if (!amfqVar2.b.isMutable()) {
            amfqVar2.u();
        }
        amfr amfrVar4 = (amfr) amfqVar2.b;
        amfj amfjVar4 = (amfj) createBuilder4.s();
        amfjVar4.getClass();
        amfrVar4.aD = amfjVar4;
        amfrVar4.e |= 131072;
        maqVar2.n(amfqVar2);
    }
}
