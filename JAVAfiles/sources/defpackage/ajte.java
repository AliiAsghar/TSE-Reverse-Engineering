package defpackage;

import com.google.android.rcs.client.messaging.UpdateGroupRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class ajte implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final UpdateGroupRequest apply(web webVar) {
        aoad aoadVar = new aoad((byte[]) null, (byte[]) null, (char[]) null);
        c(aoadVar);
        if ((webVar.b & 4) != 0) {
            algf algfVar = ajtx.a;
            wbk wbkVar = webVar.d;
            if (wbkVar == null) {
                wbkVar = wbk.a;
            }
            aoadVar.E((Conversation) algfVar.fu(wbkVar));
        }
        if ((webVar.b & 8) != 0) {
            aoadVar.H(webVar.e);
        }
        b(webVar, aoadVar);
        return aoadVar.D();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(web webVar, aoad aoadVar);

    public abstract void c(aoad aoadVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
