package defpackage;

import com.google.android.rcs.client.messaging.data.Message;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.stream.Collectors;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajtr extends ajsy {
    static final algf a = new ajts();
    public static final algf b = new ajsq();
    public static final algf c = new ajtf();

    @Override // defpackage.ajsy
    public final void c(wca wcaVar, ajqn ajqnVar) {
        ajqnVar.c(alog.n((Collection) Collection.EL.stream(wcaVar.g).map(new ajqy(12)).collect(Collectors.toList())));
    }

    @Override // defpackage.ajsy
    public final void d(wca wcaVar, ajqn ajqnVar) {
        if (!new apaq(wcaVar.k, wca.a).isEmpty()) {
            ajqnVar.d((alpt) Collection.EL.stream(new apaq(wcaVar.k, wca.a)).map(new agoq(c, 15)).collect(alls.b));
        }
    }

    @Override // defpackage.ajsy
    public final void e(wca wcaVar, ajqn ajqnVar) {
        if ((wcaVar.c & 16) != 0) {
            apwq apwqVar = wcaVar.i;
            if (apwqVar == null) {
                apwqVar = apwq.a;
            }
            Map.EL.forEach(DesugarCollections.unmodifiableMap(apwqVar.b), new lui(ajqnVar, 14));
        }
    }

    @Override // defpackage.ajsy
    public final void f(wca wcaVar, ajqn ajqnVar) {
        wda wdaVar = wcaVar.d;
        if (wdaVar == null) {
            wdaVar = wda.a;
        }
        ajqnVar.f(wdaVar.c);
    }

    @Override // defpackage.ajsy
    public final void g(wca wcaVar, ajqn ajqnVar) {
        if ((wcaVar.c & 8) != 0) {
            apct apctVar = wcaVar.h;
            if (apctVar == null) {
                apctVar = apct.a;
            }
            ajqnVar.j(aotl.l(apctVar));
        }
    }

    @Override // defpackage.ajsy
    public final void h(Message message, aozy aozyVar) {
        alog n = alog.n((java.util.Collection) Collection.EL.stream(message.b()).map(new ajqy(7)).collect(Collectors.toList()));
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wca wcaVar = (wca) aozyVar.b;
        apap apapVar = wca.a;
        wcaVar.a();
        aoyj.addAll(n, wcaVar.g);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Collection, java.lang.Object] */
    @Override // defpackage.ajsy
    public final void i(Message message, aozy aozyVar) {
        if (!message.d().isEmpty()) {
            Iterable iterable = (Iterable) Collection.EL.stream(message.d().get()).map(new ajqy(11)).collect(alls.b);
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            wca wcaVar = (wca) aozyVar.b;
            apap apapVar = wca.a;
            apao apaoVar = wcaVar.k;
            if (!apaoVar.c()) {
                wcaVar.k = apag.mutableCopy(apaoVar);
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                wcaVar.k.g(((wbp) it.next()).d);
            }
        }
    }

    @Override // defpackage.ajsy
    public final void j(Message message, aozy aozyVar) {
        if (message.c().isEmpty()) {
            return;
        }
        java.util.Map map = (java.util.Map) Collection.EL.stream(message.c()).collect(Collectors.groupingBy(new ajqy(6), Collectors.collectingAndThen(Collectors.toMap(new ajqy(8), new ajqy(9)), new ajqy(10))));
        aozy createBuilder = apwq.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((apwq) createBuilder.b).a().putAll(map);
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wca wcaVar = (wca) aozyVar.b;
        apwq apwqVar = (apwq) createBuilder.s();
        apap apapVar = wca.a;
        apwqVar.getClass();
        wcaVar.i = apwqVar;
        wcaVar.c |= 16;
    }

    @Override // defpackage.ajsy
    public final void k(Message message, aozy aozyVar) {
        aozy createBuilder = wda.a.createBuilder();
        String h = message.h();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wda wdaVar = (wda) createBuilder.b;
        wdaVar.b |= 1;
        wdaVar.c = h;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wca wcaVar = (wca) aozyVar.b;
        wda wdaVar2 = (wda) createBuilder.s();
        apap apapVar = wca.a;
        wdaVar2.getClass();
        wcaVar.d = wdaVar2;
        wcaVar.c |= 1;
    }

    @Override // defpackage.ajsy
    public final void l(Message message, aozy aozyVar) {
        message.g().ifPresent(new ajpx(aozyVar, 15));
    }
}
