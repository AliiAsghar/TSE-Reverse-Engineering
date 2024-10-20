package defpackage;

import android.content.Context;
import android.graphics.Gainmap;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exa extends ews implements exj, eyn {
    public final etr f;
    public final boolean g;
    public Gainmap h;
    public int i;
    public boolean j;
    public boolean k;
    private final alog m;
    private final alog n;
    private final float[][] o;
    private final float[][] p;
    private final float[] q;
    private final float[] r;
    private final float[] s;
    private alog t;
    private static final alog l = alog.u(new float[]{-1.0f, -1.0f, brg.a, 1.0f}, new float[]{-1.0f, 1.0f, brg.a, 1.0f}, new float[]{1.0f, 1.0f, brg.a, 1.0f}, new float[]{1.0f, -1.0f, brg.a, 1.0f});
    public static final float[] d = {1.0f, 1.0f, 1.0f, brg.a, -0.1646f, 1.8814f, 1.4746f, -0.5714f, brg.a};
    public static final float[] e = {1.1689f, 1.1689f, 1.1689f, brg.a, -0.1881f, 2.1502f, 1.6853f, -0.653f, brg.a};

    public exa(etr etrVar, alog alogVar, alog alogVar2, boolean z) {
        super(z);
        this.f = etrVar;
        this.m = alogVar;
        this.n = alogVar2;
        this.g = z;
        this.o = (float[][]) Array.newInstance((Class<?>) Float.TYPE, alogVar.size(), 16);
        this.p = (float[][]) Array.newInstance((Class<?>) Float.TYPE, alogVar2.size(), 16);
        this.q = ett.z();
        this.r = ett.z();
        this.s = new float[16];
        this.t = l;
        this.i = -1;
    }

    public static etr l(Context context, String str, String str2) {
        try {
            etr etrVar = new etr(context, str, str2);
            etrVar.g("uTexTransformationMatrix", ett.z());
            return etrVar;
        } catch (ets | IOException e2) {
            throw new esh(e2);
        }
    }

    public static exa m(Context context, List list, List list2, boolean z) {
        String str;
        if (true != list2.isEmpty()) {
            str = "shaders/fragment_shader_transformation_es2.glsl";
        } else {
            str = "shaders/fragment_shader_copy_es2.glsl";
        }
        return new exa(l(context, "shaders/vertex_shader_transformation_es2.glsl", str), alog.n(list), alog.n(list2), z);
    }

    public static exa n(etr etrVar, eqd eqdVar, eqd eqdVar2, alog alogVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = eqdVar.c;
        boolean i2 = eqd.i(eqdVar);
        boolean z5 = false;
        if ((i == 1 || i == 2) && eqdVar2.c == 6) {
            z = true;
        } else {
            z = false;
        }
        int i3 = eqdVar2.e;
        int i4 = 7;
        if (i2) {
            if (i3 == 3) {
                i3 = 10;
            }
            if (i3 != 1 && i3 != 10 && i3 != 6) {
                if (i3 != 7) {
                    i4 = i3;
                    z4 = false;
                    d.s(z4);
                    etrVar.h("uOutputColorTransfer", i4);
                }
            } else {
                i4 = i3;
            }
            z4 = true;
            d.s(z4);
            etrVar.h("uOutputColorTransfer", i4);
        } else if (z) {
            if (i3 != 1 && i3 != 6) {
                if (i3 == 7) {
                    z3 = true;
                    i3 = 7;
                } else {
                    z3 = false;
                }
            } else {
                z3 = true;
            }
            d.s(z3);
            etrVar.h("uOutputColorTransfer", i3);
        } else {
            etrVar.h("uSdrWorkingColorSpace", 0);
            if (i3 != 3) {
                if (i3 == 1) {
                    i3 = 1;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = true;
            }
            d.s(z2);
            etrVar.h("uOutputColorTransfer", i3);
        }
        int i5 = alog.d;
        alog alogVar2 = alsx.a;
        if (i2 || z) {
            z5 = true;
        }
        return new exa(etrVar, alogVar, alogVar2, z5);
    }

    private static boolean o(float[][] fArr, float[][] fArr2) {
        boolean z;
        boolean z2 = false;
        for (int i = 0; i < fArr.length; i++) {
            float[] fArr3 = fArr[i];
            float[] fArr4 = fArr2[i];
            if (!Arrays.equals(fArr3, fArr4)) {
                int length = fArr4.length;
                if (length == 16) {
                    z = true;
                } else {
                    z = false;
                }
                dzg.e(z, "A 4x4 transformation matrix must have 16 elements");
                System.arraycopy(fArr4, 0, fArr3, 0, length);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // defpackage.ews
    public final eug a(int i, int i2) {
        return eyd.a(i, i2, this.m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fa  */
    @Override // defpackage.ews
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r18, long r19) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.exa.b(int, long):void");
    }

    @Override // defpackage.ews, defpackage.exw
    public final void e() {
        try {
            this.c.l();
            try {
                this.f.e();
                int i = this.i;
                if (i != -1) {
                    ett.q(i);
                }
            } catch (ets e2) {
                throw new esh(e2);
            }
        } catch (ets e3) {
            throw new esh(e3);
        }
    }

    @Override // defpackage.ews
    public final boolean j() {
        if (this.k && this.j) {
            return false;
        }
        return true;
    }
}
