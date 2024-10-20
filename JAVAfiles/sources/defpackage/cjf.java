package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cjf implements Comparator<FocusTargetNode> {
    public static final cjf a = new cjf();

    private cjf() {
    }

    private static final cbh a(cxn cxnVar) {
        cbh cbhVar = new cbh(new cxn[16]);
        while (cxnVar != null) {
            cbhVar.f(0, cxnVar);
            cxnVar = cxnVar.t();
        }
        return cbhVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        FocusTargetNode focusTargetNode3 = focusTargetNode;
        FocusTargetNode focusTargetNode4 = focusTargetNode2;
        int i = 0;
        if (cje.d(focusTargetNode3) && cje.d(focusTargetNode4)) {
            cxn e = cwp.e(focusTargetNode3);
            cxn e2 = cwp.e(focusTargetNode4);
            if (d.F(e, e2)) {
                return 0;
            }
            cbh a2 = a(e);
            cbh a3 = a(e2);
            int min = Math.min(a2.b - 1, a3.b - 1);
            if (min >= 0) {
                while (d.F(a2.a[i], a3.a[i])) {
                    if (i != min) {
                        i++;
                    }
                }
                return arro.a(((cxn) a2.a[i]).l(), ((cxn) a3.a[i]).l());
            }
            throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
        }
        if (cje.d(focusTargetNode3)) {
            return -1;
        }
        if (!cje.d(focusTargetNode4)) {
            return 0;
        }
        return 1;
    }
}
