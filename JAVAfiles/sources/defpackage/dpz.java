package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpz extends CharacterStyle implements UpdateAppearance {
    public final clz a;
    private final float c;
    public final byn b = new byu(new cjt(9205357640488583168L), cav.a);
    private final cas d = new bxd(new AnonymousClass1(), null);

    /* compiled from: PG */
    /* renamed from: dpz$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<Shader> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            if (dpz.this.a() != 9205357640488583168L && !cjt.f(dpz.this.a())) {
                dpz dpzVar = dpz.this;
                return dpzVar.a.b(dpzVar.a());
            }
            return null;
        }
    }

    public dpz(clz clzVar, float f) {
        this.a = clzVar;
        this.c = f;
    }

    public final long a() {
        return ((cjt) this.b.a()).a;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        dpj.a(textPaint, this.c);
        textPaint.setShader((Shader) this.d.a());
    }
}
