package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class akhw extends oq {
    final oq c;
    final /* synthetic */ akhy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akhw(akhy akhyVar, RecyclerView recyclerView) {
        super(recyclerView);
        this.d = akhyVar;
        this.c = recyclerView.Q;
    }

    private final int l() {
        return Math.max(this.d.b(), -1);
    }

    @Override // defpackage.oq, defpackage.ecl
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        accessibilityEvent.setItemCount(l());
        accessibilityEvent.setFromIndex(accessibilityEvent.getFromIndex());
        accessibilityEvent.setToIndex(accessibilityEvent.getToIndex());
    }

    @Override // defpackage.oq, defpackage.ecl
    public final void c(View view, efx efxVar) {
        efu efuVar;
        int columnCount;
        super.c(view, efxVar);
        AccessibilityNodeInfo.CollectionInfo collectionInfo = efxVar.a.getCollectionInfo();
        if (collectionInfo != null) {
            efuVar = new efu(collectionInfo);
        } else {
            efuVar = null;
        }
        int l = l();
        boolean z = true;
        if (efuVar == null) {
            columnCount = 1;
        } else {
            columnCount = ((AccessibilityNodeInfo.CollectionInfo) efuVar.a).getColumnCount();
        }
        if (efuVar == null || !((AccessibilityNodeInfo.CollectionInfo) efuVar.a).isHierarchical()) {
            z = false;
        }
        efxVar.s(new efu(AccessibilityNodeInfo.CollectionInfo.obtain(l, columnCount, z)));
    }
}
