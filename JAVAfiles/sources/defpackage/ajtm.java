package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajtm extends ajst {
    static final algf a = new ajsq();

    @Override // defpackage.ajst
    public final void c(ajqf ajqfVar, aozy aozyVar) {
        aozy createBuilder = wbt.a.createBuilder();
        String uri = ajqfVar.b.toString();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wbt wbtVar = (wbt) createBuilder.b;
        uri.getClass();
        wbtVar.b |= 1;
        wbtVar.c = uri;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wbu wbuVar = (wbu) aozyVar.b;
        wbt wbtVar2 = (wbt) createBuilder.s();
        wbu wbuVar2 = wbu.a;
        wbtVar2.getClass();
        wbuVar.d = wbtVar2;
        wbuVar.b |= 2;
    }

    @Override // defpackage.ajst
    public final void d(wbu wbuVar, ajur ajurVar) {
        wbt wbtVar = wbuVar.d;
        if (wbtVar == null) {
            wbtVar = wbt.a;
        }
        Uri parse = Uri.parse(wbtVar.c);
        if (parse != null) {
            ajurVar.b = parse;
            return;
        }
        throw new NullPointerException("Null contentUri");
    }
}
