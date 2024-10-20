package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wao extends vzv {
    static final algf a = new wah();
    static final Function b = new vzo(11);
    private final xnv c;

    public wao(xnv xnvVar) {
        this.c = xnvVar;
    }

    @Override // defpackage.vzv
    public final void b(wdl wdlVar, aozy aozyVar) {
        wcq wcqVar = wdlVar.e;
        if (wcqVar == null) {
            wcqVar = wcq.a;
        }
        if ((wcqVar.b & 8) != 0) {
            algf algfVar = a;
            wcq wcqVar2 = wdlVar.e;
            if (wcqVar2 == null) {
                wcqVar2 = wcq.a;
            }
            wcp b2 = wcp.b(wcqVar2.f);
            if (b2 == null) {
                b2 = wcp.FALLBACK_UNKNOWN;
            }
            wxl wxlVar = (wxl) algfVar.fu(b2);
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            wxm wxmVar = (wxm) aozyVar.b;
            wxm wxmVar2 = wxm.a;
            wxmVar.f = wxlVar.e;
            wxmVar.b |= 8;
        }
    }

    @Override // defpackage.vzv
    public final void c(wdl wdlVar, aozy aozyVar) {
        if ((wdlVar.b & 1) != 0) {
            aoyo aoyoVar = wdlVar.c;
            if (aoyoVar == null) {
                aoyoVar = aoyo.a;
            }
            aozb aozbVar = aoyoVar.b;
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            wxm wxmVar = (wxm) aozyVar.b;
            wxm wxmVar2 = wxm.a;
            aozbVar.getClass();
            wxmVar.b |= 2;
            wxmVar.d = aozbVar;
        }
    }

    @Override // defpackage.vzv
    public final void d(aozy aozyVar) {
        apct j = aotl.j(this.c.f());
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wxm wxmVar = (wxm) aozyVar.b;
        wxm wxmVar2 = wxm.a;
        j.getClass();
        wxmVar.e = j;
        wxmVar.b |= 4;
    }
}
