package defpackage;

import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afok extends afom {
    private final TextView s;

    public afok(View view) {
        super(view);
        this.s = (TextView) view;
    }

    @Override // defpackage.afom
    public final void D(afot afotVar) {
        afotVar.getClass();
        afos afosVar = (afos) afotVar;
        this.s.setText(afosVar.a);
        this.s.setContentDescription(afosVar.a);
    }
}
