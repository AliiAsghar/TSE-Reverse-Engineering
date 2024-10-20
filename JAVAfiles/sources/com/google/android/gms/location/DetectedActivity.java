package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.acbp;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DetectedActivity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new acbp(14);
    final int a;
    final int b;

    public DetectedActivity(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DetectedActivity) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            if (this.a == detectedActivity.a && this.b == detectedActivity.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    public final String toString() {
        String str;
        int i = this.a;
        if (i > 22 || i < 0) {
            i = 4;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 7) {
                                    if (i != 8) {
                                        if (i != 16) {
                                            if (i != 17) {
                                                str = Integer.toString(i);
                                            } else {
                                                str = "IN_RAIL_VEHICLE";
                                            }
                                        } else {
                                            str = "IN_ROAD_VEHICLE";
                                        }
                                    } else {
                                        str = "RUNNING";
                                    }
                                } else {
                                    str = "WALKING";
                                }
                            } else {
                                str = "TILTING";
                            }
                        } else {
                            str = "UNKNOWN";
                        }
                    } else {
                        str = "STILL";
                    }
                } else {
                    str = "ON_FOOT";
                }
            } else {
                str = "ON_BICYCLE";
            }
        } else {
            str = "IN_VEHICLE";
        }
        return "DetectedActivity [type=" + str + ", confidence=" + this.b + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        abhg.m(parcel);
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.m(parcel, 2, this.b);
        abhi.g(parcel, e);
    }
}
