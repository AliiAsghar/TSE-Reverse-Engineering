package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aooi extends aood {
    public final Object a;

    public aooi(Object obj) {
        this.a = obj;
    }

    private static boolean j(aooi aooiVar) {
        Object obj = aooiVar.a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if (!(number instanceof BigInteger) && !(number instanceof Long) && !(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.aood
    public final String a() {
        Object obj = this.a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (i()) {
            return e().toString();
        }
        if (h()) {
            return ((Boolean) this.a).toString();
        }
        throw new AssertionError("Unexpected value type: ".concat(String.valueOf(String.valueOf(this.a.getClass()))));
    }

    public final double d() {
        if (i()) {
            return e().doubleValue();
        }
        return Double.parseDouble(a());
    }

    public final Number e() {
        Object obj = this.a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new aopb((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aooi aooiVar = (aooi) obj;
            if (j(this) && j(aooiVar)) {
                if (!(this.a instanceof BigInteger) && !(aooiVar.a instanceof BigInteger)) {
                    if (e().longValue() == aooiVar.e().longValue()) {
                        return true;
                    }
                    return false;
                }
                return g().equals(aooiVar.g());
            }
            Object obj2 = this.a;
            if (obj2 instanceof Number) {
                Object obj3 = aooiVar.a;
                if (obj3 instanceof Number) {
                    if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                        if (f().compareTo(aooiVar.f()) == 0) {
                            return true;
                        }
                        return false;
                    }
                    double d = d();
                    double d2 = aooiVar.d();
                    if (d == d2) {
                        return true;
                    }
                    if (Double.isNaN(d) && Double.isNaN(d2)) {
                        return true;
                    }
                }
            }
            return obj2.equals(aooiVar.a);
        }
        return false;
    }

    public final BigDecimal f() {
        Object obj = this.a;
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        return aotl.w(a());
    }

    public final BigInteger g() {
        Object obj = this.a;
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        if (j(this)) {
            return BigInteger.valueOf(e().longValue());
        }
        return aotl.x(a());
    }

    public final boolean h() {
        return this.a instanceof Boolean;
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (j(this)) {
            doubleToLongBits = e().longValue();
        } else {
            Object obj = this.a;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(e().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public final boolean i() {
        return this.a instanceof Number;
    }

    public aooi(String str) {
        str.getClass();
        this.a = str;
    }
}
