package defpackage;

import android.net.Uri;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgg {
    public final jgz a;
    public final Uri b;
    public final jgp c;

    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Collection, java.lang.Iterable] */
    public jgg(jgz jgzVar, Uri uri, jgp jgpVar) {
        jgzVar.getClass();
        this.a = jgzVar;
        this.b = uri;
        this.c = jgpVar;
        afcq afcqVar = jgzVar.a;
        if (afcqVar instanceof afsn) {
            if (uri != null) {
                ?? f = ((afsn) afcqVar).f();
                if (!f.isEmpty()) {
                    Iterator it = f.iterator();
                    while (it.hasNext()) {
                        if (d.F(((afsm) it.next()).i(), this.b.toString())) {
                            return;
                        }
                    }
                }
                throw new IllegalArgumentException("Selected URI for attachment with variations does not appear");
            }
            throw new IllegalArgumentException("No selected URI provided for attachment with variations");
        }
        if (uri == null) {
        } else {
            throw new IllegalArgumentException("Provided selected URI for attachment without variations");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgg)) {
            return false;
        }
        jgg jggVar = (jgg) obj;
        if (d.F(this.a, jggVar.a) && d.F(this.b, jggVar.b) && d.F(this.c, jggVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Uri uri = this.b;
        int i = 0;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        jgp jgpVar = this.c;
        if (jgpVar != null) {
            i = jgpVar.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "QueuedAttachment(processed=" + this.a + ", selectedUri=" + this.b + ", compressionInfo=" + this.c + ")";
    }
}
