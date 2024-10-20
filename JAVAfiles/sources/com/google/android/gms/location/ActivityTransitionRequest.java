package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.acbp;
import defpackage.d;
import defpackage.mm;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new acbp(12);
    public static final Comparator a = new mm(15);
    public final List b;
    public final String c;
    public final List d;
    public String e;

    public ActivityTransitionRequest(List list, String str, List list2, String str2) {
        List unmodifiableList;
        d.aC(list, "transitions can't be null");
        d.t(!list.isEmpty(), "transitions can't be empty.");
        abhg.m(list);
        TreeSet treeSet = new TreeSet(a);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ActivityTransition activityTransition = (ActivityTransition) it.next();
            d.t(treeSet.add(activityTransition), String.format("Found duplicated transition: %s.", activityTransition));
        }
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = str;
        if (list2 == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list2);
        }
        this.d = unmodifiableList;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            if (d.B(this.b, activityTransitionRequest.b) && d.B(this.c, activityTransitionRequest.c) && d.B(this.e, activityTransitionRequest.e) && d.B(this.d, activityTransitionRequest.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        List list = this.d;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str2 = this.e;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i5 + i3;
    }

    public final String toString() {
        List list = this.d;
        return "ActivityTransitionRequest [mTransitions=" + String.valueOf(this.b) + ", mTag='" + this.c + "', mClients=" + String.valueOf(list) + ", mAttributionTag=" + this.e + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        abhg.m(parcel);
        List list = this.b;
        int e = abhi.e(parcel);
        abhi.r(parcel, 1, list, false);
        abhi.q(parcel, 2, this.c, false);
        abhi.r(parcel, 3, this.d, false);
        abhi.q(parcel, 4, this.e, false);
        abhi.g(parcel, e);
    }
}
