package defpackage;

import j$.util.DesugarCollections;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class iun implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ iun(int i, amoq amoqVar, Integer num, int i2) {
        this.d = i2;
        this.a = i;
        this.b = amoqVar;
        this.c = num;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, java.lang.Iterable] */
    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                aozy createBuilder = amop.a.createBuilder();
                createBuilder.getClass();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                int i2 = this.a;
                apag apagVar = createBuilder.b;
                amop amopVar = (amop) apagVar;
                amopVar.c = i2 - 1;
                amopVar.b = 1 | amopVar.b;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                Object obj = this.c;
                Object obj2 = this.b;
                amop amopVar2 = (amop) createBuilder.b;
                amopVar2.d = (amoq) obj2;
                amopVar2.b |= 2;
                if (obj != null) {
                    int intValue = ((Integer) obj).intValue();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amop amopVar3 = (amop) createBuilder.b;
                    amopVar3.b |= 8;
                    amopVar3.f = intValue;
                }
                apag s = createBuilder.s();
                s.getClass();
                return (amop) s;
            }
            ammm ammmVar = (ammm) ammn.a.createBuilder();
            ammmVar.getClass();
            if (!ammmVar.b.isMutable()) {
                ammmVar.u();
            }
            Object obj3 = this.b;
            ammn ammnVar = (ammn) ammmVar.b;
            ammnVar.c = ((amgf) obj3).k;
            ammnVar.b = 1 | ammnVar.b;
            DesugarCollections.unmodifiableList(ammnVar.e).getClass();
            if (!ammmVar.b.isMutable()) {
                ammmVar.u();
            }
            ammn ammnVar2 = (ammn) ammmVar.b;
            apax apaxVar = ammnVar2.e;
            if (!apaxVar.c()) {
                ammnVar2.e = apag.mutableCopy(apaxVar);
            }
            aoyj.addAll(this.c, ammnVar2.e);
            if (!ammmVar.b.isMutable()) {
                ammmVar.u();
            }
            int i3 = this.a;
            ammn ammnVar3 = (ammn) ammmVar.b;
            ammnVar3.b |= 2;
            ammnVar3.d = i3;
            apag s2 = ammmVar.s();
            s2.getClass();
            return (ammn) s2;
        }
        aozy createBuilder2 = amli.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        int i4 = this.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        amli amliVar = (amli) createBuilder2.b;
        amliVar.c = (amlk) obj4;
        amliVar.b = 1 | amliVar.b;
        amlk f = ((iuo) obj5).a.f(i4);
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amli amliVar2 = (amli) createBuilder2.b;
        f.getClass();
        amliVar2.d = f;
        amliVar2.b |= 2;
        return (amli) createBuilder2.s();
    }

    public /* synthetic */ iun(Object obj, Object obj2, int i, int i2) {
        this.d = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }
}
