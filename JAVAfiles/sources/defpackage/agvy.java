package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agvy extends oq {
    final /* synthetic */ agvz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agvy(agvz agvzVar, RecyclerView recyclerView) {
        super(recyclerView);
        this.c = agvzVar;
    }

    @Override // defpackage.ecl
    public final boolean h(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        agwk agwkVar;
        if (accessibilityEvent.getEventType() == 1 && (agwkVar = this.c.C) != null) {
            agwkVar.a();
        }
        return super.h(viewGroup, view, accessibilityEvent);
    }
}
