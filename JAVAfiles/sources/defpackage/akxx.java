package defpackage;

import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akxx implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ akxx(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.a) {
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
            case 7:
                return Function$CC.$default$andThen(this, function);
            case 8:
                return Function$CC.$default$andThen(this, function);
            case 9:
                return Function$CC.$default$andThen(this, function);
            case 10:
                return Function$CC.$default$andThen(this, function);
            case 11:
                return Function$CC.$default$andThen(this, function);
            case 12:
                return Function$CC.$default$andThen(this, function);
            case 13:
                return Function$CC.$default$andThen(this, function);
            case 14:
                return Function$CC.$default$andThen(this, function);
            case 15:
                return Function$CC.$default$andThen(this, function);
            case 16:
                return Function$CC.$default$andThen(this, function);
            case 17:
                return Function$CC.$default$andThen(this, function);
            case 18:
                return Function$CC.$default$andThen(this, function);
            case 19:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return albo.n((Enum) obj);
            case 1:
                albi albiVar = (albi) obj;
                aozy createBuilder = albc.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                albc albcVar = (albc) createBuilder.b;
                albiVar.getClass();
                albcVar.c = albiVar;
                albcVar.b |= 1;
                return (albc) createBuilder.s();
            case 2:
                akzn akznVar = (akzn) obj;
                akznVar.b();
                return albo.n(akznVar.a());
            case 3:
                akzg akzgVar = (akzg) obj;
                aozy createBuilder2 = alba.a.createBuilder();
                List c = akzgVar.c();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                alba albaVar = (alba) createBuilder2.b;
                apax apaxVar = albaVar.e;
                if (!apaxVar.c()) {
                    albaVar.e = apag.mutableCopy(apaxVar);
                }
                aoyj.addAll(c, albaVar.e);
                akzgVar.b().ifPresent(new ajpx(createBuilder2, 19));
                akzgVar.a().ifPresent(new ajpx(createBuilder2, 20));
                return (alba) createBuilder2.s();
            case 4:
                alba.a.createBuilder();
                throw null;
            case 5:
                return ((alak) obj).d;
            case 6:
                return ((alak) obj).b;
            case 7:
                return ((alak) obj).e;
            case 8:
                return ((alak) obj).f;
            case 9:
                return ((alaf) obj).a;
            case 10:
                return ((alaf) obj).e;
            case 11:
                return ((alaf) obj).b;
            case 12:
                return ((alaf) obj).c;
            case 13:
                return ((alaf) obj).d;
            case 14:
                return ((alac) obj).a;
            case 15:
                return ((alal) obj).b;
            case 16:
                return ((alal) obj).c;
            case 17:
                return ((alal) obj).a;
            case 18:
                return ((alas) obj).b;
            case 19:
                return ((alas) obj).a;
            default:
                return ((akzz) obj).a;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
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
            case 7:
                return Function$CC.$default$compose(this, function);
            case 8:
                return Function$CC.$default$compose(this, function);
            case 9:
                return Function$CC.$default$compose(this, function);
            case 10:
                return Function$CC.$default$compose(this, function);
            case 11:
                return Function$CC.$default$compose(this, function);
            case 12:
                return Function$CC.$default$compose(this, function);
            case 13:
                return Function$CC.$default$compose(this, function);
            case 14:
                return Function$CC.$default$compose(this, function);
            case 15:
                return Function$CC.$default$compose(this, function);
            case 16:
                return Function$CC.$default$compose(this, function);
            case 17:
                return Function$CC.$default$compose(this, function);
            case 18:
                return Function$CC.$default$compose(this, function);
            case 19:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }
}
