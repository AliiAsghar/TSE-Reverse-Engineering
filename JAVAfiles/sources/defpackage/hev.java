package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hev extends hff {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hev(List list) {
        super(list);
        for (int i = 0; i < list.size(); i++) {
            hie hieVar = (hie) list.get(i);
            ico icoVar = (ico) hieVar.b;
            ico icoVar2 = (ico) hieVar.c;
            if (icoVar != null && icoVar2 != null) {
                Object obj = icoVar.a;
                int length = ((float[]) obj).length;
                Object obj2 = icoVar2.a;
                int length2 = ((float[]) obj2).length;
                if (length != length2) {
                    int i2 = length + length2;
                    float[] fArr = new float[i2];
                    System.arraycopy(obj, 0, fArr, 0, length);
                    System.arraycopy(obj2, 0, fArr, length, length2);
                    Arrays.sort(fArr);
                    float f = Float.NaN;
                    int i3 = 0;
                    for (int i4 = 0; i4 < i2; i4++) {
                        float f2 = fArr[i4];
                        if (f2 != f) {
                            fArr[i3] = f2;
                            i3++;
                            f = fArr[i4];
                        }
                    }
                    float[] copyOfRange = Arrays.copyOfRange(fArr, 0, i3);
                    hieVar = new hie(icoVar.K(copyOfRange), icoVar2.K(copyOfRange));
                }
            }
            list.set(i, hieVar);
        }
    }

    @Override // defpackage.hfe
    public final hcw a() {
        return new hdb(this.a);
    }
}
