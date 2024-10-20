package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flz {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final fvq k;
    private final erk l;

    public flz(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, fvq fvqVar, erk erkVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = g(i5);
        this.g = i6;
        this.h = i7;
        this.i = f(i7);
        this.j = j;
        this.k = fvqVar;
        this.l = erkVar;
    }

    private static int f(int i) {
        if (i != 8) {
            if (i != 12) {
                if (i != 16) {
                    if (i != 20) {
                        if (i != 24) {
                            return -1;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    private static int g(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long a() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.e;
    }

    public final long b(long j) {
        return eul.q((j * this.e) / 1000000, 0L, this.j - 1);
    }

    public final eqn c(byte[] bArr, erk erkVar) {
        bArr[4] = Byte.MIN_VALUE;
        erk d = d(erkVar);
        eqm eqmVar = new eqm();
        eqmVar.b("audio/flac");
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        eqmVar.n = i;
        eqmVar.B = this.g;
        eqmVar.C = this.e;
        eqmVar.D = eul.m(this.h);
        eqmVar.p = Collections.singletonList(bArr);
        eqmVar.k = d;
        return new eqn(eqmVar);
    }

    public final erk d(erk erkVar) {
        erk erkVar2 = this.l;
        if (erkVar2 == null) {
            return erkVar;
        }
        return erkVar2.d(erkVar);
    }

    public final flz e(fvq fvqVar) {
        return new flz(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, fvqVar, this.l);
    }

    public flz(byte[] bArr, int i) {
        fjl fjlVar = new fjl(bArr, (byte[]) null);
        fjlVar.q(i * 8);
        this.a = fjlVar.i(16);
        this.b = fjlVar.i(16);
        this.c = fjlVar.i(24);
        this.d = fjlVar.i(24);
        int i2 = fjlVar.i(20);
        this.e = i2;
        this.f = g(i2);
        this.g = fjlVar.i(3) + 1;
        int i3 = fjlVar.i(5) + 1;
        this.h = i3;
        this.i = f(i3);
        this.j = fjlVar.j(36);
        this.k = null;
        this.l = null;
    }
}
