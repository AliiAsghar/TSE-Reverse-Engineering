package com.google.android.setupcompat.logging;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import defpackage.ajgk;
import defpackage.ajuk;
import defpackage.ajup;
import defpackage.d;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class CustomEvent implements Parcelable {
    public static final Parcelable.Creator<CustomEvent> CREATOR = new ajup();
    public final long a;
    public final MetricKey b;
    public final PersistableBundle c;
    public final PersistableBundle d;

    public CustomEvent(long j, MetricKey metricKey, PersistableBundle persistableBundle, PersistableBundle persistableBundle2) {
        boolean z;
        boolean z2;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        ajgk.r(z, "Timestamp cannot be negative.");
        d.aB(metricKey, "MetricKey cannot be null.");
        d.aB(persistableBundle, "Bundle cannot be null.");
        ajgk.r(!persistableBundle.isEmpty(), "Bundle cannot be empty.");
        d.aB(persistableBundle2, "piiValues cannot be null.");
        for (String str : persistableBundle.keySet()) {
            ajgk.p(str, "bundle key", 3, 50);
            Object obj = persistableBundle.get(str);
            if (obj instanceof String) {
                if (((String) obj).length() <= 50) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ajgk.r(z2, String.format("Maximum length of string value for key='%s' cannot exceed %s.", str, 50));
            }
        }
        this.a = j;
        this.b = metricKey;
        this.c = new PersistableBundle(persistableBundle);
        this.d = new PersistableBundle(persistableBundle2);
    }

    public static CustomEvent a(MetricKey metricKey, PersistableBundle persistableBundle) {
        boolean z;
        boolean z2 = true;
        if (Build.VERSION.SDK_INT >= 29) {
            z = true;
        } else {
            z = false;
        }
        ajgk.r(z, "The constructor only support on sdk Q or higher.");
        PersistableBundle persistableBundle2 = PersistableBundle.EMPTY;
        if (Build.VERSION.SDK_INT < 29) {
            z2 = false;
        }
        ajgk.r(z2, "The constructor only support on sdk Q or higher");
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        ajuk.c(persistableBundle);
        ajuk.c(persistableBundle2);
        return new CustomEvent(millis, metricKey, persistableBundle, persistableBundle2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomEvent)) {
            return false;
        }
        CustomEvent customEvent = (CustomEvent) obj;
        if (this.a == customEvent.a && d.B(this.b, customEvent.b) && ajuk.b(this.c, customEvent.c) && ajuk.b(this.d, customEvent.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writePersistableBundle(this.c);
        parcel.writePersistableBundle(this.d);
    }
}
