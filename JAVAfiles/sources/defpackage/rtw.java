package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rtw implements Comparable, rtv {
    public final String a;
    public final String b;
    private final boolean c;
    private final Uri d;
    private final long e;

    public rtw(long j, String str, boolean z, Uri uri, long j2) {
        this.a = String.valueOf(j);
        this.b = str;
        this.c = z;
        this.d = uri;
        this.e = j2;
    }

    public static Uri d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Uri.parse(str);
    }

    public static String e(Resources resources, List list, String str) {
        return f(resources, list, str, false);
    }

    public static String f(Resources resources, List list, String str, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rtv rtvVar = (rtv) it.next();
            if (rtvVar.b().equals(str)) {
                if (z) {
                    arrayList.add(0, resources.getString(R.string.tombstone_self_capitalized));
                } else {
                    arrayList.add(0, resources.getString(R.string.tombstone_self));
                }
            } else if (qta.r()) {
                String a = rtvVar.a();
                a.getClass();
                arrayList.add(wfh.x(a));
            } else {
                String a2 = rtvVar.a();
                a2.getClass();
                arrayList.add(wfh.y(a2));
            }
        }
        return ytd.c(resources, arrayList);
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public static boolean h(List list, String str) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                if (((rtv) list.get(i)).b().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.rtv
    public final String a() {
        return this.b;
    }

    @Override // defpackage.rtv
    public final String b() {
        return this.a;
    }

    @Override // defpackage.rtv
    public final boolean c() {
        return this.c;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        rtw rtwVar = (rtw) obj;
        int compare = Long.compare(this.e, rtwVar.e);
        if (compare != 0) {
            return compare;
        }
        return this.a.compareTo(rtwVar.a);
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (obj == null || !(obj instanceof rtw)) {
            return false;
        }
        rtw rtwVar = (rtw) obj;
        if (TextUtils.isEmpty(this.b)) {
            equals = TextUtils.isEmpty(rtwVar.b);
        } else {
            equals = this.b.equals(rtwVar.b);
        }
        if (!this.a.equals(rtwVar.a) || !equals || this.c != rtwVar.c || !this.d.equals(rtwVar.d) || this.e != rtwVar.e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Boolean.valueOf(this.c), this.d, Long.valueOf(this.e));
    }

    public final String toString() {
        return "ParticipantId: " + this.a + ", displayName: " + this.b + ", isPenpalBot: " + this.c + ", avatarUri: " + String.valueOf(this.d) + ", timeStamp: " + this.e;
    }
}
