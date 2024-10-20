package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drh {
    public static final drg a(long j, long j2) {
        return new drg(dre.a(j), dre.b(j), dre.a(j) + ((int) (j2 >> 32)), dre.b(j) + ((int) (4294967295L & j2)));
    }

    public static final drg b(cjp cjpVar) {
        return new drg(Math.round(cjpVar.b), Math.round(cjpVar.c), Math.round(cjpVar.d), Math.round(cjpVar.e));
    }
}
