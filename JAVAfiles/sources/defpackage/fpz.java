package defpackage;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpz {
    public static final /* synthetic */ int a = 0;
    private static final byte[] b = eul.ac("OpusHead");

    public static int a(int i) {
        return i & 16777215;
    }

    public static int b(int i) {
        return (i >> 24) & 255;
    }

    public static int c(euf eufVar) {
        eufVar.J(16);
        return eufVar.e();
    }

    public static erk d(euf eufVar) {
        short C = eufVar.C();
        eufVar.K(2);
        String y = eufVar.y(C);
        int max = Math.max(y.lastIndexOf(43), y.lastIndexOf(45));
        try {
            return new erk(new euq(Float.parseFloat(y.substring(0, max)), Float.parseFloat(y.substring(max, y.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    public static eur e(euf eufVar) {
        long q;
        long q2;
        eufVar.J(8);
        if (b(eufVar.e()) == 0) {
            q = eufVar.r();
            q2 = eufVar.r();
        } else {
            q = eufVar.q();
            q2 = eufVar.q();
        }
        return new eur(q, q2, eufVar.r());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0379  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.fql f(defpackage.fqj r39, defpackage.eun r40, defpackage.fmc r41) {
        /*
            Method dump skipped, instructions count: 1528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fpz.f(fqj, eun, fmc):fql");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00db, code lost:
    
        if (r8 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x09a2, code lost:
    
        if (r9 == 1) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x097e, code lost:
    
        if (r2.i(1) > 0) goto L465;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0d6f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0d99  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x09b3  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x09d9  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x09db  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x09eb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0bda  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0bdc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0d3f  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0d43  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x0da6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:621:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List g(defpackage.eun r69, defpackage.fmc r70, long r71, defpackage.eqj r73, boolean r74, boolean r75, defpackage.algk r76) {
        /*
            Method dump skipped, instructions count: 3506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fpz.g(eun, fmc, long, eqj, boolean, boolean, algk):java.util.List");
    }

    public static void h(euf eufVar) {
        int i = eufVar.b;
        eufVar.K(4);
        if (eufVar.e() != 1751411826) {
            i += 4;
        }
        eufVar.J(i);
    }

    private static int i(euf eufVar) {
        int j = eufVar.j();
        int i = j & 127;
        while ((j & 128) == 128) {
            j = eufVar.j();
            i = (i << 7) | (j & 127);
        }
        return i;
    }

    private static Pair j(euf eufVar, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        Integer num;
        hka hkaVar;
        Pair create;
        int i3;
        int i4;
        boolean z4;
        byte[] bArr;
        int i5 = eufVar.b;
        while (i5 - i < i2) {
            eufVar.J(i5);
            int e = eufVar.e();
            boolean z5 = true;
            if (e > 0) {
                z = true;
            } else {
                z = false;
            }
            eef.i(z, "childAtomSize must be positive");
            if (eufVar.e() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                String str = null;
                Integer num2 = null;
                while (i6 - i5 < e) {
                    eufVar.J(i6);
                    int e2 = eufVar.e();
                    int e3 = eufVar.e();
                    if (e3 == 1718775137) {
                        num2 = Integer.valueOf(eufVar.e());
                    } else if (e3 == 1935894637) {
                        eufVar.K(4);
                        str = eufVar.y(4);
                    } else if (e3 == 1935894633) {
                        i8 = i6;
                        i7 = e2;
                    }
                    i6 += e2;
                }
                if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
                    create = null;
                } else {
                    if (num2 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    eef.i(z2, "frma atom is mandatory");
                    if (i8 != -1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    eef.i(z3, "schi atom is mandatory");
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 < i7) {
                            eufVar.J(i9);
                            int e4 = eufVar.e();
                            if (eufVar.e() == 1952804451) {
                                int b2 = b(eufVar.e());
                                eufVar.K(1);
                                if (b2 == 0) {
                                    eufVar.K(1);
                                    i3 = 0;
                                    i4 = 0;
                                } else {
                                    int j = eufVar.j();
                                    int i10 = (j & 240) >> 4;
                                    i3 = j & 15;
                                    i4 = i10;
                                }
                                if (eufVar.j() == 1) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                int j2 = eufVar.j();
                                byte[] bArr2 = new byte[16];
                                eufVar.E(bArr2, 0, 16);
                                if (z4 && j2 == 0) {
                                    int j3 = eufVar.j();
                                    byte[] bArr3 = new byte[j3];
                                    eufVar.E(bArr3, 0, j3);
                                    bArr = bArr3;
                                } else {
                                    bArr = null;
                                }
                                num = num2;
                                hkaVar = new hka(z4, str, j2, bArr2, i4, i3, bArr);
                            } else {
                                i9 += e4;
                            }
                        } else {
                            num = num2;
                            hkaVar = null;
                            break;
                        }
                    }
                    if (hkaVar == null) {
                        z5 = false;
                    }
                    eef.i(z5, "tenc atom is mandatory");
                    int i11 = eul.a;
                    create = Pair.create(num, hkaVar);
                }
                if (create != null) {
                    return create;
                }
            }
            i5 += e;
        }
        return null;
    }

    private static fpu k(euf eufVar, int i) {
        long j;
        long j2;
        eufVar.J(i + 12);
        eufVar.K(1);
        i(eufVar);
        eufVar.K(2);
        int j3 = eufVar.j();
        if ((j3 & 128) != 0) {
            eufVar.K(2);
        }
        if ((j3 & 64) != 0) {
            eufVar.K(eufVar.j());
        }
        if ((j3 & 32) != 0) {
            eufVar.K(2);
        }
        eufVar.K(1);
        i(eufVar);
        String d = erl.d(eufVar.j());
        if (!"audio/mpeg".equals(d) && !"audio/vnd.dts".equals(d) && !"audio/vnd.dts.hd".equals(d)) {
            eufVar.K(4);
            long r = eufVar.r();
            long r2 = eufVar.r();
            eufVar.K(1);
            int i2 = i(eufVar);
            byte[] bArr = new byte[i2];
            eufVar.E(bArr, 0, i2);
            if (r2 <= 0) {
                j = -1;
            } else {
                j = r2;
            }
            if (r > 0) {
                j2 = r;
            } else {
                j2 = -1;
            }
            return new fpu(d, bArr, j, j2);
        }
        return new fpu(d, null, -1L, -1L);
    }

    private static ByteBuffer l() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m(defpackage.euf r33, int r34, int r35, int r36, int r37, java.lang.String r38, boolean r39, defpackage.eqj r40, defpackage.fpw r41, int r42) {
        /*
            Method dump skipped, instructions count: 1742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fpz.m(euf, int, int, int, int, java.lang.String, boolean, eqj, fpw, int):void");
    }
}
