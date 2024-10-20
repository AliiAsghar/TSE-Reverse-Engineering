package defpackage;

import android.view.PointerIcon;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbf {
    public static final dbf a = new dbf();

    private dbf() {
    }

    public final void a(View view, cqx cqxVar) {
        PointerIcon pointerIcon;
        if (!(cqxVar instanceof cqd)) {
            PointerIcon systemIcon = cqxVar instanceof cqe ? PointerIcon.getSystemIcon(view.getContext(), ((cqe) cqxVar).a) : PointerIcon.getSystemIcon(view.getContext(), 1000);
            pointerIcon = view.getPointerIcon();
            if (d.F(pointerIcon, systemIcon)) {
                return;
            }
            view.setPointerIcon(systemIcon);
            return;
        }
        throw null;
    }
}
