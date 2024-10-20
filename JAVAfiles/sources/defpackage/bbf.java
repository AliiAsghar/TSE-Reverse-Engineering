package defpackage;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbf implements bbe {
    public final View a;
    private final arml b = armd.b(3, new AnonymousClass1());

    /* compiled from: PG */
    /* renamed from: bbf$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<InputMethodManager> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            Object systemService = bbf.this.a.getContext().getSystemService("input_method");
            systemService.getClass();
            return (InputMethodManager) systemService;
        }
    }

    public bbf(View view) {
        this.a = view;
    }

    private final InputMethodManager g() {
        return (InputMethodManager) this.b.a();
    }

    @Override // defpackage.bbe
    public final void a() {
        g().restartInput(this.a);
    }

    @Override // defpackage.bbe
    public final void b() {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        g().startStylusHandwriting(this.a);
    }

    @Override // defpackage.bbe
    public final void c(CursorAnchorInfo cursorAnchorInfo) {
        g().updateCursorAnchorInfo(this.a, cursorAnchorInfo);
    }

    @Override // defpackage.bbe
    public final void d(int i, ExtractedText extractedText) {
        g().updateExtractedText(this.a, i, extractedText);
    }

    @Override // defpackage.bbe
    public final void e(int i, int i2, int i3, int i4) {
        g().updateSelection(this.a, i, i2, i3, i4);
    }

    @Override // defpackage.bbe
    public final boolean f() {
        return g().isActive(this.a);
    }
}
