package defpackage;

import android.view.View;
import android.view.autofill.AutofillManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgj {
    public final View a;
    public final cgo b;
    public final AutofillManager c;

    public cgj(View view, cgo cgoVar) {
        this.a = view;
        this.b = cgoVar;
        AutofillManager m95m = bl$$ExternalSyntheticApiModelOutline0.m95m(view.getContext().getSystemService(bl$$ExternalSyntheticApiModelOutline0.m109m$1()));
        if (m95m != null) {
            this.c = m95m;
            view.setImportantForAutofill(1);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.");
    }
}
