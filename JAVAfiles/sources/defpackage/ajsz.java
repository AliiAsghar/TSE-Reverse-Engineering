package defpackage;

import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class ajsz implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RemoveUserFromGroupRequest apply(wdd wddVar) {
        aoad aoadVar = new aoad((byte[]) null, (byte[]) null, (byte[]) null, (char[]) null);
        d(aoadVar);
        if ((wddVar.b & 4) != 0) {
            algf algfVar = ajtt.a;
            wbk wbkVar = wddVar.d;
            if (wbkVar == null) {
                wbkVar = wbk.a;
            }
            aoadVar.P((Conversation) algfVar.fu(wbkVar));
        }
        c(wddVar, aoadVar);
        b(wddVar, aoadVar);
        return aoadVar.O();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(wdd wddVar, aoad aoadVar);

    public abstract void c(wdd wddVar, aoad aoadVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(aoad aoadVar);
}
