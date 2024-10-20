package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acpe extends ArrayList {
    private static final long serialVersionUID = -4357313952926383485L;
    public final acpg a;

    public acpe(acpg acpgVar) {
        this.a = acpgVar;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof acpe)) {
            acpe acpeVar = (acpe) obj;
            if (this.a == acpeVar.a) {
                return super.equals(acpeVar);
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "State: " + String.valueOf(this.a) + " " + Arrays.toString(toArray());
    }
}
