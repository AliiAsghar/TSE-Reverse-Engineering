package defpackage;

import j$.util.function.Function$CC;
import java.util.concurrent.ScheduledFuture;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adie implements UnaryOperator {
    private final /* synthetic */ int a;

    public /* synthetic */ adie(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return Function$CC.$default$andThen(this, function);
            }
            return Function$CC.$default$andThen(this, function);
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                anem anemVar = (anem) obj;
                int i2 = aduk.f;
                if (anemVar != null) {
                    anemVar.cancel(false);
                }
                return null;
            }
            ((voi) obj).getClass();
            return new vol();
        }
        ScheduledFuture scheduledFuture = (ScheduledFuture) obj;
        int i3 = adif.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        return null;
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return Function$CC.$default$compose(this, function);
            }
            return Function$CC.$default$compose(this, function);
        }
        return Function$CC.$default$compose(this, function);
    }
}
