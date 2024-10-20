package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeiq implements aeip {
    public final String a;
    private final List b;
    private final String c;
    private final aeio d;

    public /* synthetic */ aeiq(String str, List list, int i) {
        list = (i & 2) != 0 ? arnv.a : list;
        aeio aeioVar = new aeio((byte[]) null);
        list.getClass();
        this.a = str;
        this.b = list;
        this.c = null;
        this.d = aeioVar;
    }

    @Override // defpackage.aeip
    public final String a() {
        return null;
    }

    @Override // defpackage.aeip
    public final aeio e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeiq)) {
            return false;
        }
        aeiq aeiqVar = (aeiq) obj;
        if (!d.F(this.a, aeiqVar.a) || !d.F(this.b, aeiqVar.b)) {
            return false;
        }
        String str = aeiqVar.c;
        if (d.F(null, null) && d.F(this.d, aeiqVar.d)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.aeip
    public final String f() {
        return this.a;
    }

    @Override // defpackage.aeip
    public final List g() {
        return this.b;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + this.d.hashCode();
    }

    public final String toString() {
        return "AnnotationUiDataImpl(text=" + this.a + ", annotations=" + this.b + ", contentDescription=null, annotationFlags=" + this.d + ")";
    }
}
