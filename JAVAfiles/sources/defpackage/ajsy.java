package defpackage;

import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class ajsy extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        Message message = (Message) obj;
        aozy createBuilder = wca.b.createBuilder();
        k(message, createBuilder);
        wcz wczVar = (wcz) ajtr.a.m().fu(message.a());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wca wcaVar = (wca) createBuilder.b;
        wczVar.getClass();
        wcaVar.e = wczVar;
        wcaVar.c |= 2;
        h(message, createBuilder);
        if (message.g().isPresent()) {
            l(message, createBuilder);
        }
        if (message.f().isPresent() && message.f().isPresent()) {
            wcz wczVar2 = (wcz) ajtr.a.m().fu(message.f().get());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wca wcaVar2 = (wca) createBuilder.b;
            wczVar2.getClass();
            wcaVar2.f = wczVar2;
            wcaVar2.c |= 4;
        }
        j(message, createBuilder);
        if (message.e().isPresent() && message.e().isPresent()) {
            boolean booleanValue = ((Boolean) message.e().get()).booleanValue();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wca wcaVar3 = (wca) createBuilder.b;
            wcaVar3.c |= 32;
            wcaVar3.j = booleanValue;
        }
        if (message.d().isPresent()) {
            i(message, createBuilder);
        }
        return (wca) createBuilder.s();
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        wca wcaVar = (wca) obj;
        ajqn i = Message.i();
        if ((wcaVar.c & 1) != 0) {
            f(wcaVar, i);
        }
        if ((wcaVar.c & 2) != 0) {
            algf algfVar = ajtr.a;
            wcz wczVar = wcaVar.e;
            if (wczVar == null) {
                wczVar = wcz.a;
            }
            i.i((RcsDestinationId) algfVar.fu(wczVar));
        }
        if ((wcaVar.c & 4) != 0) {
            algf algfVar2 = ajtr.a;
            wcz wczVar2 = wcaVar.f;
            if (wczVar2 == null) {
                wczVar2 = wcz.a;
            }
            i.h((RcsDestinationId) algfVar2.fu(wczVar2));
        }
        c(wcaVar, i);
        if ((wcaVar.c & 8) != 0) {
            g(wcaVar, i);
        }
        if ((wcaVar.c & 16) != 0) {
            e(wcaVar, i);
        }
        if ((wcaVar.c & 32) != 0) {
            i.g(wcaVar.j);
        }
        d(wcaVar, i);
        return i.a();
    }

    public abstract void c(wca wcaVar, ajqn ajqnVar);

    public void d(wca wcaVar, ajqn ajqnVar) {
        throw null;
    }

    public abstract void e(wca wcaVar, ajqn ajqnVar);

    public abstract void f(wca wcaVar, ajqn ajqnVar);

    public abstract void g(wca wcaVar, ajqn ajqnVar);

    public abstract void h(Message message, aozy aozyVar);

    public void i(Message message, aozy aozyVar) {
        throw null;
    }

    public abstract void j(Message message, aozy aozyVar);

    public abstract void k(Message message, aozy aozyVar);

    public abstract void l(Message message, aozy aozyVar);
}
