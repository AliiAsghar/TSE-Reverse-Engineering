package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zpv implements View.OnClickListener {
    private final xnv a;
    private final View.OnClickListener b;
    private long c = -500;

    public zpv(xnv xnvVar, View.OnClickListener onClickListener) {
        this.a = xnvVar;
        this.b = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.a.f().toEpochMilli() - this.c >= 500) {
            this.c = this.a.f().toEpochMilli();
            this.b.onClick(view);
        }
    }
}
