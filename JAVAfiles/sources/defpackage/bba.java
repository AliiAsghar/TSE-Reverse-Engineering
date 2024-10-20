package defpackage;

import android.view.inputmethod.HandwritingGesture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bba {
    public static final int a(HandwritingGesture handwritingGesture, arqr arqrVar) {
        String fallbackText;
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        arqrVar.a(new dmw(fallbackText, 1));
        return 5;
    }

    public static final void b(long j, dhv dhvVar, boolean z, arqr arqrVar) {
        int i;
        if (z) {
            int e = djc.e(j);
            int a = djc.a(j);
            int i2 = 10;
            if (e > 0) {
                i = Character.codePointBefore(dhvVar, e);
            } else {
                i = 10;
            }
            if (a < dhvVar.a()) {
                i2 = Character.codePointAt(dhvVar, a);
            }
            if (bbc.h(i) && (bbc.g(i2) || a.J(i2))) {
                do {
                    e -= Character.charCount(i);
                    if (e == 0) {
                        break;
                    } else {
                        i = Character.codePointBefore(dhvVar, e);
                    }
                } while (bbc.h(i));
                j = djd.a(e, a);
            } else if (bbc.h(i2) && (bbc.g(i) || a.J(i))) {
                do {
                    a += Character.charCount(i2);
                    if (a == dhvVar.a()) {
                        break;
                    } else {
                        i2 = Character.codePointAt(dhvVar, a);
                    }
                } while (bbc.h(i2));
                j = djd.a(e, a);
            }
        }
        arqrVar.a(new bbb(new dnd[]{new doi(djc.a(j), djc.a(j)), new dnb(djc.b(j), 0)}));
    }

    public static final void c(int i, String str, arqr arqrVar) {
        arqrVar.a(new bbb(new dnd[]{new doi(i, i), new dmw(str, 1)}));
    }

    public static final void d(long j, bfb bfbVar, arqr arqrVar) {
        arqrVar.a(new doi(djc.e(j), djc.a(j)));
        if (bfbVar != null) {
            bfbVar.j(true);
        }
    }

    public static final int e(int i) {
        if (i == 1) {
            return 1;
        }
        return 0;
    }
}
