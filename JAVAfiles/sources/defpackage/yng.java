package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yng extends arpw implements arqv {
    Object a;
    int b;
    final /* synthetic */ yni c;
    final /* synthetic */ ConversationIdType d;
    final /* synthetic */ MessageIdType e;
    final /* synthetic */ aiqj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yng(aiqj aiqjVar, yni yniVar, ConversationIdType conversationIdType, MessageIdType messageIdType, arpe arpeVar) {
        super(2, arpeVar);
        this.f = aiqjVar;
        this.c = yniVar;
        this.d = conversationIdType;
        this.e = messageIdType;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yng) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v50, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v35, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [armf, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Object obj2;
        MessageIdType messageIdType;
        Object obj3;
        Object obj4;
        aozy aozyVar;
        Object obj5;
        Object obj6;
        aozy aozyVar2;
        MessageIdType messageIdType2;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3;
        int i4;
        arpl arplVar = arpl.a;
        if (this.b != 0) {
            obj2 = this.a;
            aqil.P(obj);
        } else {
            aqil.P(obj);
            aiqj.t(this.c, this.d);
            aiqj.u(this.c, this.d);
            this.f.r(this.c, this.e, this.d);
            this.f.q(this.c, this.d);
            this.f.s(this.c, null, this.d);
            this.f.p(this.c, this.d);
            aiqj aiqjVar = this.f;
            yni yniVar = this.c;
            ConversationIdType conversationIdType = this.d;
            if (yniVar.h == null) {
                ynr ynrVar = (ynr) aiqjVar.h.b();
                ypm ypmVar = yniVar.d;
                if (ypmVar != null) {
                    messageIdType = ypmVar.a;
                } else {
                    messageIdType = null;
                }
                ynt b = ynrVar.b(conversationIdType, messageIdType);
                if (b == null) {
                    yniVar.h = arnv.a;
                } else {
                    yniVar.h = aqjn.y(b);
                }
            }
            aozy createBuilder = amzo.a.createBuilder();
            aozy createBuilder2 = amzm.a.createBuilder();
            boolean c = ((yyt) this.f.d.b()).c();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            amzm amzmVar = (amzm) createBuilder2.b;
            amzmVar.b |= 1;
            amzmVar.c = c;
            boolean c2 = ((lrf) this.f.b.b()).c();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            amzm amzmVar2 = (amzm) createBuilder2.b;
            amzmVar2.b |= 2;
            amzmVar2.d = c2;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amzo amzoVar = (amzo) createBuilder.b;
            amzm amzmVar3 = (amzm) createBuilder2.s();
            amzmVar3.getClass();
            amzoVar.i = amzmVar3;
            amzoVar.b |= 16;
            aiqj aiqjVar2 = this.f;
            ConversationIdType conversationIdType2 = this.d;
            yni yniVar2 = this.c;
            this.a = createBuilder;
            this.b = 1;
            if (aiqjVar2.v(createBuilder, conversationIdType2, yniVar2, this) == arplVar) {
                return arplVar;
            }
            obj2 = createBuilder;
        }
        yni yniVar3 = this.c;
        aozy createBuilder3 = amzi.a.createBuilder();
        createBuilder3.getClass();
        List list = yniVar3.e;
        list.getClass();
        if (!list.isEmpty()) {
            int size = list.size();
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            amzi amziVar = (amzi) createBuilder3.b;
            amziVar.b |= 4;
            amziVar.e = size;
            if (list.isEmpty()) {
                i4 = 0;
            } else {
                Iterator it = list.iterator();
                i4 = 0;
                while (it.hasNext()) {
                    if (((ParticipantsTable.BindData) it.next()).N() != null && (i4 = i4 + 1) < 0) {
                        aqjn.F();
                    }
                }
            }
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            amzi amziVar2 = (amzi) createBuilder3.b;
            amziVar2.b |= 8;
            amziVar2.f = i4;
        }
        List list2 = yniVar3.c;
        list2.getClass();
        if (!list2.isEmpty()) {
            if (list2.isEmpty()) {
                i2 = 0;
            } else {
                Iterator it2 = list2.iterator();
                i2 = 0;
                while (it2.hasNext()) {
                    if (((ypm) it2.next()).d && (i2 = i2 + 1) < 0) {
                        aqjn.F();
                    }
                }
            }
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            amzi amziVar3 = (amzi) createBuilder3.b;
            amziVar3.b |= 16;
            amziVar3.g = i2;
            if (list2.isEmpty()) {
                i3 = 0;
            } else {
                Iterator it3 = list2.iterator();
                i3 = 0;
                while (it3.hasNext()) {
                    if (((ypm) it3.next()).e && (i3 = i3 + 1) < 0) {
                        aqjn.F();
                    }
                }
            }
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            amzi amziVar4 = (amzi) createBuilder3.b;
            amziVar4.b |= 32;
            amziVar4.h = i3;
        }
        ypm ypmVar2 = yniVar3.d;
        if (ypmVar2 != null) {
            if (true != ypmVar2.g) {
                i = 3;
            } else {
                i = 4;
            }
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            amzi amziVar5 = (amzi) createBuilder3.b;
            amziVar5.d = a.an(i);
            amziVar5.b |= 2;
        }
        ParticipantsTable.BindData bindData = yniVar3.f;
        if (bindData != null && vcp.k(bindData)) {
            amzh amzhVar = amzh.RBM;
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            amzi amziVar6 = (amzi) createBuilder3.b;
            amziVar6.c = amzhVar.a();
            amziVar6.b |= 1;
        } else if (ypmVar2 != null) {
            amzh N = yyb.N(ypmVar2.c);
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            amzi amziVar7 = (amzi) createBuilder3.b;
            amziVar7.c = N.a();
            amziVar7.b |= 1;
        }
        aozy createBuilder4 = amzt.a.createBuilder();
        createBuilder4.getClass();
        long j = yniVar3.a;
        List list3 = yniVar3.b;
        list3.getClass();
        ypm ypmVar3 = yniVar3.d;
        if (ypmVar3 != null) {
            long j2 = j - ypmVar3.h;
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            amzt amztVar = (amzt) createBuilder4.b;
            amztVar.b |= 1;
            amztVar.c = j2;
        }
        alog alogVar = (alog) list3;
        alur it4 = alogVar.iterator();
        while (true) {
            if (it4.hasNext()) {
                obj3 = it4.next();
                if (((swl) obj3).l() != 0) {
                    break;
                }
            } else {
                obj3 = null;
                break;
            }
        }
        alsx alsxVar = (alsx) list3;
        swl swlVar = (swl) obj3;
        alur listIterator = alogVar.listIterator(alsxVar.c);
        while (true) {
            if (listIterator.hasPrevious()) {
                obj4 = listIterator.previous();
                if (((swl) obj4).l() != 0) {
                    break;
                }
            } else {
                obj4 = null;
                break;
            }
        }
        swl swlVar2 = (swl) obj4;
        if (swlVar != null && swlVar2 != null) {
            aozyVar = createBuilder3;
            long l = j - swlVar.l();
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            amzt amztVar2 = (amzt) createBuilder4.b;
            amztVar2.b |= 2;
            amztVar2.d = l;
            long l2 = j - swlVar2.l();
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            amzt amztVar3 = (amzt) createBuilder4.b;
            amztVar3.b |= 4;
            amztVar3.e = l2;
        } else {
            aozyVar = createBuilder3;
        }
        List B = aqjn.B(apzk.ALLOW, apzk.SHOW_WARNING, apzk.MOVE_TO_SPAM_FOLDER);
        alur it5 = alogVar.iterator();
        while (true) {
            if (it5.hasNext()) {
                obj5 = it5.next();
                if (B.contains(((swl) obj5).p())) {
                    break;
                }
            } else {
                obj5 = null;
                break;
            }
        }
        swl swlVar3 = (swl) obj5;
        alur listIterator2 = alogVar.listIterator(alsxVar.c);
        while (true) {
            if (listIterator2.hasPrevious()) {
                obj6 = listIterator2.previous();
                if (B.contains(((swl) obj6).p())) {
                    break;
                }
            } else {
                obj6 = null;
                break;
            }
        }
        swl swlVar4 = (swl) obj6;
        if (swlVar3 != null && swlVar4 != null) {
            long l3 = j - swlVar3.l();
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            amzt amztVar4 = (amzt) createBuilder4.b;
            amztVar4.b |= 8;
            amztVar4.f = l3;
            long l4 = j - swlVar4.l();
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            amzt amztVar5 = (amzt) createBuilder4.b;
            amztVar5.b |= 16;
            amztVar5.g = l4;
        }
        apag s = createBuilder4.s();
        s.getClass();
        amzt amztVar6 = (amzt) s;
        if (!d.F(amztVar6, amzt.a)) {
            aozyVar2 = aozyVar;
            if (!aozyVar2.b.isMutable()) {
                aozyVar2.u();
            }
            amzi amziVar8 = (amzi) aozyVar2.b;
            amziVar8.i = amztVar6;
            amziVar8.b |= 64;
        } else {
            aozyVar2 = aozyVar;
        }
        apag s2 = aozyVar2.s();
        s2.getClass();
        amzi amziVar9 = (amzi) s2;
        if (!d.F(amziVar9, amzi.a)) {
            aozy aozyVar3 = (aozy) obj2;
            if (!aozyVar3.b.isMutable()) {
                aozyVar3.u();
            }
            amzo amzoVar2 = (amzo) aozyVar3.b;
            amzo amzoVar3 = amzo.a;
            amzoVar2.h = amziVar9;
            amzoVar2.b |= 8;
        }
        aiqj aiqjVar3 = this.f;
        ParticipantsTable.BindData bindData2 = this.c.f;
        if (bindData2 != null) {
            alog o = ((lfl) aiqjVar3.k.b()).o(alog.r(((msk) aiqjVar3.f.b()).q(bindData2)));
            o.getClass();
            amgg amggVar = (amgg) aqjn.ag(o);
            aozy createBuilder5 = amzs.a.createBuilder();
            amggVar.getClass();
            amzr O = yyb.O(amggVar);
            if (!createBuilder5.b.isMutable()) {
                createBuilder5.u();
            }
            amzs amzsVar = (amzs) createBuilder5.b;
            amzsVar.c = O.a();
            amzsVar.b |= 1;
            if (bindData2.N() != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!createBuilder5.b.isMutable()) {
                createBuilder5.u();
            }
            amzs amzsVar2 = (amzs) createBuilder5.b;
            amzsVar2.b |= 2;
            amzsVar2.d = z3;
            aozy aozyVar4 = (aozy) obj2;
            if (!aozyVar4.b.isMutable()) {
                aozyVar4.u();
            }
            amzo amzoVar4 = (amzo) aozyVar4.b;
            amzs amzsVar3 = (amzs) createBuilder5.s();
            amzo amzoVar5 = amzo.a;
            amzsVar3.getClass();
            amzoVar4.j = amzsVar3;
            amzoVar4.b |= 32;
        }
        aiqj aiqjVar4 = this.f;
        aozy createBuilder6 = amzj.a.createBuilder();
        createBuilder6.getClass();
        boolean q = ((yaq) ((xyt) aiqjVar4.g.b()).a()).q();
        if (!createBuilder6.b.isMutable()) {
            createBuilder6.u();
        }
        amzj amzjVar = (amzj) createBuilder6.b;
        amzjVar.b |= 1;
        amzjVar.c = q;
        apag s3 = createBuilder6.s();
        s3.getClass();
        amzj amzjVar2 = (amzj) s3;
        aozy aozyVar5 = (aozy) obj2;
        if (!aozyVar5.b.isMutable()) {
            aozyVar5.u();
        }
        amzo amzoVar6 = (amzo) aozyVar5.b;
        amzo amzoVar7 = amzo.a;
        amzoVar6.k = amzjVar2;
        amzoVar6.b |= 64;
        yni yniVar4 = this.c;
        aozy createBuilder7 = amzk.a.createBuilder();
        createBuilder7.getClass();
        ParticipantsTable.BindData bindData3 = yniVar4.f;
        if (bindData3 != null) {
            ypj G = yyb.G(bindData3.m());
            if (bindData3.T() && G.c()) {
                z = true;
            } else {
                z = false;
            }
            if (!createBuilder7.b.isMutable()) {
                createBuilder7.u();
            }
            amzk amzkVar = (amzk) createBuilder7.b;
            amzkVar.b |= 1;
            amzkVar.c = z;
            boolean R = bindData3.R();
            if (!createBuilder7.b.isMutable()) {
                createBuilder7.u();
            }
            amzk amzkVar2 = (amzk) createBuilder7.b;
            amzkVar2.b |= 2;
            amzkVar2.d = R;
            if (bindData3.T() && G.b()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!createBuilder7.b.isMutable()) {
                createBuilder7.u();
            }
            amzk amzkVar3 = (amzk) createBuilder7.b;
            amzkVar3.b |= 4;
            amzkVar3.e = z2;
        }
        tqc tqcVar = yniVar4.g;
        if (tqcVar != null) {
            boolean contains = aqjn.B(tqc.BLOCKED_FOLDER, tqc.SPAM_FOLDER).contains(tqcVar);
            if (!createBuilder7.b.isMutable()) {
                createBuilder7.u();
            }
            amzk amzkVar4 = (amzk) createBuilder7.b;
            amzkVar4.b |= 8;
            amzkVar4.f = contains;
        }
        List list4 = yniVar4.b;
        ypm ypmVar4 = yniVar4.d;
        if (ypmVar4 != null) {
            messageIdType2 = ypmVar4.a;
        } else {
            messageIdType2 = null;
        }
        if (list4 != null) {
            ArrayList<swl> arrayList = new ArrayList();
            alur it6 = ((alog) list4).iterator();
            while (it6.hasNext()) {
                E next = it6.next();
                swl swlVar5 = (swl) next;
                if (messageIdType2 != null) {
                    swlVar5.ao(1, "message_id");
                    if (d.F(swlVar5.b, messageIdType2)) {
                    }
                }
                arrayList.add(next);
            }
            for (swl swlVar6 : arrayList) {
                aozy createBuilder8 = amze.a.createBuilder();
                ypi ypiVar = ypi.a;
                amzn a = yyb.H(swlVar6.k()).a();
                if (!createBuilder8.b.isMutable()) {
                    createBuilder8.u();
                }
                amze amzeVar = (amze) createBuilder8.b;
                amzeVar.c = a.a();
                amzeVar.b |= 1;
                float h = swlVar6.h();
                if (!createBuilder8.b.isMutable()) {
                    createBuilder8.u();
                }
                amze amzeVar2 = (amze) createBuilder8.b;
                amzeVar2.b |= 8;
                amzeVar2.f = h;
                if (swlVar6.n() != amzp.UNKNOWN_SPAM_VERDICT) {
                    amzp n = swlVar6.n();
                    if (!createBuilder8.b.isMutable()) {
                        createBuilder8.u();
                    }
                    amze amzeVar3 = (amze) createBuilder8.b;
                    amzeVar3.e = n.a();
                    amzeVar3.b |= 4;
                }
                if (swlVar6.p() != apzk.UNKNOWN_SPAM_VERDICT_ENFORCEMENT_ACTION) {
                    apzk p = swlVar6.p();
                    if (!createBuilder8.b.isMutable()) {
                        createBuilder8.u();
                    }
                    amze amzeVar4 = (amze) createBuilder8.b;
                    amzeVar4.g = p.a();
                    amzeVar4.b |= 16;
                }
                swlVar6.ao(10, "action_contributors");
                ypj G2 = yyb.G(swlVar6.k);
                if (!G2.e()) {
                    Set set = G2.a;
                    ArrayList arrayList2 = new ArrayList(aqjn.J(set, 10));
                    Iterator it7 = set.iterator();
                    while (it7.hasNext()) {
                        arrayList2.add(((ypi) it7.next()).a());
                    }
                    createBuilder8.aN(arrayList2);
                }
                if (swlVar6.o() != amzq.UNKNOWN_SPAM_ERROR) {
                    amzq o2 = swlVar6.o();
                    if (!createBuilder8.b.isMutable()) {
                        createBuilder8.u();
                    }
                    amze amzeVar5 = (amze) createBuilder8.b;
                    amzeVar5.j = o2.a();
                    amzeVar5.b |= 64;
                }
                aozy createBuilder9 = amzg.a.createBuilder();
                amzf m = swlVar6.m();
                if (!createBuilder9.b.isMutable()) {
                    createBuilder9.u();
                }
                amzg amzgVar = (amzg) createBuilder9.b;
                amzgVar.e = m.a();
                amzgVar.b |= 1;
                if (swlVar6.m() == amzf.RECLASSIFICATION) {
                    aozy createBuilder10 = amzl.a.createBuilder();
                    swlVar6.ao(12, "reclassification_index");
                    int i5 = swlVar6.m;
                    if (!createBuilder10.b.isMutable()) {
                        createBuilder10.u();
                    }
                    amzl amzlVar = (amzl) createBuilder10.b;
                    amzlVar.b |= 1;
                    amzlVar.c = i5;
                    if (!createBuilder9.b.isMutable()) {
                        createBuilder9.u();
                    }
                    amzg amzgVar2 = (amzg) createBuilder9.b;
                    amzl amzlVar2 = (amzl) createBuilder10.s();
                    amzlVar2.getClass();
                    amzgVar2.d = amzlVar2;
                    amzgVar2.c = 2;
                }
                if (!createBuilder8.b.isMutable()) {
                    createBuilder8.u();
                }
                amze amzeVar6 = (amze) createBuilder8.b;
                amzg amzgVar3 = (amzg) createBuilder9.s();
                amzgVar3.getClass();
                amzeVar6.d = amzgVar3;
                amzeVar6.b |= 2;
                if (!createBuilder7.b.isMutable()) {
                    createBuilder7.u();
                }
                amzk amzkVar5 = (amzk) createBuilder7.b;
                amze amzeVar7 = (amze) createBuilder8.s();
                amzeVar7.getClass();
                apax apaxVar = amzkVar5.g;
                if (!apaxVar.c()) {
                    amzkVar5.g = apag.mutableCopy(apaxVar);
                }
                amzkVar5.g.add(amzeVar7);
            }
        }
        apag s4 = createBuilder7.s();
        s4.getClass();
        if (!d.F((amzk) s4, amzk.a)) {
            if (!aozyVar5.b.isMutable()) {
                aozyVar5.u();
            }
            amzo amzoVar8 = (amzo) aozyVar5.b;
            amzk amzkVar6 = (amzk) createBuilder7.s();
            amzkVar6.getClass();
            amzoVar8.l = amzkVar6;
            amzoVar8.b |= 128;
        }
        return obj2;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new yng(this.f, this.c, this.d, this.e, arpeVar);
    }
}
