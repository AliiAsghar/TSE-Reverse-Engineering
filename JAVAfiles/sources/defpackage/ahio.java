package defpackage;

import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahio {
    public static final ahio a;
    public static final ahio b;
    private final boolean c;
    private final alpt d;

    static {
        aibf a2 = a();
        a2.e(EnumSet.noneOf(ahin.class));
        a2.d(false);
        a = a2.c();
        aibf a3 = a();
        a3.e(EnumSet.of(ahin.ANY));
        a3.d(true);
        a3.c();
        aibf a4 = a();
        a4.e(EnumSet.of(ahin.ANY));
        a4.d(false);
        b = a4.c();
    }

    public ahio() {
        throw null;
    }

    public static aibf a() {
        aibf aibfVar = new aibf();
        aibfVar.d(false);
        return aibfVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahio) {
            ahio ahioVar = (ahio) obj;
            if (this.c == ahioVar.c && this.d.equals(ahioVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (true != this.c) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((i ^ 1000003) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "DownloadConstraints{requireUnmeteredNetwork=" + this.c + ", requiredNetworkTypes=" + String.valueOf(this.d) + "}";
    }

    public ahio(boolean z, alpt alptVar) {
        this.c = z;
        this.d = alptVar;
    }
}
