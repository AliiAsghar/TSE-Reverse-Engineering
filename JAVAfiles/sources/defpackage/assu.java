package defpackage;

import java.security.Permission;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class assu extends Permission {
    private final Set a;

    public assu(String str) {
        super(str);
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        hashSet.add(str);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof assu) && this.a.equals(((assu) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // java.security.Permission
    public final String getActions() {
        return this.a.toString();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.security.Permission
    public final boolean implies(Permission permission) {
        if (permission instanceof assu) {
            assu assuVar = (assu) permission;
            if (getName().equals(assuVar.getName()) || this.a.containsAll(assuVar.a)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
