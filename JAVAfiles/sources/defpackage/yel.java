package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yel {
    public final String a;
    public final String b;
    public final Integer c;
    public final List d;

    public yel() {
        throw null;
    }

    public final Integer a() {
        List list = this.d;
        if (list != null) {
            return (Integer) list.get(1);
        }
        return null;
    }

    public final Integer b() {
        List list = this.d;
        if (list != null) {
            return (Integer) list.get(0);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yel) {
            yel yelVar = (yel) obj;
            String str = this.a;
            if (str != null ? str.equals(yelVar.a) : yelVar.a == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(yelVar.b) : yelVar.b == null) {
                    Integer num = this.c;
                    if (num != null ? num.equals(yelVar.c) : yelVar.c == null) {
                        List list = this.d;
                        List list2 = yelVar.d;
                        if (list != null ? list.equals(list2) : list2 == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = hashCode ^ 1000003;
        Integer num = this.c;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i3 = ((((i2 * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003;
        List list = this.d;
        if (list != null) {
            i = list.hashCode();
        }
        return i3 ^ i;
    }

    public final String toString() {
        return "TenorMedia{url=" + this.a + ", preview=" + this.b + ", size=" + this.c + ", dims=" + String.valueOf(this.d) + "}";
    }

    public yel(String str, String str2, Integer num, List list) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = list;
    }
}
