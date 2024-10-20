package defpackage;

import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.android.rcs.client.messaging.data.TraceId;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ajtb implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final SendMessageRequest apply(wdr wdrVar) {
        anzh j = SendMessageRequest.j();
        c(j);
        if ((wdrVar.b & 4) != 0) {
            algf algfVar = ajtv.d;
            wbk wbkVar = wdrVar.e;
            if (wbkVar == null) {
                wbkVar = wbk.a;
            }
            j.j((Conversation) algfVar.fu(wbkVar));
        }
        if ((wdrVar.b & 8) != 0) {
            algf algfVar2 = ajtv.c;
            wca wcaVar = wdrVar.f;
            if (wcaVar == null) {
                wcaVar = wca.b;
            }
            j.l((Message) algfVar2.fu(wcaVar));
        }
        if ((wdrVar.b & 16) != 0) {
            algf algfVar3 = ajtv.b;
            wcd wcdVar = wdrVar.g;
            if (wcdVar == null) {
                wcdVar = wcd.a;
            }
            j.m((MessageClass) algfVar3.fu(wcdVar));
        }
        if ((wdrVar.b & 2) != 0) {
            algf algfVar4 = ajtv.a;
            wdu wduVar = wdrVar.d;
            if (wduVar == null) {
                wduVar = wdu.a;
            }
            j.p((TraceId) algfVar4.fu(wduVar));
        }
        b(wdrVar, j);
        if ((wdrVar.b & 32) != 0) {
            algf algfVar5 = ajtv.e;
            wco b = wco.b(wdrVar.h);
            if (b == null) {
                b = wco.MESSAGING_METHOD_UNKNOWN;
            }
            j.n((ajqw) algfVar5.fu(b));
        }
        return j.i();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(wdr wdrVar, anzh anzhVar);

    public abstract void c(anzh anzhVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
