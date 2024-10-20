package defpackage;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgu {
    public final jhc a;
    public final jgi b;
    public final Map c;
    public final Map d;

    public jgu(jhc jhcVar, jgi jgiVar, Map map, Map map2) {
        jhcVar.getClass();
        this.a = jhcVar;
        this.b = jgiVar;
        this.c = map;
        this.d = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgu)) {
            return false;
        }
        jgu jguVar = (jgu) obj;
        if (d.F(this.a, jguVar.a) && d.F(this.b, jguVar.b) && d.F(this.c, jguVar.c) && d.F(this.d, jguVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        jgi jgiVar = this.b;
        if (jgiVar == null) {
            hashCode = 0;
        } else {
            hashCode = jgiVar.hashCode();
        }
        return ((((hashCode2 + hashCode) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        Set<Map.Entry> entrySet = this.c.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(arrn.r(aqjn.i(aqjn.J(entrySet, 10)), 16));
        for (Map.Entry entry : entrySet) {
            armo armoVar = new armo(((afsn) entry.getKey()).fj(), yyb.bf((Uri) entry.getValue()));
            linkedHashMap.put(armoVar.a, armoVar.b);
        }
        Set<Map.Entry> entrySet2 = this.d.entrySet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(arrn.r(aqjn.i(aqjn.J(entrySet2, 10)), 16));
        for (Map.Entry entry2 : entrySet2) {
            armo armoVar2 = new armo(((afcq) entry2.getKey()).fj(), yyb.be((CharSequence) entry2.getValue()));
            linkedHashMap2.put(armoVar2.a, armoVar2.b);
        }
        return "AnnotatedDraft(draft=" + this.a + ", emojiAnnotations=" + this.b + ", selectedVariations=" + linkedHashMap + ", captions=" + linkedHashMap2 + ")";
    }
}
