package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahlg extends ahlf {
    private final String a;

    public ahlg(String str) {
        this.a = str;
    }

    @Override // defpackage.ahlf
    public final String a() {
        return this.a;
    }

    public ahlg(ahka ahkaVar) {
        this.a = String.valueOf(ahkaVar);
    }

    public ahlg(Class cls) {
        this.a = cls.getName();
    }

    public ahlg(Enum r1) {
        this.a = r1.name();
    }
}
