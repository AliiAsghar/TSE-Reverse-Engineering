package defpackage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class afmu extends afnb {
    public static final Map a;
    private static final List b;
    private static final Map c;
    private final arml d = armd.a(new afjm(this, 8));

    static {
        arml armlVar = aflr.a;
        EnumSet S = afwv.S();
        ArrayList arrayList = new ArrayList();
        for (Object obj : S) {
            if (((aflr) obj) != aflr.b) {
                arrayList.add(obj);
            }
        }
        b = arrayList;
        c = aqjn.m(new armo(aflq.b, "🧑"), new armo(aflq.c, "👩"), new armo(aflq.d, "👨"));
        aflq aflqVar = aflq.c;
        aflq aflqVar2 = aflq.d;
        aflq aflqVar3 = aflq.b;
        a = aqjn.m(new armo(new armo(aflqVar, aflqVar), "👭"), new armo(new armo(aflqVar2, aflqVar2), "👬"), new armo(new armo(aflqVar, aflqVar2), "👫"), new armo(new armo(aflqVar3, aflqVar3), "🧑\u200d🤝\u200d🧑"));
    }

    public static final void h(aflr aflrVar, aflr aflrVar2, aflq aflqVar, aflq aflqVar2, StringBuilder sb) {
        aflqVar.getClass();
        aflqVar2.getClass();
        Map map = c;
        sb.append((String) map.get(aflqVar));
        afnc afncVar = aflrVar.h;
        if (afncVar != null) {
            sb.append(afncVar.a());
        }
        sb.append(aflw.c.a());
        sb.append("🤝");
        sb.append(aflw.c.a());
        sb.append((String) map.get(aflqVar2));
        afnc afncVar2 = aflrVar2.h;
        if (afncVar2 != null) {
            sb.append(afncVar2.a());
        }
    }

    public abstract aflq b();

    public abstract aflq c();

    public abstract afls d(aflr aflrVar, aflr aflrVar2);

    public abstract Set e();

    @Override // defpackage.afnb
    public final Set f() {
        List<aflr> list = b;
        LinkedHashSet linkedHashSet = new LinkedHashSet(list.size() * list.size());
        for (aflr aflrVar : list) {
            for (aflr aflrVar2 : b) {
                aflrVar.getClass();
                aflrVar2.getClass();
                linkedHashSet.add(d(aflrVar, aflrVar2));
            }
        }
        return linkedHashSet;
    }

    public final boolean g() {
        return ((Boolean) this.d.a()).booleanValue();
    }
}
