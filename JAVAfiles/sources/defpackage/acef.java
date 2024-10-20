package defpackage;

import com.google.android.gms.maps.internal.IOnMarkerClickListener;
import com.google.android.gms.maps.model.internal.IMarkerDelegate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acef extends IOnMarkerClickListener.Stub {
    @Override // com.google.android.gms.maps.internal.IOnMarkerClickListener
    public final boolean onMarkerClick(IMarkerDelegate iMarkerDelegate) {
        new acfa(iMarkerDelegate);
        return true;
    }
}
