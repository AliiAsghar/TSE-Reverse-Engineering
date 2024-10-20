package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkw implements fke, fkp {
    public int f;
    public SurfaceTexture g;
    private byte[] m;
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final fku c = new fku();
    public final akju j = new akju((byte[]) null, (byte[]) null);
    public final fxg h = new fxg((byte[]) null);
    public final fxg i = new fxg((byte[]) null);
    public final float[] d = new float[16];
    public final float[] e = new float[16];
    private volatile int k = 0;
    private int l = -1;

    @Override // defpackage.fkp
    public final void a(long j, float[] fArr) {
        ((fxg) this.j.d).h(j, fArr);
    }

    @Override // defpackage.fkp
    public final void b() {
        this.h.i();
        akju akjuVar = this.j;
        ((fxg) akjuVar.d).i();
        akjuVar.a = false;
        this.b.set(true);
    }

    @Override // defpackage.fke
    public final void c(long j, long j2, eqn eqnVar, MediaFormat mediaFormat) {
        anna annaVar;
        int i;
        int i2;
        float f;
        int i3;
        int i4;
        int i5;
        this.h.h(j2, Long.valueOf(j));
        byte[] bArr = eqnVar.A;
        byte[] bArr2 = this.m;
        int i6 = this.l;
        this.m = bArr;
        int i7 = eqnVar.B;
        if (i7 == -1) {
            i7 = 0;
        }
        this.l = i7;
        if (i6 == i7 && Arrays.equals(bArr2, this.m)) {
            return;
        }
        byte[] bArr3 = this.m;
        if (bArr3 != null) {
            annaVar = eee.f(bArr3, this.l);
        } else {
            annaVar = null;
        }
        if (annaVar == null || !fku.a(annaVar)) {
            int i8 = this.l;
            int i9 = 1;
            d.s(true);
            d.s(true);
            d.s(true);
            d.s(true);
            d.s(true);
            float radians = (float) Math.toRadians(180.0d);
            float radians2 = (float) Math.toRadians(360.0d);
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i10 < 36) {
                float f2 = radians / 36.0f;
                float f3 = radians / 2.0f;
                int i13 = i10 + 1;
                int i14 = 0;
                while (i14 < 73) {
                    int i15 = 0;
                    while (i15 < 2) {
                        float f4 = (i13 * f2) - f3;
                        float f5 = (i10 * f2) - f3;
                        float f6 = (radians2 / 72.0f) * i14;
                        int i16 = i11 + 1;
                        double d = (f6 + 3.1415927f) - (radians2 / 2.0f);
                        double sin = Math.sin(d) * 50.0d;
                        if (i15 == 0) {
                            i3 = i8;
                            i = i14;
                            int i17 = i13;
                            f = f5;
                            i2 = i17;
                        } else {
                            i = i14;
                            i2 = i13;
                            f = f4;
                            i3 = i8;
                        }
                        double d2 = f;
                        float f7 = f2;
                        int i18 = i15;
                        fArr[i11] = -((float) (sin * Math.cos(d2)));
                        float f8 = f3;
                        fArr[i16] = (float) (Math.sin(d2) * 50.0d);
                        int i19 = i11 + 3;
                        fArr[i11 + 2] = (float) (Math.cos(d) * 50.0d * Math.cos(d2));
                        fArr2[i12] = f6 / radians2;
                        int i20 = i12 + 2;
                        fArr2[i12 + 1] = ((i10 + i18) * f7) / radians;
                        if (i == 0) {
                            i4 = i;
                            if (i18 == 0) {
                                i5 = 0;
                                System.arraycopy(fArr, i11, fArr, i19, 3);
                                i11 += 6;
                                System.arraycopy(fArr2, i12, fArr2, i20, 2);
                                i12 += 4;
                            }
                            i5 = i18;
                            i12 = i20;
                            i11 = i19;
                        } else {
                            i4 = i;
                            if (i4 == 72) {
                                i5 = i18;
                                if (i5 == 1) {
                                    i5 = 1;
                                    System.arraycopy(fArr, i11, fArr, i19, 3);
                                    i11 += 6;
                                    System.arraycopy(fArr2, i12, fArr2, i20, 2);
                                    i12 += 4;
                                }
                                i12 = i20;
                                i11 = i19;
                            }
                            i5 = i18;
                            i12 = i20;
                            i11 = i19;
                        }
                        i15 = i5 + 1;
                        i14 = i4;
                        f2 = f7;
                        i8 = i3;
                        f3 = f8;
                        i13 = i2;
                    }
                    i14++;
                    i8 = i8;
                    i13 = i13;
                }
                i10 = i13;
                i9 = 1;
            }
            int i21 = i9;
            fkt fktVar = new fkt(0, fArr, fArr2, i21);
            fkt[] fktVarArr = new fkt[i21];
            fktVarArr[0] = fktVar;
            efu efuVar = new efu(fktVarArr);
            annaVar = new anna(efuVar, efuVar, i8);
        }
        this.i.h(j2, annaVar);
    }
}
