package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eee {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static View.AccessibilityDelegate a(View view) {
        View.AccessibilityDelegate accessibilityDelegate;
        accessibilityDelegate = view.getAccessibilityDelegate();
        return accessibilityDelegate;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    public static void c(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static void d(long j, euf eufVar, fmq[] fmqVarArr) {
        int i;
        boolean z;
        while (true) {
            boolean z2 = true;
            if (eufVar.b() > 1) {
                int g = g(eufVar);
                int g2 = g(eufVar);
                int i2 = eufVar.b + g2;
                if (g2 != -1 && g2 <= eufVar.b()) {
                    if (g == 4 && g2 >= 8) {
                        int j2 = eufVar.j();
                        int n = eufVar.n();
                        if (n == 49) {
                            i = eufVar.e();
                            n = 49;
                        } else {
                            i = 0;
                        }
                        int j3 = eufVar.j();
                        if (n == 47) {
                            eufVar.K(1);
                            n = 47;
                        }
                        if (j2 == 181 && ((n == 49 || n == 47) && j3 == 3)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (n == 49) {
                            if (i != 1195456820) {
                                z2 = false;
                            }
                            z &= z2;
                        }
                        if (z) {
                            e(j, eufVar, fmqVarArr);
                        }
                    }
                } else {
                    eub.f("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i2 = eufVar.c;
                }
                eufVar.J(i2);
            } else {
                return;
            }
        }
    }

    public static void e(long j, euf eufVar, fmq[] fmqVarArr) {
        boolean z;
        int j2 = eufVar.j();
        if ((j2 & 64) != 0) {
            int i = j2 & 31;
            eufVar.K(1);
            int i2 = eufVar.b;
            for (fmq fmqVar : fmqVarArr) {
                int i3 = i * 3;
                eufVar.J(i2);
                fmqVar.l(eufVar, i3);
                if (j != -9223372036854775807L) {
                    z = true;
                } else {
                    z = false;
                }
                dzg.d(z);
                fmqVar.n(j, 1, i3, 0, null);
            }
        }
    }

    public static anna f(byte[] bArr, int i) {
        ArrayList arrayList;
        int e;
        euf eufVar = new euf(bArr);
        try {
            eufVar.K(4);
            e = eufVar.e();
            eufVar.J(0);
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        if (e == 1886547818) {
            eufVar.K(8);
            int i2 = eufVar.b;
            int i3 = eufVar.c;
            while (i2 < i3) {
                int e2 = eufVar.e() + i2;
                if (e2 <= i2 || e2 > i3) {
                    break;
                }
                int e3 = eufVar.e();
                if (e3 != 2037673328 && e3 != 1836279920) {
                    eufVar.J(e2);
                    i2 = e2;
                }
                eufVar.I(e2);
                arrayList = i(eufVar);
                break;
            }
            arrayList = null;
        } else {
            arrayList = i(eufVar);
        }
        if (arrayList != null) {
            int size = arrayList.size();
            if (size != 1) {
                if (size == 2) {
                    return new anna((efu) arrayList.get(0), (efu) arrayList.get(1), i);
                }
            } else {
                efu efuVar = (efu) arrayList.get(0);
                return new anna(efuVar, efuVar, i);
            }
        }
        return null;
    }

    private static int g(euf eufVar) {
        int i = 0;
        while (eufVar.b() != 0) {
            int j = eufVar.j();
            i += j;
            if (j != 255) {
                return i;
            }
        }
        return -1;
    }

    private static int h(int i) {
        return (i >> 1) ^ (-(i & 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ad A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte[], java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList i(defpackage.euf r26) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eee.i(euf):java.util.ArrayList");
    }
}
