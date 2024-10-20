package defpackage;

import android.content.Context;
import android.os.ResultReceiver;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abdc {
    public final ykw d;
    public final abbu e;
    private static final uuf f = uuh.q(150629952);
    public static final xze a = xze.g("Bugle", "ImeUtil");
    public volatile boolean b = false;
    private final List g = new ArrayList();
    public final List c = new ArrayList();
    private final abdb h = new abdb(this, "last_ime_height");
    private final abdb i = new abdb(this, "last_ime_height_landscape");
    private final ResultReceiver j = new abda(this);

    public abdc(ykw ykwVar, abbu abbuVar) {
        this.d = ykwVar;
        this.e = abbuVar;
    }

    public static void b(Context context, View view) {
        ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public final int a() {
        abdb abdbVar;
        if (this.e.m()) {
            abdbVar = this.i;
        } else {
            abdbVar = this.h;
        }
        return abdbVar.a;
    }

    public final void c(abcy abcyVar) {
        this.c.add(abcyVar);
    }

    public final void d(abcz abczVar) {
        this.g.add(abczVar);
    }

    public final void e(int i) {
        if (this.e.m()) {
            this.i.a(i);
        } else {
            this.h.a(i);
        }
    }

    public final synchronized void f(boolean z) {
        if (z != this.b) {
            this.b = z;
            ArrayList arrayList = new ArrayList(this.g);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((abcz) arrayList.get(i)).a(this.b);
            }
        }
    }

    public final void g(abcy abcyVar) {
        this.c.remove(abcyVar);
    }

    public final void h(abcz abczVar) {
        this.g.remove(abczVar);
    }

    public final void i(Context context, View view) {
        InputMethodManager inputMethodManager;
        if (context != null && view != null && this.b && (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) != null) {
            if (inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0, this.j)) {
                f(false);
            }
        }
    }

    public final void j(Context context, View view) {
        k(context, view, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        r3 = r4.getWindowInsetsController();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.content.Context r3, android.view.View r4, boolean r5) {
        /*
            r2 = this;
            if (r3 == 0) goto L59
            if (r4 != 0) goto L5
            goto L59
        L5:
            r0 = 1
            if (r5 != 0) goto L37
            boolean r5 = defpackage.yhx.d
            if (r5 == 0) goto L37
            uuf r5 = defpackage.abdc.f
            java.lang.Object r5 = r5.e()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L37
            boolean r3 = r4.isFocusable()
            if (r3 == 0) goto L59
            boolean r3 = r4.requestFocus()
            if (r3 == 0) goto L59
            android.view.WindowInsetsController r3 = defpackage.anf$$ExternalSyntheticApiModelOutline0.m(r4)
            if (r3 == 0) goto L59
            int r4 = defpackage.anf$$ExternalSyntheticApiModelOutline0.m()
            defpackage.anf$$ExternalSyntheticApiModelOutline0.m(r3, r4)
            r2.f(r0)
            return
        L37:
            java.lang.String r5 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r5)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            if (r3 == 0) goto L59
            boolean r5 = r4.isFocusable()
            if (r5 == 0) goto L59
            boolean r5 = r4.requestFocus()
            if (r5 == 0) goto L59
            r5 = 0
            android.os.ResultReceiver r1 = r2.j
            boolean r3 = r3.showSoftInput(r4, r5, r1)
            if (r3 == 0) goto L59
            r2.f(r0)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abdc.k(android.content.Context, android.view.View, boolean):void");
    }
}
