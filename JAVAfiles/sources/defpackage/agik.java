package defpackage;

import android.os.Bundle;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agik extends arrp implements arqr {
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ byn d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agik(List list, agjg agjgVar, byk bykVar, boolean z, agii agiiVar, int i) {
        super(1);
        this.f = i;
        this.b = list;
        this.c = agjgVar;
        this.d = bykVar;
        this.a = z;
        this.e = agiiVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [byk, byn] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        afzd afzdVar;
        if (this.f != 0) {
            ciy ciyVar = (ciy) obj;
            ciyVar.getClass();
            if (this.a) {
                if (ciyVar.a()) {
                    this.d.h(Boolean.valueOf(true));
                    afzd afzdVar2 = (afzd) ((czj) this.e).a;
                    if (afzdVar2 != null) {
                        afzdVar2.h(null);
                    }
                } else {
                    this.d.h(Boolean.valueOf(false));
                    afzd afzdVar3 = (afzd) ((czj) this.e).a;
                    if (afzdVar3 != null) {
                        afzdVar3.h((afzq) this.c);
                    }
                }
            }
            if (ciyVar.b() && d.F(this.b, true) && (afzdVar = (afzd) ((czj) this.e).a) != null) {
                afzdVar.performClick();
                afzdVar.performAccessibilityAction(16, Bundle.EMPTY);
            }
            return arnb.a;
        }
        aos aosVar = (aos) obj;
        aosVar.getClass();
        ?? r4 = this.b;
        int size = r4.size();
        aggd aggdVar = new aggd(r4, 3);
        Object obj2 = this.e;
        aosVar.b(size, null, aggdVar, new cdj(-1091073711, true, new agij(r4, (agjg) this.c, this.d, this.a, (agii) obj2)));
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agik(boolean z, czj czjVar, afzq afzqVar, Boolean bool, byn bynVar, int i) {
        super(1);
        this.f = i;
        this.a = z;
        this.e = czjVar;
        this.c = afzqVar;
        this.b = bool;
        this.d = bynVar;
    }
}
