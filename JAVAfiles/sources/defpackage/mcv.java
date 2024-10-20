package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mcv implements Supplier {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ mcv(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    aozy createBuilder = amtr.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    int i2 = this.a;
                    amtr amtrVar = (amtr) createBuilder.b;
                    amtrVar.b = 1 | amtrVar.b;
                    amtrVar.c = i2;
                    return (amtr) createBuilder.s();
                }
                int i3 = yqm.a;
                amyv amyvVar = (amyv) amyw.a.createBuilder();
                amyvVar.getClass();
                aozy createBuilder2 = amyu.a.createBuilder();
                createBuilder2.getClass();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar = createBuilder2.b;
                amyu amyuVar = (amyu) apagVar;
                amyuVar.c = 1;
                amyuVar.b |= 1;
                if (!apagVar.isMutable()) {
                    createBuilder2.u();
                }
                int i4 = this.a;
                amyu amyuVar2 = (amyu) createBuilder2.b;
                amyuVar2.b = 2 | amyuVar2.b;
                amyuVar2.d = i4;
                apag s = createBuilder2.s();
                s.getClass();
                amyu amyuVar3 = (amyu) s;
                if (!amyvVar.b.isMutable()) {
                    amyvVar.u();
                }
                amyw amywVar = (amyw) amyvVar.b;
                amywVar.c = amyuVar3;
                amywVar.b = 1;
                apag s2 = amyvVar.s();
                s2.getClass();
                return (amyw) s2;
            }
            aozy createBuilder3 = amqc.a.createBuilder();
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            int i5 = this.a;
            amqc amqcVar = (amqc) createBuilder3.b;
            amqcVar.c = i5 - 1;
            amqcVar.b = 1 | amqcVar.b;
            return (amqc) createBuilder3.s();
        }
        return mcx.c(4, this.a);
    }
}
