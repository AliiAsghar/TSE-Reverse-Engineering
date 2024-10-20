package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class agpp implements Function {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ agpp(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.c) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            case 1:
                return Function$CC.$default$andThen(this, function);
            case 2:
                return Function$CC.$default$andThen(this, function);
            case 3:
                return Function$CC.$default$andThen(this, function);
            case 4:
                return Function$CC.$default$andThen(this, function);
            case 5:
                return Function$CC.$default$andThen(this, function);
            case 6:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, akfb] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Object apply;
        Object apply2;
        Object apply3;
        Object apply4;
        Object apply5;
        int i = 18;
        switch (this.c) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                return agpr.o(this.a, (String) entry.getKey(), entry.getValue(), (String) this.b);
            case 1:
                return ((agpw) obj).b((agpo) this.b, this.a);
            case 2:
                akgl akglVar = (akgl) this.a;
                Executor executor = akglVar.g;
                akbl akblVar = akglVar.e;
                ahiy ahiyVar = akglVar.h;
                return new akgn(this.b, akglVar.f, ahiyVar, akblVar, executor);
            case 3:
                ?? r0 = this.b;
                apply = r0.apply(obj);
                if (((List) apply).isEmpty()) {
                    return Optional.empty();
                }
                Object obj2 = this.a;
                apply2 = r0.apply(obj);
                List list = (List) Collection.EL.stream((List) apply2).map(obj2).filter(new adru(15)).map(new akya(i)).collect(albo.l());
                aozy createBuilder = apde.a.createBuilder();
                aozy createBuilder2 = apbj.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apbj apbjVar = (apbj) createBuilder2.b;
                apax apaxVar = apbjVar.b;
                if (!apaxVar.c()) {
                    apbjVar.b = apag.mutableCopy(apaxVar);
                }
                aoyj.addAll(list, apbjVar.b);
                apbj apbjVar2 = (apbj) createBuilder2.s();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apde apdeVar = (apde) createBuilder.b;
                apbjVar2.getClass();
                apdeVar.c = apbjVar2;
                apdeVar.b = 6;
                return Optional.of((apde) createBuilder.s());
            case 4:
                apply3 = this.a.apply(obj);
                Optional map = ((Optional) apply3).map(Function$CC.identity());
                Object obj3 = this.b;
                obj3.getClass();
                return map.map(new akyh(obj3, 3)).map(new akyg(4));
            case 5:
                return ((akym) this.b).a.b(this.a);
            case 6:
                apply4 = this.a.apply(obj);
                akzo akzoVar = (akzo) apply4;
                aozy p = albo.p((String) this.b, akzoVar);
                Collection.EL.stream(albo.o(akzoVar, new akxx(2))).forEach(new ajpx(p, i));
                return Optional.of((alay) p.s());
            default:
                apply5 = this.b.apply(obj);
                return (List) ((Optional) apply5).stream().map(this.a).collect(albo.l());
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.c) {
            case 0:
                return Function$CC.$default$compose(this, function);
            case 1:
                return Function$CC.$default$compose(this, function);
            case 2:
                return Function$CC.$default$compose(this, function);
            case 3:
                return Function$CC.$default$compose(this, function);
            case 4:
                return Function$CC.$default$compose(this, function);
            case 5:
                return Function$CC.$default$compose(this, function);
            case 6:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }

    public /* synthetic */ agpp(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ agpp(Function function, int i) {
        this.c = i;
        this.b = "softwareInstruction.name";
        this.a = function;
    }
}
