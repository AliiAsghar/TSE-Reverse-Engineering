package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aget extends arpw implements arqv {
    /* synthetic */ Object a;
    final /* synthetic */ ageu b;
    final /* synthetic */ RecyclerView c;
    final /* synthetic */ arqg d;
    final /* synthetic */ no e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aget(ageu ageuVar, RecyclerView recyclerView, arqg arqgVar, no noVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = ageuVar;
        this.c = recyclerView;
        this.d = arqgVar;
        this.e = noVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aget) c((List) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        List list = (List) this.a;
        hg.a(new ages(this.b, list)).b(new ager(list, this.b, this.c, this.d, this.e));
        this.b.d = list;
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        aget agetVar = new aget(this.b, this.c, this.d, this.e, arpeVar);
        agetVar.a = obj;
        return agetVar;
    }
}
