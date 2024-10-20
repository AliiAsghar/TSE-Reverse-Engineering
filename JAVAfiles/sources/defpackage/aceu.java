package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aceu implements MapLifecycleDelegate {
    private final cg a;
    private final IMapFragmentDelegate b;

    public aceu(cg cgVar, IMapFragmentDelegate iMapFragmentDelegate) {
        this.b = iMapFragmentDelegate;
        abhg.m(cgVar);
        this.a = cgVar;
    }

    @Override // defpackage.abxs
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            acex.b(bundle, bundle2);
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
            try {
                IObjectWrapper onCreateView = this.b.onCreateView(ObjectWrapper.wrap(layoutInflater), ObjectWrapper.wrap(viewGroup), bundle2);
                StrictMode.setThreadPolicy(threadPolicy);
                acex.b(bundle2, bundle);
                return (View) ObjectWrapper.unwrap(onCreateView);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (RemoteException e) {
            throw new acfc(e);
        }
    }

    @Override // defpackage.abxs
    public final void b(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            acex.b(bundle, bundle2);
            Bundle bundle3 = this.a.m;
            if (bundle3 != null && bundle3.containsKey("MapOptions")) {
                acex.c(bundle2, "MapOptions", bundle3.getParcelable("MapOptions"));
            }
            this.b.onCreate(bundle2);
            acex.b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new acfc(e);
        }
    }

    @Override // defpackage.abxs
    public final void c() {
        try {
            this.b.onDestroy();
        } catch (RemoteException e) {
            throw new acfc(e);
        }
    }

    @Override // defpackage.abxs
    public final void d() {
        try {
            this.b.onDestroyView();
        } catch (RemoteException e) {
            throw new acfc(e);
        }
    }

    @Override // defpackage.abxs
    public final void e(Activity activity, Bundle bundle, Bundle bundle2) {
        GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
        try {
            Bundle bundle3 = new Bundle();
            acex.b(bundle2, bundle3);
            this.b.onInflate(ObjectWrapper.wrap(activity), googleMapOptions, bundle3);
            acex.b(bundle3, bundle2);
        } catch (RemoteException e) {
            throw new acfc(e);
        }
    }

    @Override // defpackage.abxs
    public final void f() {
        try {
            this.b.onLowMemory();
        } catch (RemoteException e) {
            throw new acfc(e);
        }
    }

    @Override // defpackage.abxs
    public final void g() {
        try {
            this.b.onPause();
        } catch (RemoteException e) {
            throw new acfc(e);
        }
    }

    @Override // com.google.android.gms.maps.internal.MapLifecycleDelegate
    public final void getMapAsync(aceq aceqVar) {
        try {
            this.b.getMapAsync(new acet(aceqVar));
        } catch (RemoteException e) {
            throw new acfc(e);
        }
    }

    @Override // defpackage.abxs
    public final void h() {
        try {
            this.b.onResume();
        } catch (RemoteException e) {
            throw new acfc(e);
        }
    }

    @Override // defpackage.abxs
    public final void i(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            acex.b(bundle, bundle2);
            this.b.onSaveInstanceState(bundle2);
            acex.b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new acfc(e);
        }
    }

    @Override // defpackage.abxs
    public final void j() {
        try {
            this.b.onStart();
        } catch (RemoteException e) {
            throw new acfc(e);
        }
    }

    @Override // defpackage.abxs
    public final void k() {
        try {
            this.b.onStop();
        } catch (RemoteException e) {
            throw new acfc(e);
        }
    }
}
