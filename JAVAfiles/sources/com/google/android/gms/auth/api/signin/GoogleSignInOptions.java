package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ablt;
import defpackage.ablu;
import defpackage.abqy;
import defpackage.arjs;
import defpackage.mm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements ReflectedParcelable, abqy {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final Scope a;
    public static final Scope b;
    public static final Scope c;
    public static final Scope d;
    public static final GoogleSignInOptions e;
    public static final Comparator f;
    final int g;
    public final ArrayList h;
    public final Account i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final String n;
    public final ArrayList o;
    public final String p;

    static {
        Scope scope = new Scope("profile");
        a = scope;
        new Scope("email");
        b = new Scope("openid");
        Scope scope2 = new Scope("https://www.googleapis.com/auth/games_lite");
        c = scope2;
        d = new Scope("https://www.googleapis.com/auth/games");
        ablt abltVar = new ablt();
        abltVar.b();
        abltVar.a.add(scope);
        e = abltVar.a();
        ablt abltVar2 = new ablt();
        abltVar2.c(scope2, new Scope[0]);
        abltVar2.a();
        CREATOR = new ablu(0);
        f = new mm(14);
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3) {
        this.g = i;
        this.h = arrayList;
        this.i = account;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = str;
        this.n = str2;
        this.o = new ArrayList(map.values());
        this.p = str3;
    }

    public static Map b(List list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
                hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.b), googleSignInOptionsExtensionParcelable);
            }
        }
        return hashMap;
    }

    public final ArrayList a() {
        return new ArrayList(this.h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0043, code lost:
    
        if (r1.equals(r4.i) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L7f
            java.util.ArrayList r1 = r3.o     // Catch: java.lang.ClassCastException -> L7f
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L7f
            if (r1 == 0) goto L7f
            java.util.ArrayList r1 = r4.o     // Catch: java.lang.ClassCastException -> L7f
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != 0) goto L17
            goto L7f
        L17:
            java.util.ArrayList r1 = r3.h     // Catch: java.lang.ClassCastException -> L7f
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L7f
            java.util.ArrayList r2 = r4.a()     // Catch: java.lang.ClassCastException -> L7f
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != r2) goto L7f
            java.util.ArrayList r1 = r3.h     // Catch: java.lang.ClassCastException -> L7f
            java.util.ArrayList r2 = r4.a()     // Catch: java.lang.ClassCastException -> L7f
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != 0) goto L34
            goto L7f
        L34:
            android.accounts.Account r1 = r3.i     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != 0) goto L3d
            android.accounts.Account r1 = r4.i     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != 0) goto L7f
            goto L45
        L3d:
            android.accounts.Account r2 = r4.i     // Catch: java.lang.ClassCastException -> L7f
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L7f
            if (r1 == 0) goto L7f
        L45:
            java.lang.String r1 = r3.m     // Catch: java.lang.ClassCastException -> L7f
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L7f
            if (r1 == 0) goto L56
            java.lang.String r1 = r4.m     // Catch: java.lang.ClassCastException -> L7f
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L7f
            if (r1 == 0) goto L7f
            goto L61
        L56:
            java.lang.String r1 = r3.m     // Catch: java.lang.ClassCastException -> L7f
            java.lang.String r2 = r4.m     // Catch: java.lang.ClassCastException -> L7f
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != 0) goto L61
            goto L7f
        L61:
            boolean r1 = r3.l     // Catch: java.lang.ClassCastException -> L7f
            boolean r2 = r4.l     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != r2) goto L7f
            boolean r1 = r3.j     // Catch: java.lang.ClassCastException -> L7f
            boolean r2 = r4.j     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != r2) goto L7f
            boolean r1 = r3.k     // Catch: java.lang.ClassCastException -> L7f
            boolean r2 = r4.k     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != r2) goto L7f
            java.lang.String r1 = r3.p     // Catch: java.lang.ClassCastException -> L7f
            java.lang.String r4 = r4.p     // Catch: java.lang.ClassCastException -> L7f
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L7f
            if (r4 == 0) goto L7f
            r4 = 1
            return r4
        L7f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).b);
        }
        Collections.sort(arrayList);
        arjs arjsVar = new arjs((byte[]) null, (char[]) null);
        arjsVar.f(arrayList);
        arjsVar.f(this.i);
        arjsVar.f(this.m);
        arjsVar.e(this.l);
        arjsVar.e(this.j);
        arjsVar.e(this.k);
        arjsVar.f(this.p);
        return arjsVar.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e2 = abhi.e(parcel);
        abhi.m(parcel, 1, this.g);
        abhi.r(parcel, 2, a(), false);
        abhi.o(parcel, 3, this.i, i, false);
        abhi.h(parcel, 4, this.j);
        abhi.h(parcel, 5, this.k);
        abhi.h(parcel, 6, this.l);
        abhi.q(parcel, 7, this.m, false);
        abhi.q(parcel, 8, this.n, false);
        abhi.r(parcel, 9, this.o, false);
        abhi.q(parcel, 10, this.p, false);
        abhi.g(parcel, e2);
    }
}
