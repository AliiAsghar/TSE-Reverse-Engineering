package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mcg implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mcg(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.c) {
            case 0:
                return mci.h(4, (amoq) this.b, this.a, -1);
            case 1:
                aozy createBuilder = amlj.a.createBuilder();
                amlk f = ((iup) this.b).a.f(this.a);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amlj amljVar = (amlj) createBuilder.b;
                f.getClass();
                amljVar.c = f;
                amljVar.b |= 1;
                return (amlj) createBuilder.s();
            case 2:
                return mci.h(3, (amoq) this.b, -1, this.a);
            case 3:
                return ((ueb) this.b).z(this.a);
            case 4:
                return ((ueb) this.b).h(this.a);
            case 5:
                return ((ueb) this.b).o(this.a);
            case 6:
                return ((ueb) this.b).n(this.a);
            case 7:
                return ((ueb) this.b).t(this.a);
            case 8:
                return ((ueb) this.b).w(this.a);
            case 9:
                return ((ueb) this.b).x(this.a);
            case 10:
                return ((ueb) this.b).g(this.a);
            case 11:
                return ((ueb) this.b).l(this.a);
            case 12:
                return ((ueb) this.b).v(this.a);
            case 13:
                return ((ueb) this.b).y(this.a);
            case 14:
                return ((ueb) this.b).D(this.a);
            default:
                return ((vbu) this.b).n(this.a);
        }
    }
}
