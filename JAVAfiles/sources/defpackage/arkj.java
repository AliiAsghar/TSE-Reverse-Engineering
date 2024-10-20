package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arkj {
    public static final asqx a = aotl.R(":status");
    public static final asqx b = aotl.R(":method");
    public static final asqx c = aotl.R(":path");
    public static final asqx d = aotl.R(":scheme");
    public static final asqx e = aotl.R(":authority");
    public final asqx f;
    public final asqx g;
    final int h;

    static {
        aotl.R(":host");
        aotl.R(":version");
    }

    public arkj(String str, String str2) {
        this(aotl.R(str), aotl.R(str2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof arkj) {
            arkj arkjVar = (arkj) obj;
            if (this.f.equals(arkjVar.f) && this.g.equals(arkjVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f.hashCode() + 527) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return String.format("%s: %s", this.f.e(), this.g.e());
    }

    public arkj(asqx asqxVar, String str) {
        this(asqxVar, aotl.R(str));
    }

    public arkj(asqx asqxVar, asqx asqxVar2) {
        this.f = asqxVar;
        this.g = asqxVar2;
        this.h = asqxVar.b() + 32 + asqxVar2.b();
    }
}
