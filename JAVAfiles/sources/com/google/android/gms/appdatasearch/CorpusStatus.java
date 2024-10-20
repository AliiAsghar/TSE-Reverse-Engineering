package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abjg;
import defpackage.d;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CorpusStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CorpusStatus> CREATOR = new abjg(4);
    final boolean a;
    final long b;
    final long c;
    final long d;
    final Bundle e;
    final String f;
    final String g;

    CorpusStatus() {
        this(false, 0L, 0L, 0L, null, null, null);
    }

    public final Map a() {
        HashMap hashMap = new HashMap();
        for (String str : this.e.keySet()) {
            int i = this.e.getInt(str, -1);
            if (i != -1) {
                hashMap.put(str, Integer.valueOf(i));
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CorpusStatus) {
            CorpusStatus corpusStatus = (CorpusStatus) obj;
            if (d.B(Boolean.valueOf(this.a), Boolean.valueOf(corpusStatus.a)) && d.B(Long.valueOf(this.b), Long.valueOf(corpusStatus.b)) && d.B(Long.valueOf(this.c), Long.valueOf(corpusStatus.c)) && d.B(Long.valueOf(this.d), Long.valueOf(corpusStatus.d)) && d.B(a(), corpusStatus.a()) && d.B(this.g, corpusStatus.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d), a(), this.g});
    }

    public final String toString() {
        return "CorpusStatus{found=" + this.a + ", contentIncarnation=" + this.g + ", lastIndexedSeqno=" + this.b + ", lastCommittedSeqno=" + this.c + ", committedNumDocuments=" + this.d + ", counters=" + this.e.toString() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.h(parcel, 1, this.a);
        abhi.n(parcel, 2, this.b);
        abhi.n(parcel, 3, this.c);
        abhi.n(parcel, 4, this.d);
        abhi.t(parcel, 5, this.e);
        abhi.q(parcel, 6, this.f, false);
        abhi.q(parcel, 7, this.g, false);
        abhi.g(parcel, e);
    }

    public CorpusStatus(boolean z, long j, long j2, long j3, Bundle bundle, String str, String str2) {
        this.a = z;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = bundle == null ? new Bundle() : bundle;
        this.f = str;
        this.g = str2;
    }
}
