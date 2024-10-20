package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import com.google.android.apps.messaging.diagnostics.ui.DiagnosticsScenarioView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kov implements View.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ kov(aalt aaltVar, EditText editText, Activity activity, aals aalsVar, int i) {
        this.e = i;
        this.d = aaltVar;
        this.a = editText;
        this.b = activity;
        this.c = aalsVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, aals] */
    /* JADX WARN: Type inference failed for: r7v15, types: [ert, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                String obj = ((EditText) this.a).getText().toString();
                int length = obj.length();
                Object obj2 = this.d;
                if (length != 6) {
                    ((abbu) ((aalt) obj2).Z.b()).l("Invalid PIN, enter 6 digits from verification SMS");
                    return;
                }
                aalt aaltVar = (aalt) obj2;
                aaltVar.s((Context) this.b, new aakk(aaltVar, obj, (aals) this.c, 5));
                return;
            }
            ?? r7 = this.b;
            if (!r7.l(29)) {
                return;
            }
            Object obj3 = this.c;
            Object obj4 = this.a;
            Object obj5 = this.d;
            fiu fiuVar = new fiu((fiv) r7.I());
            apuv apuvVar = (apuv) obj3;
            esb esbVar = new esb((esa) obj4, alog.r(Integer.valueOf(apuvVar.a)));
            fiuVar.b(esbVar.a());
            fiuVar.r.put(esbVar.a, esbVar);
            fiuVar.c(((esf) apuvVar.c).a());
            r7.O(new fiv(fiuVar));
            fyi fyiVar = (fyi) obj5;
            fyiVar.m((String) apuvVar.b);
            fyiVar.e.g.dismiss();
            return;
        }
        new AlertDialog.Builder((Context) this.b).setTitle(((DiagnosticsScenarioView) this.a).d.a + ": " + ((String) this.c)).setItems((CharSequence[]) this.d.toArray(new CharSequence[0]), new iws(3)).create().show();
    }

    public /* synthetic */ kov(DiagnosticsScenarioView diagnosticsScenarioView, Context context, String str, List list, int i) {
        this.e = i;
        this.a = diagnosticsScenarioView;
        this.b = context;
        this.c = str;
        this.d = list;
    }

    public /* synthetic */ kov(fyi fyiVar, ert ertVar, esa esaVar, apuv apuvVar, int i) {
        this.e = i;
        this.d = fyiVar;
        this.b = ertVar;
        this.a = esaVar;
        this.c = apuvVar;
    }
}
