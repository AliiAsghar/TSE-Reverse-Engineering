package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum agyi implements apak {
    DEFAULT(0),
    PHENOTYPE(1),
    MANAGED_CONFIG(2),
    OEM(3),
    OVERRIDE(4),
    HERMETRIC_OVERRIDE(5);

    public final int g;

    agyi(int i) {
        this.g = i;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
