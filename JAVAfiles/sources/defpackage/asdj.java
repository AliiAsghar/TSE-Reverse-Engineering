package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class asdj implements asdv {
    public final arpi a;
    public final int b;
    public final int c;

    public asdj(arpi arpiVar, int i, int i2) {
        this.a = arpiVar;
        this.b = i;
        this.c = i2;
        boolean z = arwh.a;
    }

    public static /* synthetic */ Object h(asdj asdjVar, asaj asajVar, arpe arpeVar) {
        Object d = arwi.d(new albu(asajVar, asdjVar, (arpe) null, 2), arpeVar);
        if (d == arpl.a) {
            return d;
        }
        return arnb.a;
    }

    @Override // defpackage.asai
    public Object a(asaj asajVar, arpe arpeVar) {
        return h(this, asajVar, arpeVar);
    }

    public abstract Object b(arzu arzuVar, arpe arpeVar);

    protected abstract asdj c(arpi arpiVar, int i, int i2);

    protected String d() {
        return null;
    }

    public arzw e(arwe arweVar) {
        arwf arwfVar = arwf.c;
        akgp akgpVar = new akgp(this, (arpe) null, 6);
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        int i2 = this.c;
        return arhi.q(arweVar, this.a, i, i2, arwfVar, akgpVar);
    }

    public asai f() {
        return null;
    }

    @Override // defpackage.asdv
    public final asai hp(arpi arpiVar, int i, int i2) {
        boolean z = arwh.a;
        arpi plus = arpiVar.plus(this.a);
        if (i2 == 1) {
            int i3 = this.b;
            if (i3 != -3) {
                if (i != -3) {
                    if (i3 != -2) {
                        if (i != -2 && (i3 = i3 + i) < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
                i = i3;
            }
            i2 = this.c;
        }
        if (d.F(plus, this.a) && i == this.b && i2 == this.c) {
            return this;
        }
        return c(plus, i, i2);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String d = d();
        if (d != null) {
            arrayList.add(d);
        }
        arpi arpiVar = this.a;
        if (arpiVar != arpj.a) {
            Objects.toString(arpiVar);
            arrayList.add("context=".concat(String.valueOf(arpiVar)));
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add(a.bV(i, "capacity="));
        }
        int i2 = this.c;
        if (i2 != 1) {
            Objects.toString(arwi.p(i2));
            arrayList.add("onBufferOverflow=".concat(arwi.p(i2)));
        }
        return arwi.a(this) + "[" + aqjn.aK(arrayList, ", ", null, null, null, 62) + "]";
    }
}
