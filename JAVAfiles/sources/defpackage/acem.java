package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acem implements MapLifecycleDelegate {
    public final IMapViewDelegate a;
    private final ViewGroup b;
    private View c;

    public acem(ViewGroup viewGroup, IMapViewDelegate iMapViewDelegate) {
        this.a = iMapViewDelegate;
        abhg.m(viewGroup);
        this.b = viewGroup;
    }

    @Override // defpackage.abxs
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
    }

    @Override // defpackage.abxs
    public final void b(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            acex.b(bundle, bundle2);
            this.a.onCreate(bundle2);
            acex.b(bundle2, bundle);
            this.c = (View) ObjectWrapper.unwrap(this.a.getView());
            this.b.removeAllViews();
            this.b.addView(this.c);
        } catch (RemoteException e) {
            throw new acfc(e);
        }
    }

    @Override // defpackage.abxs
    public final void c() {
        try {
            this.a.onDestroy();
        } catch (RemoteException e) {
            throw new acfc(e);
        }
    }

    @Override // defpackage.abxs
    public final void d() {
        throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
    }

    @Override // defpackage.abxs
    public final void e(Activity activity, Bundle bundle, Bundle bundle2) {
        throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
    }

    @Override // defpackage.abxs
    public final void f() {
        try {
            this.a.onLowMemory();
        } catch (RemoteException e) {
            throw new acfc(e);
        }
    }

    @Override // defpackage.abxs
    public final void g() {
        try {
            this.a.onPause();
        } catch (RemoteException e) {
            throw new acfc(e);
        }
    }

    @Override // com.google.android.gms.maps.internal.MapLifecycleDelegate
    public final void getMapAsync(aceq aceqVar) {
        try {
            this.a.getMapAsync(new acel(aceqVar));
        } catch (RemoteException e) {
            throw new acfc(e);
        }
    }

    @Override // defpackage.abxs
    public final void h() {
        try {
            this.a.onResume();
        } catch (RemoteException e) {
            throw new acfc(e);
        }
    }

    @Override // defpackage.abxs
    public final void i(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            acex.b(bundle, bundle2);
            this.a.onSaveInstanceState(bundle2);
            acex.b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new acfc(e);
        }
    }

    @Override // defpackage.abxs
    public final void j() {
        try {
            this.a.onStart();
        } catch (RemoteException e) {
            throw new acfc(e);
        }
    }

    @Override // defpackage.abxs
    public final void k() {
        try {
            this.a.onStop();
        } catch (RemoteException e) {
            throw new acfc(e);
        }
    }
}
