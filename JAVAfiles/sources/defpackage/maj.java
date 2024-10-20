package defpackage;

import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class maj implements agpv {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ maj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.agpv
    public final boolean a(agpy agpyVar) {
        if (this.b != 0) {
            if (agpyVar instanceof agmd) {
                agmd agmdVar = (agmd) agpyVar;
                if (agkx.ab(agmdVar.d, sni.c.a.toString()) && agmdVar.b == 1) {
                    ((mac) this.a).e(mej.CONVERSATION_DELETED_EVENT, Optional.of(agmdVar.a));
                    return true;
                }
            }
            return false;
        }
        Object obj = this.a;
        if (agpyVar instanceof agmd) {
            agmd agmdVar2 = (agmd) agpyVar;
            if (man.g(agmdVar2.d) && agmdVar2.b == 1) {
                ((man) obj).f(rvc.b(agmdVar2.a), mem.MESSAGE_DELETED, Optional.empty());
                return true;
            }
        }
        if (agpyVar instanceof agmf) {
            agmf agmfVar = (agmf) agpyVar;
            if (man.g(agmfVar.d) && agmfVar.c - 1 == 2) {
                Iterator it = agmfVar.b.iterator();
                while (it.hasNext()) {
                    ((man) obj).f(rvc.b((String) it.next()), mem.MESSAGE_DELETED, Optional.empty());
                }
            }
        }
        return false;
    }
}
