package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class meh implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ apag c;
    private final /* synthetic */ int d;

    public /* synthetic */ meh(apag apagVar, int i, int i2, int i3) {
        this.d = i3;
        this.c = apagVar;
        this.a = i;
        this.b = i2;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.d != 0) {
            return mci.h(2, (amoq) this.c, this.a, this.b);
        }
        aozy createBuilder = amsh.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = this.c;
        apag apagVar2 = createBuilder.b;
        amsh amshVar = (amsh) apagVar2;
        apagVar.getClass();
        amshVar.c = (amsg) apagVar;
        amshVar.b |= 1;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        int i = this.a;
        apag apagVar3 = createBuilder.b;
        amsh amshVar2 = (amsh) apagVar3;
        amshVar2.b = 2 | amshVar2.b;
        amshVar2.d = i;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        int i2 = this.b;
        amsh amshVar3 = (amsh) createBuilder.b;
        amshVar3.b |= 4;
        amshVar3.e = i2;
        return (amsh) createBuilder.s();
    }
}
