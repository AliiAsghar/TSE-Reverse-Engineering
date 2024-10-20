package defpackage;

import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class ajss extends algf {
    @Override // defpackage.algf
    protected final /* synthetic */ Object a(Object obj) {
        ajqg ajqgVar = (ajqg) obj;
        aozy createBuilder = wbs.b.createBuilder();
        g(ajqgVar, createBuilder);
        wcz wczVar = (wcz) ajtn.b.m().fu(ajqgVar.b);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wbs wbsVar = (wbs) createBuilder.b;
        wczVar.getClass();
        wbsVar.e = wczVar;
        wbsVar.c |= 2;
        if (ajqgVar.c.isPresent() && ajqgVar.c.isPresent()) {
            wcz wczVar2 = (wcz) ajtn.b.m().fu(ajqgVar.c.get());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wbs wbsVar2 = (wbs) createBuilder.b;
            wczVar2.getClass();
            wbsVar2.f = wczVar2;
            wbsVar2.c |= 4;
        }
        wbu wbuVar = (wbu) ajtn.a.m().fu(ajqgVar.d);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wbs wbsVar3 = (wbs) createBuilder.b;
        wbuVar.getClass();
        wbsVar3.g = wbuVar;
        wbsVar3.c |= 8;
        if (ajqgVar.e.isPresent()) {
            h(ajqgVar, createBuilder);
        }
        if (ajqgVar.f.isPresent()) {
            f(ajqgVar, createBuilder);
        }
        return (wbs) createBuilder.s();
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        Object obj2;
        Object obj3;
        wbs wbsVar = (wbs) obj;
        ajqe ajqeVar = new ajqe((byte[]) null);
        if ((wbsVar.c & 1) != 0) {
            d(wbsVar, ajqeVar);
        }
        if ((wbsVar.c & 2) != 0) {
            algf algfVar = ajtn.b;
            wcz wczVar = wbsVar.e;
            if (wczVar == null) {
                wczVar = wcz.a;
            }
            RcsDestinationId rcsDestinationId = (RcsDestinationId) algfVar.fu(wczVar);
            if (rcsDestinationId != null) {
                ajqeVar.b = rcsDestinationId;
            } else {
                throw new NullPointerException("Null sender");
            }
        }
        if ((wbsVar.c & 4) != 0) {
            algf algfVar2 = ajtn.b;
            wcz wczVar2 = wbsVar.f;
            if (wczVar2 == null) {
                wczVar2 = wcz.a;
            }
            ajqeVar.c = Optional.of((RcsDestinationId) algfVar2.fu(wczVar2));
        }
        if ((wbsVar.c & 8) != 0) {
            algf algfVar3 = ajtn.a;
            wbu wbuVar = wbsVar.g;
            if (wbuVar == null) {
                wbuVar = wbu.a;
            }
            ajqf ajqfVar = (ajqf) algfVar3.fu(wbuVar);
            if (ajqfVar != null) {
                ajqeVar.d = ajqfVar;
            } else {
                throw new NullPointerException("Null content");
            }
        }
        if ((wbsVar.c & 16) != 0) {
            e(wbsVar, ajqeVar);
        }
        c(wbsVar, ajqeVar);
        Object obj4 = ajqeVar.a;
        if (obj4 != null && (obj2 = ajqeVar.b) != null && (obj3 = ajqeVar.d) != null) {
            return new ajqg((String) obj4, (RcsDestinationId) obj2, (Optional) ajqeVar.c, (ajqf) obj3, (Optional) ajqeVar.e, (Optional) ajqeVar.f);
        }
        StringBuilder sb = new StringBuilder();
        if (ajqeVar.a == null) {
            sb.append(" id");
        }
        if (ajqeVar.b == null) {
            sb.append(" sender");
        }
        if (ajqeVar.d == null) {
            sb.append(" content");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public void c(wbs wbsVar, ajqe ajqeVar) {
        throw null;
    }

    public abstract void d(wbs wbsVar, ajqe ajqeVar);

    public abstract void e(wbs wbsVar, ajqe ajqeVar);

    public void f(ajqg ajqgVar, aozy aozyVar) {
        throw null;
    }

    public abstract void g(ajqg ajqgVar, aozy aozyVar);

    public abstract void h(ajqg ajqgVar, aozy aozyVar);
}
