package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apvj extends Exception {
    public final apvi a;

    public apvj(apvi apviVar, String str) {
        this(apviVar, str, null);
    }

    public final boolean a() {
        return this.a.g;
    }

    public apvj(apvi apviVar, String str, Throwable th) {
        super(str, th);
        this.a = apviVar;
    }

    public apvj(apvi apviVar, Throwable th) {
        this(apviVar, null, th);
    }
}
