package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfy;
import defpackage.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PersonEntity extends AbstractSafeParcelable implements Person {
    public static final Parcelable.Creator<PersonEntity> CREATOR = new acfy(13);
    public final String a;
    private final List b;
    private final List c;
    private final List d;
    private final List e;
    private final List f;
    private List g;
    private List h;
    private List i;
    private List j;
    private List k;

    public PersonEntity(String str, List list, List list2, List list3, List list4, List list5) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List b() {
        List list;
        if (this.k == null && (list = this.f) != null) {
            this.k = new ArrayList(list.size());
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                this.k.add((Birthday) it.next());
            }
        }
        return this.k;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List c() {
        List list;
        if (this.i == null && (list = this.d) != null) {
            this.i = new ArrayList(list.size());
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                this.i.add((Email) it.next());
            }
        }
        return this.i;
    }

    @Override // defpackage.abtr
    public final /* bridge */ /* synthetic */ Object d() {
        throw null;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List e() {
        List list;
        if (this.g == null && (list = this.b) != null) {
            this.g = new ArrayList(list.size());
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                this.g.add((Name) it.next());
            }
        }
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Person person = (Person) obj;
        if (!d.B(a(), person.a()) || !d.B(e(), person.e()) || !d.B(g(), person.g()) || !d.B(c(), person.c()) || !d.B(f(), person.f()) || !d.B(b(), person.b())) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List f() {
        List list;
        if (this.j == null && (list = this.e) != null) {
            this.j = new ArrayList(list.size());
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                this.j.add((Phone) it.next());
            }
        }
        return this.j;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List g() {
        List list;
        if (this.h == null && (list = this.c) != null) {
            this.h = new ArrayList(list.size());
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                this.h.add((Photo) it.next());
            }
        }
        return this.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), e(), g(), c(), f(), b()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 2, str, false);
        abhi.r(parcel, 4, e(), false);
        abhi.r(parcel, 5, g(), false);
        abhi.r(parcel, 9, b(), false);
        abhi.r(parcel, 11, c(), false);
        abhi.r(parcel, 13, f(), false);
        abhi.g(parcel, e);
    }
}
