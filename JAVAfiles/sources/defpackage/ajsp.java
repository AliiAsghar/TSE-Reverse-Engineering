package defpackage;

import com.google.android.rcs.client.messaging.AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class ajsp implements Function {
    public abstract void a(wbg wbgVar, aoad aoadVar);

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(wbg wbgVar, aoad aoadVar);

    public abstract void c(aoad aoadVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final AddUserToGroupRequest apply(wbg wbgVar) {
        aoad aoadVar = new aoad(null, null, null, null, null);
        c(aoadVar);
        if ((wbgVar.b & 4) != 0) {
            algf algfVar = ajso.a;
            wbk wbkVar = wbgVar.d;
            if (wbkVar == null) {
                wbkVar = wbk.a;
            }
            aoadVar.Y((Conversation) algfVar.fu(wbkVar));
        }
        b(wbgVar, aoadVar);
        a(wbgVar, aoadVar);
        return aoadVar.X();
    }
}
