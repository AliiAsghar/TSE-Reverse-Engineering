package defpackage;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acej {
    public final IGoogleMapDelegate a;
    private zfm b;

    public acej(IGoogleMapDelegate iGoogleMapDelegate) {
        new HashMap();
        new HashMap();
        abhg.m(iGoogleMapDelegate);
        this.a = iGoogleMapDelegate;
    }

    public final zfm a() {
        try {
            if (this.b == null) {
                this.b = new zfm(this.a.getUiSettings(), (byte[]) null);
            }
            return this.b;
        } catch (RemoteException e) {
            throw new acfc(e);
        }
    }
}
