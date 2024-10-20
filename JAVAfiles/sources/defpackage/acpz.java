package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acpz extends abis {
    private final abis d;
    private final Object e;

    public acpz(abis abisVar, String str, Object obj) {
        super(str, obj);
        this.d = abisVar;
        this.e = obj;
    }

    public static abis c(String str, Integer num) {
        return new acpz(new abiq(str, num), str, num);
    }

    public static abis d(String str, String str2) {
        return new acpz(new abir(str, str2), str, str2);
    }

    public static abis e(String str, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        return new acpz(new abip(str, valueOf), str, valueOf);
    }

    @Override // defpackage.abis
    public final Object a() {
        try {
            return this.d.a();
        } catch (Throwable unused) {
            return this.e;
        }
    }
}
