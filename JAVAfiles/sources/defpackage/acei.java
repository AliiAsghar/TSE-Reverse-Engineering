package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.location.picker.LocationAttachmentPickerActivity;
import com.google.android.gms.maps.internal.IOnMapClickListener;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acei extends IOnMapClickListener.Stub {
    final /* synthetic */ ahjj a;

    public acei(ahjj ahjjVar) {
        this.a = ahjjVar;
    }

    @Override // com.google.android.gms.maps.internal.IOnMapClickListener
    public final void onMapClick(LatLng latLng) {
        ((LocationAttachmentPickerActivity) this.a.a).U.f(latLng);
    }
}
