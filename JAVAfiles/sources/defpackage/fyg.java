package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyg extends no {
    final /* synthetic */ fyj c;
    private final String[] d;
    private final String[] e = new String[2];
    private final Drawable[] f;

    public fyg(fyj fyjVar, String[] strArr, Drawable[] drawableArr) {
        this.c = fyjVar;
        this.d = strArr;
        this.f = drawableArr;
    }

    public final boolean F(int i) {
        ert ertVar = this.c.D;
        if (ertVar == null) {
            return false;
        }
        if (i != 0) {
            if (i != 1) {
                return true;
            }
            if (!ertVar.l(30) || !this.c.D.l(29)) {
                return false;
            }
            return true;
        }
        return ertVar.l(13);
    }

    @Override // defpackage.no
    public final int b() {
        return 2;
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        return new agwe(this.c, LayoutInflater.from(this.c.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void g(oo ooVar, int i) {
        agwe agweVar = (agwe) ooVar;
        if (F(i)) {
            agweVar.a.setLayoutParams(new nx(-1, -2));
        } else {
            agweVar.a.setLayoutParams(new nx(0, 0));
        }
        ((TextView) agweVar.s).setText(this.d[i]);
        String str = this.e[i];
        if (str == null) {
            ((TextView) agweVar.t).setVisibility(8);
        } else {
            ((TextView) agweVar.t).setText(str);
        }
        Drawable drawable = this.f[i];
        if (drawable == null) {
            ((ImageView) agweVar.u).setVisibility(8);
        } else {
            ((ImageView) agweVar.u).setImageDrawable(drawable);
        }
    }

    @Override // defpackage.no
    public final long gI(int i) {
        return i;
    }

    public final void m(int i, String str) {
        this.e[i] = str;
    }
}
