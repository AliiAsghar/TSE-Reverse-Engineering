package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajbt extends no {
    private List c;

    @Override // defpackage.no
    public final int b() {
        List list = this.c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        return new akhx(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.survey_system_info_item, viewGroup, false), (byte[]) null, (byte[]) null);
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void g(oo ooVar, int i) {
        akhx akhxVar = (akhx) ooVar;
        ece eceVar = (ece) this.c.get(i);
        ((TextView) akhxVar.s.findViewById(R.id.survey_system_info_item_key)).setText((CharSequence) eceVar.a);
        ((TextView) akhxVar.s.findViewById(R.id.survey_system_info_item_value)).setText((CharSequence) eceVar.b);
    }

    public final void m(List list) {
        this.c = list;
        p();
    }
}
