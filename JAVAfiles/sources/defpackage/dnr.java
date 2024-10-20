package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: PG */
@armg
/* loaded from: classes.dex */
public final class dnr implements dnq {
    public final View a;
    public final efu b;
    private final arml c = armd.b(3, new AnonymousClass1());

    /* compiled from: PG */
    /* renamed from: dnr$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<InputMethodManager> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            Object systemService = dnr.this.a.getContext().getSystemService("input_method");
            systemService.getClass();
            return (InputMethodManager) systemService;
        }
    }

    public dnr(View view) {
        this.a = view;
        this.b = new efu(view, (byte[]) null);
    }

    @Override // defpackage.dnq
    public final void a(int i, int i2, int i3, int i4) {
        b().updateSelection(this.a, i, i2, i3, i4);
    }

    public final InputMethodManager b() {
        return (InputMethodManager) this.c.a();
    }
}
