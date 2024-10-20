package defpackage;

import android.view.View;
import android.view.ViewStructure;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dba {
    public static final dba a = new dba();

    private dba() {
    }

    public final void a(ViewStructure viewStructure, View view) {
        viewStructure.setClassName(view.getAccessibilityClassName().toString());
    }
}
