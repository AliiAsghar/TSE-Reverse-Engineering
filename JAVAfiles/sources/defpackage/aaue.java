package defpackage;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.picker.LocationAttachmentPickerActivity;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaue implements acde {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/ui/mediapicker/c2o/location/picker/LocationAttachmentPickerPresenter");
    public acdd b;
    public lek c;
    public WeakReference d;
    public Location e;
    public uem f;
    public final mbl g;
    private LatLng h;
    private final Context i;
    private final LocationManager j;
    private final yjf k;

    public aaue(Context context, LocationManager locationManager, yjf yjfVar, mbl mblVar, lek lekVar) {
        this.i = context;
        this.j = locationManager;
        this.k = yjfVar;
        this.g = mblVar;
        int i = acdh.a;
        this.b = new acdo(context);
        this.c = lekVar;
        synchronized (lek.b) {
            lekVar.c = new WeakReference(this);
        }
    }

    @Override // defpackage.acde
    public final void a(Location location) {
        this.e = location;
        if (this.h == null) {
            e();
        } else {
            b();
        }
    }

    public final void b() {
        LocationAttachmentPickerActivity locationAttachmentPickerActivity = (LocationAttachmentPickerActivity) this.d.get();
        if (locationAttachmentPickerActivity != null) {
            locationAttachmentPickerActivity.O.setText(R.string.location_attachment_picker_location_error);
        }
    }

    public final void c(aiba aibaVar) {
        this.f = new uem(aibaVar, this.h);
        xzw.a.post(new aaqk(this, 7));
    }

    public final void d(uem uemVar) {
        this.f = uemVar;
        this.h = uemVar.a;
        LocationAttachmentPickerActivity locationAttachmentPickerActivity = (LocationAttachmentPickerActivity) this.d.get();
        if (locationAttachmentPickerActivity != null) {
            locationAttachmentPickerActivity.E();
            locationAttachmentPickerActivity.ac(uemVar, true);
            locationAttachmentPickerActivity.ab(this.h);
            locationAttachmentPickerActivity.aa(this.h);
        }
        this.c.a();
    }

    public final void e() {
        Location location = this.e;
        if (location != null) {
            f(new LatLng(location.getLatitude(), location.getLongitude()));
            LocationAttachmentPickerActivity locationAttachmentPickerActivity = (LocationAttachmentPickerActivity) this.d.get();
            if (locationAttachmentPickerActivity != null) {
                locationAttachmentPickerActivity.aa(this.h);
            }
        }
    }

    public final void f(LatLng latLng) {
        LatLngBounds latLngBounds;
        this.h = latLng;
        LocationAttachmentPickerActivity locationAttachmentPickerActivity = (LocationAttachmentPickerActivity) this.d.get();
        LatLng latLng2 = this.h;
        if (latLng2 == null) {
            latLngBounds = null;
        } else {
            latLngBounds = new LatLngBounds(latLng2, latLng2);
        }
        if (locationAttachmentPickerActivity != null) {
            locationAttachmentPickerActivity.ab(this.h);
            locationAttachmentPickerActivity.E();
        }
        this.c.a();
        if (latLngBounds == null) {
            xzw.a.post(new aaqk(this, 6));
            return;
        }
        lek lekVar = this.c;
        lej lejVar = new lej(lekVar, this.h);
        synchronized (lekVar.d) {
            if (lekVar.i != null) {
                lekVar.i.a();
            }
            lekVar.i = lejVar;
        }
        qjb.a(lejVar, lekVar.f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
    
        if (java.lang.Integer.parseInt(r1) != 1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        if (r2 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        if (r2 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0056, code lost:
    
        if (r1 != null) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaue.g():void");
    }
}
