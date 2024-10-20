package defpackage;

import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class ajtd implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final TriggerGroupNotificationRequest apply(wdx wdxVar) {
        arbj arbjVar = new arbj((byte[]) null, (short[]) null, (byte[]) null);
        c(arbjVar);
        if ((wdxVar.b & 4) != 0) {
            algf algfVar = ajtw.a;
            wbk wbkVar = wdxVar.d;
            if (wbkVar == null) {
                wbkVar = wbk.a;
            }
            arbjVar.L((Conversation) algfVar.fu(wbkVar));
        }
        b(wdxVar, arbjVar);
        return arbjVar.K();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(wdx wdxVar, arbj arbjVar);

    public abstract void c(arbj arbjVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
