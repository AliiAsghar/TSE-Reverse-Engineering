package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahcq {
    public static final ahcv a;
    public static final ahcv b;
    public final ahcv c;
    public int d = -1;
    public ahcz e;
    public final apaa f;
    public final adwq g;

    static {
        final int i = 1;
        a = new ahcv() { // from class: ahcm
            @Override // defpackage.ahcv
            public final void a(ahcq ahcqVar) {
                if (i != 0) {
                    boolean z = ahcqVar.e.c;
                    if (z) {
                        ahcqVar.g.h(ahcqVar);
                    }
                    apaa apaaVar = ahcqVar.f;
                    if (!apaaVar.a.isMutable()) {
                        apaaVar.b = apaaVar.r();
                        if (z) {
                            ahcqVar.g.g(ahcqVar);
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Default instance must be immutable.");
                }
                ahcz ahczVar = ahcqVar.e;
                if (ahczVar.h.i()) {
                    ahczVar.a.removeOnAttachStateChangeListener(ahczVar);
                    View view = ahczVar.a;
                    int[] iArr = eek.a;
                    if (view.isAttachedToWindow()) {
                        ahczVar.onViewDetachedFromWindow(ahczVar.a);
                    }
                }
                ahczVar.e = null;
                ahczVar.a.setTag(R.id.ve_tag, null);
                albo.T(!ahcqVar.e.c);
                ahcqVar.e = null;
            }
        };
        final int i2 = 0;
        b = new ahcv() { // from class: ahcm
            @Override // defpackage.ahcv
            public final void a(ahcq ahcqVar) {
                if (i2 != 0) {
                    boolean z = ahcqVar.e.c;
                    if (z) {
                        ahcqVar.g.h(ahcqVar);
                    }
                    apaa apaaVar = ahcqVar.f;
                    if (!apaaVar.a.isMutable()) {
                        apaaVar.b = apaaVar.r();
                        if (z) {
                            ahcqVar.g.g(ahcqVar);
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Default instance must be immutable.");
                }
                ahcz ahczVar = ahcqVar.e;
                if (ahczVar.h.i()) {
                    ahczVar.a.removeOnAttachStateChangeListener(ahczVar);
                    View view = ahczVar.a;
                    int[] iArr = eek.a;
                    if (view.isAttachedToWindow()) {
                        ahczVar.onViewDetachedFromWindow(ahczVar.a);
                    }
                }
                ahczVar.e = null;
                ahczVar.a.setTag(R.id.ve_tag, null);
                albo.T(!ahcqVar.e.c);
                ahcqVar.e = null;
            }
        };
    }

    public ahcq(apaa apaaVar, ahcv ahcvVar, adwq adwqVar) {
        this.f = apaaVar;
        this.c = ahcvVar;
        this.g = adwqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ahcw a() {
        return (ahcw) this.f.s();
    }

    public final boolean b() {
        anas anasVar = ((ahcw) this.f.b).d;
        if (anasVar == null) {
            anasVar = anas.a;
        }
        if ((anasVar.b & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        anas anasVar = ((ahcw) this.f.b).d;
        if (anasVar == null) {
            anasVar = anas.a;
        }
        if ((anasVar.b & 2048) != 0) {
            return true;
        }
        return false;
    }

    public final int d() {
        return this.e.j();
    }

    public final String toString() {
        String str;
        ahcz ahczVar = this.e;
        if (ahczVar != null) {
            str = ".".concat(String.valueOf(ahczVar.getClass().getSimpleName()));
        } else {
            str = "";
        }
        anas anasVar = ((ahcw) this.f.b).d;
        if (anasVar == null) {
            anasVar = anas.a;
        }
        return "CVE" + str + "#" + anasVar.d + " [" + Integer.toHexString(hashCode()) + "]";
    }
}
