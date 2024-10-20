package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ryy {
    public static final xze a = xze.g("Bugle", "LocationUtils");
    public static final String b = new String(Character.toChars(128205));
    public final Context c;
    public final rtg d;

    public ryy(Context context, rtg rtgVar) {
        this.c = context;
        this.d = rtgVar;
    }

    public final String a(MessagePartCoreData messagePartCoreData) {
        if (messagePartCoreData.bl()) {
            LocationInformation J = messagePartCoreData.J();
            J.getClass();
            return this.c.getString(R.string.share_location_prefix, b, String.format(Locale.US, "https://www.google.com/maps/place/%1$.5f,%2$.5f/", Double.valueOf(J.d), Double.valueOf(J.c)));
        }
        throw new IllegalArgumentException("Cannot generate location sms text for non-location attachment.");
    }
}
