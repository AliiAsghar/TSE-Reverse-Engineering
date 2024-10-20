package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vtf extends arpw implements arqv {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ vth e;
    final /* synthetic */ qey f;
    final /* synthetic */ ConversationIdType g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtf(vth vthVar, qey qeyVar, ConversationIdType conversationIdType, arpe arpeVar) {
        super(2, arpeVar);
        this.e = vthVar;
        this.f = qeyVar;
        this.g = conversationIdType;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vtf) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        msh mshVar;
        Object obj5;
        Optional i;
        arpl arplVar = arpl.a;
        boolean z = true;
        if (this.d != 0) {
            obj3 = this.c;
            obj2 = this.b;
            Object obj6 = this.a;
            aqil.P(obj);
            obj4 = obj6;
        } else {
            aqil.P(obj);
            vth vthVar = this.e;
            obj2 = this.f;
            ConversationIdType conversationIdType = this.g;
            conversationIdType.getClass();
            this.a = vthVar;
            this.b = obj2;
            this.c = conversationIdType;
            this.d = 1;
            Object a = vthVar.a(this);
            if (a != arplVar) {
                obj3 = conversationIdType;
                obj = a;
                obj4 = vthVar;
            } else {
                return arplVar;
            }
        }
        obj.getClass();
        alog alogVar = (alog) obj;
        alwo alwoVar = vth.a;
        vth vthVar2 = (vth) obj4;
        List aq = ((rtz) vthVar2.f.b()).aq((ConversationIdType) obj3);
        Set o = ((adjc) vthVar2.c.b()).o();
        ArrayList arrayList = new ArrayList(aqjn.J(o, 10));
        Iterator it = o.iterator();
        while (it.hasNext()) {
            arrayList.add(((psq) vthVar2.d.b()).c(((adit) it.next()).a));
        }
        Set aE = aqjn.aE(arrayList);
        if (!vthVar2.h.a()) {
            alogVar = (alog) vthVar2.e.a().c();
        }
        alogVar.getClass();
        Iterator<E> it2 = alogVar.iterator();
        while (true) {
            mshVar = null;
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
        if (nfwVar != null && (i = nfwVar.i()) != null) {
            mshVar = (msh) arsd.k(i);
        }
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfqVar.getClass();
        alzz.n(amfp.BUGLE_RCS_GROUP_SELF_PARTICIPANT_INCLUSION, amfqVar);
        aozy createBuilder = aplp.a.createBuilder();
        createBuilder.getClass();
        appn.e(aplo.GROUP_EVENT_NOTIFICATION, createBuilder);
        qey qeyVar = (qey) obj2;
        int size = qeyVar.f.size();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aplp aplpVar = (aplp) createBuilder.b;
        aplpVar.b |= 8192;
        aplpVar.m = size;
        apax apaxVar = qeyVar.f;
        apaxVar.getClass();
        boolean v = wam.v(mshVar, apaxVar);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aplp aplpVar2 = (aplp) createBuilder.b;
        aplpVar2.b |= 32768;
        aplpVar2.o = v;
        apax apaxVar2 = qeyVar.f;
        apaxVar2.getClass();
        int w = wam.w(apaxVar2, aE);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aplp aplpVar3 = (aplp) createBuilder.b;
        aplpVar3.b |= 16384;
        aplpVar3.n = w;
        int size2 = qeyVar.g.size();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aplp aplpVar4 = (aplp) createBuilder.b;
        aplpVar4.b |= 65536;
        aplpVar4.p = size2;
        apax apaxVar3 = qeyVar.g;
        apaxVar3.getClass();
        boolean v2 = wam.v(mshVar, apaxVar3);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aplp aplpVar5 = (aplp) createBuilder.b;
        aplpVar5.b |= 262144;
        aplpVar5.r = v2;
        apax apaxVar4 = qeyVar.g;
        apaxVar4.getClass();
        int w2 = wam.w(apaxVar4, aE);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aplp aplpVar6 = (aplp) createBuilder.b;
        aplpVar6.b |= 131072;
        aplpVar6.q = w2;
        appn.c(((alsx) aq).c, createBuilder);
        aq.getClass();
        appn.d(wam.u(aq, aE), createBuilder);
        appn.b(wam.t(mshVar, aq), createBuilder);
        if (mshVar == null) {
            z = false;
        }
        appn.f(z, createBuilder);
        appn.g(vth.c(alogVar), createBuilder);
        appn.h(aE.size(), createBuilder);
        alzz.l(appn.a(createBuilder), amfqVar);
        aozy builder = alzz.h(amfqVar).toBuilder();
        builder.getClass();
        ((mbb) vthVar2.b.b()).a().a((amfq) builder, mbt.LOG_SPEC_DSDR_GROUP_EVENTS);
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new vtf(this.e, this.f, this.g, arpeVar);
    }
}
