package defpackage;

import java.lang.reflect.Array;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asyq extends asyo {
    public final byte[] c;
    public final short[][] d;
    public final short[][] e;
    public final short[][] f;
    public final short[][] g;
    public final short[][][] h;
    public final short[][][] i;
    public final short[][][] j;
    public final short[][][] k;
    public final short[][][] l;
    public final short[][][] m;
    public final short[][][] n;
    public final byte[] o;
    public byte[] p;

    public asyq(asyp asypVar, byte[] bArr) {
        super(true, asypVar);
        int i = 0;
        if (asypVar.m == 3) {
            byte[] S = atow.S(bArr, 0, 32);
            this.o = S;
            byte[] S2 = atow.S(bArr, 32, 64);
            this.c = S2;
            int i2 = asypVar.m;
            int i3 = asypVar.g;
            int i4 = asypVar.h;
            int i5 = asypVar.i;
            byte[] O = atow.O(S2);
            byte[] O2 = atow.O(S);
            asyn asynVar = new asyn(O, asypVar.l);
            asyn asynVar2 = new asyn(O2, asypVar.l);
            short[][] aA = atow.aA(asynVar, i4, i5);
            short[][] aA2 = atow.aA(asynVar, i3, i4);
            short[][] aA3 = atow.aA(asynVar, i3, i5);
            short[][] aA4 = atow.aA(asynVar, i4, i5);
            short[][] aD = atow.aD(atow.aE(aA2, aA4), aA3);
            short[][][] aC = atow.aC(asynVar2, i4, i3, i3, true);
            short[][][] aC2 = atow.aC(asynVar2, i4, i3, i4, false);
            short[][][] aC3 = atow.aC(asynVar2, i5, i3, i3, true);
            short[][][] aC4 = atow.aC(asynVar2, i5, i3, i4, false);
            short[][][] aC5 = atow.aC(asynVar2, i5, i3, i5, false);
            short[][][] aC6 = atow.aC(asynVar2, i5, i4, i4, true);
            short[][][] aC7 = atow.aC(asynVar2, i5, i4, i5, false);
            short[][][] aF = atow.aF(aA, aC3, aC);
            short[][][] aF2 = atow.aF(aA, aC4, aC2);
            short[][][] aB = atow.aB(aF);
            short[][][] sArr = new short[i4][];
            while (i < i4) {
                short[][][] sArr2 = aF;
                short[][] aH = atow.aH(aF[i]);
                sArr[i] = aH;
                short[][] aE = atow.aE(aH, aA2);
                sArr[i] = aE;
                sArr[i] = atow.aD(aE, aF2[i]);
                i++;
                aF = sArr2;
                i4 = i4;
            }
            short[][][] sArr3 = new short[i5][];
            short[][][] sArr4 = new short[i5][];
            short[][][] sArr5 = new short[i5][];
            short[][][] sArr6 = new short[i5][];
            short[][][] aB2 = atow.aB(aC3);
            int i6 = 0;
            while (i6 < i5) {
                int i7 = i5;
                short[][] aH2 = atow.aH(aC3[i6]);
                short[][] aE2 = atow.aE(aH2, aA2);
                sArr3[i6] = aE2;
                short[][] sArr7 = aA;
                sArr3[i6] = atow.aD(aE2, aC4[i6]);
                sArr4[i6] = atow.aE(aH2, aD);
                short[][] aD2 = atow.aD(sArr4[i6], atow.aE(aC4[i6], aA4));
                sArr4[i6] = aD2;
                sArr4[i6] = atow.aD(aD2, aC5[i6]);
                short[][] aD3 = atow.aD(atow.aE(aC3[i6], aA2), aC4[i6]);
                short[][] aG = atow.aG(aA2);
                short[][] aE3 = atow.aE(aG, aD3);
                sArr5[i6] = aE3;
                short[][] aD4 = atow.aD(aE3, aC6[i6]);
                sArr5[i6] = aD4;
                int length = aD4.length;
                short[][][] sArr8 = aC5;
                if (length == aD4[0].length) {
                    short[][][] sArr9 = aC3;
                    short[][] sArr10 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, length, length);
                    int i8 = 0;
                    while (i8 < aD4.length) {
                        sArr10[i8][i8] = aD4[i8][i8];
                        short[][][] sArr11 = sArr3;
                        int i9 = i8 + 1;
                        while (i9 < aD4[0].length) {
                            sArr10[i8][i9] = asym.a(aD4[i8][i9], aD4[i9][i8]);
                            i9++;
                            aA2 = aA2;
                            aD4 = aD4;
                        }
                        sArr3 = sArr11;
                        i8 = i9;
                    }
                    sArr5[i6] = sArr10;
                    sArr6[i6] = atow.aE(aG, sArr4[i6]);
                    sArr6[i6] = atow.aD(sArr6[i6], atow.aE(atow.aG(aC4[i6]), aD));
                    short[][] aD5 = atow.aD(sArr6[i6], atow.aE(atow.aH(aC6[i6]), aA4));
                    sArr6[i6] = aD5;
                    sArr6[i6] = atow.aD(aD5, aC7[i6]);
                    i6++;
                    aA = sArr7;
                    i5 = i7;
                    aC5 = sArr8;
                    aC3 = sArr9;
                } else {
                    throw new RuntimeException("Computation to upper triangular matrix is not possible!");
                }
            }
            asyq asyqVar = new asyq(asypVar, O, aA, aA2, aA4, aD, aB, sArr, aB2, sArr3, sArr4, sArr5, sArr6);
            this.p = asyqVar.p;
            this.d = asyqVar.d;
            this.e = asyqVar.e;
            this.f = asyqVar.f;
            this.g = asyqVar.g;
            this.h = asyqVar.h;
            this.i = asyqVar.i;
            this.j = asyqVar.j;
            this.k = asyqVar.k;
            this.l = asyqVar.l;
            this.m = asyqVar.m;
            this.n = asyqVar.n;
            return;
        }
        int i10 = asypVar.g;
        int i11 = asypVar.h;
        int i12 = asypVar.i;
        short[][] sArr12 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i11, i12);
        this.d = sArr12;
        short[][] sArr13 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i10, i11);
        this.e = sArr13;
        short[][] sArr14 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i10, i12);
        this.g = sArr14;
        short[][] sArr15 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i11, i12);
        this.f = sArr15;
        short[][][] sArr16 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i11, i10, i10);
        this.h = sArr16;
        short[][][] sArr17 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i11, i10, i11);
        this.i = sArr17;
        short[][][] sArr18 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i12, i10, i10);
        this.j = sArr18;
        short[][][] sArr19 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i12, i10, i11);
        this.k = sArr19;
        short[][][] sArr20 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i12, i10, i12);
        this.l = sArr20;
        short[][][] sArr21 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i12, i11, i11);
        this.m = sArr21;
        short[][][] sArr22 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i12, i11, i12);
        this.n = sArr22;
        this.o = null;
        byte[] S3 = atow.S(bArr, 0, 32);
        this.c = S3;
        int length2 = S3.length;
        int av = length2 + atow.av(sArr12, bArr, length2);
        int av2 = av + atow.av(sArr13, bArr, av);
        int av3 = av2 + atow.av(sArr14, bArr, av2);
        int av4 = av3 + atow.av(sArr15, bArr, av3);
        int aw = av4 + atow.aw(sArr16, bArr, av4, true);
        int aw2 = aw + atow.aw(sArr17, bArr, aw, false);
        int aw3 = aw2 + atow.aw(sArr18, bArr, aw2, true);
        int aw4 = aw3 + atow.aw(sArr19, bArr, aw3, false);
        int aw5 = aw4 + atow.aw(sArr20, bArr, aw4, false);
        int aw6 = aw5 + atow.aw(sArr21, bArr, aw5, true);
        this.p = atow.S(bArr, aw6 + atow.aw(sArr22, bArr, aw6, false), bArr.length);
    }

    public asyq(asyp asypVar, byte[] bArr, short[][] sArr, short[][] sArr2, short[][] sArr3, short[][] sArr4, short[][][] sArr5, short[][][] sArr6, short[][][] sArr7, short[][][] sArr8, short[][][] sArr9, short[][][] sArr10, short[][][] sArr11) {
        super(true, asypVar);
        this.o = null;
        this.p = null;
        this.c = (byte[]) bArr.clone();
        this.d = atow.az(sArr);
        this.e = atow.az(sArr2);
        this.f = atow.az(sArr3);
        this.g = atow.az(sArr4);
        this.h = atow.aB(sArr5);
        this.i = atow.aB(sArr6);
        this.j = atow.aB(sArr7);
        this.k = atow.aB(sArr8);
        this.l = atow.aB(sArr9);
        this.m = atow.aB(sArr10);
        this.n = atow.aB(sArr11);
    }
}
