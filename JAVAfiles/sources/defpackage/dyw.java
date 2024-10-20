package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.Notification;
import android.graphics.Path;
import android.graphics.drawable.Icon;
import android.os.Build;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Notification.Builder builder, Icon icon) {
        builder.setLargeIcon(icon);
    }

    public static void b(eas[] easVarArr, Path path) {
        int i;
        int i2;
        float[] fArr;
        char c;
        int i3;
        int i4;
        eas easVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        eas[] easVarArr2 = easVarArr;
        float[] fArr2 = new float[6];
        int length = easVarArr2.length;
        char c2 = 0;
        int i5 = 0;
        char c3 = 'm';
        while (i5 < length) {
            eas easVar2 = easVarArr2[i5];
            char c4 = easVar2.a;
            float[] fArr3 = easVar2.b;
            float f9 = fArr2[c2];
            float f10 = fArr2[1];
            float f11 = fArr2[2];
            float f12 = fArr2[3];
            float f13 = fArr2[4];
            float f14 = fArr2[5];
            switch (c4) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f13, f14);
                    f9 = f13;
                    f11 = f9;
                    f10 = f14;
                    f12 = f10;
                    break;
            }
            i = 2;
            float f15 = f13;
            float f16 = f14;
            float f17 = f9;
            float f18 = f10;
            int i6 = 0;
            while (i6 < fArr3.length) {
                if (c4 != 'A') {
                    if (c4 != 'C') {
                        if (c4 != 'H') {
                            if (c4 != 'Q') {
                                if (c4 != 'V') {
                                    if (c4 != 'a') {
                                        if (c4 != 'c') {
                                            if (c4 != 'h') {
                                                if (c4 != 'q') {
                                                    if (c4 != 'v') {
                                                        if (c4 != 'L') {
                                                            if (c4 != 'M') {
                                                                if (c4 != 'S') {
                                                                    if (c4 != 'T') {
                                                                        if (c4 != 'l') {
                                                                            if (c4 != 'm') {
                                                                                if (c4 != 's') {
                                                                                    if (c4 == 't') {
                                                                                        int i7 = i6 + 1;
                                                                                        if (c3 != 'q' && c3 != 't' && c3 != 'Q' && c3 != 'T') {
                                                                                            f7 = brg.a;
                                                                                            f8 = brg.a;
                                                                                        } else {
                                                                                            f7 = f18 - f12;
                                                                                            f8 = f17 - f11;
                                                                                        }
                                                                                        path.rQuadTo(f8, f7, fArr3[i6], fArr3[i7]);
                                                                                        float f19 = f8 + f17;
                                                                                        float f20 = f7 + f18;
                                                                                        f17 += fArr3[i6];
                                                                                        f18 += fArr3[i7];
                                                                                        f12 = f20;
                                                                                        f11 = f19;
                                                                                    }
                                                                                    i2 = i6;
                                                                                    fArr = fArr3;
                                                                                    c = c4;
                                                                                    i3 = i5;
                                                                                    i4 = length;
                                                                                } else {
                                                                                    int i8 = i6 + 3;
                                                                                    int i9 = i6 + 2;
                                                                                    int i10 = i6 + 1;
                                                                                    if (c3 != 'c' && c3 != 's' && c3 != 'C' && c3 != 'S') {
                                                                                        f5 = brg.a;
                                                                                        f6 = brg.a;
                                                                                    } else {
                                                                                        f5 = f17 - f11;
                                                                                        f6 = f18 - f12;
                                                                                    }
                                                                                    i2 = i6;
                                                                                    fArr = fArr3;
                                                                                    c = c4;
                                                                                    path.rCubicTo(f5, f6, fArr3[i6], fArr3[i10], fArr3[i9], fArr3[i8]);
                                                                                    f = fArr[i2] + f17;
                                                                                    f2 = fArr[i10] + f18;
                                                                                    f17 += fArr[i9];
                                                                                    f3 = fArr[i8];
                                                                                }
                                                                            } else {
                                                                                i2 = i6;
                                                                                fArr = fArr3;
                                                                                c = c4;
                                                                                float f21 = fArr[i2];
                                                                                f17 += f21;
                                                                                float f22 = fArr[i2 + 1];
                                                                                f18 += f22;
                                                                                if (i2 > 0) {
                                                                                    path.rLineTo(f21, f22);
                                                                                } else {
                                                                                    path.rMoveTo(f21, f22);
                                                                                    i3 = i5;
                                                                                    f15 = f17;
                                                                                    i4 = length;
                                                                                    f16 = f18;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            i2 = i6;
                                                                            fArr = fArr3;
                                                                            c = c4;
                                                                            int i11 = i2 + 1;
                                                                            path.rLineTo(fArr[i2], fArr[i11]);
                                                                            f17 += fArr[i2];
                                                                            f4 = fArr[i11];
                                                                        }
                                                                    } else {
                                                                        i2 = i6;
                                                                        fArr = fArr3;
                                                                        c = c4;
                                                                        int i12 = i2 + 1;
                                                                        if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                                            f18 = (f18 + f18) - f12;
                                                                            f17 = (f17 + f17) - f11;
                                                                        }
                                                                        path.quadTo(f17, f18, fArr[i2], fArr[i12]);
                                                                        i3 = i5;
                                                                        f11 = f17;
                                                                        i4 = length;
                                                                        f12 = f18;
                                                                        f17 = fArr[i2];
                                                                        f18 = fArr[i12];
                                                                    }
                                                                } else {
                                                                    i2 = i6;
                                                                    fArr = fArr3;
                                                                    c = c4;
                                                                    int i13 = i2 + 3;
                                                                    int i14 = i2 + 2;
                                                                    int i15 = i2 + 1;
                                                                    if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                                        f18 = (f18 + f18) - f12;
                                                                        f17 = (f17 + f17) - f11;
                                                                    }
                                                                    path.cubicTo(f17, f18, fArr[i2], fArr[i15], fArr[i14], fArr[i13]);
                                                                    f = fArr[i2];
                                                                    f2 = fArr[i15];
                                                                    f17 = fArr[i14];
                                                                    f18 = fArr[i13];
                                                                    f11 = f;
                                                                    f12 = f2;
                                                                }
                                                            } else {
                                                                i2 = i6;
                                                                fArr = fArr3;
                                                                c = c4;
                                                                f17 = fArr[i2];
                                                                f18 = fArr[i2 + 1];
                                                                if (i2 > 0) {
                                                                    path.lineTo(f17, f18);
                                                                } else {
                                                                    path.moveTo(f17, f18);
                                                                    i3 = i5;
                                                                    f15 = f17;
                                                                    i4 = length;
                                                                    f16 = f18;
                                                                }
                                                            }
                                                            easVar = easVar2;
                                                        } else {
                                                            i2 = i6;
                                                            fArr = fArr3;
                                                            c = c4;
                                                            int i16 = i2 + 1;
                                                            path.lineTo(fArr[i2], fArr[i16]);
                                                            f17 = fArr[i2];
                                                            f18 = fArr[i16];
                                                        }
                                                    } else {
                                                        i2 = i6;
                                                        fArr = fArr3;
                                                        c = c4;
                                                        path.rLineTo(brg.a, fArr[i2]);
                                                        f4 = fArr[i2];
                                                    }
                                                    f18 += f4;
                                                } else {
                                                    i2 = i6;
                                                    fArr = fArr3;
                                                    c = c4;
                                                    int i17 = i2 + 3;
                                                    int i18 = i2 + 2;
                                                    int i19 = i2 + 1;
                                                    path.rQuadTo(fArr[i2], fArr[i19], fArr[i18], fArr[i17]);
                                                    float f23 = fArr[i2] + f17;
                                                    float f24 = fArr[i19] + f18;
                                                    f17 += fArr[i18];
                                                    f18 += fArr[i17];
                                                    f12 = f24;
                                                    f11 = f23;
                                                }
                                            } else {
                                                i2 = i6;
                                                fArr = fArr3;
                                                c = c4;
                                                path.rLineTo(fArr[i2], brg.a);
                                                f17 += fArr[i2];
                                            }
                                            i3 = i5;
                                            i4 = length;
                                            easVar = easVar2;
                                        } else {
                                            i2 = i6;
                                            fArr = fArr3;
                                            c = c4;
                                            int i20 = i2 + 5;
                                            int i21 = i2 + 4;
                                            int i22 = i2 + 3;
                                            int i23 = i2 + 2;
                                            path.rCubicTo(fArr[i2], fArr[i2 + 1], fArr[i23], fArr[i22], fArr[i21], fArr[i20]);
                                            f = fArr[i23] + f17;
                                            f2 = fArr[i22] + f18;
                                            f17 += fArr[i21];
                                            f3 = fArr[i20];
                                        }
                                        f18 += f3;
                                        f11 = f;
                                        f12 = f2;
                                        i3 = i5;
                                        i4 = length;
                                        easVar = easVar2;
                                    } else {
                                        i2 = i6;
                                        fArr = fArr3;
                                        c = c4;
                                        int i24 = i2 + 6;
                                        int i25 = i2 + 5;
                                        int i26 = i2 + 4;
                                        float f25 = fArr[i25] + f17;
                                        float f26 = fArr[i24] + f18;
                                        float f27 = fArr[i2];
                                        float f28 = fArr[i2 + 1];
                                        float f29 = fArr[i2 + 2];
                                        if (fArr[i2 + 3] != brg.a) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (fArr[i26] != brg.a) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        i3 = i5;
                                        i4 = length;
                                        easVar = easVar2;
                                        eas.a(path, f17, f18, f25, f26, f27, f28, f29, z3, z4);
                                        f17 += fArr[i25];
                                        f18 += fArr[i24];
                                    }
                                } else {
                                    i2 = i6;
                                    fArr = fArr3;
                                    c = c4;
                                    i3 = i5;
                                    i4 = length;
                                    easVar = easVar2;
                                    path.lineTo(f17, fArr[i2]);
                                    f18 = fArr[i2];
                                }
                            } else {
                                i2 = i6;
                                fArr = fArr3;
                                c = c4;
                                i3 = i5;
                                i4 = length;
                                easVar = easVar2;
                                int i27 = i2 + 3;
                                int i28 = i2 + 2;
                                int i29 = i2 + 1;
                                path.quadTo(fArr[i2], fArr[i29], fArr[i28], fArr[i27]);
                                float f30 = fArr[i2];
                                float f31 = fArr[i29];
                                f17 = fArr[i28];
                                f18 = fArr[i27];
                                f12 = f31;
                                f11 = f30;
                            }
                        } else {
                            i2 = i6;
                            fArr = fArr3;
                            c = c4;
                            i3 = i5;
                            i4 = length;
                            easVar = easVar2;
                            path.lineTo(fArr[i2], f18);
                            f17 = fArr[i2];
                        }
                    } else {
                        i2 = i6;
                        fArr = fArr3;
                        c = c4;
                        i3 = i5;
                        i4 = length;
                        easVar = easVar2;
                        int i30 = i2 + 5;
                        int i31 = i2 + 4;
                        int i32 = i2 + 3;
                        int i33 = i2 + 2;
                        path.cubicTo(fArr[i2], fArr[i2 + 1], fArr[i33], fArr[i32], fArr[i31], fArr[i30]);
                        f17 = fArr[i31];
                        f18 = fArr[i30];
                        f11 = fArr[i33];
                        f12 = fArr[i32];
                    }
                    i6 = i2 + i;
                    easVar2 = easVar;
                    i5 = i3;
                    length = i4;
                    fArr3 = fArr;
                    c3 = c;
                    c4 = c3;
                } else {
                    i2 = i6;
                    fArr = fArr3;
                    c = c4;
                    i3 = i5;
                    i4 = length;
                    easVar = easVar2;
                    int i34 = i2 + 6;
                    int i35 = i2 + 5;
                    int i36 = i2 + 4;
                    float f32 = fArr[i35];
                    float f33 = fArr[i34];
                    float f34 = fArr[i2];
                    float f35 = fArr[i2 + 1];
                    float f36 = fArr[i2 + 2];
                    if (fArr[i2 + 3] != brg.a) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fArr[i36] != brg.a) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    eas.a(path, f17, f18, f32, f33, f34, f35, f36, z, z2);
                    f17 = fArr[i35];
                    f18 = fArr[i34];
                }
                f11 = f17;
                f12 = f18;
                i6 = i2 + i;
                easVar2 = easVar;
                i5 = i3;
                length = i4;
                fArr3 = fArr;
                c3 = c;
                c4 = c3;
            }
            fArr2[0] = f17;
            fArr2[1] = f18;
            fArr2[2] = f11;
            fArr2[3] = f12;
            fArr2[4] = f15;
            fArr2[5] = f16;
            c3 = easVar2.a;
            i5++;
            c2 = 0;
            length = length;
            easVarArr2 = easVarArr;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0096. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1 A[Catch: NumberFormatException -> 0x00d4, LOOP:3: B:25:0x0084->B:34:0x00b1, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00d4, blocks: (B:22:0x0070, B:25:0x0084, B:27:0x008a, B:31:0x0096, B:34:0x00b1, B:38:0x00b7, B:43:0x00c8, B:56:0x00cd), top: B:21:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7 A[Catch: NumberFormatException -> 0x00d4, TryCatch #0 {NumberFormatException -> 0x00d4, blocks: (B:22:0x0070, B:25:0x0084, B:27:0x008a, B:31:0x0096, B:34:0x00b1, B:38:0x00b7, B:43:0x00c8, B:56:0x00cd), top: B:21:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8 A[Catch: NumberFormatException -> 0x00d4, TryCatch #0 {NumberFormatException -> 0x00d4, blocks: (B:22:0x0070, B:25:0x0084, B:27:0x008a, B:31:0x0096, B:34:0x00b1, B:38:0x00b7, B:43:0x00c8, B:56:0x00cd), top: B:21:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.eas[] c(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyw.c(java.lang.String):eas[]");
    }

    public static eas[] d(eas[] easVarArr) {
        eas[] easVarArr2 = new eas[easVarArr.length];
        for (int i = 0; i < easVarArr.length; i++) {
            easVarArr2[i] = new eas(easVarArr[i]);
        }
        return easVarArr2;
    }

    public static float[] e(float[] fArr, int i) {
        if (i >= 0) {
            int min = Math.min(i, fArr.length);
            float[] fArr2 = new float[i];
            System.arraycopy(fArr, 0, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(Activity activity, enf enfVar) {
        enfVar.getClass();
        if (activity instanceof enp) {
            ((enp) activity).a().e(enfVar);
        } else if (activity instanceof enm) {
            enh N = ((enm) activity).N();
            if (N instanceof eno) {
                ((eno) N).e(enfVar);
            }
        }
    }

    public static final void g(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            eob eobVar = eoc.Companion;
            eob.a(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new eod(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static final eng h(eng engVar, eng engVar2) {
        engVar.getClass();
        if (engVar2 != null && engVar2.compareTo(engVar) < 0) {
            return engVar2;
        }
        return engVar;
    }

    private static void i(ArrayList arrayList, char c, float[] fArr) {
        arrayList.add(new eas(c, fArr));
    }
}
