package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.simpicker.SimPickerItemView;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jas extends no {
    public List c;
    private final ahmn d;

    public jas(ahmn ahmnVar) {
        int i = alog.d;
        this.c = alsx.a;
        this.d = ahmnVar;
    }

    @Override // defpackage.no
    public final int b() {
        return ((alsx) this.c).c;
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        return new akhx((SimPickerItemView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sim_picker_item_view, viewGroup, false));
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [msk, java.lang.Object] */
    @Override // defpackage.no
    public final /* synthetic */ void g(oo ooVar, int i) {
        akhx akhxVar = (akhx) ooVar;
        aksa m = this.d.m("SimPickerItemAdapter#onBindViewHolder");
        try {
            jat E = ((SimPickerItemView) akhxVar.s).E();
            rti rtiVar = (rti) this.c.get(i);
            if (TextUtils.isEmpty(rtiVar.d)) {
                ((TextView) E.e).setVisibility(8);
            } else {
                ((TextView) E.e).setVisibility(0);
                ((TextView) E.e).setText(rtiVar.d);
            }
            String str = rtiVar.f;
            if (TextUtils.isEmpty(str)) {
                ((TextView) E.d).setVisibility(8);
            } else {
                ((TextView) E.d).setVisibility(0);
                Object obj = E.d;
                TextView textView = (TextView) obj;
                textView.setText(((xwr) E.a).a(E.g.t(str, rtiVar.a)));
            }
            ((ContactIconView) E.f).i(rtiVar.c);
            jae jaeVar = new jae(rtiVar);
            ((aohs) E.b).s((View) E.c, jaeVar);
            ((aohs) E.b).s((View) E.f, jaeVar);
            m.close();
        } catch (Throwable th) {
            try {
                m.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
