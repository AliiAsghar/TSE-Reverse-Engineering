package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehq extends arpw implements arqv {
    Object a;
    Object b;
    Object c;
    int d;
    /* synthetic */ Object e;
    final /* synthetic */ List f;
    final /* synthetic */ List g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehq(List list, List list2, arpe arpeVar) {
        super(2, arpeVar);
        this.f = list;
        this.g = list2;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ehq) c(obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                aqil.P(obj);
                return obj;
            }
            List list = (List) this.e;
            aqil.P(obj);
            if (!((Boolean) obj).booleanValue()) {
                return null;
            }
            list.add(new ehx((eho) null, (arpe) null, 1));
            this.e = list;
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = 2;
            throw null;
        }
        aqil.P(obj);
        return this.e;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        ehq ehqVar = new ehq(this.f, this.g, arpeVar);
        ehqVar.e = obj;
        return ehqVar;
    }
}
