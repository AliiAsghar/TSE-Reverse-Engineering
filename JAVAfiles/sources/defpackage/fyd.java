package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyd extends fyi {
    public final /* synthetic */ fyj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyd(fyj fyjVar) {
        super(fyjVar);
        this.c = fyjVar;
    }

    public final boolean F(ese eseVar) {
        for (int i = 0; i < this.d.size(); i++) {
            if (eseVar.A.containsKey(((esf) ((apuv) this.d.get(i)).c).b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fyi
    public final void G(ajbx ajbxVar) {
        int i;
        ((TextView) ajbxVar.t).setText(R.string.exo_track_selection_auto);
        ert ertVar = this.c.D;
        dzg.g(ertVar);
        if (true != F(ertVar.I())) {
            i = 0;
        } else {
            i = 4;
        }
        ((View) ajbxVar.s).setVisibility(i);
        ajbxVar.a.setOnClickListener(new jh(this, 5, null));
    }

    @Override // defpackage.fyi
    public final void m(String str) {
        this.c.c.m(1, str);
    }
}
