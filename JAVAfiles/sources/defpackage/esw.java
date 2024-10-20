package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esw implements esr {
    public int b;
    public esp e;
    public esp f;
    public boolean g;
    public esv h;
    public long i;
    public long j;
    private esp l;
    private ByteBuffer m;
    private ShortBuffer n;
    private ByteBuffer o;
    private boolean p;
    public float c = 1.0f;
    public float d = 1.0f;
    private esp k = esp.a;

    public esw() {
        esp espVar = esp.a;
        this.l = espVar;
        this.e = espVar;
        this.f = espVar;
        ByteBuffer byteBuffer = a;
        this.m = byteBuffer;
        this.n = byteBuffer.asShortBuffer();
        this.o = a;
        this.b = -1;
    }

    @Override // defpackage.esr
    public final long a(long j) {
        if (this.j >= 1024) {
            long j2 = this.i;
            dzg.g(this.h);
            long b = j2 - r3.b();
            int i = this.f.b;
            int i2 = this.e.b;
            if (i == i2) {
                return eul.w(j, this.j, b);
            }
            return eul.w(j, this.j * i2, b * i);
        }
        return (long) (j / this.c);
    }

    @Override // defpackage.esr
    public final esp b(esp espVar) {
        if (espVar.d == 2) {
            int i = this.b;
            if (i == -1) {
                i = espVar.b;
            }
            this.k = espVar;
            esp espVar2 = new esp(i, espVar.c, 2);
            this.l = espVar2;
            this.g = true;
            return espVar2;
        }
        throw new esq(espVar);
    }

    @Override // defpackage.esr
    public final ByteBuffer c() {
        int a;
        esv esvVar = this.h;
        if (esvVar != null && (a = esvVar.a()) > 0) {
            if (this.m.capacity() < a) {
                ByteBuffer order = ByteBuffer.allocateDirect(a).order(ByteOrder.nativeOrder());
                this.m = order;
                this.n = order.asShortBuffer();
            } else {
                this.m.clear();
                this.n.clear();
            }
            ShortBuffer shortBuffer = this.n;
            int min = Math.min(shortBuffer.remaining() / esvVar.a, esvVar.i);
            shortBuffer.put(esvVar.h, 0, esvVar.a * min);
            int i = esvVar.i - min;
            esvVar.i = i;
            short[] sArr = esvVar.h;
            int i2 = esvVar.a;
            System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
            this.j += a;
            this.m.limit(a);
            this.o = this.m;
        }
        ByteBuffer byteBuffer = this.o;
        this.o = a;
        return byteBuffer;
    }

    @Override // defpackage.esr
    public final void d() {
        if (h()) {
            esp espVar = this.k;
            this.e = espVar;
            this.f = this.l;
            if (this.g) {
                this.h = new esv(espVar.b, espVar.c, this.c, this.d, this.f.b);
            } else {
                esv esvVar = this.h;
                if (esvVar != null) {
                    esvVar.g = 0;
                    esvVar.i = 0;
                    esvVar.j = 0;
                    esvVar.k = 0;
                    esvVar.l = 0;
                    esvVar.m = 0;
                    esvVar.n = 0;
                    esvVar.o = 0;
                    esvVar.p = 0;
                    esvVar.q = 0;
                    esvVar.r = 0.0d;
                }
            }
        }
        this.o = a;
        this.i = 0L;
        this.j = 0L;
        this.p = false;
    }

    @Override // defpackage.esr
    public final void e() {
        int i;
        esv esvVar = this.h;
        if (esvVar != null) {
            int i2 = esvVar.g;
            int i3 = esvVar.m;
            int i4 = i2 - i3;
            double d = i3;
            float f = esvVar.c;
            float f2 = esvVar.b;
            int i5 = esvVar.i + ((int) ((((((i4 / (f2 / f)) + d) + esvVar.r) + esvVar.j) / (esvVar.d * f)) + 0.5d));
            esvVar.r = 0.0d;
            int i6 = esvVar.e;
            esvVar.f = esvVar.d(esvVar.f, i2, i6 + i6 + i2);
            int i7 = 0;
            while (true) {
                int i8 = esvVar.e;
                int i9 = esvVar.a;
                i = i8 + i8;
                if (i7 >= i * i9) {
                    break;
                }
                esvVar.f[(i9 * i2) + i7] = 0;
                i7++;
            }
            esvVar.g += i;
            esvVar.c();
            if (esvVar.i > i5) {
                esvVar.i = i5;
            }
            esvVar.g = 0;
            esvVar.m = 0;
            esvVar.j = 0;
        }
        this.p = true;
    }

    @Override // defpackage.esr
    public final void f(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        esv esvVar = this.h;
        dzg.g(esvVar);
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.i += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i = esvVar.a;
        int i2 = remaining2 / i;
        int i3 = i * i2;
        esvVar.f = esvVar.d(esvVar.f, esvVar.g, i2);
        asShortBuffer.get(esvVar.f, esvVar.g * esvVar.a, (i3 + i3) / 2);
        esvVar.g += i2;
        esvVar.c();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // defpackage.esr
    public final void g() {
        this.c = 1.0f;
        this.d = 1.0f;
        this.k = esp.a;
        esp espVar = esp.a;
        this.l = espVar;
        this.e = espVar;
        this.f = espVar;
        ByteBuffer byteBuffer = a;
        this.m = byteBuffer;
        this.n = byteBuffer.asShortBuffer();
        this.o = a;
        this.b = -1;
        this.g = false;
        this.h = null;
        this.i = 0L;
        this.j = 0L;
        this.p = false;
    }

    @Override // defpackage.esr
    public final boolean h() {
        if (this.l.b == -1) {
            return false;
        }
        if (Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f) {
            return true;
        }
        if (this.l.b == this.k.b) {
            return false;
        }
        return true;
    }

    @Override // defpackage.esr
    public final boolean i() {
        if (!this.p) {
            return false;
        }
        esv esvVar = this.h;
        if (esvVar != null && esvVar.a() != 0) {
            return false;
        }
        return true;
    }
}
