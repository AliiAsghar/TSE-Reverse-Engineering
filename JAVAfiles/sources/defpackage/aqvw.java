package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqvw {
    public final String a;
    public final Collection b;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Collection, java.lang.Object] */
    public aqvw(asmb asmbVar) {
        String str = (String) asmbVar.a;
        this.a = str;
        ?? r1 = asmbVar.b;
        HashSet hashSet = new HashSet(r1.size());
        for (aqux aquxVar : r1) {
            aquxVar.getClass();
            String str2 = aquxVar.c;
            albo.Q(str.equals(str2), "service names %s != %s", str2, str);
            albo.N(hashSet.add(aquxVar.b), "duplicate name %s", aquxVar.b);
        }
        this.b = DesugarCollections.unmodifiableList(new ArrayList((Collection) asmbVar.b));
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("name", this.a);
        aj.b("schemaDescriptor", null);
        aj.b("methods", this.b);
        aj.c();
        return aj.toString();
    }
}
