package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class achx implements abqy {
    public static final achx a = new achx();
    private final boolean b = false;
    private final boolean c = false;
    private final String d = null;
    private final boolean e = false;
    private final boolean h = false;
    private final String f = null;
    private final String g = null;
    private final Long i = null;
    private final Long j = null;

    private achx() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof achx)) {
            return false;
        }
        achx achxVar = (achx) obj;
        boolean z = achxVar.b;
        boolean z2 = achxVar.c;
        String str = achxVar.d;
        if (d.B(null, null)) {
            boolean z3 = achxVar.e;
            boolean z4 = achxVar.h;
            String str2 = achxVar.f;
            if (d.B(null, null)) {
                String str3 = achxVar.g;
                if (d.B(null, null)) {
                    Long l = achxVar.i;
                    if (d.B(null, null)) {
                        Long l2 = achxVar.j;
                        if (d.B(null, null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{false, false, null, false, false, null, null, null, null});
    }
}
