package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxj<T> extends bzc<T> {
    private final caj a;

    public bxj(caj cajVar, arqg arqgVar) {
        super(arqgVar);
        this.a = cajVar;
    }

    @Override // defpackage.bzc
    public final bzd c(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = false;
        }
        return new bzd(this, obj, z, this.a, true);
    }
}
