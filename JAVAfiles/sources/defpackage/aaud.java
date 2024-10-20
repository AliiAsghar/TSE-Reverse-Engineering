package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.location.picker.LocationAttachmentPickerActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaud extends rg {
    final /* synthetic */ LocationAttachmentPickerActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaud(LocationAttachmentPickerActivity locationAttachmentPickerActivity) {
        super(true);
        this.a = locationAttachmentPickerActivity;
    }

    @Override // defpackage.rg
    public final void b() {
        this.a.T.c("Bugle.Share.LocationAttachmentPicker.ExitedWithoutSending");
        h(false);
        this.a.c().d();
    }
}
