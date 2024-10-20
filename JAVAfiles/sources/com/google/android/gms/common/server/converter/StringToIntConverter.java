package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abuc;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class StringToIntConverter extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new abuc(18);
    final int a;
    public final HashMap b;
    public final SparseArray c;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class Entry extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Entry> CREATOR = new abuc(19);
        final int a;
        final String b;
        final int c;

        public Entry(int i, String str, int i2) {
            this.a = i;
            this.b = str;
            this.c = i2;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int e = abhi.e(parcel);
            abhi.m(parcel, 1, this.a);
            abhi.q(parcel, 2, this.b, false);
            abhi.m(parcel, 3, this.c);
            abhi.g(parcel, e);
        }

        public Entry(String str, int i) {
            this.a = 1;
            this.b = str;
            this.c = i;
        }
    }

    public StringToIntConverter() {
        this.a = 1;
        this.b = new HashMap();
        this.c = new SparseArray();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.b.keySet()) {
            arrayList.add(new Entry(str, ((Integer) this.b.get(str)).intValue()));
        }
        abhi.r(parcel, 2, arrayList, false);
        abhi.g(parcel, e);
    }

    public StringToIntConverter(int i, ArrayList arrayList) {
        this.a = i;
        this.b = new HashMap();
        this.c = new SparseArray();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Entry entry = (Entry) arrayList.get(i2);
            String str = entry.b;
            int i3 = entry.c;
            this.b.put(str, Integer.valueOf(i3));
            this.c.put(i3, str);
        }
    }
}
