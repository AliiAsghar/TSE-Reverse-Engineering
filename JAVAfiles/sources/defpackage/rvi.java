package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rvi extends rvf {
    public static final rvi a = new rvi(null);

    private rvi(String str) {
        super(str);
    }

    public static rvi a(String str) {
        if (str == null) {
            return a;
        }
        return new rvi(str);
    }

    public final String toString() {
        return "FeatureNameType: ".concat(String.valueOf(this.b));
    }
}
