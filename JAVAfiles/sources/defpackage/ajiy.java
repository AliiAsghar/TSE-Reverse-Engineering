package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajiy extends Property {
    public ajiy(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = ajja.a;
        return Float.valueOf(((ajja) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        int i;
        ajja ajjaVar = (ajja) obj;
        float floatValue = ((Float) obj2).floatValue();
        ajjaVar.g = floatValue;
        float f = floatValue * 5400.0f;
        ajjo ajjoVar = (ajjo) ajjaVar.k.get(0);
        float f2 = ajjaVar.g * 1520.0f;
        ajjoVar.a = (-20.0f) + f2;
        ajjoVar.b = f2;
        int i2 = 0;
        while (true) {
            i = (int) f;
            if (i2 >= 4) {
                break;
            }
            ajjoVar.b += ajjaVar.d.getInterpolation(ajja.f(i, ajja.a[i2], 667)) * 250.0f;
            ajjoVar.a += ajjaVar.d.getInterpolation(ajja.f(i, ajja.b[i2], 667)) * 250.0f;
            i2++;
        }
        float f3 = ajjoVar.a;
        float f4 = ajjoVar.b;
        float f5 = f3 + ((f4 - f3) * ajjaVar.h);
        ajjoVar.a = f5;
        ajjoVar.a = f5 / 360.0f;
        ajjoVar.b = f4 / 360.0f;
        int i3 = 0;
        while (true) {
            if (i3 >= 4) {
                break;
            }
            float f6 = ajja.f(i, ajja.c[i3], 333);
            if (f6 > brg.a && f6 < 1.0f) {
                int i4 = i3 + ajjaVar.f;
                int[] iArr = ajjaVar.e.c;
                int length = iArr.length;
                int i5 = i4 % length;
                int i6 = (i5 + 1) % length;
                int i7 = iArr[i5];
                int i8 = iArr[i6];
                ((ajjo) ajjaVar.k.get(0)).c = ajde.a(ajjaVar.d.getInterpolation(f6), Integer.valueOf(i7), Integer.valueOf(i8)).intValue();
                break;
            }
            i3++;
        }
        ajjaVar.j.invalidateSelf();
    }
}
