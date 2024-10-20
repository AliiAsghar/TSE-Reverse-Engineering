package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atcz {
    public Object a;
    public Object b;
    public Object c;
    protected Object d;

    public atcz() {
    }

    private static void f(atcy[] atcyVarArr, int i, int i2) {
        atcy atcyVar = atcyVarArr[i];
        atcyVarArr[i] = atcyVarArr[i2];
        atcyVarArr[i2] = atcyVar;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, aqtk] */
    public final aqta a() {
        this.a.getClass();
        this.b.getClass();
        this.d.getClass();
        albo.U(true, "at least one of channelRef and subchannelRef must be null");
        Object obj = this.a;
        return new aqta((String) obj, (aqsz) this.b, ((Long) this.d).longValue(), this.c);
    }

    public final void b(long j) {
        this.d = Long.valueOf(j);
    }

    public final aqsy c() {
        Object obj = this.a;
        Object obj2 = this.d;
        return new aqsy((SocketAddress) obj, (InetSocketAddress) obj2, (String) this.c, (String) this.b);
    }

    public final void d(SocketAddress socketAddress) {
        socketAddress.getClass();
        this.a = socketAddress;
    }

    public final void e(InetSocketAddress inetSocketAddress) {
        inetSocketAddress.getClass();
        this.d = inetSocketAddress;
    }

    public atcz(atcu atcuVar, atcy atcyVar) {
        int i;
        int b;
        int[] iArr;
        this.a = atcuVar;
        this.b = atcyVar;
        int c = atcyVar.c();
        this.c = new atcy[c];
        int i2 = 0;
        while (true) {
            i = c >> 1;
            if (i2 >= i) {
                break;
            }
            int i3 = i2 + i2;
            int[] iArr2 = new int[i3 + 1];
            iArr2[i3] = 1;
            ((atcy[]) this.c)[i2] = new atcy((atcu) this.a, iArr2);
            i2++;
        }
        while (i < c) {
            int i4 = i + i;
            int[] iArr3 = new int[i4 + 1];
            iArr3[i4] = 1;
            atcy atcyVar2 = new atcy((atcu) this.a, iArr3);
            Object obj = this.c;
            Object obj2 = this.b;
            int[] iArr4 = atcyVar2.c;
            int[] iArr5 = ((atcy) obj2).c;
            int a = atcy.a(iArr5);
            if (a != -1) {
                int length = iArr4.length;
                int[] iArr6 = new int[length];
                int a2 = atcyVar2.a.a(atcy.d(iArr5));
                System.arraycopy(iArr4, 0, iArr6, 0, length);
                while (a <= atcy.a(iArr6)) {
                    int b2 = atcyVar2.a.b(atcy.d(iArr6), a2);
                    int a3 = atcy.a(iArr6) - a;
                    int a4 = atcy.a(iArr5);
                    if (a4 == -1) {
                        iArr = new int[1];
                    } else {
                        int[] iArr7 = new int[a4 + a3 + 1];
                        System.arraycopy(iArr5, 0, iArr7, a3, a4 + 1);
                        iArr = iArr7;
                    }
                    iArr6 = atcy.i(atcyVar2.h(iArr, b2), iArr6);
                }
                ((atcy[]) obj)[i] = new atcy(atcyVar2.a, iArr6);
                i++;
            } else {
                throw new ArithmeticException("Division by zero");
            }
        }
        int c2 = ((atcy) this.b).c();
        atcy[] atcyVarArr = new atcy[c2];
        int i5 = c2 - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            atcyVarArr[i6] = new atcy(((atcy[]) this.c)[i6]);
        }
        this.d = new atcy[c2];
        while (i5 >= 0) {
            ((atcy[]) this.d)[i5] = new atcy((atcu) this.a, i5);
            i5--;
        }
        int i7 = 0;
        while (i7 < c2) {
            int i8 = i7 + 1;
            if (atcyVarArr[i7].b(i7) == 0) {
                boolean z = false;
                int i9 = i8;
                while (i9 < c2) {
                    if (atcyVarArr[i9].b(i7) != 0) {
                        f(atcyVarArr, i7, i9);
                        f((atcy[]) this.d, i7, i9);
                        i9 = c2;
                        z = true;
                    }
                    i9++;
                }
                if (!z) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int a5 = ((atcu) this.a).a(atcyVarArr[i7].b(i7));
            atcyVarArr[i7].g(a5);
            ((atcy[]) this.d)[i7].g(a5);
            for (int i10 = 0; i10 < c2; i10++) {
                if (i10 != i7 && (b = atcyVarArr[i10].b(i7)) != 0) {
                    atcy e = atcyVarArr[i7].e(b);
                    atcy e2 = ((atcy[]) this.d)[i7].e(b);
                    atcyVarArr[i10].f(e);
                    ((atcy[]) this.d)[i10].f(e2);
                }
            }
            i7 = i8;
        }
    }
}
