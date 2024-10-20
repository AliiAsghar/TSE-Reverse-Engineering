package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class astq implements asuu {
    private asuw e;
    private asva f;
    private BigInteger g;
    private BigInteger h;

    public astq(asuw asuwVar, asva asvaVar, BigInteger bigInteger, BigInteger bigInteger2) {
        Hashtable hashtable;
        asvc asvcVar;
        if (asuwVar != null) {
            if (bigInteger != null) {
                this.e = asuwVar;
                if (asvaVar != null) {
                    if (asuwVar.f(asvaVar.b)) {
                        asva i = asuwVar.e(asvaVar).i();
                        if (!i.m()) {
                            if (!i.m()) {
                                synchronized (i) {
                                    hashtable = i.f;
                                    if (hashtable == null) {
                                        hashtable = new Hashtable(4);
                                        i.f = hashtable;
                                    }
                                }
                                synchronized (hashtable) {
                                    asvc asvcVar2 = (asvc) hashtable.get("bc_validity");
                                    if (true != (asvcVar2 instanceof asvc)) {
                                        asvcVar = null;
                                    } else {
                                        asvcVar = asvcVar2;
                                    }
                                    asvcVar = asvcVar == null ? new asvc() : asvcVar;
                                    if (!asvcVar.a) {
                                        if (!asvcVar.b) {
                                            if (!i.a()) {
                                                asvcVar.a();
                                            } else {
                                                asvcVar.b = true;
                                            }
                                        }
                                        if (!asvcVar.c) {
                                            if (!i.b()) {
                                                asvcVar.a();
                                            } else {
                                                asvcVar.c = true;
                                            }
                                        }
                                    }
                                    if (asvcVar != asvcVar2) {
                                        hashtable.put("bc_validity", asvcVar);
                                    }
                                }
                                if (asvcVar.a) {
                                    throw new IllegalArgumentException("Point not on curve");
                                }
                            }
                            this.f = i;
                            this.g = bigInteger;
                            this.h = bigInteger2;
                            return;
                        }
                        throw new IllegalArgumentException("Point at infinity");
                    }
                    throw new IllegalArgumentException("Point must be on the same curve");
                }
                throw new IllegalArgumentException("Point has null value");
            }
            throw new NullPointerException("n");
        }
        throw new NullPointerException("curve");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof astq) {
            astq astqVar = (astq) obj;
            if (this.e.f(astqVar.e) && this.f.l(astqVar.f) && this.g.equals(astqVar.g) && this.h.equals(astqVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.e.hashCode() * 37) ^ this.f.hashCode()) * 37) ^ this.g.hashCode()) * 37) ^ this.h.hashCode();
    }
}
