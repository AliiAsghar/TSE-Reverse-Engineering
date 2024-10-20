package defpackage;

import android.graphics.ComposeShader;
import android.graphics.PorterDuff;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afbw extends clz {
    final /* synthetic */ float a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;

    public afbw(float f, long j, long j2, long j3) {
        this.a = f;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    @Override // defpackage.clz
    public final Shader b(long j) {
        double d = (this.a / 180.0f) * 3.141592653589793d;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        float sqrt = (float) Math.sqrt((((float) Math.pow(Float.intBitsToFloat(i), 2.0d)) + ((float) Math.pow(Float.intBitsToFloat(i2), 2.0d))) / 2.0f);
        long aH = d.aH(cju.a(j), (Float.floatToRawIntBits(cos * sqrt) << 32) | (Float.floatToRawIntBits(sin * sqrt) & 4294967295L));
        float min = Math.min(arrn.o(Float.intBitsToFloat((int) (aH >> 32)), brg.a), Float.intBitsToFloat(i));
        float intBitsToFloat = Float.intBitsToFloat(i2) - Math.min(arrn.o(Float.intBitsToFloat((int) (aH & 4294967295L)), brg.a), Float.intBitsToFloat(i2));
        long floatToRawIntBits = Float.floatToRawIntBits(min);
        long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
        float intBitsToFloat2 = Float.intBitsToFloat(i);
        long j2 = (floatToRawIntBits2 & 4294967295L) | (floatToRawIntBits << 32);
        Shader b = cki.b(a.Q((Float.floatToRawIntBits(Float.intBitsToFloat(i2)) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32), j2), j2, aqjn.B(new cku(this.b), new cku(this.c)));
        if (a.bB(this.d, cku.g)) {
            return b;
        }
        float intBitsToFloat3 = Float.intBitsToFloat(i);
        float intBitsToFloat4 = Float.intBitsToFloat(i2);
        long floatToRawIntBits3 = Float.floatToRawIntBits(intBitsToFloat3);
        long floatToRawIntBits4 = Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L;
        long j3 = this.d;
        return new ComposeShader(cki.b(0L, floatToRawIntBits4 | (floatToRawIntBits3 << 32), aqjn.B(new cku(j3), new cku(j3))), b, PorterDuff.Mode.DST_OVER);
    }
}
