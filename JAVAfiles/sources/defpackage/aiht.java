package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aiht implements aiib {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aiht(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.aiib
    public final void a(aihz aihzVar) {
        if (this.b != 0) {
            aihw.c.execute(new ahnu(this.a, aihzVar, 14));
            return;
        }
        long j = aihzVar.g;
        Optional optional = aihzVar.f;
        Optional optional2 = aihzVar.e;
        List list = aihzVar.d;
        ((aihw) this.a).g.a(new aihz(aihy.a(aihzVar.b), aihzVar.c, list, optional2, optional, j));
    }
}
