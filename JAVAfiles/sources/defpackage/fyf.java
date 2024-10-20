package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyf extends no {
    public final String[] c;
    public final float[] d;
    public int e;
    public final /* synthetic */ fyj f;

    public fyf(fyj fyjVar, String[] strArr, float[] fArr) {
        this.f = fyjVar;
        this.c = strArr;
        this.d = fArr;
    }

    @Override // defpackage.no
    public final int b() {
        return this.c.length;
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        return new ajbx(LayoutInflater.from(this.f.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false), (char[]) null);
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void g(oo ooVar, int i) {
        String[] strArr = this.c;
        ajbx ajbxVar = (ajbx) ooVar;
        if (i < strArr.length) {
            ((TextView) ajbxVar.t).setText(strArr[i]);
        }
        int i2 = 1;
        if (i == this.e) {
            ajbxVar.a.setSelected(true);
            ((View) ajbxVar.s).setVisibility(0);
        } else {
            ajbxVar.a.setSelected(false);
            ((View) ajbxVar.s).setVisibility(4);
        }
        ajbxVar.a.setOnClickListener(new abbx(this, i, i2));
    }
}
