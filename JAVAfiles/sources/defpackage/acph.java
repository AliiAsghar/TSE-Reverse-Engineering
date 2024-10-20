package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acph {
    public final String a;
    public final Optional b;

    public acph(String str) {
        this.a = str;
        this.b = Optional.empty();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof acph)) {
            return false;
        }
        acph acphVar = (acph) obj;
        if (!TextUtils.equals(this.a, acphVar.a) || !this.b.equals(acphVar.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return "Participant: " + advq.URI_TEL.c(this.a) + ", timestamp: " + this.b.toString();
    }

    public acph(String str, advi adviVar) {
        this.a = str;
        this.b = Optional.of(adviVar);
    }
}
