package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.diagnostics.ui.DiagnosticsScenarioView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kow extends no {
    private final Context c;
    private final List d;

    public kow(List list, Context context) {
        this.c = context;
        this.d = list;
    }

    @Override // defpackage.no
    public final int b() {
        List list = this.d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // defpackage.no
    public final oo e(ViewGroup viewGroup, int i) {
        return new oo(LayoutInflater.from(this.c).inflate(R.layout.diagnostics_scenario_view, viewGroup, false));
    }

    @Override // defpackage.no
    public final void g(oo ooVar, int i) {
        xyl.k(ooVar.a instanceof DiagnosticsScenarioView);
        DiagnosticsScenarioView diagnosticsScenarioView = (DiagnosticsScenarioView) ooVar.a;
        knj knjVar = (knj) this.d.get(i);
        diagnosticsScenarioView.d = knjVar;
        diagnosticsScenarioView.a.setText(knjVar.a);
        diagnosticsScenarioView.b.setChecked(knjVar.c);
        diagnosticsScenarioView.a();
        Activity g = abbu.g(diagnosticsScenarioView.c);
        if (g != null) {
            knjVar.e = new ndk(diagnosticsScenarioView, g, (char[]) null);
        }
    }
}
