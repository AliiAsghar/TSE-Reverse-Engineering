package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aglk {
    private final int a;

    public aglk(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aglk) || this.a != ((aglk) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.a});
    }

    public final String toString() {
        return "java_hash=" + this.a;
    }

    public void a() {
    }
}
