package defpackage;

import android.view.Window;
import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ljs implements bxh {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public ljs(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [enm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [cas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [enm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, agak] */
    /* JADX WARN: Type inference failed for: r0v8, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [enl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [enl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, agar] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, arqr] */
    @Override // defpackage.bxh
    public final void a() {
        boolean booleanValue;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            ((arqr) this.a.a()).a(this.b);
                            return;
                        }
                        Object obj = this.b;
                        if (obj != null) {
                            final ?? r1 = this.a;
                            ((AccessibilityManager) obj).removeAccessibilityStateChangeListener(new AccessibilityManager.AccessibilityStateChangeListener() { // from class: aehy
                                @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
                                public final /* synthetic */ void onAccessibilityStateChanged(boolean z) {
                                    arqr.this.a(Boolean.valueOf(z));
                                }
                            });
                            return;
                        }
                        return;
                    }
                    Window window = (Window) this.b;
                    efu efuVar = new efu(window, window.getDecorView());
                    booleanValue = ((Boolean) this.a.a()).booleanValue();
                    efuVar.b(booleanValue);
                    return;
                }
                ?? r0 = this.a;
                if (r0 != 0) {
                    r0.n(this.b);
                    return;
                }
                return;
            }
            this.a.N().d(this.b);
            return;
        }
        this.a.N().d(this.b);
    }

    public ljs(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
