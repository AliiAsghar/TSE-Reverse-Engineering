package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agxv {
    public static final agxv a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final alog f;
    public final boolean g;
    public final boolean h;

    static {
        agxu a2 = a();
        a2.d("");
        a = a2.a();
    }

    public agxv() {
        throw null;
    }

    public static agxu a() {
        agxu agxuVar = new agxu();
        agxuVar.g(-1);
        agxuVar.b(-1);
        agxuVar.c(-1);
        agxuVar.e(false);
        int i = alog.d;
        agxuVar.h(alsx.a);
        agxuVar.a = (byte) (agxuVar.a | 32);
        agxuVar.f(false);
        return agxuVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agxv) {
            agxv agxvVar = (agxv) obj;
            if (this.b.equals(agxvVar.b) && this.c == agxvVar.c && this.d == agxvVar.d && this.e == agxvVar.e && alzz.at(this.f, agxvVar.f) && this.g == agxvVar.g && this.h == agxvVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
        int i2 = 1231;
        if (true != this.g) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i3 = ((hashCode * 1000003) ^ i) * 1000003;
        if (true != this.h) {
            i2 = 1237;
        }
        return ((i3 ^ i2) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "EmojiViewItem{emoji=" + this.b + ", positionInCategory=" + this.c + ", categoryIndex=" + this.d + ", categorySize=" + this.e + ", variants=" + String.valueOf(this.f) + ", inVariantsPopup=" + this.g + ", isSelected=" + this.h + ", isActivated=false}";
    }

    public agxv(String str, int i, int i2, int i3, alog alogVar, boolean z, boolean z2) {
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = alogVar;
        this.g = z;
        this.h = z2;
    }
}
