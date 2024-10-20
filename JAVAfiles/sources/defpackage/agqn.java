package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agqn implements hne {
    public int b;
    public final int c = -1;
    public final int d = -1;
    public final int e = -1;
    private int f;
    private boolean g;
    private Integer h;
    private Integer i;
    private Integer j;

    @Override // defpackage.hne
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(21).putInt(this.f).put((byte) 0).putInt(0).putInt(-1).putInt(-1).putInt(-1).array());
    }

    public final int b(int i) {
        if (i == Integer.MIN_VALUE) {
            return 0;
        }
        return i;
    }

    public final void c(int i) {
        this.b |= i;
        this.f = i | this.f;
    }

    @Override // defpackage.hne
    public final boolean equals(Object obj) {
        if (obj instanceof agqn) {
            agqn agqnVar = (agqn) obj;
            if (this.f == agqnVar.f) {
                boolean z = agqnVar.g;
                Integer num = agqnVar.h;
                if (d.F(null, null)) {
                    int i = agqnVar.c;
                    int i2 = agqnVar.d;
                    int i3 = agqnVar.e;
                    Integer num2 = agqnVar.i;
                    if (d.F(null, null)) {
                        Integer num3 = agqnVar.j;
                        if (d.F(null, null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.hne
    public final int hashCode() {
        return hyv.d(this.f, hyv.d(0, hyv.e(null, hyv.d(-1, hyv.d(-1, hyv.d(-1, hyv.d(0, hyv.d(0, 17))))))));
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        int i = this.b;
        int i2 = i & 16;
        int i3 = i & 4;
        aiqf aiqfVar = aiqg.a;
        int i4 = this.b;
        int i5 = i4 & 1;
        int i6 = i4 & 8;
        StringBuilder sb = new StringBuilder("FifeUrlOptions{ ");
        String str4 = "";
        if (i2 == 0) {
            str = "";
        } else {
            str = "kill_animation ";
        }
        sb.append(str);
        if (i3 == 0) {
            str2 = "";
        } else {
            str2 = "no_overlay ";
        }
        sb.append(str2);
        sb.append("");
        if (1 != i5) {
            str3 = "";
        } else {
            str3 = "crop ";
        }
        sb.append(str3);
        sb.append("");
        if (i6 != 0) {
            str4 = "smartcrop ";
        }
        sb.append(str4);
        sb.append(" }");
        return sb.toString();
    }
}
