package com.google.android.gms.location;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acdi;
import defpackage.acdj;
import defpackage.acee;
import defpackage.d;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public final List b;
    public static final List a = Collections.emptyList();
    public static final Parcelable.Creator<LocationResult> CREATOR = new acdi(1);

    public LocationResult(List list) {
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (Build.VERSION.SDK_INT >= 31) {
            return this.b.equals(locationResult.b);
        }
        if (this.b.size() != locationResult.b.size()) {
            return false;
        }
        Iterator it = locationResult.b.iterator();
        for (Location location : this.b) {
            Location location2 = (Location) it.next();
            if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !d.B(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    public final String toString() {
        boolean isFromMockProvider;
        String str;
        String l;
        boolean hasBearingAccuracy;
        float bearingAccuracyDegrees;
        boolean hasSpeedAccuracy;
        float speedAccuracyMetersPerSecond;
        boolean hasVerticalAccuracy;
        float verticalAccuracyMeters;
        StringBuilder sb = new StringBuilder("LocationResult");
        DecimalFormat decimalFormat = acdj.a;
        List<Location> list = this.b;
        sb.ensureCapacity(list.size() * 100);
        sb.append("[");
        boolean z = false;
        for (Location location : list) {
            sb.ensureCapacity(100);
            String str2 = null;
            if (location == null) {
                sb.append((String) null);
            } else {
                sb.append("{");
                if (!TextUtils.isEmpty(location.getProvider())) {
                    sb.append(location.getProvider());
                    sb.append(", ");
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    isFromMockProvider = location.isMock();
                } else {
                    isFromMockProvider = location.isFromMockProvider();
                }
                if (isFromMockProvider) {
                    sb.append("mock, ");
                }
                sb.append(acdj.a.format(location.getLatitude()));
                sb.append(",");
                sb.append(acdj.a.format(location.getLongitude()));
                if (location.hasAccuracy()) {
                    sb.append("±");
                    sb.append(acdj.b.format(location.getAccuracy()));
                    sb.append("m");
                }
                if (location.hasAltitude()) {
                    sb.append(", alt=");
                    sb.append(acdj.b.format(location.getAltitude()));
                    hasVerticalAccuracy = location.hasVerticalAccuracy();
                    if (hasVerticalAccuracy) {
                        sb.append("±");
                        DecimalFormat decimalFormat2 = acdj.b;
                        verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                        sb.append(decimalFormat2.format(verticalAccuracyMeters));
                    }
                    sb.append("m");
                }
                if (location.hasSpeed()) {
                    sb.append(", spd=");
                    sb.append(acdj.b.format(location.getSpeed()));
                    hasSpeedAccuracy = location.hasSpeedAccuracy();
                    if (hasSpeedAccuracy) {
                        sb.append("±");
                        DecimalFormat decimalFormat3 = acdj.b;
                        speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                        sb.append(decimalFormat3.format(speedAccuracyMetersPerSecond));
                    }
                    sb.append("m/s");
                }
                if (location.hasBearing()) {
                    sb.append(", brg=");
                    sb.append(acdj.b.format(location.getBearing()));
                    hasBearingAccuracy = location.hasBearingAccuracy();
                    if (hasBearingAccuracy) {
                        sb.append("±");
                        DecimalFormat decimalFormat4 = acdj.b;
                        bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                        sb.append(decimalFormat4.format(bearingAccuracyDegrees));
                    }
                    sb.append("°");
                }
                Bundle extras = location.getExtras();
                if (extras != null) {
                    str = extras.getString("floorLabel");
                } else {
                    str = null;
                }
                if (str != null) {
                    sb.append(", fl=");
                    sb.append(str);
                }
                Bundle extras2 = location.getExtras();
                if (extras2 != null) {
                    str2 = extras2.getString("levelId");
                }
                if (str2 != null) {
                    sb.append(", lv=");
                    sb.append(str2);
                }
                long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                sb.append(", ert=");
                long millis = TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos()) + currentTimeMillis;
                if (millis >= 0) {
                    l = acee.a.format(new Date(millis));
                } else {
                    l = Long.toString(millis);
                }
                sb.append(l);
                sb.append('}');
            }
            sb.append(", ");
            z = true;
        }
        if (z) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.b;
        int e = abhi.e(parcel);
        abhi.r(parcel, 1, list, false);
        abhi.g(parcel, e);
    }
}
