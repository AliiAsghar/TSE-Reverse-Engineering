package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdb extends hdd {
    private final ico e;

    public hdb(List list) {
        super(list);
        ico icoVar = (ico) ((hie) list.get(0)).b;
        int length = icoVar != null ? ((int[]) icoVar.b).length : 0;
        this.e = new ico(new float[length], new int[length], (short[]) null);
    }

    @Override // defpackage.hcw
    public final /* bridge */ /* synthetic */ Object f(hie hieVar, float f) {
        ico icoVar = (ico) hieVar.b;
        ico icoVar2 = (ico) hieVar.c;
        int length = ((int[]) icoVar.b).length;
        int length2 = ((int[]) icoVar2.b).length;
        if (length == length2) {
            for (int i = 0; i < ((int[]) icoVar.b).length; i++) {
                ico icoVar3 = this.e;
                float f2 = ((float[]) icoVar.a)[i];
                float f3 = ((float[]) icoVar2.a)[i];
                PointF pointF = hhy.a;
                ((float[]) icoVar3.a)[i] = f2 + ((f3 - f2) * f);
                ((int[]) icoVar3.b)[i] = gvf.S(f, ((int[]) icoVar.b)[i], ((int[]) icoVar2.b)[i]);
            }
            return this.e;
        }
        throw new IllegalArgumentException(a.cl(length2, length, "Cannot interpolate between gradients. Lengths vary (", " vs ", ")"));
    }
}
