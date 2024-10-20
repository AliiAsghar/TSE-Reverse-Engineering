package defpackage;

import android.os.RemoteException;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.picker.LocationAttachmentPickerActivity;
import com.google.android.gms.maps.internal.IOnMarkerDragListener;
import com.google.android.gms.maps.model.internal.IMarkerDelegate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aceg extends IOnMarkerDragListener.Stub {
    final /* synthetic */ ahjj a;

    public aceg(ahjj ahjjVar) {
        this.a = ahjjVar;
    }

    @Override // com.google.android.gms.maps.internal.IOnMarkerDragListener
    public final void onMarkerDrag(IMarkerDelegate iMarkerDelegate) {
        new acfa(iMarkerDelegate);
    }

    @Override // com.google.android.gms.maps.internal.IOnMarkerDragListener
    public final void onMarkerDragEnd(IMarkerDelegate iMarkerDelegate) {
        try {
            ((LocationAttachmentPickerActivity) this.a.a).U.f(new acfa(iMarkerDelegate).a.getPosition());
        } catch (RemoteException e) {
            throw new acfc(e);
        }
    }

    @Override // com.google.android.gms.maps.internal.IOnMarkerDragListener
    public final void onMarkerDragStart(IMarkerDelegate iMarkerDelegate) {
        new acfa(iMarkerDelegate);
    }
}
