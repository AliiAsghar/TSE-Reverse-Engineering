package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mrl implements alhr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mrl(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v102, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v115, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75, types: [mre, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v80, types: [mre, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v85, types: [mre, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v90, types: [mre, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v92, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v97, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v38, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v46, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [vni, java.lang.Object] */
    @Override // defpackage.alhr
    public final Object get() {
        int i = 13;
        switch (this.c) {
            case 0:
                String ag = albo.ag(this.b.m());
                mrq mrqVar = (mrq) this.a;
                apwt apwtVar = mrqVar.g;
                String ap = d.ap(ag);
                String q = ((yjr) apwtVar.b()).q(((msx) mrqVar.e.b()).d(ap));
                if (msx.g(ap)) {
                    return ap;
                }
                return q;
            case 1:
                ?? r0 = this.a;
                uuf uufVar = mrq.a;
                if (((mrp) r0.get()).a.equals(msy.EMAIL)) {
                    return Optional.empty();
                }
                return this.b.get();
            case 2:
                uuf uufVar2 = mrq.a;
                Optional optional = (Optional) this.a.get();
                Object obj = this.b;
                obj.getClass();
                return (String) optional.orElseGet(new ijm(obj, i));
            case 3:
                uuf uufVar3 = mrq.a;
                return (String) ((Optional) this.a.get()).orElseGet(new ijm(this.b, i));
            case 4:
                return ((msx) ((mrq) this.a).e.b()).d((String) this.b);
            case 5:
                return Optional.of(((psq) ((mrq) this.a).f.b()).a((String) this.b, false));
            case 6:
                return ((Optional) this.b.get()).map(new moh(this.a, 14));
            case 7:
                return ((yjr) ((mrq) this.a).g.b()).a((String) this.b.get());
            case 8:
                uuf uufVar4 = mrq.a;
                return ((yjr) this.a).a((String) this.b.get());
            case 9:
                return ((msx) ((mrw) this.a).a.b()).d((String) this.b);
            case 10:
                return ((yjr) ((mrw) this.a).b.b()).j(this.b.m());
            case 11:
                return Optional.of(((psq) ((mrw) this.a).d.b()).b((String) this.b));
            case 12:
                return ((msb) this.a).c.b().k(this.b);
            case 13:
                return ((msb) this.a).c.b().b((qei) this.b);
            case 14:
                return ((msb) this.a).c.b().d((adit) this.b);
            case 15:
                return ((msb) this.a).c.b().a((String) this.b);
            case 16:
                return Boolean.valueOf(((yjr) this.b.b()).z((String) ((msg) this.a).a.get()));
            case 17:
                return Boolean.valueOf(((yjr) this.b.b()).z((String) this.a.get()));
            case 18:
                return Boolean.valueOf(((yjr) this.b.b()).z((String) ((msg) this.a).a.get()));
            case 19:
                return ((msx) ((msq) this.b).e.b()).d(albo.ag(this.a.m()));
            default:
                return Optional.of(((psq) ((msq) this.a).i.b()).a(this.b.m(), false));
        }
    }

    public /* synthetic */ mrl(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
