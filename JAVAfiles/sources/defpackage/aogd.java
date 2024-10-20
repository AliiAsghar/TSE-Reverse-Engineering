package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aogd implements aogh {
    private final int a;
    private final aogg b;

    public aogd(int i, aogg aoggVar) {
        this.a = i;
        this.b = aoggVar;
    }

    @Override // defpackage.aogh
    public final int a() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return aogh.class;
    }

    @Override // defpackage.aogh
    public final aogg b() {
        return this.b;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aogh)) {
            return false;
        }
        aogh aoghVar = (aogh) obj;
        if (this.a == aoghVar.a() && this.b.equals(aoghVar.b())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (this.b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + this.b + ')';
    }
}
