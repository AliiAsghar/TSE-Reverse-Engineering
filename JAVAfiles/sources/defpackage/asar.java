package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class asar {
    public static final arqr a = arue.c;
    public static final arqv b = afup.s;

    public static final asai a(asai asaiVar) {
        if (asaiVar instanceof ascv) {
            return asaiVar;
        }
        return b(asaiVar, a, b);
    }

    public static final asai b(asai asaiVar, arqr arqrVar, arqv arqvVar) {
        if (asaiVar instanceof asag) {
            asag asagVar = (asag) asaiVar;
            if (asagVar.a == arqrVar && asagVar.b == arqvVar) {
                return asaiVar;
            }
        }
        return new asag(asaiVar, arqrVar, arqvVar);
    }
}
