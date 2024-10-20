package defpackage;

import io.grpc.Status;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class anjz implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final anir apply(Status.Code code) {
        Status.Code code2 = Status.Code.OK;
        switch (code.ordinal()) {
            case 1:
                return anir.a;
            case 2:
                return anir.b;
            case 3:
                return anir.c;
            case 4:
                return anir.d;
            case 5:
                return anir.e;
            case 6:
                return anir.f;
            case 7:
                return anir.g;
            case 8:
                return anir.h;
            case 9:
                return anir.i;
            case 10:
                return anir.j;
            case 11:
                return anir.k;
            case 12:
                return anir.l;
            case 13:
                return anir.m;
            case 14:
                return anir.n;
            case 15:
                return anir.o;
            case 16:
                return anir.p;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(code))));
        }
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
