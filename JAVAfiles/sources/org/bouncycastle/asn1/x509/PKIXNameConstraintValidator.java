package org.bouncycastle.asn1.x509;

import defpackage.atdg;
import defpackage.atdm;
import defpackage.atow;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.asn1.ASN1Sequence;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class PKIXNameConstraintValidator implements NameConstraintValidator {
    private final Set a = new HashSet();
    private final Set b = new HashSet();
    private final Set c = new HashSet();
    private final Set d = new HashSet();
    private final Set e = new HashSet();
    private final Set f = new HashSet();
    private Set g;
    private Set h;
    private Set i;
    private Set j;
    private Set k;
    private Set l;

    private static final void a(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(atdg.a);
    }

    private static final boolean b(Collection collection, Collection collection2) {
        boolean equals;
        if (collection == collection2) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        for (Object obj : collection) {
            for (Object obj2 : collection2) {
                if (obj == obj2) {
                    break;
                }
                if (obj != null && obj2 != null) {
                    if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                        equals = Arrays.equals((byte[]) obj, (byte[]) obj2);
                    } else {
                        equals = obj.equals(obj2);
                    }
                    if (equals) {
                        break;
                    }
                }
            }
            return false;
        }
        return true;
    }

    private static final int c(Collection collection) {
        int hashCode;
        int i = 0;
        if (collection == null) {
            return 0;
        }
        for (Object obj : collection) {
            if (obj instanceof byte[]) {
                hashCode = atow.M((byte[]) obj);
            } else {
                hashCode = obj.hashCode();
            }
            i += hashCode;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PKIXNameConstraintValidator)) {
            return false;
        }
        PKIXNameConstraintValidator pKIXNameConstraintValidator = (PKIXNameConstraintValidator) obj;
        if (b(pKIXNameConstraintValidator.a, this.a) && b(pKIXNameConstraintValidator.b, this.b) && b(pKIXNameConstraintValidator.c, this.c) && b(pKIXNameConstraintValidator.e, this.e) && b(pKIXNameConstraintValidator.d, this.d) && b(pKIXNameConstraintValidator.f, this.f)) {
            Set set = pKIXNameConstraintValidator.g;
            if (b(null, null)) {
                Set set2 = pKIXNameConstraintValidator.h;
                if (b(null, null)) {
                    Set set3 = pKIXNameConstraintValidator.i;
                    if (b(null, null)) {
                        Set set4 = pKIXNameConstraintValidator.k;
                        if (b(null, null)) {
                            Set set5 = pKIXNameConstraintValidator.j;
                            if (b(null, null)) {
                                Set set6 = pKIXNameConstraintValidator.l;
                                if (b(null, null)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return c(this.a) + c(this.b) + c(this.c) + c(this.e) + c(this.d) + c(this.f) + c(null) + c(null) + c(null) + c(null) + c(null) + c(null);
    }

    public final String toString() {
        OtherName otherName;
        int length;
        StringBuilder sb = new StringBuilder();
        a(sb, "permitted:");
        a(sb, "excluded:");
        if (!this.a.isEmpty()) {
            a(sb, "DN:");
            a(sb, this.a.toString());
        }
        if (!this.b.isEmpty()) {
            a(sb, "DNS:");
            a(sb, this.b.toString());
        }
        if (!this.c.isEmpty()) {
            a(sb, "Email:");
            a(sb, this.c.toString());
        }
        if (!this.d.isEmpty()) {
            a(sb, "URI:");
            a(sb, this.d.toString());
        }
        if (!this.e.isEmpty()) {
            a(sb, "IP:");
            Set<byte[]> set = this.e;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            for (byte[] bArr : set) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                StringBuilder sb3 = new StringBuilder();
                int i = 0;
                while (true) {
                    length = bArr.length >> 1;
                    if (i >= length) {
                        break;
                    }
                    if (sb3.length() > 0) {
                        sb3.append(".");
                    }
                    sb3.append(Integer.toString(bArr[i] & 255));
                    i++;
                }
                sb3.append("/");
                boolean z = true;
                while (length < bArr.length) {
                    if (!z) {
                        sb3.append(".");
                    }
                    sb3.append(Integer.toString(bArr[length] & 255));
                    length++;
                    z = false;
                }
                sb2.append(sb3.toString());
            }
            sb2.append("]");
            a(sb, sb2.toString());
        }
        if (!this.f.isEmpty()) {
            a(sb, "OtherName:");
            Set set2 = this.f;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("[");
            for (Object obj : set2) {
                if (sb4.length() > 1) {
                    sb4.append(",");
                }
                if (obj instanceof OtherName) {
                    otherName = (OtherName) obj;
                } else if (obj != null) {
                    otherName = new OtherName(ASN1Sequence.j(obj));
                } else {
                    otherName = null;
                }
                sb4.append(otherName.a.b);
                sb4.append(":");
                try {
                    sb4.append(atdm.a(otherName.b.p().s()));
                } catch (IOException e) {
                    sb4.append(e.toString());
                }
            }
            sb4.append("]");
            a(sb, sb4.toString());
        }
        return sb.toString();
    }
}
