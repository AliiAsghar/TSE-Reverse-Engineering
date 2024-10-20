package defpackage;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aosg {
    public static final aosg a;
    private static final Set d;
    public final aosu b;
    public final Map c = aorx.a;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, aosu] */
    static {
        Logger.getLogger(aosg.class.getName());
        a = new aosg(atii.j().b);
        HashSet hashSet = new HashSet();
        d = hashSet;
        hashSet.add(aorv.BR);
        hashSet.add(aorv.CL);
        hashSet.add(aorv.NI);
    }

    public aosg(aosu aosuVar) {
        this.b = aosuVar;
    }
}
