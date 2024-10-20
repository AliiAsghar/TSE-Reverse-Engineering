package defpackage;

import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ajsr implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CreateGroupRequest apply(wbn wbnVar) {
        asmg asmgVar = new asmg(null, null, null);
        d(asmgVar);
        if ((wbnVar.b & 4) != 0) {
            b(wbnVar, asmgVar);
        }
        if ((wbnVar.b & 8) != 0) {
            asmgVar.F(wbnVar.e);
        }
        alob d = alog.d(wbnVar.f.size());
        Iterator<E> it = wbnVar.f.iterator();
        while (it.hasNext()) {
            d.h((RcsDestinationId) ajtl.a.fu((wcz) it.next()));
        }
        asmgVar.D(d.g());
        c(wbnVar, asmgVar);
        return asmgVar.A();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(wbn wbnVar, asmg asmgVar);

    public abstract void c(wbn wbnVar, asmg asmgVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(asmg asmgVar);
}
