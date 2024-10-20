package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jri {
    public final jgu a;
    public final List b;
    public final mvw c;

    public jri(mvw mvwVar, jgu jguVar, List list) {
        mvwVar.getClass();
        this.c = mvwVar;
        this.a = jguVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jri)) {
            return false;
        }
        jri jriVar = (jri) obj;
        if (d.F(this.c, jriVar.c) && d.F(this.a, jriVar.a) && d.F(this.b, jriVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.c.hashCode() * 31) + this.a.hashCode();
        List list = this.b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return (hashCode2 * 31) + hashCode;
    }

    public final String toString() {
        return "LoggingEnvelope(analyticsId=" + this.c + ", annotateDraft=" + this.a + ", attachmentAnalyticsIds=" + this.b + ")";
    }
}
