package com.google.android.apps.messaging.shared.datamodel.action.common;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.rha;
import defpackage.rhl;
import defpackage.xyo;
import defpackage.xyp;
import defpackage.xze;
import defpackage.yhx;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ActionParameters implements Parcelable, rhl {
    private final Bundle b;
    private static final xze a = xze.g("BugleAction", "ActionParameters");
    public static final Parcelable.Creator<ActionParameters> CREATOR = new rha(3);

    public ActionParameters() {
        this.b = new Bundle();
    }

    private final synchronized void K() {
        Object obj;
        Parcel obtain = Parcel.obtain();
        String str = null;
        try {
            try {
                obj = null;
                for (String str2 : this.b.keySet()) {
                    try {
                    } catch (RuntimeException e) {
                        e = e;
                    }
                    try {
                        obj = this.b.get(str2);
                        if (obj instanceof Parcelable) {
                            obtain.writeParcelable((Parcelable) obj, 0);
                            obtain.marshall();
                        }
                        str = str2;
                    } catch (RuntimeException e2) {
                        e = e2;
                        str = str2;
                        xyo b = a.b();
                        b.H("Bundle member isn't marshallable. Cannot be stored in ActionParameters.");
                        b.z(str, obj);
                        b.r(e);
                        throw e;
                    }
                }
            } finally {
                obtain.recycle();
            }
        } catch (RuntimeException e3) {
            e = e3;
            obj = null;
        }
    }

    @Override // defpackage.rhl
    public final synchronized byte[] A(String str) {
        return this.b.getByteArray(str);
    }

    @Override // defpackage.rhl
    public final synchronized String[] B(String str) {
        return this.b.getStringArray(str);
    }

    @Override // defpackage.rhl
    public final synchronized Bundle C() {
        return this.b.getBundle("chat.extra.additionalMessageDetails");
    }

    @Override // defpackage.rhl
    public final synchronized Duration D() {
        return Duration.ofNanos(this.b.getLong("retry_delay", 0L));
    }

    @Override // defpackage.rhl
    public final synchronized Parcelable[] E() {
        return this.b.getParcelableArray("messages");
    }

    @Override // defpackage.rhl
    public final synchronized ArrayList F(ArrayList arrayList) {
        ArrayList parcelableArrayList;
        parcelableArrayList = this.b.getParcelableArrayList("rcs.intent.extra.conversationClassifications");
        if (parcelableArrayList == null) {
            return arrayList;
        }
        return parcelableArrayList;
    }

    @Override // defpackage.rhl
    public final synchronized ArrayList G() {
        return this.b.getStringArrayList("message_ids");
    }

    @Override // defpackage.rhl
    public final synchronized void H(Duration duration) {
        this.b.putLong("retry_delay", duration.toNanos());
    }

    @Override // defpackage.rhl
    public final synchronized void I(Parcelable[] parcelableArr) {
        this.b.putParcelableArray("messages", parcelableArr);
    }

    @Override // defpackage.rhl
    public final synchronized void J(ArrayList arrayList) {
        this.b.putStringArrayList("message_ids", arrayList);
    }

    @Override // defpackage.rhl
    public final synchronized int a(String str) {
        return this.b.getInt(str);
    }

    @Override // defpackage.rhl
    public final synchronized int b(String str, int i) {
        return this.b.getInt(str, i);
    }

    public final synchronized int c() {
        return this.b.size();
    }

    @Override // defpackage.rhl
    public final synchronized long d(String str) {
        return this.b.getLong(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.rhl
    public final synchronized long e(String str, long j) {
        return this.b.getLong(str, j);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ActionParameters)) {
            return false;
        }
        ActionParameters actionParameters = (ActionParameters) obj;
        if (c() != actionParameters.c()) {
            return false;
        }
        for (String str : actionParameters.o()) {
            if (!Objects.equals(actionParameters.k(str), k(str))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.rhl
    public final synchronized BaseBundle f() {
        return this.b;
    }

    public final synchronized Bundle g() {
        return this.b;
    }

    @Override // defpackage.rhl
    public final synchronized Parcelable h(String str) {
        return this.b.getParcelable(str);
    }

    public final int hashCode() {
        int i;
        Iterator it = o().iterator();
        int i2 = 352654597;
        int i3 = 0;
        int i4 = 352654597;
        while (it.hasNext()) {
            Object k = k((String) it.next());
            if (k != null) {
                i = k.hashCode();
            } else {
                i = 0;
            }
            if (i3 % 2 == 0) {
                i2 = (((i2 << 5) + i2) + (i2 >> 27)) ^ i;
            } else {
                i4 = (((i4 << 5) + i4) + (i4 >> 27)) ^ i;
            }
            i3++;
        }
        return i2 + (i4 * 1566083941);
    }

    @Override // defpackage.rhl
    public final Optional j() {
        return Optional.empty();
    }

    public final synchronized Object k(String str) {
        return this.b.get(str);
    }

    @Override // defpackage.rhl
    public final synchronized String l(String str) {
        return this.b.getString(str);
    }

    @Override // defpackage.rhl
    public final synchronized ArrayList m(String str) {
        return this.b.getParcelableArrayList(str);
    }

    @Override // defpackage.rhl
    public final synchronized ArrayList n(String str, Class cls) {
        ArrayList parcelableArrayList;
        if (!yhx.h) {
            return this.b.getParcelableArrayList(str);
        }
        parcelableArrayList = this.b.getParcelableArrayList(str, cls);
        return parcelableArrayList;
    }

    public final synchronized Set o() {
        return this.b.keySet();
    }

    @Override // defpackage.rhl
    public final synchronized void p(String str, boolean z) {
        this.b.putBoolean(str, z);
    }

    @Override // defpackage.rhl
    public final synchronized void q(String str, byte[] bArr) {
        this.b.putByteArray(str, bArr);
    }

    @Override // defpackage.rhl
    public final synchronized void r(String str, int i) {
        this.b.putInt(str, i);
    }

    @Override // defpackage.rhl
    public final synchronized void s(String str, long j) {
        this.b.putLong(str, j);
    }

    @Override // defpackage.rhl
    public final synchronized void t(String str, Parcelable parcelable) {
        this.b.putParcelable(str, parcelable);
    }

    @Override // defpackage.rhl
    public final synchronized void u(String str, ArrayList arrayList) {
        this.b.putParcelableArrayList(str, arrayList);
    }

    @Override // defpackage.rhl
    public final synchronized void v(String str, String str2) {
        this.b.putString(str, str2);
    }

    @Override // defpackage.rhl
    public final synchronized void w(String str, String[] strArr) {
        this.b.putStringArray(str, strArr);
    }

    @Override // android.os.Parcelable
    public final synchronized void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
    }

    @Override // defpackage.rhl
    public final synchronized boolean x(String str) {
        return this.b.containsKey(str);
    }

    @Override // defpackage.rhl
    public final synchronized boolean y(String str) {
        return this.b.getBoolean(str);
    }

    @Override // defpackage.rhl
    public final synchronized boolean z(String str, boolean z) {
        return this.b.getBoolean(str, z);
    }

    public ActionParameters(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.b = bundle2;
        bundle2.remove("pending_intent");
        if (xyp.c()) {
            K();
        }
    }

    public ActionParameters(Parcel parcel) {
        this.b = parcel.readBundle(ActionParameters.class.getClassLoader());
    }

    @Override // defpackage.rhl
    public final ActionParameters i() {
        return this;
    }
}
