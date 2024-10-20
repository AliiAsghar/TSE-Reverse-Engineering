package defpackage;

import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.IMarkerDelegate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acfa {
    public final IMarkerDelegate a;

    public acfa(IMarkerDelegate iMarkerDelegate) {
        abhg.m(iMarkerDelegate);
        this.a = iMarkerDelegate;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acfa)) {
            return false;
        }
        try {
            return this.a.equalsRemote(((acfa) obj).a);
        } catch (RemoteException e) {
            throw new acfc(e);
        }
    }

    public final int hashCode() {
        try {
            return this.a.hashCodeRemote();
        } catch (RemoteException e) {
            throw new acfc(e);
        }
    }
}
