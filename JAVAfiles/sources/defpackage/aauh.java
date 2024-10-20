package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aauh extends no {
    private final List c = new ArrayList();
    private final aaue d;

    public aauh(aaue aaueVar) {
        this.d = aaueVar;
    }

    @Override // defpackage.no
    public final int b() {
        return this.c.size();
    }

    @Override // defpackage.no
    public final int c(int i) {
        return 1;
    }

    @Override // defpackage.no
    public final oo e(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return new oo(from.inflate(R.layout.location_attachment_picker_search_results_error_m2, viewGroup, false), null);
            }
            return new ajbx(from.inflate(R.layout.location_attachment_picker_progress_bar, viewGroup, false), null, null);
        }
        return new ajbx(from.inflate(R.layout.location_attachment_picker_search_list_item_m2, viewGroup, false), null, null);
    }

    @Override // defpackage.no
    public final void g(oo ooVar, int i) {
        ajbx ajbxVar = (ajbx) ooVar;
        uem uemVar = (uem) this.c.get(i);
        ((TextView) ajbxVar.t).setText(uemVar.b());
        ((TextView) ajbxVar.s).setText(uemVar.a());
        ajbxVar.a.setOnClickListener(new zoz(this.d, uemVar, 16));
    }

    @Override // defpackage.no
    public final long gI(int i) {
        return i;
    }
}
