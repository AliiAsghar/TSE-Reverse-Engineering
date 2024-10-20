package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uos {
    public final long a;
    public final Object b;
    public final int e;
    public final long d = Thread.currentThread().getId();
    public final StackTraceElement[] c = Thread.currentThread().getStackTrace();

    public uos(long j, int i, Object obj) {
        this.a = j;
        this.e = i;
        this.b = obj;
    }

    public final boolean a(Pattern pattern, Pattern pattern2) {
        String obj;
        boolean z;
        boolean z2;
        Object obj2 = this.b;
        if (obj2 instanceof upr) {
            obj = ((upr) obj2).p();
        } else {
            obj = obj2.toString();
        }
        if (pattern != null && !pattern.matcher(obj).matches()) {
            z = false;
        } else {
            z = true;
        }
        if (pattern2 != null && !pattern2.matcher(uot.b(this.e)).matches()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }
}
