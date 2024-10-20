package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vtg extends arpw implements arqv {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ vth f;
    final /* synthetic */ qez g;
    final /* synthetic */ ConversationIdType h;
    final /* synthetic */ aplo i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtg(vth vthVar, qez qezVar, ConversationIdType conversationIdType, aplo aploVar, arpe arpeVar) {
        super(2, arpeVar);
        this.f = vthVar;
        this.g = qezVar;
        this.h = conversationIdType;
        this.i = aploVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vtg) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [msh] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        vth vthVar;
        String str;
        Object obj5;
        ?? r6;
        int i;
        boolean z;
        String str2;
        qei qeiVar;
        Optional i2;
        arpl arplVar = arpl.a;
        if (this.e != 0) {
            obj4 = this.d;
            obj3 = this.c;
            obj2 = this.b;
            ?? r4 = this.a;
            aqil.P(obj);
            vthVar = r4;
        } else {
            aqil.P(obj);
            vth vthVar2 = this.f;
            obj2 = this.g;
            obj3 = this.h;
            obj3.getClass();
            aplo aploVar = this.i;
            this.a = vthVar2;
            this.b = obj2;
            this.c = obj3;
            this.d = aploVar;
            this.e = 1;
            Object a = vthVar2.a(this);
            if (a != arplVar) {
                obj4 = aploVar;
                obj = a;
                vthVar = vthVar2;
            } else {
                return arplVar;
            }
        }
        obj.getClass();
        alog alogVar = (alog) obj;
        alwo alwoVar = vth.a;
        vth vthVar3 = vthVar;
        List aq = ((rtz) vthVar3.f.b()).aq((ConversationIdType) obj3);
        Set o = ((adjc) vthVar3.c.b()).o();
        ArrayList arrayList = new ArrayList(aqjn.J(o, 10));
        Iterator it = o.iterator();
        while (it.hasNext()) {
            arrayList.add(((psq) vthVar3.d.b()).c(((adit) it.next()).a));
        }
        Set aE = aqjn.aE(arrayList);
        if (!vthVar3.h.a()) {
            alogVar = (alog) vthVar3.e.a().c();
        }
        alogVar.getClass();
        Iterator it2 = alogVar.iterator();
        while (true) {
            str = null;
            if (it2.hasNext()) {
                obj5 = it2.next();
                if (((nfw) obj5).p()) {
                    break;
                }
            } else {
                obj5 = null;
                break;
            }
        }
        nfw nfwVar = (nfw) obj5;
        if (nfwVar != null && (i2 = nfwVar.i()) != null) {
            r6 = (msh) arsd.k(i2);
        } else {
            r6 = 0;
        }
        Object collect = Collection.EL.stream(((qez) obj2).g).filter(new uhe(vnk.g, 13)).filter(new uhe(vnk.h, 14)).collect(alls.a);
        collect.getClass();
        alog alogVar2 = (alog) collect;
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfqVar.getClass();
        alzz.n(amfp.BUGLE_RCS_GROUP_SELF_PARTICIPANT_INCLUSION, amfqVar);
        aozy createBuilder = aplp.a.createBuilder();
        createBuilder.getClass();
        appn.e((aplo) obj4, createBuilder);
        int size = alogVar2.size();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aplp aplpVar = (aplp) createBuilder.b;
        aplpVar.b |= 2;
        aplpVar.d = size;
        boolean z2 = false;
        if (alogVar2.isEmpty()) {
            i = 0;
        } else {
            Iterator it3 = alogVar2.iterator();
            i = 0;
            while (it3.hasNext()) {
                qei qeiVar2 = ((qff) it3.next()).c;
                if (qeiVar2 == null) {
                    qeiVar2 = qei.a;
                }
                if (aE.contains(qeiVar2) && (i = i + 1) < 0) {
                    aqjn.F();
                }
            }
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aplp aplpVar2 = (aplp) createBuilder.b;
        aplpVar2.b |= 4;
        aplpVar2.e = i;
        if (r6 != 0) {
            z = false;
        } else {
            z = true;
        }
        if (r6 != 0) {
            Optional e = r6.e();
            if (e != null && (qeiVar = (qei) arsd.k(e)) != null) {
                str = qeiVar.d;
            }
            str2 = str;
            str = r6;
        } else {
            str2 = null;
        }
        if (str != null && !alogVar2.isEmpty()) {
            Iterator it4 = alogVar2.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                qff qffVar = (qff) it4.next();
                if ((qffVar.b & 1) != 0) {
                    qei qeiVar3 = qffVar.c;
                    if (qeiVar3 == null) {
                        qeiVar3 = qei.a;
                    }
                    if (d.F(qeiVar3.d, str2)) {
                        z2 = true;
                        break;
                    }
                }
            }
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aplp aplpVar3 = (aplp) createBuilder.b;
        aplpVar3.b |= 8;
        aplpVar3.f = z2;
        appn.c(((alsx) aq).c, createBuilder);
        aq.getClass();
        appn.d(wam.u(aq, aE), createBuilder);
        appn.b(wam.t(r6, aq), createBuilder);
        appn.f(!z, createBuilder);
        appn.g(vth.c(alogVar), createBuilder);
        appn.h(aE.size(), createBuilder);
        alzz.l(appn.a(createBuilder), amfqVar);
        aozy builder = alzz.h(amfqVar).toBuilder();
        builder.getClass();
        ((mbb) vthVar3.b.b()).a().a((amfq) builder, mbt.LOG_SPEC_DSDR_GROUP_EVENTS);
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new vtg(this.f, this.g, this.h, this.i, arpeVar);
    }
}
