package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amby extends ambe {
    private long a = 0;
    private long b = 0;
    private int c = 0;

    private static long n(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    private static long o(long j) {
        return Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L;
    }

    private static long p(long j) {
        return Long.rotateLeft(j * 5545529020109919103L, 33) * (-8663945395140668459L);
    }

    @Override // defpackage.ambe
    protected final ambj b() {
        long j = this.a;
        long j2 = this.c;
        long j3 = j ^ j2;
        long j4 = j2 ^ this.b;
        long j5 = j3 + j4;
        this.a = j5;
        long j6 = j4 + j5;
        this.b = j6;
        long n = n(j5);
        this.a = n;
        long n2 = n(j6);
        long j7 = n + n2;
        this.a = j7;
        this.b = n2 + j7;
        byte[] array = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.a).putLong(this.b).array();
        int i = ambj.b;
        return new ambg(array);
    }

    @Override // defpackage.ambe
    protected final void e(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        long o = o(j) ^ this.a;
        this.a = o;
        long rotateLeft = Long.rotateLeft(o, 27);
        long j3 = this.b;
        this.a = ((rotateLeft + j3) * 5) + 1390208809;
        long p = p(j2) ^ j3;
        this.b = p;
        this.b = ((Long.rotateLeft(p, 31) + this.a) * 5) + 944331445;
        this.c += 16;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x001b. Please report as an issue. */
    @Override // defpackage.ambe
    protected final void m(ByteBuffer byteBuffer) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long ci;
        this.c += byteBuffer.remaining();
        long j7 = 0;
        switch (byteBuffer.remaining()) {
            case 1:
                j = 0;
                ci = j ^ albo.ci(byteBuffer.get(0));
                this.a = o(ci) ^ this.a;
                this.b ^= p(j7);
                return;
            case 2:
                j2 = 0;
                j = j2 ^ (albo.ci(byteBuffer.get(1)) << 8);
                ci = j ^ albo.ci(byteBuffer.get(0));
                this.a = o(ci) ^ this.a;
                this.b ^= p(j7);
                return;
            case 3:
                j3 = 0;
                j2 = j3 ^ (albo.ci(byteBuffer.get(2)) << 16);
                j = j2 ^ (albo.ci(byteBuffer.get(1)) << 8);
                ci = j ^ albo.ci(byteBuffer.get(0));
                this.a = o(ci) ^ this.a;
                this.b ^= p(j7);
                return;
            case 4:
                j4 = 0;
                j3 = j4 ^ (albo.ci(byteBuffer.get(3)) << 24);
                j2 = j3 ^ (albo.ci(byteBuffer.get(2)) << 16);
                j = j2 ^ (albo.ci(byteBuffer.get(1)) << 8);
                ci = j ^ albo.ci(byteBuffer.get(0));
                this.a = o(ci) ^ this.a;
                this.b ^= p(j7);
                return;
            case 5:
                j5 = 0;
                j4 = j5 ^ (albo.ci(byteBuffer.get(4)) << 32);
                j3 = j4 ^ (albo.ci(byteBuffer.get(3)) << 24);
                j2 = j3 ^ (albo.ci(byteBuffer.get(2)) << 16);
                j = j2 ^ (albo.ci(byteBuffer.get(1)) << 8);
                ci = j ^ albo.ci(byteBuffer.get(0));
                this.a = o(ci) ^ this.a;
                this.b ^= p(j7);
                return;
            case 6:
                j6 = 0;
                j5 = (albo.ci(byteBuffer.get(5)) << 40) ^ j6;
                j4 = j5 ^ (albo.ci(byteBuffer.get(4)) << 32);
                j3 = j4 ^ (albo.ci(byteBuffer.get(3)) << 24);
                j2 = j3 ^ (albo.ci(byteBuffer.get(2)) << 16);
                j = j2 ^ (albo.ci(byteBuffer.get(1)) << 8);
                ci = j ^ albo.ci(byteBuffer.get(0));
                this.a = o(ci) ^ this.a;
                this.b ^= p(j7);
                return;
            case 7:
                j6 = albo.ci(byteBuffer.get(6)) << 48;
                j5 = (albo.ci(byteBuffer.get(5)) << 40) ^ j6;
                j4 = j5 ^ (albo.ci(byteBuffer.get(4)) << 32);
                j3 = j4 ^ (albo.ci(byteBuffer.get(3)) << 24);
                j2 = j3 ^ (albo.ci(byteBuffer.get(2)) << 16);
                j = j2 ^ (albo.ci(byteBuffer.get(1)) << 8);
                ci = j ^ albo.ci(byteBuffer.get(0));
                this.a = o(ci) ^ this.a;
                this.b ^= p(j7);
                return;
            case 8:
                ci = byteBuffer.getLong();
                this.a = o(ci) ^ this.a;
                this.b ^= p(j7);
                return;
            case 9:
                j7 ^= albo.ci(byteBuffer.get(8));
                ci = byteBuffer.getLong();
                this.a = o(ci) ^ this.a;
                this.b ^= p(j7);
                return;
            case 10:
                j7 ^= albo.ci(byteBuffer.get(9)) << 8;
                j7 ^= albo.ci(byteBuffer.get(8));
                ci = byteBuffer.getLong();
                this.a = o(ci) ^ this.a;
                this.b ^= p(j7);
                return;
            case 11:
                j7 ^= albo.ci(byteBuffer.get(10)) << 16;
                j7 ^= albo.ci(byteBuffer.get(9)) << 8;
                j7 ^= albo.ci(byteBuffer.get(8));
                ci = byteBuffer.getLong();
                this.a = o(ci) ^ this.a;
                this.b ^= p(j7);
                return;
            case 12:
                j7 ^= albo.ci(byteBuffer.get(11)) << 24;
                j7 ^= albo.ci(byteBuffer.get(10)) << 16;
                j7 ^= albo.ci(byteBuffer.get(9)) << 8;
                j7 ^= albo.ci(byteBuffer.get(8));
                ci = byteBuffer.getLong();
                this.a = o(ci) ^ this.a;
                this.b ^= p(j7);
                return;
            case 13:
                j7 ^= albo.ci(byteBuffer.get(12)) << 32;
                j7 ^= albo.ci(byteBuffer.get(11)) << 24;
                j7 ^= albo.ci(byteBuffer.get(10)) << 16;
                j7 ^= albo.ci(byteBuffer.get(9)) << 8;
                j7 ^= albo.ci(byteBuffer.get(8));
                ci = byteBuffer.getLong();
                this.a = o(ci) ^ this.a;
                this.b ^= p(j7);
                return;
            case 14:
                j7 ^= albo.ci(byteBuffer.get(13)) << 40;
                j7 ^= albo.ci(byteBuffer.get(12)) << 32;
                j7 ^= albo.ci(byteBuffer.get(11)) << 24;
                j7 ^= albo.ci(byteBuffer.get(10)) << 16;
                j7 ^= albo.ci(byteBuffer.get(9)) << 8;
                j7 ^= albo.ci(byteBuffer.get(8));
                ci = byteBuffer.getLong();
                this.a = o(ci) ^ this.a;
                this.b ^= p(j7);
                return;
            case 15:
                j7 = albo.ci(byteBuffer.get(14)) << 48;
                j7 ^= albo.ci(byteBuffer.get(13)) << 40;
                j7 ^= albo.ci(byteBuffer.get(12)) << 32;
                j7 ^= albo.ci(byteBuffer.get(11)) << 24;
                j7 ^= albo.ci(byteBuffer.get(10)) << 16;
                j7 ^= albo.ci(byteBuffer.get(9)) << 8;
                j7 ^= albo.ci(byteBuffer.get(8));
                ci = byteBuffer.getLong();
                this.a = o(ci) ^ this.a;
                this.b ^= p(j7);
                return;
            default:
                throw new AssertionError("Should never get here.");
        }
    }
}
