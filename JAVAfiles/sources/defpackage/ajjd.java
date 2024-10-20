package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajjd extends Property {
    public ajjd(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = ajjf.a;
        return Float.valueOf(((ajjf) obj).f);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        int i;
        ajjf ajjfVar = (ajjf) obj;
        float floatValue = ((Float) obj2).floatValue();
        ajjfVar.f = floatValue;
        float f = floatValue * 6000.0f;
        ajjo ajjoVar = (ajjo) ajjfVar.k.get(0);
        float f2 = ajjfVar.f * 1080.0f;
        int[] iArr = ajjf.a;
        int length = iArr.length;
        int i2 = 0;
        float f3 = 0.0f;
        while (true) {
            i = (int) f;
            if (i2 >= 4) {
                break;
            }
            f3 += ajjfVar.c.getInterpolation(ajjf.f(i, iArr[i2], 500)) * 90.0f;
            i2++;
        }
        ajjoVar.g = f2 + f3;
        float interpolation = ajjfVar.c.getInterpolation(ajjf.f(i, 0, 3000)) - ajjfVar.c.getInterpolation(ajjf.f(i, 3000, 3000));
        ajjoVar.a = brg.a;
        float[] fArr = ajjf.b;
        float m = ajgk.m(fArr[0], fArr[1], interpolation);
        ajjoVar.b = m;
        float f4 = ajjfVar.g;
        if (f4 > brg.a) {
            ajjoVar.b = m * (1.0f - f4);
        }
        int i3 = 0;
        while (true) {
            int[] iArr2 = ajjf.a;
            int length2 = iArr2.length;
            if (i3 >= 4) {
                break;
            }
            float f5 = ajjf.f(i, iArr2[i3], 100);
            if (f5 >= brg.a && f5 <= 1.0f) {
                int i4 = i3 + ajjfVar.e;
                int[] iArr3 = ajjfVar.d.c;
                int length3 = iArr3.length;
                int i5 = i4 % length3;
                int i6 = (i5 + 1) % length3;
                int i7 = iArr3[i5];
                int i8 = iArr3[i6];
                ((ajjo) ajjfVar.k.get(0)).c = ajde.a(ajjfVar.c.getInterpolation(f5), Integer.valueOf(i7), Integer.valueOf(i8)).intValue();
                break;
            }
            i3++;
        }
        ajjfVar.j.invalidateSelf();
    }
}
