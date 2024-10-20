package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aikz extends aiku implements Cloneable {
    protected boolean a;
    protected String b;
    protected String c;
    public String d;
    public Object e;

    public aikz() {
        this.d = null;
        this.e = null;
        this.b = "=";
        this.c = "";
    }

    public final String a() {
        return albo.ag(this.d);
    }

    public final void b() {
        this.a = true;
        this.c = "\"";
    }

    @Override // defpackage.aiku
    public final String c() {
        Object obj = this.e;
        if (obj != null && obj.toString().isEmpty() && !this.a) {
            obj = null;
        }
        String str = this.d;
        if (str != null && obj != null) {
            return str + this.b + this.c + obj.toString() + this.c;
        }
        if (str == null && obj != null) {
            return this.c + obj.toString() + this.c;
        }
        if (str != null) {
            return str;
        }
        return "";
    }

    @Override // defpackage.aiku
    public final Object clone() {
        aikz aikzVar = new aikz();
        aikzVar.b = this.b;
        aikzVar.a = this.a;
        aikzVar.c = this.c;
        aikzVar.d = this.d;
        Object obj = this.e;
        if (obj != null && (obj instanceof aiku)) {
            obj = ((aiku) obj).clone();
        }
        aikzVar.e = obj;
        return aikzVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj.getClass().equals(getClass())) {
                aikz aikzVar = (aikz) obj;
                if (this == aikzVar) {
                    return true;
                }
                String str = this.d;
                if ((str == null && aikzVar.d != null) || (str != null && aikzVar.d == null)) {
                    return false;
                }
                if (str != null && aikzVar.d != null && str.toLowerCase(Locale.US).compareTo(aikzVar.d.toLowerCase(Locale.US)) != 0) {
                    return false;
                }
                Object obj2 = this.e;
                if ((obj2 != null && aikzVar.e == null) || (obj2 == null && aikzVar.e != null)) {
                    return false;
                }
                Object obj3 = aikzVar.e;
                if (obj2 == obj3) {
                    return true;
                }
                if (obj2 instanceof String) {
                    if (this.a) {
                        return obj2.equals(obj3);
                    }
                    String str2 = (String) obj3;
                    String lowerCase = ((String) obj2).toLowerCase(Locale.US);
                    str2.getClass();
                    return lowerCase.equals(str2.toLowerCase(Locale.US));
                }
                obj2.getClass();
                return obj2.equals(obj3);
            }
        }
        return false;
    }

    public final int hashCode() {
        return 9876587;
    }

    public final String toString() {
        return c();
    }

    public aikz(String str, Object obj) {
        this.d = str;
        this.e = obj;
        this.b = "=";
        this.c = "";
    }
}
