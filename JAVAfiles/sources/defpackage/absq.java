package defpackage;

import android.app.Dialog;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.picker.LocationAttachmentPickerActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class absq {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public absq() {
        throw null;
    }

    public final void a() {
        ((absb) ((absa) this.b).b).b();
        if (((Dialog) this.a).isShowing()) {
            ((Dialog) this.a).dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [aceq, java.lang.Object] */
    public final void b(aceo aceoVar) {
        ((alvg) ((alvg) LocationAttachmentPickerActivity.H.g()).h("com/google/android/apps/messaging/ui/mediapicker/c2o/location/picker/LocationAttachmentPickerActivity", "initializeViews", 230, "LocationAttachmentPickerActivity.java")).t("Initialized maps SDK with %s renderer", aceoVar);
        if (abvk.e()) {
            Object obj = this.b;
            ?? r0 = this.a;
            acev acevVar = ((acew) obj).a;
            abxs abxsVar = acevVar.a;
            if (abxsVar != null) {
                ((aceu) abxsVar).getMapAsync(r0);
                return;
            } else {
                acevVar.d.add(r0);
                return;
            }
        }
        throw new IllegalStateException("getMapAsync must be called on the main thread.");
    }

    public absq(absa absaVar, Dialog dialog) {
        this.a = dialog;
        this.b = absaVar;
    }

    public /* synthetic */ absq(LocationAttachmentPickerActivity locationAttachmentPickerActivity, acew acewVar) {
        this.a = locationAttachmentPickerActivity;
        this.b = acewVar;
    }
}
