package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zqy implements abcz {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public zqy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.abcz
    public final void a(boolean z) {
        boolean z2;
        int i;
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    ((aaxd) this.a).g();
                    return;
                }
                ((aabp) this.a).g.w(z);
                if (!z) {
                    int i3 = ((aabp) this.a).c.e;
                    return;
                }
                return;
            }
            ((ixd) this.a).aE();
            return;
        }
        zqz zqzVar = (zqz) this.a;
        boolean z3 = false;
        if (TextUtils.isEmpty(zqzVar.b.d()) && !((zrb) zqzVar.b).c.ac() && !((zrb) zqzVar.b).c.aa()) {
            z2 = false;
        } else {
            z2 = true;
        }
        zra zraVar = zqzVar.b;
        if (z2 || (zqzVar.a.b && ((zrb) zqzVar.b).c.i.hasFocus())) {
            z3 = true;
        }
        if (((Boolean) utw.O.e()).booleanValue()) {
            zri zriVar = ((zrb) zraVar).c;
            Boolean bool = zriVar.L;
            if (bool != null && z3 == bool.booleanValue()) {
                return;
            }
            if (true != z3) {
                i = R.color.compose_pill_inactive_background;
            } else {
                i = R.color.compose_pill_active_background;
            }
            ((GradientDrawable) ((LayerDrawable) zriVar.i.getBackground()).getDrawable(1)).setColor(zriVar.k.getColor(i));
            zriVar.L = Boolean.valueOf(z3);
        }
    }

    public /* synthetic */ zqy(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
