package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsController;
import android.view.WindowInsetsController$OnControllableInsetsChangedListener;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class edn extends edl {
    private final View a;

    public edn(View view) {
        super(view);
        this.a = view;
    }

    @Override // defpackage.edl, defpackage.dyg
    public final void c() {
        WindowInsetsController windowInsetsController;
        View view;
        View view2 = this.a;
        if (view2 == null) {
            windowInsetsController = null;
        } else {
            windowInsetsController = view2.getWindowInsetsController();
        }
        if (windowInsetsController != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController$OnControllableInsetsChangedListener windowInsetsController$OnControllableInsetsChangedListener = new WindowInsetsController$OnControllableInsetsChangedListener() { // from class: edm
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                    boolean z;
                    if ((i & 8) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    atomicBoolean.set(z);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(windowInsetsController$OnControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.a) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.a.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(windowInsetsController$OnControllableInsetsChangedListener);
            windowInsetsController.hide(anf$$ExternalSyntheticApiModelOutline0.m());
            return;
        }
        super.c();
    }

    @Override // defpackage.edl, defpackage.dyg
    public final void d() {
        WindowInsetsController windowInsetsController;
        if (this.a != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) this.a.getContext().getSystemService("input_method")).isActive();
        }
        View view = this.a;
        if (view != null) {
            windowInsetsController = view.getWindowInsetsController();
        } else {
            windowInsetsController = null;
        }
        if (windowInsetsController != null) {
            windowInsetsController.show(anf$$ExternalSyntheticApiModelOutline0.m());
        }
        super.d();
    }
}
