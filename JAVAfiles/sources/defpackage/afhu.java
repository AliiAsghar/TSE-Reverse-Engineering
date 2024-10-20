package defpackage;

import android.util.Size;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afhu implements afhr {
    final /* synthetic */ afhv a;

    public afhu(afhv afhvVar) {
        this.a = afhvVar;
    }

    @Override // defpackage.afhr
    public final Size a(int i) {
        afht afhtVar;
        aeke aekeVar = this.a.f;
        if (aekeVar == null) {
            arro.b("gridState");
            aekeVar = null;
        }
        if (aekeVar instanceof afht) {
            afhtVar = (afht) aekeVar;
        } else {
            afhtVar = null;
        }
        if (afhtVar == null) {
            return null;
        }
        afhq afhqVar = afhtVar.a;
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    Size size = afhqVar.b;
                    if (size == null) {
                        arro.b("doubleSpanSize");
                        return null;
                    }
                    return size;
                }
                return new Size(afhqVar.c, arsk.f(afhqVar.d * 0.75d));
            }
            return new Size(afhqVar.c, arsk.f(afhqVar.d * 0.25d));
        }
        return new Size(afhqVar.c, afhqVar.d);
    }

    @Override // defpackage.afhr
    public final boolean b() {
        aeke aekeVar = this.a.f;
        if (aekeVar != null && (aekeVar instanceof afht)) {
            return true;
        }
        return false;
    }
}
