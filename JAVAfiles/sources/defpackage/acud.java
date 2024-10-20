package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acud {
    public static final acud a = new acud(0, -1, 0, false, 0);
    public final int b;
    public final long c;
    public final boolean d;
    public final int e;
    private final int f;

    public acud(int i, long j, int i2, boolean z, int i3) {
        this.b = i;
        this.c = j;
        this.f = i2;
        this.d = z;
        this.e = i3;
    }

    public final boolean a(acuc acucVar) {
        return acucVar.b(this.f);
    }

    public final String toString() {
        String str;
        String sb;
        int i = this.b;
        if (i != 1) {
            if (i != 2) {
                str = "STATE_UNKNOWN";
            } else {
                str = "STATE_IMS_CONTACT";
            }
        } else {
            str = "STATE_NON_IMS_CONTACT";
        }
        Locale locale = Locale.US;
        Long valueOf = Long.valueOf(this.c);
        int i2 = this.f;
        acuc acucVar = acuc.HTTP_FT;
        if (i2 == 0) {
            sb = "[ ]";
        } else {
            StringBuilder sb2 = new StringBuilder("[ ");
            for (acuc acucVar2 : acuc.values()) {
                if (acucVar2.b(i2)) {
                    sb2.append(acucVar2.toString());
                    sb2.append(' ');
                }
            }
            sb2.append(']');
            sb = sb2.toString();
        }
        return String.format(locale, "Status: %s, last activity: %d, capabilities: %s", str, valueOf, sb);
    }
}
