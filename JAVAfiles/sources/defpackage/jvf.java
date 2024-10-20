package defpackage;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import com.google.android.apps.messaging.conversation2.bottomcontent.composerow.draft.attachment.RichLocation;
import j$.util.Optional;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jvf {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationHandlerImpl");
    public final arwe b;
    public final Context c;
    public final Optional d;
    public final ascg e;
    public final afku f;
    public final eog g;
    public final odl h;
    public final armf i;
    public final lkd j;
    public final lre k;
    public final wpm l;
    public final jxv m;

    public jvf(arwe arweVar, Context context, Optional optional, ascg ascgVar, lkd lkdVar, afku afkuVar, jxv jxvVar, eog eogVar, lre lreVar, odl odlVar, wpm wpmVar, armf armfVar) {
        arweVar.getClass();
        context.getClass();
        optional.getClass();
        ascgVar.getClass();
        lkdVar.getClass();
        afkuVar.getClass();
        jxvVar.getClass();
        eogVar.getClass();
        lreVar.getClass();
        odlVar.getClass();
        wpmVar.getClass();
        armfVar.getClass();
        this.b = arweVar;
        this.c = context;
        this.d = optional;
        this.e = ascgVar;
        this.j = lkdVar;
        this.f = afkuVar;
        this.m = jxvVar;
        this.g = eogVar;
        this.k = lreVar;
        this.h = odlVar;
        this.l = wpmVar;
        this.i = armfVar;
    }

    public final void a(Exception exc) {
        alvw i = a.i();
        i.X(alwp.a, "BugleComposeRow2");
        ((alvg) ((alvg) i).g(exc).h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationHandlerImpl", "handleLocationFailure", 219, "LocationHandlerImpl.kt")).q("Unable to attach location directly");
        qjh.l(this.b, null, new jsu(this, (arpe) null, 4), 3);
    }

    public final void b(ru ruVar) {
        Parcelable parcelableExtra;
        Object parcelableExtra2;
        if (ruVar.a == -1) {
            Intent intent = ruVar.b;
            if (intent == null) {
                alvw h = a.h();
                h.X(alwp.a, "BugleComposeRow2");
                ((alvg) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationHandlerImpl", "handleLocationResult", 152, "LocationHandlerImpl.kt")).q("Location picker succeeded with null data");
                return;
            }
            Uri data = intent.getData();
            String stringExtra = intent.getStringExtra("location_url");
            if (Build.VERSION.SDK_INT > 33) {
                parcelableExtra2 = intent.getParcelableExtra("location_extra", Location.class);
                parcelableExtra = (Parcelable) parcelableExtra2;
            } else {
                parcelableExtra = intent.getParcelableExtra("location_extra");
            }
            Location location = (Location) parcelableExtra;
            if (data != null && stringExtra != null && location != null) {
                alvw d = a.d();
                d.X(alwp.a, "BugleComposeRow2");
                ((alvg) d.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationHandlerImpl", "handleLocationResult", 162, "LocationHandlerImpl.kt")).J("Setting location url as attachment, dataUri %s, locationUrl %s, location %s", data, stringExtra, location);
                if (d.F(data, Uri.EMPTY)) {
                    this.f.g(new RichLocation(stringExtra, location.getLatitude(), location.getLongitude()));
                    return;
                } else {
                    Objects.toString(data);
                    throw new IllegalStateException("Location picker result data URI is ".concat(data.toString()));
                }
            }
            alvw i = a.i();
            i.X(alwp.a, "BugleComposeRow2");
            ((alvg) i.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationHandlerImpl", "handleLocationResult", 181, "LocationHandlerImpl.kt")).J("Missing data, not setting location, dataUri %s, locationUrl %s, location %s", data, stringExtra, location);
            return;
        }
        alvw g = a.g();
        g.X(alwp.a, "BugleComposeRow2");
        ((alvg) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationHandlerImpl", "handleLocationResult", 147, "LocationHandlerImpl.kt")).r("Location picker did not succeed. resultCode %s", ruVar.a);
    }
}
