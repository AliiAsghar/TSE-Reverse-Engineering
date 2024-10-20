package defpackage;

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dux extends duv {
    private static final ArrayList e;

    static {
        ArrayList arrayList = new ArrayList();
        e = arrayList;
        arrayList.add("ConstraintSets");
        arrayList.add("Variables");
        arrayList.add("Generate");
        arrayList.add("Transitions");
        arrayList.add("KeyFrames");
        arrayList.add("KeyAttributes");
        arrayList.add("KeyPositions");
        arrayList.add("KeyCycles");
    }

    public dux(char[] cArr) {
        super(cArr);
    }

    public final duw A() {
        if (this.a.size() > 0) {
            return (duw) this.a.get(0);
        }
        return null;
    }

    public final void B(duw duwVar) {
        if (this.a.size() > 0) {
            this.a.set(0, duwVar);
        } else {
            this.a.add(duwVar);
        }
    }

    @Override // defpackage.duv, defpackage.duw
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof dux) && !Objects.equals(v(), ((dux) obj).v())) {
            return false;
        }
        return super.equals(obj);
    }
}
