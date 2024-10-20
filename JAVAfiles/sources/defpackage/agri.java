package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agri implements Parcelable {
    public static final Parcelable.Creator<agri> CREATOR = new aftg(19);
    public final Bundle a;
    public final List b;
    private List c = new ArrayList();

    public agri() {
        Bundle bundle = new Bundle();
        this.a = bundle;
        bundle.putString("m.v", "3");
        this.b = new ArrayList();
    }

    public static boolean b(int i, long j) {
        if (i == 0 && j < 1500) {
            return true;
        }
        return false;
    }

    private final void g(String str, boolean z) {
        if (z) {
            this.a.putString(str, "1");
        } else {
            this.a.remove(str);
        }
    }

    private final void h(String str, long j) {
        if (j < 0) {
            this.a.remove(str);
        } else {
            this.a.putLong(str, j);
        }
    }

    public final Uri a(boolean z) {
        Uri.Builder builder = new Uri.Builder();
        h("m.lt", System.currentTimeMillis() / 1000);
        for (String str : this.a.keySet()) {
            if (z || !this.c.contains(str)) {
                Object obj = this.a.get(str);
                if (obj instanceof List) {
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        builder.appendQueryParameter(str, String.valueOf(it.next()));
                    }
                } else if (obj != null) {
                    builder.appendQueryParameter(str, obj.toString());
                }
            }
        }
        if ("o".equals(this.a.getString("t"))) {
            builder.appendQueryParameter("m.sh", "close");
        }
        builder.appendQueryParameter("d", "1");
        return builder.build();
    }

    public final void c(String str) {
        f("t", str);
    }

    public final void d(int i, aors aorsVar, aocl aoclVar) {
        long j;
        if ((aorsVar.b & 2) != 0) {
            j = aorsVar.e;
        } else {
            j = -1;
        }
        this.a.remove(a.bV(i, "m.sc-"));
        this.a.remove(a.bV(i, "m.d-"));
        if (b(i, j)) {
            Log.d("HatsLibAnswerBeacon", a.cn(j, "First question delay ", " is considered spammy."));
            h(a.bV(i, "m.sc-"), j);
        } else {
            h(a.bV(i, "m.d-"), j);
        }
        apao apaoVar = aoclVar.h;
        if (apaoVar.isEmpty()) {
            f(a.bV(i, "r.o-"), null);
        } else {
            f(a.bV(i, "r.o-"), TextUtils.join(".", apaoVar));
        }
        g(a.bV(i, "r.t-"), aorsVar.f);
        apax apaxVar = aorsVar.d;
        int T = a.T(aoclVar.d);
        if (T != 0 && T == 5) {
            this.c.add(a.bV(i, "r.r-"));
        }
        this.a.putStringArrayList(a.bV(i, "r.r-"), new ArrayList<>(apaxVar));
        if ((aorsVar.b & 16) != 0) {
            String str = aorsVar.g;
            if (Log.isLoggable("HatsLibAnswerBeacon", 3)) {
                Log.d("HatsLibAnswerBeacon", "Setting piped answer in beacon. Question Index: " + i + ", PipedAnswer candidate: " + str);
            }
            f(a.bV(i, "m.pa-"), str);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(int i) {
        g(a.bV(i, "r.s-"), true);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof agri) {
            Bundle bundle = this.a;
            Bundle bundle2 = ((agri) obj).a;
            if (bundle.size() == bundle2.size()) {
                Set<String> keySet = bundle.keySet();
                if (keySet.containsAll(bundle2.keySet())) {
                    for (String str : keySet) {
                        Object obj2 = bundle.get(str);
                        Object obj3 = bundle2.get(str);
                        if (obj2 == null) {
                            if (obj3 != null) {
                                return false;
                            }
                        } else if (!obj2.equals(obj3)) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void f(String str, String str2) {
        if (str2 == null) {
            this.a.remove(str);
        } else {
            this.a.putString(str, str2);
        }
    }

    public final int hashCode() {
        return this.a.keySet().hashCode();
    }

    public final String toString() {
        return "AnswerBeacon{" + a(true).toString().replace("&", "\n") + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
        parcel.writeInt(this.b.size());
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            parcel.writeByteArray(((aors) it.next()).toByteArray());
        }
    }

    public agri(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.a = readBundle;
        if (readBundle != null) {
            int readInt = parcel.readInt();
            this.b = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                this.b.add((aors) aetn.aZ(aors.a, parcel.createByteArray()));
            }
            return;
        }
        throw new NullPointerException("Parcel did not contain required Bundle while unparceling an AnswerBeacon.");
    }
}
