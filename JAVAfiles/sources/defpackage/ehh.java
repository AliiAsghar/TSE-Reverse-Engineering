package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ehh extends ega {
    final /* synthetic */ ehi a;

    public ehh(ehi ehiVar) {
        this.a = ehiVar;
    }

    @Override // defpackage.ega
    public final efx a(int i) {
        return new efx(AccessibilityNodeInfo.obtain(this.a.j(i).a));
    }

    @Override // defpackage.ega
    public final efx b(int i) {
        int i2;
        if (i == 2) {
            i2 = this.a.c;
        } else {
            i2 = this.a.d;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i2);
    }

    @Override // defpackage.ega
    public final boolean d(int i, int i2, Bundle bundle) {
        int i3;
        int i4;
        ehi ehiVar = this.a;
        if (i != -1) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 64) {
                        if (i2 != 128) {
                            return ehiVar.r(i, i2);
                        }
                        return ehiVar.p(i);
                    }
                    if (ehiVar.a.isEnabled() && ehiVar.a.isTouchExplorationEnabled() && (i4 = ehiVar.c) != i) {
                        if (i4 != Integer.MIN_VALUE) {
                            ehiVar.p(i4);
                        }
                        ehiVar.c = i;
                        ehiVar.b.invalidate();
                        ehiVar.s(i, 32768);
                        return true;
                    }
                } else {
                    return ehiVar.q(i);
                }
            } else if ((ehiVar.b.isFocused() || ehiVar.b.requestFocus()) && (i3 = ehiVar.d) != i) {
                if (i3 != Integer.MIN_VALUE) {
                    ehiVar.q(i3);
                }
                if (i != Integer.MIN_VALUE) {
                    ehiVar.d = i;
                    ehiVar.o(i, true);
                    ehiVar.s(i, 8);
                    return true;
                }
            }
            return false;
        }
        return ehiVar.b.performAccessibilityAction(i2, bundle);
    }
}
