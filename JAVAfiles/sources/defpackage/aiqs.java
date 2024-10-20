package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aiqs extends qs {
    final /* synthetic */ aiqu a;

    public aiqs(aiqu aiquVar) {
        this.a = aiquVar;
    }

    @Override // defpackage.qs
    public final boolean j() {
        return false;
    }

    @Override // defpackage.qs
    public final boolean k() {
        return false;
    }

    @Override // defpackage.qs
    public final boolean n(oo ooVar, oo ooVar2) {
        int i;
        aiqu aiquVar = this.a;
        List list = aiquVar.e;
        int b = ooVar.b();
        int b2 = ooVar2.b();
        Collections.swap(list, b, b2);
        ArrayList arrayList = new ArrayList();
        for (aova aovaVar : aiquVar.e) {
            if (!aiquVar.d.contains(aovaVar.b)) {
                arrayList.add(aovaVar.b);
            }
        }
        ((agcp) aiquVar.h.k).y(arrayList);
        aiquVar.t(b, b2);
        aiqj aiqjVar = aiquVar.h;
        String str = ((aova) aiquVar.e.get(b2)).b;
        aodc aodcVar = aodc.FAVORITES;
        if (b != b2) {
            if (b2 > b) {
                i = 37;
            } else {
                i = 36;
            }
            aozy createBuilder = aodd.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            ((aodd) apagVar).b = aode.a(i);
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            apag apagVar2 = createBuilder.b;
            str.getClass();
            ((aodd) apagVar2).d = str;
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            Object obj = aiqjVar.g;
            ((aodd) createBuilder.b).e = aodcVar.a();
            ((airh) obj).a((aodd) createBuilder.s());
            return true;
        }
        return true;
    }

    @Override // defpackage.qs
    public final int p(oo ooVar) {
        return f(3, 0);
    }

    @Override // defpackage.qs
    public final void h(oo ooVar, int i) {
    }
}
