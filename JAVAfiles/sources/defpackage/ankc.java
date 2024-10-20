package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ankc implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final askq apply(ankp ankpVar) {
        int ordinal = ankpVar.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return askq.ETHERNET;
                    }
                    throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(ankpVar))));
                }
                return askq.WIFI;
            }
            return askq.MOBILE;
        }
        return askq.ACCESS_NETWORK_TYPE_UNSPECIFIED;
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
