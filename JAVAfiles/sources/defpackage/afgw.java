package defpackage;

import android.view.View;
import android.widget.Button;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afgw extends afgs {
    public final afke u;
    public final afgo v;
    private final Button w;

    public afgw(afke afkeVar, View view, afgo afgoVar) {
        super(view);
        this.u = afkeVar;
        this.v = afgoVar;
        this.w = (Button) view;
    }

    @Override // defpackage.afgs
    public final Object D() {
        this.w.setOnClickListener(new acah(this, 3));
        return arnb.a;
    }

    @Override // defpackage.afgs
    public final Object E() {
        return arnb.a;
    }
}
