package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a;
import defpackage.abhi;
import defpackage.ajpv;
import defpackage.albo;
import defpackage.alfk;
import defpackage.alfn;
import defpackage.alfu;
import defpackage.alfv;
import defpackage.alfy;
import defpackage.algc;
import defpackage.alok;
import defpackage.alor;
import defpackage.altc;
import defpackage.aluq;
import defpackage.aoad;
import defpackage.aspp;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ContentType implements Parcelable {
    public static final Parcelable.Creator<ContentType> CREATOR = new ajpv(10);
    private static final algc a = new alfk(new alfk(new alfk(alfn.a, new alfy(alfv.a)), new alfu(' ')), algc.m("()<>@,;:\\\"/[]?="));
    private static final algc b = new alfk(alfn.a, algc.m("\"\\\r"));
    private static final algc c = algc.l(" \t\r\n");

    public static ContentType d(String str) {
        String k;
        aspp asppVar = new aspp(str);
        try {
            algc algcVar = a;
            String k2 = asppVar.k(algcVar);
            asppVar.n('/');
            String l = asppVar.l(algcVar);
            alok alokVar = new alok();
            while (asppVar.m()) {
                algc algcVar2 = c;
                asppVar.l(algcVar2);
                asppVar.n(';');
                asppVar.l(algcVar2);
                algc algcVar3 = a;
                String k3 = asppVar.k(algcVar3);
                asppVar.n('=');
                if (asppVar.j() == '\"') {
                    asppVar.n('\"');
                    StringBuilder sb = new StringBuilder();
                    while (asppVar.j() != '\"') {
                        if (asppVar.j() == '\\') {
                            asppVar.n('\\');
                            algc algcVar4 = alfn.a;
                            albo.T(asppVar.m());
                            char j = asppVar.j();
                            albo.T(algcVar4.c(j));
                            asppVar.a++;
                            sb.append(j);
                        } else {
                            sb.append(asppVar.k(b));
                        }
                    }
                    k = sb.toString();
                    asppVar.n('\"');
                } else {
                    k = asppVar.k(algcVar3);
                }
                alokVar.h(k3, k);
            }
            aoad g = g();
            g.C(k2);
            g.B(l);
            g.A(alokVar.b());
            return g.y();
        } catch (IllegalStateException e) {
            throw new IllegalArgumentException(a.bW(str, "Could not parse '", "'"), e);
        }
    }

    public static aoad g() {
        aoad aoadVar = new aoad((char[]) null, (byte[]) null);
        aoadVar.A(altc.a);
        return aoadVar;
    }

    public abstract alor a();

    public abstract String b();

    public abstract String c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e(ContentType contentType) {
        if (contentType == null || !c().equals(contentType.c()) || !b().equals(contentType.b())) {
            return false;
        }
        return true;
    }

    public final boolean f(String str) {
        if (str == null) {
            return false;
        }
        try {
            return e(d(str));
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(c());
        sb.append('/');
        sb.append(b());
        aluq listIterator = a().entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            sb.append("; ");
            sb.append((String) entry.getKey());
            sb.append('=');
            sb.append((String) entry.getValue());
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, toString(), false);
        abhi.g(parcel, e);
    }
}
