package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpn implements cpm {
    private final View a;

    public cpn(View view) {
        this.a = view;
    }

    @Override // defpackage.cpm
    public final void a(int i) {
        if (a.bA(i, 0)) {
            this.a.performHapticFeedback(0);
        } else if (a.bA(i, 9)) {
            this.a.performHapticFeedback(9);
        }
    }
}
