package defpackage;

import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.TraceId;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ajta implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ajpw apply(wdn wdnVar) {
        Object obj;
        Object obj2;
        Object obj3;
        aoad aoadVar = new aoad((char[]) null, (byte[]) null);
        aoadVar.I(TraceId.b().l());
        if ((wdnVar.b & 4) != 0) {
            algf algfVar = ajtu.c;
            wbk wbkVar = wdnVar.e;
            if (wbkVar == null) {
                wbkVar = wbk.a;
            }
            Conversation conversation = (Conversation) algfVar.fu(wbkVar);
            if (conversation != null) {
                aoadVar.d = conversation;
            } else {
                throw new NullPointerException("Null conversation");
            }
        }
        if ((wdnVar.b & 8) != 0) {
            algf algfVar2 = ajtu.b;
            wbs wbsVar = wdnVar.f;
            if (wbsVar == null) {
                wbsVar = wbs.b;
            }
            ajqg ajqgVar = (ajqg) algfVar2.fu(wbsVar);
            if (ajqgVar != null) {
                aoadVar.b = ajqgVar;
            } else {
                throw new NullPointerException("Null message");
            }
        }
        if ((wdnVar.b & 2) != 0) {
            algf algfVar3 = ajtu.a;
            wdu wduVar = wdnVar.d;
            if (wduVar == null) {
                wduVar = wdu.a;
            }
            aoadVar.I((TraceId) algfVar3.fu(wduVar));
        }
        b(wdnVar, aoadVar);
        Object obj4 = aoadVar.d;
        if (obj4 != null && (obj = aoadVar.b) != null && (obj2 = aoadVar.a) != null && (obj3 = aoadVar.c) != null) {
            return new ajpw((Conversation) obj4, (ajqg) obj, (TraceId) obj2, (aozb) obj3);
        }
        StringBuilder sb = new StringBuilder();
        if (aoadVar.d == null) {
            sb.append(" conversation");
        }
        if (aoadVar.b == null) {
            sb.append(" message");
        }
        if (aoadVar.a == null) {
            sb.append(" traceId");
        }
        if (aoadVar.c == null) {
            sb.append(" opaqueData");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(wdn wdnVar, aoad aoadVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
