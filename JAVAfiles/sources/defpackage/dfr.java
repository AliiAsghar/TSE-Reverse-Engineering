package defpackage;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dfr {
    public final Object a;
    public final View b;

    public dfr(ContentCaptureSession contentCaptureSession, View view) {
        this.a = contentCaptureSession;
        this.b = view;
    }

    public final AutofillId a(long j) {
        AutofillId newAutofillId;
        if (Build.VERSION.SDK_INT >= 29) {
            Object obj = this.a;
            newAutofillId = aei$$ExternalSyntheticApiModelOutline0.m25m(obj).newAutofillId(bl$$ExternalSyntheticApiModelOutline0.m94m(dfs.a(this.b).a), j);
            return newAutofillId;
        }
        return null;
    }
}
