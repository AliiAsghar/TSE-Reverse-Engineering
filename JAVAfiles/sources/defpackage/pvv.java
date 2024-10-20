package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class pvv implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final xrz apply(xsb xsbVar) {
        xry xryVar = new xry(null);
        if ((xsbVar.b & 64) != 0) {
            algf algfVar = pwd.a;
            qel qelVar = xsbVar.i;
            if (qelVar == null) {
                qelVar = qel.a;
            }
            xryVar.c((ContentType) algfVar.fu(qelVar));
        }
        b(xsbVar, xryVar);
        if ((xsbVar.b & 4) != 0) {
            xryVar.e(xsbVar.e);
        }
        if ((xsbVar.b & 256) != 0) {
            xryVar.f(xsbVar.k);
        }
        if ((xsbVar.b & 128) != 0) {
            algf algfVar2 = pwd.a;
            qel qelVar2 = xsbVar.j;
            if (qelVar2 == null) {
                qelVar2 = qel.a;
            }
            xryVar.g((ContentType) algfVar2.fu(qelVar2));
        }
        if ((xsbVar.b & 8) != 0) {
            xryVar.h(xsbVar.f);
        }
        return xryVar.a();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(xsb xsbVar, xry xryVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
