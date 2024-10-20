package defpackage;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acev extends abxr {
    public final List d = new ArrayList();
    protected ahjj e;
    private final cg f;
    private Activity g;

    public acev(cg cgVar) {
        this.f = cgVar;
    }

    @Override // defpackage.abxr
    protected final void c(ahjj ahjjVar) {
        this.e = ahjjVar;
        d();
    }

    public final void d() {
        Activity activity = this.g;
        if (activity != null && this.e != null && this.a == null) {
            try {
                acep.a(activity);
                IMapFragmentDelegate newMapFragmentDelegate = acey.a(this.g).newMapFragmentDelegate(ObjectWrapper.wrap(this.g));
                if (newMapFragmentDelegate != null) {
                    this.e.n(new aceu(this.f, newMapFragmentDelegate));
                    Iterator it = this.d.iterator();
                    while (it.hasNext()) {
                        ((aceu) this.a).getMapAsync((aceq) it.next());
                    }
                    this.d.clear();
                }
            } catch (abqn unused) {
            } catch (RemoteException e) {
                throw new acfc(e);
            }
        }
    }

    public final void e(Activity activity) {
        this.g = activity;
        d();
    }
}
