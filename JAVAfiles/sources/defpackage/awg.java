package defpackage;

import defpackage.cln;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awg extends awa {
    public awg(awb awbVar, awb awbVar2, awb awbVar3, awb awbVar4) {
        super(awbVar, awbVar2, awbVar3, awbVar4);
    }

    @Override // defpackage.awa
    public final cln b(long j, float f, float f2, float f3, float f4, drk drkVar) {
        float f5;
        float f6;
        float f7;
        float f8;
        if (f + f2 + f3 + f4 == brg.a) {
            return new cln.b(cju.b(j));
        }
        cjp b = cju.b(j);
        if (drkVar == drk.a) {
            f5 = f;
        } else {
            f5 = f2;
        }
        long floatToRawIntBits = Float.floatToRawIntBits(f5);
        long floatToRawIntBits2 = Float.floatToRawIntBits(f5);
        if (drkVar != drk.a) {
            f6 = f;
        } else {
            f6 = f2;
        }
        long floatToRawIntBits3 = Float.floatToRawIntBits(f6);
        long floatToRawIntBits4 = Float.floatToRawIntBits(f6);
        if (drkVar == drk.a) {
            f7 = f3;
        } else {
            f7 = f4;
        }
        long floatToRawIntBits5 = Float.floatToRawIntBits(f7);
        long floatToRawIntBits6 = Float.floatToRawIntBits(f7);
        if (drkVar != drk.a) {
            f8 = f3;
        } else {
            f8 = f4;
        }
        return new cln.c(cjs.a(b, (floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L), (floatToRawIntBits3 << 32) | (floatToRawIntBits4 & 4294967295L), (floatToRawIntBits5 << 32) | (floatToRawIntBits6 & 4294967295L), (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof awg) {
            awg awgVar = (awg) obj;
            if (d.F(this.a, awgVar.a) && d.F(this.b, awgVar.b) && d.F(this.c, awgVar.c) && d.F(this.d, awgVar.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
