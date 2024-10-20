package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class mci extends mdy {
    public mci(armf armfVar, itw itwVar, Executor executor) {
        super(armfVar, itwVar, executor);
    }

    public static amop h(int i, amoq amoqVar, int i2, int i3) {
        return i(i, amoqVar, i2, i3, null);
    }

    public static amop i(int i, amoq amoqVar, int i2, int i3, amso amsoVar) {
        aozy createBuilder = amop.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amop amopVar = (amop) apagVar;
        amopVar.c = i - 1;
        amopVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amop amopVar2 = (amop) apagVar2;
        amoqVar.getClass();
        amopVar2.d = amoqVar;
        amopVar2.b |= 2;
        if (i2 >= 0) {
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            amop amopVar3 = (amop) createBuilder.b;
            amopVar3.b |= 4;
            amopVar3.e = i2;
        }
        if (i3 >= 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amop amopVar4 = (amop) createBuilder.b;
            amopVar4.b |= 8;
            amopVar4.f = i3;
        }
        if (amsoVar != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amop amopVar5 = (amop) createBuilder.b;
            amopVar5.g = amsoVar;
            amopVar5.b |= 16;
        }
        return (amop) createBuilder.s();
    }

    @Override // defpackage.mdy
    public final BiConsumer a() {
        return new ioe(9);
    }

    public final void b(amoq amoqVar, int i) {
        n(new mcg(amoqVar, i, 0));
    }

    public final void c(amoq amoqVar, int i, int i2) {
        n(new meh(amoqVar, i, i2, 1));
    }

    public final void d(amoq amoqVar, int i) {
        n(new mcg(amoqVar, i, 2));
    }

    public final void e(amqj amqjVar, int i) {
        aozy createBuilder = amoq.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amoq amoqVar = (amoq) createBuilder.b;
        amqjVar.getClass();
        amoqVar.d = amqjVar;
        amoqVar.c = 101;
        amox amoxVar = amox.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amoq amoqVar2 = (amoq) createBuilder.b;
        amoxVar.getClass();
        amoqVar2.f = amoxVar;
        amoqVar2.e = BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED;
        c((amoq) createBuilder.s(), -1, i);
    }

    public final void f(amoq amoqVar, int i) {
        c(amoqVar, i, -1);
    }

    public final void g(amoq amoqVar) {
        d(amoqVar, -1);
    }

    public final akul j(final int i, final amoq amoqVar, final int i2, final amso amsoVar) {
        return k(new Supplier() { // from class: mch
            @Override // java.util.function.Supplier
            public final Object get() {
                return mci.i(i, amoqVar, -1, i2, amsoVar);
            }
        });
    }
}
