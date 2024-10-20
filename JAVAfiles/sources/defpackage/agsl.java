package defpackage;

import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class agsl implements AccessibilityManager.AccessibilityStateChangeListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ agsl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, arqr] */
    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        if (this.b != 0) {
            this.a.a(Boolean.valueOf(z));
        } else {
            agso agsoVar = (agso) this.a;
            agsoVar.g();
            agsoVar.h(3);
        }
    }
}
