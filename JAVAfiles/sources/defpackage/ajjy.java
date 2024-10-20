package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajjy extends ajka {
    final /* synthetic */ Context a;
    final /* synthetic */ TextPaint b;
    final /* synthetic */ ajka c;
    final /* synthetic */ ajjz d;

    public ajjy(ajjz ajjzVar, Context context, TextPaint textPaint, ajka ajkaVar) {
        this.a = context;
        this.b = textPaint;
        this.c = ajkaVar;
        this.d = ajjzVar;
    }

    @Override // defpackage.ajka
    public final void a(int i) {
        this.c.a(i);
    }

    @Override // defpackage.ajka
    public final void b(Typeface typeface, boolean z) {
        this.d.e(this.a, this.b, typeface);
        this.c.b(typeface, z);
    }
}
