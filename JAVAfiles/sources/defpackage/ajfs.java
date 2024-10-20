package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajfs extends ajka {
    final /* synthetic */ Chip a;

    public ajfs(Chip chip) {
        this.a = chip;
    }

    @Override // defpackage.ajka
    public final void b(Typeface typeface, boolean z) {
        CharSequence text;
        Chip chip = this.a;
        ajfw ajfwVar = chip.b;
        if (ajfwVar.m) {
            text = ajfwVar.c;
        } else {
            text = chip.getText();
        }
        chip.setText(text);
        this.a.requestLayout();
        this.a.invalidate();
    }

    @Override // defpackage.ajka
    public final void a(int i) {
    }
}
