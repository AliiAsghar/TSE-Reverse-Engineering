package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mpo extends arpw implements arqv {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ mpp f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mpo(mpp mppVar, arpe arpeVar) {
        super(2, arpeVar);
        this.f = mppVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((mpo) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        mpp mppVar;
        aron aronVar;
        aron aronVar2;
        Object obj2;
        aron aronVar3;
        ?? r1;
        arpl arplVar = arpl.a;
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                ?? r0 = this.b;
                List list = (List) this.a;
                aqil.P(obj);
                aronVar3 = r0;
                r1 = list;
                aronVar3.add(obj);
                return aqjn.x(r1);
            }
            ?? r12 = this.d;
            ?? r2 = this.c;
            obj2 = this.b;
            mppVar = (mpp) this.a;
            aqil.P(obj);
            aronVar2 = r12;
            aronVar = r2;
        } else {
            aqil.P(obj);
            mppVar = this.f;
            aronVar = new aron((byte[]) null);
            xou xouVar = new xou((short[]) null);
            xouVar.j("conversation_id");
            xouVar.k(((DefaultConversation) mppVar.a).a.b());
            aronVar.add(xouVar.i());
            this.a = mppVar;
            this.b = aronVar;
            this.c = aronVar;
            this.d = aronVar;
            this.e = 1;
            obj = mppVar.a(this);
            if (obj != arplVar) {
                aronVar2 = aronVar;
                obj2 = aronVar2;
            }
            return arplVar;
        }
        aronVar2.add(obj);
        this.a = obj2;
        this.b = aronVar;
        this.c = null;
        this.d = null;
        this.e = 2;
        obj = mppVar.f(this);
        if (obj != arplVar) {
            aronVar3 = aronVar;
            r1 = obj2;
            aronVar3.add(obj);
            return aqjn.x(r1);
        }
        return arplVar;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new mpo(this.f, arpeVar);
    }
}
