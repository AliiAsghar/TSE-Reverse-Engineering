package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acen extends abxr {
    protected ahjj d;
    private final ViewGroup e;
    private final Context f;
    private final GoogleMapOptions g;
    private final List h = new ArrayList();

    public acen(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.e = viewGroup;
        this.f = context;
        this.g = googleMapOptions;
    }

    @Override // defpackage.abxr
    protected final void c(ahjj ahjjVar) {
        this.d = ahjjVar;
        if (ahjjVar != null && this.a == null) {
            try {
                try {
                    acep.a(this.f);
                    IMapViewDelegate newMapViewDelegate = acey.a(this.f).newMapViewDelegate(ObjectWrapper.wrap(this.f), this.g);
                    if (newMapViewDelegate != null) {
                        this.d.n(new acem(this.e, newMapViewDelegate));
                        Iterator it = this.h.iterator();
                        while (it.hasNext()) {
                            try {
                                ((acem) this.a).a.getMapAsync(new acel((aceq) it.next()));
                            } catch (RemoteException e) {
                                throw new acfc(e);
                            }
                        }
                        this.h.clear();
                    }
                } catch (abqn unused) {
                }
            } catch (RemoteException e2) {
                throw new acfc(e2);
            }
        }
    }
}
