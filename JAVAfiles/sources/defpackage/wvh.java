package defpackage;

import android.content.Context;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wvh implements wvi {
    public final armf a;
    private final Context b;
    private final armf c;
    private final armf d;
    private final arwe e;

    public wvh(Context context, armf armfVar, armf armfVar2, armf armfVar3, arwe arweVar) {
        context.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        arweVar.getClass();
        this.b = context;
        this.c = armfVar;
        this.a = armfVar2;
        this.d = armfVar3;
        this.e = arweVar;
    }

    @Override // defpackage.wvi
    public final void a(Set set) {
        set.getClass();
        akrh e = aktp.e("SimFlagLoader#handleSimLoaded");
        try {
            Context context = this.b;
            Stream map = Collection.EL.stream(set).filter(new xdm(vnk.q, 1)).map(new wki(vnk.r, 10));
            int i = alog.d;
            alog alogVar = (alog) map.collect(alls.a);
            if (!alogVar.isEmpty()) {
                ((vap) this.d.b()).a(alogVar);
            }
            ((utt) this.c.b()).b(context, yll.PHENOTYPE_REGISTRATION_TRIGGER_SIM_CHANGE);
            qjh.l(this.e, null, new vck(this, (arpe) null, 17), 3);
            armd.i(e, null);
        } finally {
        }
    }
}
