package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyh extends fyi {
    public final /* synthetic */ fyj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyh(fyj fyjVar) {
        super(fyjVar);
        this.c = fyjVar;
    }

    public final void F(List list) {
        Drawable drawable;
        String str;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= ((alsx) list).c) {
                break;
            }
            if (((apuv) list.get(i)).q()) {
                z = true;
                break;
            }
            i++;
        }
        fyj fyjVar = this.c;
        ImageView imageView = fyjVar.p;
        if (imageView != null) {
            if (z) {
                drawable = fyjVar.z;
            } else {
                drawable = fyjVar.A;
            }
            imageView.setImageDrawable(drawable);
            fyj fyjVar2 = this.c;
            if (z) {
                str = fyjVar2.B;
            } else {
                str = fyjVar2.C;
            }
            fyjVar2.p.setContentDescription(str);
        }
        this.d = list;
    }

    @Override // defpackage.fyi
    public final void G(ajbx ajbxVar) {
        boolean z;
        ((TextView) ajbxVar.t).setText(R.string.exo_track_selection_none);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < this.d.size()) {
                if (((apuv) this.d.get(i2)).q()) {
                    z = false;
                    break;
                }
                i2++;
            } else {
                z = true;
                break;
            }
        }
        Object obj = ajbxVar.s;
        if (true != z) {
            i = 4;
        }
        ((View) obj).setVisibility(i);
        ajbxVar.a.setOnClickListener(new jh(this, 6, null));
    }

    @Override // defpackage.fyi
    /* renamed from: H */
    public final void g(ajbx ajbxVar, int i) {
        int i2;
        super.g(ajbxVar, i);
        if (i > 0) {
            apuv apuvVar = (apuv) this.d.get(i - 1);
            Object obj = ajbxVar.s;
            if (true != apuvVar.q()) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            ((View) obj).setVisibility(i2);
        }
    }

    @Override // defpackage.fyi, defpackage.no
    public final /* bridge */ /* synthetic */ void g(oo ooVar, int i) {
        g((ajbx) ooVar, i);
    }

    @Override // defpackage.fyi
    public final void m(String str) {
    }
}
