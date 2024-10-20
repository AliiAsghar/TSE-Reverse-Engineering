package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abea extends arpw implements arqv {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    int g;
    final /* synthetic */ abec h;
    final /* synthetic */ List i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abea(abec abecVar, List list, arpe arpeVar) {
        super(2, arpeVar);
        this.h = abecVar;
        this.i = list;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abea) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        akrh akrhVar;
        arpl arplVar = arpl.a;
        try {
            if (this.g != 0) {
                obj3 = this.f;
                obj2 = this.e;
                obj4 = this.d;
                obj6 = this.c;
                obj5 = this.b;
                Object obj7 = this.a;
                aqil.P(obj);
                akrhVar = obj7;
            } else {
                aqil.P(obj);
                abec abecVar = this.h;
                List list = this.i;
                akrh e = aktp.e("LoadPagedConversationHandlerImpl#loadRecentConversationsWithMessageAsFuture");
                aozy createBuilder = ywr.a.createBuilder();
                createBuilder.getClass();
                wfh wfhVar = new wfh(createBuilder);
                aozy createBuilder2 = ywk.a.createBuilder();
                createBuilder2.getClass();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ((ywk) createBuilder2.b).b = 8;
                apag s = createBuilder2.s();
                s.getClass();
                ywk ywkVar = (ywk) s;
                Object obj8 = wfhVar.a;
                if (!((aozy) obj8).b.isMutable()) {
                    ((aozy) obj8).u();
                }
                ywr ywrVar = (ywr) ((aozy) obj8).b;
                ywrVar.e = ywkVar;
                ywrVar.b |= 1;
                wfh be = aabr.be(ywl.a.createBuilder());
                apdk s2 = be.s();
                abdv abdvVar = (abdv) abecVar.b.b();
                this.a = e;
                this.b = wfhVar;
                this.c = be;
                this.d = wfhVar;
                this.e = be;
                this.f = s2;
                this.g = 1;
                obj = arro.q(abdvVar.d, new zez(abdvVar, list, (arpe) null, 15), this);
                if (obj != arplVar) {
                    obj2 = be;
                    obj3 = s2;
                    obj4 = wfhVar;
                    obj5 = obj4;
                    obj6 = obj2;
                    akrhVar = e;
                } else {
                    return arplVar;
                }
            }
            ((wfh) obj2).t((apdk) obj3, (Iterable) obj);
            ywl r = ((wfh) obj6).r();
            Object obj9 = ((wfh) obj4).a;
            if (!((aozy) obj9).b.isMutable()) {
                ((aozy) obj9).u();
            }
            ywr ywrVar2 = (ywr) ((aozy) obj9).b;
            ywr ywrVar3 = ywr.a;
            ywrVar2.d = r;
            ywrVar2.c = 2;
            apag s3 = ((aozy) ((wfh) obj5).a).s();
            s3.getClass();
            ywr ywrVar4 = (ywr) s3;
            armd.i(akrhVar, null);
            return ywrVar4;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                armd.i(akrhVar, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new abea(this.h, this.i, arpeVar);
    }
}
