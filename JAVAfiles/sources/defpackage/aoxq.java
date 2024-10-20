package defpackage;

import java.nio.FloatBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoxq {
    public static final FloatBuffer a = aoxt.b(brg.a, brg.a, 1.0f, brg.a, brg.a, 1.0f, 1.0f, 1.0f);
    public static final FloatBuffer b;
    private static final aoxp h;
    private static final aoxp i;
    private static final aoxp j;
    private static final aoxp k;
    private static final aoxp[] l;
    public int d;
    public int e;
    public int c = 0;
    public final float[] f = new float[16];
    public final boolean g = true;

    static {
        aoxt.b(brg.a, 1.0f, 1.0f, 1.0f, brg.a, brg.a, 1.0f, brg.a);
        aoxp aoxpVar = new aoxp(-1.0f, -1.0f);
        h = aoxpVar;
        aoxp aoxpVar2 = new aoxp(1.0f, -1.0f);
        i = aoxpVar2;
        aoxp aoxpVar3 = new aoxp(-1.0f, 1.0f);
        j = aoxpVar3;
        aoxp aoxpVar4 = new aoxp(1.0f, 1.0f);
        k = aoxpVar4;
        aoxp[] aoxpVarArr = {aoxpVar, aoxpVar2, aoxpVar3, aoxpVar4};
        l = aoxpVarArr;
        b = a(aoxpVarArr, 0, 1, 2, 3);
        a(aoxpVarArr, 2, 0, 3, 1);
        a(aoxpVarArr, 3, 2, 1, 0);
        a(aoxpVarArr, 1, 3, 0, 2);
    }

    private static FloatBuffer a(aoxp[] aoxpVarArr, int i2, int i3, int i4, int i5) {
        aoxp aoxpVar = aoxpVarArr[i2];
        float f = aoxpVar.a;
        float f2 = aoxpVar.b;
        aoxp aoxpVar2 = aoxpVarArr[i3];
        float f3 = aoxpVar2.a;
        float f4 = aoxpVar2.b;
        aoxp aoxpVar3 = aoxpVarArr[i4];
        float f5 = aoxpVar3.a;
        float f6 = aoxpVar3.b;
        aoxp aoxpVar4 = aoxpVarArr[i5];
        return aoxt.b(f, f2, f3, f4, f5, f6, aoxpVar4.a, aoxpVar4.b);
    }
}
