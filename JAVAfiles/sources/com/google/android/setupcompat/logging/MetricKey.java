package com.google.android.setupcompat.logging;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ajgk;
import defpackage.ajuw;
import defpackage.d;
import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class MetricKey implements Parcelable {
    public static final Parcelable.Creator<MetricKey> CREATOR = new ajuw(1);
    private static final Pattern a = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]+");
    private final String b;
    private final String c;

    static {
        Pattern.compile("^([a-z]+[.])+[A-Z][a-zA-Z0-9]+");
        Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]+");
    }

    public MetricKey(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public static Bundle a(MetricKey metricKey) {
        d.aB(metricKey, "MetricKey cannot be null.");
        Bundle bundle = new Bundle();
        bundle.putInt("MetricKey_version", 1);
        bundle.putString("MetricKey_name", metricKey.b);
        bundle.putString("MetricKey_screenName", metricKey.c);
        return bundle;
    }

    public static MetricKey b(String str, Activity activity) {
        String className = activity.getComponentName().getClassName();
        ajgk.p(str, "MetricKey.name", 5, 30);
        ajgk.r(a.matcher(str).matches(), "Invalid MetricKey, only alpha numeric characters are allowed.");
        return new MetricKey(str, className);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetricKey)) {
            return false;
        }
        MetricKey metricKey = (MetricKey) obj;
        if (d.B(this.b, metricKey.b) && d.B(this.c, metricKey.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
