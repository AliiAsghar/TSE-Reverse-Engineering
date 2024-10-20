package defpackage;

import android.location.Location;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahyf extends ahxd {
    private final Location b;
    private final alog c;

    public ahyf(aibs aibsVar, Location location, alog alogVar, Locale locale, String str, agxw agxwVar) {
        super(aibsVar, locale, str, agxwVar);
        this.b = location;
        this.c = alogVar;
    }

    @Override // defpackage.ahxd
    protected final String a() {
        return "findplacefromuserlocation/json";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ahxd
    public final Map d() {
        String str;
        aibs aibsVar = (aibs) this.a;
        HashMap hashMap = new HashMap();
        alor alorVar = ahyn.a;
        Location location = this.b;
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        Double valueOf = Double.valueOf(latitude);
        Double valueOf2 = Double.valueOf(longitude);
        e(hashMap, "location", String.format(Locale.US, "%.15f,%.15f", valueOf, valueOf2));
        d.t(true, "maxLength must not be negative");
        StringBuilder sb = new StringBuilder();
        alog alogVar = this.c;
        int size = alogVar.size();
        for (int i = 0; i < size; i++) {
            ahww ahwwVar = (ahww) alogVar.get(i);
            int length = sb.length();
            alok alokVar = new alok();
            alokVar.h("mac", ahwwVar.a);
            alokVar.h("strength_dbm", Integer.valueOf(ahwwVar.b));
            alokVar.h("wifi_auth_type", ahyn.a.get(ahwwVar.c));
            alokVar.h("is_connected", Boolean.valueOf(ahwwVar.d));
            alokVar.h("frequency_mhz", Integer.valueOf(ahwwVar.e));
            alor b = alokVar.b();
            alhm alhmVar = new alhm(new algs(","), "=");
            Iterator it = b.entrySet().iterator();
            StringBuilder sb2 = new StringBuilder();
            alhmVar.a(sb2, it);
            String sb3 = sb2.toString();
            int length2 = sb.length();
            if (length > 0) {
                str = "|";
            } else {
                str = "";
            }
            String concat = str.concat(sb3);
            if (length2 + concat.length() > 4000) {
                break;
            }
            sb.append(concat);
        }
        e(hashMap, "wifiaccesspoints", sb.toString());
        Location location2 = this.b;
        float accuracy = location2.getAccuracy();
        Integer num = null;
        if (location2.hasAccuracy() && accuracy > brg.a) {
            num = Integer.valueOf(Math.round(accuracy * 100.0f));
        }
        e(hashMap, "precision", num);
        e(hashMap, "timestamp", Long.valueOf(this.b.getTime()));
        e(hashMap, "fields", ahyo.a(aibsVar.a));
        return hashMap;
    }
}
