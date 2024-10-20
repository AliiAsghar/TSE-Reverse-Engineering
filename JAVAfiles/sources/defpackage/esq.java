package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esq extends Exception {
    public final esp a;

    public esq(esp espVar) {
        this("Unhandled input format:", espVar);
    }

    public esq(String str, esp espVar) {
        super(str + " " + String.valueOf(espVar));
        this.a = espVar;
    }
}
