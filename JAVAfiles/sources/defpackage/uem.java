package defpackage;

import android.graphics.Bitmap;
import com.google.android.gms.maps.model.LatLng;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uem {
    public final LatLng a;
    public final aiba b;
    public Bitmap c;
    public boolean d;
    public final int e;
    public final int f = 1;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (r1.contains("premise") == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public uem(defpackage.aiba r3, com.google.android.gms.maps.model.LatLng r4) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.f = r0
            r2.b = r3
            r2.a = r4
            if (r3 != 0) goto Ld
            goto L6b
        Ld:
            java.util.List r3 = r3.E
            r4 = 3
            if (r3 != 0) goto L14
        L12:
            r0 = r4
            goto L6b
        L14:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r3)
            java.lang.String r3 = "postal_code"
            boolean r3 = r1.contains(r3)
            if (r3 != 0) goto L6b
            java.lang.String r3 = "postal_code_prefix"
            boolean r3 = r1.contains(r3)
            if (r3 != 0) goto L6b
            java.lang.String r3 = "postal_town"
            boolean r3 = r1.contains(r3)
            if (r3 != 0) goto L6b
            java.lang.String r3 = "political"
            boolean r3 = r1.contains(r3)
            if (r3 != 0) goto L6b
            java.lang.String r3 = "colloquial_area"
            boolean r3 = r1.contains(r3)
            if (r3 != 0) goto L6b
            java.lang.String r3 = "administrative_area_level_1"
            boolean r3 = r1.contains(r3)
            if (r3 != 0) goto L6b
            java.lang.String r3 = "administrative_area_level_2"
            boolean r3 = r1.contains(r3)
            if (r3 != 0) goto L6b
            java.lang.String r3 = "administrative_area_level_3"
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L5a
            goto L6b
        L5a:
            java.lang.String r3 = "street_address"
            boolean r3 = r1.contains(r3)
            r0 = 2
            if (r3 != 0) goto L6b
            java.lang.String r3 = "premise"
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L12
        L6b:
            r2.e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uem.<init>(aiba, com.google.android.gms.maps.model.LatLng):void");
    }

    public final CharSequence a() {
        return this.b.b;
    }

    public final CharSequence b() {
        return albo.ag(this.b.u);
    }

    public final CharSequence c() {
        int i = this.e - 1;
        if (i != 1 && i != 2) {
            return String.format(Locale.US, "(%1$.5f, %2$.5f)", Double.valueOf(this.a.a), Double.valueOf(this.a.b));
        }
        return this.b.b;
    }

    public final CharSequence d() {
        if (this.e - 1 != 2) {
            return null;
        }
        return this.b.u;
    }
}
