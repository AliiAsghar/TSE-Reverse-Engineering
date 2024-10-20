package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abuc;
import defpackage.abuz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FieldMappingDictionary extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FieldMappingDictionary> CREATOR = new abuz(1);
    final int a;
    public final String b;
    private final HashMap c;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static class Entry extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Entry> CREATOR = new abuz(2);
        final int a;
        final String b;
        final ArrayList c;

        public Entry(int i, String str, ArrayList arrayList) {
            this.a = i;
            this.b = str;
            this.c = arrayList;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int e = abhi.e(parcel);
            abhi.m(parcel, 1, this.a);
            abhi.q(parcel, 2, this.b, false);
            abhi.r(parcel, 3, this.c, false);
            abhi.g(parcel, e);
        }

        public Entry(String str, Map map) {
            ArrayList arrayList;
            this.a = 1;
            this.b = str;
            if (map == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (String str2 : map.keySet()) {
                    arrayList.add(new FieldMapPair(str2, (FastJsonResponse.Field) map.get(str2)));
                }
            }
            this.c = arrayList;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static class FieldMapPair extends AbstractSafeParcelable {
        public static final Parcelable.Creator<FieldMapPair> CREATOR = new abuc(20);
        final int a;
        final String b;
        final FastJsonResponse.Field c;

        public FieldMapPair(int i, String str, FastJsonResponse.Field field) {
            this.a = i;
            this.b = str;
            this.c = field;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int e = abhi.e(parcel);
            abhi.m(parcel, 1, this.a);
            abhi.q(parcel, 2, this.b, false);
            abhi.o(parcel, 3, this.c, i, false);
            abhi.g(parcel, e);
        }

        public FieldMapPair(String str, FastJsonResponse.Field field) {
            this.a = 1;
            this.b = str;
            this.c = field;
        }
    }

    public FieldMappingDictionary(int i, ArrayList arrayList, String str) {
        this.a = i;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Entry entry = (Entry) arrayList.get(i2);
            String str2 = entry.b;
            HashMap hashMap2 = new HashMap();
            ArrayList arrayList2 = entry.c;
            abhg.m(arrayList2);
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                FieldMapPair fieldMapPair = (FieldMapPair) entry.c.get(i3);
                hashMap2.put(fieldMapPair.b, fieldMapPair.c);
            }
            hashMap.put(str2, hashMap2);
        }
        this.c = hashMap;
        abhg.m(str);
        this.b = str;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) this.c.get((String) it.next());
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                ((FastJsonResponse.Field) map.get((String) it2.next())).j = this;
            }
        }
    }

    public final Map a(String str) {
        return (Map) this.c.get(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.c.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) this.c.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.c.keySet()) {
            arrayList.add(new Entry(str, (Map) this.c.get(str)));
        }
        abhi.r(parcel, 2, arrayList, false);
        abhi.q(parcel, 3, this.b, false);
        abhi.g(parcel, e);
    }
}
