package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adyy extends adyu {
    public adyw b;
    public List c;
    public String d;
    public Map e;
    public adyv f = adyv.NONE;

    public adyy() {
    }

    @Override // defpackage.adyu
    public final boolean equals(Object obj) {
        if (!(obj instanceof adyy)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        adyy adyyVar = (adyy) obj;
        List list = this.c;
        if (list == null) {
            if (adyyVar.c != null) {
                return false;
            }
        } else if (!list.equals(adyyVar.c)) {
            return false;
        }
        adyw adywVar = this.b;
        if (adywVar == null) {
            if (adyyVar.b != null) {
                return false;
            }
        } else if (!adywVar.equals(adyyVar.b)) {
            return false;
        }
        if (this.f != adyyVar.f) {
            return false;
        }
        Map map = this.e;
        if (map == null) {
            if (adyyVar.e != null) {
                return false;
            }
        } else if (!map.equals(adyyVar.e)) {
            return false;
        }
        String str = this.d;
        if (str == null && adyyVar.d != null) {
            return false;
        }
        return str.equals(adyyVar.d);
    }

    @Override // defpackage.adyu
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = super.hashCode() * 31;
        List list = this.c;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (hashCode5 + hashCode) * 31;
        adyw adywVar = this.b;
        if (adywVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = adywVar.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        adyv adyvVar = this.f;
        if (adyvVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = adyvVar.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Map map = this.e;
        if (map == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = map.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return i5 + i;
    }

    public adyy(String str) {
        this.d = str;
    }
}
