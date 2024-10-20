package defpackage;

import androidx.window.extensions.embedding.ActivityStack;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class goy {
    private final List a;
    private final boolean b;
    private final ActivityStack.Token c;

    public goy(List list, boolean z, ActivityStack.Token token) {
        this.a = list;
        this.b = z;
        this.c = token;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof goy)) {
            return false;
        }
        goy goyVar = (goy) obj;
        if (d.F(this.a, goyVar.a) && this.b == goyVar.b && d.F(this.c, goyVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        ActivityStack.Token token = this.c;
        if (token != null) {
            i = token.hashCode();
        } else {
            i = 0;
        }
        return ((hashCode + a.v(this.b)) * 31) + i;
    }

    public final String toString() {
        return "ActivityStack{activitiesInProcess=" + this.a + ", isEmpty=" + this.b + ", token=" + this.c + '}';
    }
}
