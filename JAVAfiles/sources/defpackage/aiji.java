package defpackage;

import android.text.TextUtils;
import com.android.vcard.VCardBuilder;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiji extends aijm {
    public final int a;
    public aijs b;
    public aijf c;
    public aije d;
    public final List e = new ArrayList();
    private final aijh f;
    private final int g;
    private final String h;
    private final int i;
    private final String j;

    public aiji(aijh aijhVar, int i, int i2, String str, String str2) {
        if (aijhVar != null) {
            this.f = aijhVar;
            this.a = i;
            this.g = i2;
            this.h = str;
            this.j = str2;
            int i3 = -1;
            if (!Objects.isNull(str2) && !TextUtils.isEmpty(str2) && TextUtils.isDigitsOnly(str2)) {
                i3 = Integer.parseInt(str2);
            }
            this.i = i3;
            return;
        }
        throw new IllegalArgumentException("MediaType must not be null");
    }

    public static aiji c(String str) {
        aijh aijhVar;
        int i;
        String o = ahji.o(str, "m=");
        int indexOf = o.indexOf(32);
        String substring = o.substring(0, indexOf);
        if (!TextUtils.isEmpty(substring)) {
            for (aijh aijhVar2 : aijh.values()) {
                if (aijhVar2.f.equals(substring)) {
                    aijhVar = aijhVar2;
                    break;
                }
            }
        }
        aijhVar = null;
        if (aijhVar != null) {
            int i2 = indexOf + 1;
            int indexOf2 = o.indexOf(32, i2);
            String substring2 = o.substring(i2, indexOf2);
            int indexOf3 = substring2.indexOf(47);
            if (indexOf3 > 0) {
                String substring3 = substring2.substring(indexOf3 + 1);
                substring2 = substring2.substring(0, indexOf3);
                i = ahji.m(substring3);
            } else {
                i = 1;
            }
            int i3 = indexOf2 + 1;
            int m = ahji.m(substring2);
            int indexOf4 = o.indexOf(32, i3);
            return new aiji(aijhVar, m, i, o.substring(i3, indexOf4), o.substring(indexOf4 + 1));
        }
        throw new aijn("Unknown media type: ".concat(String.valueOf(substring)));
    }

    public static String d(String str) {
        try {
            int indexOf = str.indexOf("://") + 3;
            return str.substring(indexOf, str.indexOf(":", indexOf));
        } catch (StringIndexOutOfBoundsException e) {
            throw new Exception("MSRP Path is not a valid MSRP URI", e);
        }
    }

    public final aijg a(String str) {
        for (aijg aijgVar : this.e) {
            if (aijgVar.a.equals(str)) {
                return aijgVar;
            }
        }
        return null;
    }

    @Override // defpackage.aijm
    public final void b(StringBuilder sb) {
        sb.append("m=");
        sb.append(this.f.f);
        sb.append(" ");
        sb.append(this.a);
        sb.append(" ");
        sb.append(this.h);
        sb.append(" ");
        sb.append(this.j);
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
        aijs aijsVar = this.b;
        if (aijsVar != null) {
            aijsVar.b(sb);
        }
        aijf aijfVar = this.c;
        if (aijfVar != null) {
            aijfVar.b(sb);
        }
        aije aijeVar = this.d;
        if (aijeVar != null) {
            aijeVar.b(sb);
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((aijg) it.next()).b(sb);
        }
    }

    public final void e(aijg aijgVar) {
        this.e.add(aijgVar);
    }

    public final boolean equals(Object obj) {
        if (Objects.isNull(obj) || !(obj instanceof aiji)) {
            return false;
        }
        aiji aijiVar = (aiji) obj;
        if (this.f != aijiVar.f || this.i != aijiVar.i || this.a != aijiVar.a || this.g != aijiVar.g || !TextUtils.equals(this.j, aijiVar.j) || !TextUtils.equals(this.h, aijiVar.h)) {
            return false;
        }
        if (this.e.size() != aijiVar.e.size()) {
            return false;
        }
        aije aijeVar = this.d;
        if (aijeVar == null && aijiVar.d != null) {
            return false;
        }
        if (aijeVar != null && !aijeVar.equals(aijiVar.d)) {
            return false;
        }
        aijf aijfVar = this.c;
        if (aijfVar == null && aijiVar.c != null) {
            return false;
        }
        if (aijfVar != null && !aijfVar.equals(aijiVar.c)) {
            return false;
        }
        aijs aijsVar = this.b;
        if (aijsVar == null && aijiVar.b != null) {
            return false;
        }
        if ((aijsVar != null && !aijsVar.equals(aijiVar.b)) || !this.e.equals(aijiVar.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (((((this.i * 37) + this.a) * 37) + this.g) * 37) + this.e.hashCode();
        if (!TextUtils.isEmpty(this.j)) {
            hashCode = (hashCode * 37) + this.j.hashCode();
        }
        if (!TextUtils.isEmpty(this.h)) {
            hashCode = (hashCode * 37) + this.h.hashCode();
        }
        int hashCode2 = (hashCode * 37) + this.f.hashCode();
        aije aijeVar = this.d;
        if (aijeVar != null) {
            hashCode2 = (hashCode2 * 37) + aijeVar.hashCode();
        }
        aijf aijfVar = this.c;
        if (aijfVar != null) {
            hashCode2 = (hashCode2 * 37) + aijfVar.hashCode();
        }
        aijs aijsVar = this.b;
        if (aijsVar != null) {
            return (hashCode2 * 37) + aijsVar.hashCode();
        }
        return hashCode2;
    }
}
