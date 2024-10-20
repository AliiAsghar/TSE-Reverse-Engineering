package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsd implements frl {
    private static final byte[] a = {0, 7, 8, 15};
    private static final byte[] b = {0, 119, -120, -1};
    private static final byte[] c = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint d;
    private final Paint e;
    private final Canvas f;
    private final fsa g;
    private final fsc h;
    private Bitmap i;
    private final aksr j;

    public fsd(List list) {
        euf eufVar = new euf((byte[]) list.get(0));
        int n = eufVar.n();
        int n2 = eufVar.n();
        Paint paint = new Paint();
        this.d = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f = new Canvas();
        this.g = new fsa(719, 575, 0, 719, 0, 575);
        this.j = new aksr(0, f(), g(), h());
        this.h = new fsc(n, n2);
    }

    private static int d(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x022f A[LOOP:3: B:84:0x0173->B:96:0x022f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x022a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(byte[] r24, int[] r25, int r26, int r27, int r28, android.graphics.Paint r29, android.graphics.Canvas r30) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fsd.e(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static int[] f() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] g() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i6 = 1; i6 < 16; i6++) {
            int i7 = i6 & 4;
            int i8 = i6 & 2;
            int i9 = i6 & 1;
            if (i6 < 8) {
                if (1 != i9) {
                    i3 = 0;
                } else {
                    i3 = 255;
                }
                if (i8 != 0) {
                    i4 = 255;
                } else {
                    i4 = 0;
                }
                if (i7 != 0) {
                    i5 = 255;
                } else {
                    i5 = 0;
                }
                iArr[i6] = d(255, i3, i4, i5);
            } else {
                int i10 = 127;
                if (1 != i9) {
                    i = 0;
                } else {
                    i = 127;
                }
                if (i8 != 0) {
                    i2 = 127;
                } else {
                    i2 = 0;
                }
                if (i7 == 0) {
                    i10 = 0;
                }
                iArr[i6] = d(255, i, i2, i10);
            }
        }
        return iArr;
    }

    private static int[] h() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i19 = 0; i19 < 256; i19++) {
            int i20 = 255;
            if (i19 < 8) {
                int i21 = i19 & 2;
                int i22 = i19 & 4;
                if (1 != (i19 & 1)) {
                    i17 = 0;
                } else {
                    i17 = 255;
                }
                if (i21 != 0) {
                    i18 = 255;
                } else {
                    i18 = 0;
                }
                if (i22 == 0) {
                    i20 = 0;
                }
                iArr[i19] = d(63, i17, i18, i20);
            } else {
                int i23 = i19 & 136;
                int i24 = 170;
                int i25 = 85;
                if (i23 != 0) {
                    if (i23 != 8) {
                        int i26 = 43;
                        if (i23 != 128) {
                            if (i23 == 136) {
                                int i27 = i19 & 16;
                                int i28 = i19 & 32;
                                int i29 = i19 & 2;
                                int i30 = i19 & 64;
                                int i31 = i19 & 4;
                                if (1 != (i19 & 1)) {
                                    i13 = 0;
                                } else {
                                    i13 = 43;
                                }
                                if (i27 != 0) {
                                    i14 = 85;
                                } else {
                                    i14 = 0;
                                }
                                if (i29 != 0) {
                                    i15 = 43;
                                } else {
                                    i15 = 0;
                                }
                                if (i28 != 0) {
                                    i16 = 85;
                                } else {
                                    i16 = 0;
                                }
                                if (i31 == 0) {
                                    i26 = 0;
                                }
                                if (i30 == 0) {
                                    i25 = 0;
                                }
                                iArr[i19] = d(255, i13 + i14, i15 + i16, i26 + i25);
                            }
                        } else {
                            int i32 = i19 & 16;
                            int i33 = i19 & 32;
                            int i34 = i19 & 2;
                            int i35 = i19 & 64;
                            int i36 = i19 & 4;
                            if (1 != (i19 & 1)) {
                                i9 = 0;
                            } else {
                                i9 = 43;
                            }
                            int i37 = i9 + 127;
                            if (i32 != 0) {
                                i10 = 85;
                            } else {
                                i10 = 0;
                            }
                            if (i34 != 0) {
                                i11 = 43;
                            } else {
                                i11 = 0;
                            }
                            int i38 = i11 + 127;
                            if (i33 != 0) {
                                i12 = 85;
                            } else {
                                i12 = 0;
                            }
                            if (i36 == 0) {
                                i26 = 0;
                            }
                            int i39 = i26 + 127;
                            if (i35 == 0) {
                                i25 = 0;
                            }
                            iArr[i19] = d(255, i37 + i10, i38 + i12, i39 + i25);
                        }
                    } else {
                        int i40 = i19 & 16;
                        int i41 = i19 & 32;
                        int i42 = i19 & 2;
                        int i43 = i19 & 64;
                        int i44 = i19 & 4;
                        if (1 != (i19 & 1)) {
                            i5 = 0;
                        } else {
                            i5 = 85;
                        }
                        if (i40 != 0) {
                            i6 = 170;
                        } else {
                            i6 = 0;
                        }
                        if (i42 != 0) {
                            i7 = 85;
                        } else {
                            i7 = 0;
                        }
                        if (i41 != 0) {
                            i8 = 170;
                        } else {
                            i8 = 0;
                        }
                        if (i44 == 0) {
                            i25 = 0;
                        }
                        if (i43 == 0) {
                            i24 = 0;
                        }
                        iArr[i19] = d(127, i5 + i6, i7 + i8, i25 + i24);
                    }
                } else {
                    int i45 = i19 & 16;
                    int i46 = i19 & 32;
                    int i47 = i19 & 2;
                    int i48 = i19 & 64;
                    int i49 = i19 & 4;
                    if (1 != (i19 & 1)) {
                        i = 0;
                    } else {
                        i = 85;
                    }
                    if (i45 != 0) {
                        i2 = 170;
                    } else {
                        i2 = 0;
                    }
                    if (i47 != 0) {
                        i3 = 85;
                    } else {
                        i3 = 0;
                    }
                    if (i46 != 0) {
                        i4 = 170;
                    } else {
                        i4 = 0;
                    }
                    if (i49 == 0) {
                        i25 = 0;
                    }
                    if (i48 == 0) {
                        i24 = 0;
                    }
                    iArr[i19] = d(255, i + i2, i3 + i4, i25 + i24);
                }
            }
        }
        return iArr;
    }

    private static byte[] i(int i, int i2, fjl fjlVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) fjlVar.i(i2);
        }
        return bArr;
    }

    private static anna j(fjl fjlVar) {
        int i = fjlVar.i(16);
        fjlVar.s(4);
        int i2 = fjlVar.i(2);
        boolean u = fjlVar.u();
        fjlVar.s(1);
        byte[] bArr = eul.f;
        byte[] bArr2 = eul.f;
        if (i2 == 1) {
            fjlVar.s(fjlVar.i(8) * 16);
        } else if (i2 == 0) {
            int i3 = fjlVar.i(16);
            int i4 = fjlVar.i(16);
            if (i3 > 0) {
                bArr = new byte[i3];
                fjlVar.w(bArr, i3);
            }
            if (i4 > 0) {
                bArr2 = new byte[i4];
                fjlVar.w(bArr2, i4);
            } else {
                bArr2 = bArr;
            }
        }
        return new anna(i, u, bArr, bArr2);
    }

    private static aksr k(fjl fjlVar, int i) {
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 8;
        int i7 = fjlVar.i(8);
        fjlVar.s(8);
        int[] f = f();
        int[] g = g();
        int[] h = h();
        int i8 = i - 2;
        while (i8 > 0) {
            int i9 = fjlVar.i(i6);
            int i10 = fjlVar.i(i6);
            if ((i10 & 128) != 0) {
                iArr = f;
            } else if ((i10 & 64) != 0) {
                iArr = g;
            } else {
                iArr = h;
            }
            if ((i10 & 1) != 0) {
                i4 = fjlVar.i(i6);
                i5 = fjlVar.i(i6);
                i2 = fjlVar.i(i6);
                i3 = fjlVar.i(i6);
                i8 -= 6;
            } else {
                int i11 = fjlVar.i(6) << 2;
                int i12 = fjlVar.i(4) << 4;
                i8 -= 4;
                i2 = fjlVar.i(4) << 4;
                i3 = fjlVar.i(2) << 6;
                i4 = i11;
                i5 = i12;
            }
            if (i4 == 0) {
                i3 = 255;
            }
            if (i4 == 0) {
                i2 = 0;
            }
            if (i4 == 0) {
                i5 = 0;
            }
            double d = i4;
            double d2 = i5 - 128;
            double d3 = i2 - 128;
            iArr[i9] = d((byte) (255 - (i3 & 255)), eul.d((int) (d + (1.402d * d2)), 0, 255), eul.d((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), eul.d((int) (d + (d3 * 1.772d)), 0, 255));
            f = f;
            g = g;
            i7 = i7;
            i6 = 8;
        }
        return new aksr(i7, f, g, h);
    }

    @Override // defpackage.frl
    public final /* synthetic */ frc a(byte[] bArr, int i, int i2) {
        return fsm.b(this, bArr, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01f2, code lost:
    
        r3.t(r13 - r3.g());
     */
    @Override // defpackage.frl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(byte[] r28, int r29, int r30, defpackage.frk r31, defpackage.etm r32) {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fsd.b(byte[], int, int, frk, etm):void");
    }

    @Override // defpackage.frl
    public final void c() {
        fsc fscVar = this.h;
        fscVar.c.clear();
        fscVar.d.clear();
        fscVar.e.clear();
        fscVar.f.clear();
        fscVar.g.clear();
        fscVar.h = null;
        fscVar.i = null;
    }
}
