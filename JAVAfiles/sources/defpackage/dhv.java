package defpackage;

import com.android.vcard.VCardConstants;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhv implements CharSequence {
    public final List a;
    public final String b;
    public final List c;
    public final List d;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class b implements Appendable {
        public final StringBuilder a;
        public final List b;
        public final List c;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public final class a<T> {
            public int a;
            private final Object b;
            private final int c;
            private final String d;

            /* compiled from: PG */
            /* renamed from: dhv$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public final class C0046a {
                public static final a a(c cVar) {
                    return new a(cVar.a, cVar.b, cVar.c, cVar.d);
                }
            }

            public a(Object obj, int i, int i2, String str) {
                this.b = obj;
                this.c = i;
                this.a = i2;
                this.d = str;
            }

            public final c a(int i) {
                int i2 = this.a;
                if (i2 != Integer.MIN_VALUE) {
                    i = i2;
                }
                if (i == Integer.MIN_VALUE) {
                    doz.c("Item.end should be set first");
                }
                return new c(this.b, this.c, i, this.d);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                if (d.F(this.b, aVar.b) && this.c == aVar.c && this.a == aVar.a && d.F(this.d, aVar.d)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                int hashCode;
                Object obj = this.b;
                if (obj == null) {
                    hashCode = 0;
                } else {
                    hashCode = obj.hashCode();
                }
                return (((((hashCode * 31) + this.c) * 31) + this.a) * 31) + this.d.hashCode();
            }

            public final String toString() {
                return "MutableRange(item=" + this.b + ", start=" + this.c + ", end=" + this.a + ", tag=" + this.d + ')';
            }

            public /* synthetic */ a(Object obj, int i, int i2, String str, int i3) {
                this(obj, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, (i3 & 8) != 0 ? "" : str);
            }
        }

        public b() {
            this((byte[]) null);
        }

        public final int a(dip dipVar) {
            a aVar = new a(dipVar, this.a.length(), 0, null, 12);
            this.b.add(aVar);
            this.c.add(aVar);
            return this.b.size() - 1;
        }

        @Override // java.lang.Appendable
        public final /* bridge */ /* synthetic */ Appendable append(char c) {
            this.a.append(c);
            return this;
        }

        public final dhv b() {
            String sb = this.a.toString();
            List list = this.c;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(((a) list.get(i)).a(this.a.length()));
            }
            return new dhv(sb, arrayList);
        }

        public final void c(dij dijVar, int i, int i2) {
            this.c.add(new a(dijVar, i, i2, null, 8));
        }

        public final void d(dip dipVar, int i, int i2) {
            this.c.add(new a(dipVar, i, i2, null, 8));
        }

        public final void e(dhv dhvVar) {
            StringBuilder sb = this.a;
            int length = sb.length();
            sb.append(dhvVar.b);
            List list = dhvVar.a;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    c cVar = (c) list.get(i);
                    this.c.add(new a(cVar.a, cVar.b + length, cVar.c + length, cVar.d));
                }
            }
        }

        public final void f(String str) {
            this.a.append(str);
        }

        public final void g() {
            if (this.b.isEmpty()) {
                doz.c("Nothing to pop.");
            }
            ((a) this.b.remove(r0.size() - 1)).a = this.a.length();
        }

        public final void h(int i) {
            if (i >= this.b.size()) {
                doz.c(i + " should be less than " + this.b.size());
            }
            while (this.b.size() - 1 >= i) {
                g();
            }
        }

        public /* synthetic */ b(byte[] bArr) {
            this.a = new StringBuilder(16);
            this.b = new ArrayList();
            this.c = new ArrayList();
        }

        @Override // java.lang.Appendable
        public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
            if (charSequence instanceof dhv) {
                e((dhv) charSequence);
            } else {
                this.a.append(charSequence);
            }
            return this;
        }

        @Override // java.lang.Appendable
        public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
            List list;
            if (charSequence instanceof dhv) {
                dhv dhvVar = (dhv) charSequence;
                StringBuilder sb = this.a;
                String str = dhvVar.b;
                int length = sb.length();
                sb.append((CharSequence) str, i, i2);
                dhv dhvVar2 = dhw.a;
                List list2 = null;
                if (i != i2 && (list = dhvVar.a) != null) {
                    if (i == 0) {
                        if (i2 >= dhvVar.b.length()) {
                            list2 = list;
                        } else {
                            i = 0;
                        }
                    }
                    list2 = new ArrayList(list.size());
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        c cVar = (c) list.get(i3);
                        int i4 = cVar.b;
                        if (dhw.a(i, i2, i4, cVar.c)) {
                            list2.add(new c((a) cVar.a, arrn.u(i4, i, i2) - i, arrn.u(cVar.c, i, i2) - i, cVar.d));
                        }
                    }
                }
                if (list2 != null) {
                    int size2 = list2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        c cVar2 = (c) list2.get(i5);
                        this.c.add(new a(cVar2.a, cVar2.b + length, cVar2.c + length, cVar2.d));
                    }
                }
            } else {
                this.a.append(charSequence, i, i2);
            }
            return this;
        }

        public b(dhv dhvVar) {
            this((byte[]) null);
            e(dhvVar);
        }

        public b(String str) {
            this((byte[]) null);
            f(str);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class c<T> {
        public final Object a;
        public final int b;
        public final int c;
        public final String d;

        public c(Object obj, int i, int i2) {
            this(obj, i, i2, "");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (d.F(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c && d.F(this.d, cVar.d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            Object obj = this.a;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            return (((((hashCode * 31) + this.b) * 31) + this.c) * 31) + this.d.hashCode();
        }

        public final String toString() {
            return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ')';
        }

        public c(Object obj, int i, int i2, String str) {
            this.a = obj;
            this.b = i;
            this.c = i2;
            this.d = str;
            if (i <= i2) {
                return;
            }
            doz.b("Reversed range is not supported");
        }
    }

    public dhv(String str, List list) {
        this(true == list.isEmpty() ? null : list, str);
    }

    public final int a() {
        return this.b.length();
    }

    public final dhv b(dhv dhvVar) {
        b bVar = new b(this);
        bVar.e(dhvVar);
        return bVar.b();
    }

    @Override // java.lang.CharSequence
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final dhv subSequence(int i, int i2) {
        if (i > i2) {
            doz.b("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        if (i == 0 && i2 == this.b.length()) {
            return this;
        }
        String substring = this.b.substring(i, i2);
        substring.getClass();
        List list = this.a;
        dhv dhvVar = dhw.a;
        if (i > i2) {
            doz.b("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                c cVar = (c) list.get(i3);
                int i4 = cVar.b;
                if (dhw.a(i, i2, i4, cVar.c)) {
                    arrayList2.add(new c(cVar.a, Math.max(i, i4) - i, Math.min(i2, cVar.c) - i, cVar.d));
                }
            }
            if (true != arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new dhv(arrayList, substring);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return this.b.charAt(i);
    }

    public final List d() {
        List list = this.c;
        if (list == null) {
            return arnv.a;
        }
        return list;
    }

    public final List e(int i) {
        List list = this.a;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                c cVar = (c) obj;
                if ((cVar.a instanceof dhz) && dhw.a(0, i, cVar.b, cVar.c)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return arnv.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhv)) {
            return false;
        }
        dhv dhvVar = (dhv) obj;
        if (d.F(this.b, dhvVar.b) && d.F(this.a, dhvVar.a)) {
            return true;
        }
        return false;
    }

    public final List f(int i, int i2) {
        List list = this.a;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                c cVar = (c) list.get(i3);
                if ((cVar.a instanceof dis) && d.F(VCardConstants.PROPERTY_URL, cVar.d) && dhw.a(i, i2, cVar.b, cVar.c)) {
                    Object obj = cVar.a;
                    obj.getClass();
                    arrayList.add(new c(((dis) obj).a, cVar.b, cVar.c, cVar.d));
                }
            }
            return arrayList;
        }
        return arnv.a;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.b.hashCode() * 31;
        List list = this.a;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return a();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.b;
    }

    public /* synthetic */ dhv(String str) {
        this(str, arnv.a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ dhv(java.lang.String r2, java.util.List r3, int r4) {
        /*
            r1 = this;
            r4 = r4 & 2
            if (r4 == 0) goto L6
            arnv r3 = defpackage.arnv.a
        L6:
            dhv r4 = defpackage.dhw.a
            r4 = 1
            boolean r0 = r3.isEmpty()
            if (r4 != r0) goto L10
            r3 = 0
        L10:
            r1.<init>(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhv.<init>(java.lang.String, java.util.List, int):void");
    }

    public dhv(List list, String str) {
        ArrayList arrayList;
        this.a = list;
        this.b = str;
        ArrayList arrayList2 = null;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            for (int i = 0; i < size; i++) {
                c cVar = (c) list.get(i);
                Object obj = cVar.a;
                if (obj instanceof dip) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    cVar.getClass();
                    arrayList2.add(cVar);
                } else if (obj instanceof dij) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    cVar.getClass();
                    arrayList.add(cVar);
                }
            }
        } else {
            arrayList = null;
        }
        this.c = arrayList2;
        this.d = arrayList;
        if (arrayList != null) {
            List au = aqjn.au(arrayList, new Comparator() { // from class: dhv.1
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return arrj.q(Integer.valueOf(((c) obj2).b), Integer.valueOf(((c) obj3).b));
                }
            });
            int size2 = au.size();
            int i2 = -1;
            for (int i3 = 0; i3 < size2; i3++) {
                c cVar2 = (c) au.get(i3);
                if (cVar2.b < i2) {
                    doz.b("ParagraphStyle should not overlap");
                }
                if (cVar2.c > this.b.length()) {
                    doz.b("ParagraphStyle range [" + cVar2.b + ", " + cVar2.c + ") is out of boundary");
                }
                i2 = cVar2.c;
            }
        }
    }
}
