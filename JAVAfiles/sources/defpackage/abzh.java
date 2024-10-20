package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum abzh implements abyy {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);

    public final int i;

    abzh(int i) {
        this.i = i;
    }

    @Override // defpackage.abyy
    public final int a() {
        return this.i;
    }
}
