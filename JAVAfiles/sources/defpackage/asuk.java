package defpackage;

import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asuk extends BasicPermission {
    private final String a;
    private final int b;

    public asuk(String str) {
        super("BC", str);
        this.a = str;
        StringTokenizer stringTokenizer = new StringTokenizer(atdg.b(str), " ,");
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals("threadlocalecimplicitlyca")) {
                i |= 1;
            } else if (nextToken.equals("ecimplicitlyca")) {
                i |= 2;
            } else if (nextToken.equals("threadlocaldhdefaultparams")) {
                i |= 4;
            } else if (nextToken.equals("dhdefaultparams")) {
                i |= 8;
            } else if (nextToken.equals("acceptableeccurves")) {
                i |= 16;
            } else if (nextToken.equals("additionalecparameters")) {
                i |= 32;
            } else if (nextToken.equals("all")) {
                i = 63;
            }
        }
        if (i != 0) {
            this.b = i;
            return;
        }
        throw new IllegalArgumentException("unknown permissions passed to mask");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof asuk) {
            asuk asukVar = (asuk) obj;
            if (this.b == asukVar.b && getName().equals(asukVar.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public final String getActions() {
        return this.a;
    }

    public final int hashCode() {
        return getName().hashCode() + this.b;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public final boolean implies(Permission permission) {
        if (!(permission instanceof asuk) || !getName().equals(permission.getName())) {
            return false;
        }
        int i = this.b;
        int i2 = ((asuk) permission).b;
        if ((i & i2) != i2) {
            return false;
        }
        return true;
    }
}
