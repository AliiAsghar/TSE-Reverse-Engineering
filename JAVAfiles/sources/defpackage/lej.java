package defpackage;

import com.google.android.gms.maps.model.LatLng;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lej extends lei {
    public final /* synthetic */ lek a;
    private final akul c;

    public lej(lek lekVar, LatLng latLng) {
        this.a = lekVar;
        if (latLng == null) {
            this.c = null;
            lek.a.l("Cannot do reverse geocode query with empty map center.");
        } else {
            akul a = ((ykq) lekVar.e.get()).a();
            this.c = a;
            andy isnVar = new isn(this, 3);
            albo.bR(a, ((Boolean) lekVar.g.b()).booleanValue() ? isnVar : qjc.a(isnVar), lekVar.f);
        }
    }

    @Override // defpackage.lei
    public final void a() {
        super.a();
        akul akulVar = this.c;
        if (akulVar != null) {
            akulVar.cancel(false);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
